// Generated from C:/Users/ShyreneChing/Desktop/DLSU/AY 2020-2021 Term 1/CMPILER/MP/MC01/MP Parser/MP Parser/src\PseudoCode.g4 by ANTLR 4.9
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
	 * Visit a parse tree produced by {@link PseudoCodeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PseudoCodeParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PseudoCodeParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(PseudoCodeParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(PseudoCodeParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(PseudoCodeParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(PseudoCodeParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(PseudoCodeParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(PseudoCodeParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(PseudoCodeParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(PseudoCodeParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(PseudoCodeParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(PseudoCodeParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(PseudoCodeParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(PseudoCodeParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(PseudoCodeParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(PseudoCodeParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(PseudoCodeParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(PseudoCodeParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(PseudoCodeParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(PseudoCodeParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(PseudoCodeParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(PseudoCodeParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(PseudoCodeParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(PseudoCodeParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(PseudoCodeParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(PseudoCodeParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(PseudoCodeParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(PseudoCodeParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(PseudoCodeParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(PseudoCodeParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(PseudoCodeParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(PseudoCodeParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(PseudoCodeParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#mainDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDeclaration(PseudoCodeParser.MainDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(PseudoCodeParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(PseudoCodeParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(PseudoCodeParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(PseudoCodeParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(PseudoCodeParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(PseudoCodeParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(PseudoCodeParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(PseudoCodeParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(PseudoCodeParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(PseudoCodeParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(PseudoCodeParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(PseudoCodeParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(PseudoCodeParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(PseudoCodeParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(PseudoCodeParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(PseudoCodeParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(PseudoCodeParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(PseudoCodeParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(PseudoCodeParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(PseudoCodeParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(PseudoCodeParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(PseudoCodeParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(PseudoCodeParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(PseudoCodeParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(PseudoCodeParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(PseudoCodeParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(PseudoCodeParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(PseudoCodeParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(PseudoCodeParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(PseudoCodeParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(PseudoCodeParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(PseudoCodeParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(PseudoCodeParser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(PseudoCodeParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(PseudoCodeParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(PseudoCodeParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(PseudoCodeParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(PseudoCodeParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(PseudoCodeParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(PseudoCodeParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(PseudoCodeParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(PseudoCodeParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(PseudoCodeParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(PseudoCodeParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(PseudoCodeParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(PseudoCodeParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(PseudoCodeParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(PseudoCodeParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(PseudoCodeParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(PseudoCodeParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(PseudoCodeParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(PseudoCodeParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(PseudoCodeParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(PseudoCodeParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(PseudoCodeParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(PseudoCodeParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(PseudoCodeParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(PseudoCodeParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(PseudoCodeParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(PseudoCodeParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(PseudoCodeParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(PseudoCodeParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(PseudoCodeParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(PseudoCodeParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(PseudoCodeParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(PseudoCodeParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(PseudoCodeParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(PseudoCodeParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(PseudoCodeParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(PseudoCodeParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(PseudoCodeParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(PseudoCodeParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(PseudoCodeParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(PseudoCodeParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(PseudoCodeParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(PseudoCodeParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(PseudoCodeParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(PseudoCodeParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(PseudoCodeParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(PseudoCodeParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(PseudoCodeParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(PseudoCodeParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(PseudoCodeParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(PseudoCodeParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(PseudoCodeParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(PseudoCodeParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(PseudoCodeParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(PseudoCodeParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(PseudoCodeParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(PseudoCodeParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(PseudoCodeParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(PseudoCodeParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(PseudoCodeParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PseudoCodeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(PseudoCodeParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(PseudoCodeParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(PseudoCodeParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(PseudoCodeParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PseudoCodeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(PseudoCodeParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(PseudoCodeParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(PseudoCodeParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(PseudoCodeParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(PseudoCodeParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(PseudoCodeParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(PseudoCodeParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#printInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintInvocation(PseudoCodeParser.PrintInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#scanInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanInvocation(PseudoCodeParser.ScanInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(PseudoCodeParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(PseudoCodeParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(PseudoCodeParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(PseudoCodeParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(PseudoCodeParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(PseudoCodeParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(PseudoCodeParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(PseudoCodeParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(PseudoCodeParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(PseudoCodeParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(PseudoCodeParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(PseudoCodeParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(PseudoCodeParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PseudoCodeParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(PseudoCodeParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#pseudoForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoForStatement(PseudoCodeParser.PseudoForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(PseudoCodeParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#forinitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForinitializer(PseudoCodeParser.ForinitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#customAssignError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomAssignError(PseudoCodeParser.CustomAssignErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(PseudoCodeParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(PseudoCodeParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(PseudoCodeParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(PseudoCodeParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(PseudoCodeParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(PseudoCodeParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(PseudoCodeParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(PseudoCodeParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(PseudoCodeParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(PseudoCodeParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(PseudoCodeParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(PseudoCodeParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(PseudoCodeParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(PseudoCodeParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(PseudoCodeParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(PseudoCodeParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(PseudoCodeParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(PseudoCodeParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(PseudoCodeParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(PseudoCodeParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(PseudoCodeParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(PseudoCodeParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(PseudoCodeParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(PseudoCodeParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(PseudoCodeParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(PseudoCodeParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(PseudoCodeParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(PseudoCodeParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(PseudoCodeParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(PseudoCodeParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(PseudoCodeParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(PseudoCodeParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(PseudoCodeParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(PseudoCodeParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(PseudoCodeParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(PseudoCodeParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(PseudoCodeParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(PseudoCodeParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(PseudoCodeParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(PseudoCodeParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(PseudoCodeParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(PseudoCodeParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(PseudoCodeParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(PseudoCodeParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(PseudoCodeParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(PseudoCodeParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PseudoCodeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#errorParenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorParenthesis(PseudoCodeParser.ErrorParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(PseudoCodeParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(PseudoCodeParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(PseudoCodeParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(PseudoCodeParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(PseudoCodeParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PseudoCodeParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(PseudoCodeParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(PseudoCodeParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(PseudoCodeParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#onlyConditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyConditionalExpression(PseudoCodeParser.OnlyConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(PseudoCodeParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#onlyConditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyConditionalOrExpression(PseudoCodeParser.OnlyConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(PseudoCodeParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#onlyConditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyConditionalAndExpression(PseudoCodeParser.OnlyConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(PseudoCodeParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(PseudoCodeParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(PseudoCodeParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(PseudoCodeParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#onlyEqualityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyEqualityExpression(PseudoCodeParser.OnlyEqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(PseudoCodeParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#onlyRelationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyRelationalExpression(PseudoCodeParser.OnlyRelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(PseudoCodeParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(PseudoCodeParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#additiveExpressionfactored}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpressionfactored(PseudoCodeParser.AdditiveExpressionfactoredContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#addminus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddminus(PseudoCodeParser.AddminusContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(PseudoCodeParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#multiplicativeExpressionfactored}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpressionfactored(PseudoCodeParser.MultiplicativeExpressionfactoredContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(PseudoCodeParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(PseudoCodeParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(PseudoCodeParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(PseudoCodeParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(PseudoCodeParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(PseudoCodeParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#postfixExpressionInc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpressionInc(PseudoCodeParser.PostfixExpressionIncContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(PseudoCodeParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(PseudoCodeParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(PseudoCodeParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(PseudoCodeParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(PseudoCodeParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoCodeParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(PseudoCodeParser.CastExpressionContext ctx);
}