package org.rspql.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.rspql.lang.rspql.ParserRSPQL;
import org.topbraid.spin.arq.ARQ2SPIN;
import org.topbraid.spin.arq.ARQFactory;
import org.topbraid.spin.system.SPINModuleRegistry;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class TestConstructSPIN {
	// Graph output tests
	@Test
	public void constructGraph1() {
		String q = ""
				+ "PREFIX : <http://example.org#>\n"
				+ "CONSTRUCT { ?a ?b ?c . "
				+ "   GRAPH :g { "
				+ "      ?foo :isa ?bar2 "
				+ "   } "
				+ "}\n"
				+ "FROM NAMED WINDOW :w ON ?stream [RANGE PT1s]\n"
				+ "WHERE {\n"
				+ "   WINDOW :w { ?foo :isa ?bar1 . }\n" 
				+ "}";
		validate(q, "Output graph queries (no variable) do not match.");
	}
	
	@Test
	public void constructGraph2() {
		String q = ""
				+ "PREFIX : <http://example.org#>\n"
				+ "CONSTRUCT {\n"
				+ "GRAPH ?bar1 {\n"
				+ "   ?foo :isa ?bar2 "
				+ "} "
				+ "}\n"
				+ "FROM NAMED WINDOW :w ON ?stream [RANGE PT1s]\n"
				+ "WHERE {\n"
				+ "   WINDOW :w { ?foo :isa ?bar1, ?bar2 . }\n" 
				+ "}";
		validate(q, "Output graph queries (no variable) do not match.");
	}
	
	
	// Physical windows tests
	@Test
	public void physicalWindow1() {
		String q = ""
				+ "PREFIX : <http://example.org#>\n"
				+ "CONSTRUCT { ?foo :isa ?bar }\n"
				+ "FROM NAMED WINDOW :w ON :s [ITEM 10]\n" 
				+ "WHERE {\n"
				+ "   WINDOW :w { GRAPH ?g { ?foo :isa ?bar } }\n" 
				+ "}";
		validate(q, "Physical window queries (without step) do not match.");
	}
	
	@Test
	public void physicalWindow2() {
		String q = ""
				+ "PREFIX : <http://example.org#>\n"
				+ "CONSTRUCT { ?foo :isa ?bar }\n"
				+ "FROM NAMED WINDOW :w ON :s [ITEM 10 STEP 1]\n" 
				+ "WHERE {\n"
				+ "   WINDOW :w { GRAPH ?g { ?foo :isa ?bar } }\n" 
				+ "}";
		validate(q, "Physical window queries (with step) do not match.");
	}
	
	@Test
	public void physicalWindow3() {
		String q = ""
				+ "PREFIX : <http://example.org#>\n"
				+ "CONSTRUCT { ?foo :isa ?bar }\n"
				+ "FROM NAMED WINDOW :w ON ?stream [ITEM ?item STEP ?step]\n" 
				+ "WHERE {\n"
				+ "   WINDOW :w { GRAPH ?g { ?foo :isa ?bar } }\n" 
				+ "}";
		validate(q, "Physical window queries (with variables) do not match.");
	}
	
	@Test
	public void physicalWindow4() {
		String q = ""
				+ "PREFIX : <http://example.org#>\n"
				+ "CONSTRUCT { ?foo :isa ?bar }\n"
				+ "FROM NAMED WINDOW :w ON ?stream [ALL]\n" // Possibly use empty range/step for S2S
				+ "WHERE {\n"
				+ "   WINDOW :w { GRAPH ?g { ?foo :isa ?bar } }\n" 
				+ "}";
		validate(q, "Physical window queries (with 'ALL') do not match.");
	}

	// Logical window tests
	@Test
	public void logicalWindow1() {
		String q = ""
				+ "PREFIX : <http://example.org#>\n"
				+ "CONSTRUCT { ?foo :isa ?bar }\n"
				+ "FROM NAMED WINDOW :w ON :s [RANGE PT1H]\n" 
				+ "WHERE {\n"
				+ "   WINDOW :w { GRAPH ?g { ?foo :isa ?bar } }\n" 
				+ "}";
		validate(q, "Logical window queries (without step) do not match.");
	}
	
	@Test
	public void locicalWindow2() {
		String q = ""
				+ "PREFIX : <http://example.org#>\n"
				+ "CONSTRUCT { ?foo :isa ?bar }\n"
				+ "FROM NAMED WINDOW :w ON :s [RANGE PT1H STEP PT1H]\n" 
				+ "WHERE {\n"
				+ "   WINDOW :w { GRAPH ?g { ?foo :isa ?bar } }\n" 
				+ "}";
		validate(q, "Logical window queries (with step) do not match.");
	}
	
	@Test
	public void logicalWindow3() {
		String q = ""
				+ "PREFIX : <http://example.org#>\n"
				+ "CONSTRUCT { ?foo :isa ?bar }\n"
				+ "FROM NAMED WINDOW :w ON ?stream [RANGE ?range STEP ?step]\n" 
				+ "WHERE {\n"
				+ "   WINDOW :w { GRAPH ?g { ?foo :isa ?bar } }\n" 
				+ "}";
		validate(q, "Logical window queries (with variables) do not match.");
	}
	
	@Test
	public void logicalWindow4() {
		String q = ""
				+ "PREFIX : <http://example.org#>\n"
				+ "CONSTRUCT { ?foo :isa ?bar }\n"
				+ "FROM NAMED WINDOW :w ON ?stream [NOW]\n" // Possibly replace with minimal available range
				+ "WHERE {\n"
				+ "   WINDOW :w { GRAPH ?g { ?foo :isa ?bar } }\n" 
				+ "}";
		validate(q, "Logical window queries (with 'NOW') do not match.");
	}
	
	@Test
	public void registerAs1(){
		String q = ""
				+ "PREFIX : <http://example.org#>\n"
				+ "REGISTER STREAM :s AS\n"
				+ "CONSTRUCT { ?a ?b ?c }\n"
				+ "FROM NAMED WINDOW :w ON :stream [RANGE PT1H]\n"
				+ "WHERE {\n"
				+ "   WINDOW :w { GRAPH ?g { ?a ?b ?c } }"
				+ "}";
		validate(q, "Register as queries (no variable) do not match");
	}
	
	@Test
	public void registerAs2(){
		String q = ""
				+ "PREFIX : <http://example.org#>\n"
				+ "REGISTER STREAM ?s AS\n"
				+ "CONSTRUCT { ?a ?b ?c }\n"
				+ "FROM NAMED WINDOW :w ON :stream [RANGE PT1H]\n"
				+ "WHERE {\n"
				+ "   WINDOW :w { GRAPH ?g {?a ?b ?c} }"
				+ "}";
		validate(q, "Register as queries (with variable) do not match");
	}
	
	@Test
	public void windowToStreamOp1(){
		String q = ""
				+ "PREFIX : <http://example.org#>\n"
				+ "REGISTER STREAM :s AS\n"
				+ "CONSTRUCT ISTREAM { ?a ?b ?c }\n"
				+ "FROM NAMED WINDOW :w ON :stream [RANGE PT1H]\n"
				+ "WHERE {\n"
				+ "   WINDOW :w { GRAPH ?g { ?a ?b ?c } }"
				+ "}";
		validate(q, "ISTREAM queries do not match");
	}
	
	@Test
	public void windowToStreamOp2(){
		String q = ""
				+ "PREFIX : <http://example.org#>\n"
				+ "REGISTER STREAM :s AS\n"
				+ "CONSTRUCT RSTREAM { ?a ?b ?c }\n"
				+ "FROM NAMED WINDOW :w ON :stream [RANGE PT1H]\n"
				+ "WHERE {\n"
				+ "   WINDOW :w { GRAPH ?g { ?a ?b ?c } }"
				+ "}";
		validate(q, "RSTREAM queries do not match");
	}

	@Test
	public void windowToStreamOp3(){
		String q = ""
				+ "PREFIX : <http://example.org#>\n"
				+ "REGISTER STREAM :s AS\n"
				+ "CONSTRUCT DSTREAM { ?a ?b ?c }\n"
				+ "FROM NAMED WINDOW :w ON :stream [RANGE PT1H]\n"
				+ "WHERE {\n"
				+ "   WINDOW :w { GRAPH ?g { ?a ?b ?c } }"
				+ "}";
		validate(q, "DSTREAM queries do not match");
	}
	
	private void validate(String q, String message) {
		// Register the parser
		ParserRSPQL.register();
		Query query = QueryFactory.create(q, ParserRSPQL.rspqlSyntax);
		
		// Parse to SPIN
		SPINModuleRegistry.get().init();
		Model model = ModelFactory.createDefaultModel();
		ARQ2SPIN arq2SPIN = new ARQ2SPIN(model);
		org.topbraid.spin.model.Query spinQuery = arq2SPIN.createQuery(query, null);
		// Parse ARQ from SPIN
		ARQFactory.get().setSyntax(ParserRSPQL.rspqlSyntax);
		Query reparsedQuery = ARQFactory.get().createQuery(spinQuery);
		reparsedQuery.setPrefixMapping(query.getPrefixMapping());
		assertEquals(message, query.toString(), reparsedQuery.toString());

	}

}