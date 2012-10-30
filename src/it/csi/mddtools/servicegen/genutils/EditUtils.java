package it.csi.mddtools.servicegen.genutils;


import java.util.Iterator;
import java.util.List;

import it.csi.mddtools.servicedef.ANDValueConstraint;
import it.csi.mddtools.servicedef.CustomConstraint;
import it.csi.mddtools.servicedef.ORValueConstraint;
import it.csi.mddtools.servicedef.InputValidator;
import it.csi.mddtools.servicedef.NOTValueConstraint;
import it.csi.mddtools.servicedef.Operation;
import it.csi.mddtools.servicedef.Param;
import it.csi.mddtools.servicedef.ParamValidator;
import it.csi.mddtools.servicedef.ServiceDef;
import it.csi.mddtools.servicedef.SimpleValueConstraint;
import it.csi.mddtools.servicedef.Types;
import it.csi.mddtools.servicedef.ValueConstraint;
import it.csi.mddtools.servicedef.ValueValorizationConstraint;
import it.csi.mddtools.servicedef.ContinuousRangeConstraint;
import it.csi.mddtools.servicedef.DiscreteRangeConstraint;
import it.csi.mddtools.typedef.CSIDatatype;
import it.csi.mddtools.typedef.Entity;
import it.csi.mddtools.typedef.Exception;
import it.csi.mddtools.typedef.PrimitiveType;
import it.csi.mddtools.typedef.Type;
import it.csi.mddtools.typedef.TypedArray;

// classi di utilit� utilizzate nell'editor custom
public class EditUtils {
	
	public static String formatConstraint(ValueConstraint iv){
		return "???"+iv;
	}
	
	public static String formatConstraint(ParamValidator pv){
		return "value "+formatConstraint(pv.getConstraint());
	}
	
//	public static String formatConstraint(InputValidator iv){
//		return "value "+formatConstraint(iv.getConstraint());
//	}
	
	public static String formatConstraint(ValueValorizationConstraint vc){
		return (vc.isMustNotBeNull()? " is NOT NULL ": " is NULL ");
	}
	
	public static String formatConstraint(DiscreteRangeConstraint vc){
		String  s= "is in {";
		List<String> points = vc.getLiterals();
		int i=0;
		for (Iterator iterator = points.iterator(); iterator.hasNext();) {
			String pt = (String) iterator.next();
			if (i<points.size()-2)
				s+=pt+", ";
			i++;
		}
		s+="}";
		return s;
	}
	
	public static String formatConstraint(CustomConstraint vc){
		String s = ""+vc.getCheckMethodName()+"()";
		return s;
	}
	
	public static String formatConstraint(ContinuousRangeConstraint vc){
		return (" is in ["+vc.getLowerbound()+"-"+vc.getUpperbound()+"]");
	}
	
	public static String formatConstraint(ANDValueConstraint ctr){
		StringBuffer s = new StringBuffer("(");
		s.append(formatConstrComponents(ctr.getComponent(), "AND"));
		s.append(")");
		return s.toString();
	}
	
	public static String formatConstraint(ORValueConstraint ctr){
		StringBuffer s = new StringBuffer("(");
		s.append(formatConstrComponents(ctr.getComponent(), "OR"));
		s.append(")");
		return s.toString();
	}

	public static String formatConstraint(NOTValueConstraint ctr){
		return "NOT " + formatConstraint(ctr.getComponent().get(0));
	}
	
	/**
	 * 
	 * @param cntrs
	 * @param sep server per inserire AND OR tra i componenti
	 * @return
	 */
	protected static String formatConstrComponents (List<ValueConstraint> cntrs, String sep){
		if (cntrs.isEmpty())
			return "???";
		else{
			StringBuffer s = new StringBuffer("");
			Iterator<ValueConstraint> it = cntrs.iterator();
			while (it.hasNext()) {
				ValueConstraint currCtr = (ValueConstraint) it.next();
				s.append(formatConstraint(currCtr));
				s.append(" ");
				s.append(sep);
			}
			return s.toString();
		}
	}
	
	
	public static ServiceDef getOwnerSD(Type t){
		if (t instanceof CSIDatatype)
			return null;
		else {
			// type->Types->Servicedef
			if (t.eContainer() instanceof Types){
				if(t.eContainer().eContainer() instanceof ServiceDef)
					return (ServiceDef)(t.eContainer().eContainer());
				else
					return null;
			}
			else
				return null;
		}
	}
	
	public static String formatTypeLabel(Type t){
		if (t instanceof PrimitiveType)
			return formatTypeLabel((PrimitiveType)t);
		else if (t instanceof CSIDatatype)
			return formatTypeLabel((CSIDatatype)t);
		else if(t instanceof Entity)
			return formatTypeLabel((Entity)t);
		else if(t instanceof Exception)
			return formatTypeLabel((Exception)t);
		else if(t instanceof TypedArray)
			return formatTypeLabel((TypedArray)t);
		else
			throw new IllegalArgumentException("tipo non gestito");
	}
	
	public static String formatTypeLabel(CSIDatatype t){
		return (t.isNillable()?"Wrapped":"")+t.getCode().getLiteral();
	}
	
	public static String formatTypeLabel(PrimitiveType t){
		return ""+t.getTypesetName()+":"+t.getName();
	}
	
	public static String formatTypeLabel(Entity t){
		ServiceDef owner = getOwnerSD(t);
		return (owner!=null? owner.getCodServizio()+"::"+t.getName() : "??::"+t.getName());
	}
	
	public static String formatTypeLabel(it.csi.mddtools.typedef.Exception t){
		if (t==null)
			return "";
		ServiceDef owner = getOwnerSD(t);
		return (owner!=null? owner.getCodServizio()+"::"+t.getName() : "??::"+t.getName());
	}
	
	public static String formatTypeLabel(TypedArray t) {
		if (t.getComponentType() != null) {
			if (t.getComponentType() instanceof CSIDatatype) {
				return t.getComponentType().getName() + "[]";
			} else {
				ServiceDef owner = getOwnerSD(t);
				return (owner != null ? owner.getCodServizio() + "::"
						+ t.getComponentType().getName() + "[]" : "??::"
						+ t.getComponentType().getName() + "[]");
			}
		}
		else
			return "<???>[]";
	}
	
	public static String formatParamList(Operation op){
		String s = " (";
		Iterator<Param> p_it = op.getParams().iterator();
		int i=0;
		while(p_it.hasNext()){
			s+=p_it.next().getName();
			if (i!=op.getParams().size()-1)
				s+=", ";
			i++;
		}
		s+=")";
		return s;
	}
	
	public static String formatExceptionList(List<Exception> types){
		Iterator<Exception> it_t = types.iterator();
		String s = "";
		int i=0;
		while(it_t.hasNext()){
			Type currT = it_t.next();
			s+=formatTypeLabel(currT);
			if (i!=types.size()-1)
				s+=", ";
			i++;
		}
		return s;
	}
}
