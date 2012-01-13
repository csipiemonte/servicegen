package it.csi.mddtools.servicegen.genutils;

import it.csi.mddtools.servicedef.ServiceDef;
import it.csi.mddtools.servicegen.SOABEModel;
import it.csi.mddtools.servicegen.ServiceImpl;
import it.csi.mddtools.typedef.CSIDatatype;
import it.csi.mddtools.typedef.CSIDatatypeCodes;
import it.csi.mddtools.typedef.Entity;
import it.csi.mddtools.typedef.Feature;
import it.csi.mddtools.typedef.PrimitiveType;
import it.csi.mddtools.typedef.Type;
import it.csi.mddtools.typedef.TypedArray;
import it.csi.mddtools.typedef.TypedefFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeGenerationUtils {

	//////
	public final static String SDANNOTATION_SRC_SERVICEDEF = "servicedef";
	public final static String TDANNOTATION_SRC_TYPEDEF = "typedef";
	
	public final static String ANNOTATION_KEY_JAVAFQN = "java-fqn";


	/**
	 * 
	 * @param sourceId
	 * @return un id univoco della regione protetta univocamente derivabile
	 * da sourceId. Serve per avere degli id univoci ma abbastanza corti da non
	 * creare problemi a seguito di eventuali formattazioni automatiche dei 
	 * commenti che dichiarano la protectred region 
	 */
	public static String getRegionUID(String sourceId){
		String uid = "R"+sourceId.hashCode();
		return uid;
	}
	
	public static boolean validateCodServ(String codServ){
		Pattern p = Pattern.compile("[a-z0-9_]+");
		Matcher m = p.matcher(codServ);
		return m.matches();
	}
	
	/**
	 * Trasforma in notazione a cammello spezzando con il separatore specificato
	 * @param src
	 * @return
	 */
	public static String toCamel(String src){
		String sep ="_";
		StringTokenizer strtok = new StringTokenizer(src,sep);
		String out = "";
		while(strtok.hasMoreTokens()){
			String tok=strtok.nextToken();
			out+=toFirstUpper(tok);
		}
		return out;
	}
	
	public static String removeSeparator(String src){
		String sep ="_";
		StringTokenizer strtok = new StringTokenizer(src,sep);
		String out = "";
		while(strtok.hasMoreTokens()){
			String tok=strtok.nextToken();
			out+=tok;
		}
		return out;
	}
	
	public static String toFirstUpper(String src){
		if (src==null)
			return null;
		if (src.length()==0)
			return src;
		return src.substring(0,1).toUpperCase()+src.substring(1);
	}
	
	////////////////
	
	public static Type[] generateCSIBaseTypes(){
	    // tipi semplici
		//basicTypesMap = new Hashtable();
		CSIDatatype csiInteger = createDT("CSIInteger", CSIDatatypeCodes.CSI_INTEGER, false);
		//basicTypesMap.put(Integer.TYPE, csiInteger);
		CSIDatatype csiBoolean = createDT("CSIBoolean", CSIDatatypeCodes.CSI_BOOLEAN, false);
		//basicTypesMap.put(Boolean.TYPE, csiBoolean);
		CSIDatatype csiByte = createDT("CSIByte", CSIDatatypeCodes.CSI_BYTE, false);
		//basicTypesMap.put(Byte.TYPE, csiByte);
		CSIDatatype csiDate = createDT("CSIDate", CSIDatatypeCodes.CSI_DATE, false);
		//basicTypesMap.put(java.util.Date.class, csiDate);
		CSIDatatype csiDouble = createDT("CSIDouble", CSIDatatypeCodes.CSI_DOUBLE, false);
		//basicTypesMap.put(Double.TYPE, csiDouble);
		CSIDatatype csiFloat = createDT("CSIFloat", CSIDatatypeCodes.CSI_FLOAT, false);
		//basicTypesMap.put(Float.TYPE, csiFloat);
		CSIDatatype csiLong = createDT("CSILong", CSIDatatypeCodes.CSI_LONG, false);
		//basicTypesMap.put(Long.TYPE, csiLong);
		CSIDatatype csiString = createDT("CSIString", CSIDatatypeCodes.CSI_STRING, false);
		//basicTypesMap.put(String.class, csiString);
		// tipi wrapped (nillable)
		CSIDatatype csiWInteger = createDT("CSIWrappedInteger", CSIDatatypeCodes.CSI_INTEGER, true);
		//basicTypesMap.put(Integer.class, csiWInteger);
		CSIDatatype csiWBoolean = createDT("CSIWrappedBoolean", CSIDatatypeCodes.CSI_BOOLEAN, true);
		//basicTypesMap.put(Boolean.class, csiWBoolean);
		CSIDatatype csiWDouble = createDT("CSIWrappedDouble", CSIDatatypeCodes.CSI_DOUBLE, true);
		//basicTypesMap.put(Double.class, csiWDouble);
		CSIDatatype csiWFloat = createDT("CSIWrappedFloat", CSIDatatypeCodes.CSI_FLOAT, true);
		//basicTypesMap.put(Float.class, csiWFloat);
		CSIDatatype csiWLong = createDT("CSIWrappedLong", CSIDatatypeCodes.CSI_LONG, true);
		//basicTypesMap.put(Long.class, csiWLong);
		// array di tipi semplici
		TypedArray csiIntegerArray = createTA("Array of CSIInteger", csiInteger);
		//basicTypesMap.put(getTypedArrayClass(Integer.TYPE), csiIntegerArray);
		TypedArray csiBooleanArray = createTA("Array of CSIBoolean", csiBoolean);
		//basicTypesMap.put(getTypedArrayClass(Boolean.TYPE), csiBooleanArray);
		TypedArray csiByteArray = createTA("Array of CSIByte", csiByte);
		//basicTypesMap.put(getTypedArrayClass(Byte.TYPE), csiByteArray);
		TypedArray csiDateArray = createTA("Array of CSIDate", csiDate);
		//basicTypesMap.put(getTypedArrayClass(java.util.Date.class), csiDateArray);
		TypedArray csiDoubleArray = createTA("Array of CSIDouble", csiDouble);
		//basicTypesMap.put(getTypedArrayClass(Double.TYPE), csiDoubleArray);
		TypedArray csiFloatArray = createTA("Array of CSIFloat", csiFloat);
		//basicTypesMap.put(getTypedArrayClass(Float.TYPE), csiFloatArray);
		TypedArray csiLongArray = createTA("Array of CSILong", csiLong);
		//basicTypesMap.put(getTypedArrayClass(Long.TYPE), csiLongArray);
		TypedArray csiStringArray = createTA("Array of CSIString", csiString);
		//basicTypesMap.put(getTypedArrayClass(String.class), csiStringArray);
		// array di tipi wrapped
		TypedArray csiWIntegerArray = createTA("Array of CSIWrappedInteger", csiWInteger);
		//basicTypesMap.put(getTypedArrayClass(Integer.class), csiWIntegerArray);
		TypedArray csiWBooleanArray = createTA("Array of CSIWrappedBoolean", csiWBoolean);
		//basicTypesMap.put(getTypedArrayClass(Boolean.class), csiWBooleanArray);
		TypedArray csiWDoubleArray = createTA("Array of CSIWrappedDouble", csiWDouble);
		//basicTypesMap.put(getTypedArrayClass(Double.class), csiWDoubleArray);
		TypedArray csiWFloatArray = createTA("Array of CSIWrappedFloat", csiWFloat);
		//basicTypesMap.put(getTypedArrayClass(Float.class), csiWFloatArray);
		TypedArray csiWLongArray = createTA("Array of CSIWrappedLong", csiWLong);
		//basicTypesMap.put(getTypedArrayClass(Long.class), csiWLongArray);
		
		Type [] types = new Type[]{
				csiInteger,csiBoolean,csiByte,csiDate,csiDouble,csiFloat,csiLong,csiString,
				csiWInteger,csiWBoolean,csiWDouble,csiWFloat,csiWLong,
				csiIntegerArray,csiBooleanArray,csiByteArray,csiDateArray,csiDoubleArray,csiFloatArray,csiLongArray,csiStringArray,
				csiWIntegerArray,csiWBooleanArray,csiWDoubleArray,csiWFloatArray,csiWLongArray
		};
		return types;
	}
	
	public static Class getTypedArrayClass(Class javaCompType){
		Object dummyArray = Array.newInstance(javaCompType, 0);
		return dummyArray.getClass();
	}
	public static CSIDatatype createDT(String name, CSIDatatypeCodes code, boolean nillable){
		CSIDatatype dt = TypedefFactory.eINSTANCE.createCSIDatatype();
		dt.setName(name);
		dt.setCode(code);
		dt.setNillable(nillable);
		return dt;
	}

	public static TypedArray createTA(String name,CSIDatatype dt){
		TypedArray ta = TypedefFactory.eINSTANCE.createTypedArray();
		ta.setName(name);
		ta.setComponentType(dt);
		return ta;
	}

	public static TypedArray createTA(String name,Entity dt){
		TypedArray ta = TypedefFactory.eINSTANCE.createTypedArray();
		ta.setName(name);
		ta.setComponentType(dt);
		return ta;
	}
	
	////
	
	/**
	 * restituisce l'unione dei service-def contenuti in SOABEModel.servicedefinitions e quelli
	 * referenziati da una service-impl (che possono anche essere inclusi tramite load-resource).
	 * L'unione e' senza ripetizione.
	 */
	public static ArrayList<ServiceDef> getProvidedServices(SOABEModel model) {
		ArrayList<ServiceDef> result = new ArrayList<ServiceDef>();
		if (model.getServiceimplementations()==null)
			return null;
		
		// prima ciclo sulle impl
		Iterator<ServiceImpl> it_impl = model.getServiceimplementations().iterator();
		while(it_impl.hasNext()){
			ServiceImpl currImpl = it_impl.next();
			if (currImpl.getProvides()!=null){
				result.add(currImpl.getProvides());
				//System.out.println("getProvidedServices, add referenced"+currImpl.getProvides());
			}
		}
		
		// poi ciclo sulle service definitions e aggiungo solo se già non presente
		
		Iterator<ServiceDef> it_sd = model.getServiceDefs().iterator();
		while(it_sd.hasNext()){
			ServiceDef currOwnedSD = it_sd.next();
			if (!result.contains(currOwnedSD)){
				result.add(currOwnedSD);
				//System.out.println("getProvidedServices, add owned"+currOwnedSD);
			}
		}
		//System.out.println("getProvidedServices, total:"+result.size());
		return result;
	}
	
	
	//////
	
	/**
	 * restituisce il package standard per una entity di un servizio afferente ad un
	 * determinato componente
	 */
	public static String getEntityStdPackage(Entity e, String codProd, String codComp, String codServ, String optionalOrgPrefix){
		String orgPrefix="it.csi";
		if (optionalOrgPrefix!=null)
			orgPrefix = optionalOrgPrefix;
		return orgPrefix+"."+codProd.toLowerCase()+"."+codComp.toLowerCase()+".dto."+removeSeparator(codServ);
	}
	
	/**
	 * restituisce il package standard per una exception di un servizio afferente ad un
	 * determinato componente
	 */
	public static String getExceptionStdPackage(it.csi.mddtools.typedef.Exception e, String codProd, String codComp, String codServ, String optionalOrgPrefix){
		String orgPrefix="it.csi";
		if (optionalOrgPrefix!=null)
			orgPrefix = optionalOrgPrefix;
		return orgPrefix+"."+codProd.toLowerCase()+"."+codComp.toLowerCase()+".exception."+removeSeparator(codServ);
	}
	
	/**
	 * restituisce il package standard della public interface di un servizio afferente ad un
	 * determinato componente
	 */
	public static String getCSIInterfaceStdPackage(ServiceDef sd, String optionalOrgPrefix){
		String orgPrefix="it.csi";
		if (optionalOrgPrefix!=null)
			orgPrefix = optionalOrgPrefix;
		return orgPrefix+"."+sd.getCodProdotto().toLowerCase()+"."+sd.getCodComponente().toLowerCase()+".interfacecsi."+removeSeparator(sd.getCodServizio());
	}



}
