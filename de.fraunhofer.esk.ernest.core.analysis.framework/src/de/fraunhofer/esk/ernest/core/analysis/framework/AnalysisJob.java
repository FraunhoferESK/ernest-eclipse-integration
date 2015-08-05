/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer Institute for Embedded Systems and
 * Communication Technologies ESK
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This file is part of ERNEST.
 *
 * Contributors:
 * Fraunhofer ESK - initial API and implementation
 *******************************************************************************/
package de.fraunhofer.esk.ernest.core.analysis.framework;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressConstants;

import de.fraunhofer.esk.ernest.core.analysis.framework.interfaces.AnalysisException;
import de.fraunhofer.esk.ernest.core.analysis.framework.interfaces.IAnalysis;
import de.fraunhofer.esk.ernest.core.analysis.framework.interfaces.IAnalysisHandler;

/**
 * This is running as a separate Process in the ProcessView for every Analysis.<p>
 * It initializes the Analysis Object and calls the methods defined in {@link IAnalysis}.<br>
 * Also includes Error Handling related to the Analysis and gives Feedback to the user
 * if the Analysis was successful or not.
 *
 * @see IAnalysis
 */
public class AnalysisJob extends Job implements IAnalysisHandler,DefinedConstants{
	/**
	 * The {@link IStatus} array contains for each file the analogical AnalysesTypes.
	 * Where the first analysisType.length entries are reserved for the first file,
	 * the next analysisType.length entries for the next file and so on.
	 */
	private final IStatus[] status;
	private final AnalysisType[] analysisType;
	private final String[] filename;
	private IAnalysis[] analysis;

	/** Indicates that the Analysis was cancelled by the user. */
	public static final IStatus STATUS_CANCELED = new Status(Status.CANCEL, Activator.PLUGIN_ID, "Analysis canceled.");
	/** Indicates that errors occurred during Initialization. */
	public static final IStatus STATUS_INITFAILED = new Status(Status.WARNING, Activator.PLUGIN_ID, "Errors occured while trying to start the Analysis");

	/**
	 * A Listener that will post the result of the Analysis in a MessageDialog.
	 */
	public class AnalysisJobChangeListener implements IJobChangeListener,DefinedConstants {

		@Override
		public void sleeping(IJobChangeEvent event) {}

		@Override
		public void scheduled(IJobChangeEvent event) {}

		@Override
		public void running(IJobChangeEvent event) {}

		@Override
		public void done(final IJobChangeEvent event) {
			PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
				@Override
				public void run() {
					IStatus result = event.getResult();	 // returns STATUS_SUCCESSNOERR if no error occurred or STATUS_CANCELED if user pressed cancel
					/* used to build the MessageDialog for the User */
					String userMessageDetails="";
					String userMessageInfo="";
					String constraintMessage="";
					String initFailedMessage="";
					String failedMessage="";
					/* used to mark if constraint violation, initialization error or analysis fail appeared during analysis */
					boolean constraint = false;
					boolean init = false;
					boolean fail = false;

					if (result == STATUS_SUCCESSNOERR)
					{
						AnalysisJob.this.setProgressInfo(UI_ANALYSIS_LABELRESULT , String.format(UI_ANALYSIS_TEXTSUCCESSNOERR, AnalysisJob.this.analysisType[0].getName(), AnalysisJob.this.filename));
						MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
							UI_ANALYSIS_LABELRESULT ,
							UI_ANALYSIS_TEXTSUCCESSNOERR );
					} else if(result == STATUS_CANCELED)
					{
						AnalysisJob.this.setProgressInfo(UI_ANALYSIS_LABELCANCELED , String.format(UI_ANALYSIS_TEXTCANCELED, ""/*analysisType.getName()*/, AnalysisJob.this.filename));
						MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
								UI_ANALYSIS_LABELCANCELED ,
								UI_ANALYSIS_TEXTCANCELED);
					} else {
						/* loop through status Messages and build SubStrings */
						for(int j = 0; j<AnalysisJob.this.filename.length;j++)
						{
							String ernestFileName = AnalysisJob.this.filename[j].substring( AnalysisJob.this.filename[j].lastIndexOf("/")+1, AnalysisJob.this.filename[j].lastIndexOf(".") );

							for(int i = 0; i<AnalysisJob.this.analysisType.length;i++)
							{
								if(STATUS_SUCCESSERR == AnalysisJob.this.status[i + j * AnalysisJob.this.analysisType.length])	{
									constraintMessage = constraintMessage + "\n   " + AnalysisJob.this.analysisType[i].getName() + "   @"+ernestFileName;
									constraint=true;
								}
								else if(STATUS_INITFAILED == AnalysisJob.this.status[i + j * AnalysisJob.this.analysisType.length]) {
									initFailedMessage = initFailedMessage + "\n   " + AnalysisJob.this.analysisType[i].getName() + "   @"+ernestFileName;
									init=true;
								}
								else if(STATUS_FAILED == AnalysisJob.this.status[i + j * AnalysisJob.this.analysisType.length]) {
									failedMessage = failedMessage + "\n   " + AnalysisJob.this.analysisType[i].getName() + "   @"+ernestFileName;
									fail=true;
								}
							} /* end for each analysis loop */
						} /* end for each file loop */

						/* build userMessageDetails */
						if(constraint) {
						    userMessageDetails=userMessageDetails + "\n\n" + UI_MESSAGEDETAILS_CONSTRAINTFAILED  + constraintMessage;
						}
						if(init) {
						    userMessageDetails=userMessageDetails + "\n\n"  + UI_MESSAGEDETAILS_INITFAILED  + initFailedMessage;
						}
						if(fail) {
						    userMessageDetails=userMessageDetails + "\n\n"  + UI_MESSAGEDETAILS_ANALYSISFAILED + failedMessage;
						}

						/* build userMessageInfo  */
						if(init &!fail &!constraint) {
							AnalysisJob.this.setProgressInfo(UI_ANALYSIS_LABELRESULT, UI_ANALYSIS_TEXTINITFAILED);
						} else if(fail &!init &!constraint) {
							AnalysisJob.this.setProgressInfo(UI_ANALYSIS_LABELRESULT, UI_ANALYSIS_TEXTFAILED);
						} else if(fail | init) {
							AnalysisJob.this.setProgressInfo(UI_ANALYSIS_LABELRESULT, UI_ANALYSIS_MULTIPROBLEMS);
						} else if(constraint) {
							AnalysisJob.this.setProgressInfo(UI_ANALYSIS_LABELRESULT, UI_ANALYSIS_TEXTSUCCESSERR);
						} else {
							AnalysisJob.this.setProgressInfo(UI_ANALYSIS_LABELRESULT, UI_ANALYSIS_TEXTSUCCESSNOERR);
						}

						/* generate Message */
						userMessageInfo = UI_MESSAGEINFO_FINISHED;
						final String pluginID = "de.fraunhofer.esk.ernest.core.analysis.framework.AnalysisJob";
						MultiStatus info = new MultiStatus(pluginID, 1, userMessageInfo, null);
						info.add(new Status(IStatus.INFO, pluginID, 1, userMessageDetails, null));
						ErrorDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getShell(),
							   UI_ANALYSIS_LABELRESULT, null, info);
					}
				}
			});
		}

		@Override
		public void awake(IJobChangeEvent event) {}

		@Override
		public void aboutToRun(IJobChangeEvent event) {}
	}

	public AnalysisJob(AnalysisType[] analysisType, String[] filename) {
		super("ERNEST");
		this.status = new IStatus[filename.length * analysisType.length];
		this.analysisType = analysisType;
		this.filename = filename;
		this.create();
	}

	/**
	 * Additional Initializations.
	 */
	private void create() {
		// Get an Instance of the Analysis
		IAnalysis[] tmpAnal = new IAnalysis[this.analysisType.length];
		IAnalysisHandler[] tmpAnalHand = new IAnalysisHandler[this.analysisType.length];


		for(int j = 0; j<this.filename.length; j++) {
		    for(int i = 0; i<this.analysisType.length; i++)
		    {
		    	tmpAnal[i] = this.analysisType[i].getInstance();

		    	/* Set the Handler
		    	 * If no one was set - take the default in this class
		    	 * If analysis class implements a handler - use the analysis instance
		    	 * In all other cases - get an Instance of the Handler class
		    	 */
		    	if(this.analysisType[i].getHandler().isEmpty()) {
		    	    tmpAnalHand[i] = this;
		    	} else if(this.analysisType[i].getHandler().compareTo(this.analysisType[i].getClassname()) == 0) {
		    	    tmpAnalHand[i] = (IAnalysisHandler)this.analysisType[i];
		    	} else {
		    	    tmpAnalHand[i] = this.analysisType[i].getHandlerInstance();
		    	}

		    	this.setProgressInfo("Analysis Status", this.analysisType[i].getName() + " Analysis running for \n\nModelfile:" + this.filename[j]);
		    }
		}

		// Setup the Listener
		this.addJobChangeListener(new AnalysisJobChangeListener());

		this.analysis = tmpAnal.clone();
		tmpAnalHand.clone();
	}

	/**
	 * This method is responsible for <br>
	 * - creating an Instance of the given AnalysisType<br>
	 * - calling preAnalyse and handling LoadAnalysisExceptions<br>
	 * - calling analyse with the correct AnalyseProgress<br>
	 * - calling postAnalyse<br>
	 * - return the Status of the Analysis<br>
	 *
	 */
	@Override
	protected IStatus run(IProgressMonitor monitor)
	{
		/* IProgressMonitor
		 * Initializes the ProgressMonitor
		 * with 100 000 total work where
		 * 20 000 is used by PreAnalysis
		 * 80 000 is used by Analysis
		 * 00 000 is used by PostAnalysis - cause it only saves the analysis
		 * Multiplied by the number of Analyses and Files requested
		 */
		monitor.beginTask( "Analyse", 100000 * this.analysisType.length * this.filename.length);

		for(int j = 0; j<this.filename.length;j++)
		{
			for(int i = 0; i<this.analysisType.length;i++)
			{
				if(this.analysis[i] == null){
					this.status[i + j*this.analysisType.length] = STATUS_INITFAILED;
					monitor.worked( 100000 );
					continue;
				}

				// run PRE ANALYSIS
				try {
					this.analysis[i].preAnalyse(this.filename[j], monitor);
				} catch (AnalysisException e) {
					System.err.println("Analysis Error occured for file " + this.filename[j] + "\n 	" + e.getMessage());

					this.status[i + j*this.analysisType.length] = STATUS_INITFAILED;
					monitor.worked( 100000 );
					continue;
				}

				// run ANALYSIS
				if(monitor.isCanceled()) {
				    return STATUS_CANCELED;
				}
				try{

					if(this.analysis[i].analyse(monitor)	 ) {
					    this.status[i + j*this.analysisType.length] = STATUS_SUCCESSNOERR;
					} else {
					    this.status[i + j*this.analysisType.length] = STATUS_SUCCESSERR;
					}

				} catch(AnalysisException e) {
					if(e.getMessage().compareTo("canceled")==0) {
					    return STATUS_CANCELED;
					} else{
						e.getMessage();
						this.status[i + j*this.analysisType.length] = STATUS_INITFAILED;
						monitor.worked( WORK_PER_LOOP );
						continue;
					}
				} catch(Exception e) {
					e.printStackTrace();
					this.status[i + j*this.analysisType.length] = STATUS_FAILED;
					monitor.worked( WORK_PER_LOOP );
					continue;
				}

				// run POST ANALYSIS
				if(monitor.isCanceled()) {
				    return STATUS_CANCELED;
				}
				this.analysis[i].postAnalyse(monitor);
			}
		}

			monitor.done();

			/* Return the Status, which is shown the User in the MessageDialog */
			for(IStatus state : this.status) {
			    if(state!=STATUS_SUCCESSNOERR) {
			        return state;
			    }
			}
			return STATUS_SUCCESSNOERR;
	}

	private void setProgressInfo(final String label, final String text) {
		// Add an Action, so that the user gets a Response when clicking on a Process in the ProcessView
		this.setProperty(IProgressConstants.ACTION_PROPERTY, new Action() {
		    @Override
		    public void run() {
		        MessageDialog.openInformation(new Shell(), label, text);
		    }
		});
	}

	@Override
	public void done(String analysisname, String filename, IStatus status)
	{

	}
}
