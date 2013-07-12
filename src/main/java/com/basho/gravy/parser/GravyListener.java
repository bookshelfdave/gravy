// Generated from ./src/main/java/com/basho/gravy/parser/Gravy.g4 by ANTLR 4.1
package com.basho.gravy.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GravyParser}.
 */
public interface GravyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GravyParser#crdt_command}.
	 * @param ctx the parse tree
	 */
	void enterCrdt_command(@NotNull GravyParser.Crdt_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GravyParser#crdt_command}.
	 * @param ctx the parse tree
	 */
	void exitCrdt_command(@NotNull GravyParser.Crdt_commandContext ctx);

	/**
	 * Enter a parse tree produced by {@link GravyParser#crdt_incdec_counter}.
	 * @param ctx the parse tree
	 */
	void enterCrdt_incdec_counter(@NotNull GravyParser.Crdt_incdec_counterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GravyParser#crdt_incdec_counter}.
	 * @param ctx the parse tree
	 */
	void exitCrdt_incdec_counter(@NotNull GravyParser.Crdt_incdec_counterContext ctx);

	/**
	 * Enter a parse tree produced by {@link GravyParser#crdt_type}.
	 * @param ctx the parse tree
	 */
	void enterCrdt_type(@NotNull GravyParser.Crdt_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GravyParser#crdt_type}.
	 * @param ctx the parse tree
	 */
	void exitCrdt_type(@NotNull GravyParser.Crdt_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GravyParser#crdt_type_with_scope}.
	 * @param ctx the parse tree
	 */
	void enterCrdt_type_with_scope(@NotNull GravyParser.Crdt_type_with_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GravyParser#crdt_type_with_scope}.
	 * @param ctx the parse tree
	 */
	void exitCrdt_type_with_scope(@NotNull GravyParser.Crdt_type_with_scopeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GravyParser#crdt_scope}.
	 * @param ctx the parse tree
	 */
	void enterCrdt_scope(@NotNull GravyParser.Crdt_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GravyParser#crdt_scope}.
	 * @param ctx the parse tree
	 */
	void exitCrdt_scope(@NotNull GravyParser.Crdt_scopeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GravyParser#crdt_add_type}.
	 * @param ctx the parse tree
	 */
	void enterCrdt_add_type(@NotNull GravyParser.Crdt_add_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GravyParser#crdt_add_type}.
	 * @param ctx the parse tree
	 */
	void exitCrdt_add_type(@NotNull GravyParser.Crdt_add_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link GravyParser#crdt_scope_command}.
	 * @param ctx the parse tree
	 */
	void enterCrdt_scope_command(@NotNull GravyParser.Crdt_scope_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GravyParser#crdt_scope_command}.
	 * @param ctx the parse tree
	 */
	void exitCrdt_scope_command(@NotNull GravyParser.Crdt_scope_commandContext ctx);

	/**
	 * Enter a parse tree produced by {@link GravyParser#crdt_initializer}.
	 * @param ctx the parse tree
	 */
	void enterCrdt_initializer(@NotNull GravyParser.Crdt_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GravyParser#crdt_initializer}.
	 * @param ctx the parse tree
	 */
	void exitCrdt_initializer(@NotNull GravyParser.Crdt_initializerContext ctx);
}