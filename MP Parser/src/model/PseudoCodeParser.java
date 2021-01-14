// Generated from C:/Users/ShyreneChing/Desktop/DLSU/AY 2020-2021 Term 1/CMPILER/MP/MC01/MP Parser/MP Parser/src\PseudoCode.g4 by ANTLR 4.9
package model;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudoCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, SCAN=2, FUNC=3, MAIN=4, STRING=5, CONSTANT=6, CREATE=7, THEN=8, 
		ABSTRACT=9, ASSERT=10, BOOL=11, BREAK=12, BYTE=13, CASE=14, CATCH=15, 
		CHAR=16, CLASS=17, CONST=18, CONTINUE=19, DEFAULT=20, DO=21, DOUBLE=22, 
		ELSE=23, ENUM=24, EXTENDS=25, FINAL=26, FINALLY=27, FLOAT=28, FOR=29, 
		IF=30, GOTO=31, IMPLEMENTS=32, IMPORT=33, INSTANCEOF=34, INT=35, INTERFACE=36, 
		LONG=37, NATIVE=38, NEW=39, PACKAGE=40, PRIVATE=41, PROTECTED=42, PUBLIC=43, 
		RETURN=44, SHORT=45, STATIC=46, STRICTFP=47, SUPER=48, SWITCH=49, SYNCHRONIZED=50, 
		THIS=51, THROW=52, THROWS=53, TRANSIENT=54, TRY=55, VOID=56, VOLATILE=57, 
		WHILE=58, UPTO=59, DOWNTO=60, IntegerLiteral=61, FloatingPointLiteral=62, 
		BooleanLiteral=63, CharacterLiteral=64, StringLiteral=65, NullLiteral=66, 
		LPAREN=67, RPAREN=68, LBRACE=69, RBRACE=70, LBRACK=71, RBRACK=72, SEMI=73, 
		COMMA=74, DOT=75, ASSIGN=76, GT=77, LT=78, BANG=79, TILDE=80, QUESTION=81, 
		COLON=82, EQUAL=83, LE=84, GE=85, NOTEQUAL=86, AND=87, OR=88, INC=89, 
		DEC=90, ADD=91, SUB=92, MUL=93, DIV=94, BITAND=95, BITOR=96, CARET=97, 
		MOD=98, ARROW=99, COLONCOLON=100, ADD_ASSIGN=101, SUB_ASSIGN=102, MUL_ASSIGN=103, 
		DIV_ASSIGN=104, AND_ASSIGN=105, OR_ASSIGN=106, XOR_ASSIGN=107, MOD_ASSIGN=108, 
		LSHIFT_ASSIGN=109, RSHIFT_ASSIGN=110, URSHIFT_ASSIGN=111, Identifier=112, 
		AT=113, ELLIPSIS=114, WS=115, COMMENT=116, LINE_COMMENT=117, StringCharacter=118;
	public static final int
		RULE_literal = 0, RULE_type = 1, RULE_primitiveType = 2, RULE_numericType = 3, 
		RULE_integralType = 4, RULE_floatingPointType = 5, RULE_referenceType = 6, 
		RULE_classOrInterfaceType = 7, RULE_classType = 8, RULE_classType_lf_classOrInterfaceType = 9, 
		RULE_classType_lfno_classOrInterfaceType = 10, RULE_interfaceType = 11, 
		RULE_interfaceType_lf_classOrInterfaceType = 12, RULE_interfaceType_lfno_classOrInterfaceType = 13, 
		RULE_typeVariable = 14, RULE_arrayType = 15, RULE_dims = 16, RULE_typeParameter = 17, 
		RULE_typeParameterModifier = 18, RULE_typeBound = 19, RULE_additionalBound = 20, 
		RULE_typeArguments = 21, RULE_typeArgumentList = 22, RULE_typeArgument = 23, 
		RULE_wildcard = 24, RULE_wildcardBounds = 25, RULE_packageName = 26, RULE_typeName = 27, 
		RULE_packageOrTypeName = 28, RULE_expressionName = 29, RULE_methodName = 30, 
		RULE_ambiguousName = 31, RULE_compilationUnit = 32, RULE_mainDeclaration = 33, 
		RULE_packageDeclaration = 34, RULE_packageModifier = 35, RULE_importDeclaration = 36, 
		RULE_singleTypeImportDeclaration = 37, RULE_typeImportOnDemandDeclaration = 38, 
		RULE_singleStaticImportDeclaration = 39, RULE_staticImportOnDemandDeclaration = 40, 
		RULE_typeDeclaration = 41, RULE_classDeclaration = 42, RULE_normalClassDeclaration = 43, 
		RULE_classModifier = 44, RULE_typeParameters = 45, RULE_typeParameterList = 46, 
		RULE_superclass = 47, RULE_superinterfaces = 48, RULE_interfaceTypeList = 49, 
		RULE_classBody = 50, RULE_classBodyDeclaration = 51, RULE_classMemberDeclaration = 52, 
		RULE_fieldDeclaration = 53, RULE_fieldModifier = 54, RULE_variableDeclaratorList = 55, 
		RULE_variableDeclarator = 56, RULE_variableDeclaratorId = 57, RULE_variableInitializer = 58, 
		RULE_unannType = 59, RULE_unannPrimitiveType = 60, RULE_unannReferenceType = 61, 
		RULE_unannClassOrInterfaceType = 62, RULE_unannClassType = 63, RULE_unannClassType_lf_unannClassOrInterfaceType = 64, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 65, RULE_unannInterfaceType = 66, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 67, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 68, 
		RULE_unannTypeVariable = 69, RULE_unannArrayType = 70, RULE_methodDeclaration = 71, 
		RULE_methodModifier = 72, RULE_methodHeader = 73, RULE_result = 74, RULE_methodDeclarator = 75, 
		RULE_formalParameterList = 76, RULE_formalParameters = 77, RULE_formalParameter = 78, 
		RULE_variableModifier = 79, RULE_lastFormalParameter = 80, RULE_receiverParameter = 81, 
		RULE_throws_ = 82, RULE_exceptionTypeList = 83, RULE_exceptionType = 84, 
		RULE_methodBody = 85, RULE_instanceInitializer = 86, RULE_staticInitializer = 87, 
		RULE_constructorDeclaration = 88, RULE_constructorModifier = 89, RULE_constructorDeclarator = 90, 
		RULE_simpleTypeName = 91, RULE_constructorBody = 92, RULE_explicitConstructorInvocation = 93, 
		RULE_enumDeclaration = 94, RULE_enumBody = 95, RULE_enumConstantList = 96, 
		RULE_enumConstant = 97, RULE_enumConstantModifier = 98, RULE_enumBodyDeclarations = 99, 
		RULE_interfaceDeclaration = 100, RULE_normalInterfaceDeclaration = 101, 
		RULE_interfaceModifier = 102, RULE_extendsInterfaces = 103, RULE_interfaceBody = 104, 
		RULE_interfaceMemberDeclaration = 105, RULE_constantDeclaration = 106, 
		RULE_constantModifier = 107, RULE_interfaceMethodDeclaration = 108, RULE_interfaceMethodModifier = 109, 
		RULE_annotationTypeDeclaration = 110, RULE_annotationTypeBody = 111, RULE_annotationTypeMemberDeclaration = 112, 
		RULE_annotationTypeElementDeclaration = 113, RULE_annotationTypeElementModifier = 114, 
		RULE_defaultValue = 115, RULE_annotation = 116, RULE_normalAnnotation = 117, 
		RULE_elementValuePairList = 118, RULE_elementValuePair = 119, RULE_elementValue = 120, 
		RULE_elementValueArrayInitializer = 121, RULE_elementValueList = 122, 
		RULE_markerAnnotation = 123, RULE_singleElementAnnotation = 124, RULE_arrayInitializer = 125, 
		RULE_variableInitializerList = 126, RULE_block = 127, RULE_blockStatements = 128, 
		RULE_blockStatement = 129, RULE_localVariableDeclarationStatement = 130, 
		RULE_localVariableDeclaration = 131, RULE_statement = 132, RULE_statementNoShortIf = 133, 
		RULE_statementWithoutTrailingSubstatement = 134, RULE_emptyStatement = 135, 
		RULE_labeledStatement = 136, RULE_labeledStatementNoShortIf = 137, RULE_expressionStatement = 138, 
		RULE_statementExpression = 139, RULE_printInvocation = 140, RULE_stringCharactersDeclaration = 141, 
		RULE_scanInvocation = 142, RULE_ifThenStatement = 143, RULE_ifThenElseStatement = 144, 
		RULE_ifThenElseStatementNoShortIf = 145, RULE_assertStatement = 146, RULE_switchStatement = 147, 
		RULE_switchBlock = 148, RULE_switchBlockStatementGroup = 149, RULE_switchLabels = 150, 
		RULE_switchLabel = 151, RULE_enumConstantName = 152, RULE_whileStatement = 153, 
		RULE_whileStatementNoShortIf = 154, RULE_doStatement = 155, RULE_forStatement = 156, 
		RULE_forStatementNoShortIf = 157, RULE_pseudoForStatement = 158, RULE_forInit = 159, 
		RULE_forinitializer = 160, RULE_customAssignError = 161, RULE_breakStatement = 162, 
		RULE_continueStatement = 163, RULE_returnStatement = 164, RULE_throwStatement = 165, 
		RULE_synchronizedStatement = 166, RULE_tryStatement = 167, RULE_catches = 168, 
		RULE_catchClause = 169, RULE_catchFormalParameter = 170, RULE_catchType = 171, 
		RULE_finally_ = 172, RULE_tryWithResourcesStatement = 173, RULE_resourceSpecification = 174, 
		RULE_resourceList = 175, RULE_resource = 176, RULE_primary = 177, RULE_primaryNoNewArray = 178, 
		RULE_primaryNoNewArray_lf_arrayAccess = 179, RULE_primaryNoNewArray_lfno_arrayAccess = 180, 
		RULE_primaryNoNewArray_lf_primary = 181, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 182, 
		RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 183, RULE_primaryNoNewArray_lfno_primary = 184, 
		RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 185, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 186, 
		RULE_classInstanceCreationExpression = 187, RULE_classInstanceCreationExpression_lf_primary = 188, 
		RULE_classInstanceCreationExpression_lfno_primary = 189, RULE_typeArgumentsOrDiamond = 190, 
		RULE_fieldAccess = 191, RULE_fieldAccess_lf_primary = 192, RULE_fieldAccess_lfno_primary = 193, 
		RULE_arrayAccess = 194, RULE_arrayAccess_lf_primary = 195, RULE_arrayAccess_lfno_primary = 196, 
		RULE_methodInvocation = 197, RULE_methodInvocation_lf_primary = 198, RULE_methodInvocation_lfno_primary = 199, 
		RULE_argumentList = 200, RULE_methodReference = 201, RULE_methodReference_lf_primary = 202, 
		RULE_methodReference_lfno_primary = 203, RULE_arrayCreationExpression = 204, 
		RULE_dimExprs = 205, RULE_dimExpr = 206, RULE_constantExpression = 207, 
		RULE_expression = 208, RULE_errorParenthesis = 209, RULE_lambdaExpression = 210, 
		RULE_lambdaParameters = 211, RULE_inferredFormalParameterList = 212, RULE_lambdaBody = 213, 
		RULE_assignmentExpression = 214, RULE_assignment = 215, RULE_leftHandSide = 216, 
		RULE_assignmentOperator = 217, RULE_conditionalExpression = 218, RULE_onlyConditionalExpression = 219, 
		RULE_conditionalOrExpression = 220, RULE_onlyConditionalOrExpression = 221, 
		RULE_conditionalAndExpression = 222, RULE_onlyConditionalAndExpression = 223, 
		RULE_inclusiveOrExpression = 224, RULE_exclusiveOrExpression = 225, RULE_andExpression = 226, 
		RULE_equalityExpression = 227, RULE_onlyEqualityExpression = 228, RULE_relationalExpression = 229, 
		RULE_onlyRelationalExpression = 230, RULE_shiftExpression = 231, RULE_additiveExpression = 232, 
		RULE_additiveExpressionfactored = 233, RULE_addminus = 234, RULE_multiplicativeExpression = 235, 
		RULE_multiplicativeExpressionfactored = 236, RULE_arithmetic = 237, RULE_mult = 238, 
		RULE_unaryExpression = 239, RULE_preIncrementExpression = 240, RULE_preDecrementExpression = 241, 
		RULE_unaryExpressionNotPlusMinus = 242, RULE_postfixExpressionInc = 243, 
		RULE_postfixExpression = 244, RULE_postIncrementExpression = 245, RULE_postIncrementExpression_lf_postfixExpression = 246, 
		RULE_postDecrementExpression = 247, RULE_postDecrementExpression_lf_postfixExpression = 248, 
		RULE_castExpression = 249;
	private static String[] makeRuleNames() {
		return new String[] {
			"literal", "type", "primitiveType", "numericType", "integralType", "floatingPointType", 
			"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", 
			"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", 
			"interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType", 
			"dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", 
			"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
			"packageName", "typeName", "packageOrTypeName", "expressionName", "methodName", 
			"ambiguousName", "compilationUnit", "mainDeclaration", "packageDeclaration", 
			"packageModifier", "importDeclaration", "singleTypeImportDeclaration", 
			"typeImportOnDemandDeclaration", "singleStaticImportDeclaration", "staticImportOnDemandDeclaration", 
			"typeDeclaration", "classDeclaration", "normalClassDeclaration", "classModifier", 
			"typeParameters", "typeParameterList", "superclass", "superinterfaces", 
			"interfaceTypeList", "classBody", "classBodyDeclaration", "classMemberDeclaration", 
			"fieldDeclaration", "fieldModifier", "variableDeclaratorList", "variableDeclarator", 
			"variableDeclaratorId", "variableInitializer", "unannType", "unannPrimitiveType", 
			"unannReferenceType", "unannClassOrInterfaceType", "unannClassType", 
			"unannClassType_lf_unannClassOrInterfaceType", "unannClassType_lfno_unannClassOrInterfaceType", 
			"unannInterfaceType", "unannInterfaceType_lf_unannClassOrInterfaceType", 
			"unannInterfaceType_lfno_unannClassOrInterfaceType", "unannTypeVariable", 
			"unannArrayType", "methodDeclaration", "methodModifier", "methodHeader", 
			"result", "methodDeclarator", "formalParameterList", "formalParameters", 
			"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
			"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
			"staticInitializer", "constructorDeclaration", "constructorModifier", 
			"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
			"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
			"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
			"interfaceModifier", "extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", 
			"constantDeclaration", "constantModifier", "interfaceMethodDeclaration", 
			"interfaceMethodModifier", "annotationTypeDeclaration", "annotationTypeBody", 
			"annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
			"annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", 
			"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
			"elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", 
			"variableInitializerList", "block", "blockStatements", "blockStatement", 
			"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
			"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", 
			"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
			"statementExpression", "printInvocation", "stringCharactersDeclaration", 
			"scanInvocation", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
			"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
			"switchLabels", "switchLabel", "enumConstantName", "whileStatement", 
			"whileStatementNoShortIf", "doStatement", "forStatement", "forStatementNoShortIf", 
			"pseudoForStatement", "forInit", "forinitializer", "customAssignError", 
			"breakStatement", "continueStatement", "returnStatement", "throwStatement", 
			"synchronizedStatement", "tryStatement", "catches", "catchClause", "catchFormalParameter", 
			"catchType", "finally_", "tryWithResourcesStatement", "resourceSpecification", 
			"resourceList", "resource", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
			"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
			"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
			"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
			"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", 
			"classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", 
			"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
			"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", 
			"methodInvocation", "methodInvocation_lf_primary", "methodInvocation_lfno_primary", 
			"argumentList", "methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
			"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
			"expression", "errorParenthesis", "lambdaExpression", "lambdaParameters", 
			"inferredFormalParameterList", "lambdaBody", "assignmentExpression", 
			"assignment", "leftHandSide", "assignmentOperator", "conditionalExpression", 
			"onlyConditionalExpression", "conditionalOrExpression", "onlyConditionalOrExpression", 
			"conditionalAndExpression", "onlyConditionalAndExpression", "inclusiveOrExpression", 
			"exclusiveOrExpression", "andExpression", "equalityExpression", "onlyEqualityExpression", 
			"relationalExpression", "onlyRelationalExpression", "shiftExpression", 
			"additiveExpression", "additiveExpressionfactored", "addminus", "multiplicativeExpression", 
			"multiplicativeExpressionfactored", "arithmetic", "mult", "unaryExpression", 
			"preIncrementExpression", "preDecrementExpression", "unaryExpressionNotPlusMinus", 
			"postfixExpressionInc", "postfixExpression", "postIncrementExpression", 
			"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
			"postDecrementExpression_lf_postfixExpression", "castExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'scan'", "'func'", "'main'", "'String'", "'constant'", 
			"'create'", "'then'", "'abstract'", "'assert'", "'bool'", "'break'", 
			"'byte'", "'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", 
			"'default'", "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", 
			"'finally'", "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", 
			"'instanceof'", "'int'", "'interface'", "'long'", "'native'", "'new'", 
			"'package'", "'private'", "'protected'", "'public'", "'return'", "'short'", 
			"'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", "'this'", 
			"'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
			"'while'", "'up to'", "'down to'", null, null, null, null, null, "'null'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", 
			"'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", 
			"'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", 
			"'^'", "'%'", "'->'", "'::'", "'+='", "'-='", "'*='", "'/='", "'&='", 
			"'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT", "SCAN", "FUNC", "MAIN", "STRING", "CONSTANT", "CREATE", 
			"THEN", "ABSTRACT", "ASSERT", "BOOL", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "UPTO", "DOWNTO", 
			"IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", 
			"StringLiteral", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", 
			"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
			"MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
			"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", 
			"ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", "StringCharacter"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PseudoCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PseudoCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(PseudoCodeParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(PseudoCodeParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(PseudoCodeParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(PseudoCodeParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoCodeParser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(PseudoCodeParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (IntegerLiteral - 61)) | (1L << (FloatingPointLiteral - 61)) | (1L << (BooleanLiteral - 61)) | (1L << (CharacterLiteral - 61)) | (1L << (StringLiteral - 61)) | (1L << (NullLiteral - 61)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				referenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode BOOL() { return getToken(PseudoCodeParser.BOOL, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(506);
					annotation();
					}
					}
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(512);
				numericType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(513);
					annotation();
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(519);
				match(BOOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNumericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNumericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericType);
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(PseudoCodeParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(PseudoCodeParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(PseudoCodeParser.INT, 0); }
		public TerminalNode LONG() { return getToken(PseudoCodeParser.LONG, 0); }
		public TerminalNode CHAR() { return getToken(PseudoCodeParser.CHAR, 0); }
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitIntegralType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitIntegralType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(PseudoCodeParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(PseudoCodeParser.DOUBLE, 0); }
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFloatingPointType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFloatingPointType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_referenceType);
		try {
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				classOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				typeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(535);
				classType_lfno_classOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(536);
				interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(543);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(541);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(539);
						classType_lf_classOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(540);
						interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType);
		int _la;
		try {
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(546);
					annotation();
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(552);
				match(Identifier);
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(553);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				classOrInterfaceType();
				setState(557);
				match(DOT);
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(558);
					annotation();
					}
					}
					setState(563);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(564);
				match(Identifier);
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(565);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(DOT);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(571);
				annotation();
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577);
			match(Identifier);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(578);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(581);
				annotation();
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(587);
			match(Identifier);
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(588);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInterfaceType_lf_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			classType_lf_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInterfaceType_lfno_classOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			classType_lfno_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(597);
				annotation();
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(603);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		try {
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				primitiveType();
				setState(606);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				classOrInterfaceType();
				setState(609);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
				typeVariable();
				setState(612);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(PseudoCodeParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(PseudoCodeParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(PseudoCodeParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PseudoCodeParser.RBRACK, i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dims);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(LBRACK);
			setState(617);
			match(RBRACK);
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(618);
				match(LBRACK);
				setState(619);
				match(RBRACK);
				}
				}
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(625);
				typeParameterModifier();
				}
				}
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(631);
			match(Identifier);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(632);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeParameterModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeParameterModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(PseudoCodeParser.EXTENDS, 0); }
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeBound);
		int _la;
		try {
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				match(EXTENDS);
				setState(638);
				typeVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				match(EXTENDS);
				setState(640);
				classOrInterfaceType();
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(641);
					additionalBound();
					}
					}
					setState(646);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public TerminalNode BITAND() { return getToken(PseudoCodeParser.BITAND, 0); }
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAdditionalBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAdditionalBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(BITAND);
			setState(650);
			interfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(PseudoCodeParser.LT, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode GT() { return getToken(PseudoCodeParser.GT, 0); }
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(LT);
			setState(653);
			typeArgumentList();
			setState(654);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PseudoCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PseudoCodeParser.COMMA, i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			typeArgument();
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(657);
				match(COMMA);
				setState(658);
				typeArgument();
				}
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArgument);
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				wildcard();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(PseudoCodeParser.QUESTION, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(668);
				annotation();
				}
				}
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(674);
			match(QUESTION);
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(675);
				wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(PseudoCodeParser.EXTENDS, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(PseudoCodeParser.SUPER, 0); }
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitWildcardBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitWildcardBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_wildcardBounds);
		try {
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				match(EXTENDS);
				setState(679);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				match(SUPER);
				setState(681);
				referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPackageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPackageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(685);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(692);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(687);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(688);
					match(DOT);
					setState(689);
					match(Identifier);
					}
					} 
				}
				setState(694);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		try {
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				packageOrTypeName(0);
				setState(697);
				match(DOT);
				setState(698);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPackageOrTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(703);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(705);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(706);
					match(DOT);
					setState(707);
					match(Identifier);
					}
					} 
				}
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExpressionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionName);
		try {
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
				ambiguousName(0);
				setState(715);
				match(DOT);
				setState(716);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAmbiguousName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAmbiguousName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(723);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(725);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(726);
					match(DOT);
					setState(727);
					match(Identifier);
					}
					} 
				}
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PseudoCodeParser.EOF, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << STRING) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID))) != 0)) {
				{
				{
				setState(733);
				classBodyDeclaration();
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(739);
			mainDeclaration();
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << STRING) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID))) != 0)) {
				{
				{
				setState(740);
				classBodyDeclaration();
				}
				}
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(746);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainDeclarationContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(PseudoCodeParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMainDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMainDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mainDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(MAIN);
			setState(749);
			match(LPAREN);
			setState(750);
			match(RPAREN);
			setState(751);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(PseudoCodeParser.PACKAGE, 0); }
		public List<TerminalNode> Identifier() { return getTokens(PseudoCodeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudoCodeParser.Identifier, i);
		}
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(PseudoCodeParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PseudoCodeParser.DOT, i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(753);
				packageModifier();
				}
				}
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(759);
			match(PACKAGE);
			setState(760);
			match(Identifier);
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(761);
				match(DOT);
				setState(762);
				match(Identifier);
				}
				}
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(768);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPackageModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPackageModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_importDeclaration);
		try {
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				singleTypeImportDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				typeImportOnDemandDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				singleStaticImportDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(775);
				staticImportOnDemandDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PseudoCodeParser.IMPORT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSingleTypeImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSingleTypeImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(IMPORT);
			setState(779);
			typeName();
			setState(780);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PseudoCodeParser.IMPORT, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(PseudoCodeParser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(IMPORT);
			setState(783);
			packageOrTypeName(0);
			setState(784);
			match(DOT);
			setState(785);
			match(MUL);
			setState(786);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PseudoCodeParser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(PseudoCodeParser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSingleStaticImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSingleStaticImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(IMPORT);
			setState(789);
			match(STATIC);
			setState(790);
			typeName();
			setState(791);
			match(DOT);
			setState(792);
			match(Identifier);
			setState(793);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PseudoCodeParser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(PseudoCodeParser.STATIC, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public TerminalNode MUL() { return getToken(PseudoCodeParser.MUL, 0); }
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitStaticImportOnDemandDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitStaticImportOnDemandDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(IMPORT);
			setState(796);
			match(STATIC);
			setState(797);
			typeName();
			setState(798);
			match(DOT);
			setState(799);
			match(MUL);
			setState(800);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeDeclaration);
		try {
			setState(805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				interfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(804);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_classDeclaration);
		try {
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				normalClassDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PseudoCodeParser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNormalClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(811);
				classModifier();
				}
				}
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(817);
			match(CLASS);
			setState(818);
			match(Identifier);
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(819);
				typeParameters();
				}
			}

			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(822);
				superclass();
				}
			}

			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(825);
				superinterfaces();
				}
			}

			setState(828);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(PseudoCodeParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(PseudoCodeParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(PseudoCodeParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(PseudoCodeParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(PseudoCodeParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(PseudoCodeParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(PseudoCodeParser.STRICTFP, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_classModifier);
		try {
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(832);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(833);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(834);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(835);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(836);
				match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(837);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(PseudoCodeParser.LT, 0); }
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TerminalNode GT() { return getToken(PseudoCodeParser.GT, 0); }
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(LT);
			setState(841);
			typeParameterList();
			setState(842);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PseudoCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PseudoCodeParser.COMMA, i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			typeParameter();
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(845);
				match(COMMA);
				setState(846);
				typeParameter();
				}
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(PseudoCodeParser.EXTENDS, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSuperclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(EXTENDS);
			setState(853);
			classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperinterfacesContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(PseudoCodeParser.IMPLEMENTS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSuperinterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSuperinterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(IMPLEMENTS);
			setState(856);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PseudoCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PseudoCodeParser.COMMA, i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInterfaceTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInterfaceTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			interfaceType();
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(859);
				match(COMMA);
				setState(860);
				interfaceType();
				}
				}
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PseudoCodeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PseudoCodeParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			match(LBRACE);
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << STRING) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID))) != 0)) {
				{
				{
				setState(867);
				classBodyDeclaration();
				}
				}
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(873);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classBodyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			classMemberDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_classMemberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(879);
				fieldModifier();
				}
				}
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(885);
			unannType();
			setState(886);
			variableDeclaratorList();
			setState(887);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(PseudoCodeParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(PseudoCodeParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(PseudoCodeParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(PseudoCodeParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(PseudoCodeParser.FINAL, 0); }
		public TerminalNode TRANSIENT() { return getToken(PseudoCodeParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(PseudoCodeParser.VOLATILE, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFieldModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_fieldModifier);
		try {
			setState(897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(891);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(892);
				match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(893);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(894);
				match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(895);
				match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(896);
				match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PseudoCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PseudoCodeParser.COMMA, i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitVariableDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			variableDeclarator();
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(900);
				match(COMMA);
				setState(901);
				variableDeclarator();
				}
				}
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PseudoCodeParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableDeclarator);
		int _la;
		try {
			setState(919);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				variableDeclaratorId();
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(908);
					match(ASSIGN);
					setState(909);
					variableInitializer();
					}
				}

				}
				break;
			case STRING:
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				unannType();
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(913);
					match(ASSIGN);
					setState(914);
					variableInitializer();
					}
				}

				notifyErrorListeners("declaring keyword as variable name");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_variableInitializer);
		try {
			setState(925);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case RPAREN:
			case BANG:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				expression();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
				arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnannType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnannType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unannType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			unannPrimitiveType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(PseudoCodeParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(PseudoCodeParser.STRING, 0); }
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnannPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnannPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannPrimitiveType);
		try {
			setState(932);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(929);
				numericType();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(930);
				match(BOOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(931);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnannReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnannReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unannReferenceType);
		try {
			setState(937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				unannClassOrInterfaceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				unannTypeVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(936);
				unannArrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(939);
				unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;
			case 2:
				{
				setState(940);
				unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(947);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(945);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						setState(943);
						unannClassType_lf_unannClassOrInterfaceType();
						}
						break;
					case 2:
						{
						setState(944);
						unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(949);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnannClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnannClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannClassType);
		int _la;
		try {
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				match(Identifier);
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(951);
					typeArguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				unannClassOrInterfaceType();
				setState(955);
				match(DOT);
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(956);
					annotation();
					}
					}
					setState(961);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(962);
				match(Identifier);
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(963);
					typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnannClassType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(DOT);
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(969);
				annotation();
				}
				}
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(975);
			match(Identifier);
			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(976);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnannClassType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(Identifier);
			setState(981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(980);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnannInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnannInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			unannClassType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			unannClassType_lf_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			unannClassType_lfno_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnannTypeVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnannTypeVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnannArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnannArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_unannArrayType);
		try {
			setState(1000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				unannPrimitiveType();
				setState(992);
				dims();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				unannClassOrInterfaceType();
				setState(995);
				dims();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(997);
				unannTypeVariable();
				setState(998);
				dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(PseudoCodeParser.FUNC, 0); }
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_methodDeclaration);
		try {
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				match(FUNC);
				setState(1003);
				result();
				setState(1004);
				methodDeclarator();
				setState(1005);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1007);
				match(FUNC);
				setState(1008);
				methodDeclarator();
				setState(1009);
				block();
				notifyErrorListeners("lacking return type");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1012);
				result();
				setState(1013);
				methodDeclarator();
				setState(1014);
				block();
				notifyErrorListeners("lacking 'func'");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1017);
				match(FUNC);
				setState(1018);
				result();
				setState(1019);
				methodDeclarator();
				notifyErrorListeners("lacking function body");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(PseudoCodeParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(PseudoCodeParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(PseudoCodeParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(PseudoCodeParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(PseudoCodeParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(PseudoCodeParser.FINAL, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(PseudoCodeParser.SYNCHRONIZED, 0); }
		public TerminalNode NATIVE() { return getToken(PseudoCodeParser.NATIVE, 0); }
		public TerminalNode STRICTFP() { return getToken(PseudoCodeParser.STRICTFP, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_methodModifier);
		try {
			setState(1034);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1025);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1026);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1027);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1028);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1029);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1030);
				match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1031);
				match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1032);
				match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1033);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMethodHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMethodHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_methodHeader);
		int _la;
		try {
			setState(1053);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				result();
				setState(1037);
				methodDeclarator();
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1038);
					throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1041);
				typeParameters();
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1042);
					annotation();
					}
					}
					setState(1047);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1048);
				result();
				setState(1049);
				methodDeclarator();
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1050);
					throws_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(PseudoCodeParser.VOID, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_result);
		try {
			setState(1057);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1055);
				unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1056);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMethodDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMethodDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_methodDeclarator);
		int _la;
		try {
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				match(Identifier);
				setState(1060);
				match(LPAREN);
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==COMMA || _la==Identifier) {
					{
					setState(1061);
					formalParameterList();
					}
				}

				setState(1064);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065);
				match(Identifier);
				setState(1066);
				match(LPAREN);
				setState(1068);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(1067);
					formalParameterList();
					}
					break;
				}
				notifyErrorListeners("uneven parenthesis, lacking ')'");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1071);
				match(Identifier);
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==COMMA || _la==Identifier) {
					{
					setState(1072);
					formalParameterList();
					}
				}

				setState(1075);
				match(RPAREN);
				notifyErrorListeners("uneven parenthesis, lacking '('");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_formalParameterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			formalParameters(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PseudoCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PseudoCodeParser.COMMA, i);
		}
		public List<FormalParametersContext> formalParameters() {
			return getRuleContexts(FormalParametersContext.class);
		}
		public FormalParametersContext formalParameters(int i) {
			return getRuleContext(FormalParametersContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		return formalParameters(0);
	}

	private FormalParametersContext formalParameters(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, _parentState);
		FormalParametersContext _prevctx = _localctx;
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_formalParameters, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(1082);
				formalParameter();
				setState(1087);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1083);
						match(COMMA);
						setState(1084);
						formalParameter();
						}
						} 
					}
					setState(1089);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1098);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(1090);
					formalParameter();
					setState(1095);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1091);
						match(COMMA);
						setState(1092);
						formalParameter();
						}
						}
						setState(1097);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1100);
				formalParameter();
				setState(1101);
				formalParameters(4);
				notifyErrorListeners("no separator found in parameters");
				}
				break;
			case 3:
				{
				setState(1107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1104);
						match(COMMA);
						}
						} 
					}
					setState(1109);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				}
				setState(1110);
				match(COMMA);
				setState(1111);
				formalParameters(3);
				notifyErrorListeners("lacking parameter");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						_localctx = new FormalParametersContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_formalParameters);
						setState(1116);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1117);
						match(COMMA);
						setState(1118);
						match(COMMA);
						setState(1122);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1119);
								match(COMMA);
								}
								} 
							}
							setState(1124);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
						}
						setState(1125);
						formalParameters(2);
						notifyErrorListeners("lacking parameter");
						}
						break;
					case 2:
						{
						_localctx = new FormalParametersContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_formalParameters);
						setState(1128);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1129);
						match(COMMA);
						setState(1133);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1130);
								match(COMMA);
								}
								} 
							}
							setState(1135);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
						}
						notifyErrorListeners("lacking parameter");
						}
						break;
					}
					} 
				}
				setState(1141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_formalParameter);
		try {
			setState(1151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1142);
				unannType();
				setState(1143);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1145);
				variableDeclaratorId();
				notifyErrorListeners("no specified data type");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1148);
				unannType();
				notifyErrorListeners("no parameter name");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(PseudoCodeParser.FINAL, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_variableModifier);
		try {
			setState(1155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1153);
				annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(PseudoCodeParser.ELLIPSIS, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLastFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1157);
					variableModifier();
					}
					}
					setState(1162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1163);
				unannType();
				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1164);
					annotation();
					}
					}
					setState(1169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1170);
				match(ELLIPSIS);
				setState(1171);
				variableDeclaratorId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1173);
				formalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode THIS() { return getToken(PseudoCodeParser.THIS, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitReceiverParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitReceiverParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1176);
				annotation();
				}
				}
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1182);
			unannType();
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1183);
				match(Identifier);
				setState(1184);
				match(DOT);
				}
			}

			setState(1187);
			match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_Context extends ParserRuleContext {
		public TerminalNode THROWS() { return getToken(PseudoCodeParser.THROWS, 0); }
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitThrows_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitThrows_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 164, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			match(THROWS);
			setState(1190);
			exceptionTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PseudoCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PseudoCodeParser.COMMA, i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExceptionTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExceptionTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			exceptionType();
			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1193);
				match(COMMA);
				setState(1194);
				exceptionType();
				}
				}
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExceptionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExceptionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_exceptionType);
		try {
			setState(1202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1200);
				classType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1201);
				typeVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_methodBody);
		try {
			setState(1206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1204);
				block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1205);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInstanceInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInstanceInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(PseudoCodeParser.STATIC, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitStaticInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitStaticInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			match(STATIC);
			setState(1211);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1213);
				constructorModifier();
				}
				}
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1219);
			constructorDeclarator();
			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1220);
				throws_();
				}
			}

			setState(1223);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(PseudoCodeParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(PseudoCodeParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(PseudoCodeParser.PRIVATE, 0); }
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitConstructorModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitConstructorModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_constructorModifier);
		try {
			setState(1229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1227);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1228);
				match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitConstructorDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitConstructorDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1231);
				typeParameters();
				}
			}

			setState(1234);
			simpleTypeName();
			setState(1235);
			match(LPAREN);
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==COMMA || _la==Identifier) {
				{
				setState(1236);
				formalParameterList();
				}
			}

			setState(1239);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSimpleTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSimpleTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PseudoCodeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PseudoCodeParser.RBRACE, 0); }
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(LBRACE);
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1244);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(1248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << SCAN) | (1L << STRING) | (1L << CONSTANT) | (1L << BOOL) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1247);
				blockStatements();
				}
			}

			setState(1250);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(PseudoCodeParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(PseudoCodeParser.SUPER, 0); }
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExplicitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1252);
					typeArguments();
					}
				}

				setState(1255);
				match(THIS);
				setState(1256);
				match(LPAREN);
				setState(1258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1257);
					argumentList(0);
					}
					break;
				}
				setState(1260);
				match(RPAREN);
				setState(1261);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1262);
					typeArguments();
					}
				}

				setState(1265);
				match(SUPER);
				setState(1266);
				match(LPAREN);
				setState(1268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1267);
					argumentList(0);
					}
					break;
				}
				setState(1270);
				match(RPAREN);
				setState(1271);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1272);
				expressionName();
				setState(1273);
				match(DOT);
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1274);
					typeArguments();
					}
				}

				setState(1277);
				match(SUPER);
				setState(1278);
				match(LPAREN);
				setState(1280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1279);
					argumentList(0);
					}
					break;
				}
				setState(1282);
				match(RPAREN);
				setState(1283);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1285);
				primary();
				setState(1286);
				match(DOT);
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1287);
					typeArguments();
					}
				}

				setState(1290);
				match(SUPER);
				setState(1291);
				match(LPAREN);
				setState(1293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1292);
					argumentList(0);
					}
					break;
				}
				setState(1295);
				match(RPAREN);
				setState(1296);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(PseudoCodeParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1300);
				classModifier();
				}
				}
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1306);
			match(ENUM);
			setState(1307);
			match(Identifier);
			setState(1309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1308);
				superinterfaces();
				}
			}

			setState(1311);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PseudoCodeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PseudoCodeParser.RBRACE, 0); }
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PseudoCodeParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
			match(LBRACE);
			setState(1315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1314);
				enumConstantList();
				}
			}

			setState(1318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1317);
				match(COMMA);
				}
			}

			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1320);
				enumBodyDeclarations();
				}
			}

			setState(1323);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PseudoCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PseudoCodeParser.COMMA, i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEnumConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEnumConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			enumConstant();
			setState(1330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1326);
					match(COMMA);
					setState(1327);
					enumConstant();
					}
					} 
				}
				setState(1332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1333);
				enumConstantModifier();
				}
				}
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1339);
			match(Identifier);
			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1340);
				match(LPAREN);
				setState(1342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1341);
					argumentList(0);
					}
					break;
				}
				setState(1344);
				match(RPAREN);
				}
			}

			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1347);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEnumConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEnumConstantModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEnumConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			match(SEMI);
			setState(1356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNC) | (1L << STRING) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID))) != 0)) {
				{
				{
				setState(1353);
				classBodyDeclaration();
				}
				}
				setState(1358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_interfaceDeclaration);
		try {
			setState(1361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1359);
				normalInterfaceDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1360);
				annotationTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(PseudoCodeParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNormalInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNormalInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1363);
				interfaceModifier();
				}
				}
				setState(1368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1369);
			match(INTERFACE);
			setState(1370);
			match(Identifier);
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1371);
				typeParameters();
				}
			}

			setState(1375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1374);
				extendsInterfaces();
				}
			}

			setState(1377);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(PseudoCodeParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(PseudoCodeParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(PseudoCodeParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(PseudoCodeParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(PseudoCodeParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(PseudoCodeParser.STRICTFP, 0); }
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_interfaceModifier);
		try {
			setState(1386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1379);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1380);
				match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1381);
				match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1382);
				match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1383);
				match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1384);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1385);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(PseudoCodeParser.EXTENDS, 0); }
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExtendsInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExtendsInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			match(EXTENDS);
			setState(1389);
			interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PseudoCodeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PseudoCodeParser.RBRACE, 0); }
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			match(LBRACE);
			setState(1395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ABSTRACT) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (SEMI - 73)) | (1L << (LT - 73)) | (1L << (AT - 73)))) != 0)) {
				{
				{
				setState(1392);
				interfaceMemberDeclaration();
				}
				}
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1398);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_interfaceMemberDeclaration);
		try {
			setState(1405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1400);
				constantDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1401);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1402);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1403);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1404);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1407);
				constantModifier();
				}
				}
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1413);
			unannType();
			setState(1414);
			variableDeclaratorList();
			setState(1415);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(PseudoCodeParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(PseudoCodeParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(PseudoCodeParser.FINAL, 0); }
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitConstantModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitConstantModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_constantModifier);
		try {
			setState(1421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1417);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1418);
				match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1419);
				match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1420);
				match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1423);
				interfaceMethodModifier();
				}
				}
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1429);
			methodHeader();
			setState(1430);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(PseudoCodeParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(PseudoCodeParser.ABSTRACT, 0); }
		public TerminalNode DEFAULT() { return getToken(PseudoCodeParser.DEFAULT, 0); }
		public TerminalNode STATIC() { return getToken(PseudoCodeParser.STATIC, 0); }
		public TerminalNode STRICTFP() { return getToken(PseudoCodeParser.STRICTFP, 0); }
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInterfaceMethodModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInterfaceMethodModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_interfaceMethodModifier);
		try {
			setState(1438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1432);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1433);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1434);
				match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1435);
				match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1436);
				match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1437);
				match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(PseudoCodeParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(PseudoCodeParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1440);
					interfaceModifier();
					}
					} 
				}
				setState(1445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			setState(1446);
			match(AT);
			setState(1447);
			match(INTERFACE);
			setState(1448);
			match(Identifier);
			setState(1449);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PseudoCodeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PseudoCodeParser.RBRACE, 0); }
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			match(LBRACE);
			setState(1455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ABSTRACT) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(1452);
				annotationTypeMemberDeclaration();
				}
				}
				setState(1457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1458);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAnnotationTypeMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1460);
				annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1461);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1462);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1463);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1464);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1467);
				annotationTypeElementModifier();
				}
				}
				setState(1472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1473);
			unannType();
			setState(1474);
			match(Identifier);
			setState(1475);
			match(LPAREN);
			setState(1476);
			match(RPAREN);
			setState(1478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(1477);
				dims();
				}
			}

			setState(1481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1480);
				defaultValue();
				}
			}

			setState(1483);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(PseudoCodeParser.PUBLIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(PseudoCodeParser.ABSTRACT, 0); }
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAnnotationTypeElementModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAnnotationTypeElementModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAnnotationTypeElementModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_annotationTypeElementModifier);
		try {
			setState(1488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1485);
				annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1486);
				match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1487);
				match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(PseudoCodeParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			match(DEFAULT);
			setState(1491);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_annotation);
		try {
			setState(1496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493);
				normalAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1494);
				markerAnnotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1495);
				singleElementAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(PseudoCodeParser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNormalAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNormalAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			match(AT);
			setState(1499);
			typeName();
			setState(1500);
			match(LPAREN);
			setState(1502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1501);
				elementValuePairList();
				}
			}

			setState(1504);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PseudoCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PseudoCodeParser.COMMA, i);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitElementValuePairList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitElementValuePairList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			elementValuePair();
			setState(1511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1507);
				match(COMMA);
				setState(1508);
				elementValuePair();
				}
				}
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(PseudoCodeParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			match(Identifier);
			setState(1515);
			match(ASSIGN);
			setState(1516);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_elementValue);
		try {
			setState(1521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1518);
				conditionalExpression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1519);
				elementValueArrayInitializer();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1520);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PseudoCodeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PseudoCodeParser.RBRACE, 0); }
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PseudoCodeParser.COMMA, 0); }
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			match(LBRACE);
			setState(1525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (IntegerLiteral - 61)) | (1L << (FloatingPointLiteral - 61)) | (1L << (BooleanLiteral - 61)) | (1L << (CharacterLiteral - 61)) | (1L << (StringLiteral - 61)) | (1L << (NullLiteral - 61)) | (1L << (LPAREN - 61)) | (1L << (LBRACE - 61)) | (1L << (BANG - 61)) | (1L << (Identifier - 61)) | (1L << (AT - 61)))) != 0)) {
				{
				setState(1524);
				elementValueList();
				}
			}

			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1527);
				match(COMMA);
				}
			}

			setState(1530);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PseudoCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PseudoCodeParser.COMMA, i);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitElementValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitElementValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			elementValue();
			setState(1537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1533);
					match(COMMA);
					setState(1534);
					elementValue();
					}
					} 
				}
				setState(1539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(PseudoCodeParser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMarkerAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMarkerAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			match(AT);
			setState(1541);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(PseudoCodeParser.AT, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSingleElementAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSingleElementAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			match(AT);
			setState(1544);
			typeName();
			setState(1545);
			match(LPAREN);
			setState(1546);
			elementValue();
			setState(1547);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PseudoCodeParser.CREATE, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(PseudoCodeParser.LBRACK, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PseudoCodeParser.RBRACK, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_arrayInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			match(CREATE);
			setState(1550);
			unannType();
			setState(1551);
			match(LBRACK);
			setState(1552);
			additiveExpression(0);
			setState(1553);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PseudoCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PseudoCodeParser.COMMA, i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitVariableInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitVariableInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_variableInitializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1555);
			variableInitializer();
			setState(1560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1556);
				match(COMMA);
				setState(1557);
				variableInitializer();
				}
				}
				setState(1562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PseudoCodeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PseudoCodeParser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			match(LBRACE);
			setState(1565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << SCAN) | (1L << STRING) | (1L << CONSTANT) | (1L << BOOL) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1564);
				blockStatements();
				}
			}

			setState(1567);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			blockStatement();
			setState(1573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << SCAN) | (1L << STRING) | (1L << CONSTANT) | (1L << BOOL) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SUPER) | (1L << SWITCH) | (1L << THIS) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CharacterLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (NullLiteral - 64)) | (1L << (LPAREN - 64)) | (1L << (LBRACE - 64)) | (1L << (SEMI - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(1570);
				blockStatement();
				}
				}
				setState(1575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_blockStatement);
		try {
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1576);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1577);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			localVariableDeclaration();
			setState(1581);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(PseudoCodeParser.CONSTANT, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_localVariableDeclaration);
		int _la;
		try {
			setState(1600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case CONSTANT:
			case BOOL:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(1583);
					match(CONSTANT);
					}
				}

				setState(1586);
				unannType();
				setState(1588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(1587);
					dims();
					}
				}

				setState(1590);
				variableDeclaratorList();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1592);
				match(Identifier);
				setState(1593);
				unannType();
				setState(1595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(1594);
					dims();
					}
				}

				setState(1597);
				variableDeclaratorList();
				notifyErrorListeners("identifier found before data type in the declaration");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_statement);
		try {
			setState(1606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
			case SCAN:
			case STRING:
			case CONSTANT:
			case BOOL:
			case BREAK:
			case BYTE:
			case CHAR:
			case CONTINUE:
			case DO:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case RETURN:
			case SHORT:
			case SUPER:
			case SWITCH:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LBRACE:
			case SEMI:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1602);
				statementWithoutTrailingSubstatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1603);
				ifThenStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1604);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1605);
				forStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_statementNoShortIf);
		try {
			setState(1613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1608);
				statementWithoutTrailingSubstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1609);
				labeledStatementNoShortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1610);
				ifThenElseStatementNoShortIf();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1611);
				whileStatementNoShortIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1612);
				forStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitStatementWithoutTrailingSubstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1615);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1616);
				emptyStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1617);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1618);
				switchStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1619);
				doStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1620);
				breakStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1621);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1622);
				returnStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1623);
				localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(PseudoCodeParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			match(Identifier);
			setState(1629);
			match(COLON);
			setState(1630);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(PseudoCodeParser.COLON, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLabeledStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLabeledStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			match(Identifier);
			setState(1633);
			match(COLON);
			setState(1634);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1636);
			statementExpression();
			setState(1637);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public PrintInvocationContext printInvocation() {
			return getRuleContext(PrintInvocationContext.class,0);
		}
		public ScanInvocationContext scanInvocation() {
			return getRuleContext(ScanInvocationContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_statementExpression);
		try {
			setState(1647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1639);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1640);
				preIncrementExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1641);
				preDecrementExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1642);
				postIncrementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1643);
				postDecrementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1644);
				printInvocation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1645);
				scanInvocation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1646);
				methodInvocation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintInvocationContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(PseudoCodeParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(PseudoCodeParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(PseudoCodeParser.StringLiteral, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(PseudoCodeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudoCodeParser.Identifier, i);
		}
		public List<TerminalNode> ADD() { return getTokens(PseudoCodeParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(PseudoCodeParser.ADD, i);
		}
		public List<StringCharactersDeclarationContext> stringCharactersDeclaration() {
			return getRuleContexts(StringCharactersDeclarationContext.class);
		}
		public StringCharactersDeclarationContext stringCharactersDeclaration(int i) {
			return getRuleContext(StringCharactersDeclarationContext.class,i);
		}
		public PrintInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPrintInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPrintInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPrintInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintInvocationContext printInvocation() throws RecognitionException {
		PrintInvocationContext _localctx = new PrintInvocationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_printInvocation);
		int _la;
		try {
			int _alt;
			setState(1696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1649);
				match(PRINT);
				setState(1650);
				match(LPAREN);
				setState(1659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==StringLiteral || _la==Identifier) {
					{
					setState(1651);
					_la = _input.LA(1);
					if ( !(_la==StringLiteral || _la==Identifier) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1656);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ADD) {
						{
						{
						setState(1652);
						match(ADD);
						setState(1653);
						_la = _input.LA(1);
						if ( !(_la==StringLiteral || _la==Identifier) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(1658);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1661);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1662);
				match(PRINT);
				setState(1663);
				match(LPAREN);
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==StringLiteral || _la==Identifier) {
					{
					setState(1664);
					_la = _input.LA(1);
					if ( !(_la==StringLiteral || _la==Identifier) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1669);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1665);
							match(ADD);
							setState(1666);
							_la = _input.LA(1);
							if ( !(_la==StringLiteral || _la==Identifier) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							} 
						}
						setState(1671);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
					}
					}
				}

				setState(1674);
				match(ADD);
				setState(1675);
				match(RPAREN);
				notifyErrorListeners("additional ‘+’ sign at end of print");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1677);
				match(PRINT);
				setState(1678);
				match(LPAREN);
				{
				setState(1681);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case StringLiteral:
					{
					setState(1679);
					match(StringLiteral);
					}
					break;
				case StringCharacter:
					{
					setState(1680);
					stringCharactersDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1685);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case StringLiteral:
					{
					setState(1683);
					match(StringLiteral);
					}
					break;
				case StringCharacter:
					{
					setState(1684);
					stringCharactersDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==StringLiteral || _la==StringCharacter) {
					{
					setState(1689);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case StringLiteral:
						{
						setState(1687);
						match(StringLiteral);
						}
						break;
					case StringCharacter:
						{
						setState(1688);
						stringCharactersDeclaration();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1693);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1694);
				match(RPAREN);
				notifyErrorListeners("lacking 'double quotes' in print statement");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringCharactersDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> StringCharacter() { return getTokens(PseudoCodeParser.StringCharacter); }
		public TerminalNode StringCharacter(int i) {
			return getToken(PseudoCodeParser.StringCharacter, i);
		}
		public StringCharactersDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringCharactersDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterStringCharactersDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitStringCharactersDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitStringCharactersDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringCharactersDeclarationContext stringCharactersDeclaration() throws RecognitionException {
		StringCharactersDeclarationContext _localctx = new StringCharactersDeclarationContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_stringCharactersDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			match(StringCharacter);
			setState(1702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1699);
					match(StringCharacter);
					}
					} 
				}
				setState(1704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanInvocationContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(PseudoCodeParser.SCAN, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(PseudoCodeParser.COMMA, 0); }
		public List<TerminalNode> Identifier() { return getTokens(PseudoCodeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudoCodeParser.Identifier, i);
		}
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(PseudoCodeParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(PseudoCodeParser.StringLiteral, i);
		}
		public List<TerminalNode> ADD() { return getTokens(PseudoCodeParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(PseudoCodeParser.ADD, i);
		}
		public ScanInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterScanInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitScanInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitScanInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanInvocationContext scanInvocation() throws RecognitionException {
		ScanInvocationContext _localctx = new ScanInvocationContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_scanInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1705);
			match(SCAN);
			setState(1706);
			match(LPAREN);
			setState(1707);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD) {
				{
				{
				setState(1708);
				match(ADD);
				setState(1709);
				_la = _input.LA(1);
				if ( !(_la==StringLiteral || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1714);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1715);
			match(COMMA);
			setState(1716);
			match(Identifier);
			setState(1717);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(PseudoCodeParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(PseudoCodeParser.IF, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(PseudoCodeParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PseudoCodeParser.LPAREN, i);
		}
		public List<OnlyConditionalExpressionContext> onlyConditionalExpression() {
			return getRuleContexts(OnlyConditionalExpressionContext.class);
		}
		public OnlyConditionalExpressionContext onlyConditionalExpression(int i) {
			return getRuleContext(OnlyConditionalExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PseudoCodeParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PseudoCodeParser.RPAREN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(PseudoCodeParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(PseudoCodeParser.THEN, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(PseudoCodeParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(PseudoCodeParser.ELSE, i);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitIfThenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitIfThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_ifThenStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			match(IF);
			setState(1720);
			match(LPAREN);
			setState(1721);
			onlyConditionalExpression();
			setState(1722);
			match(RPAREN);
			setState(1723);
			match(THEN);
			setState(1724);
			block();
			setState(1735);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1725);
					match(ELSE);
					setState(1726);
					match(IF);
					setState(1727);
					match(LPAREN);
					setState(1728);
					onlyConditionalExpression();
					setState(1729);
					match(RPAREN);
					setState(1730);
					match(THEN);
					setState(1731);
					block();
					}
					} 
				}
				setState(1737);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			setState(1741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1738);
				match(ELSE);
				setState(1739);
				match(THEN);
				setState(1740);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PseudoCodeParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(PseudoCodeParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitIfThenElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitIfThenElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			match(IF);
			setState(1744);
			match(LPAREN);
			setState(1745);
			expression();
			setState(1746);
			match(RPAREN);
			setState(1747);
			statementNoShortIf();
			setState(1748);
			match(ELSE);
			setState(1749);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PseudoCodeParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PseudoCodeParser.ELSE, 0); }
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitIfThenElseStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitIfThenElseStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			match(IF);
			setState(1752);
			match(LPAREN);
			setState(1753);
			expression();
			setState(1754);
			match(RPAREN);
			setState(1755);
			statementNoShortIf();
			setState(1756);
			match(ELSE);
			setState(1757);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(PseudoCodeParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(PseudoCodeParser.COLON, 0); }
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAssertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_assertStatement);
		try {
			setState(1769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1759);
				match(ASSERT);
				setState(1760);
				expression();
				setState(1761);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1763);
				match(ASSERT);
				setState(1764);
				expression();
				setState(1765);
				match(COLON);
				setState(1766);
				expression();
				setState(1767);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(PseudoCodeParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			match(SWITCH);
			setState(1772);
			match(LPAREN);
			setState(1773);
			match(Identifier);
			setState(1774);
			match(RPAREN);
			setState(1775);
			switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PseudoCodeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PseudoCodeParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			match(LBRACE);
			setState(1781);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1778);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(1783);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			setState(1787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1784);
				switchLabel();
				}
				}
				setState(1789);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1790);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
			switchLabels();
			setState(1793);
			blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSwitchLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSwitchLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			switchLabel();
			setState(1799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1796);
				switchLabel();
				}
				}
				setState(1801);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(PseudoCodeParser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PseudoCodeParser.COLON, 0); }
		public TerminalNode DEFAULT() { return getToken(PseudoCodeParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_switchLabel);
		try {
			setState(1808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1802);
				match(CASE);
				setState(1803);
				constantExpression();
				setState(1804);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1806);
				match(DEFAULT);
				setState(1807);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PseudoCodeParser.WHILE, 0); }
		public List<TerminalNode> Identifier() { return getTokens(PseudoCodeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudoCodeParser.Identifier, i);
		}
		public TerminalNode UPTO() { return getToken(PseudoCodeParser.UPTO, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOWNTO() { return getToken(PseudoCodeParser.DOWNTO, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(PseudoCodeParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(PseudoCodeParser.StringLiteral, i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_whileStatement);
		int _la;
		try {
			int _alt;
			setState(1837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1812);
				match(WHILE);
				setState(1813);
				match(Identifier);
				setState(1814);
				match(UPTO);
				setState(1815);
				additiveExpression(0);
				setState(1816);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1818);
				match(WHILE);
				setState(1819);
				match(Identifier);
				setState(1820);
				match(DOWNTO);
				setState(1821);
				additiveExpression(0);
				setState(1822);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1824);
				match(WHILE);
				setState(1825);
				match(Identifier);
				setState(1826);
				_la = _input.LA(1);
				if ( !(_la==StringLiteral || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1830);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1827);
						_la = _input.LA(1);
						if ( !(_la==StringLiteral || _la==Identifier) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(1832);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				}
				setState(1833);
				additiveExpression(0);
				setState(1834);
				block();
				notifyErrorListeners("wrong syntax for 'while loop' should contain 'up to' or 'down to' keyword");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PseudoCodeParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitWhileStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitWhileStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1839);
			match(WHILE);
			setState(1840);
			match(LPAREN);
			setState(1841);
			expression();
			setState(1842);
			match(RPAREN);
			setState(1843);
			statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(PseudoCodeParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(PseudoCodeParser.WHILE, 0); }
		public List<TerminalNode> Identifier() { return getTokens(PseudoCodeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudoCodeParser.Identifier, i);
		}
		public TerminalNode UPTO() { return getToken(PseudoCodeParser.UPTO, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode DOWNTO() { return getToken(PseudoCodeParser.DOWNTO, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(PseudoCodeParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(PseudoCodeParser.StringLiteral, i);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_doStatement);
		int _la;
		try {
			int _alt;
			setState(1873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1845);
				match(DO);
				setState(1846);
				block();
				setState(1847);
				match(WHILE);
				setState(1848);
				match(Identifier);
				setState(1849);
				match(UPTO);
				setState(1850);
				additiveExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1852);
				match(DO);
				setState(1853);
				block();
				setState(1854);
				match(WHILE);
				setState(1855);
				match(Identifier);
				setState(1856);
				match(DOWNTO);
				setState(1857);
				additiveExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1859);
				match(DO);
				setState(1860);
				block();
				setState(1861);
				match(WHILE);
				setState(1862);
				match(Identifier);
				setState(1863);
				_la = _input.LA(1);
				if ( !(_la==StringLiteral || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1867);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1864);
						_la = _input.LA(1);
						if ( !(_la==StringLiteral || _la==Identifier) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(1869);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				}
				setState(1870);
				additiveExpression(0);
				notifyErrorListeners("wrong syntax for 'do while loop' should contain 'up to' or 'down to' keyword");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public PseudoForStatementContext pseudoForStatement() {
			return getRuleContext(PseudoForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			pseudoForStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public PseudoForStatementContext pseudoForStatement() {
			return getRuleContext(PseudoForStatementContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitForStatementNoShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitForStatementNoShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_forStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1877);
			pseudoForStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudoForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PseudoCodeParser.FOR, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public TerminalNode UPTO() { return getToken(PseudoCodeParser.UPTO, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOWNTO() { return getToken(PseudoCodeParser.DOWNTO, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(PseudoCodeParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(PseudoCodeParser.StringLiteral, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(PseudoCodeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudoCodeParser.Identifier, i);
		}
		public PseudoForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPseudoForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPseudoForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPseudoForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoForStatementContext pseudoForStatement() throws RecognitionException {
		PseudoForStatementContext _localctx = new PseudoForStatementContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_pseudoForStatement);
		int _la;
		try {
			int _alt;
			setState(1904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1879);
				match(FOR);
				setState(1880);
				forInit();
				setState(1881);
				match(UPTO);
				setState(1882);
				additiveExpression(0);
				setState(1883);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1885);
				match(FOR);
				setState(1886);
				forInit();
				setState(1887);
				match(DOWNTO);
				setState(1888);
				additiveExpression(0);
				setState(1889);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1891);
				match(FOR);
				setState(1892);
				forInit();
				setState(1893);
				_la = _input.LA(1);
				if ( !(_la==StringLiteral || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1894);
						_la = _input.LA(1);
						if ( !(_la==StringLiteral || _la==Identifier) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(1899);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				}
				setState(1900);
				additiveExpression(0);
				setState(1901);
				block();
				notifyErrorListeners("wrong syntax for 'for loop' should contain 'up to' or 'down to' keyword");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public ForinitializerContext forinitializer() {
			return getRuleContext(ForinitializerContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_forInit);
		try {
			setState(1908);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1907);
				forinitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForinitializerContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public CustomAssignErrorContext customAssignError() {
			return getRuleContext(CustomAssignErrorContext.class,0);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public ForinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterForinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitForinitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitForinitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForinitializerContext forinitializer() throws RecognitionException {
		ForinitializerContext _localctx = new ForinitializerContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_forinitializer);
		int _la;
		try {
			setState(1917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) {
					{
					setState(1910);
					unannType();
					}
				}

				setState(1913);
				variableDeclaratorId();
				setState(1914);
				customAssignError();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1916);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomAssignErrorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(PseudoCodeParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public CustomAssignErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customAssignError; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterCustomAssignError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitCustomAssignError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitCustomAssignError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomAssignErrorContext customAssignError() throws RecognitionException {
		CustomAssignErrorContext _localctx = new CustomAssignErrorContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_customAssignError);
		try {
			setState(1922);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1919);
				match(ASSIGN);
				setState(1920);
				variableInitializer();
				}
				break;
			case UPTO:
			case DOWNTO:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				notifyErrorListeners("did not find assignment operator");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(PseudoCodeParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1924);
			match(BREAK);
			setState(1925);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(PseudoCodeParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
			match(CONTINUE);
			setState(1928);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PseudoCodeParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
			match(RETURN);
			setState(1932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (IntegerLiteral - 61)) | (1L << (FloatingPointLiteral - 61)) | (1L << (BooleanLiteral - 61)) | (1L << (CharacterLiteral - 61)) | (1L << (StringLiteral - 61)) | (1L << (NullLiteral - 61)) | (1L << (LPAREN - 61)) | (1L << (RPAREN - 61)) | (1L << (BANG - 61)) | (1L << (Identifier - 61)))) != 0)) {
				{
				setState(1931);
				expression();
				}
			}

			setState(1934);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(PseudoCodeParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1936);
			match(THROW);
			setState(1937);
			expression();
			setState(1938);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode SYNCHRONIZED() { return getToken(PseudoCodeParser.SYNCHRONIZED, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSynchronizedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSynchronizedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1940);
			match(SYNCHRONIZED);
			setState(1941);
			match(LPAREN);
			setState(1942);
			expression();
			setState(1943);
			match(RPAREN);
			setState(1944);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(PseudoCodeParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_tryStatement);
		int _la;
		try {
			setState(1958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1946);
				match(TRY);
				setState(1947);
				block();
				setState(1948);
				catches();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1950);
				match(TRY);
				setState(1951);
				block();
				setState(1953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1952);
					catches();
					}
				}

				setState(1955);
				finally_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1957);
				tryWithResourcesStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1960);
			catchClause();
			setState(1964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1961);
				catchClause();
				}
				}
				setState(1966);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(PseudoCodeParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			match(CATCH);
			setState(1968);
			match(LPAREN);
			setState(1969);
			catchFormalParameter();
			setState(1970);
			match(RPAREN);
			setState(1971);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitCatchFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitCatchFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1973);
				variableModifier();
				}
				}
				setState(1978);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1979);
			catchType();
			setState(1980);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public List<TerminalNode> BITOR() { return getTokens(PseudoCodeParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(PseudoCodeParser.BITOR, i);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1982);
			unannClassType();
			setState(1987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1983);
				match(BITOR);
				setState(1984);
				classType();
				}
				}
				setState(1989);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_Context extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(PseudoCodeParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFinally_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFinally_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 344, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			match(FINALLY);
			setState(1991);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(PseudoCodeParser.TRY, 0); }
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTryWithResourcesStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTryWithResourcesStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1993);
			match(TRY);
			setState(1994);
			resourceSpecification();
			setState(1995);
			block();
			setState(1997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1996);
				catches();
				}
			}

			setState(2000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1999);
				finally_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(PseudoCodeParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitResourceSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			match(LPAREN);
			setState(2003);
			resourceList();
			setState(2005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(2004);
				match(SEMI);
				}
			}

			setState(2007);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PseudoCodeParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PseudoCodeParser.SEMI, i);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitResourceList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitResourceList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2009);
			resource();
			setState(2014);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2010);
					match(SEMI);
					setState(2011);
					resource();
					}
					} 
				}
				setState(2016);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PseudoCodeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(2017);
				variableModifier();
				}
				}
				setState(2022);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2023);
			unannType();
			setState(2024);
			variableDeclaratorId();
			setState(2025);
			match(ASSIGN);
			setState(2026);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2028);
			primaryNoNewArray_lfno_primary();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(PseudoCodeParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(PseudoCodeParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(PseudoCodeParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(PseudoCodeParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PseudoCodeParser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(PseudoCodeParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(PseudoCodeParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPrimaryNoNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPrimaryNoNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(2059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2030);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2031);
				typeName();
				setState(2036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2032);
					match(LBRACK);
					setState(2033);
					match(RBRACK);
					}
					}
					setState(2038);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2039);
				match(DOT);
				setState(2040);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2042);
				match(VOID);
				setState(2043);
				match(DOT);
				setState(2044);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2045);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2046);
				typeName();
				setState(2047);
				match(DOT);
				setState(2048);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2050);
				match(LPAREN);
				setState(2051);
				expression();
				setState(2052);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2054);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2055);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2056);
				arrayAccess();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2057);
				methodInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2058);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(PseudoCodeParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(PseudoCodeParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(PseudoCodeParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(PseudoCodeParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PseudoCodeParser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(PseudoCodeParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(PseudoCodeParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_arrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(2091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2063);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2064);
				typeName();
				setState(2069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2065);
					match(LBRACK);
					setState(2066);
					match(RBRACK);
					}
					}
					setState(2071);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2072);
				match(DOT);
				setState(2073);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2075);
				match(VOID);
				setState(2076);
				match(DOT);
				setState(2077);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2078);
				match(THIS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2079);
				typeName();
				setState(2080);
				match(DOT);
				setState(2081);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2083);
				match(LPAREN);
				setState(2084);
				expression();
				setState(2085);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2087);
				classInstanceCreationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2088);
				fieldAccess();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2089);
				methodInvocation();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2090);
				methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(2098);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2093);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2094);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2095);
				arrayAccess_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2096);
				methodInvocation_lf_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2097);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(2106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2102);
				classInstanceCreationExpression_lf_primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2103);
				fieldAccess_lf_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2104);
				methodInvocation_lf_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2105);
				methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_primaryNoNewArray_lfno_primary);
		try {
			setState(2115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2108);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2109);
				match(LPAREN);
				setState(2110);
				expression();
				setState(2111);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2113);
				arrayAccess_lfno_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2114);
				methodInvocation_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(PseudoCodeParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(PseudoCodeParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(PseudoCodeParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(PseudoCodeParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PseudoCodeParser.RBRACK, i);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(PseudoCodeParser.VOID, 0); }
		public TerminalNode THIS() { return getToken(PseudoCodeParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2119);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2120);
				typeName();
				setState(2125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2121);
					match(LBRACK);
					setState(2122);
					match(RBRACK);
					}
					}
					setState(2127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2128);
				match(DOT);
				setState(2129);
				match(CLASS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2131);
				unannPrimitiveType();
				setState(2136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2132);
					match(LBRACK);
					setState(2133);
					match(RBRACK);
					}
					}
					setState(2138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2139);
				match(DOT);
				setState(2140);
				match(CLASS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2142);
				match(VOID);
				setState(2143);
				match(DOT);
				setState(2144);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2145);
				match(THIS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2146);
				typeName();
				setState(2147);
				match(DOT);
				setState(2148);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2150);
				match(LPAREN);
				setState(2151);
				expression();
				setState(2152);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2154);
				classInstanceCreationExpression_lfno_primary();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2155);
				fieldAccess_lfno_primary();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2156);
				methodInvocation_lfno_primary();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2157);
				methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(PseudoCodeParser.NEW, 0); }
		public List<TerminalNode> Identifier() { return getTokens(PseudoCodeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudoCodeParser.Identifier, i);
		}
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(PseudoCodeParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PseudoCodeParser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassInstanceCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassInstanceCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2160);
				match(NEW);
				setState(2162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2161);
					typeArguments();
					}
				}

				setState(2167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2164);
					annotation();
					}
					}
					setState(2169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2170);
				match(Identifier);
				setState(2181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2171);
					match(DOT);
					setState(2175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2172);
						annotation();
						}
						}
						setState(2177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2178);
					match(Identifier);
					}
					}
					setState(2183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2184);
					typeArgumentsOrDiamond();
					}
				}

				setState(2187);
				match(LPAREN);
				setState(2189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(2188);
					argumentList(0);
					}
					break;
				}
				setState(2191);
				match(RPAREN);
				setState(2193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2192);
					classBody();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2195);
				expressionName();
				setState(2196);
				match(DOT);
				setState(2197);
				match(NEW);
				setState(2199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2198);
					typeArguments();
					}
				}

				setState(2204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2201);
					annotation();
					}
					}
					setState(2206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2207);
				match(Identifier);
				setState(2209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2208);
					typeArgumentsOrDiamond();
					}
				}

				setState(2211);
				match(LPAREN);
				setState(2213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(2212);
					argumentList(0);
					}
					break;
				}
				setState(2215);
				match(RPAREN);
				setState(2217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2216);
					classBody();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2219);
				primary();
				setState(2220);
				match(DOT);
				setState(2221);
				match(NEW);
				setState(2223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2222);
					typeArguments();
					}
				}

				setState(2228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2225);
					annotation();
					}
					}
					setState(2230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2231);
				match(Identifier);
				setState(2233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2232);
					typeArgumentsOrDiamond();
					}
				}

				setState(2235);
				match(LPAREN);
				setState(2237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(2236);
					argumentList(0);
					}
					break;
				}
				setState(2239);
				match(RPAREN);
				setState(2241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2240);
					classBody();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public TerminalNode NEW() { return getToken(PseudoCodeParser.NEW, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassInstanceCreationExpression_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2245);
			match(DOT);
			setState(2246);
			match(NEW);
			setState(2248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2247);
				typeArguments();
				}
			}

			setState(2253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2250);
				annotation();
				}
				}
				setState(2255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2256);
			match(Identifier);
			setState(2258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2257);
				typeArgumentsOrDiamond();
				}
			}

			setState(2260);
			match(LPAREN);
			setState(2262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(2261);
				argumentList(0);
				}
				break;
			}
			setState(2264);
			match(RPAREN);
			setState(2266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(2265);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(PseudoCodeParser.NEW, 0); }
		public List<TerminalNode> Identifier() { return getTokens(PseudoCodeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudoCodeParser.Identifier, i);
		}
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(PseudoCodeParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PseudoCodeParser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassInstanceCreationExpression_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2268);
				match(NEW);
				setState(2270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2269);
					typeArguments();
					}
				}

				setState(2275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2272);
					annotation();
					}
					}
					setState(2277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2278);
				match(Identifier);
				setState(2289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2279);
					match(DOT);
					setState(2283);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2280);
						annotation();
						}
						}
						setState(2285);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2286);
					match(Identifier);
					}
					}
					setState(2291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2292);
					typeArgumentsOrDiamond();
					}
				}

				setState(2295);
				match(LPAREN);
				setState(2297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(2296);
					argumentList(0);
					}
					break;
				}
				setState(2299);
				match(RPAREN);
				setState(2301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2300);
					classBody();
					}
				}

				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2303);
				expressionName();
				setState(2304);
				match(DOT);
				setState(2305);
				match(NEW);
				setState(2307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2306);
					typeArguments();
					}
				}

				setState(2312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2309);
					annotation();
					}
					}
					setState(2314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2315);
				match(Identifier);
				setState(2317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2316);
					typeArgumentsOrDiamond();
					}
				}

				setState(2319);
				match(LPAREN);
				setState(2321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(2320);
					argumentList(0);
					}
					break;
				}
				setState(2323);
				match(RPAREN);
				setState(2325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2324);
					classBody();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode LT() { return getToken(PseudoCodeParser.LT, 0); }
		public TerminalNode GT() { return getToken(PseudoCodeParser.GT, 0); }
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_typeArgumentsOrDiamond);
		try {
			setState(2332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2329);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2330);
				match(LT);
				setState(2331);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(PseudoCodeParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PseudoCodeParser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode SUPER() { return getToken(PseudoCodeParser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_fieldAccess);
		try {
			setState(2347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2334);
				primary();
				setState(2335);
				match(DOT);
				setState(2336);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2338);
				match(SUPER);
				setState(2339);
				match(DOT);
				setState(2340);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2341);
				typeName();
				setState(2342);
				match(DOT);
				setState(2343);
				match(SUPER);
				setState(2344);
				match(DOT);
				setState(2345);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFieldAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFieldAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			match(DOT);
			setState(2350);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(PseudoCodeParser.SUPER, 0); }
		public List<TerminalNode> DOT() { return getTokens(PseudoCodeParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PseudoCodeParser.DOT, i);
		}
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFieldAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFieldAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_fieldAccess_lfno_primary);
		try {
			setState(2361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2352);
				match(SUPER);
				setState(2353);
				match(DOT);
				setState(2354);
				match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2355);
				typeName();
				setState(2356);
				match(DOT);
				setState(2357);
				match(SUPER);
				setState(2358);
				match(DOT);
				setState(2359);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(PseudoCodeParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(PseudoCodeParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(PseudoCodeParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PseudoCodeParser.RBRACK, i);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(2363);
				expressionName();
				setState(2364);
				match(LBRACK);
				setState(2365);
				expression();
				setState(2366);
				match(RBRACK);
				}
				break;
			case 2:
				{
				setState(2368);
				primaryNoNewArray_lfno_arrayAccess();
				setState(2369);
				match(LBRACK);
				setState(2370);
				expression();
				setState(2371);
				match(RBRACK);
				}
				break;
			}
			setState(2382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2375);
				primaryNoNewArray_lf_arrayAccess();
				setState(2376);
				match(LBRACK);
				setState(2377);
				expression();
				setState(2378);
				match(RBRACK);
				}
				}
				setState(2384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(PseudoCodeParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(PseudoCodeParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(PseudoCodeParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PseudoCodeParser.RBRACK, i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitArrayAccess_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitArrayAccess_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_arrayAccess_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2385);
			primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2386);
			match(LBRACK);
			setState(2387);
			expression();
			setState(2388);
			match(RBRACK);
			setState(2396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2389);
				primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
				setState(2390);
				match(LBRACK);
				setState(2391);
				expression();
				setState(2392);
				match(RBRACK);
				}
				}
				setState(2398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(PseudoCodeParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PseudoCodeParser.RBRACK, 0); }
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitArrayAccess_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitArrayAccess_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2399);
			expressionName();
			setState(2400);
			match(LBRACK);
			setState(2401);
			expression();
			setState(2402);
			match(RBRACK);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(PseudoCodeParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PseudoCodeParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PseudoCodeParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PseudoCodeParser.RPAREN, i);
		}
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMethodInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMethodInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_methodInvocation);
		int _la;
		try {
			setState(2438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2404);
				methodName();
				setState(2405);
				match(LPAREN);
				setState(2407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(2406);
					argumentList(0);
					}
					break;
				}
				setState(2409);
				match(RPAREN);
				setState(2410);
				match(LPAREN);
				setState(2412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(2411);
					argumentList(0);
					}
					break;
				}
				setState(2414);
				match(RPAREN);
				notifyErrorListeners("redundant parentheses");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2417);
				methodName();
				setState(2418);
				match(LPAREN);
				setState(2420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (IntegerLiteral - 61)) | (1L << (FloatingPointLiteral - 61)) | (1L << (BooleanLiteral - 61)) | (1L << (CharacterLiteral - 61)) | (1L << (StringLiteral - 61)) | (1L << (NullLiteral - 61)) | (1L << (LPAREN - 61)) | (1L << (RPAREN - 61)) | (1L << (COMMA - 61)) | (1L << (BANG - 61)) | (1L << (Identifier - 61)))) != 0)) {
					{
					setState(2419);
					argumentList(0);
					}
				}

				notifyErrorListeners("uneven parenthesis, lacking ')'");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2424);
				methodName();
				setState(2426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(2425);
					argumentList(0);
					}
					break;
				}
				setState(2428);
				match(RPAREN);
				notifyErrorListeners("uneven parenthesis, lacking '('");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2431);
				methodName();
				setState(2432);
				match(LPAREN);
				setState(2434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(2433);
					argumentList(0);
					}
					break;
				}
				setState(2436);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMethodInvocation_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMethodInvocation_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2440);
			match(DOT);
			setState(2442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2441);
				typeArguments();
				}
			}

			setState(2444);
			match(Identifier);
			setState(2445);
			match(LPAREN);
			setState(2447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2446);
				argumentList(0);
				}
				break;
			}
			setState(2449);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(PseudoCodeParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PseudoCodeParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PseudoCodeParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PseudoCodeParser.RPAREN, i);
		}
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
		}
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMethodInvocation_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMethodInvocation_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_methodInvocation_lfno_primary);
		try {
			setState(2478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2451);
				methodName();
				setState(2452);
				match(LPAREN);
				setState(2454);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2453);
					argumentList(0);
					}
					break;
				}
				setState(2456);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2458);
				methodName();
				setState(2459);
				match(LPAREN);
				setState(2461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2460);
					argumentList(0);
					}
					break;
				}
				setState(2463);
				match(RPAREN);
				setState(2464);
				match(LPAREN);
				setState(2466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(2465);
					argumentList(0);
					}
					break;
				}
				setState(2468);
				match(RPAREN);
				notifyErrorListeners("redundant parentheses");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2471);
				methodName();
				setState(2472);
				match(LPAREN);
				setState(2474);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(2473);
					argumentList(0);
					}
					break;
				}
				notifyErrorListeners("no closing parenthesis");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PseudoCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PseudoCodeParser.COMMA, i);
		}
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		return argumentList(0);
	}

	private ArgumentListContext argumentList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, _parentState);
		ArgumentListContext _prevctx = _localctx;
		int _startState = 400;
		enterRecursionRule(_localctx, 400, RULE_argumentList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(2481);
				expression();
				setState(2486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2482);
						match(COMMA);
						setState(2483);
						expression();
						}
						} 
					}
					setState(2488);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(2497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2489);
					expression();
					setState(2494);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2490);
						match(COMMA);
						setState(2491);
						expression();
						}
						}
						setState(2496);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2499);
				expression();
				setState(2500);
				argumentList(4);
				notifyErrorListeners("no separator found in parameters");
				}
				break;
			case 3:
				{
				setState(2506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2503);
						match(COMMA);
						}
						} 
					}
					setState(2508);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
				}
				setState(2509);
				match(COMMA);
				setState(2510);
				argumentList(3);
				notifyErrorListeners("lacking parameter");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2536);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
					case 1:
						{
						_localctx = new ArgumentListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_argumentList);
						setState(2515);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2516);
						match(COMMA);
						setState(2517);
						match(COMMA);
						setState(2521);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(2518);
								match(COMMA);
								}
								} 
							}
							setState(2523);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
						}
						setState(2524);
						argumentList(2);
						notifyErrorListeners("lacking parameter");
						}
						break;
					case 2:
						{
						_localctx = new ArgumentListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_argumentList);
						setState(2527);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2528);
						match(COMMA);
						setState(2532);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(2529);
								match(COMMA);
								}
								} 
							}
							setState(2534);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
						}
						notifyErrorListeners("lacking parameter");
						}
						break;
					}
					} 
				}
				setState(2540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(PseudoCodeParser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(PseudoCodeParser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(PseudoCodeParser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_methodReference);
		int _la;
		try {
			setState(2588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2541);
				expressionName();
				setState(2542);
				match(COLONCOLON);
				setState(2544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2543);
					typeArguments();
					}
				}

				setState(2546);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2548);
				referenceType();
				setState(2549);
				match(COLONCOLON);
				setState(2551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2550);
					typeArguments();
					}
				}

				setState(2553);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2555);
				primary();
				setState(2556);
				match(COLONCOLON);
				setState(2558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2557);
					typeArguments();
					}
				}

				setState(2560);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2562);
				match(SUPER);
				setState(2563);
				match(COLONCOLON);
				setState(2565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2564);
					typeArguments();
					}
				}

				setState(2567);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2568);
				typeName();
				setState(2569);
				match(DOT);
				setState(2570);
				match(SUPER);
				setState(2571);
				match(COLONCOLON);
				setState(2573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2572);
					typeArguments();
					}
				}

				setState(2575);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2577);
				classType();
				setState(2578);
				match(COLONCOLON);
				setState(2580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2579);
					typeArguments();
					}
				}

				setState(2582);
				match(NEW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2584);
				arrayType();
				setState(2585);
				match(COLONCOLON);
				setState(2586);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TerminalNode COLONCOLON() { return getToken(PseudoCodeParser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMethodReference_lf_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMethodReference_lf_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2590);
			match(COLONCOLON);
			setState(2592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2591);
				typeArguments();
				}
			}

			setState(2594);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public TerminalNode COLONCOLON() { return getToken(PseudoCodeParser.COLONCOLON, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(PseudoCodeParser.SUPER, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PseudoCodeParser.DOT, 0); }
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode NEW() { return getToken(PseudoCodeParser.NEW, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMethodReference_lfno_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMethodReference_lfno_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2596);
				expressionName();
				setState(2597);
				match(COLONCOLON);
				setState(2599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2598);
					typeArguments();
					}
				}

				setState(2601);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2603);
				referenceType();
				setState(2604);
				match(COLONCOLON);
				setState(2606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2605);
					typeArguments();
					}
				}

				setState(2608);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2610);
				match(SUPER);
				setState(2611);
				match(COLONCOLON);
				setState(2613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2612);
					typeArguments();
					}
				}

				setState(2615);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2616);
				typeName();
				setState(2617);
				match(DOT);
				setState(2618);
				match(SUPER);
				setState(2619);
				match(COLONCOLON);
				setState(2621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2620);
					typeArguments();
					}
				}

				setState(2623);
				match(Identifier);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2625);
				classType();
				setState(2626);
				match(COLONCOLON);
				setState(2628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2627);
					typeArguments();
					}
				}

				setState(2630);
				match(NEW);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2632);
				arrayType();
				setState(2633);
				match(COLONCOLON);
				setState(2634);
				match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(PseudoCodeParser.NEW, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitArrayCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitArrayCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_arrayCreationExpression);
		int _la;
		try {
			setState(2660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2638);
				match(NEW);
				setState(2639);
				primitiveType();
				setState(2640);
				dimExprs();
				setState(2642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(2641);
					dims();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2644);
				match(NEW);
				setState(2645);
				classOrInterfaceType();
				setState(2646);
				dimExprs();
				setState(2648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(2647);
					dims();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2650);
				match(NEW);
				setState(2651);
				primitiveType();
				setState(2652);
				dims();
				setState(2653);
				arrayInitializer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2655);
				match(NEW);
				setState(2656);
				classOrInterfaceType();
				setState(2657);
				dims();
				setState(2658);
				arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDimExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2662);
			dimExpr();
			setState(2666);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2663);
					dimExpr();
					}
					} 
				}
				setState(2668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(PseudoCodeParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PseudoCodeParser.RBRACK, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDimExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDimExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2669);
				annotation();
				}
				}
				setState(2674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2675);
			match(LBRACK);
			setState(2676);
			expression();
			setState(2677);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2679);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ErrorParenthesisContext errorParenthesis() {
			return getRuleContext(ErrorParenthesisContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_expression);
		try {
			setState(2697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2681);
				assignmentExpression();
				setState(2682);
				errorParenthesis();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2684);
				match(LPAREN);
				setState(2685);
				match(RPAREN);
				setState(2686);
				assignmentExpression();
				notifyErrorListeners("redundant parenthesis");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2689);
				match(RPAREN);
				setState(2690);
				assignmentExpression();
				notifyErrorListeners("uneven parenthesis, lacking '('");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2693);
				match(LPAREN);
				setState(2694);
				assignmentExpression();
				notifyErrorListeners("uneven parenthesis, lacking ')'");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorParenthesisContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public ErrorParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorParenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterErrorParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitErrorParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitErrorParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorParenthesisContext errorParenthesis() throws RecognitionException {
		ErrorParenthesisContext _localctx = new ErrorParenthesisContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_errorParenthesis);
		try {
			setState(2707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2700);
				match(LPAREN);
				setState(2701);
				match(RPAREN);
				notifyErrorListeners("redundant parenthesis");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2703);
				match(RPAREN);
				notifyErrorListeners("uneven parenthesis, lacking '('");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2705);
				match(LPAREN);
				notifyErrorListeners("uneven parenthesis, lacking ')'");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(PseudoCodeParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2709);
			lambdaParameters();
			setState(2710);
			match(ARROW);
			setState(2711);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_lambdaParameters);
		int _la;
		try {
			setState(2723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2713);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2714);
				match(LPAREN);
				setState(2716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==COMMA || _la==Identifier) {
					{
					setState(2715);
					formalParameterList();
					}
				}

				setState(2718);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2719);
				match(LPAREN);
				setState(2720);
				inferredFormalParameterList();
				setState(2721);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(PseudoCodeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudoCodeParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PseudoCodeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PseudoCodeParser.COMMA, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInferredFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInferredFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2725);
			match(Identifier);
			setState(2730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2726);
				match(COMMA);
				setState(2727);
				match(Identifier);
				}
				}
				setState(2732);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_lambdaBody);
		try {
			setState(2735);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case RPAREN:
			case BANG:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2733);
				expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2734);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2737);
			conditionalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2739);
			leftHandSide();
			setState(2740);
			assignmentOperator();
			setState(2741);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLeftHandSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_leftHandSide);
		try {
			setState(2746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2743);
				expressionName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2744);
				fieldAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2745);
				arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(PseudoCodeParser.ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(PseudoCodeParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(PseudoCodeParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(PseudoCodeParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(PseudoCodeParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(PseudoCodeParser.SUB_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(PseudoCodeParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(PseudoCodeParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(PseudoCodeParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(PseudoCodeParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(PseudoCodeParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(PseudoCodeParser.OR_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2748);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (ASSIGN - 76)) | (1L << (ADD_ASSIGN - 76)) | (1L << (SUB_ASSIGN - 76)) | (1L << (MUL_ASSIGN - 76)) | (1L << (DIV_ASSIGN - 76)) | (1L << (AND_ASSIGN - 76)) | (1L << (OR_ASSIGN - 76)) | (1L << (XOR_ASSIGN - 76)) | (1L << (MOD_ASSIGN - 76)) | (1L << (LSHIFT_ASSIGN - 76)) | (1L << (RSHIFT_ASSIGN - 76)) | (1L << (URSHIFT_ASSIGN - 76)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2750);
			conditionalOrExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnlyConditionalExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode BooleanLiteral() { return getToken(PseudoCodeParser.BooleanLiteral, 0); }
		public OnlyConditionalOrExpressionContext onlyConditionalOrExpression() {
			return getRuleContext(OnlyConditionalOrExpressionContext.class,0);
		}
		public OnlyConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onlyConditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterOnlyConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitOnlyConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitOnlyConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnlyConditionalExpressionContext onlyConditionalExpression() throws RecognitionException {
		OnlyConditionalExpressionContext _localctx = new OnlyConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_onlyConditionalExpression);
		try {
			setState(2755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2752);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2753);
				match(BooleanLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2754);
				onlyConditionalOrExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(PseudoCodeParser.OR, 0); }
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2758);
			conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2760);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2761);
					match(OR);
					setState(2762);
					conditionalAndExpression(0);
					}
					} 
				}
				setState(2767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OnlyConditionalOrExpressionContext extends ParserRuleContext {
		public OnlyConditionalAndExpressionContext onlyConditionalAndExpression() {
			return getRuleContext(OnlyConditionalAndExpressionContext.class,0);
		}
		public OnlyConditionalOrExpressionContext onlyConditionalOrExpression() {
			return getRuleContext(OnlyConditionalOrExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(PseudoCodeParser.OR, 0); }
		public OnlyConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onlyConditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterOnlyConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitOnlyConditionalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitOnlyConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnlyConditionalOrExpressionContext onlyConditionalOrExpression() throws RecognitionException {
		return onlyConditionalOrExpression(0);
	}

	private OnlyConditionalOrExpressionContext onlyConditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OnlyConditionalOrExpressionContext _localctx = new OnlyConditionalOrExpressionContext(_ctx, _parentState);
		OnlyConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_onlyConditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2769);
			onlyConditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2776);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OnlyConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_onlyConditionalOrExpression);
					setState(2771);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2772);
					match(OR);
					setState(2773);
					onlyConditionalAndExpression(0);
					}
					} 
				}
				setState(2778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(PseudoCodeParser.AND, 0); }
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2780);
			inclusiveOrExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2787);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2782);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2783);
					match(AND);
					setState(2784);
					inclusiveOrExpression();
					}
					} 
				}
				setState(2789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OnlyConditionalAndExpressionContext extends ParserRuleContext {
		public OnlyEqualityExpressionContext onlyEqualityExpression() {
			return getRuleContext(OnlyEqualityExpressionContext.class,0);
		}
		public OnlyConditionalAndExpressionContext onlyConditionalAndExpression() {
			return getRuleContext(OnlyConditionalAndExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(PseudoCodeParser.AND, 0); }
		public OnlyConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onlyConditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterOnlyConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitOnlyConditionalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitOnlyConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnlyConditionalAndExpressionContext onlyConditionalAndExpression() throws RecognitionException {
		return onlyConditionalAndExpression(0);
	}

	private OnlyConditionalAndExpressionContext onlyConditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OnlyConditionalAndExpressionContext _localctx = new OnlyConditionalAndExpressionContext(_ctx, _parentState);
		OnlyConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_onlyConditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2791);
			onlyEqualityExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2798);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OnlyConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_onlyConditionalAndExpression);
					setState(2793);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2794);
					match(AND);
					setState(2795);
					onlyEqualityExpression();
					}
					} 
				}
				setState(2800);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_inclusiveOrExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2801);
			exclusiveOrExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_exclusiveOrExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2803);
			andExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_andExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2805);
			equalityExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PseudoCodeParser.ASSIGN, 0); }
		public TerminalNode EQUAL() { return getToken(PseudoCodeParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PseudoCodeParser.NOTEQUAL, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 454;
		enterRecursionRule(_localctx, 454, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2808);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2823);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2821);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2810);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2811);
						match(ASSIGN);
						setState(2812);
						relationalExpression(0);
						notifyErrorListeners("assignment operator found, expecting comparison operator");
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2815);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2816);
						match(EQUAL);
						setState(2817);
						relationalExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2818);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2819);
						match(NOTEQUAL);
						setState(2820);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2825);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OnlyEqualityExpressionContext extends ParserRuleContext {
		public OnlyRelationalExpressionContext onlyRelationalExpression() {
			return getRuleContext(OnlyRelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PseudoCodeParser.ASSIGN, 0); }
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PseudoCodeParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PseudoCodeParser.NOTEQUAL, 0); }
		public OnlyEqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onlyEqualityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterOnlyEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitOnlyEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitOnlyEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnlyEqualityExpressionContext onlyEqualityExpression() throws RecognitionException {
		OnlyEqualityExpressionContext _localctx = new OnlyEqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_onlyEqualityExpression);
		try {
			setState(2840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2826);
				onlyRelationalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2827);
				equalityExpression(0);
				setState(2828);
				match(ASSIGN);
				setState(2829);
				relationalExpression(0);
				notifyErrorListeners("assignment operator found, expecting comparison operator");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2832);
				equalityExpression(0);
				setState(2833);
				match(EQUAL);
				setState(2834);
				relationalExpression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2836);
				equalityExpression(0);
				setState(2837);
				match(NOTEQUAL);
				setState(2838);
				relationalExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(PseudoCodeParser.LT, 0); }
		public TerminalNode GT() { return getToken(PseudoCodeParser.GT, 0); }
		public TerminalNode LE() { return getToken(PseudoCodeParser.LE, 0); }
		public TerminalNode GE() { return getToken(PseudoCodeParser.GE, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 458;
		enterRecursionRule(_localctx, 458, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2843);
			shiftExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2859);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2857);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2845);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2846);
						match(LT);
						setState(2847);
						shiftExpression();
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2848);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2849);
						match(GT);
						setState(2850);
						shiftExpression();
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2851);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2852);
						match(LE);
						setState(2853);
						shiftExpression();
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2854);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2855);
						match(GE);
						setState(2856);
						shiftExpression();
						}
						break;
					}
					} 
				}
				setState(2861);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OnlyRelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(PseudoCodeParser.LT, 0); }
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode GT() { return getToken(PseudoCodeParser.GT, 0); }
		public TerminalNode LE() { return getToken(PseudoCodeParser.LE, 0); }
		public TerminalNode GE() { return getToken(PseudoCodeParser.GE, 0); }
		public OnlyRelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onlyRelationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterOnlyRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitOnlyRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitOnlyRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnlyRelationalExpressionContext onlyRelationalExpression() throws RecognitionException {
		OnlyRelationalExpressionContext _localctx = new OnlyRelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_onlyRelationalExpression);
		try {
			setState(2878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2862);
				relationalExpression(0);
				setState(2863);
				match(LT);
				setState(2864);
				shiftExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2866);
				relationalExpression(0);
				setState(2867);
				match(GT);
				setState(2868);
				shiftExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2870);
				relationalExpression(0);
				setState(2871);
				match(LE);
				setState(2872);
				shiftExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2874);
				relationalExpression(0);
				setState(2875);
				match(GE);
				setState(2876);
				shiftExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_shiftExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2880);
			additiveExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionfactoredContext additiveExpressionfactored() {
			return getRuleContext(AdditiveExpressionfactoredContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 464;
		enterRecursionRule(_localctx, 464, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2883);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2889);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(2885);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2886);
					additiveExpressionfactored();
					}
					} 
				}
				setState(2891);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionfactoredContext extends ParserRuleContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public List<TerminalNode> INC() { return getTokens(PseudoCodeParser.INC); }
		public TerminalNode INC(int i) {
			return getToken(PseudoCodeParser.INC, i);
		}
		public List<TerminalNode> DEC() { return getTokens(PseudoCodeParser.DEC); }
		public TerminalNode DEC(int i) {
			return getToken(PseudoCodeParser.DEC, i);
		}
		public AddminusContext addminus() {
			return getRuleContext(AddminusContext.class,0);
		}
		public AdditiveExpressionfactoredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpressionfactored; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAdditiveExpressionfactored(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAdditiveExpressionfactored(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAdditiveExpressionfactored(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionfactoredContext additiveExpressionfactored() throws RecognitionException {
		AdditiveExpressionfactoredContext _localctx = new AdditiveExpressionfactoredContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_additiveExpressionfactored);
		int _la;
		try {
			setState(2935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2892);
				arithmetic();
				setState(2893);
				arithmetic();
				setState(2899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (INC - 89)) | (1L << (DEC - 89)) | (1L << (ADD - 89)) | (1L << (SUB - 89)) | (1L << (MUL - 89)) | (1L << (DIV - 89)) | (1L << (MOD - 89)))) != 0)) {
					{
					setState(2897);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADD:
					case SUB:
					case MUL:
					case DIV:
					case MOD:
						{
						setState(2894);
						arithmetic();
						}
						break;
					case INC:
						{
						setState(2895);
						match(INC);
						}
						break;
					case DEC:
						{
						setState(2896);
						match(DEC);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2901);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2902);
				multiplicativeExpression(0);
				notifyErrorListeners("redundant arithmetic operator symbol found");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2905);
				match(INC);
				setState(2911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (INC - 89)) | (1L << (DEC - 89)) | (1L << (ADD - 89)) | (1L << (SUB - 89)) | (1L << (MUL - 89)) | (1L << (DIV - 89)) | (1L << (MOD - 89)))) != 0)) {
					{
					setState(2909);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADD:
					case SUB:
					case MUL:
					case DIV:
					case MOD:
						{
						setState(2906);
						arithmetic();
						}
						break;
					case INC:
						{
						setState(2907);
						match(INC);
						}
						break;
					case DEC:
						{
						setState(2908);
						match(DEC);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2913);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2914);
				multiplicativeExpression(0);
				notifyErrorListeners("redundant arithmetic operator symbol found");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2917);
				match(DEC);
				setState(2923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (INC - 89)) | (1L << (DEC - 89)) | (1L << (ADD - 89)) | (1L << (SUB - 89)) | (1L << (MUL - 89)) | (1L << (DIV - 89)) | (1L << (MOD - 89)))) != 0)) {
					{
					setState(2921);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADD:
					case SUB:
					case MUL:
					case DIV:
					case MOD:
						{
						setState(2918);
						arithmetic();
						}
						break;
					case INC:
						{
						setState(2919);
						match(INC);
						}
						break;
					case DEC:
						{
						setState(2920);
						match(DEC);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2925);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2926);
				multiplicativeExpression(0);
				notifyErrorListeners("redundant arithmetic operator symbol found");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2929);
				addminus();
				notifyErrorListeners("lacking argument after operator/excess operator");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2932);
				addminus();
				setState(2933);
				multiplicativeExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddminusContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PseudoCodeParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PseudoCodeParser.SUB, 0); }
		public AddminusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addminus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAddminus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAddminus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAddminus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddminusContext addminus() throws RecognitionException {
		AddminusContext _localctx = new AddminusContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_addminus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2937);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionfactoredContext multiplicativeExpressionfactored() {
			return getRuleContext(MultiplicativeExpressionfactoredContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 470;
		enterRecursionRule(_localctx, 470, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2940);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2946);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
					setState(2942);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2943);
					multiplicativeExpressionfactored();
					}
					} 
				}
				setState(2948);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionfactoredContext extends ParserRuleContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public List<TerminalNode> INC() { return getTokens(PseudoCodeParser.INC); }
		public TerminalNode INC(int i) {
			return getToken(PseudoCodeParser.INC, i);
		}
		public List<TerminalNode> DEC() { return getTokens(PseudoCodeParser.DEC); }
		public TerminalNode DEC(int i) {
			return getToken(PseudoCodeParser.DEC, i);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public MultiplicativeExpressionfactoredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpressionfactored; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMultiplicativeExpressionfactored(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMultiplicativeExpressionfactored(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMultiplicativeExpressionfactored(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionfactoredContext multiplicativeExpressionfactored() throws RecognitionException {
		MultiplicativeExpressionfactoredContext _localctx = new MultiplicativeExpressionfactoredContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_multiplicativeExpressionfactored);
		int _la;
		try {
			setState(2968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2949);
				arithmetic();
				setState(2950);
				arithmetic();
				setState(2956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (INC - 89)) | (1L << (DEC - 89)) | (1L << (ADD - 89)) | (1L << (SUB - 89)) | (1L << (MUL - 89)) | (1L << (DIV - 89)) | (1L << (MOD - 89)))) != 0)) {
					{
					setState(2954);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ADD:
					case SUB:
					case MUL:
					case DIV:
					case MOD:
						{
						setState(2951);
						arithmetic();
						}
						break;
					case INC:
						{
						setState(2952);
						match(INC);
						}
						break;
					case DEC:
						{
						setState(2953);
						match(DEC);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2958);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2959);
				unaryExpression();
				notifyErrorListeners("redundant arithmetic operator symbol found");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2962);
				mult();
				notifyErrorListeners("lacking argument after operator/excess operator");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2965);
				mult();
				setState(2966);
				unaryExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PseudoCodeParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PseudoCodeParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(PseudoCodeParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PseudoCodeParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PseudoCodeParser.MOD, 0); }
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2970);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (ADD - 91)) | (1L << (SUB - 91)) | (1L << (MUL - 91)) | (1L << (DIV - 91)) | (1L << (MOD - 91)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(PseudoCodeParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PseudoCodeParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PseudoCodeParser.MOD, 0); }
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2972);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (MUL - 93)) | (1L << (DIV - 93)) | (1L << (MOD - 93)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_unaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2974);
			unaryExpressionNotPlusMinus();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(PseudoCodeParser.INC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2976);
			match(INC);
			setState(2977);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(PseudoCodeParser.DEC, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPreDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPreDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2979);
			match(DEC);
			setState(2980);
			unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(PseudoCodeParser.BANG, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2982);
				postfixExpression();
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(2983);
				match(BANG);
				setState(2984);
				unaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionIncContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostfixExpressionIncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpressionInc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPostfixExpressionInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPostfixExpressionInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPostfixExpressionInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionIncContext postfixExpressionInc() throws RecognitionException {
		PostfixExpressionIncContext _localctx = new PostfixExpressionIncContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_postfixExpressionInc);
		int _la;
		try {
			setState(2996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2987);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2988);
				expressionName();
				setState(2993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INC || _la==DEC) {
					{
					setState(2991);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2989);
						postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2990);
						postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2995);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_postfixExpression);
		try {
			setState(3000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2998);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2999);
				expressionName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode INC() { return getToken(PseudoCodeParser.INC, 0); }
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3002);
			postfixExpression();
			setState(3003);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(PseudoCodeParser.INC, 0); }
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPostIncrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3005);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DEC() { return getToken(PseudoCodeParser.DEC, 0); }
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPostDecrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPostDecrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3007);
			postfixExpression();
			setState(3008);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(PseudoCodeParser.DEC, 0); }
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPostDecrementExpression_lf_postfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3010);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PseudoCodeParser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PseudoCodeParser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_castExpression);
		int _la;
		try {
			setState(3039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3012);
				match(LPAREN);
				setState(3013);
				primitiveType();
				setState(3014);
				match(RPAREN);
				setState(3015);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3017);
				match(LPAREN);
				setState(3018);
				referenceType();
				setState(3022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3019);
					additionalBound();
					}
					}
					setState(3024);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3025);
				match(RPAREN);
				setState(3026);
				unaryExpressionNotPlusMinus();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3028);
				match(LPAREN);
				setState(3029);
				referenceType();
				setState(3033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(3030);
					additionalBound();
					}
					}
					setState(3035);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3036);
				match(RPAREN);
				setState(3037);
				lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 28:
			return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);
		case 31:
			return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);
		case 77:
			return formalParameters_sempred((FormalParametersContext)_localctx, predIndex);
		case 200:
			return argumentList_sempred((ArgumentListContext)_localctx, predIndex);
		case 220:
			return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);
		case 221:
			return onlyConditionalOrExpression_sempred((OnlyConditionalOrExpressionContext)_localctx, predIndex);
		case 222:
			return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);
		case 223:
			return onlyConditionalAndExpression_sempred((OnlyConditionalAndExpressionContext)_localctx, predIndex);
		case 227:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 229:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 232:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 235:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean formalParameters_sempred(FormalParametersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean argumentList_sempred(ArgumentListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean onlyConditionalOrExpression_sempred(OnlyConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean onlyConditionalAndExpression_sempred(OnlyConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3x\u0be4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\3\2\3\2\3\3\3\3\5\3\u01fb\n\3\3\4\7\4\u01fe\n"+
		"\4\f\4\16\4\u0201\13\4\3\4\3\4\7\4\u0205\n\4\f\4\16\4\u0208\13\4\3\4\5"+
		"\4\u020b\n\4\3\5\3\5\5\5\u020f\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b\u0218"+
		"\n\b\3\t\3\t\5\t\u021c\n\t\3\t\3\t\7\t\u0220\n\t\f\t\16\t\u0223\13\t\3"+
		"\n\7\n\u0226\n\n\f\n\16\n\u0229\13\n\3\n\3\n\5\n\u022d\n\n\3\n\3\n\3\n"+
		"\7\n\u0232\n\n\f\n\16\n\u0235\13\n\3\n\3\n\5\n\u0239\n\n\5\n\u023b\n\n"+
		"\3\13\3\13\7\13\u023f\n\13\f\13\16\13\u0242\13\13\3\13\3\13\5\13\u0246"+
		"\n\13\3\f\7\f\u0249\n\f\f\f\16\f\u024c\13\f\3\f\3\f\5\f\u0250\n\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\7\20\u0259\n\20\f\20\16\20\u025c\13\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0269\n\21"+
		"\3\22\3\22\3\22\3\22\7\22\u026f\n\22\f\22\16\22\u0272\13\22\3\23\7\23"+
		"\u0275\n\23\f\23\16\23\u0278\13\23\3\23\3\23\5\23\u027c\n\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u0285\n\25\f\25\16\25\u0288\13\25\5\25"+
		"\u028a\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0296"+
		"\n\30\f\30\16\30\u0299\13\30\3\31\3\31\5\31\u029d\n\31\3\32\7\32\u02a0"+
		"\n\32\f\32\16\32\u02a3\13\32\3\32\3\32\5\32\u02a7\n\32\3\33\3\33\3\33"+
		"\3\33\5\33\u02ad\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u02b5\n\34\f"+
		"\34\16\34\u02b8\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u02bf\n\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\7\36\u02c7\n\36\f\36\16\36\u02ca\13\36\3\37\3"+
		"\37\3\37\3\37\3\37\5\37\u02d1\n\37\3 \3 \3!\3!\3!\3!\3!\3!\7!\u02db\n"+
		"!\f!\16!\u02de\13!\3\"\7\"\u02e1\n\"\f\"\16\"\u02e4\13\"\3\"\3\"\7\"\u02e8"+
		"\n\"\f\"\16\"\u02eb\13\"\3\"\3\"\3#\3#\3#\3#\3#\3$\7$\u02f5\n$\f$\16$"+
		"\u02f8\13$\3$\3$\3$\3$\7$\u02fe\n$\f$\16$\u0301\13$\3$\3$\3%\3%\3&\3&"+
		"\3&\3&\5&\u030b\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\5+\u0328\n+\3,\3,\5,\u032c\n,\3-\7"+
		"-\u032f\n-\f-\16-\u0332\13-\3-\3-\3-\5-\u0337\n-\3-\5-\u033a\n-\3-\5-"+
		"\u033d\n-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0349\n.\3/\3/\3/\3/\3\60\3"+
		"\60\3\60\7\60\u0352\n\60\f\60\16\60\u0355\13\60\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\7\63\u0360\n\63\f\63\16\63\u0363\13\63\3\64\3"+
		"\64\7\64\u0367\n\64\f\64\16\64\u036a\13\64\3\64\3\64\3\65\3\65\3\66\3"+
		"\66\3\67\7\67\u0373\n\67\f\67\16\67\u0376\13\67\3\67\3\67\3\67\3\67\3"+
		"8\38\38\38\38\38\38\38\58\u0384\n8\39\39\39\79\u0389\n9\f9\169\u038c\13"+
		"9\3:\3:\3:\5:\u0391\n:\3:\3:\3:\5:\u0396\n:\3:\3:\5:\u039a\n:\3;\3;\3"+
		"<\3<\5<\u03a0\n<\3=\3=\3>\3>\3>\5>\u03a7\n>\3?\3?\3?\5?\u03ac\n?\3@\3"+
		"@\5@\u03b0\n@\3@\3@\7@\u03b4\n@\f@\16@\u03b7\13@\3A\3A\5A\u03bb\nA\3A"+
		"\3A\3A\7A\u03c0\nA\fA\16A\u03c3\13A\3A\3A\5A\u03c7\nA\5A\u03c9\nA\3B\3"+
		"B\7B\u03cd\nB\fB\16B\u03d0\13B\3B\3B\5B\u03d4\nB\3C\3C\5C\u03d8\nC\3D"+
		"\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u03eb\nH\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0401\nI\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\5J\u040d\nJ\3K\3K\3K\5K\u0412\nK\3K\3K\7K\u0416"+
		"\nK\fK\16K\u0419\13K\3K\3K\3K\5K\u041e\nK\5K\u0420\nK\3L\3L\5L\u0424\n"+
		"L\3M\3M\3M\5M\u0429\nM\3M\3M\3M\3M\5M\u042f\nM\3M\3M\3M\5M\u0434\nM\3"+
		"M\3M\5M\u0438\nM\3N\3N\3O\3O\3O\3O\7O\u0440\nO\fO\16O\u0443\13O\3O\3O"+
		"\3O\7O\u0448\nO\fO\16O\u044b\13O\5O\u044d\nO\3O\3O\3O\3O\3O\7O\u0454\n"+
		"O\fO\16O\u0457\13O\3O\3O\3O\3O\5O\u045d\nO\3O\3O\3O\3O\7O\u0463\nO\fO"+
		"\16O\u0466\13O\3O\3O\3O\3O\3O\3O\7O\u046e\nO\fO\16O\u0471\13O\3O\7O\u0474"+
		"\nO\fO\16O\u0477\13O\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0482\nP\3Q\3Q\5Q\u0486"+
		"\nQ\3R\7R\u0489\nR\fR\16R\u048c\13R\3R\3R\7R\u0490\nR\fR\16R\u0493\13"+
		"R\3R\3R\3R\3R\5R\u0499\nR\3S\7S\u049c\nS\fS\16S\u049f\13S\3S\3S\3S\5S"+
		"\u04a4\nS\3S\3S\3T\3T\3T\3U\3U\3U\7U\u04ae\nU\fU\16U\u04b1\13U\3V\3V\5"+
		"V\u04b5\nV\3W\3W\5W\u04b9\nW\3X\3X\3Y\3Y\3Y\3Z\7Z\u04c1\nZ\fZ\16Z\u04c4"+
		"\13Z\3Z\3Z\5Z\u04c8\nZ\3Z\3Z\3[\3[\3[\3[\5[\u04d0\n[\3\\\5\\\u04d3\n\\"+
		"\3\\\3\\\3\\\5\\\u04d8\n\\\3\\\3\\\3]\3]\3^\3^\5^\u04e0\n^\3^\5^\u04e3"+
		"\n^\3^\3^\3_\5_\u04e8\n_\3_\3_\3_\5_\u04ed\n_\3_\3_\3_\5_\u04f2\n_\3_"+
		"\3_\3_\5_\u04f7\n_\3_\3_\3_\3_\3_\5_\u04fe\n_\3_\3_\3_\5_\u0503\n_\3_"+
		"\3_\3_\3_\3_\3_\5_\u050b\n_\3_\3_\3_\5_\u0510\n_\3_\3_\3_\5_\u0515\n_"+
		"\3`\7`\u0518\n`\f`\16`\u051b\13`\3`\3`\3`\5`\u0520\n`\3`\3`\3a\3a\5a\u0526"+
		"\na\3a\5a\u0529\na\3a\5a\u052c\na\3a\3a\3b\3b\3b\7b\u0533\nb\fb\16b\u0536"+
		"\13b\3c\7c\u0539\nc\fc\16c\u053c\13c\3c\3c\3c\5c\u0541\nc\3c\5c\u0544"+
		"\nc\3c\5c\u0547\nc\3d\3d\3e\3e\7e\u054d\ne\fe\16e\u0550\13e\3f\3f\5f\u0554"+
		"\nf\3g\7g\u0557\ng\fg\16g\u055a\13g\3g\3g\3g\5g\u055f\ng\3g\5g\u0562\n"+
		"g\3g\3g\3h\3h\3h\3h\3h\3h\3h\5h\u056d\nh\3i\3i\3i\3j\3j\7j\u0574\nj\f"+
		"j\16j\u0577\13j\3j\3j\3k\3k\3k\3k\3k\5k\u0580\nk\3l\7l\u0583\nl\fl\16"+
		"l\u0586\13l\3l\3l\3l\3l\3m\3m\3m\3m\5m\u0590\nm\3n\7n\u0593\nn\fn\16n"+
		"\u0596\13n\3n\3n\3n\3o\3o\3o\3o\3o\3o\5o\u05a1\no\3p\7p\u05a4\np\fp\16"+
		"p\u05a7\13p\3p\3p\3p\3p\3p\3q\3q\7q\u05b0\nq\fq\16q\u05b3\13q\3q\3q\3"+
		"r\3r\3r\3r\3r\5r\u05bc\nr\3s\7s\u05bf\ns\fs\16s\u05c2\13s\3s\3s\3s\3s"+
		"\3s\5s\u05c9\ns\3s\5s\u05cc\ns\3s\3s\3t\3t\3t\5t\u05d3\nt\3u\3u\3u\3v"+
		"\3v\3v\5v\u05db\nv\3w\3w\3w\3w\5w\u05e1\nw\3w\3w\3x\3x\3x\7x\u05e8\nx"+
		"\fx\16x\u05eb\13x\3y\3y\3y\3y\3z\3z\3z\5z\u05f4\nz\3{\3{\5{\u05f8\n{\3"+
		"{\5{\u05fb\n{\3{\3{\3|\3|\3|\7|\u0602\n|\f|\16|\u0605\13|\3}\3}\3}\3~"+
		"\3~\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3\177\3\177\3\u0080\3\u0080\3"+
		"\u0080\7\u0080\u0619\n\u0080\f\u0080\16\u0080\u061c\13\u0080\3\u0081\3"+
		"\u0081\5\u0081\u0620\n\u0081\3\u0081\3\u0081\3\u0082\3\u0082\7\u0082\u0626"+
		"\n\u0082\f\u0082\16\u0082\u0629\13\u0082\3\u0083\3\u0083\5\u0083\u062d"+
		"\n\u0083\3\u0084\3\u0084\3\u0084\3\u0085\5\u0085\u0633\n\u0085\3\u0085"+
		"\3\u0085\5\u0085\u0637\n\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\5\u0085\u063e\n\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0643\n\u0085\3"+
		"\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0649\n\u0086\3\u0087\3\u0087\3"+
		"\u0087\3\u0087\3\u0087\5\u0087\u0650\n\u0087\3\u0088\3\u0088\3\u0088\3"+
		"\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u065b\n\u0088\3"+
		"\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\5\u008d\u0672\n\u008d\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\7\u008e\u0679\n\u008e\f\u008e\16\u008e\u067c\13\u008e"+
		"\5\u008e\u067e\n\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\7\u008e\u0686\n\u008e\f\u008e\16\u008e\u0689\13\u008e\5\u008e\u068b\n"+
		"\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e"+
		"\u0694\n\u008e\3\u008e\3\u008e\5\u008e\u0698\n\u008e\3\u008e\3\u008e\7"+
		"\u008e\u069c\n\u008e\f\u008e\16\u008e\u069f\13\u008e\3\u008e\3\u008e\5"+
		"\u008e\u06a3\n\u008e\3\u008f\3\u008f\7\u008f\u06a7\n\u008f\f\u008f\16"+
		"\u008f\u06aa\13\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090"+
		"\u06b1\n\u0090\f\u0090\16\u0090\u06b4\13\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u06c8\n\u0091"+
		"\f\u0091\16\u0091\u06cb\13\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u06d0"+
		"\n\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\5\u0094\u06ec\n\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\7\u0096\u06f6\n\u0096\f\u0096\16\u0096\u06f9\13\u0096"+
		"\3\u0096\7\u0096\u06fc\n\u0096\f\u0096\16\u0096\u06ff\13\u0096\3\u0096"+
		"\3\u0096\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\7\u0098\u0708\n\u0098"+
		"\f\u0098\16\u0098\u070b\13\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\5\u0099\u0713\n\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\7\u009b\u0727\n\u009b\f\u009b\16\u009b"+
		"\u072a\13\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u0730\n\u009b"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\7\u009d"+
		"\u074c\n\u009d\f\u009d\16\u009d\u074f\13\u009d\3\u009d\3\u009d\3\u009d"+
		"\5\u009d\u0754\n\u009d\3\u009e\3\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u076a\n\u00a0\f\u00a0"+
		"\16\u00a0\u076d\13\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0773"+
		"\n\u00a0\3\u00a1\3\u00a1\5\u00a1\u0777\n\u00a1\3\u00a2\5\u00a2\u077a\n"+
		"\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u0780\n\u00a2\3\u00a3\3"+
		"\u00a3\3\u00a3\5\u00a3\u0785\n\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a6\3\u00a6\5\u00a6\u078f\n\u00a6\3\u00a6\3\u00a6\3"+
		"\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9"+
		"\u07a4\n\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u07a9\n\u00a9\3\u00aa\3"+
		"\u00aa\7\u00aa\u07ad\n\u00aa\f\u00aa\16\u00aa\u07b0\13\u00aa\3\u00ab\3"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\7\u00ac\u07b9\n\u00ac\f"+
		"\u00ac\16\u00ac\u07bc\13\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\7\u00ad\u07c4\n\u00ad\f\u00ad\16\u00ad\u07c7\13\u00ad\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u07d0\n\u00af"+
		"\3\u00af\5\u00af\u07d3\n\u00af\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u07d8\n"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u07df\n\u00b1\f"+
		"\u00b1\16\u00b1\u07e2\13\u00b1\3\u00b2\7\u00b2\u07e5\n\u00b2\f\u00b2\16"+
		"\u00b2\u07e8\13\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3"+
		"\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\7\u00b4\u07f5\n\u00b4\f\u00b4"+
		"\16\u00b4\u07f8\13\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u080e\n\u00b4\3\u00b5"+
		"\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\7\u00b6\u0816\n\u00b6\f\u00b6"+
		"\16\u00b6\u0819\13\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u082e\n\u00b6\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0835\n\u00b7\3\u00b8\3\u00b8\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u083d\n\u00b9\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0846\n\u00ba\3\u00bb\3\u00bb"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\7\u00bc\u084e\n\u00bc\f\u00bc\16\u00bc"+
		"\u0851\13\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\7\u00bc"+
		"\u0859\n\u00bc\f\u00bc\16\u00bc\u085c\13\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0871"+
		"\n\u00bc\3\u00bd\3\u00bd\5\u00bd\u0875\n\u00bd\3\u00bd\7\u00bd\u0878\n"+
		"\u00bd\f\u00bd\16\u00bd\u087b\13\u00bd\3\u00bd\3\u00bd\3\u00bd\7\u00bd"+
		"\u0880\n\u00bd\f\u00bd\16\u00bd\u0883\13\u00bd\3\u00bd\7\u00bd\u0886\n"+
		"\u00bd\f\u00bd\16\u00bd\u0889\13\u00bd\3\u00bd\5\u00bd\u088c\n\u00bd\3"+
		"\u00bd\3\u00bd\5\u00bd\u0890\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0894\n\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u089a\n\u00bd\3\u00bd\7\u00bd"+
		"\u089d\n\u00bd\f\u00bd\16\u00bd\u08a0\13\u00bd\3\u00bd\3\u00bd\5\u00bd"+
		"\u08a4\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u08a8\n\u00bd\3\u00bd\3\u00bd\5"+
		"\u00bd\u08ac\n\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u08b2\n\u00bd"+
		"\3\u00bd\7\u00bd\u08b5\n\u00bd\f\u00bd\16\u00bd\u08b8\13\u00bd\3\u00bd"+
		"\3\u00bd\5\u00bd\u08bc\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u08c0\n\u00bd\3"+
		"\u00bd\3\u00bd\5\u00bd\u08c4\n\u00bd\5\u00bd\u08c6\n\u00bd\3\u00be\3\u00be"+
		"\3\u00be\5\u00be\u08cb\n\u00be\3\u00be\7\u00be\u08ce\n\u00be\f\u00be\16"+
		"\u00be\u08d1\13\u00be\3\u00be\3\u00be\5\u00be\u08d5\n\u00be\3\u00be\3"+
		"\u00be\5\u00be\u08d9\n\u00be\3\u00be\3\u00be\5\u00be\u08dd\n\u00be\3\u00bf"+
		"\3\u00bf\5\u00bf\u08e1\n\u00bf\3\u00bf\7\u00bf\u08e4\n\u00bf\f\u00bf\16"+
		"\u00bf\u08e7\13\u00bf\3\u00bf\3\u00bf\3\u00bf\7\u00bf\u08ec\n\u00bf\f"+
		"\u00bf\16\u00bf\u08ef\13\u00bf\3\u00bf\7\u00bf\u08f2\n\u00bf\f\u00bf\16"+
		"\u00bf\u08f5\13\u00bf\3\u00bf\5\u00bf\u08f8\n\u00bf\3\u00bf\3\u00bf\5"+
		"\u00bf\u08fc\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u0900\n\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\5\u00bf\u0906\n\u00bf\3\u00bf\7\u00bf\u0909\n\u00bf\f"+
		"\u00bf\16\u00bf\u090c\13\u00bf\3\u00bf\3\u00bf\5\u00bf\u0910\n\u00bf\3"+
		"\u00bf\3\u00bf\5\u00bf\u0914\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u0918\n\u00bf"+
		"\5\u00bf\u091a\n\u00bf\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u091f\n\u00c0\3"+
		"\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u092e\n\u00c1\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\5\u00c3\u093c\n\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0948\n\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u094f\n\u00c4\f\u00c4\16\u00c4"+
		"\u0952\13\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\7\u00c5\u095d\n\u00c5\f\u00c5\16\u00c5\u0960\13\u00c5"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\5\u00c7"+
		"\u096a\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u096f\n\u00c7\3\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u0977\n\u00c7\3\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c7\5\u00c7\u097d\n\u00c7\3\u00c7\3\u00c7\3\u00c7\3"+
		"\u00c7\3\u00c7\3\u00c7\5\u00c7\u0985\n\u00c7\3\u00c7\3\u00c7\5\u00c7\u0989"+
		"\n\u00c7\3\u00c8\3\u00c8\5\u00c8\u098d\n\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\5\u00c8\u0992\n\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\5\u00c9"+
		"\u0999\n\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u09a0\n"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u09a5\n\u00c9\3\u00c9\3\u00c9\3"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u09ad\n\u00c9\3\u00c9\3\u00c9\5"+
		"\u00c9\u09b1\n\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\7\u00ca\u09b7\n\u00ca"+
		"\f\u00ca\16\u00ca\u09ba\13\u00ca\3\u00ca\3\u00ca\3\u00ca\7\u00ca\u09bf"+
		"\n\u00ca\f\u00ca\16\u00ca\u09c2\13\u00ca\5\u00ca\u09c4\n\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\7\u00ca\u09cb\n\u00ca\f\u00ca\16\u00ca"+
		"\u09ce\13\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09d4\n\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\7\u00ca\u09da\n\u00ca\f\u00ca\16\u00ca"+
		"\u09dd\13\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\7\u00ca"+
		"\u09e5\n\u00ca\f\u00ca\16\u00ca\u09e8\13\u00ca\3\u00ca\7\u00ca\u09eb\n"+
		"\u00ca\f\u00ca\16\u00ca\u09ee\13\u00ca\3\u00cb\3\u00cb\3\u00cb\5\u00cb"+
		"\u09f3\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u09fa\n"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0a01\n\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0a08\n\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0a10\n\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0a17\n\u00cb\3\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0a1f\n\u00cb\3\u00cc\3\u00cc\5"+
		"\u00cc\u0a23\n\u00cc\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a2a"+
		"\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a31\n\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a38\n\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a40\n\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a47\n\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a4f\n\u00cd\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u0a55\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\5\u00ce\u0a5b\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0a67\n\u00ce\3\u00cf\3\u00cf"+
		"\7\u00cf\u0a6b\n\u00cf\f\u00cf\16\u00cf\u0a6e\13\u00cf\3\u00d0\7\u00d0"+
		"\u0a71\n\u00d0\f\u00d0\16\u00d0\u0a74\13\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d2"+
		"\3\u00d2\5\u00d2\u0a8c\n\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a96\n\u00d3\3\u00d4\3\u00d4\3\u00d4"+
		"\3\u00d4\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0a9f\n\u00d5\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0aa6\n\u00d5\3\u00d6\3\u00d6\3\u00d6"+
		"\7\u00d6\u0aab\n\u00d6\f\u00d6\16\u00d6\u0aae\13\u00d6\3\u00d7\3\u00d7"+
		"\5\u00d7\u0ab2\n\u00d7\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00da\3\u00da\3\u00da\5\u00da\u0abd\n\u00da\3\u00db\3\u00db\3\u00dc"+
		"\3\u00dc\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0ac6\n\u00dd\3\u00de\3\u00de"+
		"\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de\u0ace\n\u00de\f\u00de\16\u00de"+
		"\u0ad1\13\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\7\u00df"+
		"\u0ad9\n\u00df\f\u00df\16\u00df\u0adc\13\u00df\3\u00e0\3\u00e0\3\u00e0"+
		"\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0ae4\n\u00e0\f\u00e0\16\u00e0\u0ae7"+
		"\13\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\7\u00e1\u0aef"+
		"\n\u00e1\f\u00e1\16\u00e1\u0af2\13\u00e1\3\u00e2\3\u00e2\3\u00e3\3\u00e3"+
		"\3\u00e4\3\u00e4\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\7\u00e5\u0b08"+
		"\n\u00e5\f\u00e5\16\u00e5\u0b0b\13\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e6"+
		"\3\u00e6\5\u00e6\u0b1b\n\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\7\u00e7\u0b2c\n\u00e7\f\u00e7\16\u00e7\u0b2f\13\u00e7\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0b41\n\u00e8"+
		"\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\7\u00ea\u0b4a"+
		"\n\u00ea\f\u00ea\16\u00ea\u0b4d\13\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\3\u00eb\7\u00eb\u0b54\n\u00eb\f\u00eb\16\u00eb\u0b57\13\u00eb\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\7\u00eb\u0b60\n\u00eb"+
		"\f\u00eb\16\u00eb\u0b63\13\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\3\u00eb\3\u00eb\7\u00eb\u0b6c\n\u00eb\f\u00eb\16\u00eb\u0b6f\13\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\5\u00eb\u0b7a\n\u00eb\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\7\u00ed\u0b83\n\u00ed\f\u00ed\16\u00ed\u0b86\13\u00ed\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\7\u00ee\u0b8d\n\u00ee\f\u00ee\16\u00ee"+
		"\u0b90\13\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\5\u00ee\u0b9b\n\u00ee\3\u00ef\3\u00ef\3\u00f0\3\u00f0"+
		"\3\u00f1\3\u00f1\3\u00f2\3\u00f2\3\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f4"+
		"\3\u00f4\3\u00f4\5\u00f4\u0bac\n\u00f4\3\u00f5\3\u00f5\3\u00f5\3\u00f5"+
		"\7\u00f5\u0bb2\n\u00f5\f\u00f5\16\u00f5\u0bb5\13\u00f5\5\u00f5\u0bb7\n"+
		"\u00f5\3\u00f6\3\u00f6\5\u00f6\u0bbb\n\u00f6\3\u00f7\3\u00f7\3\u00f7\3"+
		"\u00f8\3\u00f8\3\u00f9\3\u00f9\3\u00f9\3\u00fa\3\u00fa\3\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\7\u00fb\u0bcf\n\u00fb"+
		"\f\u00fb\16\u00fb\u0bd2\13\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fb"+
		"\3\u00fb\7\u00fb\u0bda\n\u00fb\f\u00fb\16\u00fb\u0bdd\13\u00fb\3\u00fb"+
		"\3\u00fb\3\u00fb\5\u00fb\u0be2\n\u00fb\3\u00fb\2\17\66:@\u009c\u0192\u01ba"+
		"\u01bc\u01be\u01c0\u01c8\u01cc\u01d2\u01d8\u00fc\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
		"\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154"+
		"\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c"+
		"\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184"+
		"\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c"+
		"\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4"+
		"\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc"+
		"\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4"+
		"\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\2\n\3\2?D\7\2\17\17\22"+
		"\22%%\'\'//\4\2\30\30\36\36\4\2CCrr\4\2NNgq\3\2]^\4\2]`dd\4\2_`dd\2\u0cd0"+
		"\2\u01f6\3\2\2\2\4\u01fa\3\2\2\2\6\u020a\3\2\2\2\b\u020e\3\2\2\2\n\u0210"+
		"\3\2\2\2\f\u0212\3\2\2\2\16\u0217\3\2\2\2\20\u021b\3\2\2\2\22\u023a\3"+
		"\2\2\2\24\u023c\3\2\2\2\26\u024a\3\2\2\2\30\u0251\3\2\2\2\32\u0253\3\2"+
		"\2\2\34\u0255\3\2\2\2\36\u025a\3\2\2\2 \u0268\3\2\2\2\"\u026a\3\2\2\2"+
		"$\u0276\3\2\2\2&\u027d\3\2\2\2(\u0289\3\2\2\2*\u028b\3\2\2\2,\u028e\3"+
		"\2\2\2.\u0292\3\2\2\2\60\u029c\3\2\2\2\62\u02a1\3\2\2\2\64\u02ac\3\2\2"+
		"\2\66\u02ae\3\2\2\28\u02be\3\2\2\2:\u02c0\3\2\2\2<\u02d0\3\2\2\2>\u02d2"+
		"\3\2\2\2@\u02d4\3\2\2\2B\u02e2\3\2\2\2D\u02ee\3\2\2\2F\u02f6\3\2\2\2H"+
		"\u0304\3\2\2\2J\u030a\3\2\2\2L\u030c\3\2\2\2N\u0310\3\2\2\2P\u0316\3\2"+
		"\2\2R\u031d\3\2\2\2T\u0327\3\2\2\2V\u032b\3\2\2\2X\u0330\3\2\2\2Z\u0348"+
		"\3\2\2\2\\\u034a\3\2\2\2^\u034e\3\2\2\2`\u0356\3\2\2\2b\u0359\3\2\2\2"+
		"d\u035c\3\2\2\2f\u0364\3\2\2\2h\u036d\3\2\2\2j\u036f\3\2\2\2l\u0374\3"+
		"\2\2\2n\u0383\3\2\2\2p\u0385\3\2\2\2r\u0399\3\2\2\2t\u039b\3\2\2\2v\u039f"+
		"\3\2\2\2x\u03a1\3\2\2\2z\u03a6\3\2\2\2|\u03ab\3\2\2\2~\u03af\3\2\2\2\u0080"+
		"\u03c8\3\2\2\2\u0082\u03ca\3\2\2\2\u0084\u03d5\3\2\2\2\u0086\u03d9\3\2"+
		"\2\2\u0088\u03db\3\2\2\2\u008a\u03dd\3\2\2\2\u008c\u03df\3\2\2\2\u008e"+
		"\u03ea\3\2\2\2\u0090\u0400\3\2\2\2\u0092\u040c\3\2\2\2\u0094\u041f\3\2"+
		"\2\2\u0096\u0423\3\2\2\2\u0098\u0437\3\2\2\2\u009a\u0439\3\2\2\2\u009c"+
		"\u045c\3\2\2\2\u009e\u0481\3\2\2\2\u00a0\u0485\3\2\2\2\u00a2\u0498\3\2"+
		"\2\2\u00a4\u049d\3\2\2\2\u00a6\u04a7\3\2\2\2\u00a8\u04aa\3\2\2\2\u00aa"+
		"\u04b4\3\2\2\2\u00ac\u04b8\3\2\2\2\u00ae\u04ba\3\2\2\2\u00b0\u04bc\3\2"+
		"\2\2\u00b2\u04c2\3\2\2\2\u00b4\u04cf\3\2\2\2\u00b6\u04d2\3\2\2\2\u00b8"+
		"\u04db\3\2\2\2\u00ba\u04dd\3\2\2\2\u00bc\u0514\3\2\2\2\u00be\u0519\3\2"+
		"\2\2\u00c0\u0523\3\2\2\2\u00c2\u052f\3\2\2\2\u00c4\u053a\3\2\2\2\u00c6"+
		"\u0548\3\2\2\2\u00c8\u054a\3\2\2\2\u00ca\u0553\3\2\2\2\u00cc\u0558\3\2"+
		"\2\2\u00ce\u056c\3\2\2\2\u00d0\u056e\3\2\2\2\u00d2\u0571\3\2\2\2\u00d4"+
		"\u057f\3\2\2\2\u00d6\u0584\3\2\2\2\u00d8\u058f\3\2\2\2\u00da\u0594\3\2"+
		"\2\2\u00dc\u05a0\3\2\2\2\u00de\u05a5\3\2\2\2\u00e0\u05ad\3\2\2\2\u00e2"+
		"\u05bb\3\2\2\2\u00e4\u05c0\3\2\2\2\u00e6\u05d2\3\2\2\2\u00e8\u05d4\3\2"+
		"\2\2\u00ea\u05da\3\2\2\2\u00ec\u05dc\3\2\2\2\u00ee\u05e4\3\2\2\2\u00f0"+
		"\u05ec\3\2\2\2\u00f2\u05f3\3\2\2\2\u00f4\u05f5\3\2\2\2\u00f6\u05fe\3\2"+
		"\2\2\u00f8\u0606\3\2\2\2\u00fa\u0609\3\2\2\2\u00fc\u060f\3\2\2\2\u00fe"+
		"\u0615\3\2\2\2\u0100\u061d\3\2\2\2\u0102\u0623\3\2\2\2\u0104\u062c\3\2"+
		"\2\2\u0106\u062e\3\2\2\2\u0108\u0642\3\2\2\2\u010a\u0648\3\2\2\2\u010c"+
		"\u064f\3\2\2\2\u010e\u065a\3\2\2\2\u0110\u065c\3\2\2\2\u0112\u065e\3\2"+
		"\2\2\u0114\u0662\3\2\2\2\u0116\u0666\3\2\2\2\u0118\u0671\3\2\2\2\u011a"+
		"\u06a2\3\2\2\2\u011c\u06a4\3\2\2\2\u011e\u06ab\3\2\2\2\u0120\u06b9\3\2"+
		"\2\2\u0122\u06d1\3\2\2\2\u0124\u06d9\3\2\2\2\u0126\u06eb\3\2\2\2\u0128"+
		"\u06ed\3\2\2\2\u012a\u06f3\3\2\2\2\u012c\u0702\3\2\2\2\u012e\u0705\3\2"+
		"\2\2\u0130\u0712\3\2\2\2\u0132\u0714\3\2\2\2\u0134\u072f\3\2\2\2\u0136"+
		"\u0731\3\2\2\2\u0138\u0753\3\2\2\2\u013a\u0755\3\2\2\2\u013c\u0757\3\2"+
		"\2\2\u013e\u0772\3\2\2\2\u0140\u0776\3\2\2\2\u0142\u077f\3\2\2\2\u0144"+
		"\u0784\3\2\2\2\u0146\u0786\3\2\2\2\u0148\u0789\3\2\2\2\u014a\u078c\3\2"+
		"\2\2\u014c\u0792\3\2\2\2\u014e\u0796\3\2\2\2\u0150\u07a8\3\2\2\2\u0152"+
		"\u07aa\3\2\2\2\u0154\u07b1\3\2\2\2\u0156\u07ba\3\2\2\2\u0158\u07c0\3\2"+
		"\2\2\u015a\u07c8\3\2\2\2\u015c\u07cb\3\2\2\2\u015e\u07d4\3\2\2\2\u0160"+
		"\u07db\3\2\2\2\u0162\u07e6\3\2\2\2\u0164\u07ee\3\2\2\2\u0166\u080d\3\2"+
		"\2\2\u0168\u080f\3\2\2\2\u016a\u082d\3\2\2\2\u016c\u0834\3\2\2\2\u016e"+
		"\u0836\3\2\2\2\u0170\u083c\3\2\2\2\u0172\u0845\3\2\2\2\u0174\u0847\3\2"+
		"\2\2\u0176\u0870\3\2\2\2\u0178\u08c5\3\2\2\2\u017a\u08c7\3\2\2\2\u017c"+
		"\u0919\3\2\2\2\u017e\u091e\3\2\2\2\u0180\u092d\3\2\2\2\u0182\u092f\3\2"+
		"\2\2\u0184\u093b\3\2\2\2\u0186\u0947\3\2\2\2\u0188\u0953\3\2\2\2\u018a"+
		"\u0961\3\2\2\2\u018c\u0988\3\2\2\2\u018e\u098a\3\2\2\2\u0190\u09b0\3\2"+
		"\2\2\u0192\u09d3\3\2\2\2\u0194\u0a1e\3\2\2\2\u0196\u0a20\3\2\2\2\u0198"+
		"\u0a4e\3\2\2\2\u019a\u0a66\3\2\2\2\u019c\u0a68\3\2\2\2\u019e\u0a72\3\2"+
		"\2\2\u01a0\u0a79\3\2\2\2\u01a2\u0a8b\3\2\2\2\u01a4\u0a95\3\2\2\2\u01a6"+
		"\u0a97\3\2\2\2\u01a8\u0aa5\3\2\2\2\u01aa\u0aa7\3\2\2\2\u01ac\u0ab1\3\2"+
		"\2\2\u01ae\u0ab3\3\2\2\2\u01b0\u0ab5\3\2\2\2\u01b2\u0abc\3\2\2\2\u01b4"+
		"\u0abe\3\2\2\2\u01b6\u0ac0\3\2\2\2\u01b8\u0ac5\3\2\2\2\u01ba\u0ac7\3\2"+
		"\2\2\u01bc\u0ad2\3\2\2\2\u01be\u0add\3\2\2\2\u01c0\u0ae8\3\2\2\2\u01c2"+
		"\u0af3\3\2\2\2\u01c4\u0af5\3\2\2\2\u01c6\u0af7\3\2\2\2\u01c8\u0af9\3\2"+
		"\2\2\u01ca\u0b1a\3\2\2\2\u01cc\u0b1c\3\2\2\2\u01ce\u0b40\3\2\2\2\u01d0"+
		"\u0b42\3\2\2\2\u01d2\u0b44\3\2\2\2\u01d4\u0b79\3\2\2\2\u01d6\u0b7b\3\2"+
		"\2\2\u01d8\u0b7d\3\2\2\2\u01da\u0b9a\3\2\2\2\u01dc\u0b9c\3\2\2\2\u01de"+
		"\u0b9e\3\2\2\2\u01e0\u0ba0\3\2\2\2\u01e2\u0ba2\3\2\2\2\u01e4\u0ba5\3\2"+
		"\2\2\u01e6\u0bab\3\2\2\2\u01e8\u0bb6\3\2\2\2\u01ea\u0bba\3\2\2\2\u01ec"+
		"\u0bbc\3\2\2\2\u01ee\u0bbf\3\2\2\2\u01f0\u0bc1\3\2\2\2\u01f2\u0bc4\3\2"+
		"\2\2\u01f4\u0be1\3\2\2\2\u01f6\u01f7\t\2\2\2\u01f7\3\3\2\2\2\u01f8\u01fb"+
		"\5\6\4\2\u01f9\u01fb\5\16\b\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2"+
		"\u01fb\5\3\2\2\2\u01fc\u01fe\5\u00eav\2\u01fd\u01fc\3\2\2\2\u01fe\u0201"+
		"\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0202\u020b\5\b\5\2\u0203\u0205\5\u00eav\2\u0204\u0203"+
		"\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020b\7\r\2\2\u020a\u01ff\3\2"+
		"\2\2\u020a\u0206\3\2\2\2\u020b\7\3\2\2\2\u020c\u020f\5\n\6\2\u020d\u020f"+
		"\5\f\7\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020f\t\3\2\2\2\u0210"+
		"\u0211\t\3\2\2\u0211\13\3\2\2\2\u0212\u0213\t\4\2\2\u0213\r\3\2\2\2\u0214"+
		"\u0218\5\20\t\2\u0215\u0218\5\36\20\2\u0216\u0218\5 \21\2\u0217\u0214"+
		"\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218\17\3\2\2\2\u0219"+
		"\u021c\5\26\f\2\u021a\u021c\5\34\17\2\u021b\u0219\3\2\2\2\u021b\u021a"+
		"\3\2\2\2\u021c\u0221\3\2\2\2\u021d\u0220\5\24\13\2\u021e\u0220\5\32\16"+
		"\2\u021f\u021d\3\2\2\2\u021f\u021e\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f"+
		"\3\2\2\2\u0221\u0222\3\2\2\2\u0222\21\3\2\2\2\u0223\u0221\3\2\2\2\u0224"+
		"\u0226\5\u00eav\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a"+
		"\u022c\7r\2\2\u022b\u022d\5,\27\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2"+
		"\2\2\u022d\u023b\3\2\2\2\u022e\u022f\5\20\t\2\u022f\u0233\7M\2\2\u0230"+
		"\u0232\5\u00eav\2\u0231\u0230\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231"+
		"\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0233\3\2\2\2\u0236"+
		"\u0238\7r\2\2\u0237\u0239\5,\27\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2"+
		"\2\2\u0239\u023b\3\2\2\2\u023a\u0227\3\2\2\2\u023a\u022e\3\2\2\2\u023b"+
		"\23\3\2\2\2\u023c\u0240\7M\2\2\u023d\u023f\5\u00eav\2\u023e\u023d\3\2"+
		"\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0245\7r\2\2\u0244\u0246\5,\27"+
		"\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246\25\3\2\2\2\u0247\u0249"+
		"\5\u00eav\2\u0248\u0247\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2"+
		"\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u024f"+
		"\7r\2\2\u024e\u0250\5,\27\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\27\3\2\2\2\u0251\u0252\5\22\n\2\u0252\31\3\2\2\2\u0253\u0254\5\24\13"+
		"\2\u0254\33\3\2\2\2\u0255\u0256\5\26\f\2\u0256\35\3\2\2\2\u0257\u0259"+
		"\5\u00eav\2\u0258\u0257\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2"+
		"\2\u025a\u025b\3\2\2\2\u025b\u025d\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025e"+
		"\7r\2\2\u025e\37\3\2\2\2\u025f\u0260\5\6\4\2\u0260\u0261\5\"\22\2\u0261"+
		"\u0269\3\2\2\2\u0262\u0263\5\20\t\2\u0263\u0264\5\"\22\2\u0264\u0269\3"+
		"\2\2\2\u0265\u0266\5\36\20\2\u0266\u0267\5\"\22\2\u0267\u0269\3\2\2\2"+
		"\u0268\u025f\3\2\2\2\u0268\u0262\3\2\2\2\u0268\u0265\3\2\2\2\u0269!\3"+
		"\2\2\2\u026a\u026b\7I\2\2\u026b\u0270\7J\2\2\u026c\u026d\7I\2\2\u026d"+
		"\u026f\7J\2\2\u026e\u026c\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2"+
		"\2\2\u0270\u0271\3\2\2\2\u0271#\3\2\2\2\u0272\u0270\3\2\2\2\u0273\u0275"+
		"\5&\24\2\u0274\u0273\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027b\7r"+
		"\2\2\u027a\u027c\5(\25\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"%\3\2\2\2\u027d\u027e\5\u00eav\2\u027e\'\3\2\2\2\u027f\u0280\7\33\2\2"+
		"\u0280\u028a\5\36\20\2\u0281\u0282\7\33\2\2\u0282\u0286\5\20\t\2\u0283"+
		"\u0285\5*\26\2\u0284\u0283\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2"+
		"\2\2\u0286\u0287\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0289"+
		"\u027f\3\2\2\2\u0289\u0281\3\2\2\2\u028a)\3\2\2\2\u028b\u028c\7a\2\2\u028c"+
		"\u028d\5\30\r\2\u028d+\3\2\2\2\u028e\u028f\7P\2\2\u028f\u0290\5.\30\2"+
		"\u0290\u0291\7O\2\2\u0291-\3\2\2\2\u0292\u0297\5\60\31\2\u0293\u0294\7"+
		"L\2\2\u0294\u0296\5\60\31\2\u0295\u0293\3\2\2\2\u0296\u0299\3\2\2\2\u0297"+
		"\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298/\3\2\2\2\u0299\u0297\3\2\2\2"+
		"\u029a\u029d\5\16\b\2\u029b\u029d\5\62\32\2\u029c\u029a\3\2\2\2\u029c"+
		"\u029b\3\2\2\2\u029d\61\3\2\2\2\u029e\u02a0\5\u00eav\2\u029f\u029e\3\2"+
		"\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"\u02a4\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a6\7S\2\2\u02a5\u02a7\5\64"+
		"\33\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\63\3\2\2\2\u02a8\u02a9"+
		"\7\33\2\2\u02a9\u02ad\5\16\b\2\u02aa\u02ab\7\62\2\2\u02ab\u02ad\5\16\b"+
		"\2\u02ac\u02a8\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\65\3\2\2\2\u02ae\u02af"+
		"\b\34\1\2\u02af\u02b0\7r\2\2\u02b0\u02b6\3\2\2\2\u02b1\u02b2\f\3\2\2\u02b2"+
		"\u02b3\7M\2\2\u02b3\u02b5\7r\2\2\u02b4\u02b1\3\2\2\2\u02b5\u02b8\3\2\2"+
		"\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\67\3\2\2\2\u02b8\u02b6"+
		"\3\2\2\2\u02b9\u02bf\7r\2\2\u02ba\u02bb\5:\36\2\u02bb\u02bc\7M\2\2\u02bc"+
		"\u02bd\7r\2\2\u02bd\u02bf\3\2\2\2\u02be\u02b9\3\2\2\2\u02be\u02ba\3\2"+
		"\2\2\u02bf9\3\2\2\2\u02c0\u02c1\b\36\1\2\u02c1\u02c2\7r\2\2\u02c2\u02c8"+
		"\3\2\2\2\u02c3\u02c4\f\3\2\2\u02c4\u02c5\7M\2\2\u02c5\u02c7\7r\2\2\u02c6"+
		"\u02c3\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2"+
		"\2\2\u02c9;\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02d1\7r\2\2\u02cc\u02cd"+
		"\5@!\2\u02cd\u02ce\7M\2\2\u02ce\u02cf\7r\2\2\u02cf\u02d1\3\2\2\2\u02d0"+
		"\u02cb\3\2\2\2\u02d0\u02cc\3\2\2\2\u02d1=\3\2\2\2\u02d2\u02d3\7r\2\2\u02d3"+
		"?\3\2\2\2\u02d4\u02d5\b!\1\2\u02d5\u02d6\7r\2\2\u02d6\u02dc\3\2\2\2\u02d7"+
		"\u02d8\f\3\2\2\u02d8\u02d9\7M\2\2\u02d9\u02db\7r\2\2\u02da\u02d7\3\2\2"+
		"\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02ddA"+
		"\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02e1\5h\65\2\u02e0\u02df\3\2\2\2\u02e1"+
		"\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e5\3\2"+
		"\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e9\5D#\2\u02e6\u02e8\5h\65\2\u02e7\u02e6"+
		"\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02ec\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ed\7\2\2\3\u02edC\3\2\2\2"+
		"\u02ee\u02ef\7\6\2\2\u02ef\u02f0\7E\2\2\u02f0\u02f1\7F\2\2\u02f1\u02f2"+
		"\5\u0100\u0081\2\u02f2E\3\2\2\2\u02f3\u02f5\5H%\2\u02f4\u02f3\3\2\2\2"+
		"\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f9"+
		"\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02fa\7*\2\2\u02fa\u02ff\7r\2\2\u02fb"+
		"\u02fc\7M\2\2\u02fc\u02fe\7r\2\2\u02fd\u02fb\3\2\2\2\u02fe\u0301\3\2\2"+
		"\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2\2\2\u0301\u02ff"+
		"\3\2\2\2\u0302\u0303\7K\2\2\u0303G\3\2\2\2\u0304\u0305\5\u00eav\2\u0305"+
		"I\3\2\2\2\u0306\u030b\5L\'\2\u0307\u030b\5N(\2\u0308\u030b\5P)\2\u0309"+
		"\u030b\5R*\2\u030a\u0306\3\2\2\2\u030a\u0307\3\2\2\2\u030a\u0308\3\2\2"+
		"\2\u030a\u0309\3\2\2\2\u030bK\3\2\2\2\u030c\u030d\7#\2\2\u030d\u030e\5"+
		"8\35\2\u030e\u030f\7K\2\2\u030fM\3\2\2\2\u0310\u0311\7#\2\2\u0311\u0312"+
		"\5:\36\2\u0312\u0313\7M\2\2\u0313\u0314\7_\2\2\u0314\u0315\7K\2\2\u0315"+
		"O\3\2\2\2\u0316\u0317\7#\2\2\u0317\u0318\7\60\2\2\u0318\u0319\58\35\2"+
		"\u0319\u031a\7M\2\2\u031a\u031b\7r\2\2\u031b\u031c\7K\2\2\u031cQ\3\2\2"+
		"\2\u031d\u031e\7#\2\2\u031e\u031f\7\60\2\2\u031f\u0320\58\35\2\u0320\u0321"+
		"\7M\2\2\u0321\u0322\7_\2\2\u0322\u0323\7K\2\2\u0323S\3\2\2\2\u0324\u0328"+
		"\5V,\2\u0325\u0328\5\u00caf\2\u0326\u0328\7K\2\2\u0327\u0324\3\2\2\2\u0327"+
		"\u0325\3\2\2\2\u0327\u0326\3\2\2\2\u0328U\3\2\2\2\u0329\u032c\5X-\2\u032a"+
		"\u032c\5\u00be`\2\u032b\u0329\3\2\2\2\u032b\u032a\3\2\2\2\u032cW\3\2\2"+
		"\2\u032d\u032f\5Z.\2\u032e\u032d\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e"+
		"\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0333\3\2\2\2\u0332\u0330\3\2\2\2\u0333"+
		"\u0334\7\23\2\2\u0334\u0336\7r\2\2\u0335\u0337\5\\/\2\u0336\u0335\3\2"+
		"\2\2\u0336\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u033a\5`\61\2\u0339"+
		"\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033c\3\2\2\2\u033b\u033d\5b"+
		"\62\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\3\2\2\2\u033e"+
		"\u033f\5f\64\2\u033fY\3\2\2\2\u0340\u0349\5\u00eav\2\u0341\u0349\7-\2"+
		"\2\u0342\u0349\7,\2\2\u0343\u0349\7+\2\2\u0344\u0349\7\13\2\2\u0345\u0349"+
		"\7\60\2\2\u0346\u0349\7\34\2\2\u0347\u0349\7\61\2\2\u0348\u0340\3\2\2"+
		"\2\u0348\u0341\3\2\2\2\u0348\u0342\3\2\2\2\u0348\u0343\3\2\2\2\u0348\u0344"+
		"\3\2\2\2\u0348\u0345\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0347\3\2\2\2\u0349"+
		"[\3\2\2\2\u034a\u034b\7P\2\2\u034b\u034c\5^\60\2\u034c\u034d\7O\2\2\u034d"+
		"]\3\2\2\2\u034e\u0353\5$\23\2\u034f\u0350\7L\2\2\u0350\u0352\5$\23\2\u0351"+
		"\u034f\3\2\2\2\u0352\u0355\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2"+
		"\2\2\u0354_\3\2\2\2\u0355\u0353\3\2\2\2\u0356\u0357\7\33\2\2\u0357\u0358"+
		"\5\22\n\2\u0358a\3\2\2\2\u0359\u035a\7\"\2\2\u035a\u035b\5d\63\2\u035b"+
		"c\3\2\2\2\u035c\u0361\5\30\r\2\u035d\u035e\7L\2\2\u035e\u0360\5\30\r\2"+
		"\u035f\u035d\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362"+
		"\3\2\2\2\u0362e\3\2\2\2\u0363\u0361\3\2\2\2\u0364\u0368\7G\2\2\u0365\u0367"+
		"\5h\65\2\u0366\u0365\3\2\2\2\u0367\u036a\3\2\2\2\u0368\u0366\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u036b\3\2\2\2\u036a\u0368\3\2\2\2\u036b\u036c\7H"+
		"\2\2\u036cg\3\2\2\2\u036d\u036e\5j\66\2\u036ei\3\2\2\2\u036f\u0370\5\u0090"+
		"I\2\u0370k\3\2\2\2\u0371\u0373\5n8\2\u0372\u0371\3\2\2\2\u0373\u0376\3"+
		"\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0377\3\2\2\2\u0376"+
		"\u0374\3\2\2\2\u0377\u0378\5x=\2\u0378\u0379\5p9\2\u0379\u037a\7K\2\2"+
		"\u037am\3\2\2\2\u037b\u0384\5\u00eav\2\u037c\u0384\7-\2\2\u037d\u0384"+
		"\7,\2\2\u037e\u0384\7+\2\2\u037f\u0384\7\60\2\2\u0380\u0384\7\34\2\2\u0381"+
		"\u0384\78\2\2\u0382\u0384\7;\2\2\u0383\u037b\3\2\2\2\u0383\u037c\3\2\2"+
		"\2\u0383\u037d\3\2\2\2\u0383\u037e\3\2\2\2\u0383\u037f\3\2\2\2\u0383\u0380"+
		"\3\2\2\2\u0383\u0381\3\2\2\2\u0383\u0382\3\2\2\2\u0384o\3\2\2\2\u0385"+
		"\u038a\5r:\2\u0386\u0387\7L\2\2\u0387\u0389\5r:\2\u0388\u0386\3\2\2\2"+
		"\u0389\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038bq\3"+
		"\2\2\2\u038c\u038a\3\2\2\2\u038d\u0390\5t;\2\u038e\u038f\7N\2\2\u038f"+
		"\u0391\5v<\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u039a\3\2\2"+
		"\2\u0392\u0395\5x=\2\u0393\u0394\7N\2\2\u0394\u0396\5v<\2\u0395\u0393"+
		"\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\b:\1\2\u0398"+
		"\u039a\3\2\2\2\u0399\u038d\3\2\2\2\u0399\u0392\3\2\2\2\u039as\3\2\2\2"+
		"\u039b\u039c\7r\2\2\u039cu\3\2\2\2\u039d\u03a0\5\u01a2\u00d2\2\u039e\u03a0"+
		"\5\u00fc\177\2\u039f\u039d\3\2\2\2\u039f\u039e\3\2\2\2\u03a0w\3\2\2\2"+
		"\u03a1\u03a2\5z>\2\u03a2y\3\2\2\2\u03a3\u03a7\5\b\5\2\u03a4\u03a7\7\r"+
		"\2\2\u03a5\u03a7\7\7\2\2\u03a6\u03a3\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6"+
		"\u03a5\3\2\2\2\u03a7{\3\2\2\2\u03a8\u03ac\5~@\2\u03a9\u03ac\5\u008cG\2"+
		"\u03aa\u03ac\5\u008eH\2\u03ab\u03a8\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab"+
		"\u03aa\3\2\2\2\u03ac}\3\2\2\2\u03ad\u03b0\5\u0084C\2\u03ae\u03b0\5\u008a"+
		"F\2\u03af\u03ad\3\2\2\2\u03af\u03ae\3\2\2\2\u03b0\u03b5\3\2\2\2\u03b1"+
		"\u03b4\5\u0082B\2\u03b2\u03b4\5\u0088E\2\u03b3\u03b1\3\2\2\2\u03b3\u03b2"+
		"\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6"+
		"\177\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03ba\7r\2\2\u03b9\u03bb\5,\27"+
		"\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03c9\3\2\2\2\u03bc\u03bd"+
		"\5~@\2\u03bd\u03c1\7M\2\2\u03be\u03c0\5\u00eav\2\u03bf\u03be\3\2\2\2\u03c0"+
		"\u03c3\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2"+
		"\2\2\u03c3\u03c1\3\2\2\2\u03c4\u03c6\7r\2\2\u03c5\u03c7\5,\27\2\u03c6"+
		"\u03c5\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c9\3\2\2\2\u03c8\u03b8\3\2"+
		"\2\2\u03c8\u03bc\3\2\2\2\u03c9\u0081\3\2\2\2\u03ca\u03ce\7M\2\2\u03cb"+
		"\u03cd\5\u00eav\2\u03cc\u03cb\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc"+
		"\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1"+
		"\u03d3\7r\2\2\u03d2\u03d4\5,\27\2\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3\2"+
		"\2\2\u03d4\u0083\3\2\2\2\u03d5\u03d7\7r\2\2\u03d6\u03d8\5,\27\2\u03d7"+
		"\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u0085\3\2\2\2\u03d9\u03da\5\u0080"+
		"A\2\u03da\u0087\3\2\2\2\u03db\u03dc\5\u0082B\2\u03dc\u0089\3\2\2\2\u03dd"+
		"\u03de\5\u0084C\2\u03de\u008b\3\2\2\2\u03df\u03e0\7r\2\2\u03e0\u008d\3"+
		"\2\2\2\u03e1\u03e2\5z>\2\u03e2\u03e3\5\"\22\2\u03e3\u03eb\3\2\2\2\u03e4"+
		"\u03e5\5~@\2\u03e5\u03e6\5\"\22\2\u03e6\u03eb\3\2\2\2\u03e7\u03e8\5\u008c"+
		"G\2\u03e8\u03e9\5\"\22\2\u03e9\u03eb\3\2\2\2\u03ea\u03e1\3\2\2\2\u03ea"+
		"\u03e4\3\2\2\2\u03ea\u03e7\3\2\2\2\u03eb\u008f\3\2\2\2\u03ec\u03ed\7\5"+
		"\2\2\u03ed\u03ee\5\u0096L\2\u03ee\u03ef\5\u0098M\2\u03ef\u03f0\5\u0100"+
		"\u0081\2\u03f0\u0401\3\2\2\2\u03f1\u03f2\7\5\2\2\u03f2\u03f3\5\u0098M"+
		"\2\u03f3\u03f4\5\u0100\u0081\2\u03f4\u03f5\bI\1\2\u03f5\u0401\3\2\2\2"+
		"\u03f6\u03f7\5\u0096L\2\u03f7\u03f8\5\u0098M\2\u03f8\u03f9\5\u0100\u0081"+
		"\2\u03f9\u03fa\bI\1\2\u03fa\u0401\3\2\2\2\u03fb\u03fc\7\5\2\2\u03fc\u03fd"+
		"\5\u0096L\2\u03fd\u03fe\5\u0098M\2\u03fe\u03ff\bI\1\2\u03ff\u0401\3\2"+
		"\2\2\u0400\u03ec\3\2\2\2\u0400\u03f1\3\2\2\2\u0400\u03f6\3\2\2\2\u0400"+
		"\u03fb\3\2\2\2\u0401\u0091\3\2\2\2\u0402\u040d\5\u00eav\2\u0403\u040d"+
		"\7-\2\2\u0404\u040d\7,\2\2\u0405\u040d\7+\2\2\u0406\u040d\7\13\2\2\u0407"+
		"\u040d\7\60\2\2\u0408\u040d\7\34\2\2\u0409\u040d\7\64\2\2\u040a\u040d"+
		"\7(\2\2\u040b\u040d\7\61\2\2\u040c\u0402\3\2\2\2\u040c\u0403\3\2\2\2\u040c"+
		"\u0404\3\2\2\2\u040c\u0405\3\2\2\2\u040c\u0406\3\2\2\2\u040c\u0407\3\2"+
		"\2\2\u040c\u0408\3\2\2\2\u040c\u0409\3\2\2\2\u040c\u040a\3\2\2\2\u040c"+
		"\u040b\3\2\2\2\u040d\u0093\3\2\2\2\u040e\u040f\5\u0096L\2\u040f\u0411"+
		"\5\u0098M\2\u0410\u0412\5\u00a6T\2\u0411\u0410\3\2\2\2\u0411\u0412\3\2"+
		"\2\2\u0412\u0420\3\2\2\2\u0413\u0417\5\\/\2\u0414\u0416\5\u00eav\2\u0415"+
		"\u0414\3\2\2\2\u0416\u0419\3\2\2\2\u0417\u0415\3\2\2\2\u0417\u0418\3\2"+
		"\2\2\u0418\u041a\3\2\2\2\u0419\u0417\3\2\2\2\u041a\u041b\5\u0096L\2\u041b"+
		"\u041d\5\u0098M\2\u041c\u041e\5\u00a6T\2\u041d\u041c\3\2\2\2\u041d\u041e"+
		"\3\2\2\2\u041e\u0420\3\2\2\2\u041f\u040e\3\2\2\2\u041f\u0413\3\2\2\2\u0420"+
		"\u0095\3\2\2\2\u0421\u0424\5x=\2\u0422\u0424\7:\2\2\u0423\u0421\3\2\2"+
		"\2\u0423\u0422\3\2\2\2\u0424\u0097\3\2\2\2\u0425\u0426\7r\2\2\u0426\u0428"+
		"\7E\2\2\u0427\u0429\5\u009aN\2\u0428\u0427\3\2\2\2\u0428\u0429\3\2\2\2"+
		"\u0429\u042a\3\2\2\2\u042a\u0438\7F\2\2\u042b\u042c\7r\2\2\u042c\u042e"+
		"\7E\2\2\u042d\u042f\5\u009aN\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2\2"+
		"\u042f\u0430\3\2\2\2\u0430\u0438\bM\1\2\u0431\u0433\7r\2\2\u0432\u0434"+
		"\5\u009aN\2\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\3\2\2"+
		"\2\u0435\u0436\7F\2\2\u0436\u0438\bM\1\2\u0437\u0425\3\2\2\2\u0437\u042b"+
		"\3\2\2\2\u0437\u0431\3\2\2\2\u0438\u0099\3\2\2\2\u0439\u043a\5\u009cO"+
		"\2\u043a\u009b\3\2\2\2\u043b\u043c\bO\1\2\u043c\u0441\5\u009eP\2\u043d"+
		"\u043e\7L\2\2\u043e\u0440\5\u009eP\2\u043f\u043d\3\2\2\2\u0440\u0443\3"+
		"\2\2\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u045d\3\2\2\2\u0443"+
		"\u0441\3\2\2\2\u0444\u0449\5\u009eP\2\u0445\u0446\7L\2\2\u0446\u0448\5"+
		"\u009eP\2\u0447\u0445\3\2\2\2\u0448\u044b\3\2\2\2\u0449\u0447\3\2\2\2"+
		"\u0449\u044a\3\2\2\2\u044a\u044d\3\2\2\2\u044b\u0449\3\2\2\2\u044c\u0444"+
		"\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044f\5\u009eP"+
		"\2\u044f\u0450\5\u009cO\6\u0450\u0451\bO\1\2\u0451\u045d\3\2\2\2\u0452"+
		"\u0454\7L\2\2\u0453\u0452\3\2\2\2\u0454\u0457\3\2\2\2\u0455\u0453\3\2"+
		"\2\2\u0455\u0456\3\2\2\2\u0456\u0458\3\2\2\2\u0457\u0455\3\2\2\2\u0458"+
		"\u0459\7L\2\2\u0459\u045a\5\u009cO\5\u045a\u045b\bO\1\2\u045b\u045d\3"+
		"\2\2\2\u045c\u043b\3\2\2\2\u045c\u044c\3\2\2\2\u045c\u0455\3\2\2\2\u045d"+
		"\u0475\3\2\2\2\u045e\u045f\f\3\2\2\u045f\u0460\7L\2\2\u0460\u0464\7L\2"+
		"\2\u0461\u0463\7L\2\2\u0462\u0461\3\2\2\2\u0463\u0466\3\2\2\2\u0464\u0462"+
		"\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0467\3\2\2\2\u0466\u0464\3\2\2\2\u0467"+
		"\u0468\5\u009cO\4\u0468\u0469\bO\1\2\u0469\u0474\3\2\2\2\u046a\u046b\f"+
		"\4\2\2\u046b\u046f\7L\2\2\u046c\u046e\7L\2\2\u046d\u046c\3\2\2\2\u046e"+
		"\u0471\3\2\2\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0472\3\2"+
		"\2\2\u0471\u046f\3\2\2\2\u0472\u0474\bO\1\2\u0473\u045e\3\2\2\2\u0473"+
		"\u046a\3\2\2\2\u0474\u0477\3\2\2\2\u0475\u0473\3\2\2\2\u0475\u0476\3\2"+
		"\2\2\u0476\u009d\3\2\2\2\u0477\u0475\3\2\2\2\u0478\u0479\5x=\2\u0479\u047a"+
		"\5t;\2\u047a\u0482\3\2\2\2\u047b\u047c\5t;\2\u047c\u047d\bP\1\2\u047d"+
		"\u0482\3\2\2\2\u047e\u047f\5x=\2\u047f\u0480\bP\1\2\u0480\u0482\3\2\2"+
		"\2\u0481\u0478\3\2\2\2\u0481\u047b\3\2\2\2\u0481\u047e\3\2\2\2\u0482\u009f"+
		"\3\2\2\2\u0483\u0486\5\u00eav\2\u0484\u0486\7\34\2\2\u0485\u0483\3\2\2"+
		"\2\u0485\u0484\3\2\2\2\u0486\u00a1\3\2\2\2\u0487\u0489\5\u00a0Q\2\u0488"+
		"\u0487\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2"+
		"\2\2\u048b\u048d\3\2\2\2\u048c\u048a\3\2\2\2\u048d\u0491\5x=\2\u048e\u0490"+
		"\5\u00eav\2\u048f\u048e\3\2\2\2\u0490\u0493\3\2\2\2\u0491\u048f\3\2\2"+
		"\2\u0491\u0492\3\2\2\2\u0492\u0494\3\2\2\2\u0493\u0491\3\2\2\2\u0494\u0495"+
		"\7t\2\2\u0495\u0496\5t;\2\u0496\u0499\3\2\2\2\u0497\u0499\5\u009eP\2\u0498"+
		"\u048a\3\2\2\2\u0498\u0497\3\2\2\2\u0499\u00a3\3\2\2\2\u049a\u049c\5\u00ea"+
		"v\2\u049b\u049a\3\2\2\2\u049c\u049f\3\2\2\2\u049d\u049b\3\2\2\2\u049d"+
		"\u049e\3\2\2\2\u049e\u04a0\3\2\2\2\u049f\u049d\3\2\2\2\u04a0\u04a3\5x"+
		"=\2\u04a1\u04a2\7r\2\2\u04a2\u04a4\7M\2\2\u04a3\u04a1\3\2\2\2\u04a3\u04a4"+
		"\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\7\65\2\2\u04a6\u00a5\3\2\2\2"+
		"\u04a7\u04a8\7\67\2\2\u04a8\u04a9\5\u00a8U\2\u04a9\u00a7\3\2\2\2\u04aa"+
		"\u04af\5\u00aaV\2\u04ab\u04ac\7L\2\2\u04ac\u04ae\5\u00aaV\2\u04ad\u04ab"+
		"\3\2\2\2\u04ae\u04b1\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0"+
		"\u00a9\3\2\2\2\u04b1\u04af\3\2\2\2\u04b2\u04b5\5\22\n\2\u04b3\u04b5\5"+
		"\36\20\2\u04b4\u04b2\3\2\2\2\u04b4\u04b3\3\2\2\2\u04b5\u00ab\3\2\2\2\u04b6"+
		"\u04b9\5\u0100\u0081\2\u04b7\u04b9\7K\2\2\u04b8\u04b6\3\2\2\2\u04b8\u04b7"+
		"\3\2\2\2\u04b9\u00ad\3\2\2\2\u04ba\u04bb\5\u0100\u0081\2\u04bb\u00af\3"+
		"\2\2\2\u04bc\u04bd\7\60\2\2\u04bd\u04be\5\u0100\u0081\2\u04be\u00b1\3"+
		"\2\2\2\u04bf\u04c1\5\u00b4[\2\u04c0\u04bf\3\2\2\2\u04c1\u04c4\3\2\2\2"+
		"\u04c2\u04c0\3\2\2\2\u04c2\u04c3\3\2\2\2\u04c3\u04c5\3\2\2\2\u04c4\u04c2"+
		"\3\2\2\2\u04c5\u04c7\5\u00b6\\\2\u04c6\u04c8\5\u00a6T\2\u04c7\u04c6\3"+
		"\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\5\u00ba^\2"+
		"\u04ca\u00b3\3\2\2\2\u04cb\u04d0\5\u00eav\2\u04cc\u04d0\7-\2\2\u04cd\u04d0"+
		"\7,\2\2\u04ce\u04d0\7+\2\2\u04cf\u04cb\3\2\2\2\u04cf\u04cc\3\2\2\2\u04cf"+
		"\u04cd\3\2\2\2\u04cf\u04ce\3\2\2\2\u04d0\u00b5\3\2\2\2\u04d1\u04d3\5\\"+
		"/\2\u04d2\u04d1\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4"+
		"\u04d5\5\u00b8]\2\u04d5\u04d7\7E\2\2\u04d6\u04d8\5\u009aN\2\u04d7\u04d6"+
		"\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\7F\2\2\u04da"+
		"\u00b7\3\2\2\2\u04db\u04dc\7r\2\2\u04dc\u00b9\3\2\2\2\u04dd\u04df\7G\2"+
		"\2\u04de\u04e0\5\u00bc_\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0"+
		"\u04e2\3\2\2\2\u04e1\u04e3\5\u0102\u0082\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3"+
		"\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\7H\2\2\u04e5\u00bb\3\2\2\2\u04e6"+
		"\u04e8\5,\27\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04e9\3\2"+
		"\2\2\u04e9\u04ea\7\65\2\2\u04ea\u04ec\7E\2\2\u04eb\u04ed\5\u0192\u00ca"+
		"\2\u04ec\u04eb\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef"+
		"\7F\2\2\u04ef\u0515\7K\2\2\u04f0\u04f2\5,\27\2\u04f1\u04f0\3\2\2\2\u04f1"+
		"\u04f2\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\7\62\2\2\u04f4\u04f6\7"+
		"E\2\2\u04f5\u04f7\5\u0192\u00ca\2\u04f6\u04f5\3\2\2\2\u04f6\u04f7\3\2"+
		"\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\7F\2\2\u04f9\u0515\7K\2\2\u04fa\u04fb"+
		"\5<\37\2\u04fb\u04fd\7M\2\2\u04fc\u04fe\5,\27\2\u04fd\u04fc\3\2\2\2\u04fd"+
		"\u04fe\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500\7\62\2\2\u0500\u0502\7"+
		"E\2\2\u0501\u0503\5\u0192\u00ca\2\u0502\u0501\3\2\2\2\u0502\u0503\3\2"+
		"\2\2\u0503\u0504\3\2\2\2\u0504\u0505\7F\2\2\u0505\u0506\7K\2\2\u0506\u0515"+
		"\3\2\2\2\u0507\u0508\5\u0164\u00b3\2\u0508\u050a\7M\2\2\u0509\u050b\5"+
		",\27\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\3\2\2\2\u050c"+
		"\u050d\7\62\2\2\u050d\u050f\7E\2\2\u050e\u0510\5\u0192\u00ca\2\u050f\u050e"+
		"\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\7F\2\2\u0512"+
		"\u0513\7K\2\2\u0513\u0515\3\2\2\2\u0514\u04e7\3\2\2\2\u0514\u04f1\3\2"+
		"\2\2\u0514\u04fa\3\2\2\2\u0514\u0507\3\2\2\2\u0515\u00bd\3\2\2\2\u0516"+
		"\u0518\5Z.\2\u0517\u0516\3\2\2\2\u0518\u051b\3\2\2\2\u0519\u0517\3\2\2"+
		"\2\u0519\u051a\3\2\2\2\u051a\u051c\3\2\2\2\u051b\u0519\3\2\2\2\u051c\u051d"+
		"\7\32\2\2\u051d\u051f\7r\2\2\u051e\u0520\5b\62\2\u051f\u051e\3\2\2\2\u051f"+
		"\u0520\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522\5\u00c0a\2\u0522\u00bf"+
		"\3\2\2\2\u0523\u0525\7G\2\2\u0524\u0526\5\u00c2b\2\u0525\u0524\3\2\2\2"+
		"\u0525\u0526\3\2\2\2\u0526\u0528\3\2\2\2\u0527\u0529\7L\2\2\u0528\u0527"+
		"\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052b\3\2\2\2\u052a\u052c\5\u00c8e"+
		"\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052e"+
		"\7H\2\2\u052e\u00c1\3\2\2\2\u052f\u0534\5\u00c4c\2\u0530\u0531\7L\2\2"+
		"\u0531\u0533\5\u00c4c\2\u0532\u0530\3\2\2\2\u0533\u0536\3\2\2\2\u0534"+
		"\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u00c3\3\2\2\2\u0536\u0534\3\2"+
		"\2\2\u0537\u0539\5\u00c6d\2\u0538\u0537\3\2\2\2\u0539\u053c\3\2\2\2\u053a"+
		"\u0538\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053d\3\2\2\2\u053c\u053a\3\2"+
		"\2\2\u053d\u0543\7r\2\2\u053e\u0540\7E\2\2\u053f\u0541\5\u0192\u00ca\2"+
		"\u0540\u053f\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0544"+
		"\7F\2\2\u0543\u053e\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0546\3\2\2\2\u0545"+
		"\u0547\5f\64\2\u0546\u0545\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u00c5\3\2"+
		"\2\2\u0548\u0549\5\u00eav\2\u0549\u00c7\3\2\2\2\u054a\u054e\7K\2\2\u054b"+
		"\u054d\5h\65\2\u054c\u054b\3\2\2\2\u054d\u0550\3\2\2\2\u054e\u054c\3\2"+
		"\2\2\u054e\u054f\3\2\2\2\u054f\u00c9\3\2\2\2\u0550\u054e\3\2\2\2\u0551"+
		"\u0554\5\u00ccg\2\u0552\u0554\5\u00dep\2\u0553\u0551\3\2\2\2\u0553\u0552"+
		"\3\2\2\2\u0554\u00cb\3\2\2\2\u0555\u0557\5\u00ceh\2\u0556\u0555\3\2\2"+
		"\2\u0557\u055a\3\2\2\2\u0558\u0556\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055b"+
		"\3\2\2\2\u055a\u0558\3\2\2\2\u055b\u055c\7&\2\2\u055c\u055e\7r\2\2\u055d"+
		"\u055f\5\\/\2\u055e\u055d\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0561\3\2"+
		"\2\2\u0560\u0562\5\u00d0i\2\u0561\u0560\3\2\2\2\u0561\u0562\3\2\2\2\u0562"+
		"\u0563\3\2\2\2\u0563\u0564\5\u00d2j\2\u0564\u00cd\3\2\2\2\u0565\u056d"+
		"\5\u00eav\2\u0566\u056d\7-\2\2\u0567\u056d\7,\2\2\u0568\u056d\7+\2\2\u0569"+
		"\u056d\7\13\2\2\u056a\u056d\7\60\2\2\u056b\u056d\7\61\2\2\u056c\u0565"+
		"\3\2\2\2\u056c\u0566\3\2\2\2\u056c\u0567\3\2\2\2\u056c\u0568\3\2\2\2\u056c"+
		"\u0569\3\2\2\2\u056c\u056a\3\2\2\2\u056c\u056b\3\2\2\2\u056d\u00cf\3\2"+
		"\2\2\u056e\u056f\7\33\2\2\u056f\u0570\5d\63\2\u0570\u00d1\3\2\2\2\u0571"+
		"\u0575\7G\2\2\u0572\u0574\5\u00d4k\2\u0573\u0572\3\2\2\2\u0574\u0577\3"+
		"\2\2\2\u0575\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0578\3\2\2\2\u0577"+
		"\u0575\3\2\2\2\u0578\u0579\7H\2\2\u0579\u00d3\3\2\2\2\u057a\u0580\5\u00d6"+
		"l\2\u057b\u0580\5\u00dan\2\u057c\u0580\5V,\2\u057d\u0580\5\u00caf\2\u057e"+
		"\u0580\7K\2\2\u057f\u057a\3\2\2\2\u057f\u057b\3\2\2\2\u057f\u057c\3\2"+
		"\2\2\u057f\u057d\3\2\2\2\u057f\u057e\3\2\2\2\u0580\u00d5\3\2\2\2\u0581"+
		"\u0583\5\u00d8m\2\u0582\u0581\3\2\2\2\u0583\u0586\3\2\2\2\u0584\u0582"+
		"\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0587\3\2\2\2\u0586\u0584\3\2\2\2\u0587"+
		"\u0588\5x=\2\u0588\u0589\5p9\2\u0589\u058a\7K\2\2\u058a\u00d7\3\2\2\2"+
		"\u058b\u0590\5\u00eav\2\u058c\u0590\7-\2\2\u058d\u0590\7\60\2\2\u058e"+
		"\u0590\7\34\2\2\u058f\u058b\3\2\2\2\u058f\u058c\3\2\2\2\u058f\u058d\3"+
		"\2\2\2\u058f\u058e\3\2\2\2\u0590\u00d9\3\2\2\2\u0591\u0593\5\u00dco\2"+
		"\u0592\u0591\3\2\2\2\u0593\u0596\3\2\2\2\u0594\u0592\3\2\2\2\u0594\u0595"+
		"\3\2\2\2\u0595\u0597\3\2\2\2\u0596\u0594\3\2\2\2\u0597\u0598\5\u0094K"+
		"\2\u0598\u0599\5\u00acW\2\u0599\u00db\3\2\2\2\u059a\u05a1\5\u00eav\2\u059b"+
		"\u05a1\7-\2\2\u059c\u05a1\7\13\2\2\u059d\u05a1\7\26\2\2\u059e\u05a1\7"+
		"\60\2\2\u059f\u05a1\7\61\2\2\u05a0\u059a\3\2\2\2\u05a0\u059b\3\2\2\2\u05a0"+
		"\u059c\3\2\2\2\u05a0\u059d\3\2\2\2\u05a0\u059e\3\2\2\2\u05a0\u059f\3\2"+
		"\2\2\u05a1\u00dd\3\2\2\2\u05a2\u05a4\5\u00ceh\2\u05a3\u05a2\3\2\2\2\u05a4"+
		"\u05a7\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a8\3\2"+
		"\2\2\u05a7\u05a5\3\2\2\2\u05a8\u05a9\7s\2\2\u05a9\u05aa\7&\2\2\u05aa\u05ab"+
		"\7r\2\2\u05ab\u05ac\5\u00e0q\2\u05ac\u00df\3\2\2\2\u05ad\u05b1\7G\2\2"+
		"\u05ae\u05b0\5\u00e2r\2\u05af\u05ae\3\2\2\2\u05b0\u05b3\3\2\2\2\u05b1"+
		"\u05af\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b4\3\2\2\2\u05b3\u05b1\3\2"+
		"\2\2\u05b4\u05b5\7H\2\2\u05b5\u00e1\3\2\2\2\u05b6\u05bc\5\u00e4s\2\u05b7"+
		"\u05bc\5\u00d6l\2\u05b8\u05bc\5V,\2\u05b9\u05bc\5\u00caf\2\u05ba\u05bc"+
		"\7K\2\2\u05bb\u05b6\3\2\2\2\u05bb\u05b7\3\2\2\2\u05bb\u05b8\3\2\2\2\u05bb"+
		"\u05b9\3\2\2\2\u05bb\u05ba\3\2\2\2\u05bc\u00e3\3\2\2\2\u05bd\u05bf\5\u00e6"+
		"t\2\u05be\u05bd\3\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0"+
		"\u05c1\3\2\2\2\u05c1\u05c3\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05c4\5x"+
		"=\2\u05c4\u05c5\7r\2\2\u05c5\u05c6\7E\2\2\u05c6\u05c8\7F\2\2\u05c7\u05c9"+
		"\5\"\22\2\u05c8\u05c7\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05cb\3\2\2\2"+
		"\u05ca\u05cc\5\u00e8u\2\u05cb\u05ca\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc"+
		"\u05cd\3\2\2\2\u05cd\u05ce\7K\2\2\u05ce\u00e5\3\2\2\2\u05cf\u05d3\5\u00ea"+
		"v\2\u05d0\u05d3\7-\2\2\u05d1\u05d3\7\13\2\2\u05d2\u05cf\3\2\2\2\u05d2"+
		"\u05d0\3\2\2\2\u05d2\u05d1\3\2\2\2\u05d3\u00e7\3\2\2\2\u05d4\u05d5\7\26"+
		"\2\2\u05d5\u05d6\5\u00f2z\2\u05d6\u00e9\3\2\2\2\u05d7\u05db\5\u00ecw\2"+
		"\u05d8\u05db\5\u00f8}\2\u05d9\u05db\5\u00fa~\2\u05da\u05d7\3\2\2\2\u05da"+
		"\u05d8\3\2\2\2\u05da\u05d9\3\2\2\2\u05db\u00eb\3\2\2\2\u05dc\u05dd\7s"+
		"\2\2\u05dd\u05de\58\35\2\u05de\u05e0\7E\2\2\u05df\u05e1\5\u00eex\2\u05e0"+
		"\u05df\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\7F"+
		"\2\2\u05e3\u00ed\3\2\2\2\u05e4\u05e9\5\u00f0y\2\u05e5\u05e6\7L\2\2\u05e6"+
		"\u05e8\5\u00f0y\2\u05e7\u05e5\3\2\2\2\u05e8\u05eb\3\2\2\2\u05e9\u05e7"+
		"\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u00ef\3\2\2\2\u05eb\u05e9\3\2\2\2\u05ec"+
		"\u05ed\7r\2\2\u05ed\u05ee\7N\2\2\u05ee\u05ef\5\u00f2z\2\u05ef\u00f1\3"+
		"\2\2\2\u05f0\u05f4\5\u01b6\u00dc\2\u05f1\u05f4\5\u00f4{\2\u05f2\u05f4"+
		"\5\u00eav\2\u05f3\u05f0\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f3\u05f2\3\2\2"+
		"\2\u05f4\u00f3\3\2\2\2\u05f5\u05f7\7G\2\2\u05f6\u05f8\5\u00f6|\2\u05f7"+
		"\u05f6\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05fa\3\2\2\2\u05f9\u05fb\7L"+
		"\2\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc"+
		"\u05fd\7H\2\2\u05fd\u00f5\3\2\2\2\u05fe\u0603\5\u00f2z\2\u05ff\u0600\7"+
		"L\2\2\u0600\u0602\5\u00f2z\2\u0601\u05ff\3\2\2\2\u0602\u0605\3\2\2\2\u0603"+
		"\u0601\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u00f7\3\2\2\2\u0605\u0603\3\2"+
		"\2\2\u0606\u0607\7s\2\2\u0607\u0608\58\35\2\u0608\u00f9\3\2\2\2\u0609"+
		"\u060a\7s\2\2\u060a\u060b\58\35\2\u060b\u060c\7E\2\2\u060c\u060d\5\u00f2"+
		"z\2\u060d\u060e\7F\2\2\u060e\u00fb\3\2\2\2\u060f\u0610\7\t\2\2\u0610\u0611"+
		"\5x=\2\u0611\u0612\7I\2\2\u0612\u0613\5\u01d2\u00ea\2\u0613\u0614\7J\2"+
		"\2\u0614\u00fd\3\2\2\2\u0615\u061a\5v<\2\u0616\u0617\7L\2\2\u0617\u0619"+
		"\5v<\2\u0618\u0616\3\2\2\2\u0619\u061c\3\2\2\2\u061a\u0618\3\2\2\2\u061a"+
		"\u061b\3\2\2\2\u061b\u00ff\3\2\2\2\u061c\u061a\3\2\2\2\u061d\u061f\7G"+
		"\2\2\u061e\u0620\5\u0102\u0082\2\u061f\u061e\3\2\2\2\u061f\u0620\3\2\2"+
		"\2\u0620\u0621\3\2\2\2\u0621\u0622\7H\2\2\u0622\u0101\3\2\2\2\u0623\u0627"+
		"\5\u0104\u0083\2\u0624\u0626\5\u0104\u0083\2\u0625\u0624\3\2\2\2\u0626"+
		"\u0629\3\2\2\2\u0627\u0625\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0103\3\2"+
		"\2\2\u0629\u0627\3\2\2\2\u062a\u062d\5\u0106\u0084\2\u062b\u062d\5\u010a"+
		"\u0086\2\u062c\u062a\3\2\2\2\u062c\u062b\3\2\2\2\u062d\u0105\3\2\2\2\u062e"+
		"\u062f\5\u0108\u0085\2\u062f\u0630\7K\2\2\u0630\u0107\3\2\2\2\u0631\u0633"+
		"\7\b\2\2\u0632\u0631\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0634\3\2\2\2\u0634"+
		"\u0636\5x=\2\u0635\u0637\5\"\22\2\u0636\u0635\3\2\2\2\u0636\u0637\3\2"+
		"\2\2\u0637\u0638\3\2\2\2\u0638\u0639\5p9\2\u0639\u0643\3\2\2\2\u063a\u063b"+
		"\7r\2\2\u063b\u063d\5x=\2\u063c\u063e\5\"\22\2\u063d\u063c\3\2\2\2\u063d"+
		"\u063e\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0640\5p9\2\u0640\u0641\b\u0085"+
		"\1\2\u0641\u0643\3\2\2\2\u0642\u0632\3\2\2\2\u0642\u063a\3\2\2\2\u0643"+
		"\u0109\3\2\2\2\u0644\u0649\5\u010e\u0088\2\u0645\u0649\5\u0120\u0091\2"+
		"\u0646\u0649\5\u0134\u009b\2\u0647\u0649\5\u013a\u009e\2\u0648\u0644\3"+
		"\2\2\2\u0648\u0645\3\2\2\2\u0648\u0646\3\2\2\2\u0648\u0647\3\2\2\2\u0649"+
		"\u010b\3\2\2\2\u064a\u0650\5\u010e\u0088\2\u064b\u0650\5\u0114\u008b\2"+
		"\u064c\u0650\5\u0124\u0093\2\u064d\u0650\5\u0136\u009c\2\u064e\u0650\5"+
		"\u013c\u009f\2\u064f\u064a\3\2\2\2\u064f\u064b\3\2\2\2\u064f\u064c\3\2"+
		"\2\2\u064f\u064d\3\2\2\2\u064f\u064e\3\2\2\2\u0650\u010d\3\2\2\2\u0651"+
		"\u065b\5\u0100\u0081\2\u0652\u065b\5\u0110\u0089\2\u0653\u065b\5\u0116"+
		"\u008c\2\u0654\u065b\5\u0128\u0095\2\u0655\u065b\5\u0138\u009d\2\u0656"+
		"\u065b\5\u0146\u00a4\2\u0657\u065b\5\u0148\u00a5\2\u0658\u065b\5\u014a"+
		"\u00a6\2\u0659\u065b\5\u0108\u0085\2\u065a\u0651\3\2\2\2\u065a\u0652\3"+
		"\2\2\2\u065a\u0653\3\2\2\2\u065a\u0654\3\2\2\2\u065a\u0655\3\2\2\2\u065a"+
		"\u0656\3\2\2\2\u065a\u0657\3\2\2\2\u065a\u0658\3\2\2\2\u065a\u0659\3\2"+
		"\2\2\u065b\u010f\3\2\2\2\u065c\u065d\7K\2\2\u065d\u0111\3\2\2\2\u065e"+
		"\u065f\7r\2\2\u065f\u0660\7T\2\2\u0660\u0661\5\u010a\u0086\2\u0661\u0113"+
		"\3\2\2\2\u0662\u0663\7r\2\2\u0663\u0664\7T\2\2\u0664\u0665\5\u010c\u0087"+
		"\2\u0665\u0115\3\2\2\2\u0666\u0667\5\u0118\u008d\2\u0667\u0668\7K\2\2"+
		"\u0668\u0117\3\2\2\2\u0669\u0672\5\u01b0\u00d9\2\u066a\u0672\5\u01e2\u00f2"+
		"\2\u066b\u0672\5\u01e4\u00f3\2\u066c\u0672\5\u01ec\u00f7\2\u066d\u0672"+
		"\5\u01f0\u00f9\2\u066e\u0672\5\u011a\u008e\2\u066f\u0672\5\u011e\u0090"+
		"\2\u0670\u0672\5\u018c\u00c7\2\u0671\u0669\3\2\2\2\u0671\u066a\3\2\2\2"+
		"\u0671\u066b\3\2\2\2\u0671\u066c\3\2\2\2\u0671\u066d\3\2\2\2\u0671\u066e"+
		"\3\2\2\2\u0671\u066f\3\2\2\2\u0671\u0670\3\2\2\2\u0672\u0119\3\2\2\2\u0673"+
		"\u0674\7\3\2\2\u0674\u067d\7E\2\2\u0675\u067a\t\5\2\2\u0676\u0677\7]\2"+
		"\2\u0677\u0679\t\5\2\2\u0678\u0676\3\2\2\2\u0679\u067c\3\2\2\2\u067a\u0678"+
		"\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u067e\3\2\2\2\u067c\u067a\3\2\2\2\u067d"+
		"\u0675\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u06a3\7F"+
		"\2\2\u0680\u0681\7\3\2\2\u0681\u068a\7E\2\2\u0682\u0687\t\5\2\2\u0683"+
		"\u0684\7]\2\2\u0684\u0686\t\5\2\2\u0685\u0683\3\2\2\2\u0686\u0689\3\2"+
		"\2\2\u0687\u0685\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u068b\3\2\2\2\u0689"+
		"\u0687\3\2\2\2\u068a\u0682\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068c\3\2"+
		"\2\2\u068c\u068d\7]\2\2\u068d\u068e\7F\2\2\u068e\u06a3\b\u008e\1\2\u068f"+
		"\u0690\7\3\2\2\u0690\u0693\7E\2\2\u0691\u0694\7C\2\2\u0692\u0694\5\u011c"+
		"\u008f\2\u0693\u0691\3\2\2\2\u0693\u0692\3\2\2\2\u0694\u0697\3\2\2\2\u0695"+
		"\u0698\7C\2\2\u0696\u0698\5\u011c\u008f\2\u0697\u0695\3\2\2\2\u0697\u0696"+
		"\3\2\2\2\u0698\u069d\3\2\2\2\u0699\u069c\7C\2\2\u069a\u069c\5\u011c\u008f"+
		"\2\u069b\u0699\3\2\2\2\u069b\u069a\3\2\2\2\u069c\u069f\3\2\2\2\u069d\u069b"+
		"\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u06a0\3\2\2\2\u069f\u069d\3\2\2\2\u06a0"+
		"\u06a1\7F\2\2\u06a1\u06a3\b\u008e\1\2\u06a2\u0673\3\2\2\2\u06a2\u0680"+
		"\3\2\2\2\u06a2\u068f\3\2\2\2\u06a3\u011b\3\2\2\2\u06a4\u06a8\7x\2\2\u06a5"+
		"\u06a7\7x\2\2\u06a6\u06a5\3\2\2\2\u06a7\u06aa\3\2\2\2\u06a8\u06a6\3\2"+
		"\2\2\u06a8\u06a9\3\2\2\2\u06a9\u011d\3\2\2\2\u06aa\u06a8\3\2\2\2\u06ab"+
		"\u06ac\7\4\2\2\u06ac\u06ad\7E\2\2\u06ad\u06b2\t\5\2\2\u06ae\u06af\7]\2"+
		"\2\u06af\u06b1\t\5\2\2\u06b0\u06ae\3\2\2\2\u06b1\u06b4\3\2\2\2\u06b2\u06b0"+
		"\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b5\3\2\2\2\u06b4\u06b2\3\2\2\2\u06b5"+
		"\u06b6\7L\2\2\u06b6\u06b7\7r\2\2\u06b7\u06b8\7F\2\2\u06b8\u011f\3\2\2"+
		"\2\u06b9\u06ba\7 \2\2\u06ba\u06bb\7E\2\2\u06bb\u06bc\5\u01b8\u00dd\2\u06bc"+
		"\u06bd\7F\2\2\u06bd\u06be\7\n\2\2\u06be\u06c9\5\u0100\u0081\2\u06bf\u06c0"+
		"\7\31\2\2\u06c0\u06c1\7 \2\2\u06c1\u06c2\7E\2\2\u06c2\u06c3\5\u01b8\u00dd"+
		"\2\u06c3\u06c4\7F\2\2\u06c4\u06c5\7\n\2\2\u06c5\u06c6\5\u0100\u0081\2"+
		"\u06c6\u06c8\3\2\2\2\u06c7\u06bf\3\2\2\2\u06c8\u06cb\3\2\2\2\u06c9\u06c7"+
		"\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cf\3\2\2\2\u06cb\u06c9\3\2\2\2\u06cc"+
		"\u06cd\7\31\2\2\u06cd\u06ce\7\n\2\2\u06ce\u06d0\5\u0100\u0081\2\u06cf"+
		"\u06cc\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u0121\3\2\2\2\u06d1\u06d2\7 "+
		"\2\2\u06d2\u06d3\7E\2\2\u06d3\u06d4\5\u01a2\u00d2\2\u06d4\u06d5\7F\2\2"+
		"\u06d5\u06d6\5\u010c\u0087\2\u06d6\u06d7\7\31\2\2\u06d7\u06d8\5\u010a"+
		"\u0086\2\u06d8\u0123\3\2\2\2\u06d9\u06da\7 \2\2\u06da\u06db\7E\2\2\u06db"+
		"\u06dc\5\u01a2\u00d2\2\u06dc\u06dd\7F\2\2\u06dd\u06de\5\u010c\u0087\2"+
		"\u06de\u06df\7\31\2\2\u06df\u06e0\5\u010c\u0087\2\u06e0\u0125\3\2\2\2"+
		"\u06e1\u06e2\7\f\2\2\u06e2\u06e3\5\u01a2\u00d2\2\u06e3\u06e4\7K\2\2\u06e4"+
		"\u06ec\3\2\2\2\u06e5\u06e6\7\f\2\2\u06e6\u06e7\5\u01a2\u00d2\2\u06e7\u06e8"+
		"\7T\2\2\u06e8\u06e9\5\u01a2\u00d2\2\u06e9\u06ea\7K\2\2\u06ea\u06ec\3\2"+
		"\2\2\u06eb\u06e1\3\2\2\2\u06eb\u06e5\3\2\2\2\u06ec\u0127\3\2\2\2\u06ed"+
		"\u06ee\7\63\2\2\u06ee\u06ef\7E\2\2\u06ef\u06f0\7r\2\2\u06f0\u06f1\7F\2"+
		"\2\u06f1\u06f2\5\u012a\u0096\2\u06f2\u0129\3\2\2\2\u06f3\u06f7\7G\2\2"+
		"\u06f4\u06f6\5\u012c\u0097\2\u06f5\u06f4\3\2\2\2\u06f6\u06f9\3\2\2\2\u06f7"+
		"\u06f5\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06fd\3\2\2\2\u06f9\u06f7\3\2"+
		"\2\2\u06fa\u06fc\5\u0130\u0099\2\u06fb\u06fa\3\2\2\2\u06fc\u06ff\3\2\2"+
		"\2\u06fd\u06fb\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u0700\3\2\2\2\u06ff\u06fd"+
		"\3\2\2\2\u0700\u0701\7H\2\2\u0701\u012b\3\2\2\2\u0702\u0703\5\u012e\u0098"+
		"\2\u0703\u0704\5\u0102\u0082\2\u0704\u012d\3\2\2\2\u0705\u0709\5\u0130"+
		"\u0099\2\u0706\u0708\5\u0130\u0099\2\u0707\u0706\3\2\2\2\u0708\u070b\3"+
		"\2\2\2\u0709\u0707\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u012f\3\2\2\2\u070b"+
		"\u0709\3\2\2\2\u070c\u070d\7\20\2\2\u070d\u070e\5\u01a0\u00d1\2\u070e"+
		"\u070f\7T\2\2\u070f\u0713\3\2\2\2\u0710\u0711\7\26\2\2\u0711\u0713\7T"+
		"\2\2\u0712\u070c\3\2\2\2\u0712\u0710\3\2\2\2\u0713\u0131\3\2\2\2\u0714"+
		"\u0715\7r\2\2\u0715\u0133\3\2\2\2\u0716\u0717\7<\2\2\u0717\u0718\7r\2"+
		"\2\u0718\u0719\7=\2\2\u0719\u071a\5\u01d2\u00ea\2\u071a\u071b\5\u0100"+
		"\u0081\2\u071b\u0730\3\2\2\2\u071c\u071d\7<\2\2\u071d\u071e\7r\2\2\u071e"+
		"\u071f\7>\2\2\u071f\u0720\5\u01d2\u00ea\2\u0720\u0721\5\u0100\u0081\2"+
		"\u0721\u0730\3\2\2\2\u0722\u0723\7<\2\2\u0723\u0724\7r\2\2\u0724\u0728"+
		"\t\5\2\2\u0725\u0727\t\5\2\2\u0726\u0725\3\2\2\2\u0727\u072a\3\2\2\2\u0728"+
		"\u0726\3\2\2\2\u0728\u0729\3\2\2\2\u0729\u072b\3\2\2\2\u072a\u0728\3\2"+
		"\2\2\u072b\u072c\5\u01d2\u00ea\2\u072c\u072d\5\u0100\u0081\2\u072d\u072e"+
		"\b\u009b\1\2\u072e\u0730\3\2\2\2\u072f\u0716\3\2\2\2\u072f\u071c\3\2\2"+
		"\2\u072f\u0722\3\2\2\2\u0730\u0135\3\2\2\2\u0731\u0732\7<\2\2\u0732\u0733"+
		"\7E\2\2\u0733\u0734\5\u01a2\u00d2\2\u0734\u0735\7F\2\2\u0735\u0736\5\u010c"+
		"\u0087\2\u0736\u0137\3\2\2\2\u0737\u0738\7\27\2\2\u0738\u0739\5\u0100"+
		"\u0081\2\u0739\u073a\7<\2\2\u073a\u073b\7r\2\2\u073b\u073c\7=\2\2\u073c"+
		"\u073d\5\u01d2\u00ea\2\u073d\u0754\3\2\2\2\u073e\u073f\7\27\2\2\u073f"+
		"\u0740\5\u0100\u0081\2\u0740\u0741\7<\2\2\u0741\u0742\7r\2\2\u0742\u0743"+
		"\7>\2\2\u0743\u0744\5\u01d2\u00ea\2\u0744\u0754\3\2\2\2\u0745\u0746\7"+
		"\27\2\2\u0746\u0747\5\u0100\u0081\2\u0747\u0748\7<\2\2\u0748\u0749\7r"+
		"\2\2\u0749\u074d\t\5\2\2\u074a\u074c\t\5\2\2\u074b\u074a\3\2\2\2\u074c"+
		"\u074f\3\2\2\2\u074d\u074b\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u0750\3\2"+
		"\2\2\u074f\u074d\3\2\2\2\u0750\u0751\5\u01d2\u00ea\2\u0751\u0752\b\u009d"+
		"\1\2\u0752\u0754\3\2\2\2\u0753\u0737\3\2\2\2\u0753\u073e\3\2\2\2\u0753"+
		"\u0745\3\2\2\2\u0754\u0139\3\2\2\2\u0755\u0756\5\u013e\u00a0\2\u0756\u013b"+
		"\3\2\2\2\u0757\u0758\5\u013e\u00a0\2\u0758\u013d\3\2\2\2\u0759\u075a\7"+
		"\37\2\2\u075a\u075b\5\u0140\u00a1\2\u075b\u075c\7=\2\2\u075c\u075d\5\u01d2"+
		"\u00ea\2\u075d\u075e\5\u0100\u0081\2\u075e\u0773\3\2\2\2\u075f\u0760\7"+
		"\37\2\2\u0760\u0761\5\u0140\u00a1\2\u0761\u0762\7>\2\2\u0762\u0763\5\u01d2"+
		"\u00ea\2\u0763\u0764\5\u0100\u0081\2\u0764\u0773\3\2\2\2\u0765\u0766\7"+
		"\37\2\2\u0766\u0767\5\u0140\u00a1\2\u0767\u076b\t\5\2\2\u0768\u076a\t"+
		"\5\2\2\u0769\u0768\3\2\2\2\u076a\u076d\3\2\2\2\u076b\u0769\3\2\2\2\u076b"+
		"\u076c\3\2\2\2\u076c\u076e\3\2\2\2\u076d\u076b\3\2\2\2\u076e\u076f\5\u01d2"+
		"\u00ea\2\u076f\u0770\5\u0100\u0081\2\u0770\u0771\b\u00a0\1\2\u0771\u0773"+
		"\3\2\2\2\u0772\u0759\3\2\2\2\u0772\u075f\3\2\2\2\u0772\u0765\3\2\2\2\u0773"+
		"\u013f\3\2\2\2\u0774\u0777\3\2\2\2\u0775\u0777\5\u0142\u00a2\2\u0776\u0774"+
		"\3\2\2\2\u0776\u0775\3\2\2\2\u0777\u0141\3\2\2\2\u0778\u077a\5x=\2\u0779"+
		"\u0778\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u077c\5t"+
		";\2\u077c\u077d\5\u0144\u00a3\2\u077d\u0780\3\2\2\2\u077e\u0780\7r\2\2"+
		"\u077f\u0779\3\2\2\2\u077f\u077e\3\2\2\2\u0780\u0143\3\2\2\2\u0781\u0782"+
		"\7N\2\2\u0782\u0785\5v<\2\u0783\u0785\b\u00a3\1\2\u0784\u0781\3\2\2\2"+
		"\u0784\u0783\3\2\2\2\u0785\u0145\3\2\2\2\u0786\u0787\7\16\2\2\u0787\u0788"+
		"\7K\2\2\u0788\u0147\3\2\2\2\u0789\u078a\7\25\2\2\u078a\u078b\7K\2\2\u078b"+
		"\u0149\3\2\2\2\u078c\u078e\7.\2\2\u078d\u078f\5\u01a2\u00d2\2\u078e\u078d"+
		"\3\2\2\2\u078e\u078f\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0791\7K\2\2\u0791"+
		"\u014b\3\2\2\2\u0792\u0793\7\66\2\2\u0793\u0794\5\u01a2\u00d2\2\u0794"+
		"\u0795\7K\2\2\u0795\u014d\3\2\2\2\u0796\u0797\7\64\2\2\u0797\u0798\7E"+
		"\2\2\u0798\u0799\5\u01a2\u00d2\2\u0799\u079a\7F\2\2\u079a\u079b\5\u0100"+
		"\u0081\2\u079b\u014f\3\2\2\2\u079c\u079d\79\2\2\u079d\u079e\5\u0100\u0081"+
		"\2\u079e\u079f\5\u0152\u00aa\2\u079f\u07a9\3\2\2\2\u07a0\u07a1\79\2\2"+
		"\u07a1\u07a3\5\u0100\u0081\2\u07a2\u07a4\5\u0152\u00aa\2\u07a3\u07a2\3"+
		"\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07a6\5\u015a\u00ae"+
		"\2\u07a6\u07a9\3\2\2\2\u07a7\u07a9\5\u015c\u00af\2\u07a8\u079c\3\2\2\2"+
		"\u07a8\u07a0\3\2\2\2\u07a8\u07a7\3\2\2\2\u07a9\u0151\3\2\2\2\u07aa\u07ae"+
		"\5\u0154\u00ab\2\u07ab\u07ad\5\u0154\u00ab\2\u07ac\u07ab\3\2\2\2\u07ad"+
		"\u07b0\3\2\2\2\u07ae\u07ac\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u0153\3\2"+
		"\2\2\u07b0\u07ae\3\2\2\2\u07b1\u07b2\7\21\2\2\u07b2\u07b3\7E\2\2\u07b3"+
		"\u07b4\5\u0156\u00ac\2\u07b4\u07b5\7F\2\2\u07b5\u07b6\5\u0100\u0081\2"+
		"\u07b6\u0155\3\2\2\2\u07b7\u07b9\5\u00a0Q\2\u07b8\u07b7\3\2\2\2\u07b9"+
		"\u07bc\3\2\2\2\u07ba\u07b8\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07bd\3\2"+
		"\2\2\u07bc\u07ba\3\2\2\2\u07bd\u07be\5\u0158\u00ad\2\u07be\u07bf\5t;\2"+
		"\u07bf\u0157\3\2\2\2\u07c0\u07c5\5\u0080A\2\u07c1\u07c2\7b\2\2\u07c2\u07c4"+
		"\5\22\n\2\u07c3\u07c1\3\2\2\2\u07c4\u07c7\3\2\2\2\u07c5\u07c3\3\2\2\2"+
		"\u07c5\u07c6\3\2\2\2\u07c6\u0159\3\2\2\2\u07c7\u07c5\3\2\2\2\u07c8\u07c9"+
		"\7\35\2\2\u07c9\u07ca\5\u0100\u0081\2\u07ca\u015b\3\2\2\2\u07cb\u07cc"+
		"\79\2\2\u07cc\u07cd\5\u015e\u00b0\2\u07cd\u07cf\5\u0100\u0081\2\u07ce"+
		"\u07d0\5\u0152\u00aa\2\u07cf\u07ce\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0\u07d2"+
		"\3\2\2\2\u07d1\u07d3\5\u015a\u00ae\2\u07d2\u07d1\3\2\2\2\u07d2\u07d3\3"+
		"\2\2\2\u07d3\u015d\3\2\2\2\u07d4\u07d5\7E\2\2\u07d5\u07d7\5\u0160\u00b1"+
		"\2\u07d6\u07d8\7K\2\2\u07d7\u07d6\3\2\2\2\u07d7\u07d8\3\2\2\2\u07d8\u07d9"+
		"\3\2\2\2\u07d9\u07da\7F\2\2\u07da\u015f\3\2\2\2\u07db\u07e0\5\u0162\u00b2"+
		"\2\u07dc\u07dd\7K\2\2\u07dd\u07df\5\u0162\u00b2\2\u07de\u07dc\3\2\2\2"+
		"\u07df\u07e2\3\2\2\2\u07e0\u07de\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u0161"+
		"\3\2\2\2\u07e2\u07e0\3\2\2\2\u07e3\u07e5\5\u00a0Q\2\u07e4\u07e3\3\2\2"+
		"\2\u07e5\u07e8\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e9"+
		"\3\2\2\2\u07e8\u07e6\3\2\2\2\u07e9\u07ea\5x=\2\u07ea\u07eb\5t;\2\u07eb"+
		"\u07ec\7N\2\2\u07ec\u07ed\5\u01a2\u00d2\2\u07ed\u0163\3\2\2\2\u07ee\u07ef"+
		"\5\u0172\u00ba\2\u07ef\u0165\3\2\2\2\u07f0\u080e\5\2\2\2\u07f1\u07f6\5"+
		"8\35\2\u07f2\u07f3\7I\2\2\u07f3\u07f5\7J\2\2\u07f4\u07f2\3\2\2\2\u07f5"+
		"\u07f8\3\2\2\2\u07f6\u07f4\3\2\2\2\u07f6\u07f7\3\2\2\2\u07f7\u07f9\3\2"+
		"\2\2\u07f8\u07f6\3\2\2\2\u07f9\u07fa\7M\2\2\u07fa\u07fb\7\23\2\2\u07fb"+
		"\u080e\3\2\2\2\u07fc\u07fd\7:\2\2\u07fd\u07fe\7M\2\2\u07fe\u080e\7\23"+
		"\2\2\u07ff\u080e\7\65\2\2\u0800\u0801\58\35\2\u0801\u0802\7M\2\2\u0802"+
		"\u0803\7\65\2\2\u0803\u080e\3\2\2\2\u0804\u0805\7E\2\2\u0805\u0806\5\u01a2"+
		"\u00d2\2\u0806\u0807\7F\2\2\u0807\u080e\3\2\2\2\u0808\u080e\5\u0178\u00bd"+
		"\2\u0809\u080e\5\u0180\u00c1\2\u080a\u080e\5\u0186\u00c4\2\u080b\u080e"+
		"\5\u018c\u00c7\2\u080c\u080e\5\u0194\u00cb\2\u080d\u07f0\3\2\2\2\u080d"+
		"\u07f1\3\2\2\2\u080d\u07fc\3\2\2\2\u080d\u07ff\3\2\2\2\u080d\u0800\3\2"+
		"\2\2\u080d\u0804\3\2\2\2\u080d\u0808\3\2\2\2\u080d\u0809\3\2\2\2\u080d"+
		"\u080a\3\2\2\2\u080d\u080b\3\2\2\2\u080d\u080c\3\2\2\2\u080e\u0167\3\2"+
		"\2\2\u080f\u0810\3\2\2\2\u0810\u0169\3\2\2\2\u0811\u082e\5\2\2\2\u0812"+
		"\u0817\58\35\2\u0813\u0814\7I\2\2\u0814\u0816\7J\2\2\u0815\u0813\3\2\2"+
		"\2\u0816\u0819\3\2\2\2\u0817\u0815\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u081a"+
		"\3\2\2\2\u0819\u0817\3\2\2\2\u081a\u081b\7M\2\2\u081b\u081c\7\23\2\2\u081c"+
		"\u082e\3\2\2\2\u081d\u081e\7:\2\2\u081e\u081f\7M\2\2\u081f\u082e\7\23"+
		"\2\2\u0820\u082e\7\65\2\2\u0821\u0822\58\35\2\u0822\u0823\7M\2\2\u0823"+
		"\u0824\7\65\2\2\u0824\u082e\3\2\2\2\u0825\u0826\7E\2\2\u0826\u0827\5\u01a2"+
		"\u00d2\2\u0827\u0828\7F\2\2\u0828\u082e\3\2\2\2\u0829\u082e\5\u0178\u00bd"+
		"\2\u082a\u082e\5\u0180\u00c1\2\u082b\u082e\5\u018c\u00c7\2\u082c\u082e"+
		"\5\u0194\u00cb\2\u082d\u0811\3\2\2\2\u082d\u0812\3\2\2\2\u082d\u081d\3"+
		"\2\2\2\u082d\u0820\3\2\2\2\u082d\u0821\3\2\2\2\u082d\u0825\3\2\2\2\u082d"+
		"\u0829\3\2\2\2\u082d\u082a\3\2\2\2\u082d\u082b\3\2\2\2\u082d\u082c\3\2"+
		"\2\2\u082e\u016b\3\2\2\2\u082f\u0835\5\u017a\u00be\2\u0830\u0835\5\u0182"+
		"\u00c2\2\u0831\u0835\5\u0188\u00c5\2\u0832\u0835\5\u018e\u00c8\2\u0833"+
		"\u0835\5\u0196\u00cc\2\u0834\u082f\3\2\2\2\u0834\u0830\3\2\2\2\u0834\u0831"+
		"\3\2\2\2\u0834\u0832\3\2\2\2\u0834\u0833\3\2\2\2\u0835\u016d\3\2\2\2\u0836"+
		"\u0837\3\2\2\2\u0837\u016f\3\2\2\2\u0838\u083d\5\u017a\u00be\2\u0839\u083d"+
		"\5\u0182\u00c2\2\u083a\u083d\5\u018e\u00c8\2\u083b\u083d\5\u0196\u00cc"+
		"\2\u083c\u0838\3\2\2\2\u083c\u0839\3\2\2\2\u083c\u083a\3\2\2\2\u083c\u083b"+
		"\3\2\2\2\u083d\u0171\3\2\2\2\u083e\u0846\5\2\2\2\u083f\u0840\7E\2\2\u0840"+
		"\u0841\5\u01a2\u00d2\2\u0841\u0842\7F\2\2\u0842\u0846\3\2\2\2\u0843\u0846"+
		"\5\u018a\u00c6\2\u0844\u0846\5\u0190\u00c9\2\u0845\u083e\3\2\2\2\u0845"+
		"\u083f\3\2\2\2\u0845\u0843\3\2\2\2\u0845\u0844\3\2\2\2\u0846\u0173\3\2"+
		"\2\2\u0847\u0848\3\2\2\2\u0848\u0175\3\2\2\2\u0849\u0871\5\2\2\2\u084a"+
		"\u084f\58\35\2\u084b\u084c\7I\2\2\u084c\u084e\7J\2\2\u084d\u084b\3\2\2"+
		"\2\u084e\u0851\3\2\2\2\u084f\u084d\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0852"+
		"\3\2\2\2\u0851\u084f\3\2\2\2\u0852\u0853\7M\2\2\u0853\u0854\7\23\2\2\u0854"+
		"\u0871\3\2\2\2\u0855\u085a\5z>\2\u0856\u0857\7I\2\2\u0857\u0859\7J\2\2"+
		"\u0858\u0856\3\2\2\2\u0859\u085c\3\2\2\2\u085a\u0858\3\2\2\2\u085a\u085b"+
		"\3\2\2\2\u085b\u085d\3\2\2\2\u085c\u085a\3\2\2\2\u085d\u085e\7M\2\2\u085e"+
		"\u085f\7\23\2\2\u085f\u0871\3\2\2\2\u0860\u0861\7:\2\2\u0861\u0862\7M"+
		"\2\2\u0862\u0871\7\23\2\2\u0863\u0871\7\65\2\2\u0864\u0865\58\35\2\u0865"+
		"\u0866\7M\2\2\u0866\u0867\7\65\2\2\u0867\u0871\3\2\2\2\u0868\u0869\7E"+
		"\2\2\u0869\u086a\5\u01a2\u00d2\2\u086a\u086b\7F\2\2\u086b\u0871\3\2\2"+
		"\2\u086c\u0871\5\u017c\u00bf\2\u086d\u0871\5\u0184\u00c3\2\u086e\u0871"+
		"\5\u0190\u00c9\2\u086f\u0871\5\u0198\u00cd\2\u0870\u0849\3\2\2\2\u0870"+
		"\u084a\3\2\2\2\u0870\u0855\3\2\2\2\u0870\u0860\3\2\2\2\u0870\u0863\3\2"+
		"\2\2\u0870\u0864\3\2\2\2\u0870\u0868\3\2\2\2\u0870\u086c\3\2\2\2\u0870"+
		"\u086d\3\2\2\2\u0870\u086e\3\2\2\2\u0870\u086f\3\2\2\2\u0871\u0177\3\2"+
		"\2\2\u0872\u0874\7)\2\2\u0873\u0875\5,\27\2\u0874\u0873\3\2\2\2\u0874"+
		"\u0875\3\2\2\2\u0875\u0879\3\2\2\2\u0876\u0878\5\u00eav\2\u0877\u0876"+
		"\3\2\2\2\u0878\u087b\3\2\2\2\u0879\u0877\3\2\2\2\u0879\u087a\3\2\2\2\u087a"+
		"\u087c\3\2\2\2\u087b\u0879\3\2\2\2\u087c\u0887\7r\2\2\u087d\u0881\7M\2"+
		"\2\u087e\u0880\5\u00eav\2\u087f\u087e\3\2\2\2\u0880\u0883\3\2\2\2\u0881"+
		"\u087f\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u0884\3\2\2\2\u0883\u0881\3\2"+
		"\2\2\u0884\u0886\7r\2\2\u0885\u087d\3\2\2\2\u0886\u0889\3\2\2\2\u0887"+
		"\u0885\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u088b\3\2\2\2\u0889\u0887\3\2"+
		"\2\2\u088a\u088c\5\u017e\u00c0\2\u088b\u088a\3\2\2\2\u088b\u088c\3\2\2"+
		"\2\u088c\u088d\3\2\2\2\u088d\u088f\7E\2\2\u088e\u0890\5\u0192\u00ca\2"+
		"\u088f\u088e\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0891\3\2\2\2\u0891\u0893"+
		"\7F\2\2\u0892\u0894\5f\64\2\u0893\u0892\3\2\2\2\u0893\u0894\3\2\2\2\u0894"+
		"\u08c6\3\2\2\2\u0895\u0896\5<\37\2\u0896\u0897\7M\2\2\u0897\u0899\7)\2"+
		"\2\u0898\u089a\5,\27\2\u0899\u0898\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u089e"+
		"\3\2\2\2\u089b\u089d\5\u00eav\2\u089c\u089b\3\2\2\2\u089d\u08a0\3\2\2"+
		"\2\u089e\u089c\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a1\3\2\2\2\u08a0\u089e"+
		"\3\2\2\2\u08a1\u08a3\7r\2\2\u08a2\u08a4\5\u017e\u00c0\2\u08a3\u08a2\3"+
		"\2\2\2\u08a3\u08a4\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u08a7\7E\2\2\u08a6"+
		"\u08a8\5\u0192\u00ca\2\u08a7\u08a6\3\2\2\2\u08a7\u08a8\3\2\2\2\u08a8\u08a9"+
		"\3\2\2\2\u08a9\u08ab\7F\2\2\u08aa\u08ac\5f\64\2\u08ab\u08aa\3\2\2\2\u08ab"+
		"\u08ac\3\2\2\2\u08ac\u08c6\3\2\2\2\u08ad\u08ae\5\u0164\u00b3\2\u08ae\u08af"+
		"\7M\2\2\u08af\u08b1\7)\2\2\u08b0\u08b2\5,\27\2\u08b1\u08b0\3\2\2\2\u08b1"+
		"\u08b2\3\2\2\2\u08b2\u08b6\3\2\2\2\u08b3\u08b5\5\u00eav\2\u08b4\u08b3"+
		"\3\2\2\2\u08b5\u08b8\3\2\2\2\u08b6\u08b4\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7"+
		"\u08b9\3\2\2\2\u08b8\u08b6\3\2\2\2\u08b9\u08bb\7r\2\2\u08ba\u08bc\5\u017e"+
		"\u00c0\2\u08bb\u08ba\3\2\2\2\u08bb\u08bc\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd"+
		"\u08bf\7E\2\2\u08be\u08c0\5\u0192\u00ca\2\u08bf\u08be\3\2\2\2\u08bf\u08c0"+
		"\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u08c3\7F\2\2\u08c2\u08c4\5f\64\2\u08c3"+
		"\u08c2\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u08c6\3\2\2\2\u08c5\u0872\3\2"+
		"\2\2\u08c5\u0895\3\2\2\2\u08c5\u08ad\3\2\2\2\u08c6\u0179\3\2\2\2\u08c7"+
		"\u08c8\7M\2\2\u08c8\u08ca\7)\2\2\u08c9\u08cb\5,\27\2\u08ca\u08c9\3\2\2"+
		"\2\u08ca\u08cb\3\2\2\2\u08cb\u08cf\3\2\2\2\u08cc\u08ce\5\u00eav\2\u08cd"+
		"\u08cc\3\2\2\2\u08ce\u08d1\3\2\2\2\u08cf\u08cd\3\2\2\2\u08cf\u08d0\3\2"+
		"\2\2\u08d0\u08d2\3\2\2\2\u08d1\u08cf\3\2\2\2\u08d2\u08d4\7r\2\2\u08d3"+
		"\u08d5\5\u017e\u00c0\2\u08d4\u08d3\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08d6"+
		"\3\2\2\2\u08d6\u08d8\7E\2\2\u08d7\u08d9\5\u0192\u00ca\2\u08d8\u08d7\3"+
		"\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08da\3\2\2\2\u08da\u08dc\7F\2\2\u08db"+
		"\u08dd\5f\64\2\u08dc\u08db\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u017b\3\2"+
		"\2\2\u08de\u08e0\7)\2\2\u08df\u08e1\5,\27\2\u08e0\u08df\3\2\2\2\u08e0"+
		"\u08e1\3\2\2\2\u08e1\u08e5\3\2\2\2\u08e2\u08e4\5\u00eav\2\u08e3\u08e2"+
		"\3\2\2\2\u08e4\u08e7\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6"+
		"\u08e8\3\2\2\2\u08e7\u08e5\3\2\2\2\u08e8\u08f3\7r\2\2\u08e9\u08ed\7M\2"+
		"\2\u08ea\u08ec\5\u00eav\2\u08eb\u08ea\3\2\2\2\u08ec\u08ef\3\2\2\2\u08ed"+
		"\u08eb\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u08f0\3\2\2\2\u08ef\u08ed\3\2"+
		"\2\2\u08f0\u08f2\7r\2\2\u08f1\u08e9\3\2\2\2\u08f2\u08f5\3\2\2\2\u08f3"+
		"\u08f1\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4\u08f7\3\2\2\2\u08f5\u08f3\3\2"+
		"\2\2\u08f6\u08f8\5\u017e\u00c0\2\u08f7\u08f6\3\2\2\2\u08f7\u08f8\3\2\2"+
		"\2\u08f8\u08f9\3\2\2\2\u08f9\u08fb\7E\2\2\u08fa\u08fc\5\u0192\u00ca\2"+
		"\u08fb\u08fa\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd\u08ff"+
		"\7F\2\2\u08fe\u0900\5f\64\2\u08ff\u08fe\3\2\2\2\u08ff\u0900\3\2\2\2\u0900"+
		"\u091a\3\2\2\2\u0901\u0902\5<\37\2\u0902\u0903\7M\2\2\u0903\u0905\7)\2"+
		"\2\u0904\u0906\5,\27\2\u0905\u0904\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u090a"+
		"\3\2\2\2\u0907\u0909\5\u00eav\2\u0908\u0907\3\2\2\2\u0909\u090c\3\2\2"+
		"\2\u090a\u0908\3\2\2\2\u090a\u090b\3\2\2\2\u090b\u090d\3\2\2\2\u090c\u090a"+
		"\3\2\2\2\u090d\u090f\7r\2\2\u090e\u0910\5\u017e\u00c0\2\u090f\u090e\3"+
		"\2\2\2\u090f\u0910\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0913\7E\2\2\u0912"+
		"\u0914\5\u0192\u00ca\2\u0913\u0912\3\2\2\2\u0913\u0914\3\2\2\2\u0914\u0915"+
		"\3\2\2\2\u0915\u0917\7F\2\2\u0916\u0918\5f\64\2\u0917\u0916\3\2\2\2\u0917"+
		"\u0918\3\2\2\2\u0918\u091a\3\2\2\2\u0919\u08de\3\2\2\2\u0919\u0901\3\2"+
		"\2\2\u091a\u017d\3\2\2\2\u091b\u091f\5,\27\2\u091c\u091d\7P\2\2\u091d"+
		"\u091f\7O\2\2\u091e\u091b\3\2\2\2\u091e\u091c\3\2\2\2\u091f\u017f\3\2"+
		"\2\2\u0920\u0921\5\u0164\u00b3\2\u0921\u0922\7M\2\2\u0922\u0923\7r\2\2"+
		"\u0923\u092e\3\2\2\2\u0924\u0925\7\62\2\2\u0925\u0926\7M\2\2\u0926\u092e"+
		"\7r\2\2\u0927\u0928\58\35\2\u0928\u0929\7M\2\2\u0929\u092a\7\62\2\2\u092a"+
		"\u092b\7M\2\2\u092b\u092c\7r\2\2\u092c\u092e\3\2\2\2\u092d\u0920\3\2\2"+
		"\2\u092d\u0924\3\2\2\2\u092d\u0927\3\2\2\2\u092e\u0181\3\2\2\2\u092f\u0930"+
		"\7M\2\2\u0930\u0931\7r\2\2\u0931\u0183\3\2\2\2\u0932\u0933\7\62\2\2\u0933"+
		"\u0934\7M\2\2\u0934\u093c\7r\2\2\u0935\u0936\58\35\2\u0936\u0937\7M\2"+
		"\2\u0937\u0938\7\62\2\2\u0938\u0939\7M\2\2\u0939\u093a\7r\2\2\u093a\u093c"+
		"\3\2\2\2\u093b\u0932\3\2\2\2\u093b\u0935\3\2\2\2\u093c\u0185\3\2\2\2\u093d"+
		"\u093e\5<\37\2\u093e\u093f\7I\2\2\u093f\u0940\5\u01a2\u00d2\2\u0940\u0941"+
		"\7J\2\2\u0941\u0948\3\2\2\2\u0942\u0943\5\u016a\u00b6\2\u0943\u0944\7"+
		"I\2\2\u0944\u0945\5\u01a2\u00d2\2\u0945\u0946\7J\2\2\u0946\u0948\3\2\2"+
		"\2\u0947\u093d\3\2\2\2\u0947\u0942\3\2\2\2\u0948\u0950\3\2\2\2\u0949\u094a"+
		"\5\u0168\u00b5\2\u094a\u094b\7I\2\2\u094b\u094c\5\u01a2\u00d2\2\u094c"+
		"\u094d\7J\2\2\u094d\u094f\3\2\2\2\u094e\u0949\3\2\2\2";
	private static final String _serializedATNSegment1 =
		"\u094f\u0952\3\2\2\2\u0950\u094e\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u0187"+
		"\3\2\2\2\u0952\u0950\3\2\2\2\u0953\u0954\5\u0170\u00b9\2\u0954\u0955\7"+
		"I\2\2\u0955\u0956\5\u01a2\u00d2\2\u0956\u095e\7J\2\2\u0957\u0958\5\u016e"+
		"\u00b8\2\u0958\u0959\7I\2\2\u0959\u095a\5\u01a2\u00d2\2\u095a\u095b\7"+
		"J\2\2\u095b\u095d\3\2\2\2\u095c\u0957\3\2\2\2\u095d\u0960\3\2\2\2\u095e"+
		"\u095c\3\2\2\2\u095e\u095f\3\2\2\2\u095f\u0189\3\2\2\2\u0960\u095e\3\2"+
		"\2\2\u0961\u0962\5<\37\2\u0962\u0963\7I\2\2\u0963\u0964\5\u01a2\u00d2"+
		"\2\u0964\u0965\7J\2\2\u0965\u018b\3\2\2\2\u0966\u0967\5> \2\u0967\u0969"+
		"\7E\2\2\u0968\u096a\5\u0192\u00ca\2\u0969\u0968\3\2\2\2\u0969\u096a\3"+
		"\2\2\2\u096a\u096b\3\2\2\2\u096b\u096c\7F\2\2\u096c\u096e\7E\2\2\u096d"+
		"\u096f\5\u0192\u00ca\2\u096e\u096d\3\2\2\2\u096e\u096f\3\2\2\2\u096f\u0970"+
		"\3\2\2\2\u0970\u0971\7F\2\2\u0971\u0972\b\u00c7\1\2\u0972\u0989\3\2\2"+
		"\2\u0973\u0974\5> \2\u0974\u0976\7E\2\2\u0975\u0977\5\u0192\u00ca\2\u0976"+
		"\u0975\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u0979\b\u00c7"+
		"\1\2\u0979\u0989\3\2\2\2\u097a\u097c\5> \2\u097b\u097d\5\u0192\u00ca\2"+
		"\u097c\u097b\3\2\2\2\u097c\u097d\3\2\2\2\u097d\u097e\3\2\2\2\u097e\u097f"+
		"\7F\2\2\u097f\u0980\b\u00c7\1\2\u0980\u0989\3\2\2\2\u0981\u0982\5> \2"+
		"\u0982\u0984\7E\2\2\u0983\u0985\5\u0192\u00ca\2\u0984\u0983\3\2\2\2\u0984"+
		"\u0985\3\2\2\2\u0985\u0986\3\2\2\2\u0986\u0987\7F\2\2\u0987\u0989\3\2"+
		"\2\2\u0988\u0966\3\2\2\2\u0988\u0973\3\2\2\2\u0988\u097a\3\2\2\2\u0988"+
		"\u0981\3\2\2\2\u0989\u018d\3\2\2\2\u098a\u098c\7M\2\2\u098b\u098d\5,\27"+
		"\2\u098c\u098b\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u098f"+
		"\7r\2\2\u098f\u0991\7E\2\2\u0990\u0992\5\u0192\u00ca\2\u0991\u0990\3\2"+
		"\2\2\u0991\u0992\3\2\2\2\u0992\u0993\3\2\2\2\u0993\u0994\7F\2\2\u0994"+
		"\u018f\3\2\2\2\u0995\u0996\5> \2\u0996\u0998\7E\2\2\u0997\u0999\5\u0192"+
		"\u00ca\2\u0998\u0997\3\2\2\2\u0998\u0999\3\2\2\2\u0999\u099a\3\2\2\2\u099a"+
		"\u099b\7F\2\2\u099b\u09b1\3\2\2\2\u099c\u099d\5> \2\u099d\u099f\7E\2\2"+
		"\u099e\u09a0\5\u0192\u00ca\2\u099f\u099e\3\2\2\2\u099f\u09a0\3\2\2\2\u09a0"+
		"\u09a1\3\2\2\2\u09a1\u09a2\7F\2\2\u09a2\u09a4\7E\2\2\u09a3\u09a5\5\u0192"+
		"\u00ca\2\u09a4\u09a3\3\2\2\2\u09a4\u09a5\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6"+
		"\u09a7\7F\2\2\u09a7\u09a8\b\u00c9\1\2\u09a8\u09b1\3\2\2\2\u09a9\u09aa"+
		"\5> \2\u09aa\u09ac\7E\2\2\u09ab\u09ad\5\u0192\u00ca\2\u09ac\u09ab\3\2"+
		"\2\2\u09ac\u09ad\3\2\2\2\u09ad\u09ae\3\2\2\2\u09ae\u09af\b\u00c9\1\2\u09af"+
		"\u09b1\3\2\2\2\u09b0\u0995\3\2\2\2\u09b0\u099c\3\2\2\2\u09b0\u09a9\3\2"+
		"\2\2\u09b1\u0191\3\2\2\2\u09b2\u09b3\b\u00ca\1\2\u09b3\u09b8\5\u01a2\u00d2"+
		"\2\u09b4\u09b5\7L\2\2\u09b5\u09b7\5\u01a2\u00d2\2\u09b6\u09b4\3\2\2\2"+
		"\u09b7\u09ba\3\2\2\2\u09b8\u09b6\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09d4"+
		"\3\2\2\2\u09ba\u09b8\3\2\2\2\u09bb\u09c0\5\u01a2\u00d2\2\u09bc\u09bd\7"+
		"L\2\2\u09bd\u09bf\5\u01a2\u00d2\2\u09be\u09bc\3\2\2\2\u09bf\u09c2\3\2"+
		"\2\2\u09c0\u09be\3\2\2\2\u09c0\u09c1\3\2\2\2\u09c1\u09c4\3\2\2\2\u09c2"+
		"\u09c0\3\2\2\2\u09c3\u09bb\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c5\3\2"+
		"\2\2\u09c5\u09c6\5\u01a2\u00d2\2\u09c6\u09c7\5\u0192\u00ca\6\u09c7\u09c8"+
		"\b\u00ca\1\2\u09c8\u09d4\3\2\2\2\u09c9\u09cb\7L\2\2\u09ca\u09c9\3\2\2"+
		"\2\u09cb\u09ce\3\2\2\2\u09cc\u09ca\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd\u09cf"+
		"\3\2\2\2\u09ce\u09cc\3\2\2\2\u09cf\u09d0\7L\2\2\u09d0\u09d1\5\u0192\u00ca"+
		"\5\u09d1\u09d2\b\u00ca\1\2\u09d2\u09d4\3\2\2\2\u09d3\u09b2\3\2\2\2\u09d3"+
		"\u09c3\3\2\2\2\u09d3\u09cc\3\2\2\2\u09d4\u09ec\3\2\2\2\u09d5\u09d6\f\3"+
		"\2\2\u09d6\u09d7\7L\2\2\u09d7\u09db\7L\2\2\u09d8\u09da\7L\2\2\u09d9\u09d8"+
		"\3\2\2\2\u09da\u09dd\3\2\2\2\u09db\u09d9\3\2\2\2\u09db\u09dc\3\2\2\2\u09dc"+
		"\u09de\3\2\2\2\u09dd\u09db\3\2\2\2\u09de\u09df\5\u0192\u00ca\4\u09df\u09e0"+
		"\b\u00ca\1\2\u09e0\u09eb\3\2\2\2\u09e1\u09e2\f\4\2\2\u09e2\u09e6\7L\2"+
		"\2\u09e3\u09e5\7L\2\2\u09e4\u09e3\3\2\2\2\u09e5\u09e8\3\2\2\2\u09e6\u09e4"+
		"\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7\u09e9\3\2\2\2\u09e8\u09e6\3\2\2\2\u09e9"+
		"\u09eb\b\u00ca\1\2\u09ea\u09d5\3\2\2\2\u09ea\u09e1\3\2\2\2\u09eb\u09ee"+
		"\3\2\2\2\u09ec\u09ea\3\2\2\2\u09ec\u09ed\3\2\2\2\u09ed\u0193\3\2\2\2\u09ee"+
		"\u09ec\3\2\2\2\u09ef\u09f0\5<\37\2\u09f0\u09f2\7f\2\2\u09f1\u09f3\5,\27"+
		"\2\u09f2\u09f1\3\2\2\2\u09f2\u09f3\3\2\2\2\u09f3\u09f4\3\2\2\2\u09f4\u09f5"+
		"\7r\2\2\u09f5\u0a1f\3\2\2\2\u09f6\u09f7\5\16\b\2\u09f7\u09f9\7f\2\2\u09f8"+
		"\u09fa\5,\27\2\u09f9\u09f8\3\2\2\2\u09f9\u09fa\3\2\2\2\u09fa\u09fb\3\2"+
		"\2\2\u09fb\u09fc\7r\2\2\u09fc\u0a1f\3\2\2\2\u09fd\u09fe\5\u0164\u00b3"+
		"\2\u09fe\u0a00\7f\2\2\u09ff\u0a01\5,\27\2\u0a00\u09ff\3\2\2\2\u0a00\u0a01"+
		"\3\2\2\2\u0a01\u0a02\3\2\2\2\u0a02\u0a03\7r\2\2\u0a03\u0a1f\3\2\2\2\u0a04"+
		"\u0a05\7\62\2\2\u0a05\u0a07\7f\2\2\u0a06\u0a08\5,\27\2\u0a07\u0a06\3\2"+
		"\2\2\u0a07\u0a08\3\2\2\2\u0a08\u0a09\3\2\2\2\u0a09\u0a1f\7r\2\2\u0a0a"+
		"\u0a0b\58\35\2\u0a0b\u0a0c\7M\2\2\u0a0c\u0a0d\7\62\2\2\u0a0d\u0a0f\7f"+
		"\2\2\u0a0e\u0a10\5,\27\2\u0a0f\u0a0e\3\2\2\2\u0a0f\u0a10\3\2\2\2\u0a10"+
		"\u0a11\3\2\2\2\u0a11\u0a12\7r\2\2\u0a12\u0a1f\3\2\2\2\u0a13\u0a14\5\22"+
		"\n\2\u0a14\u0a16\7f\2\2\u0a15\u0a17\5,\27\2\u0a16\u0a15\3\2\2\2\u0a16"+
		"\u0a17\3\2\2\2\u0a17\u0a18\3\2\2\2\u0a18\u0a19\7)\2\2\u0a19\u0a1f\3\2"+
		"\2\2\u0a1a\u0a1b\5 \21\2\u0a1b\u0a1c\7f\2\2\u0a1c\u0a1d\7)\2\2\u0a1d\u0a1f"+
		"\3\2\2\2\u0a1e\u09ef\3\2\2\2\u0a1e\u09f6\3\2\2\2\u0a1e\u09fd\3\2\2\2\u0a1e"+
		"\u0a04\3\2\2\2\u0a1e\u0a0a\3\2\2\2\u0a1e\u0a13\3\2\2\2\u0a1e\u0a1a\3\2"+
		"\2\2\u0a1f\u0195\3\2\2\2\u0a20\u0a22\7f\2\2\u0a21\u0a23\5,\27\2\u0a22"+
		"\u0a21\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u0a24\3\2\2\2\u0a24\u0a25\7r"+
		"\2\2\u0a25\u0197\3\2\2\2\u0a26\u0a27\5<\37\2\u0a27\u0a29\7f\2\2\u0a28"+
		"\u0a2a\5,\27\2\u0a29\u0a28\3\2\2\2\u0a29\u0a2a\3\2\2\2\u0a2a\u0a2b\3\2"+
		"\2\2\u0a2b\u0a2c\7r\2\2\u0a2c\u0a4f\3\2\2\2\u0a2d\u0a2e\5\16\b\2\u0a2e"+
		"\u0a30\7f\2\2\u0a2f\u0a31\5,\27\2\u0a30\u0a2f\3\2\2\2\u0a30\u0a31\3\2"+
		"\2\2\u0a31\u0a32\3\2\2\2\u0a32\u0a33\7r\2\2\u0a33\u0a4f\3\2\2\2\u0a34"+
		"\u0a35\7\62\2\2\u0a35\u0a37\7f\2\2\u0a36\u0a38\5,\27\2\u0a37\u0a36\3\2"+
		"\2\2\u0a37\u0a38\3\2\2\2\u0a38\u0a39\3\2\2\2\u0a39\u0a4f\7r\2\2\u0a3a"+
		"\u0a3b\58\35\2\u0a3b\u0a3c\7M\2\2\u0a3c\u0a3d\7\62\2\2\u0a3d\u0a3f\7f"+
		"\2\2\u0a3e\u0a40\5,\27\2\u0a3f\u0a3e\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40"+
		"\u0a41\3\2\2\2\u0a41\u0a42\7r\2\2\u0a42\u0a4f\3\2\2\2\u0a43\u0a44\5\22"+
		"\n\2\u0a44\u0a46\7f\2\2\u0a45\u0a47\5,\27\2\u0a46\u0a45\3\2\2\2\u0a46"+
		"\u0a47\3\2\2\2\u0a47\u0a48\3\2\2\2\u0a48\u0a49\7)\2\2\u0a49\u0a4f\3\2"+
		"\2\2\u0a4a\u0a4b\5 \21\2\u0a4b\u0a4c\7f\2\2\u0a4c\u0a4d\7)\2\2\u0a4d\u0a4f"+
		"\3\2\2\2\u0a4e\u0a26\3\2\2\2\u0a4e\u0a2d\3\2\2\2\u0a4e\u0a34\3\2\2\2\u0a4e"+
		"\u0a3a\3\2\2\2\u0a4e\u0a43\3\2\2\2\u0a4e\u0a4a\3\2\2\2\u0a4f\u0199\3\2"+
		"\2\2\u0a50\u0a51\7)\2\2\u0a51\u0a52\5\6\4\2\u0a52\u0a54\5\u019c\u00cf"+
		"\2\u0a53\u0a55\5\"\22\2\u0a54\u0a53\3\2\2\2\u0a54\u0a55\3\2\2\2\u0a55"+
		"\u0a67\3\2\2\2\u0a56\u0a57\7)\2\2\u0a57\u0a58\5\20\t\2\u0a58\u0a5a\5\u019c"+
		"\u00cf\2\u0a59\u0a5b\5\"\22\2\u0a5a\u0a59\3\2\2\2\u0a5a\u0a5b\3\2\2\2"+
		"\u0a5b\u0a67\3\2\2\2\u0a5c\u0a5d\7)\2\2\u0a5d\u0a5e\5\6\4\2\u0a5e\u0a5f"+
		"\5\"\22\2\u0a5f\u0a60\5\u00fc\177\2\u0a60\u0a67\3\2\2\2\u0a61\u0a62\7"+
		")\2\2\u0a62\u0a63\5\20\t\2\u0a63\u0a64\5\"\22\2\u0a64\u0a65\5\u00fc\177"+
		"\2\u0a65\u0a67\3\2\2\2\u0a66\u0a50\3\2\2\2\u0a66\u0a56\3\2\2\2\u0a66\u0a5c"+
		"\3\2\2\2\u0a66\u0a61\3\2\2\2\u0a67\u019b\3\2\2\2\u0a68\u0a6c\5\u019e\u00d0"+
		"\2\u0a69\u0a6b\5\u019e\u00d0\2\u0a6a\u0a69\3\2\2\2\u0a6b\u0a6e\3\2\2\2"+
		"\u0a6c\u0a6a\3\2\2\2\u0a6c\u0a6d\3\2\2\2\u0a6d\u019d\3\2\2\2\u0a6e\u0a6c"+
		"\3\2\2\2\u0a6f\u0a71\5\u00eav\2\u0a70\u0a6f\3\2\2\2\u0a71\u0a74\3\2\2"+
		"\2\u0a72\u0a70\3\2\2\2\u0a72\u0a73\3\2\2\2\u0a73\u0a75\3\2\2\2\u0a74\u0a72"+
		"\3\2\2\2\u0a75\u0a76\7I\2\2\u0a76\u0a77\5\u01a2\u00d2\2\u0a77\u0a78\7"+
		"J\2\2\u0a78\u019f\3\2\2\2\u0a79\u0a7a\5\u01a2\u00d2\2\u0a7a\u01a1\3\2"+
		"\2\2\u0a7b\u0a7c\5\u01ae\u00d8\2\u0a7c\u0a7d\5\u01a4\u00d3\2\u0a7d\u0a8c"+
		"\3\2\2\2\u0a7e\u0a7f\7E\2\2\u0a7f\u0a80\7F\2\2\u0a80\u0a81\5\u01ae\u00d8"+
		"\2\u0a81\u0a82\b\u00d2\1\2\u0a82\u0a8c\3\2\2\2\u0a83\u0a84\7F\2\2\u0a84"+
		"\u0a85\5\u01ae\u00d8\2\u0a85\u0a86\b\u00d2\1\2\u0a86\u0a8c\3\2\2\2\u0a87"+
		"\u0a88\7E\2\2\u0a88\u0a89\5\u01ae\u00d8\2\u0a89\u0a8a\b\u00d2\1\2\u0a8a"+
		"\u0a8c\3\2\2\2\u0a8b\u0a7b\3\2\2\2\u0a8b\u0a7e\3\2\2\2\u0a8b\u0a83\3\2"+
		"\2\2\u0a8b\u0a87\3\2\2\2\u0a8c\u01a3\3\2\2\2\u0a8d\u0a96\3\2\2\2\u0a8e"+
		"\u0a8f\7E\2\2\u0a8f\u0a90\7F\2\2\u0a90\u0a96\b\u00d3\1\2\u0a91\u0a92\7"+
		"F\2\2\u0a92\u0a96\b\u00d3\1\2\u0a93\u0a94\7E\2\2\u0a94\u0a96\b\u00d3\1"+
		"\2\u0a95\u0a8d\3\2\2\2\u0a95\u0a8e\3\2\2\2\u0a95\u0a91\3\2\2\2\u0a95\u0a93"+
		"\3\2\2\2\u0a96\u01a5\3\2\2\2\u0a97\u0a98\5\u01a8\u00d5\2\u0a98\u0a99\7"+
		"e\2\2\u0a99\u0a9a\5\u01ac\u00d7\2\u0a9a\u01a7\3\2\2\2\u0a9b\u0aa6\7r\2"+
		"\2\u0a9c\u0a9e\7E\2\2\u0a9d\u0a9f\5\u009aN\2\u0a9e\u0a9d\3\2\2\2\u0a9e"+
		"\u0a9f\3\2\2\2\u0a9f\u0aa0\3\2\2\2\u0aa0\u0aa6\7F\2\2\u0aa1\u0aa2\7E\2"+
		"\2\u0aa2\u0aa3\5\u01aa\u00d6\2\u0aa3\u0aa4\7F\2\2\u0aa4\u0aa6\3\2\2\2"+
		"\u0aa5\u0a9b\3\2\2\2\u0aa5\u0a9c\3\2\2\2\u0aa5\u0aa1\3\2\2\2\u0aa6\u01a9"+
		"\3\2\2\2\u0aa7\u0aac\7r\2\2\u0aa8\u0aa9\7L\2\2\u0aa9\u0aab\7r\2\2\u0aaa"+
		"\u0aa8\3\2\2\2\u0aab\u0aae\3\2\2\2\u0aac\u0aaa\3\2\2\2\u0aac\u0aad\3\2"+
		"\2\2\u0aad\u01ab\3\2\2\2\u0aae\u0aac\3\2\2\2\u0aaf\u0ab2\5\u01a2\u00d2"+
		"\2\u0ab0\u0ab2\5\u0100\u0081\2\u0ab1\u0aaf\3\2\2\2\u0ab1\u0ab0\3\2\2\2"+
		"\u0ab2\u01ad\3\2\2\2\u0ab3\u0ab4\5\u01b6\u00dc\2\u0ab4\u01af\3\2\2\2\u0ab5"+
		"\u0ab6\5\u01b2\u00da\2\u0ab6\u0ab7\5\u01b4\u00db\2\u0ab7\u0ab8\5\u01a2"+
		"\u00d2\2\u0ab8\u01b1\3\2\2\2\u0ab9\u0abd\5<\37\2\u0aba\u0abd\5\u0180\u00c1"+
		"\2\u0abb\u0abd\5\u0186\u00c4\2\u0abc\u0ab9\3\2\2\2\u0abc\u0aba\3\2\2\2"+
		"\u0abc\u0abb\3\2\2\2\u0abd\u01b3\3\2\2\2\u0abe\u0abf\t\6\2\2\u0abf\u01b5"+
		"\3\2\2\2\u0ac0\u0ac1\5\u01ba\u00de\2\u0ac1\u01b7\3\2\2\2\u0ac2\u0ac6\7"+
		"r\2\2\u0ac3\u0ac6\7A\2\2\u0ac4\u0ac6\5\u01bc\u00df\2\u0ac5\u0ac2\3\2\2"+
		"\2\u0ac5\u0ac3\3\2\2\2\u0ac5\u0ac4\3\2\2\2\u0ac6\u01b9\3\2\2\2\u0ac7\u0ac8"+
		"\b\u00de\1\2\u0ac8\u0ac9\5\u01be\u00e0\2\u0ac9\u0acf\3\2\2\2\u0aca\u0acb"+
		"\f\3\2\2\u0acb\u0acc\7Z\2\2\u0acc\u0ace\5\u01be\u00e0\2\u0acd\u0aca\3"+
		"\2\2\2\u0ace\u0ad1\3\2\2\2\u0acf\u0acd\3\2\2\2\u0acf\u0ad0\3\2\2\2\u0ad0"+
		"\u01bb\3\2\2\2\u0ad1\u0acf\3\2\2\2\u0ad2\u0ad3\b\u00df\1\2\u0ad3\u0ad4"+
		"\5\u01c0\u00e1\2\u0ad4\u0ada\3\2\2\2\u0ad5\u0ad6\f\3\2\2\u0ad6\u0ad7\7"+
		"Z\2\2\u0ad7\u0ad9\5\u01c0\u00e1\2\u0ad8\u0ad5\3\2\2\2\u0ad9\u0adc\3\2"+
		"\2\2\u0ada\u0ad8\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb\u01bd\3\2\2\2\u0adc"+
		"\u0ada\3\2\2\2\u0add\u0ade\b\u00e0\1\2\u0ade\u0adf\5\u01c2\u00e2\2\u0adf"+
		"\u0ae5\3\2\2\2\u0ae0\u0ae1\f\3\2\2\u0ae1\u0ae2\7Y\2\2\u0ae2\u0ae4\5\u01c2"+
		"\u00e2\2\u0ae3\u0ae0\3\2\2\2\u0ae4\u0ae7\3\2\2\2\u0ae5\u0ae3\3\2\2\2\u0ae5"+
		"\u0ae6\3\2\2\2\u0ae6\u01bf\3\2\2\2\u0ae7\u0ae5\3\2\2\2\u0ae8\u0ae9\b\u00e1"+
		"\1\2\u0ae9\u0aea\5\u01ca\u00e6\2\u0aea\u0af0\3\2\2\2\u0aeb\u0aec\f\3\2"+
		"\2\u0aec\u0aed\7Y\2\2\u0aed\u0aef\5\u01ca\u00e6\2\u0aee\u0aeb\3\2\2\2"+
		"\u0aef\u0af2\3\2\2\2\u0af0\u0aee\3\2\2\2\u0af0\u0af1\3\2\2\2\u0af1\u01c1"+
		"\3\2\2\2\u0af2\u0af0\3\2\2\2\u0af3\u0af4\5\u01c4\u00e3\2\u0af4\u01c3\3"+
		"\2\2\2\u0af5\u0af6\5\u01c6\u00e4\2\u0af6\u01c5\3\2\2\2\u0af7\u0af8\5\u01c8"+
		"\u00e5\2\u0af8\u01c7\3\2\2\2\u0af9\u0afa\b\u00e5\1\2\u0afa\u0afb\5\u01cc"+
		"\u00e7\2\u0afb\u0b09\3\2\2\2\u0afc\u0afd\f\5\2\2\u0afd\u0afe\7N\2\2\u0afe"+
		"\u0aff\5\u01cc\u00e7\2\u0aff\u0b00\b\u00e5\1\2\u0b00\u0b08\3\2\2\2\u0b01"+
		"\u0b02\f\4\2\2\u0b02\u0b03\7U\2\2\u0b03\u0b08\5\u01cc\u00e7\2\u0b04\u0b05"+
		"\f\3\2\2\u0b05\u0b06\7X\2\2\u0b06\u0b08\5\u01cc\u00e7\2\u0b07\u0afc\3"+
		"\2\2\2\u0b07\u0b01\3\2\2\2\u0b07\u0b04\3\2\2\2\u0b08\u0b0b\3\2\2\2\u0b09"+
		"\u0b07\3\2\2\2\u0b09\u0b0a\3\2\2\2\u0b0a\u01c9\3\2\2\2\u0b0b\u0b09\3\2"+
		"\2\2\u0b0c\u0b1b\5\u01ce\u00e8\2\u0b0d\u0b0e\5\u01c8\u00e5\2\u0b0e\u0b0f"+
		"\7N\2\2\u0b0f\u0b10\5\u01cc\u00e7\2\u0b10\u0b11\b\u00e6\1\2\u0b11\u0b1b"+
		"\3\2\2\2\u0b12\u0b13\5\u01c8\u00e5\2\u0b13\u0b14\7U\2\2\u0b14\u0b15\5"+
		"\u01cc\u00e7\2\u0b15\u0b1b\3\2\2\2\u0b16\u0b17\5\u01c8\u00e5\2\u0b17\u0b18"+
		"\7X\2\2\u0b18\u0b19\5\u01cc\u00e7\2\u0b19\u0b1b\3\2\2\2\u0b1a\u0b0c\3"+
		"\2\2\2\u0b1a\u0b0d\3\2\2\2\u0b1a\u0b12\3\2\2\2\u0b1a\u0b16\3\2\2\2\u0b1b"+
		"\u01cb\3\2\2\2\u0b1c\u0b1d\b\u00e7\1\2\u0b1d\u0b1e\5\u01d0\u00e9\2\u0b1e"+
		"\u0b2d\3\2\2\2\u0b1f\u0b20\f\6\2\2\u0b20\u0b21\7P\2\2\u0b21\u0b2c\5\u01d0"+
		"\u00e9\2\u0b22\u0b23\f\5\2\2\u0b23\u0b24\7O\2\2\u0b24\u0b2c\5\u01d0\u00e9"+
		"\2\u0b25\u0b26\f\4\2\2\u0b26\u0b27\7V\2\2\u0b27\u0b2c\5\u01d0\u00e9\2"+
		"\u0b28\u0b29\f\3\2\2\u0b29\u0b2a\7W\2\2\u0b2a\u0b2c\5\u01d0\u00e9\2\u0b2b"+
		"\u0b1f\3\2\2\2\u0b2b\u0b22\3\2\2\2\u0b2b\u0b25\3\2\2\2\u0b2b\u0b28\3\2"+
		"\2\2\u0b2c\u0b2f\3\2\2\2\u0b2d\u0b2b\3\2\2\2\u0b2d\u0b2e\3\2\2\2\u0b2e"+
		"\u01cd\3\2\2\2\u0b2f\u0b2d\3\2\2\2\u0b30\u0b31\5\u01cc\u00e7\2\u0b31\u0b32"+
		"\7P\2\2\u0b32\u0b33\5\u01d0\u00e9\2\u0b33\u0b41\3\2\2\2\u0b34\u0b35\5"+
		"\u01cc\u00e7\2\u0b35\u0b36\7O\2\2\u0b36\u0b37\5\u01d0\u00e9\2\u0b37\u0b41"+
		"\3\2\2\2\u0b38\u0b39\5\u01cc\u00e7\2\u0b39\u0b3a\7V\2\2\u0b3a\u0b3b\5"+
		"\u01d0\u00e9\2\u0b3b\u0b41\3\2\2\2\u0b3c\u0b3d\5\u01cc\u00e7\2\u0b3d\u0b3e"+
		"\7W\2\2\u0b3e\u0b3f\5\u01d0\u00e9\2\u0b3f\u0b41\3\2\2\2\u0b40\u0b30\3"+
		"\2\2\2\u0b40\u0b34\3\2\2\2\u0b40\u0b38\3\2\2\2\u0b40\u0b3c\3\2\2\2\u0b41"+
		"\u01cf\3\2\2\2\u0b42\u0b43\5\u01d2\u00ea\2\u0b43\u01d1\3\2\2\2\u0b44\u0b45"+
		"\b\u00ea\1\2\u0b45\u0b46\5\u01d8\u00ed\2\u0b46\u0b4b\3\2\2\2\u0b47\u0b48"+
		"\f\3\2\2\u0b48\u0b4a\5\u01d4\u00eb\2\u0b49\u0b47\3\2\2\2\u0b4a\u0b4d\3"+
		"\2\2\2\u0b4b\u0b49\3\2\2\2\u0b4b\u0b4c\3\2\2\2\u0b4c\u01d3\3\2\2\2\u0b4d"+
		"\u0b4b\3\2\2\2\u0b4e\u0b4f\5\u01dc\u00ef\2\u0b4f\u0b55\5\u01dc\u00ef\2"+
		"\u0b50\u0b54\5\u01dc\u00ef\2\u0b51\u0b54\7[\2\2\u0b52\u0b54\7\\\2\2\u0b53"+
		"\u0b50\3\2\2\2\u0b53\u0b51\3\2\2\2\u0b53\u0b52\3\2\2\2\u0b54\u0b57\3\2"+
		"\2\2\u0b55\u0b53\3\2\2\2\u0b55\u0b56\3\2\2\2\u0b56\u0b58\3\2\2\2\u0b57"+
		"\u0b55\3\2\2\2\u0b58\u0b59\5\u01d8\u00ed\2\u0b59\u0b5a\b\u00eb\1\2\u0b5a"+
		"\u0b7a\3\2\2\2\u0b5b\u0b61\7[\2\2\u0b5c\u0b60\5\u01dc\u00ef\2\u0b5d\u0b60"+
		"\7[\2\2\u0b5e\u0b60\7\\\2\2\u0b5f\u0b5c\3\2\2\2\u0b5f\u0b5d\3\2\2\2\u0b5f"+
		"\u0b5e\3\2\2\2\u0b60\u0b63\3\2\2\2\u0b61\u0b5f\3\2\2\2\u0b61\u0b62\3\2"+
		"\2\2\u0b62\u0b64\3\2\2\2\u0b63\u0b61\3\2\2\2\u0b64\u0b65\5\u01d8\u00ed"+
		"\2\u0b65\u0b66\b\u00eb\1\2\u0b66\u0b7a\3\2\2\2\u0b67\u0b6d\7\\\2\2\u0b68"+
		"\u0b6c\5\u01dc\u00ef\2\u0b69\u0b6c\7[\2\2\u0b6a\u0b6c\7\\\2\2\u0b6b\u0b68"+
		"\3\2\2\2\u0b6b\u0b69\3\2\2\2\u0b6b\u0b6a\3\2\2\2\u0b6c\u0b6f\3\2\2\2\u0b6d"+
		"\u0b6b\3\2\2\2\u0b6d\u0b6e\3\2\2\2\u0b6e\u0b70\3\2\2\2\u0b6f\u0b6d\3\2"+
		"\2\2\u0b70\u0b71\5\u01d8\u00ed\2\u0b71\u0b72\b\u00eb\1\2\u0b72\u0b7a\3"+
		"\2\2\2\u0b73\u0b74\5\u01d6\u00ec\2\u0b74\u0b75\b\u00eb\1\2\u0b75\u0b7a"+
		"\3\2\2\2\u0b76\u0b77\5\u01d6\u00ec\2\u0b77\u0b78\5\u01d8\u00ed\2\u0b78"+
		"\u0b7a\3\2\2\2\u0b79\u0b4e\3\2\2\2\u0b79\u0b5b\3\2\2\2\u0b79\u0b67\3\2"+
		"\2\2\u0b79\u0b73\3\2\2\2\u0b79\u0b76\3\2\2\2\u0b7a\u01d5\3\2\2\2\u0b7b"+
		"\u0b7c\t\7\2\2\u0b7c\u01d7\3\2\2\2\u0b7d\u0b7e\b\u00ed\1\2\u0b7e\u0b7f"+
		"\5\u01e0\u00f1\2\u0b7f\u0b84\3\2\2\2\u0b80\u0b81\f\3\2\2\u0b81\u0b83\5"+
		"\u01da\u00ee\2\u0b82\u0b80\3\2\2\2\u0b83\u0b86\3\2\2\2\u0b84\u0b82\3\2"+
		"\2\2\u0b84\u0b85\3\2\2\2\u0b85\u01d9\3\2\2\2\u0b86\u0b84\3\2\2\2\u0b87"+
		"\u0b88\5\u01dc\u00ef\2\u0b88\u0b8e\5\u01dc\u00ef\2\u0b89\u0b8d\5\u01dc"+
		"\u00ef\2\u0b8a\u0b8d\7[\2\2\u0b8b\u0b8d\7\\\2\2\u0b8c\u0b89\3\2\2\2\u0b8c"+
		"\u0b8a\3\2\2\2\u0b8c\u0b8b\3\2\2\2\u0b8d\u0b90\3\2\2\2\u0b8e\u0b8c\3\2"+
		"\2\2\u0b8e\u0b8f\3\2\2\2\u0b8f\u0b91\3\2\2\2\u0b90\u0b8e\3\2\2\2\u0b91"+
		"\u0b92\5\u01e0\u00f1\2\u0b92\u0b93\b\u00ee\1\2\u0b93\u0b9b\3\2\2\2\u0b94"+
		"\u0b95\5\u01de\u00f0\2\u0b95\u0b96\b\u00ee\1\2\u0b96\u0b9b\3\2\2\2\u0b97"+
		"\u0b98\5\u01de\u00f0\2\u0b98\u0b99\5\u01e0\u00f1\2\u0b99\u0b9b\3\2\2\2"+
		"\u0b9a\u0b87\3\2\2\2\u0b9a\u0b94\3\2\2\2\u0b9a\u0b97\3\2\2\2\u0b9b\u01db"+
		"\3\2\2\2\u0b9c\u0b9d\t\b\2\2\u0b9d\u01dd\3\2\2\2\u0b9e\u0b9f\t\t\2\2\u0b9f"+
		"\u01df\3\2\2\2\u0ba0\u0ba1\5\u01e6\u00f4\2\u0ba1\u01e1\3\2\2\2\u0ba2\u0ba3"+
		"\7[\2\2\u0ba3\u0ba4\5\u01e0\u00f1\2\u0ba4\u01e3\3\2\2\2\u0ba5\u0ba6\7"+
		"\\\2\2\u0ba6\u0ba7\5\u01e0\u00f1\2\u0ba7\u01e5\3\2\2\2\u0ba8\u0bac\5\u01ea"+
		"\u00f6\2\u0ba9\u0baa\7Q\2\2\u0baa\u0bac\5\u01e0\u00f1\2\u0bab\u0ba8\3"+
		"\2\2\2\u0bab\u0ba9\3\2\2\2\u0bac\u01e7\3\2\2\2\u0bad\u0bb7\5\u0164\u00b3"+
		"\2\u0bae\u0bb3\5<\37\2\u0baf\u0bb2\5\u01ee\u00f8\2\u0bb0\u0bb2\5\u01f2"+
		"\u00fa\2\u0bb1\u0baf\3\2\2\2\u0bb1\u0bb0\3\2\2\2\u0bb2\u0bb5\3\2\2\2\u0bb3"+
		"\u0bb1\3\2\2\2\u0bb3\u0bb4\3\2\2\2\u0bb4\u0bb7\3\2\2\2\u0bb5\u0bb3\3\2"+
		"\2\2\u0bb6\u0bad\3\2\2\2\u0bb6\u0bae\3\2\2\2\u0bb7\u01e9\3\2\2\2\u0bb8"+
		"\u0bbb\5\u0164\u00b3\2\u0bb9\u0bbb\5<\37\2\u0bba\u0bb8\3\2\2\2\u0bba\u0bb9"+
		"\3\2\2\2\u0bbb\u01eb\3\2\2\2\u0bbc\u0bbd\5\u01ea\u00f6\2\u0bbd\u0bbe\7"+
		"[\2\2\u0bbe\u01ed\3\2\2\2\u0bbf\u0bc0\7[\2\2\u0bc0\u01ef\3\2\2\2\u0bc1"+
		"\u0bc2\5\u01ea\u00f6\2\u0bc2\u0bc3\7\\\2\2\u0bc3\u01f1\3\2\2\2\u0bc4\u0bc5"+
		"\7\\\2\2\u0bc5\u01f3\3\2\2\2\u0bc6\u0bc7\7E\2\2\u0bc7\u0bc8\5\6\4\2\u0bc8"+
		"\u0bc9\7F\2\2\u0bc9\u0bca\5\u01e0\u00f1\2\u0bca\u0be2\3\2\2\2\u0bcb\u0bcc"+
		"\7E\2\2\u0bcc\u0bd0\5\16\b\2\u0bcd\u0bcf\5*\26\2\u0bce\u0bcd\3\2\2\2\u0bcf"+
		"\u0bd2\3\2\2\2\u0bd0\u0bce\3\2\2\2\u0bd0\u0bd1\3\2\2\2\u0bd1\u0bd3\3\2"+
		"\2\2\u0bd2\u0bd0\3\2\2\2\u0bd3\u0bd4\7F\2\2\u0bd4\u0bd5\5\u01e6\u00f4"+
		"\2\u0bd5\u0be2\3\2\2\2\u0bd6\u0bd7\7E\2\2\u0bd7\u0bdb\5\16\b\2\u0bd8\u0bda"+
		"\5*\26\2\u0bd9\u0bd8\3\2\2\2\u0bda\u0bdd\3\2\2\2\u0bdb\u0bd9\3\2\2\2\u0bdb"+
		"\u0bdc\3\2\2\2\u0bdc\u0bde\3\2\2\2\u0bdd\u0bdb\3\2\2\2\u0bde\u0bdf\7F"+
		"\2\2\u0bdf\u0be0\5\u01a6\u00d4\2\u0be0\u0be2\3\2\2\2\u0be1\u0bc6\3\2\2"+
		"\2\u0be1\u0bcb\3\2\2\2\u0be1\u0bd6\3\2\2\2\u0be2\u01f5\3\2\2\2\u0150\u01fa"+
		"\u01ff\u0206\u020a\u020e\u0217\u021b\u021f\u0221\u0227\u022c\u0233\u0238"+
		"\u023a\u0240\u0245\u024a\u024f\u025a\u0268\u0270\u0276\u027b\u0286\u0289"+
		"\u0297\u029c\u02a1\u02a6\u02ac\u02b6\u02be\u02c8\u02d0\u02dc\u02e2\u02e9"+
		"\u02f6\u02ff\u030a\u0327\u032b\u0330\u0336\u0339\u033c\u0348\u0353\u0361"+
		"\u0368\u0374\u0383\u038a\u0390\u0395\u0399\u039f\u03a6\u03ab\u03af\u03b3"+
		"\u03b5\u03ba\u03c1\u03c6\u03c8\u03ce\u03d3\u03d7\u03ea\u0400\u040c\u0411"+
		"\u0417\u041d\u041f\u0423\u0428\u042e\u0433\u0437\u0441\u0449\u044c\u0455"+
		"\u045c\u0464\u046f\u0473\u0475\u0481\u0485\u048a\u0491\u0498\u049d\u04a3"+
		"\u04af\u04b4\u04b8\u04c2\u04c7\u04cf\u04d2\u04d7\u04df\u04e2\u04e7\u04ec"+
		"\u04f1\u04f6\u04fd\u0502\u050a\u050f\u0514\u0519\u051f\u0525\u0528\u052b"+
		"\u0534\u053a\u0540\u0543\u0546\u054e\u0553\u0558\u055e\u0561\u056c\u0575"+
		"\u057f\u0584\u058f\u0594\u05a0\u05a5\u05b1\u05bb\u05c0\u05c8\u05cb\u05d2"+
		"\u05da\u05e0\u05e9\u05f3\u05f7\u05fa\u0603\u061a\u061f\u0627\u062c\u0632"+
		"\u0636\u063d\u0642\u0648\u064f\u065a\u0671\u067a\u067d\u0687\u068a\u0693"+
		"\u0697\u069b\u069d\u06a2\u06a8\u06b2\u06c9\u06cf\u06eb\u06f7\u06fd\u0709"+
		"\u0712\u0728\u072f\u074d\u0753\u076b\u0772\u0776\u0779\u077f\u0784\u078e"+
		"\u07a3\u07a8\u07ae\u07ba\u07c5\u07cf\u07d2\u07d7\u07e0\u07e6\u07f6\u080d"+
		"\u0817\u082d\u0834\u083c\u0845\u084f\u085a\u0870\u0874\u0879\u0881\u0887"+
		"\u088b\u088f\u0893\u0899\u089e\u08a3\u08a7\u08ab\u08b1\u08b6\u08bb\u08bf"+
		"\u08c3\u08c5\u08ca\u08cf\u08d4\u08d8\u08dc\u08e0\u08e5\u08ed\u08f3\u08f7"+
		"\u08fb\u08ff\u0905\u090a\u090f\u0913\u0917\u0919\u091e\u092d\u093b\u0947"+
		"\u0950\u095e\u0969\u096e\u0976\u097c\u0984\u0988\u098c\u0991\u0998\u099f"+
		"\u09a4\u09ac\u09b0\u09b8\u09c0\u09c3\u09cc\u09d3\u09db\u09e6\u09ea\u09ec"+
		"\u09f2\u09f9\u0a00\u0a07\u0a0f\u0a16\u0a1e\u0a22\u0a29\u0a30\u0a37\u0a3f"+
		"\u0a46\u0a4e\u0a54\u0a5a\u0a66\u0a6c\u0a72\u0a8b\u0a95\u0a9e\u0aa5\u0aac"+
		"\u0ab1\u0abc\u0ac5\u0acf\u0ada\u0ae5\u0af0\u0b07\u0b09\u0b1a\u0b2b\u0b2d"+
		"\u0b40\u0b4b\u0b53\u0b55\u0b5f\u0b61\u0b6b\u0b6d\u0b79\u0b84\u0b8c\u0b8e"+
		"\u0b9a\u0bab\u0bb1\u0bb3\u0bb6\u0bba\u0bd0\u0bdb\u0be1";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}