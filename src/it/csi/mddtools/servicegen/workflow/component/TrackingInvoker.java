package it.csi.mddtools.servicegen.workflow.component;

import it.csi.mddtools.servicegen.genutils.MiscUtils;

import java.util.Properties;

import mddtools.usagetracking.ProfilingPacketBuilder;
import mddtools.usagetracking.TrackingSender;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class TrackingInvoker extends AbstractWorkflowComponent{

	public void checkConfiguration(Issues issues) {
		// TODO Auto-generated method stub
		
	}

	public void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		// TODO Auto-generated method stub
		System.out.println("invoke TrackingInvoker");
	}

	public void setTrack(boolean b) {
		if (TrackingSender.isTrackingActive()) {
			System.out.println("setTrack:" + modelName);
			Properties info = ProfilingPacketBuilder.packGenerateInfo(
					MiscUtils.getPluginName(), MiscUtils.getPluginVersion(),
					modelName, "?", targetProjectName);
			TrackingSender.sendTrackingInfo(info);
		}
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setTargetProjectName(String targetProjectName) {
		this.targetProjectName = targetProjectName;
	}

	public String getTargetProjectName() {
		return targetProjectName;
	}

	private String modelName;
	private String targetProjectName;
}
