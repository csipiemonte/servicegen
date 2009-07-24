package it.csi.mddtools.appresources.genutils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.EList;

import it.csi.mddtools.appresources.ResourceConnector;
import it.csi.mddtools.appresources.ResourceSet;
import it.csi.mddtools.servicegen.OrchestrationFlowCompositeSC;
import it.csi.mddtools.servicegen.ResourceBasedSC;
import it.csi.mddtools.servicegen.ResourceBasedSimpleSC;
import it.csi.mddtools.servicegen.SOABEModel;
import it.csi.mddtools.servicegen.ServiceImpl;

public class GenUtils {

	public final static String RCANNOTATION_SRC_RESOURCES = "appresources";
	
	/**
	 * Annotazione per PAPDServiceConnector per specificare il plugin pd da utilizzare
	 */
	public final static String ANNOTATION_KEY_PDPLUGIN = "csi-pd-plugin";
	
	/**
	 * plugin pd ejb modalità vecchia (package ejb)
	 */
	public final static String ANNOTATION_VALUE_PDPLUGIN_EJB1 = "ejbpa-1";
	
	/**
	 * plugin pd ejb modalità nuova (package ejb20)
	 */
	public final static String ANNOTATION_VALUE_PDPLUGIN_EJB2 = "ejbpa-2";
	

	/**
	 * Annotazione per PAPDServiceConnector per specificare il jndiname da utilizzare
	 * (per porte ejb o ejb20)
	 */
	public final static String ANNOTATION_KEY_PDEJBJNDINAME = "csi-ejbpa-jndiname";
	
	/**
	 * Annotazione per PAPDServiceConnector per specificare la target platform del servizio
	 * (serve per il binding ejb)
	 */
	public final static String ANNOTATION_KEY_PA_PLATFORM = "csi-pa-platform";
	
	/**
	 * pa su piattaforma WLS92
	 */
	public final static String ANNOTATION_VALUE_PA_PLATFORM_WLS92 = "WLS92";
	
	/**
	 * pa su piattaforma JBoss43
	 */
	public final static String ANNOTATION_VALUE_PA_PLATFORM_JBoss43 = "JBoss43";
	
	
	/**
	 * Annotazione per PAPDServiceConnector per specificare la location 
	 * su repart del jar client: componente organization.
	 * value="<org>/<prod>/<ver>", es: csipiemonte/iridev2/2.0.0
	 */
	public final static String ANNOTATION_KEY_REPARTPOSITION = "repart-position";
	
	/**
	 * Annotazione per PAPDServiceConnector per specificare gli artifact da scaricare 
	 * a partire dalla posizione deducibile dal vlaore di "ANNOTATION_KEY_REPARTPOSITION".
	 * es: iridev2-pep-intf-2.0.0 (non si deve aggiungere l'estensione che è automaticamente .jar)
	 */
	public final static String ANNOTATION_KEY_REPARTARTIFACT = "repart-artifact";
	
	
	/**
	 * 
	 * @param implementations
	 * @return l'insieme di tutte i resource connector referenziati dalle implementazioni di
	 * servizio, eliminando i doppioni (ovvero ogni resource set viene interrogato una sola volta).
	 */
	public static ArrayList<ResourceConnector> getAllResourceConnectors(SOABEModel model){
		EList<ServiceImpl> implementations = model.getServiceimplementations(); 
		if (implementations==null)
			throw new IllegalArgumentException("model.getServiceimplementations()==null!!");
		
		ArrayList<ResourceConnector> ris = new ArrayList<ResourceConnector>();
		Iterator<ServiceImpl> it_si = implementations.iterator();
		ArrayList<ServiceImpl> visited_si = new ArrayList<ServiceImpl>();
		while (it_si.hasNext()) {
			ServiceImpl serviceImpl = (ServiceImpl) it_si.next();
			if (!visited_si.contains(serviceImpl)){
				if (serviceImpl.getServiceComponent()!= null && serviceImpl.getServiceComponent() instanceof ResourceBasedSC){
					// TODO pezza tmeporanea per risolvere il fatto che la reference "resourceSet" non è 
					// definita a livello di ResourceBasedSC ma delle sottoclassi
					if (serviceImpl.getServiceComponent() instanceof ResourceBasedSimpleSC){
						ResourceSet rs = ((ResourceBasedSimpleSC)serviceImpl.getServiceComponent()).getResourceSet();
						if (rs==null)
							throw new IllegalArgumentException("serviceComponent.resourceSet==null!!");
						ris.addAll(rs.getResources());
					}
					else if (serviceImpl.getServiceComponent() instanceof OrchestrationFlowCompositeSC){
						ResourceSet rs = ((OrchestrationFlowCompositeSC)serviceImpl.getServiceComponent()).getResourceSet();
						if (rs==null)
							throw new IllegalArgumentException("serviceComponent.resourceSet==null!!");
						ris.addAll(rs.getResources());
					} 
					else throw new IllegalArgumentException("getAllResourceconnectors: tipo SC non gestito "+serviceImpl.getServiceComponent().getClass());
				}
			}
		}
		return ris;
	}
	
	public static ArrayList<ResourceConnector> getAllResourceConnectors(ServiceImpl serviceImpl){
		ArrayList<ResourceConnector> ris = new ArrayList<ResourceConnector>();
		if (serviceImpl.getServiceComponent()!= null && serviceImpl.getServiceComponent() instanceof ResourceBasedSC){
			// TODO pezza tmeporanea per risolvere il fatto che la reference "resourceSet" non è 
			// definita a livello di ResourceBasedSC ma delle sottoclassi
			if (serviceImpl.getServiceComponent() instanceof ResourceBasedSimpleSC){
				ris.addAll(((ResourceBasedSimpleSC)serviceImpl.getServiceComponent()).getResourceSet().getResources());
			}
			else if (serviceImpl.getServiceComponent() instanceof OrchestrationFlowCompositeSC){
				ris.addAll(((OrchestrationFlowCompositeSC)serviceImpl.getServiceComponent()).getResourceSet().getResources());
			} 
			else throw new IllegalArgumentException("getAllResourceconnectors: tipo SC non gestito "+serviceImpl.getServiceComponent().getClass());
		}
		return ris;
	}
	
	public static String getRepartOrganization(String fullLoc){
		StringTokenizer stok = new StringTokenizer(fullLoc, "/");
		return stok.nextToken();
	}
	
	public static String getRepartName(String fullLoc){
		StringTokenizer stok = new StringTokenizer(fullLoc, "/");
		stok.nextToken();
		return stok.nextToken();
	}
	
	public static String getRepartVer(String fullLoc){
		StringTokenizer stok = new StringTokenizer(fullLoc, "/");
		stok.nextToken();
		stok.nextToken();
		return stok.nextToken();
	}
}
