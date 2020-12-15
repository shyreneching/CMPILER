package gen;// Generated from C:/Users/ShyreneChing/Desktop/DLSU/AY 2020-2021 Term 1/CMPILER/MP/MC01/MP Parser/MP Parser/src\PseudoParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PseudoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PseudoParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PseudoParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(PseudoParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(PseudoParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#idExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(PseudoParser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#unqualifiedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedId(PseudoParser.UnqualifiedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#qualifiedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedId(PseudoParser.QualifiedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#nestedNameSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedNameSpecifier(PseudoParser.NestedNameSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(PseudoParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#lambdaIntroducer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaIntroducer(PseudoParser.LambdaIntroducerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#lambdaCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaCapture(PseudoParser.LambdaCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#captureDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureDefault(PseudoParser.CaptureDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#captureList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureList(PseudoParser.CaptureListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#capture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture(PseudoParser.CaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#simpleCapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCapture(PseudoParser.SimpleCaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#initcapture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitcapture(PseudoParser.InitcaptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#lambdaDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaDeclarator(PseudoParser.LambdaDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(PseudoParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#typeIdOfTheTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdOfTheTypeId(PseudoParser.TypeIdOfTheTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(PseudoParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#pseudoDestructorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoDestructorName(PseudoParser.PseudoDestructorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(PseudoParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(PseudoParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(PseudoParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#newPlacement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewPlacement(PseudoParser.NewPlacementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#newTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewTypeId(PseudoParser.NewTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#newDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDeclarator(PseudoParser.NewDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#noPointerNewDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerNewDeclarator(PseudoParser.NoPointerNewDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#newInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewInitializer(PseudoParser.NewInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#deleteExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteExpression(PseudoParser.DeleteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#noExceptExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoExceptExpression(PseudoParser.NoExceptExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(PseudoParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#pointerMemberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerMemberExpression(PseudoParser.PointerMemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(PseudoParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(PseudoParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(PseudoParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#shiftOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOperator(PseudoParser.ShiftOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(PseudoParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(PseudoParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(PseudoParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(PseudoParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(PseudoParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(PseudoParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(PseudoParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(PseudoParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(PseudoParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(PseudoParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PseudoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(PseudoParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PseudoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(PseudoParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(PseudoParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PseudoParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#statementSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSeq(PseudoParser.StatementSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(PseudoParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PseudoParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(PseudoParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#forInitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitStatement(PseudoParser.ForInitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#forRangeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRangeDeclaration(PseudoParser.ForRangeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#forRangeInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRangeInitializer(PseudoParser.ForRangeInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(PseudoParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(PseudoParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#declarationseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationseq(PseudoParser.DeclarationseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(PseudoParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#blockDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockDeclaration(PseudoParser.BlockDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#aliasDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasDeclaration(PseudoParser.AliasDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#simpleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDeclaration(PseudoParser.SimpleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(PseudoParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#emptyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyDeclaration(PseudoParser.EmptyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDeclaration(PseudoParser.AttributeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#declSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifier(PseudoParser.DeclSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#declSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSpecifierSeq(PseudoParser.DeclSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(PseudoParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(PseudoParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(PseudoParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(PseudoParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#trailingTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingTypeSpecifier(PseudoParser.TrailingTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#typeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifierSeq(PseudoParser.TypeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#trailingTypeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingTypeSpecifierSeq(PseudoParser.TrailingTypeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#simpleTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeSpecifier(PseudoParser.SimpleTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#theTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheTypeName(PseudoParser.TheTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#decltypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecltypeSpecifier(PseudoParser.DecltypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#elaboratedTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElaboratedTypeSpecifier(PseudoParser.ElaboratedTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#enumName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumName(PseudoParser.EnumNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(PseudoParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#enumHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumHead(PseudoParser.EnumHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#opaqueEnumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpaqueEnumDeclaration(PseudoParser.OpaqueEnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#enumkey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumkey(PseudoParser.EnumkeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#enumbase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumbase(PseudoParser.EnumbaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(PseudoParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#enumeratorDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorDefinition(PseudoParser.EnumeratorDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(PseudoParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#namespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceName(PseudoParser.NamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#originalNamespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginalNamespaceName(PseudoParser.OriginalNamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDefinition(PseudoParser.NamespaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#namespaceAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAlias(PseudoParser.NamespaceAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#namespaceAliasDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAliasDefinition(PseudoParser.NamespaceAliasDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiednamespacespecifier(PseudoParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#usingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDeclaration(PseudoParser.UsingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#usingDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingDirective(PseudoParser.UsingDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#asmDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsmDefinition(PseudoParser.AsmDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#linkageSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkageSpecification(PseudoParser.LinkageSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#attributeSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifierSeq(PseudoParser.AttributeSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifier(PseudoParser.AttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentspecifier(PseudoParser.AlignmentspecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#attributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeList(PseudoParser.AttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(PseudoParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#attributeNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeNamespace(PseudoParser.AttributeNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeArgumentClause(PseudoParser.AttributeArgumentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#balancedTokenSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedTokenSeq(PseudoParser.BalancedTokenSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#balancedtoken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalancedtoken(PseudoParser.BalancedtokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(PseudoParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(PseudoParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(PseudoParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#pointerDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerDeclarator(PseudoParser.PointerDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#noPointerDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerDeclarator(PseudoParser.NoPointerDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#parametersAndQualifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersAndQualifiers(PseudoParser.ParametersAndQualifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#trailingReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailingReturnType(PseudoParser.TrailingReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#pointerOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerOperator(PseudoParser.PointerOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvqualifierseq(PseudoParser.CvqualifierseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#cvQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCvQualifier(PseudoParser.CvQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#refqualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefqualifier(PseudoParser.RefqualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#declaratorid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorid(PseudoParser.DeclaratoridContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#theTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheTypeId(PseudoParser.TheTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(PseudoParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#pointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerAbstractDeclarator(PseudoParser.PointerAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#noPointerAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerAbstractDeclarator(PseudoParser.NoPointerAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#abstractPackDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractPackDeclarator(PseudoParser.AbstractPackDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#noPointerAbstractPackDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoPointerAbstractPackDeclarator(PseudoParser.NoPointerAbstractPackDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#parameterDeclarationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationClause(PseudoParser.ParameterDeclarationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationList(PseudoParser.ParameterDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(PseudoParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(PseudoParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(PseudoParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(PseudoParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#braceOrEqualInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceOrEqualInitializer(PseudoParser.BraceOrEqualInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#initializerClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerClause(PseudoParser.InitializerClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(PseudoParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#bracedInitList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedInitList(PseudoParser.BracedInitListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(PseudoParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#classSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSpecifier(PseudoParser.ClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#classHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHead(PseudoParser.ClassHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#classHeadName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeadName(PseudoParser.ClassHeadNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#classVirtSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVirtSpecifier(PseudoParser.ClassVirtSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#classKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassKey(PseudoParser.ClassKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#memberSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberSpecification(PseudoParser.MemberSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#memberdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberdeclaration(PseudoParser.MemberdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#memberDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaratorList(PseudoParser.MemberDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#memberDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclarator(PseudoParser.MemberDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#virtualSpecifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtualSpecifierSeq(PseudoParser.VirtualSpecifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#virtualSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtualSpecifier(PseudoParser.VirtualSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#pureSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureSpecifier(PseudoParser.PureSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#baseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseClause(PseudoParser.BaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#baseSpecifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseSpecifierList(PseudoParser.BaseSpecifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#baseSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseSpecifier(PseudoParser.BaseSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#classOrDeclType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrDeclType(PseudoParser.ClassOrDeclTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#baseTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseTypeSpecifier(PseudoParser.BaseTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#accessSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessSpecifier(PseudoParser.AccessSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#conversionFunctionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionFunctionId(PseudoParser.ConversionFunctionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#conversionTypeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionTypeId(PseudoParser.ConversionTypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#conversionDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversionDeclarator(PseudoParser.ConversionDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#constructorInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorInitializer(PseudoParser.ConstructorInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#memInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemInitializerList(PseudoParser.MemInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#memInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemInitializer(PseudoParser.MemInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#meminitializerid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeminitializerid(PseudoParser.MeminitializeridContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#operatorFunctionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorFunctionId(PseudoParser.OperatorFunctionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#literalOperatorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralOperatorId(PseudoParser.LiteralOperatorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#templateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDeclaration(PseudoParser.TemplateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#templateparameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateparameterList(PseudoParser.TemplateparameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#templateParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateParameter(PseudoParser.TemplateParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(PseudoParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#simpleTemplateId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTemplateId(PseudoParser.SimpleTemplateIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#templateId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateId(PseudoParser.TemplateIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#templateName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateName(PseudoParser.TemplateNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#templateArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateArgumentList(PseudoParser.TemplateArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#templateArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateArgument(PseudoParser.TemplateArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#typeNameSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNameSpecifier(PseudoParser.TypeNameSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#explicitInstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitInstantiation(PseudoParser.ExplicitInstantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#explicitSpecialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitSpecialization(PseudoParser.ExplicitSpecializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#tryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryBlock(PseudoParser.TryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#functionTryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTryBlock(PseudoParser.FunctionTryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#handlerSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerSeq(PseudoParser.HandlerSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandler(PseudoParser.HandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionDeclaration(PseudoParser.ExceptionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#throwExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowExpression(PseudoParser.ThrowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#exceptionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionSpecification(PseudoParser.ExceptionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#dynamicExceptionSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicExceptionSpecification(PseudoParser.DynamicExceptionSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#typeIdList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdList(PseudoParser.TypeIdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#noeExceptSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoeExceptSpecification(PseudoParser.NoeExceptSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#theOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheOperator(PseudoParser.TheOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PseudoParser.LiteralContext ctx);
}