package it.csi.mddtools.servicegen.genutils;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeGenerationUtils {

	
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
}
