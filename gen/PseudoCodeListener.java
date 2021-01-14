// Generated from C:/Users/Erika Y Chan/Kae/School Stuff/CMPILER S11/MP - Parser/MP-Parser/MP Parser/src\PseudoCode.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PseudoCodeParser}.
 */
public interface PseudoCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(PseudoCodeParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(PseudoCodeParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(PseudoCodeParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(PseudoCodeParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#idExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(PseudoCodeParser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#idExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(PseudoCodeParser.IdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unqualifiedId}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedId(PseudoCodeParser.UnqualifiedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unqualifiedId}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedId(PseudoCodeParser.UnqualifiedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#qualifiedId}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedId(PseudoCodeParser.QualifiedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#qualifiedId}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedId(PseudoCodeParser.QualifiedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterNestedNameSpecifier(PseudoCodeParser.NestedNameSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitNestedNameSpecifier(PseudoCodeParser.NestedNameSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(PseudoCodeParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(PseudoCodeParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#lambdaIntroducer}.
	 * @param ctx the parse tree
	 */
	void enterLambdaIntroducer(PseudoCodeParser.LambdaIntroducerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#lambdaIntroducer}.
	 * @param ctx the parse tree
	 */
	void exitLambdaIntroducer(PseudoCodeParser.LambdaIntroducerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#lambdaCapture}.
	 * @param ctx the parse tree
	 */
	void enterLambdaCapture(PseudoCodeParser.LambdaCaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#lambdaCapture}.
	 * @param ctx the parse tree
	 */
	void exitLambdaCapture(PseudoCodeParser.LambdaCaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#captureDefault}.
	 * @param ctx the parse tree
	 */
	void enterCaptureDefault(PseudoCodeParser.CaptureDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#captureDefault}.
	 * @param ctx the parse tree
	 */
	void exitCaptureDefault(PseudoCodeParser.CaptureDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#captureList}.
	 * @param ctx the parse tree
	 */
	void enterCaptureList(PseudoCodeParser.CaptureListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#captureList}.
	 * @param ctx the parse tree
	 */
	void exitCaptureList(PseudoCodeParser.CaptureListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(PseudoCodeParser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(PseudoCodeParser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#simpleCapture}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCapture(PseudoCodeParser.SimpleCaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#simpleCapture}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCapture(PseudoCodeParser.SimpleCaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#initcapture}.
	 * @param ctx the parse tree
	 */
	void enterInitcapture(PseudoCodeParser.InitcaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#initcapture}.
	 * @param ctx the parse tree
	 */
	void exitInitcapture(PseudoCodeParser.InitcaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#lambdaDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterLambdaDeclarator(PseudoCodeParser.LambdaDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#lambdaDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitLambdaDeclarator(PseudoCodeParser.LambdaDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(PseudoCodeParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(PseudoCodeParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdOfTheTypeId(PseudoCodeParser.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdOfTheTypeId(PseudoCodeParser.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(PseudoCodeParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(PseudoCodeParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 */
	void enterPseudoDestructorName(PseudoCodeParser.PseudoDestructorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 */
	void exitPseudoDestructorName(PseudoCodeParser.PseudoDestructorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(PseudoCodeParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(PseudoCodeParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(PseudoCodeParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(PseudoCodeParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(PseudoCodeParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(PseudoCodeParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#newPlacement}.
	 * @param ctx the parse tree
	 */
	void enterNewPlacement(PseudoCodeParser.NewPlacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#newPlacement}.
	 * @param ctx the parse tree
	 */
	void exitNewPlacement(PseudoCodeParser.NewPlacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#newTypeId}.
	 * @param ctx the parse tree
	 */
	void enterNewTypeId(PseudoCodeParser.NewTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#newTypeId}.
	 * @param ctx the parse tree
	 */
	void exitNewTypeId(PseudoCodeParser.NewTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewDeclarator(PseudoCodeParser.NewDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewDeclarator(PseudoCodeParser.NewDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerNewDeclarator(PseudoCodeParser.NoPointerNewDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerNewDeclarator(PseudoCodeParser.NoPointerNewDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#newInitializer}.
	 * @param ctx the parse tree
	 */
	void enterNewInitializer(PseudoCodeParser.NewInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#newInitializer}.
	 * @param ctx the parse tree
	 */
	void exitNewInitializer(PseudoCodeParser.NewInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#deleteExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(PseudoCodeParser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#deleteExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(PseudoCodeParser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#noExceptExpression}.
	 * @param ctx the parse tree
	 */
	void enterNoExceptExpression(PseudoCodeParser.NoExceptExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#noExceptExpression}.
	 * @param ctx the parse tree
	 */
	void exitNoExceptExpression(PseudoCodeParser.NoExceptExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(PseudoCodeParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(PseudoCodeParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#pointerMemberExpression}.
	 * @param ctx the parse tree
	 */
	void enterPointerMemberExpression(PseudoCodeParser.PointerMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#pointerMemberExpression}.
	 * @param ctx the parse tree
	 */
	void exitPointerMemberExpression(PseudoCodeParser.PointerMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(PseudoCodeParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(PseudoCodeParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(PseudoCodeParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(PseudoCodeParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(PseudoCodeParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(PseudoCodeParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftOperator(PseudoCodeParser.ShiftOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#shiftOperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftOperator(PseudoCodeParser.ShiftOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(PseudoCodeParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(PseudoCodeParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(PseudoCodeParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(PseudoCodeParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(PseudoCodeParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(PseudoCodeParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(PseudoCodeParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(PseudoCodeParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(PseudoCodeParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(PseudoCodeParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(PseudoCodeParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(PseudoCodeParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(PseudoCodeParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(PseudoCodeParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(PseudoCodeParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(PseudoCodeParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(PseudoCodeParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(PseudoCodeParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(PseudoCodeParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(PseudoCodeParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PseudoCodeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PseudoCodeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(PseudoCodeParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(PseudoCodeParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PseudoCodeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PseudoCodeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(PseudoCodeParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(PseudoCodeParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(PseudoCodeParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(PseudoCodeParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PseudoCodeParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PseudoCodeParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void enterStatementSeq(PseudoCodeParser.StatementSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#statementSeq}.
	 * @param ctx the parse tree
	 */
	void exitStatementSeq(PseudoCodeParser.StatementSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(PseudoCodeParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(PseudoCodeParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(PseudoCodeParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(PseudoCodeParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PseudoCodeParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PseudoCodeParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(PseudoCodeParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(PseudoCodeParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInitStatement(PseudoCodeParser.ForInitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#forInitStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInitStatement(PseudoCodeParser.ForInitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForRangeDeclaration(PseudoCodeParser.ForRangeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForRangeDeclaration(PseudoCodeParser.ForRangeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#forRangeInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForRangeInitializer(PseudoCodeParser.ForRangeInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#forRangeInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForRangeInitializer(PseudoCodeParser.ForRangeInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(PseudoCodeParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(PseudoCodeParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(PseudoCodeParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(PseudoCodeParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationseq(PseudoCodeParser.DeclarationseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationseq(PseudoCodeParser.DeclarationseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PseudoCodeParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PseudoCodeParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBlockDeclaration(PseudoCodeParser.BlockDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#blockDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBlockDeclaration(PseudoCodeParser.BlockDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAliasDeclaration(PseudoCodeParser.AliasDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAliasDeclaration(PseudoCodeParser.AliasDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDeclaration(PseudoCodeParser.SimpleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDeclaration(PseudoCodeParser.SimpleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(PseudoCodeParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(PseudoCodeParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#emptyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptyDeclaration(PseudoCodeParser.EmptyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#emptyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptyDeclaration(PseudoCodeParser.EmptyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDeclaration(PseudoCodeParser.AttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDeclaration(PseudoCodeParser.AttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#declSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecifier(PseudoCodeParser.DeclSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#declSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecifier(PseudoCodeParser.DeclSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterDeclSpecifierSeq(PseudoCodeParser.DeclSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitDeclSpecifierSeq(PseudoCodeParser.DeclSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(PseudoCodeParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(PseudoCodeParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(PseudoCodeParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(PseudoCodeParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(PseudoCodeParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(PseudoCodeParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(PseudoCodeParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(PseudoCodeParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTrailingTypeSpecifier(PseudoCodeParser.TrailingTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTrailingTypeSpecifier(PseudoCodeParser.TrailingTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifierSeq(PseudoCodeParser.TypeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifierSeq(PseudoCodeParser.TypeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterTrailingTypeSpecifierSeq(PseudoCodeParser.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitTrailingTypeSpecifierSeq(PseudoCodeParser.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeSpecifier(PseudoCodeParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeSpecifier(PseudoCodeParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#theTypeName}.
	 * @param ctx the parse tree
	 */
	void enterTheTypeName(PseudoCodeParser.TheTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#theTypeName}.
	 * @param ctx the parse tree
	 */
	void exitTheTypeName(PseudoCodeParser.TheTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#decltypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDecltypeSpecifier(PseudoCodeParser.DecltypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#decltypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDecltypeSpecifier(PseudoCodeParser.DecltypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterElaboratedTypeSpecifier(PseudoCodeParser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitElaboratedTypeSpecifier(PseudoCodeParser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(PseudoCodeParser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(PseudoCodeParser.EnumNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(PseudoCodeParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(PseudoCodeParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enumHead}.
	 * @param ctx the parse tree
	 */
	void enterEnumHead(PseudoCodeParser.EnumHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enumHead}.
	 * @param ctx the parse tree
	 */
	void exitEnumHead(PseudoCodeParser.EnumHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOpaqueEnumDeclaration(PseudoCodeParser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOpaqueEnumDeclaration(PseudoCodeParser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enumkey}.
	 * @param ctx the parse tree
	 */
	void enterEnumkey(PseudoCodeParser.EnumkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enumkey}.
	 * @param ctx the parse tree
	 */
	void exitEnumkey(PseudoCodeParser.EnumkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enumbase}.
	 * @param ctx the parse tree
	 */
	void enterEnumbase(PseudoCodeParser.EnumbaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enumbase}.
	 * @param ctx the parse tree
	 */
	void exitEnumbase(PseudoCodeParser.EnumbaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(PseudoCodeParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(PseudoCodeParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorDefinition(PseudoCodeParser.EnumeratorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorDefinition(PseudoCodeParser.EnumeratorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(PseudoCodeParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(PseudoCodeParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#namespaceName}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceName(PseudoCodeParser.NamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#namespaceName}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceName(PseudoCodeParser.NamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#originalNamespaceName}.
	 * @param ctx the parse tree
	 */
	void enterOriginalNamespaceName(PseudoCodeParser.OriginalNamespaceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#originalNamespaceName}.
	 * @param ctx the parse tree
	 */
	void exitOriginalNamespaceName(PseudoCodeParser.OriginalNamespaceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDefinition(PseudoCodeParser.NamespaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDefinition(PseudoCodeParser.NamespaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#namespaceAlias}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceAlias(PseudoCodeParser.NamespaceAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#namespaceAlias}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceAlias(PseudoCodeParser.NamespaceAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceAliasDefinition(PseudoCodeParser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceAliasDefinition(PseudoCodeParser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiednamespacespecifier(PseudoCodeParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiednamespacespecifier(PseudoCodeParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingDeclaration(PseudoCodeParser.UsingDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#usingDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingDeclaration(PseudoCodeParser.UsingDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#usingDirective}.
	 * @param ctx the parse tree
	 */
	void enterUsingDirective(PseudoCodeParser.UsingDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#usingDirective}.
	 * @param ctx the parse tree
	 */
	void exitUsingDirective(PseudoCodeParser.UsingDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#asmDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAsmDefinition(PseudoCodeParser.AsmDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#asmDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAsmDefinition(PseudoCodeParser.AsmDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#linkageSpecification}.
	 * @param ctx the parse tree
	 */
	void enterLinkageSpecification(PseudoCodeParser.LinkageSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#linkageSpecification}.
	 * @param ctx the parse tree
	 */
	void exitLinkageSpecification(PseudoCodeParser.LinkageSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifierSeq(PseudoCodeParser.AttributeSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifierSeq(PseudoCodeParser.AttributeSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSpecifier(PseudoCodeParser.AttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSpecifier(PseudoCodeParser.AttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentspecifier(PseudoCodeParser.AlignmentspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentspecifier(PseudoCodeParser.AlignmentspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(PseudoCodeParser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(PseudoCodeParser.AttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(PseudoCodeParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(PseudoCodeParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#attributeNamespace}.
	 * @param ctx the parse tree
	 */
	void enterAttributeNamespace(PseudoCodeParser.AttributeNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#attributeNamespace}.
	 * @param ctx the parse tree
	 */
	void exitAttributeNamespace(PseudoCodeParser.AttributeNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeArgumentClause(PseudoCodeParser.AttributeArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeArgumentClause(PseudoCodeParser.AttributeArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#balancedTokenSeq}.
	 * @param ctx the parse tree
	 */
	void enterBalancedTokenSeq(PseudoCodeParser.BalancedTokenSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#balancedTokenSeq}.
	 * @param ctx the parse tree
	 */
	void exitBalancedTokenSeq(PseudoCodeParser.BalancedTokenSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtoken(PseudoCodeParser.BalancedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtoken(PseudoCodeParser.BalancedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(PseudoCodeParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(PseudoCodeParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(PseudoCodeParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(PseudoCodeParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(PseudoCodeParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(PseudoCodeParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#pointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPointerDeclarator(PseudoCodeParser.PointerDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#pointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPointerDeclarator(PseudoCodeParser.PointerDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#noPointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerDeclarator(PseudoCodeParser.NoPointerDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#noPointerDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerDeclarator(PseudoCodeParser.NoPointerDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParametersAndQualifiers(PseudoCodeParser.ParametersAndQualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParametersAndQualifiers(PseudoCodeParser.ParametersAndQualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#trailingReturnType}.
	 * @param ctx the parse tree
	 */
	void enterTrailingReturnType(PseudoCodeParser.TrailingReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#trailingReturnType}.
	 * @param ctx the parse tree
	 */
	void exitTrailingReturnType(PseudoCodeParser.TrailingReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#pointerOperator}.
	 * @param ctx the parse tree
	 */
	void enterPointerOperator(PseudoCodeParser.PointerOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#pointerOperator}.
	 * @param ctx the parse tree
	 */
	void exitPointerOperator(PseudoCodeParser.PointerOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifierseq(PseudoCodeParser.CvqualifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifierseq(PseudoCodeParser.CvqualifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#cvQualifier}.
	 * @param ctx the parse tree
	 */
	void enterCvQualifier(PseudoCodeParser.CvQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#cvQualifier}.
	 * @param ctx the parse tree
	 */
	void exitCvQualifier(PseudoCodeParser.CvQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void enterRefqualifier(PseudoCodeParser.RefqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void exitRefqualifier(PseudoCodeParser.RefqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorid(PseudoCodeParser.DeclaratoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorid(PseudoCodeParser.DeclaratoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#theTypeId}.
	 * @param ctx the parse tree
	 */
	void enterTheTypeId(PseudoCodeParser.TheTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#theTypeId}.
	 * @param ctx the parse tree
	 */
	void exitTheTypeId(PseudoCodeParser.TheTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(PseudoCodeParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(PseudoCodeParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPointerAbstractDeclarator(PseudoCodeParser.PointerAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPointerAbstractDeclarator(PseudoCodeParser.PointerAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerAbstractDeclarator(PseudoCodeParser.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerAbstractDeclarator(PseudoCodeParser.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractPackDeclarator(PseudoCodeParser.AbstractPackDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractPackDeclarator(PseudoCodeParser.AbstractPackDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoPointerAbstractPackDeclarator(PseudoCodeParser.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoPointerAbstractPackDeclarator(PseudoCodeParser.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationClause(PseudoCodeParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationClause(PseudoCodeParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclarationList(PseudoCodeParser.ParameterDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclarationList(PseudoCodeParser.ParameterDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(PseudoCodeParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(PseudoCodeParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(PseudoCodeParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(PseudoCodeParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(PseudoCodeParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(PseudoCodeParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(PseudoCodeParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(PseudoCodeParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 */
	void enterBraceOrEqualInitializer(PseudoCodeParser.BraceOrEqualInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 */
	void exitBraceOrEqualInitializer(PseudoCodeParser.BraceOrEqualInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#initializerClause}.
	 * @param ctx the parse tree
	 */
	void enterInitializerClause(PseudoCodeParser.InitializerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#initializerClause}.
	 * @param ctx the parse tree
	 */
	void exitInitializerClause(PseudoCodeParser.InitializerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(PseudoCodeParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(PseudoCodeParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void enterBracedInitList(PseudoCodeParser.BracedInitListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#bracedInitList}.
	 * @param ctx the parse tree
	 */
	void exitBracedInitList(PseudoCodeParser.BracedInitListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(PseudoCodeParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(PseudoCodeParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassSpecifier(PseudoCodeParser.ClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassSpecifier(PseudoCodeParser.ClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classHead}.
	 * @param ctx the parse tree
	 */
	void enterClassHead(PseudoCodeParser.ClassHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classHead}.
	 * @param ctx the parse tree
	 */
	void exitClassHead(PseudoCodeParser.ClassHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classHeadName}.
	 * @param ctx the parse tree
	 */
	void enterClassHeadName(PseudoCodeParser.ClassHeadNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classHeadName}.
	 * @param ctx the parse tree
	 */
	void exitClassHeadName(PseudoCodeParser.ClassHeadNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classVirtSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassVirtSpecifier(PseudoCodeParser.ClassVirtSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classVirtSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassVirtSpecifier(PseudoCodeParser.ClassVirtSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classKey}.
	 * @param ctx the parse tree
	 */
	void enterClassKey(PseudoCodeParser.ClassKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classKey}.
	 * @param ctx the parse tree
	 */
	void exitClassKey(PseudoCodeParser.ClassKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#memberSpecification}.
	 * @param ctx the parse tree
	 */
	void enterMemberSpecification(PseudoCodeParser.MemberSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#memberSpecification}.
	 * @param ctx the parse tree
	 */
	void exitMemberSpecification(PseudoCodeParser.MemberSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaration(PseudoCodeParser.MemberdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaration(PseudoCodeParser.MemberdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaratorList(PseudoCodeParser.MemberDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaratorList(PseudoCodeParser.MemberDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#memberDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclarator(PseudoCodeParser.MemberDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#memberDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclarator(PseudoCodeParser.MemberDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#virtualSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterVirtualSpecifierSeq(PseudoCodeParser.VirtualSpecifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#virtualSpecifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitVirtualSpecifierSeq(PseudoCodeParser.VirtualSpecifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#virtualSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterVirtualSpecifier(PseudoCodeParser.VirtualSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#virtualSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitVirtualSpecifier(PseudoCodeParser.VirtualSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#pureSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterPureSpecifier(PseudoCodeParser.PureSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#pureSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitPureSpecifier(PseudoCodeParser.PureSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#baseClause}.
	 * @param ctx the parse tree
	 */
	void enterBaseClause(PseudoCodeParser.BaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#baseClause}.
	 * @param ctx the parse tree
	 */
	void exitBaseClause(PseudoCodeParser.BaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#baseSpecifierList}.
	 * @param ctx the parse tree
	 */
	void enterBaseSpecifierList(PseudoCodeParser.BaseSpecifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#baseSpecifierList}.
	 * @param ctx the parse tree
	 */
	void exitBaseSpecifierList(PseudoCodeParser.BaseSpecifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#baseSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseSpecifier(PseudoCodeParser.BaseSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#baseSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseSpecifier(PseudoCodeParser.BaseSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classOrDeclType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrDeclType(PseudoCodeParser.ClassOrDeclTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classOrDeclType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrDeclType(PseudoCodeParser.ClassOrDeclTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseTypeSpecifier(PseudoCodeParser.BaseTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseTypeSpecifier(PseudoCodeParser.BaseTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#accessSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessSpecifier(PseudoCodeParser.AccessSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#accessSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessSpecifier(PseudoCodeParser.AccessSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#conversionFunctionId}.
	 * @param ctx the parse tree
	 */
	void enterConversionFunctionId(PseudoCodeParser.ConversionFunctionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#conversionFunctionId}.
	 * @param ctx the parse tree
	 */
	void exitConversionFunctionId(PseudoCodeParser.ConversionFunctionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#conversionTypeId}.
	 * @param ctx the parse tree
	 */
	void enterConversionTypeId(PseudoCodeParser.ConversionTypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#conversionTypeId}.
	 * @param ctx the parse tree
	 */
	void exitConversionTypeId(PseudoCodeParser.ConversionTypeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#conversionDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConversionDeclarator(PseudoCodeParser.ConversionDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#conversionDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConversionDeclarator(PseudoCodeParser.ConversionDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#constructorInitializer}.
	 * @param ctx the parse tree
	 */
	void enterConstructorInitializer(PseudoCodeParser.ConstructorInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#constructorInitializer}.
	 * @param ctx the parse tree
	 */
	void exitConstructorInitializer(PseudoCodeParser.ConstructorInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#memInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterMemInitializerList(PseudoCodeParser.MemInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#memInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitMemInitializerList(PseudoCodeParser.MemInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#memInitializer}.
	 * @param ctx the parse tree
	 */
	void enterMemInitializer(PseudoCodeParser.MemInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#memInitializer}.
	 * @param ctx the parse tree
	 */
	void exitMemInitializer(PseudoCodeParser.MemInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerid(PseudoCodeParser.MeminitializeridContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerid(PseudoCodeParser.MeminitializeridContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#operatorFunctionId}.
	 * @param ctx the parse tree
	 */
	void enterOperatorFunctionId(PseudoCodeParser.OperatorFunctionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#operatorFunctionId}.
	 * @param ctx the parse tree
	 */
	void exitOperatorFunctionId(PseudoCodeParser.OperatorFunctionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literalOperatorId}.
	 * @param ctx the parse tree
	 */
	void enterLiteralOperatorId(PseudoCodeParser.LiteralOperatorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literalOperatorId}.
	 * @param ctx the parse tree
	 */
	void exitLiteralOperatorId(PseudoCodeParser.LiteralOperatorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDeclaration(PseudoCodeParser.TemplateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDeclaration(PseudoCodeParser.TemplateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#templateparameterList}.
	 * @param ctx the parse tree
	 */
	void enterTemplateparameterList(PseudoCodeParser.TemplateparameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#templateparameterList}.
	 * @param ctx the parse tree
	 */
	void exitTemplateparameterList(PseudoCodeParser.TemplateparameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#templateParameter}.
	 * @param ctx the parse tree
	 */
	void enterTemplateParameter(PseudoCodeParser.TemplateParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#templateParameter}.
	 * @param ctx the parse tree
	 */
	void exitTemplateParameter(PseudoCodeParser.TemplateParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(PseudoCodeParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(PseudoCodeParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#simpleTemplateId}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTemplateId(PseudoCodeParser.SimpleTemplateIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#simpleTemplateId}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTemplateId(PseudoCodeParser.SimpleTemplateIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#templateId}.
	 * @param ctx the parse tree
	 */
	void enterTemplateId(PseudoCodeParser.TemplateIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#templateId}.
	 * @param ctx the parse tree
	 */
	void exitTemplateId(PseudoCodeParser.TemplateIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#templateName}.
	 * @param ctx the parse tree
	 */
	void enterTemplateName(PseudoCodeParser.TemplateNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#templateName}.
	 * @param ctx the parse tree
	 */
	void exitTemplateName(PseudoCodeParser.TemplateNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#templateArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTemplateArgumentList(PseudoCodeParser.TemplateArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#templateArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTemplateArgumentList(PseudoCodeParser.TemplateArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#templateArgument}.
	 * @param ctx the parse tree
	 */
	void enterTemplateArgument(PseudoCodeParser.TemplateArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#templateArgument}.
	 * @param ctx the parse tree
	 */
	void exitTemplateArgument(PseudoCodeParser.TemplateArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameSpecifier(PseudoCodeParser.TypeNameSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeNameSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameSpecifier(PseudoCodeParser.TypeNameSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#explicitInstantiation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitInstantiation(PseudoCodeParser.ExplicitInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#explicitInstantiation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitInstantiation(PseudoCodeParser.ExplicitInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#explicitSpecialization}.
	 * @param ctx the parse tree
	 */
	void enterExplicitSpecialization(PseudoCodeParser.ExplicitSpecializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#explicitSpecialization}.
	 * @param ctx the parse tree
	 */
	void exitExplicitSpecialization(PseudoCodeParser.ExplicitSpecializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void enterTryBlock(PseudoCodeParser.TryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#tryBlock}.
	 * @param ctx the parse tree
	 */
	void exitTryBlock(PseudoCodeParser.TryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#functionTryBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTryBlock(PseudoCodeParser.FunctionTryBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#functionTryBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTryBlock(PseudoCodeParser.FunctionTryBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#handlerSeq}.
	 * @param ctx the parse tree
	 */
	void enterHandlerSeq(PseudoCodeParser.HandlerSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#handlerSeq}.
	 * @param ctx the parse tree
	 */
	void exitHandlerSeq(PseudoCodeParser.HandlerSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#handler}.
	 * @param ctx the parse tree
	 */
	void enterHandler(PseudoCodeParser.HandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#handler}.
	 * @param ctx the parse tree
	 */
	void exitHandler(PseudoCodeParser.HandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExceptionDeclaration(PseudoCodeParser.ExceptionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExceptionDeclaration(PseudoCodeParser.ExceptionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#throwExpression}.
	 * @param ctx the parse tree
	 */
	void enterThrowExpression(PseudoCodeParser.ThrowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#throwExpression}.
	 * @param ctx the parse tree
	 */
	void exitThrowExpression(PseudoCodeParser.ThrowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#exceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterExceptionSpecification(PseudoCodeParser.ExceptionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#exceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitExceptionSpecification(PseudoCodeParser.ExceptionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#dynamicExceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDynamicExceptionSpecification(PseudoCodeParser.DynamicExceptionSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#dynamicExceptionSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDynamicExceptionSpecification(PseudoCodeParser.DynamicExceptionSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeIdList}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdList(PseudoCodeParser.TypeIdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeIdList}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdList(PseudoCodeParser.TypeIdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#noeExceptSpecification}.
	 * @param ctx the parse tree
	 */
	void enterNoeExceptSpecification(PseudoCodeParser.NoeExceptSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#noeExceptSpecification}.
	 * @param ctx the parse tree
	 */
	void exitNoeExceptSpecification(PseudoCodeParser.NoeExceptSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#theOperator}.
	 * @param ctx the parse tree
	 */
	void enterTheOperator(PseudoCodeParser.TheOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#theOperator}.
	 * @param ctx the parse tree
	 */
	void exitTheOperator(PseudoCodeParser.TheOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PseudoCodeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PseudoCodeParser.LiteralContext ctx);
}