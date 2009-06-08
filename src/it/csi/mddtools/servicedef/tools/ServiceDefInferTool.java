package it.csi.mddtools.servicedef.tools;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

import it.csi.mddtools.servicedef.OpTypeEnum;
import it.csi.mddtools.servicedef.Operation;
import it.csi.mddtools.servicedef.Param;
import it.csi.mddtools.servicedef.ServiceDef;
import it.csi.mddtools.servicedef.ServicedefFactory;
import it.csi.mddtools.servicedef.ServicedefPackage;
import it.csi.mddtools.servicedef.TXTypeEnum;
import it.csi.mddtools.servicedef.Types;
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
	
	public static it.csi.mddtools.servicedef.ServiceDef inferServiceDef(Class interfClass, String codProd, String codComp, String codServ, String ver){
		Hashtable userEntities= new Hashtable();
		Hashtable userExceptions= new Hashtable();
		Hashtable userArrays= new Hashtable();
		Map basicTypesMap = new HashMap();
		
		ServiceDef sd = ServicedefFactory.eINSTANCE.createServiceDef();
		sd.setCodProdotto(codProd);
		sd.setCodComponente(codComp);
		sd.setCodServizio(codServ);
		sd.setVersione(ver);
		Method [] methods = interfClass.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			Operation op = inferOperation(m, userEntities, userExceptions, userArrays, basicTypesMap);
			sd.getOperations().add(op);
		}
		// alla fine inserisce tutti i tipi (basic e user defined)
		// TODO gli user defined devono essere inclusi e non creati?
		 
		return sd;
	}
}
