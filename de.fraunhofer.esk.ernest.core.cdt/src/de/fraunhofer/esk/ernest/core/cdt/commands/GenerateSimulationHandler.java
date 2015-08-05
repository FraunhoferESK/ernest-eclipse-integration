package de.fraunhofer.esk.ernest.core.cdt.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import de.fraunhofer.esk.ernest.core.analysis.framework.ERNESTHandlerUtil;
import de.fraunhofer.esk.ernest.core.cdt.DefinedConstants;
import de.fraunhofer.esk.ernest.core.cdt.wizards.GenerateSimulationWizard;

/**
 * This class is called by the User clicking in the Menu on "Generate Simulation".<p>
 * It starts the wizard, where the new CDT-Project is created. <br>
 *
 */
public class GenerateSimulationHandler extends AbstractHandler implements DefinedConstants {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();

		IFile file = ERNESTHandlerUtil.selectionToErnestFile(selection);
		if (file != null) {
			/* Execute Wizard*/
			GenerateSimulationWizard wizard = new GenerateSimulationWizard(file);
			WizardDialog wizarddialog = new WizardDialog(shell, wizard);
			if(wizarddialog.open() == Window.CANCEL) {
			    return null;
			}
			MessageDialog.openInformation(shell, "ERNEST", "The simulation has been succesfully generated.");
		} else {
			MessageDialog
					.openError(HandlerUtil.getActiveShell(event),
							"ERNEST Simulation Generator",
							"No ERNEST model available for the current selection.");
		}
	    return null;
	}

	@Override
	public boolean isEnabled() {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getSelection();
		return ERNESTHandlerUtil.selectionToErnestFile(selection) != null;
	}
	
} 