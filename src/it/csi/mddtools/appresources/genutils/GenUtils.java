package it.csi.mddtools.appresources.genutils;

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
	 * Annotazione per PAPDServiceConnector per specificare la location 
	 * su repart del jar client: componente organization.
	 * value="<org>/<prod>/<ver>", es: csipiemonte/iridev2/2.0.0
	 */
	public final static String ANNOTATION_KEY_REPARTPOSITION = "repart-position";
	
	/**
	 * Annotazione per PAPDServiceConnector per specificare gli artifact da scaricare 
	 * a partire dalla posizione deducibile dal vlaore di "ANNOTATION_KEY_REPARTPOSITION".
	 * es: iridev2-pep-intf-2.0.0.jar
	 */
	public final static String ANNOTATION_KEY_REPARTARTIFACT = "repart-artifact";
}
