package it.csi.mddtools.servicegen.genutils;


import java.util.Iterator;
import java.util.List;

import it.csi.mddtools.servicedef.ANDValueConstraint;
import it.csi.mddtools.servicedef.CustomConstraint;
import it.csi.mddtools.servicedef.ORValueConstraint;
import it.csi.mddtools.servicedef.InputValidator;
import it.csi.mddtools.servicedef.NOTValueConstraint;
import it.csi.mddtools.servicedef.ParamValidator;
import it.csi.mddtools.servicedef.SimpleValueConstraint;
import it.csi.mddtools.servicedef.ValueConstraint;
import it.csi.mddtools.servicedef.ValueValorizationConstraint;
import it.csi.mddtools.servicedef.ContinuousRangeConstraint;
import it.csi.mddtools.servicedef.DiscreteRangeConstraint;

// classi di utilità utilizzate nell'editor custom
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
	
}
