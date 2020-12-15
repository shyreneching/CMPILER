package gen;// Generated from C:/Users/ShyreneChing/Desktop/DLSU/AY 2020-2021 Term 1/CMPILER/MP/MC01/MP Parser/MP Parser/src\PseudoCode.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PseudoCodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PseudoCodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(PseudoCodeParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(PseudoCodeParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#idExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(PseudoCodeParser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unqualifiedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedId(PseudoCodeParser.UnqualifiedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#qualifiedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedId(PseudoCodeParser.QualifiedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedNameSpecifier(PseudoCodeParser.NestedNameSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(PseudoCodeParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#lambdaIntroducer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaIntroducer(PseudoCodeParser.LambdaIntroducerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#lambdaCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaCapture(PseudoCodeParser.LambdaCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#captureDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureDefault(PseudoCodeParser.CaptureDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#captureList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureList(PseudoCodeParser.CaptureListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture(PseudoCodeParser.CaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#simpleCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCapture(PseudoCodeParser.SimpleCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#initcapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitcapture(PseudoCodeParser.InitcaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#lambdaDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaDeclarator(PseudoCodeParser.LambdaDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(PseudoCodeParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdOfTheTypeId(PseudoCodeParser.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(PseudoCodeParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoDestructorName(PseudoCodeParser.PseudoDestructorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(PseudoCodeParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(PseudoCodeParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(PseudoCodeParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#newPlacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewPlacement(PseudoCodeParser.NewPlacementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#newTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewTypeId(PseudoCodeParser.NewTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#newDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDeclarator(PseudoCodeParser.NewDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerNewDeclarator(PseudoCodeParser.NoPointerNewDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#newInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewInitializer(PseudoCodeParser.NewInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#deleteExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteExpression(PseudoCodeParser.DeleteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#noExceptExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoExceptExpression(PseudoCodeParser.NoExceptExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(PseudoCodeParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#pointerMemberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerMemberExpression(PseudoCodeParser.PointerMemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(PseudoCodeParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(PseudoCodeParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(PseudoCodeParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#shiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOperator(PseudoCodeParser.ShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(PseudoCodeParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(PseudoCodeParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(PseudoCodeParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(PseudoCodeParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(PseudoCodeParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(PseudoCodeParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(PseudoCodeParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(PseudoCodeParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(PseudoCodeParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(PseudoCodeParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PseudoCodeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(PseudoCodeParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PseudoCodeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(PseudoCodeParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(PseudoCodeParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PseudoCodeParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#statementSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSeq(PseudoCodeParser.StatementSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(PseudoCodeParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(PseudoCodeParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PseudoCodeParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(PseudoCodeParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#forInitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitStatement(PseudoCodeParser.ForInitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRangeDeclaration(PseudoCodeParser.ForRangeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#forRangeInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRangeInitializer(PseudoCodeParser.ForRangeInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(PseudoCodeParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(PseudoCodeParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#declarationseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationseq(PseudoCodeParser.DeclarationseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(PseudoCodeParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#blockDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockDeclaration(PseudoCodeParser.BlockDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#aliasDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasDeclaration(PseudoCodeParser.AliasDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDeclaration(PseudoCodeParser.SimpleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(PseudoCodeParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#emptyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyDeclaration(PseudoCodeParser.EmptyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDeclaration(PseudoCodeParser.AttributeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#declSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifier(PseudoCodeParser.DeclSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifierSeq(PseudoCodeParser.DeclSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(PseudoCodeParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(PseudoCodeParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(PseudoCodeParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(PseudoCodeParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingTypeSpecifier(PseudoCodeParser.TrailingTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifierSeq(PseudoCodeParser.TypeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingTypeSpecifierSeq(PseudoCodeParser.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeSpecifier(PseudoCodeParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#theTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheTypeName(PseudoCodeParser.TheTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#decltypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecltypeSpecifier(PseudoCodeParser.DecltypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElaboratedTypeSpecifier(PseudoCodeParser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#enumName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumName(PseudoCodeParser.EnumNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(PseudoCodeParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#enumHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumHead(PseudoCodeParser.EnumHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpaqueEnumDeclaration(PseudoCodeParser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#enumkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumkey(PseudoCodeParser.EnumkeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#enumbase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumbase(PseudoCodeParser.EnumbaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(PseudoCodeParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorDefinition(PseudoCodeParser.EnumeratorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(PseudoCodeParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#namespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceName(PseudoCodeParser.NamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#originalNamespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginalNamespaceName(PseudoCodeParser.OriginalNamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDefinition(PseudoCodeParser.NamespaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#namespaceAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAlias(PseudoCodeParser.NamespaceAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAliasDefinition(PseudoCodeParser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiednamespacespecifier(PseudoCodeParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#usingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDeclaration(PseudoCodeParser.UsingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#usingDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDirective(PseudoCodeParser.UsingDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#asmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmDefinition(PseudoCodeParser.AsmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#linkageSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkageSpecification(PseudoCodeParser.LinkageSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifierSeq(PseudoCodeParser.AttributeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifier(PseudoCodeParser.AttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentspecifier(PseudoCodeParser.AlignmentspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#attributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeList(PseudoCodeParser.AttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(PseudoCodeParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#attributeNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeNamespace(PseudoCodeParser.AttributeNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeArgumentClause(PseudoCodeParser.AttributeArgumentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#balancedTokenSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedTokenSeq(PseudoCodeParser.BalancedTokenSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#balancedtoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedtoken(PseudoCodeParser.BalancedtokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(PseudoCodeParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(PseudoCodeParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(PseudoCodeParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#pointerDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerDeclarator(PseudoCodeParser.PointerDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#noPointerDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerDeclarator(PseudoCodeParser.NoPointerDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersAndQualifiers(PseudoCodeParser.ParametersAndQualifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#trailingReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingReturnType(PseudoCodeParser.TrailingReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#pointerOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerOperator(PseudoCodeParser.PointerOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvqualifierseq(PseudoCodeParser.CvqualifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#cvQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvQualifier(PseudoCodeParser.CvQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#refqualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefqualifier(PseudoCodeParser.RefqualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#declaratorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorid(PseudoCodeParser.DeclaratoridContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#theTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheTypeId(PseudoCodeParser.TheTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(PseudoCodeParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerAbstractDeclarator(PseudoCodeParser.PointerAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerAbstractDeclarator(PseudoCodeParser.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractPackDeclarator(PseudoCodeParser.AbstractPackDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerAbstractPackDeclarator(PseudoCodeParser.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationClause(PseudoCodeParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationList(PseudoCodeParser.ParameterDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(PseudoCodeParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(PseudoCodeParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(PseudoCodeParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(PseudoCodeParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceOrEqualInitializer(PseudoCodeParser.BraceOrEqualInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#initializerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerClause(PseudoCodeParser.InitializerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(PseudoCodeParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#bracedInitList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedInitList(PseudoCodeParser.BracedInitListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(PseudoCodeParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSpecifier(PseudoCodeParser.ClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHead(PseudoCodeParser.ClassHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classHeadName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeadName(PseudoCodeParser.ClassHeadNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classVirtSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVirtSpecifier(PseudoCodeParser.ClassVirtSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassKey(PseudoCodeParser.ClassKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#memberSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberSpecification(PseudoCodeParser.MemberSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#memberdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberdeclaration(PseudoCodeParser.MemberdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaratorList(PseudoCodeParser.MemberDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#memberDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarator(PseudoCodeParser.MemberDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#virtualSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtualSpecifierSeq(PseudoCodeParser.VirtualSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#virtualSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtualSpecifier(PseudoCodeParser.VirtualSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#pureSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureSpecifier(PseudoCodeParser.PureSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#baseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseClause(PseudoCodeParser.BaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#baseSpecifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseSpecifierList(PseudoCodeParser.BaseSpecifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#baseSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseSpecifier(PseudoCodeParser.BaseSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classOrDeclType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrDeclType(PseudoCodeParser.ClassOrDeclTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseTypeSpecifier(PseudoCodeParser.BaseTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#accessSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessSpecifier(PseudoCodeParser.AccessSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#conversionFunctionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionFunctionId(PseudoCodeParser.ConversionFunctionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#conversionTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionTypeId(PseudoCodeParser.ConversionTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#conversionDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionDeclarator(PseudoCodeParser.ConversionDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#constructorInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorInitializer(PseudoCodeParser.ConstructorInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#memInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemInitializerList(PseudoCodeParser.MemInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#memInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemInitializer(PseudoCodeParser.MemInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#meminitializerid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializerid(PseudoCodeParser.MeminitializeridContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#operatorFunctionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorFunctionId(PseudoCodeParser.OperatorFunctionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literalOperatorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralOperatorId(PseudoCodeParser.LiteralOperatorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#templateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDeclaration(PseudoCodeParser.TemplateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#templateparameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateparameterList(PseudoCodeParser.TemplateparameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#templateParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateParameter(PseudoCodeParser.TemplateParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(PseudoCodeParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#simpleTemplateId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTemplateId(PseudoCodeParser.SimpleTemplateIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#templateId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateId(PseudoCodeParser.TemplateIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#templateName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateName(PseudoCodeParser.TemplateNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#templateArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateArgumentList(PseudoCodeParser.TemplateArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#templateArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateArgument(PseudoCodeParser.TemplateArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeNameSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNameSpecifier(PseudoCodeParser.TypeNameSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#explicitInstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitInstantiation(PseudoCodeParser.ExplicitInstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#explicitSpecialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitSpecialization(PseudoCodeParser.ExplicitSpecializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#tryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryBlock(PseudoCodeParser.TryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#functionTryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTryBlock(PseudoCodeParser.FunctionTryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#handlerSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerSeq(PseudoCodeParser.HandlerSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandler(PseudoCodeParser.HandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionDeclaration(PseudoCodeParser.ExceptionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#throwExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowExpression(PseudoCodeParser.ThrowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#exceptionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionSpecification(PseudoCodeParser.ExceptionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#dynamicExceptionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicExceptionSpecification(PseudoCodeParser.DynamicExceptionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeIdList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdList(PseudoCodeParser.TypeIdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#noeExceptSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoeExceptSpecification(PseudoCodeParser.NoeExceptSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#theOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheOperator(PseudoCodeParser.TheOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PseudoCodeParser.LiteralContext ctx);
}