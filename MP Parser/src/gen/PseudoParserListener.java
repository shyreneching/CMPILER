package gen;// Generated from C:/Users/ShyreneChing/Desktop/DLSU/AY 2020-2021 Term 1/CMPILER/MP/MC01/MP Parser/MP Parser/src\PseudoParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PseudoParser}.
 */
public interface PseudoParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PseudoParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(PseudoParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(PseudoParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(PseudoParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(PseudoParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#idExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(PseudoParser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#idExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(PseudoParser.IdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#unqualifiedId}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedId(PseudoParser.UnqualifiedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#unqualifiedId}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedId(PseudoParser.UnqualifiedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#qualifiedId}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedId(PseudoParser.QualifiedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#qualifiedId}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedId(PseudoParser.QualifiedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterNestedNameSpecifier(PseudoParser.NestedNameSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitNestedNameSpecifier(PseudoParser.NestedNameSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(PseudoParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(PseudoParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#lambdaIntroducer}.
	 * @param ctx the parse tree
	 */
	void enterLambdaIntroducer(PseudoParser.LambdaIntroducerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#lambdaIntroducer}.
	 * @param ctx the parse tree
	 */
	void exitLambdaIntroducer(PseudoParser.LambdaIntroducerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#lambdaCapture}.
	 * @param ctx the parse tree
	 */
	void enterLambdaCapture(PseudoParser.LambdaCaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#lambdaCapture}.
	 * @param ctx the parse tree
	 */
	void exitLambdaCapture(PseudoParser.LambdaCaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#captureDefault}.
	 * @param ctx the parse tree
	 */
	void enterCaptureDefault(PseudoParser.CaptureDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#captureDefault}.
	 * @param ctx the parse tree
	 */
	void exitCaptureDefault(PseudoParser.CaptureDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#captureList}.
	 * @param ctx the parse tree
	 */
	void enterCaptureList(PseudoParser.CaptureListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#captureList}.
	 * @param ctx the parse tree
	 */
	void exitCaptureList(PseudoParser.CaptureListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(PseudoParser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(PseudoParser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#simpleCapture}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCapture(PseudoParser.SimpleCaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#simpleCapture}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCapture(PseudoParser.SimpleCaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#initcapture}.
	 * @param ctx the parse tree
	 */
	void enterInitcapture(PseudoParser.InitcaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#initcapture}.
	 * @param ctx the parse tree
	 */
	void exitInitcapture(PseudoParser.InitcaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#lambdaDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterLambdaDeclarator(PseudoParser.LambdaDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#lambdaDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitLambdaDeclarator(PseudoParser.LambdaDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(PseudoParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(PseudoParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdOfTheTypeId(PseudoParser.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdOfTheTypeId(PseudoParser.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(PseudoParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(PseudoParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 */
	void enterPseudoDestructorName(PseudoParser.PseudoDestructorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 */
	void exitPseudoDestructorName(PseudoParser.PseudoDestructorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(PseudoParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(PseudoParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(PseudoParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(PseudoParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(PseudoParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(PseudoParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#newPlacement}.
	 * @param ctx the parse tree
	 */
	void enterNewPlacement(PseudoParser.NewPlacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#newPlacement}.
	 * @param ctx the parse tree
	 */
	void exitNewPlacement(PseudoParser.NewPlacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#newTypeId}.
	 * @param ctx the parse tree
	 */
	void enterNewTypeId(PseudoParser.NewTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#newTypeId}.
	 * @param ctx the parse tree
	 */
	void exitNewTypeId(PseudoParser.NewTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewDeclarator(PseudoParser.NewDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewDeclarator(PseudoParser.NewDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerNewDeclarator(PseudoParser.NoPointerNewDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerNewDeclarator(PseudoParser.NoPointerNewDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#newInitializer}.
	 * @param ctx the parse tree
	 */
	void enterNewInitializer(PseudoParser.NewInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#newInitializer}.
	 * @param ctx the parse tree
	 */
	void exitNewInitializer(PseudoParser.NewInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#deleteExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(PseudoParser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#deleteExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(PseudoParser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#noExceptExpression}.
	 * @param ctx the parse tree
	 */
	void enterNoExceptExpression(PseudoParser.NoExceptExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#noExceptExpression}.
	 * @param ctx the parse tree
	 */
	void exitNoExceptExpression(PseudoParser.NoExceptExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(PseudoParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(PseudoParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#pointerMemberExpression}.
	 * @param ctx the parse tree
	 */
	void enterPointerMemberExpression(PseudoParser.PointerMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#pointerMemberExpression}.
	 * @param ctx the parse tree
	 */
	void exitPointerMemberExpression(PseudoParser.PointerMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(PseudoParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(PseudoParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(PseudoParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(PseudoParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(PseudoParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(PseudoParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftOperator(PseudoParser.ShiftOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftOperator(PseudoParser.ShiftOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(PseudoParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(PseudoParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(PseudoParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(PseudoParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(PseudoParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(PseudoParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(PseudoParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(PseudoParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(PseudoParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(PseudoParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(PseudoParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(PseudoParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(PseudoParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(PseudoParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(PseudoParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(PseudoParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(PseudoParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(PseudoParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(PseudoParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(PseudoParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PseudoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PseudoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(PseudoParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(PseudoParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PseudoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PseudoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(PseudoParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(PseudoParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(PseudoParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(PseudoParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PseudoParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PseudoParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void enterStatementSeq(PseudoParser.StatementSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void exitStatementSeq(PseudoParser.StatementSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(PseudoParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(PseudoParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PseudoParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PseudoParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(PseudoParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(PseudoParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInitStatement(PseudoParser.ForInitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInitStatement(PseudoParser.ForInitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForRangeDeclaration(PseudoParser.ForRangeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForRangeDeclaration(PseudoParser.ForRangeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#forRangeInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForRangeInitializer(PseudoParser.ForRangeInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#forRangeInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForRangeInitializer(PseudoParser.ForRangeInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(PseudoParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(PseudoParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(PseudoParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(PseudoParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationseq(PseudoParser.DeclarationseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationseq(PseudoParser.DeclarationseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PseudoParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PseudoParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBlockDeclaration(PseudoParser.BlockDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBlockDeclaration(PseudoParser.BlockDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAliasDeclaration(PseudoParser.AliasDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAliasDeclaration(PseudoParser.AliasDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDeclaration(PseudoParser.SimpleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDeclaration(PseudoParser.SimpleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(PseudoParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(PseudoParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#emptyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptyDeclaration(PseudoParser.EmptyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#emptyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptyDeclaration(PseudoParser.EmptyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDeclaration(PseudoParser.AttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDeclaration(PseudoParser.AttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#declSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecifier(PseudoParser.DeclSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#declSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecifier(PseudoParser.DeclSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecifierSeq(PseudoParser.DeclSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecifierSeq(PseudoParser.DeclSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(PseudoParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(PseudoParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(PseudoParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(PseudoParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(PseudoParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(PseudoParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(PseudoParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(PseudoParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTrailingTypeSpecifier(PseudoParser.TrailingTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTrailingTypeSpecifier(PseudoParser.TrailingTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifierSeq(PseudoParser.TypeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifierSeq(PseudoParser.TypeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterTrailingTypeSpecifierSeq(PseudoParser.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitTrailingTypeSpecifierSeq(PseudoParser.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeSpecifier(PseudoParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeSpecifier(PseudoParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#theTypeName}.
	 * @param ctx the parse tree
	 */
	void enterTheTypeName(PseudoParser.TheTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#theTypeName}.
	 * @param ctx the parse tree
	 */
	void exitTheTypeName(PseudoParser.TheTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#decltypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDecltypeSpecifier(PseudoParser.DecltypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#decltypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDecltypeSpecifier(PseudoParser.DecltypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterElaboratedTypeSpecifier(PseudoParser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitElaboratedTypeSpecifier(PseudoParser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(PseudoParser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(PseudoParser.EnumNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(PseudoParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(PseudoParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#enumHead}.
	 * @param ctx the parse tree
	 */
	void enterEnumHead(PseudoParser.EnumHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#enumHead}.
	 * @param ctx the parse tree
	 */
	void exitEnumHead(PseudoParser.EnumHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOpaqueEnumDeclaration(PseudoParser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOpaqueEnumDeclaration(PseudoParser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#enumkey}.
	 * @param ctx the parse tree
	 */
	void enterEnumkey(PseudoParser.EnumkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#enumkey}.
	 * @param ctx the parse tree
	 */
	void exitEnumkey(PseudoParser.EnumkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#enumbase}.
	 * @param ctx the parse tree
	 */
	void enterEnumbase(PseudoParser.EnumbaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#enumbase}.
	 * @param ctx the parse tree
	 */
	void exitEnumbase(PseudoParser.EnumbaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(PseudoParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(PseudoParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorDefinition(PseudoParser.EnumeratorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorDefinition(PseudoParser.EnumeratorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(PseudoParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(PseudoParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#namespaceName}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceName(PseudoParser.NamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#namespaceName}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceName(PseudoParser.NamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#originalNamespaceName}.
	 * @param ctx the parse tree
	 */
	void enterOriginalNamespaceName(PseudoParser.OriginalNamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#originalNamespaceName}.
	 * @param ctx the parse tree
	 */
	void exitOriginalNamespaceName(PseudoParser.OriginalNamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDefinition(PseudoParser.NamespaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDefinition(PseudoParser.NamespaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#namespaceAlias}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceAlias(PseudoParser.NamespaceAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#namespaceAlias}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceAlias(PseudoParser.NamespaceAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceAliasDefinition(PseudoParser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceAliasDefinition(PseudoParser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiednamespacespecifier(PseudoParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiednamespacespecifier(PseudoParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingDeclaration(PseudoParser.UsingDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingDeclaration(PseudoParser.UsingDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#usingDirective}.
	 * @param ctx the parse tree
	 */
	void enterUsingDirective(PseudoParser.UsingDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#usingDirective}.
	 * @param ctx the parse tree
	 */
	void exitUsingDirective(PseudoParser.UsingDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#asmDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAsmDefinition(PseudoParser.AsmDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#asmDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAsmDefinition(PseudoParser.AsmDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#linkageSpecification}.
	 * @param ctx the parse tree
	 */
	void enterLinkageSpecification(PseudoParser.LinkageSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#linkageSpecification}.
	 * @param ctx the parse tree
	 */
	void exitLinkageSpecification(PseudoParser.LinkageSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifierSeq(PseudoParser.AttributeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifierSeq(PseudoParser.AttributeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifier(PseudoParser.AttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifier(PseudoParser.AttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentspecifier(PseudoParser.AlignmentspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentspecifier(PseudoParser.AlignmentspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(PseudoParser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(PseudoParser.AttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(PseudoParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(PseudoParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#attributeNamespace}.
	 * @param ctx the parse tree
	 */
	void enterAttributeNamespace(PseudoParser.AttributeNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#attributeNamespace}.
	 * @param ctx the parse tree
	 */
	void exitAttributeNamespace(PseudoParser.AttributeNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeArgumentClause(PseudoParser.AttributeArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeArgumentClause(PseudoParser.AttributeArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#balancedTokenSeq}.
	 * @param ctx the parse tree
	 */
	void enterBalancedTokenSeq(PseudoParser.BalancedTokenSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#balancedTokenSeq}.
	 * @param ctx the parse tree
	 */
	void exitBalancedTokenSeq(PseudoParser.BalancedTokenSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtoken(PseudoParser.BalancedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtoken(PseudoParser.BalancedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(PseudoParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(PseudoParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(PseudoParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(PseudoParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(PseudoParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(PseudoParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#pointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPointerDeclarator(PseudoParser.PointerDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#pointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPointerDeclarator(PseudoParser.PointerDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#noPointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerDeclarator(PseudoParser.NoPointerDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#noPointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerDeclarator(PseudoParser.NoPointerDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParametersAndQualifiers(PseudoParser.ParametersAndQualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParametersAndQualifiers(PseudoParser.ParametersAndQualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#trailingReturnType}.
	 * @param ctx the parse tree
	 */
	void enterTrailingReturnType(PseudoParser.TrailingReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#trailingReturnType}.
	 * @param ctx the parse tree
	 */
	void exitTrailingReturnType(PseudoParser.TrailingReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#pointerOperator}.
	 * @param ctx the parse tree
	 */
	void enterPointerOperator(PseudoParser.PointerOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#pointerOperator}.
	 * @param ctx the parse tree
	 */
	void exitPointerOperator(PseudoParser.PointerOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifierseq(PseudoParser.CvqualifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifierseq(PseudoParser.CvqualifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#cvQualifier}.
	 * @param ctx the parse tree
	 */
	void enterCvQualifier(PseudoParser.CvQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#cvQualifier}.
	 * @param ctx the parse tree
	 */
	void exitCvQualifier(PseudoParser.CvQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void enterRefqualifier(PseudoParser.RefqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void exitRefqualifier(PseudoParser.RefqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorid(PseudoParser.DeclaratoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorid(PseudoParser.DeclaratoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#theTypeId}.
	 * @param ctx the parse tree
	 */
	void enterTheTypeId(PseudoParser.TheTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#theTypeId}.
	 * @param ctx the parse tree
	 */
	void exitTheTypeId(PseudoParser.TheTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(PseudoParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(PseudoParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPointerAbstractDeclarator(PseudoParser.PointerAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPointerAbstractDeclarator(PseudoParser.PointerAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerAbstractDeclarator(PseudoParser.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerAbstractDeclarator(PseudoParser.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractPackDeclarator(PseudoParser.AbstractPackDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractPackDeclarator(PseudoParser.AbstractPackDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerAbstractPackDeclarator(PseudoParser.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerAbstractPackDeclarator(PseudoParser.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationClause(PseudoParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationClause(PseudoParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationList(PseudoParser.ParameterDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationList(PseudoParser.ParameterDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(PseudoParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(PseudoParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(PseudoParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(PseudoParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(PseudoParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(PseudoParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(PseudoParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(PseudoParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 */
	void enterBraceOrEqualInitializer(PseudoParser.BraceOrEqualInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 */
	void exitBraceOrEqualInitializer(PseudoParser.BraceOrEqualInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#initializerClause}.
	 * @param ctx the parse tree
	 */
	void enterInitializerClause(PseudoParser.InitializerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#initializerClause}.
	 * @param ctx the parse tree
	 */
	void exitInitializerClause(PseudoParser.InitializerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(PseudoParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(PseudoParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void enterBracedInitList(PseudoParser.BracedInitListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void exitBracedInitList(PseudoParser.BracedInitListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(PseudoParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(PseudoParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#classSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassSpecifier(PseudoParser.ClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#classSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassSpecifier(PseudoParser.ClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#classHead}.
	 * @param ctx the parse tree
	 */
	void enterClassHead(PseudoParser.ClassHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#classHead}.
	 * @param ctx the parse tree
	 */
	void exitClassHead(PseudoParser.ClassHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#classHeadName}.
	 * @param ctx the parse tree
	 */
	void enterClassHeadName(PseudoParser.ClassHeadNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#classHeadName}.
	 * @param ctx the parse tree
	 */
	void exitClassHeadName(PseudoParser.ClassHeadNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#classVirtSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassVirtSpecifier(PseudoParser.ClassVirtSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#classVirtSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassVirtSpecifier(PseudoParser.ClassVirtSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#classKey}.
	 * @param ctx the parse tree
	 */
	void enterClassKey(PseudoParser.ClassKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#classKey}.
	 * @param ctx the parse tree
	 */
	void exitClassKey(PseudoParser.ClassKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#memberSpecification}.
	 * @param ctx the parse tree
	 */
	void enterMemberSpecification(PseudoParser.MemberSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#memberSpecification}.
	 * @param ctx the parse tree
	 */
	void exitMemberSpecification(PseudoParser.MemberSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaration(PseudoParser.MemberdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaration(PseudoParser.MemberdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaratorList(PseudoParser.MemberDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaratorList(PseudoParser.MemberDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#memberDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclarator(PseudoParser.MemberDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#memberDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclarator(PseudoParser.MemberDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#virtualSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterVirtualSpecifierSeq(PseudoParser.VirtualSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#virtualSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitVirtualSpecifierSeq(PseudoParser.VirtualSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#virtualSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterVirtualSpecifier(PseudoParser.VirtualSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#virtualSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitVirtualSpecifier(PseudoParser.VirtualSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#pureSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterPureSpecifier(PseudoParser.PureSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#pureSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitPureSpecifier(PseudoParser.PureSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#baseClause}.
	 * @param ctx the parse tree
	 */
	void enterBaseClause(PseudoParser.BaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#baseClause}.
	 * @param ctx the parse tree
	 */
	void exitBaseClause(PseudoParser.BaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#baseSpecifierList}.
	 * @param ctx the parse tree
	 */
	void enterBaseSpecifierList(PseudoParser.BaseSpecifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#baseSpecifierList}.
	 * @param ctx the parse tree
	 */
	void exitBaseSpecifierList(PseudoParser.BaseSpecifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#baseSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseSpecifier(PseudoParser.BaseSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#baseSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseSpecifier(PseudoParser.BaseSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#classOrDeclType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrDeclType(PseudoParser.ClassOrDeclTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#classOrDeclType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrDeclType(PseudoParser.ClassOrDeclTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseTypeSpecifier(PseudoParser.BaseTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseTypeSpecifier(PseudoParser.BaseTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#accessSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessSpecifier(PseudoParser.AccessSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#accessSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessSpecifier(PseudoParser.AccessSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#conversionFunctionId}.
	 * @param ctx the parse tree
	 */
	void enterConversionFunctionId(PseudoParser.ConversionFunctionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#conversionFunctionId}.
	 * @param ctx the parse tree
	 */
	void exitConversionFunctionId(PseudoParser.ConversionFunctionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#conversionTypeId}.
	 * @param ctx the parse tree
	 */
	void enterConversionTypeId(PseudoParser.ConversionTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#conversionTypeId}.
	 * @param ctx the parse tree
	 */
	void exitConversionTypeId(PseudoParser.ConversionTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#conversionDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConversionDeclarator(PseudoParser.ConversionDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#conversionDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConversionDeclarator(PseudoParser.ConversionDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#constructorInitializer}.
	 * @param ctx the parse tree
	 */
	void enterConstructorInitializer(PseudoParser.ConstructorInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#constructorInitializer}.
	 * @param ctx the parse tree
	 */
	void exitConstructorInitializer(PseudoParser.ConstructorInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#memInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterMemInitializerList(PseudoParser.MemInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#memInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitMemInitializerList(PseudoParser.MemInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#memInitializer}.
	 * @param ctx the parse tree
	 */
	void enterMemInitializer(PseudoParser.MemInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#memInitializer}.
	 * @param ctx the parse tree
	 */
	void exitMemInitializer(PseudoParser.MemInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerid(PseudoParser.MeminitializeridContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerid(PseudoParser.MeminitializeridContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#operatorFunctionId}.
	 * @param ctx the parse tree
	 */
	void enterOperatorFunctionId(PseudoParser.OperatorFunctionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#operatorFunctionId}.
	 * @param ctx the parse tree
	 */
	void exitOperatorFunctionId(PseudoParser.OperatorFunctionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#literalOperatorId}.
	 * @param ctx the parse tree
	 */
	void enterLiteralOperatorId(PseudoParser.LiteralOperatorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#literalOperatorId}.
	 * @param ctx the parse tree
	 */
	void exitLiteralOperatorId(PseudoParser.LiteralOperatorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDeclaration(PseudoParser.TemplateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDeclaration(PseudoParser.TemplateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#templateparameterList}.
	 * @param ctx the parse tree
	 */
	void enterTemplateparameterList(PseudoParser.TemplateparameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#templateparameterList}.
	 * @param ctx the parse tree
	 */
	void exitTemplateparameterList(PseudoParser.TemplateparameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#templateParameter}.
	 * @param ctx the parse tree
	 */
	void enterTemplateParameter(PseudoParser.TemplateParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#templateParameter}.
	 * @param ctx the parse tree
	 */
	void exitTemplateParameter(PseudoParser.TemplateParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(PseudoParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(PseudoParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#simpleTemplateId}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTemplateId(PseudoParser.SimpleTemplateIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#simpleTemplateId}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTemplateId(PseudoParser.SimpleTemplateIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#templateId}.
	 * @param ctx the parse tree
	 */
	void enterTemplateId(PseudoParser.TemplateIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#templateId}.
	 * @param ctx the parse tree
	 */
	void exitTemplateId(PseudoParser.TemplateIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#templateName}.
	 * @param ctx the parse tree
	 */
	void enterTemplateName(PseudoParser.TemplateNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#templateName}.
	 * @param ctx the parse tree
	 */
	void exitTemplateName(PseudoParser.TemplateNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#templateArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTemplateArgumentList(PseudoParser.TemplateArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#templateArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTemplateArgumentList(PseudoParser.TemplateArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#templateArgument}.
	 * @param ctx the parse tree
	 */
	void enterTemplateArgument(PseudoParser.TemplateArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#templateArgument}.
	 * @param ctx the parse tree
	 */
	void exitTemplateArgument(PseudoParser.TemplateArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#typeNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameSpecifier(PseudoParser.TypeNameSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#typeNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameSpecifier(PseudoParser.TypeNameSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#explicitInstantiation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitInstantiation(PseudoParser.ExplicitInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#explicitInstantiation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitInstantiation(PseudoParser.ExplicitInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#explicitSpecialization}.
	 * @param ctx the parse tree
	 */
	void enterExplicitSpecialization(PseudoParser.ExplicitSpecializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#explicitSpecialization}.
	 * @param ctx the parse tree
	 */
	void exitExplicitSpecialization(PseudoParser.ExplicitSpecializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void enterTryBlock(PseudoParser.TryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void exitTryBlock(PseudoParser.TryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#functionTryBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTryBlock(PseudoParser.FunctionTryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#functionTryBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTryBlock(PseudoParser.FunctionTryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#handlerSeq}.
	 * @param ctx the parse tree
	 */
	void enterHandlerSeq(PseudoParser.HandlerSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#handlerSeq}.
	 * @param ctx the parse tree
	 */
	void exitHandlerSeq(PseudoParser.HandlerSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#handler}.
	 * @param ctx the parse tree
	 */
	void enterHandler(PseudoParser.HandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#handler}.
	 * @param ctx the parse tree
	 */
	void exitHandler(PseudoParser.HandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExceptionDeclaration(PseudoParser.ExceptionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExceptionDeclaration(PseudoParser.ExceptionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#throwExpression}.
	 * @param ctx the parse tree
	 */
	void enterThrowExpression(PseudoParser.ThrowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#throwExpression}.
	 * @param ctx the parse tree
	 */
	void exitThrowExpression(PseudoParser.ThrowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#exceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterExceptionSpecification(PseudoParser.ExceptionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#exceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitExceptionSpecification(PseudoParser.ExceptionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#dynamicExceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDynamicExceptionSpecification(PseudoParser.DynamicExceptionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#dynamicExceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDynamicExceptionSpecification(PseudoParser.DynamicExceptionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#typeIdList}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdList(PseudoParser.TypeIdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#typeIdList}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdList(PseudoParser.TypeIdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#noeExceptSpecification}.
	 * @param ctx the parse tree
	 */
	void enterNoeExceptSpecification(PseudoParser.NoeExceptSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#noeExceptSpecification}.
	 * @param ctx the parse tree
	 */
	void exitNoeExceptSpecification(PseudoParser.NoeExceptSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#theOperator}.
	 * @param ctx the parse tree
	 */
	void enterTheOperator(PseudoParser.TheOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#theOperator}.
	 * @param ctx the parse tree
	 */
	void exitTheOperator(PseudoParser.TheOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PseudoParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PseudoParser.LiteralContext ctx);
}