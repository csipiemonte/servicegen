package it.csi.mddtools.servicedef.workflow.component;

import it.csi.mddtools.servicedef.ServiceDef;
import it.csi.mddtools.servicedef.tools.ServiceDefInferTool;

import org.apache.tools.ant.taskdefs.optional.depend.constantpool.InterfaceMethodRefCPInfo;
import org.eclipse.emf.ecore.EObject;
import org.openarchitectureware.workflow.WorkflowContext;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.lib.WorkflowComponentWithModelSlot;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;

/**
 * Componente di workflow oaw che permette la ricostruzione dell documento servicedef a 
 * partire dal jhar client dell'interfaccia CSI
 * @author CSI Piemonte
 *
 */
public class ServiceDefInferrer extends WorkflowComponentWithModelSlot{

	protected String interfClass;
	
	public void setInterfaceClass(String cl){
		interfClass=cl;
	}
	
	public String getInterfaceClass(){
		return interfClass;
	}
	
	protected String outModelSlot;
	public String getOutModelSlot(){
		return outModelSlot;
	}
	public void setOutModelSlot(String sl){
		outModelSlot=sl;
	}
	
	protected String basicTypesModelSlot;
	public String getBasicTypesModelSlot(){
		return basicTypesModelSlot;
	}
	public void setBasicTypesModelSlot(String sl){
		basicTypesModelSlot=sl;
	}
	
	public void invoke(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		EObject model = (EObject)ctx.get(this.getModelSlot());
		EObject basicTypesModel = (EObject)ctx.get(this.getBasicTypesModelSlot());
		checkConfig();
		if (model instanceof ServiceDef){
			Class cl;
			try {
				cl = Class.forName(interfClass);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new IllegalArgumentException("Impossibile caricare la classe di interfaccia "+interfClass);
			}
			model = ServiceDefInferTool.inferServiceDef(cl, (ServiceDef)model, basicTypesModel);
			// il modello originale rimane modificato ma in memory=> la risorsa non viene modificata
			ctx.set(outModelSlot, model);
		}
		else throw new IllegalArgumentException("Errore in ServiceDefInferrer: lo slot ["+getModelSlot()+"] non contiene un modello ServiceDef ma invece:"+model);
		
	}

	void checkConfig() throws IllegalArgumentException{
		System.out.println("modelSlot:"+getModelSlot());
		if (getModelSlot()==null)
			throw new IllegalArgumentException("modelSlot mancante");
		System.out.println("outModelSlot:"+getOutModelSlot());
		if (getOutModelSlot()==null)
			throw new IllegalArgumentException("outModelSlot mancante");
		System.out.println("interfaceClass:"+getInterfaceClass());
		if (getInterfaceClass()==null)
			throw new IllegalArgumentException("interfaceClass mancante");
		System.out.println("modelSlot:"+getModelSlot());
		if (getBasicTypesModelSlot()==null)
			throw new IllegalArgumentException("basicTypesModelSlot mancante");
	}
}
