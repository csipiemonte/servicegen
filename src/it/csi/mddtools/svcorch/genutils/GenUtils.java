package it.csi.mddtools.svcorch.genutils;

import it.csi.mddtools.servicedef.Operation;
import it.csi.mddtools.svcorch.Node;
import it.csi.mddtools.svcorch.Orchestration;
import it.csi.mddtools.svcorch.SrvCall;

import java.util.ArrayList;
import java.util.Iterator;

public class GenUtils {

	public static ArrayList<it.csi.mddtools.typedef.Exception> getAllPossibleSourceExceptions(
			Orchestration orch) {
		ArrayList<it.csi.mddtools.typedef.Exception> result = new ArrayList<it.csi.mddtools.typedef.Exception>();
		if (orch.getNodes()!=null){
			Iterator<Node> node_it = orch.getNodes().getNodes().iterator();
			while(node_it.hasNext()){
				Node currNode = node_it.next();
				if (currNode instanceof SrvCall){
					Operation op = ((SrvCall)currNode).getOperation();
					if (op!=null){
						result.addAll(op.getThrows());
					}
				}
			}
		}
		return result;
	}

	
}
