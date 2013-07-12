// Generated from ./src/main/java/com/basho/gravy/parser/Gravy.g4 by ANTLR 4.0
package com.basho.gravy.parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GravyListener extends ParseTreeListener {
	void enterCrdt_command(GravyParser.Crdt_commandContext ctx);
	void exitCrdt_command(GravyParser.Crdt_commandContext ctx);

	void enterCrdt_incdec_counter(GravyParser.Crdt_incdec_counterContext ctx);
	void exitCrdt_incdec_counter(GravyParser.Crdt_incdec_counterContext ctx);

	void enterCrdt_type(GravyParser.Crdt_typeContext ctx);
	void exitCrdt_type(GravyParser.Crdt_typeContext ctx);

	void enterCrdt_scope(GravyParser.Crdt_scopeContext ctx);
	void exitCrdt_scope(GravyParser.Crdt_scopeContext ctx);

	void enterCrdt_add_type(GravyParser.Crdt_add_typeContext ctx);
	void exitCrdt_add_type(GravyParser.Crdt_add_typeContext ctx);

	void enterCrdt_scope_command(GravyParser.Crdt_scope_commandContext ctx);
	void exitCrdt_scope_command(GravyParser.Crdt_scope_commandContext ctx);

	void enterCrdt_initializer(GravyParser.Crdt_initializerContext ctx);
	void exitCrdt_initializer(GravyParser.Crdt_initializerContext ctx);
}