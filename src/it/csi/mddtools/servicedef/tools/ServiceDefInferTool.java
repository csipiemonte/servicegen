package it.csi.mddtools.servicedef.tools;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import it.csi.mddtools.servicedef.OpTypeEnum;
import it.csi.mddtools.servicedef.Operation;
import it.csi.mddtools.servicedef.Param;
import it.csi.mddtools.servicedef.ServiceDef;
import it.csi.mddtools.servicedef.ServicedefFactory;
import it.csi.mddtools.servicedef.ServicedefPackage;
import it.csi.mddtools.servicedef.TXTypeEnum;
import it.csi.mddtools.servicedef.Types;
import it.csi.mddtools.servicegen.genutils.CodeGenerationUtils;
import it.csi.mddtools.typedef.CSIDatatype;
import it.csi.mddtools.typedef.CSIDatatypeCodes;
import it.csi.mddtools.typedef.CSIExceptionTypes;
import it.csi.mddtools.typedef.Entity;
import it.csi.mddtools.typedef.Feature;
import it.csi.mddtools.typedef.Type;
import it.csi.mddtools.typedef.TypedArray;
import it.csi.mddtools.typedef.TypedefFactory;

/**
 * Tool per inferire un oggetto service def a partire dalla classe della interfaccia 
 * CSI. Serve per ottenere un modello ServiceDef a partire da librerie client legacy, 
 * cioe' realizzate prima dell'avvento degli standard codifica oggetti SOA.
 */
public class ServiceDefInferTool {

	/**
	 * 
	 * @param m il metodo da analizzare
	 * @param userEntities le entity definite globalmente dall'interfaccia (accumulatore)
	 * @param userExceptions le exceptions definite globalmente dall'interfaccia (accumulatore)
	 * @param userArrays i typed array user defined
	 * @return
	 */
	private static Operation inferOperation(Method m, Hashtable userEntities, Hashtable userExceptions, Hashtable userArrays, Map basicTypesMap){
	   Operation op = ServicedefFactory.eINSTANCE.createOperation();
	   op.setName(m.getName());
	   Param [] params = inferParams(m.getParameterTypes(), userEntities, userArrays, basicTypesMap);
	   it.csi.mddtools.typedef.Exception [] throwsList = inferThrowsList(m.getExceptionTypes(),userExceptions);
	   Type retType = inferType(m.getReturnType(), userEntities, userArrays, basicTypesMap);
	   op.setReturnType(retType);
	   for (int ipar = 0; ipar < params.length; ipar++) {
		Param par = params[ipar];
		op.getParams().add(par);
	   }
	   for (int i = 0; i < throwsList.length; i++) {
		   it.csi.mddtools.typedef.Exception exc = throwsList[i];
		op.getThrows().add(exc);
	   }
	   if (params.length>0 && params[params.length-1].getType().getName().equals("DatiMessaggio"))
		   op.setOpType(OpTypeEnum.ASYNCH);
	   else
		   op.setOpType(OpTypeEnum.SYNCH);
	   // di default imposto il TX attribute a "noTX"
	   op.setTxType(TXTypeEnum.NO_TX);
	   return op;
	}

	private static Param [] inferParams(Class paramTypes[], Hashtable userEntities, Hashtable userArrays, Map basicTypesMap){
		Param [] params = new Param[paramTypes.length];
		for (int ipar = 0; ipar < paramTypes.length; ipar++) {
			Class parClass = paramTypes[ipar];
			Param currPar = ServicedefFactory.eINSTANCE.createParam();
			currPar.setName("p"+ipar);
			currPar.setType(inferType(parClass, userEntities, userArrays, basicTypesMap));
			params[ipar]=currPar;
		}
		return params;
	}

	private static Type inferType(Class cl, Hashtable userEntities, Hashtable userArrays, Map basicTypesMap){
		// è un tipo base? o un array di tipi base?
		Type baseType = (Type)basicTypesMap.get(cl);
		if (baseType!=null)
			return baseType;
		else if (cl.isArray()){
			return createOrGetUserArray(cl, userEntities, userArrays, basicTypesMap);
		}
		else{
			return createOrGetEntity(cl, userEntities, userArrays, basicTypesMap);
		}
	}

	private static Entity createOrGetEntity(Class cl, Hashtable userEntities, Hashtable userArrays, Map basicTypesMap){
		Entity e = (Entity)userEntities.get(cl);
		if (e==null){
			e = TypedefFactory.eINSTANCE.createEntity();
			e.setName(cl.getName().substring(cl.getName().lastIndexOf('.')+1));
			inferFeatures(cl,e, userEntities, userArrays, basicTypesMap);
			userEntities.put(cl, e);
			return e;
		}
		else
			return e;
	}

	private static TypedArray createOrGetUserArray(Class cl, Hashtable userEntities, Hashtable userArrays, Map basicTypesMap){
		if (!cl.isArray())
			throw new IllegalArgumentException(cl+" is not an array class!");
		TypedArray ta = (TypedArray)userArrays.get(cl);
		if (ta==null){
			Entity e = createOrGetEntity(cl.getComponentType(), userEntities, userArrays, basicTypesMap);
			ta = TypedefFactory.eINSTANCE.createTypedArray();
			ta.setName("Array of "+cl.getComponentType().getName().substring(cl.getComponentType().getName().lastIndexOf('.')+1));
			ta.setComponentType(e);
			userArrays.put(cl, ta);
			return ta;
		}
		else
			return ta;
	}

	private static void inferFeatures(Class cl, Entity e, Hashtable userEntities, Hashtable userArrays, Map basicTypesMap) {
		try {
			BeanInfo bi = Introspector.getBeanInfo(cl);
			PropertyDescriptor[] pds = bi.getPropertyDescriptors();
			for (int ipd = 0; ipd < pds.length; ipd++) {
				PropertyDescriptor pd = pds[ipd];
				if (pd.getPropertyType() == Class.class)
					continue;
				String pName = pd.getName();
				Class pType = pd.getPropertyType();
				Type fType = inferType(pType, userEntities, userArrays, basicTypesMap);
				Feature f = TypedefFactory.eINSTANCE.createFeature();
				f.setName(pName);
				f.setType(fType);
				e.getFeatures().add(f);
			}
		} catch (IntrospectionException intex) {
			throw new RuntimeException("Errore nell'introspezione del bean "
					+ cl + ": " + intex.getMessage());
		}
	}
		
	private static it.csi.mddtools.typedef.Exception [] inferThrowsList(Class excTypes[], Hashtable userExceptions){
		// è una eccezione di quelle predefinite?
		Vector vexc = new Vector();
		for (int iex = 0; iex < excTypes.length; iex++) {
			Class cl = excTypes[iex];
			if (cl.getName().startsWith("it.csi.csi.wrapper"))
				continue;
			it.csi.mddtools.typedef.Exception ex = createOrGetException(cl,userExceptions);
			vexc.add(ex);
		}
		it.csi.mddtools.typedef.Exception excArr[] = new it.csi.mddtools.typedef.Exception [vexc.size()];
		vexc.copyInto(excArr);
		return excArr;
	}

	private static it.csi.mddtools.typedef.Exception createOrGetException(Class cl, Hashtable userExceptions){
		it.csi.mddtools.typedef.Exception ex = (it.csi.mddtools.typedef.Exception)userExceptions.get(cl);
		if (ex!=null)
			return ex;
		else{
			ex = TypedefFactory.eINSTANCE.createException();
			ex.setName(cl.getName().substring(cl.getName().lastIndexOf('.')+1));
			if (it.csi.csi.wrapper.UserException.class.isAssignableFrom(cl))
				ex.setExceptionType(CSIExceptionTypes.USER);
			else if (it.csi.csi.wrapper.UnrecoverableException.class.isAssignableFrom(cl))
				ex.setExceptionType(CSIExceptionTypes.UNRECOVERABLE);
			else if (it.csi.csi.wrapper.SystemException.class.isAssignableFrom(cl))
				ex.setExceptionType(CSIExceptionTypes.SYSTEM);
			userExceptions.put(cl, ex);
			return ex;
		}
	}
	
	private static void extractBasicTypesFromIncludedResource(EList<Type> externalBasicTypes, Map<Class, Type> basicTypesMap){
		Map<Class, Type> createdBasicTypesMap = new HashMap<Class, Type>();
		
		// utilizzata alla rovescia
		generateCSIBaseTypes(createdBasicTypesMap);
		// itera sui tipi esterni e utilizza la mappa createdBasicTypesMap come riferimento alla
		// rovescia (Type->java type)
		Iterator<Class> it_key_genBasic = createdBasicTypesMap.keySet().iterator();
		while(it_key_genBasic.hasNext()){
			Class currKey = it_key_genBasic.next();
			Type currType = createdBasicTypesMap.get(currKey);
			Iterator<Type> it_ext_types = externalBasicTypes.iterator();
			while(it_ext_types.hasNext()){
				Type currExtT = it_ext_types.next();
				if (typeEquals(currExtT, currType)){
					basicTypesMap.put(currKey, currExtT);
				}
			}
		}
		System.out.println("extractedBasictypes:"+basicTypesMap);
	}
	
	public static boolean typeEquals(Type t1, Type t2){
		if (t1.getClass()!=t2.getClass())
			return false;
		
		if (t1 instanceof Entity || t1 instanceof Exception){
			throw new UnsupportedOperationException("typeEquals() non ancora impleentato per i tipi entity e exception");
		}
		else if (t1 instanceof CSIDatatype){
			CSIDatatype csidt1 = (CSIDatatype)t1;
			CSIDatatype csidt2 = (CSIDatatype)t2;
			return csidt1.getCode().equals(csidt2.getCode());
		}
		else if (t1 instanceof TypedArray){
			TypedArray ta1 = (TypedArray)t1;
			TypedArray ta2 = (TypedArray)t2;
			return typeEquals(ta1.getComponentType(), ta2.getComponentType());
		}
		else
			return false;
	}
	public static it.csi.mddtools.servicedef.ServiceDef inferServiceDef(Class interfClass, ServiceDef originalModel, EObject baseTypes){
		EList<Type> baseTypesFromResource=null;
		if (baseTypes != null){
			if (baseTypes instanceof it.csi.mddtools.servicedef.BaseTypes){
				baseTypesFromResource = ((it.csi.mddtools.servicedef.BaseTypes)baseTypes).getBaseTypes();
			}
			else if (baseTypes instanceof it.csi.mddtools.servicegen.BaseTypes){
				baseTypesFromResource = ((it.csi.mddtools.servicegen.BaseTypes)baseTypes).getBaseTypes();
			}
		}
		Hashtable userEntities= new Hashtable();
		Hashtable userExceptions= new Hashtable();
		Hashtable userArrays= new Hashtable();
		Map<Class, Type> basicTypesMap = new HashMap<Class, Type>();
		if (baseTypes != null)
			extractBasicTypesFromIncludedResource(baseTypesFromResource, basicTypesMap);
	
		ServiceDef sd = originalModel;
		if (sd.getCodProdotto()==null || sd.getCodComponente()==null || sd.getCodServizio()==null ||
		sd.getVersione()==null)
			throw new IllegalArgumentException("Il modello di partenza non contiene tutti i parametri iniziali necessari "+
					" (codProdotto, codServizio, codComponente, versione" );
		
		
		if (baseTypesFromResource==null)
			generateCSIBaseTypes(basicTypesMap);
		
		Types types = ServicedefFactory.eINSTANCE.createTypes();
		sd.setTypes(types);
		
		System.out.println("basic types map prima di infer op:"+basicTypesMap);
		Method [] methods = interfClass.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			Operation op = inferOperation(m, userEntities, userExceptions, userArrays, basicTypesMap);
			sd.getOperations().add(op);
		}
		
		if (baseTypesFromResource!=null)
			addAllTypes(types, userEntities, userArrays, userExceptions, null);
		else
			addAllTypes(types, userEntities, userArrays, userExceptions, basicTypesMap);
		System.out.println("inferredModel:"+sd);
		return sd;
	}
	
	public static it.csi.mddtools.servicedef.ServiceDef inferServiceDef(Class interfClass, String codProd, String codComp, String codServ, String ver){
		
		ServiceDef sd = ServicedefFactory.eINSTANCE.createServiceDef();
		sd.setCodProdotto(codProd);
		sd.setCodComponente(codComp);
		sd.setCodServizio(codServ);
		sd.setVersione(ver);
		return inferServiceDef(interfClass, sd, null);
	}
	
	private static void addAllTypes(Types types, Hashtable ent, Hashtable arr, Hashtable exc, Map basic){
		Enumeration e = ent.elements();
		while(e.hasMoreElements()){
			Type currT = (Type)e.nextElement();
			types.getTypes().add(currT);
		}
		e = arr.elements();
		while(e.hasMoreElements()){
			Type currT = (Type)e.nextElement();
			types.getTypes().add(currT);
		}
		e = exc.elements();
		while(e.hasMoreElements()){
			Type currT = (Type)e.nextElement();
			types.getTypes().add(currT);
		}
		if (basic!=null){
			Iterator it = basic.values().iterator();
			while(it.hasNext()){
				Type currT = (Type)it.next();
				types.getTypes().add(currT);
			}
		}
	}
	
	public static Type[] generateCSIBaseTypes(Map<Class, Type> basicTypesMap){
	    // tipi semplici
		//basicTypesMap = new Hashtable();
		CSIDatatype csiInteger = CodeGenerationUtils.createDT("CSIInteger", CSIDatatypeCodes.CSI_INTEGER, false);
		basicTypesMap.put(Integer.TYPE, csiInteger);
		CSIDatatype csiBoolean = CodeGenerationUtils.createDT("CSIBoolean", CSIDatatypeCodes.CSI_BOOLEAN, false);
		basicTypesMap.put(Boolean.TYPE, csiBoolean);
		CSIDatatype csiByte = CodeGenerationUtils.createDT("CSIByte", CSIDatatypeCodes.CSI_BYTE, false);
		basicTypesMap.put(Byte.TYPE, csiByte);
		CSIDatatype csiDate = CodeGenerationUtils.createDT("CSIDate", CSIDatatypeCodes.CSI_DATE, false);
		basicTypesMap.put(java.util.Date.class, csiDate);
		CSIDatatype csiDouble = CodeGenerationUtils.createDT("CSIDouble", CSIDatatypeCodes.CSI_DOUBLE, false);
		basicTypesMap.put(Double.TYPE, csiDouble);
		CSIDatatype csiFloat = CodeGenerationUtils.createDT("CSIFloat", CSIDatatypeCodes.CSI_FLOAT, false);
		basicTypesMap.put(Float.TYPE, csiFloat);
		CSIDatatype csiLong = CodeGenerationUtils.createDT("CSILong", CSIDatatypeCodes.CSI_LONG, false);
		basicTypesMap.put(Long.TYPE, csiLong);
		CSIDatatype csiString = CodeGenerationUtils.createDT("CSIString", CSIDatatypeCodes.CSI_STRING, false);
		basicTypesMap.put(String.class, csiString);
		// tipi wrapped (nillable)
		CSIDatatype csiWInteger = CodeGenerationUtils.createDT("CSIWrappedInteger", CSIDatatypeCodes.CSI_INTEGER, true);
		basicTypesMap.put(Integer.class, csiWInteger);
		CSIDatatype csiWBoolean = CodeGenerationUtils.createDT("CSIWrappedBoolean", CSIDatatypeCodes.CSI_BOOLEAN, true);
		basicTypesMap.put(Boolean.class, csiWBoolean);
		CSIDatatype csiWDouble = CodeGenerationUtils.createDT("CSIWrappedDouble", CSIDatatypeCodes.CSI_DOUBLE, true);
		basicTypesMap.put(Double.class, csiWDouble);
		CSIDatatype csiWFloat = CodeGenerationUtils.createDT("CSIWrappedFloat", CSIDatatypeCodes.CSI_FLOAT, true);
		basicTypesMap.put(Float.class, csiWFloat);
		CSIDatatype csiWLong = CodeGenerationUtils.createDT("CSIWrappedLong", CSIDatatypeCodes.CSI_LONG, true);
		basicTypesMap.put(Long.class, csiWLong);
		// array di tipi semplici
		TypedArray csiIntegerArray = CodeGenerationUtils.createTA("Array of CSIInteger", csiInteger);
		basicTypesMap.put(CodeGenerationUtils.getTypedArrayClass(Integer.TYPE), csiIntegerArray);
		TypedArray csiBooleanArray = CodeGenerationUtils.createTA("Array of CSIBoolean", csiBoolean);
		basicTypesMap.put(CodeGenerationUtils.getTypedArrayClass(Boolean.TYPE), csiBooleanArray);
		TypedArray csiByteArray = CodeGenerationUtils.createTA("Array of CSIByte", csiByte);
		basicTypesMap.put(CodeGenerationUtils.getTypedArrayClass(Byte.TYPE), csiByteArray);
		TypedArray csiDateArray = CodeGenerationUtils.createTA("Array of CSIDate", csiDate);
		basicTypesMap.put(CodeGenerationUtils.getTypedArrayClass(java.util.Date.class), csiDateArray);
		TypedArray csiDoubleArray = CodeGenerationUtils.createTA("Array of CSIDouble", csiDouble);
		basicTypesMap.put(CodeGenerationUtils.getTypedArrayClass(Double.TYPE), csiDoubleArray);
		TypedArray csiFloatArray = CodeGenerationUtils.createTA("Array of CSIFloat", csiFloat);
		basicTypesMap.put(CodeGenerationUtils.getTypedArrayClass(Float.TYPE), csiFloatArray);
		TypedArray csiLongArray = CodeGenerationUtils.createTA("Array of CSILong", csiLong);
		basicTypesMap.put(CodeGenerationUtils.getTypedArrayClass(Long.TYPE), csiLongArray);
		TypedArray csiStringArray = CodeGenerationUtils.createTA("Array of CSIString", csiString);
		basicTypesMap.put(CodeGenerationUtils.getTypedArrayClass(String.class), csiStringArray);
		// array di tipi wrapped
		TypedArray csiWIntegerArray = CodeGenerationUtils.createTA("Array of CSIWrappedInteger", csiWInteger);
		basicTypesMap.put(CodeGenerationUtils.getTypedArrayClass(Integer.class), csiWIntegerArray);
		TypedArray csiWBooleanArray = CodeGenerationUtils.createTA("Array of CSIWrappedBoolean", csiWBoolean);
		basicTypesMap.put(CodeGenerationUtils.getTypedArrayClass(Boolean.class), csiWBooleanArray);
		TypedArray csiWDoubleArray = CodeGenerationUtils.createTA("Array of CSIWrappedDouble", csiWDouble);
		basicTypesMap.put(CodeGenerationUtils.getTypedArrayClass(Double.class), csiWDoubleArray);
		TypedArray csiWFloatArray = CodeGenerationUtils.createTA("Array of CSIWrappedFloat", csiWFloat);
		basicTypesMap.put(CodeGenerationUtils.getTypedArrayClass(Float.class), csiWFloatArray);
		TypedArray csiWLongArray = CodeGenerationUtils.createTA("Array of CSIWrappedLong", csiWLong);
		basicTypesMap.put(CodeGenerationUtils.getTypedArrayClass(Long.class), csiWLongArray);
		
		Type [] types = new Type[]{
				csiInteger,csiBoolean,csiByte,csiDate,csiDouble,csiFloat,csiLong,csiString,
				csiWInteger,csiWBoolean,csiWDouble,csiWFloat,csiWLong,
				csiIntegerArray,csiBooleanArray,csiByteArray,csiDateArray,csiDoubleArray,csiFloatArray,csiLongArray,csiStringArray,
				csiWIntegerArray,csiWBooleanArray,csiWDoubleArray,csiWFloatArray,csiWLongArray
		};
		return types;
	}
	
}
