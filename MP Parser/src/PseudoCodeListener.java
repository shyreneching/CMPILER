// Generated from C:/Users/erwin/Desktop/CMPILER/MP-Parser/MP Parser/src\PseudoCode.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PseudoCodeParser}.
 */
public interface PseudoCodeListener extends ParseTreeListener {
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
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PseudoCodeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PseudoCodeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(PseudoCodeParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(PseudoCodeParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(PseudoCodeParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(PseudoCodeParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(PseudoCodeParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(PseudoCodeParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(PseudoCodeParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(PseudoCodeParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(PseudoCodeParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(PseudoCodeParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(PseudoCodeParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(PseudoCodeParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(PseudoCodeParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(PseudoCodeParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(PseudoCodeParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(PseudoCodeParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(PseudoCodeParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(PseudoCodeParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(PseudoCodeParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(PseudoCodeParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(PseudoCodeParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(PseudoCodeParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(PseudoCodeParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(PseudoCodeParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(PseudoCodeParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(PseudoCodeParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(PseudoCodeParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(PseudoCodeParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(PseudoCodeParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(PseudoCodeParser.DimsContext ctx);
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(PseudoCodeParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(PseudoCodeParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(PseudoCodeParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(PseudoCodeParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(PseudoCodeParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(PseudoCodeParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(PseudoCodeParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(PseudoCodeParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(PseudoCodeParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(PseudoCodeParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(PseudoCodeParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(PseudoCodeParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(PseudoCodeParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(PseudoCodeParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(PseudoCodeParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(PseudoCodeParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(PseudoCodeParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(PseudoCodeParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(PseudoCodeParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(PseudoCodeParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(PseudoCodeParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(PseudoCodeParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(PseudoCodeParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(PseudoCodeParser.ExpressionNameContext ctx);
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(PseudoCodeParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(PseudoCodeParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(PseudoCodeParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(PseudoCodeParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(PseudoCodeParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(PseudoCodeParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(PseudoCodeParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(PseudoCodeParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(PseudoCodeParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(PseudoCodeParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(PseudoCodeParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(PseudoCodeParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(PseudoCodeParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(PseudoCodeParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(PseudoCodeParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(PseudoCodeParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(PseudoCodeParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(PseudoCodeParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(PseudoCodeParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(PseudoCodeParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(PseudoCodeParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(PseudoCodeParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(PseudoCodeParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(PseudoCodeParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(PseudoCodeParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(PseudoCodeParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(PseudoCodeParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(PseudoCodeParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(PseudoCodeParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(PseudoCodeParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(PseudoCodeParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(PseudoCodeParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(PseudoCodeParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(PseudoCodeParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(PseudoCodeParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(PseudoCodeParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(PseudoCodeParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(PseudoCodeParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(PseudoCodeParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(PseudoCodeParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(PseudoCodeParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(PseudoCodeParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(PseudoCodeParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(PseudoCodeParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(PseudoCodeParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(PseudoCodeParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(PseudoCodeParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(PseudoCodeParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(PseudoCodeParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(PseudoCodeParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(PseudoCodeParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(PseudoCodeParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(PseudoCodeParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(PseudoCodeParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(PseudoCodeParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(PseudoCodeParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(PseudoCodeParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(PseudoCodeParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(PseudoCodeParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(PseudoCodeParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(PseudoCodeParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(PseudoCodeParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(PseudoCodeParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(PseudoCodeParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(PseudoCodeParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(PseudoCodeParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(PseudoCodeParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(PseudoCodeParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(PseudoCodeParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(PseudoCodeParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(PseudoCodeParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(PseudoCodeParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(PseudoCodeParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(PseudoCodeParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(PseudoCodeParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(PseudoCodeParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(PseudoCodeParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(PseudoCodeParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(PseudoCodeParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(PseudoCodeParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(PseudoCodeParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(PseudoCodeParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(PseudoCodeParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(PseudoCodeParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(PseudoCodeParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(PseudoCodeParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(PseudoCodeParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(PseudoCodeParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(PseudoCodeParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(PseudoCodeParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(PseudoCodeParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(PseudoCodeParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(PseudoCodeParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(PseudoCodeParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(PseudoCodeParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(PseudoCodeParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(PseudoCodeParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(PseudoCodeParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(PseudoCodeParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(PseudoCodeParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(PseudoCodeParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(PseudoCodeParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(PseudoCodeParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(PseudoCodeParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(PseudoCodeParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(PseudoCodeParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(PseudoCodeParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(PseudoCodeParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(PseudoCodeParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(PseudoCodeParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(PseudoCodeParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(PseudoCodeParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(PseudoCodeParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(PseudoCodeParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(PseudoCodeParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(PseudoCodeParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(PseudoCodeParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(PseudoCodeParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(PseudoCodeParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(PseudoCodeParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(PseudoCodeParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(PseudoCodeParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(PseudoCodeParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(PseudoCodeParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(PseudoCodeParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(PseudoCodeParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(PseudoCodeParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(PseudoCodeParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(PseudoCodeParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(PseudoCodeParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(PseudoCodeParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(PseudoCodeParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(PseudoCodeParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(PseudoCodeParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(PseudoCodeParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(PseudoCodeParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(PseudoCodeParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(PseudoCodeParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(PseudoCodeParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(PseudoCodeParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(PseudoCodeParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(PseudoCodeParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(PseudoCodeParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(PseudoCodeParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(PseudoCodeParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(PseudoCodeParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(PseudoCodeParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(PseudoCodeParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(PseudoCodeParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(PseudoCodeParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(PseudoCodeParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(PseudoCodeParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(PseudoCodeParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(PseudoCodeParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(PseudoCodeParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(PseudoCodeParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(PseudoCodeParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(PseudoCodeParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(PseudoCodeParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(PseudoCodeParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(PseudoCodeParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(PseudoCodeParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(PseudoCodeParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(PseudoCodeParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(PseudoCodeParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(PseudoCodeParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(PseudoCodeParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(PseudoCodeParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(PseudoCodeParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(PseudoCodeParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(PseudoCodeParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(PseudoCodeParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(PseudoCodeParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(PseudoCodeParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(PseudoCodeParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(PseudoCodeParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(PseudoCodeParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(PseudoCodeParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(PseudoCodeParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(PseudoCodeParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(PseudoCodeParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(PseudoCodeParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(PseudoCodeParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(PseudoCodeParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(PseudoCodeParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(PseudoCodeParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(PseudoCodeParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(PseudoCodeParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(PseudoCodeParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(PseudoCodeParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(PseudoCodeParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(PseudoCodeParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PseudoCodeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PseudoCodeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(PseudoCodeParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(PseudoCodeParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(PseudoCodeParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(PseudoCodeParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(PseudoCodeParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(PseudoCodeParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(PseudoCodeParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(PseudoCodeParser.LocalVariableDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(PseudoCodeParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(PseudoCodeParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(PseudoCodeParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(PseudoCodeParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PseudoCodeParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PseudoCodeParser.EmptyStatementContext ctx);
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(PseudoCodeParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(PseudoCodeParser.LabeledStatementNoShortIfContext ctx);
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(PseudoCodeParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(PseudoCodeParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#printInvocation}.
	 * @param ctx the parse tree
	 */
	void enterPrintInvocation(PseudoCodeParser.PrintInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#printInvocation}.
	 * @param ctx the parse tree
	 */
	void exitPrintInvocation(PseudoCodeParser.PrintInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#scanInvocation}.
	 * @param ctx the parse tree
	 */
	void enterScanInvocation(PseudoCodeParser.ScanInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#scanInvocation}.
	 * @param ctx the parse tree
	 */
	void exitScanInvocation(PseudoCodeParser.ScanInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(PseudoCodeParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(PseudoCodeParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(PseudoCodeParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(PseudoCodeParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(PseudoCodeParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(PseudoCodeParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(PseudoCodeParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(PseudoCodeParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(PseudoCodeParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(PseudoCodeParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(PseudoCodeParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(PseudoCodeParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(PseudoCodeParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(PseudoCodeParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(PseudoCodeParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(PseudoCodeParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(PseudoCodeParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(PseudoCodeParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(PseudoCodeParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(PseudoCodeParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PseudoCodeParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PseudoCodeParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(PseudoCodeParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(PseudoCodeParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(PseudoCodeParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(PseudoCodeParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PseudoCodeParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PseudoCodeParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(PseudoCodeParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(PseudoCodeParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#pseudoForStatement}.
	 * @param ctx the parse tree
	 */
	void enterPseudoForStatement(PseudoCodeParser.PseudoForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#pseudoForStatement}.
	 * @param ctx the parse tree
	 */
	void exitPseudoForStatement(PseudoCodeParser.PseudoForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(PseudoCodeParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(PseudoCodeParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(PseudoCodeParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(PseudoCodeParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(PseudoCodeParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(PseudoCodeParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#forinitializer}.
	 * @param ctx the parse tree
	 */
	void enterForinitializer(PseudoCodeParser.ForinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#forinitializer}.
	 * @param ctx the parse tree
	 */
	void exitForinitializer(PseudoCodeParser.ForinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#customAssignError}.
	 * @param ctx the parse tree
	 */
	void enterCustomAssignError(PseudoCodeParser.CustomAssignErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#customAssignError}.
	 * @param ctx the parse tree
	 */
	void exitCustomAssignError(PseudoCodeParser.CustomAssignErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(PseudoCodeParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(PseudoCodeParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(PseudoCodeParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(PseudoCodeParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(PseudoCodeParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(PseudoCodeParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(PseudoCodeParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(PseudoCodeParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(PseudoCodeParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(PseudoCodeParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(PseudoCodeParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(PseudoCodeParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(PseudoCodeParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(PseudoCodeParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(PseudoCodeParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(PseudoCodeParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(PseudoCodeParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(PseudoCodeParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(PseudoCodeParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(PseudoCodeParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(PseudoCodeParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(PseudoCodeParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(PseudoCodeParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(PseudoCodeParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(PseudoCodeParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(PseudoCodeParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(PseudoCodeParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(PseudoCodeParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(PseudoCodeParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(PseudoCodeParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(PseudoCodeParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(PseudoCodeParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(PseudoCodeParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(PseudoCodeParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(PseudoCodeParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(PseudoCodeParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(PseudoCodeParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(PseudoCodeParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(PseudoCodeParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(PseudoCodeParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(PseudoCodeParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(PseudoCodeParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(PseudoCodeParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(PseudoCodeParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(PseudoCodeParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(PseudoCodeParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(PseudoCodeParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(PseudoCodeParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(PseudoCodeParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(PseudoCodeParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(PseudoCodeParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(PseudoCodeParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(PseudoCodeParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(PseudoCodeParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(PseudoCodeParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(PseudoCodeParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(PseudoCodeParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(PseudoCodeParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(PseudoCodeParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(PseudoCodeParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(PseudoCodeParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(PseudoCodeParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(PseudoCodeParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(PseudoCodeParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(PseudoCodeParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(PseudoCodeParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(PseudoCodeParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(PseudoCodeParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(PseudoCodeParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(PseudoCodeParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(PseudoCodeParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(PseudoCodeParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(PseudoCodeParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(PseudoCodeParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(PseudoCodeParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(PseudoCodeParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(PseudoCodeParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(PseudoCodeParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(PseudoCodeParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(PseudoCodeParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(PseudoCodeParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(PseudoCodeParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(PseudoCodeParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(PseudoCodeParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(PseudoCodeParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(PseudoCodeParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(PseudoCodeParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(PseudoCodeParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(PseudoCodeParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(PseudoCodeParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(PseudoCodeParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(PseudoCodeParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(PseudoCodeParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(PseudoCodeParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(PseudoCodeParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(PseudoCodeParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(PseudoCodeParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(PseudoCodeParser.DimExprContext ctx);
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(PseudoCodeParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(PseudoCodeParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(PseudoCodeParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(PseudoCodeParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(PseudoCodeParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(PseudoCodeParser.LambdaBodyContext ctx);
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PseudoCodeParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PseudoCodeParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(PseudoCodeParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(PseudoCodeParser.LeftHandSideContext ctx);
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#onlyConditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterOnlyConditionalExpression(PseudoCodeParser.OnlyConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#onlyConditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitOnlyConditionalExpression(PseudoCodeParser.OnlyConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(PseudoCodeParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(PseudoCodeParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#onlyConditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterOnlyConditionalOrExpression(PseudoCodeParser.OnlyConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#onlyConditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitOnlyConditionalOrExpression(PseudoCodeParser.OnlyConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(PseudoCodeParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(PseudoCodeParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#onlyConditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterOnlyConditionalAndExpression(PseudoCodeParser.OnlyConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#onlyConditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitOnlyConditionalAndExpression(PseudoCodeParser.OnlyConditionalAndExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#onlyEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void enterOnlyEqualityExpression(PseudoCodeParser.OnlyEqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#onlyEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void exitOnlyEqualityExpression(PseudoCodeParser.OnlyEqualityExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#onlyRelationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterOnlyRelationalExpression(PseudoCodeParser.OnlyRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#onlyRelationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitOnlyRelationalExpression(PseudoCodeParser.OnlyRelationalExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#additiveExpressionfactored}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpressionfactored(PseudoCodeParser.AdditiveExpressionfactoredContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#additiveExpressionfactored}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpressionfactored(PseudoCodeParser.AdditiveExpressionfactoredContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#addminus}.
	 * @param ctx the parse tree
	 */
	void enterAddminus(PseudoCodeParser.AddminusContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#addminus}.
	 * @param ctx the parse tree
	 */
	void exitAddminus(PseudoCodeParser.AddminusContext ctx);
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#multiplicativeExpressionfactored}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpressionfactored(PseudoCodeParser.MultiplicativeExpressionfactoredContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#multiplicativeExpressionfactored}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpressionfactored(PseudoCodeParser.MultiplicativeExpressionfactoredContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(PseudoCodeParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(PseudoCodeParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(PseudoCodeParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(PseudoCodeParser.MultContext ctx);
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(PseudoCodeParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(PseudoCodeParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(PseudoCodeParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(PseudoCodeParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(PseudoCodeParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(PseudoCodeParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#postfixExpressionInc}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpressionInc(PseudoCodeParser.PostfixExpressionIncContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#postfixExpressionInc}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpressionInc(PseudoCodeParser.PostfixExpressionIncContext ctx);
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
	 * Enter a parse tree produced by {@link PseudoCodeParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(PseudoCodeParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(PseudoCodeParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(PseudoCodeParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(PseudoCodeParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(PseudoCodeParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(PseudoCodeParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudoCodeParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(PseudoCodeParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudoCodeParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(PseudoCodeParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
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
}