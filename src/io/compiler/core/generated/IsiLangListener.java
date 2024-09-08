// Generated from C:/Users/gusta/dev/compildores-2024-2-ufabc/src/IsiLang.g4 by ANTLR 4.13.1
package io.compiler.core.generated;

    import io.compiler.core.ast.*;
    import io.compiler.core.ast.literals.*;
    import io.compiler.core.ast.statements.*;
    import io.compiler.core.operators.*;
    import io.compiler.core.exceptions.*;
    import io.compiler.core.warnings.*;
    import io.compiler.types.*;
    import java.util.Stack;
    import java.util.ArrayList;
    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IsiLangParser}.
 */
public interface IsiLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(IsiLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(IsiLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(IsiLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(IsiLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(IsiLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(IsiLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(IsiLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(IsiLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttribution(IsiLangParser.AttributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttribution(IsiLangParser.AttributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(IsiLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(IsiLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(IsiLangParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(IsiLangParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(IsiLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(IsiLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(IsiLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(IsiLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#logical_or}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or(IsiLangParser.Logical_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#logical_or}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or(IsiLangParser.Logical_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#logical_orl}.
	 * @param ctx the parse tree
	 */
	void enterLogical_orl(IsiLangParser.Logical_orlContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#logical_orl}.
	 * @param ctx the parse tree
	 */
	void exitLogical_orl(IsiLangParser.Logical_orlContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#logical_and}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and(IsiLangParser.Logical_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#logical_and}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and(IsiLangParser.Logical_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#logical_andl}.
	 * @param ctx the parse tree
	 */
	void enterLogical_andl(IsiLangParser.Logical_andlContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#logical_andl}.
	 * @param ctx the parse tree
	 */
	void exitLogical_andl(IsiLangParser.Logical_andlContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(IsiLangParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(IsiLangParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#equalityl}.
	 * @param ctx the parse tree
	 */
	void enterEqualityl(IsiLangParser.EqualitylContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#equalityl}.
	 * @param ctx the parse tree
	 */
	void exitEqualityl(IsiLangParser.EqualitylContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(IsiLangParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(IsiLangParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#comparisonl}.
	 * @param ctx the parse tree
	 */
	void enterComparisonl(IsiLangParser.ComparisonlContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#comparisonl}.
	 * @param ctx the parse tree
	 */
	void exitComparisonl(IsiLangParser.ComparisonlContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(IsiLangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(IsiLangParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#terml}.
	 * @param ctx the parse tree
	 */
	void enterTerml(IsiLangParser.TermlContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#terml}.
	 * @param ctx the parse tree
	 */
	void exitTerml(IsiLangParser.TermlContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(IsiLangParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(IsiLangParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#factorl}.
	 * @param ctx the parse tree
	 */
	void enterFactorl(IsiLangParser.FactorlContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#factorl}.
	 * @param ctx the parse tree
	 */
	void exitFactorl(IsiLangParser.FactorlContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(IsiLangParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(IsiLangParser.UnaryContext ctx);
}