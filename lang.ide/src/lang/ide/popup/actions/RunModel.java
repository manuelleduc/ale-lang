package lang.ide.popup.actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreterWithDiagnostic.IEvaluationResult;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import lang.LangInterpreter;

public class RunModel extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		System.out.println("Run model!");
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		
		/*
		 * Dsl file
		 */
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getActiveMenuSelection(event);
		IResource resource = (IResource) selection.getFirstElement();
		String dslProject = resource.getProject().getName();
		
		/*
		 * Selected model
		 */
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(shell, ResourcesPlugin.getWorkspace().getRoot(), IResource.FILE);
		dialog.setTitle("Resource Selection");
		dialog.open();
		Object[] selected = dialog.getResult();
		String modelLocation = ((File)selected[0]).getLocationURI().toString();
		String modelProject = ((File)selected[0]).getProject().getName();
		
		/*
		 * Init interpreter
		 */
		Set<String> projects = new HashSet<String>();
		Set<String> plugins = new HashSet<String>();
		projects.add(dslProject);
		projects.add(modelProject);
		LangInterpreter interpreter = new LangInterpreter();
		interpreter.javaExtensions.updateScope(plugins,projects);
		interpreter.javaExtensions.reloadIfNeeded();
		
		/*
		 * Eval
		 */
		IEvaluationResult result = interpreter.eval(modelLocation, new ArrayList(), resource.getLocationURI().getPath().toString());
		
		return null;
	}
}