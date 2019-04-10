package org.eclipse.emf.ecoretools.ale.compiler.visitor

import java.io.File
import java.nio.file.Files
import java.util.Comparator
import java.util.List
import java.util.Map
import org.eclipse.acceleo.query.ast.AstPackage
import org.eclipse.acceleo.query.runtime.IQueryEnvironment
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl
import org.eclipse.emf.ecoretools.ale.compiler.common.AbstractALECompiler
import org.eclipse.emf.ecoretools.ale.compiler.common.EcoreUtils
import org.eclipse.emf.ecoretools.ale.compiler.common.ResolvedClass
import org.eclipse.emf.ecoretools.ale.compiler.genmodel.EcoreGenmodelCompiler
import org.eclipse.emf.ecoretools.ale.compiler.genmodel.FactoryImplementationCompiler
import org.eclipse.emf.ecoretools.ale.compiler.genmodel.FactoryInterfaceCompiler
import org.eclipse.emf.ecoretools.ale.compiler.genmodel.PackageImplementationCompiler
import org.eclipse.emf.ecoretools.ale.compiler.genmodel.PackageInterfaceCompiler
import org.eclipse.emf.ecoretools.ale.compiler.utils.EnumeratorService
import org.eclipse.emf.ecoretools.ale.core.interpreter.ExtensionEnvironment
import org.eclipse.emf.ecoretools.ale.core.parser.Dsl
import org.eclipse.emf.ecoretools.ale.core.parser.DslBuilder
import org.eclipse.emf.ecoretools.ale.core.parser.visitor.ParseResult
import org.eclipse.emf.ecoretools.ale.implementation.ImplementationPackage
import org.eclipse.emf.ecoretools.ale.implementation.ModelUnit
import org.eclipse.emf.ecoretools.ale.compiler.common.CommonCompilerUtils

class ALEVisitorImplementationCompiler extends AbstractALECompiler {

	extension EcoreUtils = new EcoreUtils

	var List<ParseResult<ModelUnit>> parsedSemantics
	val IQueryEnvironment queryEnvironment
	var Map<String, Pair<EPackage, GenModel>> syntaxes
	var Dsl dsl
	var List<ResolvedClass> resolved

	new() {
		this(newHashMap)
	}

	new(Map<String, Class<?>> services) {
		super(services)
		this.queryEnvironment = createQueryEnvironment(false, null)
		queryEnvironment.registerEPackage(ImplementationPackage.eINSTANCE)
		queryEnvironment.registerEPackage(AstPackage.eINSTANCE)
	}

	def private IQueryEnvironment createQueryEnvironment(boolean b, Object object) {
		val IQueryEnvironment newEnv = new ExtensionEnvironment()
		newEnv.registerEPackage(EcorePackage.eINSTANCE)
		newEnv.registerCustomClassMapping(EcorePackage.eINSTANCE.getEStringToStringMapEntry(),
			EStringToStringMapEntryImpl)
		newEnv
	}

	def IStatus compile(String projectName, File projectRoot, Dsl dsl, Map<String, Class<?>> services) {
		this.dsl = dsl
		parsedSemantics = new DslBuilder(queryEnvironment).parse(dsl)

		if (services !== null && !services.empty) {
			this.registeredServices.putAll(services)
		} else {
			registerServices(projectName, parsedSemantics)
		}

		// must be last !
		compile(projectRoot, projectName)

		Status.OK_STATUS
	}

	def private void compile(File projectRoot, String projectName) {
		val compilationDirectory = "visitor-comp"
		val compileDirectory = new File(projectRoot, compilationDirectory)

		// clean previous compilation
		if (compileDirectory.exists)
			Files.walk(compileDirectory.toPath).sorted(Comparator.reverseOrder()).map[toFile].forEach[delete]

		val aleClasses = newArrayList
		for (ParseResult<ModelUnit> pr : parsedSemantics) {
			var root = pr.root
			aleClasses += root.classExtensions
		}

		// load all syntaxes in a cache
		syntaxes = dsl.allSyntaxes.toMap([it], [(loadEPackage -> replaceAll(".ecore$", ".genmodel").loadGenmodel)])
		val syntax = syntaxes.get(dsl.allSyntaxes.head).key
		resolved = resolve(aleClasses, syntax, syntaxes)

		val String packageRoot = dsl.dslProp.get("rootPackage") as String

		val egc = new EcoreGenmodelCompiler(compilationDirectory, "interpreter")

		val namingUtils = new VisitorNamingUtils
		val fic = new FactoryInterfaceCompiler(namingUtils)
		val ccu = new CommonCompilerUtils(namingUtils, resolved)
		val fimplc = new FactoryImplementationCompiler(namingUtils, ccu)

		val pic = new PackageInterfaceCompiler(namingUtils)
		val pimplc = new PackageImplementationCompiler(namingUtils)

		val acceptInterfaceCompiler = new AcceptInterfaceCompiler(compileDirectory, packageRoot)
		acceptInterfaceCompiler.compile

		val visitorInterfaceCompiler = new VisitorInterfaceCompiler(compileDirectory, syntaxes, packageRoot)
		visitorInterfaceCompiler.compile

		val visitorImplementationCompiler = new VisitorImplementationCompiler(compileDirectory, syntaxes, packageRoot)
		visitorImplementationCompiler.compile

		val eic = new VisitorEClassInterfaceCompiler(namingUtils, ccu)
		val eimplc = new VisitorEClassImplementationCompiler(packageRoot, dsl, resolved, ccu)

		val operationInterfaceCompiler = new OperationInterfaceCompiler(compileDirectory, packageRoot, syntaxes)
		val operationImplementationCompiler = new OperationImplementationCompiler(compileDirectory, packageRoot,
			syntaxes, queryEnvironment, parsedSemantics, resolved, registeredServices, new EnumeratorService)

		egc.compileEcoreGenmodel(syntaxes.values.map[v|v.key].toList, compileDirectory.absolutePath, projectName)

		syntaxes.forEach [ key, pairEPackageGenModel |
			try {
				fic.compileFactoryInterface(pairEPackageGenModel.key, compileDirectory, packageRoot)
				fimplc.compileFactoryImplementation(pairEPackageGenModel.key, compileDirectory, packageRoot)

				pic.compilePackageInterface(pairEPackageGenModel.key, compileDirectory, packageRoot)
				pimplc.compilePackageImplementation(pairEPackageGenModel.key, compileDirectory, packageRoot)

				val eClassifiersLst = pairEPackageGenModel.key.allClassifiers
				for (EClassifier eclazz : eClassifiersLst.filter[!(it instanceof EDataType) || (it instanceof EEnum)]) {
					val rc = resolved.filter [
						it.eCls.name == eclazz.name && it.eCls.EPackage.name == eclazz.EPackage.name
					].head
					eic.compileEClassInterface(eclazz, compileDirectory, packageRoot)
					eimplc.compileEClassImplementation(eclazz, compileDirectory)
					if(eclazz instanceof EClass) {
						operationInterfaceCompiler.compile(eclazz, rc?.aleCls)
						operationImplementationCompiler.compile(eclazz, rc?.aleCls)
					}
				}
			} catch (Exception e) {
				e.printStackTrace
			}
		]
	}
}
