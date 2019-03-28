package org.eclipse.emf.ecoretools.ale.compiler.visitor;

import com.google.common.collect.Iterables;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import java.io.File;
import java.util.List;
import java.util.Map;
import javax.lang.model.element.Modifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecoretools.ale.compiler.EcoreUtils;
import org.eclipse.emf.ecoretools.ale.compiler.visitor.JavaPoetUtils;
import org.eclipse.emf.ecoretools.ale.compiler.visitor.VisitorCompilerUtils;
import org.eclipse.emf.ecoretools.ale.compiler.visitor.VisitorNamingUtils;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class VisitorInterfaceCompiler {
  @Extension
  private EcoreUtils ecoreUtils = new EcoreUtils();
  
  @Extension
  private VisitorNamingUtils namingUtils = new VisitorNamingUtils();
  
  @Extension
  private VisitorCompilerUtils _visitorCompilerUtils = new VisitorCompilerUtils();
  
  @Extension
  private JavaPoetUtils _javaPoetUtils = new JavaPoetUtils();
  
  private final File directory;
  
  private final Map<String, Pair<EPackage, GenModel>> syntaxes;
  
  private final String packageRoot;
  
  public VisitorInterfaceCompiler(final File rootDirectory, final Map<String, Pair<EPackage, GenModel>> syntaxes, final String packageRoot) {
    this.directory = rootDirectory;
    this.syntaxes = syntaxes;
    this.packageRoot = packageRoot;
  }
  
  public void compile() {
    try {
      final Function1<Pair<EPackage, GenModel>, EPackage> _function = (Pair<EPackage, GenModel> it) -> {
        return it.getKey();
      };
      final Function1<EPackage, List<EClass>> _function_1 = (EPackage it) -> {
        return this.ecoreUtils.getAllClasses(it);
      };
      final Function1<EClass, Boolean> _function_2 = (EClass it) -> {
        boolean _isAbstract = it.isAbstract();
        return Boolean.valueOf((!_isAbstract));
      };
      final Function1<EClass, MethodSpec> _function_3 = (EClass eClass) -> {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("visit");
        String _name = eClass.getEPackage().getName();
        _builder.append(_name);
        _builder.append("__");
        String _name_1 = eClass.getName();
        _builder.append(_name_1);
        return MethodSpec.methodBuilder(_builder.toString()).addParameter(
          ClassName.get(this.namingUtils.classInterfacePackageName(eClass, this.packageRoot), this.namingUtils.classInterfaceClassName(eClass)), "it").addModifiers(Modifier.ABSTRACT, Modifier.PUBLIC).returns(Object.class).build();
      };
      final TypeSpec factory = TypeSpec.interfaceBuilder(this.namingUtils.visitorInterfaceClassName()).addMethods(IterableExtensions.<EClass, MethodSpec>map(IterableExtensions.<EClass>filter(Iterables.<EClass>concat(IterableExtensions.<EPackage, List<EClass>>map(IterableExtensions.<Pair<EPackage, GenModel>, EPackage>map(this.syntaxes.values(), _function), _function_1)), _function_2), _function_3)).addModifiers(Modifier.PUBLIC).build();
      final JavaFile javaFile = JavaFile.builder(this.namingUtils.visitorInterfacePackageName(this.packageRoot), factory).indent("\t").build();
      javaFile.writeTo(this.directory);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
