package org.topbraid.spin.system;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.topbraid.spin.model.Argument;
import org.topbraid.spin.model.Module;
import org.topbraid.spin.util.JenaUtil;

import org.apache.jena.query.QuerySolutionMap;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.RDFS;
import org.apache.jena.vocabulary.XSD;
import org.rspspin.util.ArgumentConstraintException;

/**
 * A singleton that is used by SPINARQFunction to check whether all supplied arguments
 * match the definition of the declared spl:Arguments.
 * 
 * By default the singleton is null (indicating a no-op), but implementors can install a
 * subclass of this to report warnings, throw exceptions or whatever they like.
 * 
 * Note that activating this will have a severe performance impact.
 */
public abstract class SPINArgumentChecker {

	private static SPINArgumentChecker singleton;
	
	public static SPINArgumentChecker get() {
		return singleton;
	}
	
	public static void set(SPINArgumentChecker value) {
		singleton = value;
	}

	public void check(Module module, QuerySolutionMap bindings) throws ArgumentConstraintException {
		List<String> errors = new LinkedList<String>();
		
		// Check for illegal bindings
		Iterator<String> varNameIter = bindings.varNames();
		Map<String, Argument> argMap = module.getArgumentsMap();
		while(varNameIter.hasNext()) {
			String varName = varNameIter.next();
			if(!argMap.containsKey(varName)){
				errors.add("Argument " + varName + " is not an accepted argument");
			}
		}
		
		
		for(Argument arg : module.getArguments(false)) {
			String varName = arg.getVarName();
			RDFNode value = bindings.get(varName);
			if(!arg.isOptional() && value == null) {
				errors.add("Missing required argument " + varName);
			}
			else if(value != null) {
				Resource valueType = arg.getValueType();
				if(valueType != null) {
					if(value.isResource()) {
						if(!RDFS.Resource.equals(valueType) && !JenaUtil.hasIndirectType((Resource)value, valueType.inModel(value.getModel()))) {
							StringBuffer sb = new StringBuffer("Resource ");
							sb.append(SPINLabels.get().getLabel((Resource)value));
							sb.append(" for argument ");
							sb.append(varName);
							sb.append(" must have type ");
							sb.append(SPINLabels.get().getLabel(valueType));
							errors.add(sb.toString());
						}
					}
					else if(!RDFS.Literal.equals(valueType)) {
						String datatypeURI = value.asLiteral().getDatatypeURI();
						if(value.asLiteral().getLanguage().length() > 0) {
							datatypeURI = XSD.xstring.getURI();
						}
						if(!valueType.getURI().equals(datatypeURI)) {
							StringBuffer sb = new StringBuffer("Literal ");
							sb.append(value.asLiteral().getLexicalForm());
							sb.append(" for argument ");
							sb.append(varName);
							sb.append(" must have datatype ");
							sb.append(SPINLabels.get().getLabel(valueType));
							errors.add(sb.toString());
						}
					}
				}
			}
		}
		if(!errors.isEmpty()) {
			handleErrors(module, bindings, errors);
		}
	}
	
	protected abstract void handleErrors(Module module, QuerySolutionMap bindings, List<String> errors) throws ArgumentConstraintException;
}
