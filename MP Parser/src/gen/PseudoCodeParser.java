package gen;// Generated from C:/Users/ShyreneChing/Desktop/DLSU/AY 2020-2021 Term 1/CMPILER/MP/MC01/MP Parser/MP Parser/src\PseudoCode.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudoCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, CharacterLiteral=2, FloatingLiteral=3, StringLiteral=4, 
		BooleanLiteral=5, PointerLiteral=6, UserDefinedLiteral=7, MultiLineMacro=8, 
		Directive=9, Alignas=10, Alignof=11, Asm=12, Auto=13, Bool=14, Break=15, 
		Case=16, Catch=17, Char=18, Char16=19, Char32=20, Class=21, Const=22, 
		Constexpr=23, Const_cast=24, Continue=25, Decltype=26, Default=27, Delete=28, 
		Do=29, Double=30, Dynamic_cast=31, Else=32, Enum=33, Explicit=34, Export=35, 
		Extern=36, False_=37, Final=38, Float=39, For=40, Friend=41, Goto=42, 
		If=43, Inline=44, Int=45, Long=46, Mutable=47, Namespace=48, New=49, Noexcept=50, 
		Nullptr=51, Operator=52, Override=53, Private=54, Protected=55, Public=56, 
		Register=57, Reinterpret_cast=58, Return=59, Short=60, Signed=61, Sizeof=62, 
		Static=63, Static_assert=64, Static_cast=65, Struct=66, Switch=67, Template=68, 
		This=69, Thread_local=70, Throw=71, True_=72, Try=73, Typedef=74, Typeid_=75, 
		Typename_=76, Union=77, Unsigned=78, Using=79, Virtual=80, Void=81, Volatile=82, 
		Wchar=83, While=84, LeftParen=85, RightParen=86, LeftBracket=87, RightBracket=88, 
		LeftBrace=89, RightBrace=90, Plus=91, Minus=92, Star=93, Div=94, Mod=95, 
		Caret=96, And=97, Or=98, Tilde=99, Not=100, Assign=101, Less=102, Greater=103, 
		PlusAssign=104, MinusAssign=105, StarAssign=106, DivAssign=107, ModAssign=108, 
		XorAssign=109, AndAssign=110, OrAssign=111, LeftShiftAssign=112, RightShiftAssign=113, 
		Equal=114, NotEqual=115, LessEqual=116, GreaterEqual=117, AndAnd=118, 
		OrOr=119, PlusPlus=120, MinusMinus=121, Comma=122, ArrowStar=123, Arrow=124, 
		Question=125, Colon=126, Doublecolon=127, Semi=128, Dot=129, DotStar=130, 
		Ellipsis=131, Identifier=132, DecimalLiteral=133, OctalLiteral=134, HexadecimalLiteral=135, 
		BinaryLiteral=136, Integersuffix=137, UserDefinedIntegerLiteral=138, UserDefinedFloatingLiteral=139, 
		UserDefinedStringLiteral=140, UserDefinedCharacterLiteral=141, Whitespace=142, 
		Newline=143, BlockComment=144, LineComment=145;
	public static final int
		RULE_translationUnit = 0, RULE_primaryExpression = 1, RULE_idExpression = 2, 
		RULE_unqualifiedId = 3, RULE_qualifiedId = 4, RULE_nestedNameSpecifier = 5, 
		RULE_lambdaExpression = 6, RULE_lambdaIntroducer = 7, RULE_lambdaCapture = 8, 
		RULE_captureDefault = 9, RULE_captureList = 10, RULE_capture = 11, RULE_simpleCapture = 12, 
		RULE_initcapture = 13, RULE_lambdaDeclarator = 14, RULE_postfixExpression = 15, 
		RULE_typeIdOfTheTypeId = 16, RULE_expressionList = 17, RULE_pseudoDestructorName = 18, 
		RULE_unaryExpression = 19, RULE_unaryOperator = 20, RULE_newExpression = 21, 
		RULE_newPlacement = 22, RULE_newTypeId = 23, RULE_newDeclarator = 24, 
		RULE_noPointerNewDeclarator = 25, RULE_newInitializer = 26, RULE_deleteExpression = 27, 
		RULE_noExceptExpression = 28, RULE_castExpression = 29, RULE_pointerMemberExpression = 30, 
		RULE_multiplicativeExpression = 31, RULE_additiveExpression = 32, RULE_shiftExpression = 33, 
		RULE_shiftOperator = 34, RULE_relationalExpression = 35, RULE_equalityExpression = 36, 
		RULE_andExpression = 37, RULE_exclusiveOrExpression = 38, RULE_inclusiveOrExpression = 39, 
		RULE_logicalAndExpression = 40, RULE_logicalOrExpression = 41, RULE_conditionalExpression = 42, 
		RULE_assignmentExpression = 43, RULE_assignmentOperator = 44, RULE_expression = 45, 
		RULE_constantExpression = 46, RULE_statement = 47, RULE_labeledStatement = 48, 
		RULE_expressionStatement = 49, RULE_compoundStatement = 50, RULE_statementSeq = 51, 
		RULE_methodName = 52, RULE_selectionStatement = 53, RULE_condition = 54, 
		RULE_iterationStatement = 55, RULE_forInitStatement = 56, RULE_forRangeDeclaration = 57, 
		RULE_forRangeInitializer = 58, RULE_jumpStatement = 59, RULE_declarationStatement = 60, 
		RULE_declarationseq = 61, RULE_declaration = 62, RULE_blockDeclaration = 63, 
		RULE_aliasDeclaration = 64, RULE_simpleDeclaration = 65, RULE_staticAssertDeclaration = 66, 
		RULE_emptyDeclaration = 67, RULE_attributeDeclaration = 68, RULE_declSpecifier = 69, 
		RULE_declSpecifierSeq = 70, RULE_storageClassSpecifier = 71, RULE_functionSpecifier = 72, 
		RULE_typedefName = 73, RULE_typeSpecifier = 74, RULE_trailingTypeSpecifier = 75, 
		RULE_typeSpecifierSeq = 76, RULE_trailingTypeSpecifierSeq = 77, RULE_simpleTypeSpecifier = 78, 
		RULE_theTypeName = 79, RULE_decltypeSpecifier = 80, RULE_elaboratedTypeSpecifier = 81, 
		RULE_enumName = 82, RULE_enumSpecifier = 83, RULE_enumHead = 84, RULE_opaqueEnumDeclaration = 85, 
		RULE_enumkey = 86, RULE_enumbase = 87, RULE_enumeratorList = 88, RULE_enumeratorDefinition = 89, 
		RULE_enumerator = 90, RULE_namespaceName = 91, RULE_originalNamespaceName = 92, 
		RULE_namespaceDefinition = 93, RULE_namespaceAlias = 94, RULE_namespaceAliasDefinition = 95, 
		RULE_qualifiednamespacespecifier = 96, RULE_usingDeclaration = 97, RULE_usingDirective = 98, 
		RULE_asmDefinition = 99, RULE_linkageSpecification = 100, RULE_attributeSpecifierSeq = 101, 
		RULE_attributeSpecifier = 102, RULE_alignmentspecifier = 103, RULE_attributeList = 104, 
		RULE_attribute = 105, RULE_attributeNamespace = 106, RULE_attributeArgumentClause = 107, 
		RULE_balancedTokenSeq = 108, RULE_balancedtoken = 109, RULE_initDeclaratorList = 110, 
		RULE_initDeclarator = 111, RULE_declarator = 112, RULE_pointerDeclarator = 113, 
		RULE_noPointerDeclarator = 114, RULE_parametersAndQualifiers = 115, RULE_trailingReturnType = 116, 
		RULE_pointerOperator = 117, RULE_cvqualifierseq = 118, RULE_cvQualifier = 119, 
		RULE_refqualifier = 120, RULE_declaratorid = 121, RULE_theTypeId = 122, 
		RULE_abstractDeclarator = 123, RULE_pointerAbstractDeclarator = 124, RULE_noPointerAbstractDeclarator = 125, 
		RULE_abstractPackDeclarator = 126, RULE_noPointerAbstractPackDeclarator = 127, 
		RULE_parameterDeclarationClause = 128, RULE_parameterDeclarationList = 129, 
		RULE_parameterDeclaration = 130, RULE_functionDefinition = 131, RULE_functionBody = 132, 
		RULE_initializer = 133, RULE_braceOrEqualInitializer = 134, RULE_initializerClause = 135, 
		RULE_initializerList = 136, RULE_bracedInitList = 137, RULE_className = 138, 
		RULE_classSpecifier = 139, RULE_classHead = 140, RULE_classHeadName = 141, 
		RULE_classVirtSpecifier = 142, RULE_classKey = 143, RULE_memberSpecification = 144, 
		RULE_memberdeclaration = 145, RULE_memberDeclaratorList = 146, RULE_memberDeclarator = 147, 
		RULE_virtualSpecifierSeq = 148, RULE_virtualSpecifier = 149, RULE_pureSpecifier = 150, 
		RULE_baseClause = 151, RULE_baseSpecifierList = 152, RULE_baseSpecifier = 153, 
		RULE_classOrDeclType = 154, RULE_baseTypeSpecifier = 155, RULE_accessSpecifier = 156, 
		RULE_conversionFunctionId = 157, RULE_conversionTypeId = 158, RULE_conversionDeclarator = 159, 
		RULE_constructorInitializer = 160, RULE_memInitializerList = 161, RULE_memInitializer = 162, 
		RULE_meminitializerid = 163, RULE_operatorFunctionId = 164, RULE_literalOperatorId = 165, 
		RULE_templateDeclaration = 166, RULE_templateparameterList = 167, RULE_templateParameter = 168, 
		RULE_typeParameter = 169, RULE_simpleTemplateId = 170, RULE_templateId = 171, 
		RULE_templateName = 172, RULE_templateArgumentList = 173, RULE_templateArgument = 174, 
		RULE_typeNameSpecifier = 175, RULE_explicitInstantiation = 176, RULE_explicitSpecialization = 177, 
		RULE_tryBlock = 178, RULE_functionTryBlock = 179, RULE_handlerSeq = 180, 
		RULE_handler = 181, RULE_exceptionDeclaration = 182, RULE_throwExpression = 183, 
		RULE_exceptionSpecification = 184, RULE_dynamicExceptionSpecification = 185, 
		RULE_typeIdList = 186, RULE_noeExceptSpecification = 187, RULE_theOperator = 188, 
		RULE_literal = 189;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "primaryExpression", "idExpression", "unqualifiedId", 
			"qualifiedId", "nestedNameSpecifier", "lambdaExpression", "lambdaIntroducer", 
			"lambdaCapture", "captureDefault", "captureList", "capture", "simpleCapture", 
			"initcapture", "lambdaDeclarator", "postfixExpression", "typeIdOfTheTypeId", 
			"expressionList", "pseudoDestructorName", "unaryExpression", "unaryOperator", 
			"newExpression", "newPlacement", "newTypeId", "newDeclarator", "noPointerNewDeclarator", 
			"newInitializer", "deleteExpression", "noExceptExpression", "castExpression", 
			"pointerMemberExpression", "multiplicativeExpression", "additiveExpression", 
			"shiftExpression", "shiftOperator", "relationalExpression", "equalityExpression", 
			"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
			"logicalOrExpression", "conditionalExpression", "assignmentExpression", 
			"assignmentOperator", "expression", "constantExpression", "statement", 
			"labeledStatement", "expressionStatement", "compoundStatement", "statementSeq", 
			"methodName", "selectionStatement", "condition", "iterationStatement", 
			"forInitStatement", "forRangeDeclaration", "forRangeInitializer", "jumpStatement", 
			"declarationStatement", "declarationseq", "declaration", "blockDeclaration", 
			"aliasDeclaration", "simpleDeclaration", "staticAssertDeclaration", "emptyDeclaration", 
			"attributeDeclaration", "declSpecifier", "declSpecifierSeq", "storageClassSpecifier", 
			"functionSpecifier", "typedefName", "typeSpecifier", "trailingTypeSpecifier", 
			"typeSpecifierSeq", "trailingTypeSpecifierSeq", "simpleTypeSpecifier", 
			"theTypeName", "decltypeSpecifier", "elaboratedTypeSpecifier", "enumName", 
			"enumSpecifier", "enumHead", "opaqueEnumDeclaration", "enumkey", "enumbase", 
			"enumeratorList", "enumeratorDefinition", "enumerator", "namespaceName", 
			"originalNamespaceName", "namespaceDefinition", "namespaceAlias", "namespaceAliasDefinition", 
			"qualifiednamespacespecifier", "usingDeclaration", "usingDirective", 
			"asmDefinition", "linkageSpecification", "attributeSpecifierSeq", "attributeSpecifier", 
			"alignmentspecifier", "attributeList", "attribute", "attributeNamespace", 
			"attributeArgumentClause", "balancedTokenSeq", "balancedtoken", "initDeclaratorList", 
			"initDeclarator", "declarator", "pointerDeclarator", "noPointerDeclarator", 
			"parametersAndQualifiers", "trailingReturnType", "pointerOperator", "cvqualifierseq", 
			"cvQualifier", "refqualifier", "declaratorid", "theTypeId", "abstractDeclarator", 
			"pointerAbstractDeclarator", "noPointerAbstractDeclarator", "abstractPackDeclarator", 
			"noPointerAbstractPackDeclarator", "parameterDeclarationClause", "parameterDeclarationList", 
			"parameterDeclaration", "functionDefinition", "functionBody", "initializer", 
			"braceOrEqualInitializer", "initializerClause", "initializerList", "bracedInitList", 
			"className", "classSpecifier", "classHead", "classHeadName", "classVirtSpecifier", 
			"classKey", "memberSpecification", "memberdeclaration", "memberDeclaratorList", 
			"memberDeclarator", "virtualSpecifierSeq", "virtualSpecifier", "pureSpecifier", 
			"baseClause", "baseSpecifierList", "baseSpecifier", "classOrDeclType", 
			"baseTypeSpecifier", "accessSpecifier", "conversionFunctionId", "conversionTypeId", 
			"conversionDeclarator", "constructorInitializer", "memInitializerList", 
			"memInitializer", "meminitializerid", "operatorFunctionId", "literalOperatorId", 
			"templateDeclaration", "templateparameterList", "templateParameter", 
			"typeParameter", "simpleTemplateId", "templateId", "templateName", "templateArgumentList", 
			"templateArgument", "typeNameSpecifier", "explicitInstantiation", "explicitSpecialization", 
			"tryBlock", "functionTryBlock", "handlerSeq", "handler", "exceptionDeclaration", 
			"throwExpression", "exceptionSpecification", "dynamicExceptionSpecification", 
			"typeIdList", "noeExceptSpecification", "theOperator", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'alignas'", 
			"'alignof'", "'asm'", "'auto'", "'bool'", "'break'", "'case'", "'catch'", 
			"'char'", "'char16_t'", "'char32_t'", "'class'", "'const'", "'constexpr'", 
			"'const_cast'", "'continue'", "'decltype'", "'default'", "'delete'", 
			"'do'", "'double'", "'dynamic_cast'", "'else'", "'enum'", "'explicit'", 
			"'export'", "'extern'", "'false'", "'final'", "'float'", "'for'", "'friend'", 
			"'goto'", "'if'", "'inline'", "'int'", "'long'", "'mutable'", "'namespace'", 
			"'new'", "'noexcept'", "'nullptr'", "'operator'", "'override'", "'private'", 
			"'protected'", "'public'", "'register'", "'reinterpret_cast'", "'return'", 
			"'short'", "'signed'", "'sizeof'", "'static'", "'static_assert'", "'static_cast'", 
			"'struct'", "'switch'", "'template'", "'this'", "'thread_local'", "'throw'", 
			"'true'", "'try'", "'typedef'", "'typeid'", "'typename'", "'union'", 
			"'unsigned'", "'using'", "'virtual'", "'void'", "'volatile'", "'wchar_t'", 
			"'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'^'", "'&'", "'|'", "'~'", null, "'='", "'<'", "'>'", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<='", 
			"'>>='", "'=='", "'!='", "'<='", "'>='", null, null, "'++'", "'--'", 
			"','", "'->*'", "'->'", "'?'", "':'", "'::'", "';'", "'.'", "'.*'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "CharacterLiteral", "FloatingLiteral", "StringLiteral", 
			"BooleanLiteral", "PointerLiteral", "UserDefinedLiteral", "MultiLineMacro", 
			"Directive", "Alignas", "Alignof", "Asm", "Auto", "Bool", "Break", "Case", 
			"Catch", "Char", "Char16", "Char32", "Class", "Const", "Constexpr", "Const_cast", 
			"Continue", "Decltype", "Default", "Delete", "Do", "Double", "Dynamic_cast", 
			"Else", "Enum", "Explicit", "Export", "Extern", "False_", "Final", "Float", 
			"For", "Friend", "Goto", "If", "Inline", "Int", "Long", "Mutable", "Namespace", 
			"New", "Noexcept", "Nullptr", "Operator", "Override", "Private", "Protected", 
			"Public", "Register", "Reinterpret_cast", "Return", "Short", "Signed", 
			"Sizeof", "Static", "Static_assert", "Static_cast", "Struct", "Switch", 
			"Template", "This", "Thread_local", "Throw", "True_", "Try", "Typedef", 
			"Typeid_", "Typename_", "Union", "Unsigned", "Using", "Virtual", "Void", 
			"Volatile", "Wchar", "While", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Plus", "Minus", "Star", "Div", 
			"Mod", "Caret", "And", "Or", "Tilde", "Not", "Assign", "Less", "Greater", 
			"PlusAssign", "MinusAssign", "StarAssign", "DivAssign", "ModAssign", 
			"XorAssign", "AndAssign", "OrAssign", "LeftShiftAssign", "RightShiftAssign", 
			"Equal", "NotEqual", "LessEqual", "GreaterEqual", "AndAnd", "OrOr", "PlusPlus", 
			"MinusMinus", "Comma", "ArrowStar", "Arrow", "Question", "Colon", "Doublecolon", 
			"Semi", "Dot", "DotStar", "Ellipsis", "Identifier", "DecimalLiteral", 
			"OctalLiteral", "HexadecimalLiteral", "BinaryLiteral", "Integersuffix", 
			"UserDefinedIntegerLiteral", "UserDefinedFloatingLiteral", "UserDefinedStringLiteral", 
			"UserDefinedCharacterLiteral", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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

	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PseudoCodeParser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Asm - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Namespace - 10)) | (1L << (Operator - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(380);
				declarationseq();
				}
			}

			setState(383);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode This() { return getToken(PseudoCodeParser.This, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryExpression);
		try {
			int _alt;
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case PointerLiteral:
			case UserDefinedLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(386); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(385);
						literal();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(388); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				match(LeftParen);
				setState(392);
				expression();
				setState(393);
				match(RightParen);
				}
				break;
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				idExpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(396);
				lambdaExpression();
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

	public static class IdExpressionContext extends ParserRuleContext {
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public IdExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterIdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitIdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitIdExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdExpressionContext idExpression() throws RecognitionException {
		IdExpressionContext _localctx = new IdExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idExpression);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				unqualifiedId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				qualifiedId();
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

	public static class UnqualifiedIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public OperatorFunctionIdContext operatorFunctionId() {
			return getRuleContext(OperatorFunctionIdContext.class,0);
		}
		public ConversionFunctionIdContext conversionFunctionId() {
			return getRuleContext(ConversionFunctionIdContext.class,0);
		}
		public LiteralOperatorIdContext literalOperatorId() {
			return getRuleContext(LiteralOperatorIdContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(PseudoCodeParser.Tilde, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public TemplateIdContext templateId() {
			return getRuleContext(TemplateIdContext.class,0);
		}
		public UnqualifiedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnqualifiedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnqualifiedId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnqualifiedId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedIdContext unqualifiedId() throws RecognitionException {
		UnqualifiedIdContext _localctx = new UnqualifiedIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unqualifiedId);
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				operatorFunctionId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				conversionFunctionId();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				literalOperatorId();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(407);
				match(Tilde);
				setState(410);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(408);
					className();
					}
					break;
				case Decltype:
					{
					setState(409);
					decltypeSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(412);
				templateId();
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

	public static class QualifiedIdContext extends ParserRuleContext {
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoCodeParser.Template, 0); }
		public QualifiedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterQualifiedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitQualifiedId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitQualifiedId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdContext qualifiedId() throws RecognitionException {
		QualifiedIdContext _localctx = new QualifiedIdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_qualifiedId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			nestedNameSpecifier(0);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(416);
				match(Template);
				}
			}

			setState(419);
			unqualifiedId();
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

	public static class NestedNameSpecifierContext extends ParserRuleContext {
		public TerminalNode Doublecolon() { return getToken(PseudoCodeParser.Doublecolon, 0); }
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoCodeParser.Template, 0); }
		public NestedNameSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedNameSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNestedNameSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNestedNameSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNestedNameSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedNameSpecifierContext nestedNameSpecifier() throws RecognitionException {
		return nestedNameSpecifier(0);
	}

	private NestedNameSpecifierContext nestedNameSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NestedNameSpecifierContext _localctx = new NestedNameSpecifierContext(_ctx, _parentState);
		NestedNameSpecifierContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_nestedNameSpecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(422);
				theTypeName();
				}
				break;
			case 2:
				{
				setState(423);
				namespaceName();
				}
				break;
			case 3:
				{
				setState(424);
				decltypeSpecifier();
				}
				break;
			}
			setState(427);
			match(Doublecolon);
			}
			_ctx.stop = _input.LT(-1);
			setState(440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NestedNameSpecifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_nestedNameSpecifier);
					setState(429);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(435);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(430);
						match(Identifier);
						}
						break;
					case 2:
						{
						setState(432);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(431);
							match(Template);
							}
						}

						setState(434);
						simpleTemplateId();
						}
						break;
					}
					setState(437);
					match(Doublecolon);
					}
					} 
				}
				setState(442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaIntroducerContext lambdaIntroducer() {
			return getRuleContext(LambdaIntroducerContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public LambdaDeclaratorContext lambdaDeclarator() {
			return getRuleContext(LambdaDeclaratorContext.class,0);
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
		enterRule(_localctx, 12, RULE_lambdaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			lambdaIntroducer();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(444);
				lambdaDeclarator();
				}
			}

			setState(447);
			compoundStatement();
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

	public static class LambdaIntroducerContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(PseudoCodeParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoCodeParser.RightBracket, 0); }
		public LambdaCaptureContext lambdaCapture() {
			return getRuleContext(LambdaCaptureContext.class,0);
		}
		public LambdaIntroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaIntroducer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLambdaIntroducer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLambdaIntroducer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLambdaIntroducer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaIntroducerContext lambdaIntroducer() throws RecognitionException {
		LambdaIntroducerContext _localctx = new LambdaIntroducerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaIntroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(LeftBracket);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (This - 69)) | (1L << (And - 69)) | (1L << (Assign - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(450);
				lambdaCapture();
				}
			}

			setState(453);
			match(RightBracket);
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

	public static class LambdaCaptureContext extends ParserRuleContext {
		public CaptureListContext captureList() {
			return getRuleContext(CaptureListContext.class,0);
		}
		public CaptureDefaultContext captureDefault() {
			return getRuleContext(CaptureDefaultContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PseudoCodeParser.Comma, 0); }
		public LambdaCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaCapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLambdaCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLambdaCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLambdaCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaCaptureContext lambdaCapture() throws RecognitionException {
		LambdaCaptureContext _localctx = new LambdaCaptureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdaCapture);
		int _la;
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				captureList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				captureDefault();
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(457);
					match(Comma);
					setState(458);
					captureList();
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

	public static class CaptureDefaultContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(PseudoCodeParser.And, 0); }
		public TerminalNode Assign() { return getToken(PseudoCodeParser.Assign, 0); }
		public CaptureDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterCaptureDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitCaptureDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitCaptureDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureDefaultContext captureDefault() throws RecognitionException {
		CaptureDefaultContext _localctx = new CaptureDefaultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_captureDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Assign) ) {
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

	public static class CaptureListContext extends ParserRuleContext {
		public List<CaptureContext> capture() {
			return getRuleContexts(CaptureContext.class);
		}
		public CaptureContext capture(int i) {
			return getRuleContext(CaptureContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoCodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoCodeParser.Comma, i);
		}
		public TerminalNode Ellipsis() { return getToken(PseudoCodeParser.Ellipsis, 0); }
		public CaptureListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterCaptureList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitCaptureList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitCaptureList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureListContext captureList() throws RecognitionException {
		CaptureListContext _localctx = new CaptureListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_captureList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			capture();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(466);
				match(Comma);
				setState(467);
				capture();
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(473);
				match(Ellipsis);
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

	public static class CaptureContext extends ParserRuleContext {
		public SimpleCaptureContext simpleCapture() {
			return getRuleContext(SimpleCaptureContext.class,0);
		}
		public InitcaptureContext initcapture() {
			return getRuleContext(InitcaptureContext.class,0);
		}
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_capture);
		try {
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				simpleCapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				initcapture();
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

	public static class SimpleCaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode And() { return getToken(PseudoCodeParser.And, 0); }
		public TerminalNode This() { return getToken(PseudoCodeParser.This, 0); }
		public SimpleCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSimpleCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSimpleCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSimpleCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCaptureContext simpleCapture() throws RecognitionException {
		SimpleCaptureContext _localctx = new SimpleCaptureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleCapture);
		int _la;
		try {
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(480);
					match(And);
					}
				}

				setState(483);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(This);
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

	public static class InitcaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode And() { return getToken(PseudoCodeParser.And, 0); }
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInitcapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInitcapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInitcapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitcaptureContext initcapture() throws RecognitionException {
		InitcaptureContext _localctx = new InitcaptureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initcapture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(487);
				match(And);
				}
			}

			setState(490);
			match(Identifier);
			setState(491);
			initializer();
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

	public static class LambdaDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public ParameterDeclarationClauseContext parameterDeclarationClause() {
			return getRuleContext(ParameterDeclarationClauseContext.class,0);
		}
		public TerminalNode Mutable() { return getToken(PseudoCodeParser.Mutable, 0); }
		public ExceptionSpecificationContext exceptionSpecification() {
			return getRuleContext(ExceptionSpecificationContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TrailingReturnTypeContext trailingReturnType() {
			return getRuleContext(TrailingReturnTypeContext.class,0);
		}
		public LambdaDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLambdaDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLambdaDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLambdaDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaDeclaratorContext lambdaDeclarator() throws RecognitionException {
		LambdaDeclaratorContext _localctx = new LambdaDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lambdaDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(LeftParen);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Struct - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftBracket - 74)) | (1L << (Doublecolon - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(494);
				parameterDeclarationClause();
				}
			}

			setState(497);
			match(RightParen);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(498);
				match(Mutable);
				}
			}

			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(501);
				exceptionSpecification();
				}
			}

			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(504);
				attributeSpecifierSeq();
				}
			}

			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(507);
				trailingReturnType();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public SimpleTypeSpecifierContext simpleTypeSpecifier() {
			return getRuleContext(SimpleTypeSpecifierContext.class,0);
		}
		public TypeNameSpecifierContext typeNameSpecifier() {
			return getRuleContext(TypeNameSpecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public TerminalNode Less() { return getToken(PseudoCodeParser.Less, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Greater() { return getToken(PseudoCodeParser.Greater, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dynamic_cast() { return getToken(PseudoCodeParser.Dynamic_cast, 0); }
		public TerminalNode Static_cast() { return getToken(PseudoCodeParser.Static_cast, 0); }
		public TerminalNode Reinterpret_cast() { return getToken(PseudoCodeParser.Reinterpret_cast, 0); }
		public TerminalNode Const_cast() { return getToken(PseudoCodeParser.Const_cast, 0); }
		public TypeIdOfTheTypeIdContext typeIdOfTheTypeId() {
			return getRuleContext(TypeIdOfTheTypeIdContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PseudoCodeParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoCodeParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(PseudoCodeParser.Dot, 0); }
		public TerminalNode Arrow() { return getToken(PseudoCodeParser.Arrow, 0); }
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public PseudoDestructorNameContext pseudoDestructorName() {
			return getRuleContext(PseudoDestructorNameContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoCodeParser.Template, 0); }
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
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(511);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(514);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Auto:
				case Bool:
				case Char:
				case Char16:
				case Char32:
				case Decltype:
				case Double:
				case Float:
				case Int:
				case Long:
				case Short:
				case Signed:
				case Unsigned:
				case Void:
				case Wchar:
				case Doublecolon:
				case Identifier:
					{
					setState(512);
					simpleTypeSpecifier();
					}
					break;
				case Typename_:
					{
					setState(513);
					typeNameSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(521);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
					{
					setState(516);
					match(LeftParen);
					setState(517);
					expressionList();
					setState(518);
					match(RightParen);
					}
					break;
				case LeftBrace:
					{
					setState(520);
					bracedInitList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				{
				setState(523);
				_la = _input.LA(1);
				if ( !(((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (Const_cast - 24)) | (1L << (Dynamic_cast - 24)) | (1L << (Reinterpret_cast - 24)) | (1L << (Static_cast - 24)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(524);
				match(Less);
				setState(525);
				theTypeId();
				setState(526);
				match(Greater);
				setState(527);
				match(LeftParen);
				setState(528);
				expression();
				setState(529);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(531);
				typeIdOfTheTypeId();
				setState(532);
				match(LeftParen);
				setState(535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(533);
					expression();
					}
					break;
				case 2:
					{
					setState(534);
					theTypeId();
					}
					break;
				}
				setState(537);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(569);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(567);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(541);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(542);
						match(LeftBracket);
						setState(545);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IntegerLiteral:
						case CharacterLiteral:
						case FloatingLiteral:
						case StringLiteral:
						case BooleanLiteral:
						case PointerLiteral:
						case UserDefinedLiteral:
						case Alignof:
						case Auto:
						case Bool:
						case Char:
						case Char16:
						case Char32:
						case Const_cast:
						case Decltype:
						case Delete:
						case Double:
						case Dynamic_cast:
						case Float:
						case Int:
						case Long:
						case New:
						case Noexcept:
						case Operator:
						case Reinterpret_cast:
						case Short:
						case Signed:
						case Sizeof:
						case Static_cast:
						case This:
						case Throw:
						case Typeid_:
						case Typename_:
						case Unsigned:
						case Void:
						case Wchar:
						case LeftParen:
						case LeftBracket:
						case Plus:
						case Minus:
						case Star:
						case And:
						case Or:
						case Tilde:
						case Not:
						case PlusPlus:
						case MinusMinus:
						case Doublecolon:
						case Identifier:
							{
							setState(543);
							expression();
							}
							break;
						case LeftBrace:
							{
							setState(544);
							bracedInitList();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(547);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(549);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(550);
						match(LeftParen);
						setState(551);
						expressionList();
						setState(552);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(554);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(555);
						match(LeftParen);
						setState(556);
						match(RightParen);
						notifyErrorListeners("too many parentheses");
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(558);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(559);
						_la = _input.LA(1);
						if ( !(_la==Arrow || _la==Dot) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(565);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(561);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==Template) {
								{
								setState(560);
								match(Template);
								}
							}

							setState(563);
							idExpression();
							}
							break;
						case 2:
							{
							setState(564);
							pseudoDestructorName();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(571);
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

	public static class TypeIdOfTheTypeIdContext extends ParserRuleContext {
		public TerminalNode Typeid_() { return getToken(PseudoCodeParser.Typeid_, 0); }
		public TypeIdOfTheTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdOfTheTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeIdOfTheTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeIdOfTheTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeIdOfTheTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdOfTheTypeIdContext typeIdOfTheTypeId() throws RecognitionException {
		TypeIdOfTheTypeIdContext _localctx = new TypeIdOfTheTypeIdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeIdOfTheTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(Typeid_);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			initializerList();
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

	public static class PseudoDestructorNameContext extends ParserRuleContext {
		public TerminalNode Tilde() { return getToken(PseudoCodeParser.Tilde, 0); }
		public List<TheTypeNameContext> theTypeName() {
			return getRuleContexts(TheTypeNameContext.class);
		}
		public TheTypeNameContext theTypeName(int i) {
			return getRuleContext(TheTypeNameContext.class,i);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(PseudoCodeParser.Doublecolon, 0); }
		public TerminalNode Template() { return getToken(PseudoCodeParser.Template, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public PseudoDestructorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoDestructorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPseudoDestructorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPseudoDestructorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPseudoDestructorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoDestructorNameContext pseudoDestructorName() throws RecognitionException {
		PseudoDestructorNameContext _localctx = new PseudoDestructorNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pseudoDestructorName);
		int _la;
		try {
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(576);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(579);
					theTypeName();
					setState(580);
					match(Doublecolon);
					}
				}

				setState(584);
				match(Tilde);
				setState(585);
				theTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				nestedNameSpecifier(0);
				setState(587);
				match(Template);
				setState(588);
				simpleTemplateId();
				setState(589);
				match(Doublecolon);
				setState(590);
				match(Tilde);
				setState(591);
				theTypeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				match(Tilde);
				setState(594);
				decltypeSpecifier();
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(PseudoCodeParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(PseudoCodeParser.MinusMinus, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(PseudoCodeParser.Sizeof, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public TerminalNode Ellipsis() { return getToken(PseudoCodeParser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode Alignof() { return getToken(PseudoCodeParser.Alignof, 0); }
		public NoExceptExpressionContext noExceptExpression() {
			return getRuleContext(NoExceptExpressionContext.class,0);
		}
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public DeleteExpressionContext deleteExpression() {
			return getRuleContext(DeleteExpressionContext.class,0);
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
		enterRule(_localctx, 38, RULE_unaryExpression);
		try {
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PlusPlus:
					{
					setState(598);
					match(PlusPlus);
					}
					break;
				case MinusMinus:
					{
					setState(599);
					match(MinusMinus);
					}
					break;
				case Plus:
				case Minus:
				case Star:
				case And:
				case Or:
				case Tilde:
				case Not:
					{
					setState(600);
					unaryOperator();
					}
					break;
				case Sizeof:
					{
					setState(601);
					match(Sizeof);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(604);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(605);
				match(Sizeof);
				setState(614);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
					{
					setState(606);
					match(LeftParen);
					setState(607);
					theTypeId();
					setState(608);
					match(RightParen);
					}
					break;
				case Ellipsis:
					{
					setState(610);
					match(Ellipsis);
					setState(611);
					match(LeftParen);
					setState(612);
					match(Identifier);
					setState(613);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(616);
				match(Alignof);
				setState(617);
				match(LeftParen);
				setState(618);
				theTypeId();
				setState(619);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(621);
				noExceptExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(622);
				newExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(623);
				deleteExpression();
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(PseudoCodeParser.Or, 0); }
		public TerminalNode Star() { return getToken(PseudoCodeParser.Star, 0); }
		public TerminalNode And() { return getToken(PseudoCodeParser.And, 0); }
		public TerminalNode Plus() { return getToken(PseudoCodeParser.Plus, 0); }
		public TerminalNode Tilde() { return getToken(PseudoCodeParser.Tilde, 0); }
		public TerminalNode Minus() { return getToken(PseudoCodeParser.Minus, 0); }
		public TerminalNode Not() { return getToken(PseudoCodeParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (Plus - 91)) | (1L << (Minus - 91)) | (1L << (Star - 91)) | (1L << (And - 91)) | (1L << (Or - 91)) | (1L << (Tilde - 91)) | (1L << (Not - 91)))) != 0)) ) {
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

	public static class NewExpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(PseudoCodeParser.New, 0); }
		public NewTypeIdContext newTypeId() {
			return getRuleContext(NewTypeIdContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(PseudoCodeParser.Doublecolon, 0); }
		public NewPlacementContext newPlacement() {
			return getRuleContext(NewPlacementContext.class,0);
		}
		public NewInitializerContext newInitializer() {
			return getRuleContext(NewInitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_newExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doublecolon) {
				{
				setState(628);
				match(Doublecolon);
				}
			}

			setState(631);
			match(New);
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(632);
				newPlacement();
				}
				break;
			}
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename_:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case Doublecolon:
			case Identifier:
				{
				setState(635);
				newTypeId();
				}
				break;
			case LeftParen:
				{
				{
				setState(636);
				match(LeftParen);
				setState(637);
				theTypeId();
				setState(638);
				match(RightParen);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen || _la==LeftBrace) {
				{
				setState(642);
				newInitializer();
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

	public static class NewPlacementContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public NewPlacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newPlacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNewPlacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNewPlacement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNewPlacement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewPlacementContext newPlacement() throws RecognitionException {
		NewPlacementContext _localctx = new NewPlacementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newPlacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(LeftParen);
			setState(646);
			expressionList();
			setState(647);
			match(RightParen);
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

	public static class NewTypeIdContext extends ParserRuleContext {
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public NewDeclaratorContext newDeclarator() {
			return getRuleContext(NewDeclaratorContext.class,0);
		}
		public NewTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNewTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNewTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNewTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewTypeIdContext newTypeId() throws RecognitionException {
		NewTypeIdContext _localctx = new NewTypeIdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_newTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			typeSpecifierSeq();
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(650);
				newDeclarator();
				}
				break;
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

	public static class NewDeclaratorContext extends ParserRuleContext {
		public PointerOperatorContext pointerOperator() {
			return getRuleContext(PointerOperatorContext.class,0);
		}
		public NewDeclaratorContext newDeclarator() {
			return getRuleContext(NewDeclaratorContext.class,0);
		}
		public NoPointerNewDeclaratorContext noPointerNewDeclarator() {
			return getRuleContext(NoPointerNewDeclaratorContext.class,0);
		}
		public NewDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNewDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNewDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNewDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewDeclaratorContext newDeclarator() throws RecognitionException {
		NewDeclaratorContext _localctx = new NewDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_newDeclarator);
		try {
			setState(658);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				pointerOperator();
				setState(655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(654);
					newDeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				noPointerNewDeclarator(0);
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

	public static class NoPointerNewDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(PseudoCodeParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(PseudoCodeParser.RightBracket, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public NoPointerNewDeclaratorContext noPointerNewDeclarator() {
			return getRuleContext(NoPointerNewDeclaratorContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public NoPointerNewDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerNewDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNoPointerNewDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNoPointerNewDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNoPointerNewDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoPointerNewDeclaratorContext noPointerNewDeclarator() throws RecognitionException {
		return noPointerNewDeclarator(0);
	}

	private NoPointerNewDeclaratorContext noPointerNewDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerNewDeclaratorContext _localctx = new NoPointerNewDeclaratorContext(_ctx, _parentState);
		NoPointerNewDeclaratorContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_noPointerNewDeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(661);
			match(LeftBracket);
			setState(662);
			expression();
			setState(663);
			match(RightBracket);
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(664);
				attributeSpecifierSeq();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerNewDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerNewDeclarator);
					setState(667);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(668);
					match(LeftBracket);
					setState(669);
					constantExpression();
					setState(670);
					match(RightBracket);
					setState(672);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(671);
						attributeSpecifierSeq();
						}
						break;
					}
					}
					} 
				}
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	public static class NewInitializerContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public NewInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNewInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNewInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNewInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewInitializerContext newInitializer() throws RecognitionException {
		NewInitializerContext _localctx = new NewInitializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_newInitializer);
		int _la;
		try {
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				match(LeftParen);
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(680);
					expressionList();
					}
				}

				setState(683);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				bracedInitList();
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

	public static class DeleteExpressionContext extends ParserRuleContext {
		public TerminalNode Delete() { return getToken(PseudoCodeParser.Delete, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(PseudoCodeParser.Doublecolon, 0); }
		public TerminalNode LeftBracket() { return getToken(PseudoCodeParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoCodeParser.RightBracket, 0); }
		public DeleteExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDeleteExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDeleteExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteExpressionContext deleteExpression() throws RecognitionException {
		DeleteExpressionContext _localctx = new DeleteExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_deleteExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doublecolon) {
				{
				setState(687);
				match(Doublecolon);
				}
			}

			setState(690);
			match(Delete);
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(691);
				match(LeftBracket);
				setState(692);
				match(RightBracket);
				}
				break;
			}
			setState(695);
			castExpression();
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

	public static class NoExceptExpressionContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(PseudoCodeParser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public NoExceptExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noExceptExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNoExceptExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNoExceptExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNoExceptExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoExceptExpressionContext noExceptExpression() throws RecognitionException {
		NoExceptExpressionContext _localctx = new NoExceptExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_noExceptExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(Noexcept);
			setState(698);
			match(LeftParen);
			setState(699);
			expression();
			setState(700);
			match(RightParen);
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
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
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
		enterRule(_localctx, 58, RULE_castExpression);
		try {
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				match(LeftParen);
				setState(704);
				theTypeId();
				setState(705);
				match(RightParen);
				setState(706);
				castExpression();
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

	public static class PointerMemberExpressionContext extends ParserRuleContext {
		public List<CastExpressionContext> castExpression() {
			return getRuleContexts(CastExpressionContext.class);
		}
		public CastExpressionContext castExpression(int i) {
			return getRuleContext(CastExpressionContext.class,i);
		}
		public List<TerminalNode> DotStar() { return getTokens(PseudoCodeParser.DotStar); }
		public TerminalNode DotStar(int i) {
			return getToken(PseudoCodeParser.DotStar, i);
		}
		public List<TerminalNode> ArrowStar() { return getTokens(PseudoCodeParser.ArrowStar); }
		public TerminalNode ArrowStar(int i) {
			return getToken(PseudoCodeParser.ArrowStar, i);
		}
		public PointerMemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerMemberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPointerMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPointerMemberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPointerMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerMemberExpressionContext pointerMemberExpression() throws RecognitionException {
		PointerMemberExpressionContext _localctx = new PointerMemberExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pointerMemberExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			castExpression();
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ArrowStar || _la==DotStar) {
				{
				{
				setState(711);
				_la = _input.LA(1);
				if ( !(_la==ArrowStar || _la==DotStar) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(712);
				castExpression();
				}
				}
				setState(717);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<PointerMemberExpressionContext> pointerMemberExpression() {
			return getRuleContexts(PointerMemberExpressionContext.class);
		}
		public PointerMemberExpressionContext pointerMemberExpression(int i) {
			return getRuleContext(PointerMemberExpressionContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(PseudoCodeParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(PseudoCodeParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(PseudoCodeParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(PseudoCodeParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(PseudoCodeParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(PseudoCodeParser.Mod, i);
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
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			pointerMemberExpression();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Star - 93)) | (1L << (Div - 93)) | (1L << (Mod - 93)))) != 0)) {
				{
				{
				setState(719);
				_la = _input.LA(1);
				if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Star - 93)) | (1L << (Div - 93)) | (1L << (Mod - 93)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(720);
				pointerMemberExpression();
				}
				}
				setState(725);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(PseudoCodeParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(PseudoCodeParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(PseudoCodeParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(PseudoCodeParser.Minus, i);
		}
		public List<TerminalNode> PlusPlus() { return getTokens(PseudoCodeParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(PseudoCodeParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(PseudoCodeParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(PseudoCodeParser.MinusMinus, i);
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
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_additiveExpression);
		int _la;
		try {
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				multiplicativeExpression();
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Plus || _la==Minus) {
					{
					{
					setState(727);
					_la = _input.LA(1);
					if ( !(_la==Plus || _la==Minus) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(728);
					multiplicativeExpression();
					}
					}
					setState(733);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				multiplicativeExpression();
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PlusPlus || _la==MinusMinus) {
					{
					{
					setState(735);
					_la = _input.LA(1);
					if ( !(_la==PlusPlus || _la==MinusMinus) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(736);
					multiplicativeExpression();
					notifyErrorListeners("redundant operator symbol");
					}
					}
					setState(743);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOperatorContext> shiftOperator() {
			return getRuleContexts(ShiftOperatorContext.class);
		}
		public ShiftOperatorContext shiftOperator(int i) {
			return getRuleContext(ShiftOperatorContext.class,i);
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
		enterRule(_localctx, 66, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			additiveExpression();
			setState(752);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(747);
					shiftOperator();
					setState(748);
					additiveExpression();
					}
					} 
				}
				setState(754);
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

	public static class ShiftOperatorContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(PseudoCodeParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(PseudoCodeParser.Greater, i);
		}
		public List<TerminalNode> Less() { return getTokens(PseudoCodeParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(PseudoCodeParser.Less, i);
		}
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterShiftOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitShiftOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitShiftOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftOperatorContext shiftOperator() throws RecognitionException {
		ShiftOperatorContext _localctx = new ShiftOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_shiftOperator);
		try {
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Greater:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				match(Greater);
				setState(756);
				match(Greater);
				}
				break;
			case Less:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				match(Less);
				setState(758);
				match(Less);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(PseudoCodeParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(PseudoCodeParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(PseudoCodeParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(PseudoCodeParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(PseudoCodeParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(PseudoCodeParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(PseudoCodeParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(PseudoCodeParser.GreaterEqual, i);
		}
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
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_relationalExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			shiftExpression();
			setState(766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(762);
					_la = _input.LA(1);
					if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Less - 102)) | (1L << (Greater - 102)) | (1L << (LessEqual - 102)) | (1L << (GreaterEqual - 102)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(763);
					shiftExpression();
					}
					} 
				}
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> Equal() { return getTokens(PseudoCodeParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(PseudoCodeParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(PseudoCodeParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(PseudoCodeParser.NotEqual, i);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(PseudoCodeParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(PseudoCodeParser.MinusMinus, 0); }
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
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_equalityExpression);
		int _la;
		try {
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				relationalExpression();
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Equal || _la==NotEqual) {
					{
					{
					setState(770);
					_la = _input.LA(1);
					if ( !(_la==Equal || _la==NotEqual) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(771);
					relationalExpression();
					}
					}
					setState(776);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				postfixExpression(0);
				setState(778);
				_la = _input.LA(1);
				if ( !(_la==PlusPlus || _la==MinusMinus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(PseudoCodeParser.And); }
		public TerminalNode And(int i) {
			return getToken(PseudoCodeParser.And, i);
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
		enterRule(_localctx, 74, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			equalityExpression();
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(783);
				match(And);
				setState(784);
				equalityExpression();
				}
				}
				setState(789);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> Caret() { return getTokens(PseudoCodeParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(PseudoCodeParser.Caret, i);
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
		enterRule(_localctx, 76, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			andExpression();
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(791);
				match(Caret);
				setState(792);
				andExpression();
				}
				}
				setState(797);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(PseudoCodeParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(PseudoCodeParser.Or, i);
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
		enterRule(_localctx, 78, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			exclusiveOrExpression();
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(799);
				match(Or);
				setState(800);
				exclusiveOrExpression();
				}
				}
				setState(805);
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

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(PseudoCodeParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(PseudoCodeParser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			inclusiveOrExpression();
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(807);
				match(AndAnd);
				setState(808);
				inclusiveOrExpression();
				}
				}
				setState(813);
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OrOr() { return getTokens(PseudoCodeParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(PseudoCodeParser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			logicalAndExpression();
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(815);
				match(OrOr);
				setState(816);
				logicalAndExpression();
				}
				}
				setState(821);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(PseudoCodeParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PseudoCodeParser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
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
		enterRule(_localctx, 84, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			logicalOrExpression();
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(823);
				match(Question);
				setState(824);
				expression();
				setState(825);
				match(Colon);
				setState(826);
				assignmentExpression();
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public ThrowExpressionContext throwExpression() {
			return getRuleContext(ThrowExpressionContext.class,0);
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
		enterRule(_localctx, 86, RULE_assignmentExpression);
		try {
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				logicalOrExpression();
				setState(832);
				assignmentOperator();
				setState(833);
				initializerClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(835);
				throwExpression();
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
		public TerminalNode Assign() { return getToken(PseudoCodeParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(PseudoCodeParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(PseudoCodeParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(PseudoCodeParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(PseudoCodeParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(PseudoCodeParser.MinusAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(PseudoCodeParser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(PseudoCodeParser.LeftShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(PseudoCodeParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(PseudoCodeParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(PseudoCodeParser.OrAssign, 0); }
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
		enterRule(_localctx, 88, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (Assign - 101)) | (1L << (PlusAssign - 101)) | (1L << (MinusAssign - 101)) | (1L << (StarAssign - 101)) | (1L << (DivAssign - 101)) | (1L << (ModAssign - 101)) | (1L << (XorAssign - 101)) | (1L << (AndAssign - 101)) | (1L << (OrAssign - 101)) | (1L << (LeftShiftAssign - 101)) | (1L << (RightShiftAssign - 101)))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoCodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoCodeParser.Comma, i);
		}
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
		enterRule(_localctx, 90, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			assignmentExpression();
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(841);
				match(Comma);
				setState(842);
				assignmentExpression();
				}
				}
				setState(847);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
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
		enterRule(_localctx, 92, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
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

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public TryBlockContext tryBlock() {
			return getRuleContext(TryBlockContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
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
		enterRule(_localctx, 94, RULE_statement);
		try {
			setState(863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(851);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(860);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerLiteral:
				case CharacterLiteral:
				case FloatingLiteral:
				case StringLiteral:
				case BooleanLiteral:
				case PointerLiteral:
				case UserDefinedLiteral:
				case Alignof:
				case Auto:
				case Bool:
				case Char:
				case Char16:
				case Char32:
				case Const_cast:
				case Decltype:
				case Delete:
				case Double:
				case Dynamic_cast:
				case Float:
				case Int:
				case Long:
				case New:
				case Noexcept:
				case Operator:
				case Reinterpret_cast:
				case Short:
				case Signed:
				case Sizeof:
				case Static_cast:
				case This:
				case Throw:
				case Typeid_:
				case Typename_:
				case Unsigned:
				case Void:
				case Wchar:
				case LeftParen:
				case LeftBracket:
				case Plus:
				case Minus:
				case Star:
				case And:
				case Or:
				case Tilde:
				case Not:
				case PlusPlus:
				case MinusMinus:
				case Doublecolon:
				case Semi:
				case Identifier:
					{
					setState(854);
					expressionStatement();
					}
					break;
				case LeftBrace:
					{
					setState(855);
					compoundStatement();
					}
					break;
				case If:
				case Switch:
					{
					setState(856);
					selectionStatement();
					}
					break;
				case Do:
				case For:
				case While:
					{
					setState(857);
					iterationStatement();
					}
					break;
				case Break:
				case Continue:
				case Goto:
				case Return:
					{
					setState(858);
					jumpStatement();
					}
					break;
				case Try:
					{
					setState(859);
					tryBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(862);
				declarationStatement();
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(PseudoCodeParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode Case() { return getToken(PseudoCodeParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(PseudoCodeParser.Default, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
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
		enterRule(_localctx, 96, RULE_labeledStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(865);
				attributeSpecifierSeq();
				}
			}

			setState(872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(868);
				match(Identifier);
				}
				break;
			case Case:
				{
				setState(869);
				match(Case);
				setState(870);
				constantExpression();
				}
				break;
			case Default:
				{
				setState(871);
				match(Default);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(874);
			match(Colon);
			setState(875);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(PseudoCodeParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 98, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
				{
				setState(877);
				expression();
				}
			}

			setState(880);
			match(Semi);
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(PseudoCodeParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoCodeParser.RightBrace, 0); }
		public StatementSeqContext statementSeq() {
			return getRuleContext(StatementSeqContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(LeftBrace);
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (AndAnd - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Semi - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)))) != 0)) {
				{
				setState(883);
				statementSeq();
				}
			}

			setState(886);
			match(RightBrace);
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

	public static class StatementSeqContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterStatementSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitStatementSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitStatementSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementSeqContext statementSeq() throws RecognitionException {
		StatementSeqContext _localctx = new StatementSeqContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_statementSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(888);
				statement();
				}
				}
				setState(891); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (AndAnd - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Semi - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)))) != 0) );
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
		enterRule(_localctx, 104, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
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

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(PseudoCodeParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(PseudoCodeParser.Else, 0); }
		public TerminalNode Switch() { return getToken(PseudoCodeParser.Switch, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_selectionStatement);
		try {
			setState(910);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				match(If);
				setState(896);
				match(LeftParen);
				setState(897);
				condition();
				setState(898);
				match(RightParen);
				setState(899);
				statement();
				setState(902);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(900);
					match(Else);
					setState(901);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(904);
				match(Switch);
				setState(905);
				match(LeftParen);
				setState(906);
				condition();
				setState(907);
				match(RightParen);
				setState(908);
				statement();
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(PseudoCodeParser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_condition);
		int _la;
		try {
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(912);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(913);
					attributeSpecifierSeq();
					}
				}

				setState(916);
				declSpecifierSeq();
				setState(917);
				declarator();
				setState(921);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Assign:
					{
					setState(918);
					match(Assign);
					setState(919);
					initializerClause();
					}
					break;
				case LeftBrace:
					{
					setState(920);
					bracedInitList();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(PseudoCodeParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(PseudoCodeParser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoCodeParser.Semi, 0); }
		public TerminalNode For() { return getToken(PseudoCodeParser.For, 0); }
		public ForInitStatementContext forInitStatement() {
			return getRuleContext(ForInitStatementContext.class,0);
		}
		public ForRangeDeclarationContext forRangeDeclaration() {
			return getRuleContext(ForRangeDeclarationContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PseudoCodeParser.Colon, 0); }
		public ForRangeInitializerContext forRangeInitializer() {
			return getRuleContext(ForRangeInitializerContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_iterationStatement);
		int _la;
		try {
			setState(958);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				match(While);
				setState(926);
				match(LeftParen);
				setState(927);
				condition();
				setState(928);
				match(RightParen);
				setState(929);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
				match(Do);
				setState(932);
				statement();
				setState(933);
				match(While);
				setState(934);
				match(LeftParen);
				setState(935);
				expression();
				setState(936);
				match(RightParen);
				setState(937);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(939);
				match(For);
				setState(940);
				match(LeftParen);
				setState(953);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(941);
					forInitStatement();
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Thread_local - 65)) | (1L << (Throw - 65)) | (1L << (Typedef - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Virtual - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
						{
						setState(942);
						condition();
						}
					}

					setState(945);
					match(Semi);
					setState(947);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
						{
						setState(946);
						expression();
						}
					}

					}
					break;
				case 2:
					{
					setState(949);
					forRangeDeclaration();
					setState(950);
					match(Colon);
					setState(951);
					forRangeInitializer();
					}
					break;
				}
				setState(955);
				match(RightParen);
				setState(956);
				statement();
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

	public static class ForInitStatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public ForInitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterForInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitForInitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitForInitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitStatementContext forInitStatement() throws RecognitionException {
		ForInitStatementContext _localctx = new ForInitStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forInitStatement);
		try {
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(960);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(961);
				simpleDeclaration();
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

	public static class ForRangeDeclarationContext extends ParserRuleContext {
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public ForRangeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRangeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterForRangeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitForRangeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitForRangeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRangeDeclarationContext forRangeDeclaration() throws RecognitionException {
		ForRangeDeclarationContext _localctx = new ForRangeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forRangeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(964);
				attributeSpecifierSeq();
				}
			}

			setState(967);
			declSpecifierSeq();
			setState(968);
			declarator();
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

	public static class ForRangeInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ForRangeInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRangeInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterForRangeInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitForRangeInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitForRangeInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRangeInitializerContext forRangeInitializer() throws RecognitionException {
		ForRangeInitializerContext _localctx = new ForRangeInitializerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_forRangeInitializer);
		try {
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case PointerLiteral:
			case UserDefinedLiteral:
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case Typeid_:
			case Typename_:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(970);
				expression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(971);
				bracedInitList();
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

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(PseudoCodeParser.Semi, 0); }
		public TerminalNode Break() { return getToken(PseudoCodeParser.Break, 0); }
		public TerminalNode Continue() { return getToken(PseudoCodeParser.Continue, 0); }
		public TerminalNode Return() { return getToken(PseudoCodeParser.Return, 0); }
		public TerminalNode Goto() { return getToken(PseudoCodeParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_jumpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				{
				setState(974);
				match(Break);
				}
				break;
			case Continue:
				{
				setState(975);
				match(Continue);
				}
				break;
			case Return:
				{
				setState(976);
				match(Return);
				setState(979);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntegerLiteral:
				case CharacterLiteral:
				case FloatingLiteral:
				case StringLiteral:
				case BooleanLiteral:
				case PointerLiteral:
				case UserDefinedLiteral:
				case Alignof:
				case Auto:
				case Bool:
				case Char:
				case Char16:
				case Char32:
				case Const_cast:
				case Decltype:
				case Delete:
				case Double:
				case Dynamic_cast:
				case Float:
				case Int:
				case Long:
				case New:
				case Noexcept:
				case Operator:
				case Reinterpret_cast:
				case Short:
				case Signed:
				case Sizeof:
				case Static_cast:
				case This:
				case Throw:
				case Typeid_:
				case Typename_:
				case Unsigned:
				case Void:
				case Wchar:
				case LeftParen:
				case LeftBracket:
				case Plus:
				case Minus:
				case Star:
				case And:
				case Or:
				case Tilde:
				case Not:
				case PlusPlus:
				case MinusMinus:
				case Doublecolon:
				case Identifier:
					{
					setState(977);
					expression();
					}
					break;
				case LeftBrace:
					{
					setState(978);
					bracedInitList();
					}
					break;
				case Semi:
					break;
				default:
					break;
				}
				}
				break;
			case Goto:
				{
				setState(981);
				match(Goto);
				setState(982);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(985);
			match(Semi);
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

	public static class DeclarationStatementContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			blockDeclaration();
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

	public static class DeclarationseqContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDeclarationseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDeclarationseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declarationseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(989);
				declaration();
				}
				}
				setState(992); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Asm - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Namespace - 10)) | (1L << (Operator - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0) );
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

	public static class DeclarationContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public ExplicitInstantiationContext explicitInstantiation() {
			return getRuleContext(ExplicitInstantiationContext.class,0);
		}
		public ExplicitSpecializationContext explicitSpecialization() {
			return getRuleContext(ExplicitSpecializationContext.class,0);
		}
		public LinkageSpecificationContext linkageSpecification() {
			return getRuleContext(LinkageSpecificationContext.class,0);
		}
		public NamespaceDefinitionContext namespaceDefinition() {
			return getRuleContext(NamespaceDefinitionContext.class,0);
		}
		public EmptyDeclarationContext emptyDeclaration() {
			return getRuleContext(EmptyDeclarationContext.class,0);
		}
		public AttributeDeclarationContext attributeDeclaration() {
			return getRuleContext(AttributeDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_declaration);
		try {
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				blockDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(996);
				templateDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(997);
				explicitInstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(998);
				explicitSpecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(999);
				linkageSpecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1000);
				namespaceDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1001);
				emptyDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1002);
				attributeDeclaration();
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

	public static class BlockDeclarationContext extends ParserRuleContext {
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public AsmDefinitionContext asmDefinition() {
			return getRuleContext(AsmDefinitionContext.class,0);
		}
		public NamespaceAliasDefinitionContext namespaceAliasDefinition() {
			return getRuleContext(NamespaceAliasDefinitionContext.class,0);
		}
		public UsingDeclarationContext usingDeclaration() {
			return getRuleContext(UsingDeclarationContext.class,0);
		}
		public UsingDirectiveContext usingDirective() {
			return getRuleContext(UsingDirectiveContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public AliasDeclarationContext aliasDeclaration() {
			return getRuleContext(AliasDeclarationContext.class,0);
		}
		public OpaqueEnumDeclarationContext opaqueEnumDeclaration() {
			return getRuleContext(OpaqueEnumDeclarationContext.class,0);
		}
		public BlockDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterBlockDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitBlockDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitBlockDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockDeclarationContext blockDeclaration() throws RecognitionException {
		BlockDeclarationContext _localctx = new BlockDeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_blockDeclaration);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				asmDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1007);
				namespaceAliasDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
				usingDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1009);
				usingDirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1010);
				staticAssertDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1011);
				aliasDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1012);
				opaqueEnumDeclaration();
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

	public static class AliasDeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(PseudoCodeParser.Using, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(PseudoCodeParser.Assign, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoCodeParser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public AliasDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAliasDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAliasDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAliasDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasDeclarationContext aliasDeclaration() throws RecognitionException {
		AliasDeclarationContext _localctx = new AliasDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_aliasDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(Using);
			setState(1016);
			match(Identifier);
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1017);
				attributeSpecifierSeq();
				}
			}

			setState(1020);
			match(Assign);
			setState(1021);
			theTypeId();
			setState(1022);
			match(Semi);
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

	public static class SimpleDeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(PseudoCodeParser.Semi, 0); }
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public SimpleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSimpleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSimpleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSimpleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDeclarationContext simpleDeclaration() throws RecognitionException {
		SimpleDeclarationContext _localctx = new SimpleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_simpleDeclaration);
		int _la;
		try {
			setState(1038);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Thread_local:
			case Typedef:
			case Typename_:
			case Union:
			case Unsigned:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1025);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1024);
					declSpecifierSeq();
					}
					break;
				}
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Operator || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (LeftParen - 85)) | (1L << (Star - 85)) | (1L << (And - 85)) | (1L << (Tilde - 85)) | (1L << (AndAnd - 85)) | (1L << (Doublecolon - 85)) | (1L << (Ellipsis - 85)) | (1L << (Identifier - 85)))) != 0)) {
					{
					setState(1027);
					initDeclaratorList();
					}
				}

				setState(1030);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1031);
				attributeSpecifierSeq();
				setState(1033);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1032);
					declSpecifierSeq();
					}
					break;
				}
				setState(1035);
				initDeclaratorList();
				setState(1036);
				match(Semi);
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

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public TerminalNode Static_assert() { return getToken(PseudoCodeParser.Static_assert, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PseudoCodeParser.Comma, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoCodeParser.StringLiteral, 0); }
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(PseudoCodeParser.Semi, 0); }
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterStaticAssertDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitStaticAssertDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitStaticAssertDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_staticAssertDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(Static_assert);
			setState(1041);
			match(LeftParen);
			setState(1042);
			constantExpression();
			setState(1043);
			match(Comma);
			setState(1044);
			match(StringLiteral);
			setState(1045);
			match(RightParen);
			setState(1046);
			match(Semi);
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

	public static class EmptyDeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(PseudoCodeParser.Semi, 0); }
		public EmptyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEmptyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEmptyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEmptyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyDeclarationContext emptyDeclaration() throws RecognitionException {
		EmptyDeclarationContext _localctx = new EmptyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_emptyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(Semi);
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

	public static class AttributeDeclarationContext extends ParserRuleContext {
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoCodeParser.Semi, 0); }
		public AttributeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAttributeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAttributeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAttributeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDeclarationContext attributeDeclaration() throws RecognitionException {
		AttributeDeclarationContext _localctx = new AttributeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_attributeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			attributeSpecifierSeq();
			setState(1051);
			match(Semi);
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

	public static class DeclSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public TerminalNode Friend() { return getToken(PseudoCodeParser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(PseudoCodeParser.Typedef, 0); }
		public TerminalNode Constexpr() { return getToken(PseudoCodeParser.Constexpr, 0); }
		public DeclSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDeclSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDeclSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDeclSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclSpecifierContext declSpecifier() throws RecognitionException {
		DeclSpecifierContext _localctx = new DeclSpecifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declSpecifier);
		try {
			setState(1059);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1053);
				storageClassSpecifier();
				}
				break;
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename_:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1054);
				typeSpecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1055);
				functionSpecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1056);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1057);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1058);
				match(Constexpr);
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

	public static class DeclSpecifierSeqContext extends ParserRuleContext {
		public List<DeclSpecifierContext> declSpecifier() {
			return getRuleContexts(DeclSpecifierContext.class);
		}
		public DeclSpecifierContext declSpecifier(int i) {
			return getRuleContext(DeclSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDeclSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDeclSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDeclSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclSpecifierSeqContext declSpecifierSeq() throws RecognitionException {
		DeclSpecifierSeqContext _localctx = new DeclSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_declSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1062); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1061);
					declSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1064); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1066);
				attributeSpecifierSeq();
				}
				break;
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

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Register() { return getToken(PseudoCodeParser.Register, 0); }
		public TerminalNode Static() { return getToken(PseudoCodeParser.Static, 0); }
		public TerminalNode Thread_local() { return getToken(PseudoCodeParser.Thread_local, 0); }
		public TerminalNode Extern() { return getToken(PseudoCodeParser.Extern, 0); }
		public TerminalNode Mutable() { return getToken(PseudoCodeParser.Mutable, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitStorageClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (Extern - 36)) | (1L << (Mutable - 36)) | (1L << (Register - 36)) | (1L << (Static - 36)) | (1L << (Thread_local - 36)))) != 0)) ) {
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

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(PseudoCodeParser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(PseudoCodeParser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(PseudoCodeParser.Explicit, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFunctionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFunctionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_functionSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			_la = _input.LA(1);
			if ( !(((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (Explicit - 34)) | (1L << (Inline - 34)) | (1L << (Virtual - 34)))) != 0)) ) {
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

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypedefName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypedefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TrailingTypeSpecifierContext trailingTypeSpecifier() {
			return getRuleContext(TrailingTypeSpecifierContext.class,0);
		}
		public ClassSpecifierContext classSpecifier() {
			return getRuleContext(ClassSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_typeSpecifier);
		try {
			setState(1078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1075);
				trailingTypeSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1076);
				classSpecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1077);
				enumSpecifier();
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

	public static class TrailingTypeSpecifierContext extends ParserRuleContext {
		public SimpleTypeSpecifierContext simpleTypeSpecifier() {
			return getRuleContext(SimpleTypeSpecifierContext.class,0);
		}
		public ElaboratedTypeSpecifierContext elaboratedTypeSpecifier() {
			return getRuleContext(ElaboratedTypeSpecifierContext.class,0);
		}
		public TypeNameSpecifierContext typeNameSpecifier() {
			return getRuleContext(TypeNameSpecifierContext.class,0);
		}
		public CvQualifierContext cvQualifier() {
			return getRuleContext(CvQualifierContext.class,0);
		}
		public TrailingTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTrailingTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTrailingTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTrailingTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingTypeSpecifierContext trailingTypeSpecifier() throws RecognitionException {
		TrailingTypeSpecifierContext _localctx = new TrailingTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_trailingTypeSpecifier);
		try {
			setState(1084);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Decltype:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				simpleTypeSpecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				elaboratedTypeSpecifier();
				}
				break;
			case Typename_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1082);
				typeNameSpecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1083);
				cvQualifier();
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

	public static class TypeSpecifierSeqContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TypeSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierSeqContext typeSpecifierSeq() throws RecognitionException {
		TypeSpecifierSeqContext _localctx = new TypeSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_typeSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1087); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1086);
					typeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1089); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1091);
				attributeSpecifierSeq();
				}
				break;
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

	public static class TrailingTypeSpecifierSeqContext extends ParserRuleContext {
		public List<TrailingTypeSpecifierContext> trailingTypeSpecifier() {
			return getRuleContexts(TrailingTypeSpecifierContext.class);
		}
		public TrailingTypeSpecifierContext trailingTypeSpecifier(int i) {
			return getRuleContext(TrailingTypeSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TrailingTypeSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingTypeSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTrailingTypeSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTrailingTypeSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTrailingTypeSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingTypeSpecifierSeqContext trailingTypeSpecifierSeq() throws RecognitionException {
		TrailingTypeSpecifierSeqContext _localctx = new TrailingTypeSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_trailingTypeSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1095); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1094);
					trailingTypeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1097); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1099);
				attributeSpecifierSeq();
				}
				break;
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

	public static class SimpleTypeSpecifierContext extends ParserRuleContext {
		public TheTypeNameContext theTypeName() {
			return getRuleContext(TheTypeNameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoCodeParser.Template, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Char() { return getToken(PseudoCodeParser.Char, 0); }
		public TerminalNode Char16() { return getToken(PseudoCodeParser.Char16, 0); }
		public TerminalNode Char32() { return getToken(PseudoCodeParser.Char32, 0); }
		public TerminalNode Wchar() { return getToken(PseudoCodeParser.Wchar, 0); }
		public TerminalNode Bool() { return getToken(PseudoCodeParser.Bool, 0); }
		public TerminalNode Short() { return getToken(PseudoCodeParser.Short, 0); }
		public TerminalNode Int() { return getToken(PseudoCodeParser.Int, 0); }
		public TerminalNode Long() { return getToken(PseudoCodeParser.Long, 0); }
		public TerminalNode Signed() { return getToken(PseudoCodeParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(PseudoCodeParser.Unsigned, 0); }
		public TerminalNode Float() { return getToken(PseudoCodeParser.Float, 0); }
		public TerminalNode Double() { return getToken(PseudoCodeParser.Double, 0); }
		public TerminalNode Void() { return getToken(PseudoCodeParser.Void, 0); }
		public TerminalNode Auto() { return getToken(PseudoCodeParser.Auto, 0); }
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public SimpleTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSimpleTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSimpleTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSimpleTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeSpecifierContext simpleTypeSpecifier() throws RecognitionException {
		SimpleTypeSpecifierContext _localctx = new SimpleTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_simpleTypeSpecifier);
		try {
			setState(1125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1102);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1105);
				theTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				nestedNameSpecifier(0);
				setState(1107);
				match(Template);
				setState(1108);
				simpleTemplateId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1110);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1111);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1112);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1113);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1114);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1115);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1116);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1117);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1118);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1119);
				match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1120);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1121);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1122);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1123);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1124);
				decltypeSpecifier();
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

	public static class TheTypeNameContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TheTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTheTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTheTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTheTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheTypeNameContext theTypeName() throws RecognitionException {
		TheTypeNameContext _localctx = new TheTypeNameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_theTypeName);
		try {
			setState(1131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1127);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1128);
				enumName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1129);
				typedefName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1130);
				simpleTemplateId();
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

	public static class DecltypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Decltype() { return getToken(PseudoCodeParser.Decltype, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Auto() { return getToken(PseudoCodeParser.Auto, 0); }
		public DecltypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDecltypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDecltypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDecltypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecltypeSpecifierContext decltypeSpecifier() throws RecognitionException {
		DecltypeSpecifierContext _localctx = new DecltypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_decltypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			match(Decltype);
			setState(1134);
			match(LeftParen);
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1135);
				expression();
				}
				break;
			case 2:
				{
				setState(1136);
				match(Auto);
				}
				break;
			}
			setState(1139);
			match(RightParen);
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

	public static class ElaboratedTypeSpecifierContext extends ParserRuleContext {
		public ClassKeyContext classKey() {
			return getRuleContext(ClassKeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoCodeParser.Template, 0); }
		public TerminalNode Enum() { return getToken(PseudoCodeParser.Enum, 0); }
		public ElaboratedTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterElaboratedTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitElaboratedTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitElaboratedTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElaboratedTypeSpecifierContext elaboratedTypeSpecifier() throws RecognitionException {
		ElaboratedTypeSpecifierContext _localctx = new ElaboratedTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_elaboratedTypeSpecifier);
		int _la;
		try {
			setState(1163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Struct:
				enterOuterAlt(_localctx, 1);
				{
				setState(1141);
				classKey();
				setState(1156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1143);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Alignas || _la==LeftBracket) {
						{
						setState(1142);
						attributeSpecifierSeq();
						}
					}

					setState(1146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
					case 1:
						{
						setState(1145);
						nestedNameSpecifier(0);
						}
						break;
					}
					setState(1148);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(1149);
					simpleTemplateId();
					}
					break;
				case 3:
					{
					setState(1150);
					nestedNameSpecifier(0);
					setState(1152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Template) {
						{
						setState(1151);
						match(Template);
						}
					}

					setState(1154);
					simpleTemplateId();
					}
					break;
				}
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 2);
				{
				setState(1158);
				match(Enum);
				setState(1160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1159);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1162);
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

	public static class EnumNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEnumName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEnumName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
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

	public static class EnumSpecifierContext extends ParserRuleContext {
		public EnumHeadContext enumHead() {
			return getRuleContext(EnumHeadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(PseudoCodeParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoCodeParser.RightBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PseudoCodeParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEnumSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_enumSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			enumHead();
			setState(1168);
			match(LeftBrace);
			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1169);
				enumeratorList();
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1170);
					match(Comma);
					}
				}

				}
			}

			setState(1175);
			match(RightBrace);
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

	public static class EnumHeadContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public EnumHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEnumHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEnumHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEnumHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumHeadContext enumHead() throws RecognitionException {
		EnumHeadContext _localctx = new EnumHeadContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_enumHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			enumkey();
			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1178);
				attributeSpecifierSeq();
				}
			}

			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
				{
				setState(1182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1181);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1184);
				match(Identifier);
				}
			}

			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1187);
				enumbase();
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

	public static class OpaqueEnumDeclarationContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(PseudoCodeParser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public OpaqueEnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueEnumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterOpaqueEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitOpaqueEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitOpaqueEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpaqueEnumDeclarationContext opaqueEnumDeclaration() throws RecognitionException {
		OpaqueEnumDeclarationContext _localctx = new OpaqueEnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_opaqueEnumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			enumkey();
			setState(1192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1191);
				attributeSpecifierSeq();
				}
			}

			setState(1194);
			match(Identifier);
			setState(1196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1195);
				enumbase();
				}
			}

			setState(1198);
			match(Semi);
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

	public static class EnumkeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(PseudoCodeParser.Enum, 0); }
		public TerminalNode Class() { return getToken(PseudoCodeParser.Class, 0); }
		public TerminalNode Struct() { return getToken(PseudoCodeParser.Struct, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEnumkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEnumkey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEnumkey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_enumkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(Enum);
			setState(1202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Class || _la==Struct) {
				{
				setState(1201);
				_la = _input.LA(1);
				if ( !(_la==Class || _la==Struct) ) {
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

	public static class EnumbaseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(PseudoCodeParser.Colon, 0); }
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEnumbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEnumbase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEnumbase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			match(Colon);
			setState(1205);
			typeSpecifierSeq();
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

	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorDefinitionContext> enumeratorDefinition() {
			return getRuleContexts(EnumeratorDefinitionContext.class);
		}
		public EnumeratorDefinitionContext enumeratorDefinition(int i) {
			return getRuleContext(EnumeratorDefinitionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoCodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoCodeParser.Comma, i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEnumeratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			enumeratorDefinition();
			setState(1212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1208);
					match(Comma);
					setState(1209);
					enumeratorDefinition();
					}
					} 
				}
				setState(1214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
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

	public static class EnumeratorDefinitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(PseudoCodeParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEnumeratorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEnumeratorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEnumeratorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorDefinitionContext enumeratorDefinition() throws RecognitionException {
		EnumeratorDefinitionContext _localctx = new EnumeratorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_enumeratorDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			enumerator();
			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1216);
				match(Assign);
				setState(1217);
				constantExpression();
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

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
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

	public static class NamespaceNameContext extends ParserRuleContext {
		public OriginalNamespaceNameContext originalNamespaceName() {
			return getRuleContext(OriginalNamespaceNameContext.class,0);
		}
		public NamespaceAliasContext namespaceAlias() {
			return getRuleContext(NamespaceAliasContext.class,0);
		}
		public NamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceNameContext namespaceName() throws RecognitionException {
		NamespaceNameContext _localctx = new NamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_namespaceName);
		try {
			setState(1224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				originalNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1223);
				namespaceAlias();
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

	public static class OriginalNamespaceNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public OriginalNamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalNamespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterOriginalNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitOriginalNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitOriginalNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginalNamespaceNameContext originalNamespaceName() throws RecognitionException {
		OriginalNamespaceNameContext _localctx = new OriginalNamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_originalNamespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
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

	public static class NamespaceDefinitionContext extends ParserRuleContext {
		public DeclarationseqContext namespaceBody;
		public TerminalNode Namespace() { return getToken(PseudoCodeParser.Namespace, 0); }
		public TerminalNode LeftBrace() { return getToken(PseudoCodeParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoCodeParser.RightBrace, 0); }
		public TerminalNode Inline() { return getToken(PseudoCodeParser.Inline, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public OriginalNamespaceNameContext originalNamespaceName() {
			return getRuleContext(OriginalNamespaceNameContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public NamespaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNamespaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNamespaceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNamespaceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDefinitionContext namespaceDefinition() throws RecognitionException {
		NamespaceDefinitionContext _localctx = new NamespaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_namespaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1228);
				match(Inline);
				}
			}

			setState(1231);
			match(Namespace);
			setState(1234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1232);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1233);
				originalNamespaceName();
				}
				break;
			}
			setState(1236);
			match(LeftBrace);
			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Asm - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Namespace - 10)) | (1L << (Operator - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(1237);
				((NamespaceDefinitionContext)_localctx).namespaceBody = declarationseq();
				}
			}

			setState(1240);
			match(RightBrace);
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

	public static class NamespaceAliasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public NamespaceAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNamespaceAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNamespaceAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNamespaceAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceAliasContext namespaceAlias() throws RecognitionException {
		NamespaceAliasContext _localctx = new NamespaceAliasContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_namespaceAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
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

	public static class NamespaceAliasDefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(PseudoCodeParser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(PseudoCodeParser.Assign, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoCodeParser.Semi, 0); }
		public NamespaceAliasDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceAliasDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNamespaceAliasDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNamespaceAliasDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNamespaceAliasDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceAliasDefinitionContext namespaceAliasDefinition() throws RecognitionException {
		NamespaceAliasDefinitionContext _localctx = new NamespaceAliasDefinitionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_namespaceAliasDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			match(Namespace);
			setState(1245);
			match(Identifier);
			setState(1246);
			match(Assign);
			setState(1247);
			qualifiednamespacespecifier();
			setState(1248);
			match(Semi);
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

	public static class QualifiednamespacespecifierContext extends ParserRuleContext {
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public QualifiednamespacespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiednamespacespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterQualifiednamespacespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitQualifiednamespacespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitQualifiednamespacespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1250);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1253);
			namespaceName();
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

	public static class UsingDeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(PseudoCodeParser.Using, 0); }
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoCodeParser.Semi, 0); }
		public TerminalNode Doublecolon() { return getToken(PseudoCodeParser.Doublecolon, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Typename_() { return getToken(PseudoCodeParser.Typename_, 0); }
		public UsingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUsingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUsingDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUsingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingDeclarationContext usingDeclaration() throws RecognitionException {
		UsingDeclarationContext _localctx = new UsingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_usingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			match(Using);
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				{
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Typename_) {
					{
					setState(1256);
					match(Typename_);
					}
				}

				setState(1259);
				nestedNameSpecifier(0);
				}
				}
				break;
			case 2:
				{
				setState(1260);
				match(Doublecolon);
				}
				break;
			}
			setState(1263);
			unqualifiedId();
			setState(1264);
			match(Semi);
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

	public static class UsingDirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(PseudoCodeParser.Using, 0); }
		public TerminalNode Namespace() { return getToken(PseudoCodeParser.Namespace, 0); }
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoCodeParser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public UsingDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterUsingDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitUsingDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitUsingDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingDirectiveContext usingDirective() throws RecognitionException {
		UsingDirectiveContext _localctx = new UsingDirectiveContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_usingDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1266);
				attributeSpecifierSeq();
				}
			}

			setState(1269);
			match(Using);
			setState(1270);
			match(Namespace);
			setState(1272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1271);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1274);
			namespaceName();
			setState(1275);
			match(Semi);
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

	public static class AsmDefinitionContext extends ParserRuleContext {
		public TerminalNode Asm() { return getToken(PseudoCodeParser.Asm, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoCodeParser.StringLiteral, 0); }
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(PseudoCodeParser.Semi, 0); }
		public AsmDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAsmDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAsmDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAsmDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmDefinitionContext asmDefinition() throws RecognitionException {
		AsmDefinitionContext _localctx = new AsmDefinitionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_asmDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			match(Asm);
			setState(1278);
			match(LeftParen);
			setState(1279);
			match(StringLiteral);
			setState(1280);
			match(RightParen);
			setState(1281);
			match(Semi);
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

	public static class LinkageSpecificationContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(PseudoCodeParser.Extern, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoCodeParser.StringLiteral, 0); }
		public TerminalNode LeftBrace() { return getToken(PseudoCodeParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoCodeParser.RightBrace, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public LinkageSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkageSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLinkageSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLinkageSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLinkageSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkageSpecificationContext linkageSpecification() throws RecognitionException {
		LinkageSpecificationContext _localctx = new LinkageSpecificationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_linkageSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			match(Extern);
			setState(1284);
			match(StringLiteral);
			setState(1291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				{
				setState(1285);
				match(LeftBrace);
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Asm - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Namespace - 10)) | (1L << (Operator - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0)) {
					{
					setState(1286);
					declarationseq();
					}
				}

				setState(1289);
				match(RightBrace);
				}
				break;
			case Alignas:
			case Asm:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Namespace:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Static_assert:
			case Struct:
			case Template:
			case Thread_local:
			case Typedef:
			case Typename_:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				{
				setState(1290);
				declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AttributeSpecifierSeqContext extends ParserRuleContext {
		public List<AttributeSpecifierContext> attributeSpecifier() {
			return getRuleContexts(AttributeSpecifierContext.class);
		}
		public AttributeSpecifierContext attributeSpecifier(int i) {
			return getRuleContext(AttributeSpecifierContext.class,i);
		}
		public AttributeSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAttributeSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAttributeSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAttributeSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecifierSeqContext attributeSpecifierSeq() throws RecognitionException {
		AttributeSpecifierSeqContext _localctx = new AttributeSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_attributeSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1294); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1293);
					attributeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1296); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AttributeSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftBracket() { return getTokens(PseudoCodeParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(PseudoCodeParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(PseudoCodeParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(PseudoCodeParser.RightBracket, i);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public AlignmentspecifierContext alignmentspecifier() {
			return getRuleContext(AlignmentspecifierContext.class,0);
		}
		public AttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAttributeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAttributeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecifierContext attributeSpecifier() throws RecognitionException {
		AttributeSpecifierContext _localctx = new AttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_attributeSpecifier);
		int _la;
		try {
			setState(1306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1298);
				match(LeftBracket);
				setState(1299);
				match(LeftBracket);
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1300);
					attributeList();
					}
				}

				setState(1303);
				match(RightBracket);
				setState(1304);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305);
				alignmentspecifier();
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

	public static class AlignmentspecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(PseudoCodeParser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(PseudoCodeParser.Ellipsis, 0); }
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAlignmentspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAlignmentspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAlignmentspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_alignmentspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			match(Alignas);
			setState(1309);
			match(LeftParen);
			setState(1312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1310);
				theTypeId();
				}
				break;
			case 2:
				{
				setState(1311);
				constantExpression();
				}
				break;
			}
			setState(1315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1314);
				match(Ellipsis);
				}
			}

			setState(1317);
			match(RightParen);
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

	public static class AttributeListContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoCodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoCodeParser.Comma, i);
		}
		public TerminalNode Ellipsis() { return getToken(PseudoCodeParser.Ellipsis, 0); }
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			attribute();
			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1320);
				match(Comma);
				setState(1321);
				attribute();
				}
				}
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1327);
				match(Ellipsis);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public AttributeNamespaceContext attributeNamespace() {
			return getRuleContext(AttributeNamespaceContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(PseudoCodeParser.Doublecolon, 0); }
		public AttributeArgumentClauseContext attributeArgumentClause() {
			return getRuleContext(AttributeArgumentClauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1330);
				attributeNamespace();
				setState(1331);
				match(Doublecolon);
				}
				break;
			}
			setState(1335);
			match(Identifier);
			setState(1337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(1336);
				attributeArgumentClause();
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

	public static class AttributeNamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public AttributeNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAttributeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAttributeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAttributeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNamespaceContext attributeNamespace() throws RecognitionException {
		AttributeNamespaceContext _localctx = new AttributeNamespaceContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_attributeNamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
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

	public static class AttributeArgumentClauseContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public BalancedTokenSeqContext balancedTokenSeq() {
			return getRuleContext(BalancedTokenSeqContext.class,0);
		}
		public AttributeArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAttributeArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAttributeArgumentClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAttributeArgumentClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeArgumentClauseContext attributeArgumentClause() throws RecognitionException {
		AttributeArgumentClauseContext _localctx = new AttributeArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_attributeArgumentClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			match(LeftParen);
			setState(1343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << MultiLineMacro) | (1L << Directive) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Catch) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Else) | (1L << Enum) | (1L << Explicit) | (1L << Export) | (1L << Extern) | (1L << False_) | (1L << Final) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Override) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (Template - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True_ - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (Caret - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (Assign - 64)) | (1L << (Less - 64)) | (1L << (Greater - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Comma - 64)) | (1L << (ArrowStar - 64)) | (1L << (Arrow - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Doublecolon - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Semi - 128)) | (1L << (Dot - 128)) | (1L << (DotStar - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (Integersuffix - 128)) | (1L << (UserDefinedIntegerLiteral - 128)) | (1L << (UserDefinedFloatingLiteral - 128)) | (1L << (UserDefinedStringLiteral - 128)) | (1L << (UserDefinedCharacterLiteral - 128)) | (1L << (Whitespace - 128)) | (1L << (Newline - 128)) | (1L << (BlockComment - 128)) | (1L << (LineComment - 128)))) != 0)) {
				{
				setState(1342);
				balancedTokenSeq();
				}
			}

			setState(1345);
			match(RightParen);
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

	public static class BalancedTokenSeqContext extends ParserRuleContext {
		public List<BalancedtokenContext> balancedtoken() {
			return getRuleContexts(BalancedtokenContext.class);
		}
		public BalancedtokenContext balancedtoken(int i) {
			return getRuleContext(BalancedtokenContext.class,i);
		}
		public BalancedTokenSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedTokenSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterBalancedTokenSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitBalancedTokenSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitBalancedTokenSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalancedTokenSeqContext balancedTokenSeq() throws RecognitionException {
		BalancedTokenSeqContext _localctx = new BalancedTokenSeqContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_balancedTokenSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1347);
				balancedtoken();
				}
				}
				setState(1350); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << MultiLineMacro) | (1L << Directive) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Catch) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Else) | (1L << Enum) | (1L << Explicit) | (1L << Export) | (1L << Extern) | (1L << False_) | (1L << Final) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Override) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (Template - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True_ - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (Caret - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (Assign - 64)) | (1L << (Less - 64)) | (1L << (Greater - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Comma - 64)) | (1L << (ArrowStar - 64)) | (1L << (Arrow - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Doublecolon - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Semi - 128)) | (1L << (Dot - 128)) | (1L << (DotStar - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (Integersuffix - 128)) | (1L << (UserDefinedIntegerLiteral - 128)) | (1L << (UserDefinedFloatingLiteral - 128)) | (1L << (UserDefinedStringLiteral - 128)) | (1L << (UserDefinedCharacterLiteral - 128)) | (1L << (Whitespace - 128)) | (1L << (Newline - 128)) | (1L << (BlockComment - 128)) | (1L << (LineComment - 128)))) != 0) );
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

	public static class BalancedtokenContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(PseudoCodeParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(PseudoCodeParser.LeftParen, i);
		}
		public BalancedTokenSeqContext balancedTokenSeq() {
			return getRuleContext(BalancedTokenSeqContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(PseudoCodeParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PseudoCodeParser.RightParen, i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(PseudoCodeParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(PseudoCodeParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(PseudoCodeParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(PseudoCodeParser.RightBracket, i);
		}
		public List<TerminalNode> LeftBrace() { return getTokens(PseudoCodeParser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(PseudoCodeParser.LeftBrace, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(PseudoCodeParser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(PseudoCodeParser.RightBrace, i);
		}
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterBalancedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitBalancedtoken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitBalancedtoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_balancedtoken);
		int _la;
		try {
			int _alt;
			setState(1369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1352);
				match(LeftParen);
				setState(1353);
				balancedTokenSeq();
				setState(1354);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1356);
				match(LeftBracket);
				setState(1357);
				balancedTokenSeq();
				setState(1358);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1360);
				match(LeftBrace);
				setState(1361);
				balancedTokenSeq();
				setState(1362);
				match(RightBrace);
				}
				break;
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case PointerLiteral:
			case UserDefinedLiteral:
			case MultiLineMacro:
			case Directive:
			case Alignas:
			case Alignof:
			case Asm:
			case Auto:
			case Bool:
			case Break:
			case Case:
			case Catch:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Const_cast:
			case Continue:
			case Decltype:
			case Default:
			case Delete:
			case Do:
			case Double:
			case Dynamic_cast:
			case Else:
			case Enum:
			case Explicit:
			case Export:
			case Extern:
			case False_:
			case Final:
			case Float:
			case For:
			case Friend:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Namespace:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Override:
			case Private:
			case Protected:
			case Public:
			case Register:
			case Reinterpret_cast:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Static_assert:
			case Static_cast:
			case Struct:
			case Switch:
			case Template:
			case This:
			case Thread_local:
			case Throw:
			case True_:
			case Try:
			case Typedef:
			case Typeid_:
			case Typename_:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case While:
			case Plus:
			case Minus:
			case Star:
			case Div:
			case Mod:
			case Caret:
			case And:
			case Or:
			case Tilde:
			case Not:
			case Assign:
			case Less:
			case Greater:
			case PlusAssign:
			case MinusAssign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case XorAssign:
			case AndAssign:
			case OrAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case Equal:
			case NotEqual:
			case LessEqual:
			case GreaterEqual:
			case AndAnd:
			case OrOr:
			case PlusPlus:
			case MinusMinus:
			case Comma:
			case ArrowStar:
			case Arrow:
			case Question:
			case Colon:
			case Doublecolon:
			case Semi:
			case Dot:
			case DotStar:
			case Ellipsis:
			case Identifier:
			case DecimalLiteral:
			case OctalLiteral:
			case HexadecimalLiteral:
			case BinaryLiteral:
			case Integersuffix:
			case UserDefinedIntegerLiteral:
			case UserDefinedFloatingLiteral:
			case UserDefinedStringLiteral:
			case UserDefinedCharacterLiteral:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 4);
				{
				setState(1365); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1364);
						_la = _input.LA(1);
						if ( _la <= 0 || (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (LeftParen - 85)) | (1L << (RightParen - 85)) | (1L << (LeftBracket - 85)) | (1L << (RightBracket - 85)) | (1L << (LeftBrace - 85)) | (1L << (RightBrace - 85)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1367); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoCodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoCodeParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			initDeclarator();
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1372);
				match(Comma);
				setState(1373);
				initDeclarator();
				}
				}
				setState(1378);
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

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			declarator();
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (LeftParen - 85)) | (1L << (LeftBrace - 85)) | (1L << (Assign - 85)))) != 0)) {
				{
				setState(1380);
				initializer();
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

	public static class DeclaratorContext extends ParserRuleContext {
		public PointerDeclaratorContext pointerDeclarator() {
			return getRuleContext(PointerDeclaratorContext.class,0);
		}
		public NoPointerDeclaratorContext noPointerDeclarator() {
			return getRuleContext(NoPointerDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TrailingReturnTypeContext trailingReturnType() {
			return getRuleContext(TrailingReturnTypeContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_declarator);
		try {
			setState(1388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1383);
				pointerDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1384);
				noPointerDeclarator(0);
				setState(1385);
				parametersAndQualifiers();
				setState(1386);
				trailingReturnType();
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

	public static class PointerDeclaratorContext extends ParserRuleContext {
		public NoPointerDeclaratorContext noPointerDeclarator() {
			return getRuleContext(NoPointerDeclaratorContext.class,0);
		}
		public List<PointerOperatorContext> pointerOperator() {
			return getRuleContexts(PointerOperatorContext.class);
		}
		public PointerOperatorContext pointerOperator(int i) {
			return getRuleContext(PointerOperatorContext.class,i);
		}
		public List<TerminalNode> Const() { return getTokens(PseudoCodeParser.Const); }
		public TerminalNode Const(int i) {
			return getToken(PseudoCodeParser.Const, i);
		}
		public PointerDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPointerDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPointerDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPointerDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerDeclaratorContext pointerDeclarator() throws RecognitionException {
		PointerDeclaratorContext _localctx = new PointerDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_pointerDeclarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1390);
					pointerOperator();
					setState(1392);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Const) {
						{
						setState(1391);
						match(Const);
						}
					}

					}
					} 
				}
				setState(1398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			setState(1399);
			noPointerDeclarator(0);
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

	public static class NoPointerDeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public PointerDeclaratorContext pointerDeclarator() {
			return getRuleContext(PointerDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public NoPointerDeclaratorContext noPointerDeclarator() {
			return getRuleContext(NoPointerDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PseudoCodeParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoCodeParser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public NoPointerDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNoPointerDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNoPointerDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNoPointerDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoPointerDeclaratorContext noPointerDeclarator() throws RecognitionException {
		return noPointerDeclarator(0);
	}

	private NoPointerDeclaratorContext noPointerDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerDeclaratorContext _localctx = new NoPointerDeclaratorContext(_ctx, _parentState);
		NoPointerDeclaratorContext _prevctx = _localctx;
		int _startState = 228;
		enterRecursionRule(_localctx, 228, RULE_noPointerDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1402);
				declaratorid();
				setState(1404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1403);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1406);
				match(LeftParen);
				setState(1407);
				pointerDeclarator();
				setState(1408);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerDeclarator);
					setState(1412);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1422);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LeftParen:
						{
						setState(1413);
						parametersAndQualifiers();
						}
						break;
					case LeftBracket:
						{
						setState(1414);
						match(LeftBracket);
						setState(1416);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
							{
							setState(1415);
							constantExpression();
							}
						}

						setState(1418);
						match(RightBracket);
						setState(1420);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
						case 1:
							{
							setState(1419);
							attributeSpecifierSeq();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
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

	public static class ParametersAndQualifiersContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public ParameterDeclarationClauseContext parameterDeclarationClause() {
			return getRuleContext(ParameterDeclarationClauseContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public RefqualifierContext refqualifier() {
			return getRuleContext(RefqualifierContext.class,0);
		}
		public ExceptionSpecificationContext exceptionSpecification() {
			return getRuleContext(ExceptionSpecificationContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public ParametersAndQualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersAndQualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterParametersAndQualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitParametersAndQualifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitParametersAndQualifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersAndQualifiersContext parametersAndQualifiers() throws RecognitionException {
		ParametersAndQualifiersContext _localctx = new ParametersAndQualifiersContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_parametersAndQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(LeftParen);
			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Struct - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftBracket - 74)) | (1L << (Doublecolon - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(1430);
				parameterDeclarationClause();
				}
			}

			setState(1433);
			match(RightParen);
			setState(1435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1434);
				cvqualifierseq();
				}
				break;
			}
			setState(1438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1437);
				refqualifier();
				}
				break;
			}
			setState(1441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1440);
				exceptionSpecification();
				}
				break;
			}
			setState(1444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1443);
				attributeSpecifierSeq();
				}
				break;
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

	public static class TrailingReturnTypeContext extends ParserRuleContext {
		public TerminalNode Arrow() { return getToken(PseudoCodeParser.Arrow, 0); }
		public TrailingTypeSpecifierSeqContext trailingTypeSpecifierSeq() {
			return getRuleContext(TrailingTypeSpecifierSeqContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TrailingReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTrailingReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTrailingReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTrailingReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingReturnTypeContext trailingReturnType() throws RecognitionException {
		TrailingReturnTypeContext _localctx = new TrailingReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_trailingReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			match(Arrow);
			setState(1447);
			trailingTypeSpecifierSeq();
			setState(1449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1448);
				abstractDeclarator();
				}
				break;
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

	public static class PointerOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(PseudoCodeParser.And, 0); }
		public TerminalNode AndAnd() { return getToken(PseudoCodeParser.AndAnd, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Star() { return getToken(PseudoCodeParser.Star, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public PointerOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPointerOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPointerOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPointerOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerOperatorContext pointerOperator() throws RecognitionException {
		PointerOperatorContext _localctx = new PointerOperatorContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_pointerOperator);
		int _la;
		try {
			setState(1465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
			case AndAnd:
				enterOuterAlt(_localctx, 1);
				{
				setState(1451);
				_la = _input.LA(1);
				if ( !(_la==And || _la==AndAnd) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1452);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case Decltype:
			case Star:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(1455);
					nestedNameSpecifier(0);
					}
				}

				setState(1458);
				match(Star);
				setState(1460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1459);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(1463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1462);
					cvqualifierseq();
					}
					break;
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

	public static class CvqualifierseqContext extends ParserRuleContext {
		public List<CvQualifierContext> cvQualifier() {
			return getRuleContexts(CvQualifierContext.class);
		}
		public CvQualifierContext cvQualifier(int i) {
			return getRuleContext(CvQualifierContext.class,i);
		}
		public CvqualifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterCvqualifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitCvqualifierseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitCvqualifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_cvqualifierseq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1468); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1467);
					cvQualifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1470); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CvQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(PseudoCodeParser.Const, 0); }
		public TerminalNode Volatile() { return getToken(PseudoCodeParser.Volatile, 0); }
		public CvQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterCvQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitCvQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitCvQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvQualifierContext cvQualifier() throws RecognitionException {
		CvQualifierContext _localctx = new CvQualifierContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_cvQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==Volatile) ) {
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

	public static class RefqualifierContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(PseudoCodeParser.And, 0); }
		public TerminalNode AndAnd() { return getToken(PseudoCodeParser.AndAnd, 0); }
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterRefqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitRefqualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitRefqualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			_la = _input.LA(1);
			if ( !(_la==And || _la==AndAnd) ) {
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

	public static class DeclaratoridContext extends ParserRuleContext {
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(PseudoCodeParser.Ellipsis, 0); }
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDeclaratorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDeclaratorid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDeclaratorid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1476);
				match(Ellipsis);
				}
			}

			setState(1479);
			idExpression();
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

	public static class TheTypeIdContext extends ParserRuleContext {
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TheTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTheTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTheTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTheTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheTypeIdContext theTypeId() throws RecognitionException {
		TheTypeIdContext _localctx = new TheTypeIdContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_theTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			typeSpecifierSeq();
			setState(1483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1482);
				abstractDeclarator();
				}
				break;
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

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerAbstractDeclaratorContext pointerAbstractDeclarator() {
			return getRuleContext(PointerAbstractDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TrailingReturnTypeContext trailingReturnType() {
			return getRuleContext(TrailingReturnTypeContext.class,0);
		}
		public NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator() {
			return getRuleContext(NoPointerAbstractDeclaratorContext.class,0);
		}
		public AbstractPackDeclaratorContext abstractPackDeclarator() {
			return getRuleContext(AbstractPackDeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_abstractDeclarator);
		try {
			setState(1493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1485);
				pointerAbstractDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1486);
					noPointerAbstractDeclarator(0);
					}
					break;
				}
				setState(1489);
				parametersAndQualifiers();
				setState(1490);
				trailingReturnType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1492);
				abstractPackDeclarator();
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

	public static class PointerAbstractDeclaratorContext extends ParserRuleContext {
		public NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator() {
			return getRuleContext(NoPointerAbstractDeclaratorContext.class,0);
		}
		public List<PointerOperatorContext> pointerOperator() {
			return getRuleContexts(PointerOperatorContext.class);
		}
		public PointerOperatorContext pointerOperator(int i) {
			return getRuleContext(PointerOperatorContext.class,i);
		}
		public PointerAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPointerAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPointerAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPointerAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerAbstractDeclaratorContext pointerAbstractDeclarator() throws RecognitionException {
		PointerAbstractDeclaratorContext _localctx = new PointerAbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_pointerAbstractDeclarator);
		int _la;
		try {
			setState(1504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1495);
				noPointerAbstractDeclarator(0);
				}
				break;
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1497); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1496);
					pointerOperator();
					}
					}
					setState(1499); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Decltype || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Star - 93)) | (1L << (And - 93)) | (1L << (AndAnd - 93)) | (1L << (Doublecolon - 93)) | (1L << (Identifier - 93)))) != 0) );
				setState(1502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1501);
					noPointerAbstractDeclarator(0);
					}
					break;
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

	public static class NoPointerAbstractDeclaratorContext extends ParserRuleContext {
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PseudoCodeParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoCodeParser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public PointerAbstractDeclaratorContext pointerAbstractDeclarator() {
			return getRuleContext(PointerAbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public List<NoPointerAbstractDeclaratorContext> noPointerAbstractDeclarator() {
			return getRuleContexts(NoPointerAbstractDeclaratorContext.class);
		}
		public NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator(int i) {
			return getRuleContext(NoPointerAbstractDeclaratorContext.class,i);
		}
		public NoPointerAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNoPointerAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNoPointerAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNoPointerAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator() throws RecognitionException {
		return noPointerAbstractDeclarator(0);
	}

	private NoPointerAbstractDeclaratorContext noPointerAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerAbstractDeclaratorContext _localctx = new NoPointerAbstractDeclaratorContext(_ctx, _parentState);
		NoPointerAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 250;
		enterRecursionRule(_localctx, 250, RULE_noPointerAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1507);
				parametersAndQualifiers();
				}
				break;
			case 2:
				{
				setState(1508);
				match(LeftBracket);
				setState(1510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(1509);
					constantExpression();
					}
				}

				setState(1512);
				match(RightBracket);
				setState(1514);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1513);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1516);
				match(LeftParen);
				setState(1517);
				pointerAbstractDeclarator();
				setState(1518);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerAbstractDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerAbstractDeclarator);
					setState(1522);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(1533);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
					case 1:
						{
						setState(1523);
						parametersAndQualifiers();
						}
						break;
					case 2:
						{
						setState(1524);
						noPointerAbstractDeclarator(0);
						setState(1525);
						match(LeftBracket);
						setState(1527);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
							{
							setState(1526);
							constantExpression();
							}
						}

						setState(1529);
						match(RightBracket);
						setState(1531);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
						case 1:
							{
							setState(1530);
							attributeSpecifierSeq();
							}
							break;
						}
						}
						break;
					}
					}
					} 
				}
				setState(1539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
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

	public static class AbstractPackDeclaratorContext extends ParserRuleContext {
		public NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator() {
			return getRuleContext(NoPointerAbstractPackDeclaratorContext.class,0);
		}
		public List<PointerOperatorContext> pointerOperator() {
			return getRuleContexts(PointerOperatorContext.class);
		}
		public PointerOperatorContext pointerOperator(int i) {
			return getRuleContext(PointerOperatorContext.class,i);
		}
		public AbstractPackDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractPackDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAbstractPackDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAbstractPackDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAbstractPackDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractPackDeclaratorContext abstractPackDeclarator() throws RecognitionException {
		AbstractPackDeclaratorContext _localctx = new AbstractPackDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_abstractPackDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Decltype || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Star - 93)) | (1L << (And - 93)) | (1L << (AndAnd - 93)) | (1L << (Doublecolon - 93)) | (1L << (Identifier - 93)))) != 0)) {
				{
				{
				setState(1540);
				pointerOperator();
				}
				}
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1546);
			noPointerAbstractPackDeclarator(0);
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

	public static class NoPointerAbstractPackDeclaratorContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(PseudoCodeParser.Ellipsis, 0); }
		public NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator() {
			return getRuleContext(NoPointerAbstractPackDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PseudoCodeParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoCodeParser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public NoPointerAbstractPackDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerAbstractPackDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNoPointerAbstractPackDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNoPointerAbstractPackDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNoPointerAbstractPackDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator() throws RecognitionException {
		return noPointerAbstractPackDeclarator(0);
	}

	private NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoPointerAbstractPackDeclaratorContext _localctx = new NoPointerAbstractPackDeclaratorContext(_ctx, _parentState);
		NoPointerAbstractPackDeclaratorContext _prevctx = _localctx;
		int _startState = 254;
		enterRecursionRule(_localctx, 254, RULE_noPointerAbstractPackDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1549);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerAbstractPackDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerAbstractPackDeclarator);
					setState(1551);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1561);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LeftParen:
						{
						setState(1552);
						parametersAndQualifiers();
						}
						break;
					case LeftBracket:
						{
						setState(1553);
						match(LeftBracket);
						setState(1555);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
							{
							setState(1554);
							constantExpression();
							}
						}

						setState(1557);
						match(RightBracket);
						setState(1559);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
						case 1:
							{
							setState(1558);
							attributeSpecifierSeq();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
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

	public static class ParameterDeclarationClauseContext extends ParserRuleContext {
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(PseudoCodeParser.Ellipsis, 0); }
		public TerminalNode Comma() { return getToken(PseudoCodeParser.Comma, 0); }
		public ParameterDeclarationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterParameterDeclarationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitParameterDeclarationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitParameterDeclarationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationClauseContext parameterDeclarationClause() throws RecognitionException {
		ParameterDeclarationClauseContext _localctx = new ParameterDeclarationClauseContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_parameterDeclarationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			parameterDeclarationList();
			setState(1573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma || _la==Ellipsis) {
				{
				setState(1570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1569);
					match(Comma);
					}
				}

				setState(1572);
				match(Ellipsis);
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

	public static class ParameterDeclarationListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoCodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoCodeParser.Comma, i);
		}
		public ParameterDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterParameterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitParameterDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitParameterDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationListContext parameterDeclarationList() throws RecognitionException {
		ParameterDeclarationListContext _localctx = new ParameterDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_parameterDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			parameterDeclaration();
			setState(1580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1576);
					match(Comma);
					setState(1577);
					parameterDeclaration();
					}
					} 
				}
				setState(1582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(PseudoCodeParser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1583);
				attributeSpecifierSeq();
				}
			}

			setState(1586);
			declSpecifierSeq();
			{
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1587);
				declarator();
				}
				break;
			case 2:
				{
				setState(1589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1588);
					abstractDeclarator();
					}
					break;
				}
				}
				break;
			}
			setState(1595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1593);
				match(Assign);
				setState(1594);
				initializerClause();
				}
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public VirtualSpecifierSeqContext virtualSpecifierSeq() {
			return getRuleContext(VirtualSpecifierSeqContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1597);
				attributeSpecifierSeq();
				}
			}

			setState(1601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1600);
				declSpecifierSeq();
				}
				break;
			}
			setState(1603);
			declarator();
			setState(1605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1604);
				virtualSpecifierSeq();
				}
			}

			setState(1607);
			functionBody();
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ConstructorInitializerContext constructorInitializer() {
			return getRuleContext(ConstructorInitializerContext.class,0);
		}
		public FunctionTryBlockContext functionTryBlock() {
			return getRuleContext(FunctionTryBlockContext.class,0);
		}
		public TerminalNode Assign() { return getToken(PseudoCodeParser.Assign, 0); }
		public TerminalNode Semi() { return getToken(PseudoCodeParser.Semi, 0); }
		public TerminalNode Default() { return getToken(PseudoCodeParser.Default, 0); }
		public TerminalNode Delete() { return getToken(PseudoCodeParser.Delete, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_functionBody);
		int _la;
		try {
			setState(1617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Colon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1609);
					constructorInitializer();
					}
				}

				setState(1612);
				compoundStatement();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 2);
				{
				setState(1613);
				functionTryBlock();
				}
				break;
			case Assign:
				enterOuterAlt(_localctx, 3);
				{
				setState(1614);
				match(Assign);
				setState(1615);
				_la = _input.LA(1);
				if ( !(_la==Default || _la==Delete) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1616);
				match(Semi);
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

	public static class InitializerContext extends ParserRuleContext {
		public BraceOrEqualInitializerContext braceOrEqualInitializer() {
			return getRuleContext(BraceOrEqualInitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_initializer);
		try {
			setState(1624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1619);
				braceOrEqualInitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1620);
				match(LeftParen);
				setState(1621);
				expressionList();
				setState(1622);
				match(RightParen);
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

	public static class BraceOrEqualInitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(PseudoCodeParser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public BraceOrEqualInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceOrEqualInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterBraceOrEqualInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitBraceOrEqualInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitBraceOrEqualInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BraceOrEqualInitializerContext braceOrEqualInitializer() throws RecognitionException {
		BraceOrEqualInitializerContext _localctx = new BraceOrEqualInitializerContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_braceOrEqualInitializer);
		try {
			setState(1629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1626);
				match(Assign);
				setState(1627);
				initializerClause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1628);
				bracedInitList();
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

	public static class InitializerClauseContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public InitializerClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInitializerClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInitializerClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInitializerClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerClauseContext initializerClause() throws RecognitionException {
		InitializerClauseContext _localctx = new InitializerClauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_initializerClause);
		try {
			setState(1633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case PointerLiteral:
			case UserDefinedLiteral:
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case Typeid_:
			case Typename_:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1631);
				assignmentExpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1632);
				bracedInitList();
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

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerClauseContext> initializerClause() {
			return getRuleContexts(InitializerClauseContext.class);
		}
		public InitializerClauseContext initializerClause(int i) {
			return getRuleContext(InitializerClauseContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(PseudoCodeParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(PseudoCodeParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoCodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoCodeParser.Comma, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			initializerClause();
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1636);
				match(Ellipsis);
				}
			}

			setState(1646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1639);
					match(Comma);
					setState(1640);
					initializerClause();
					setState(1642);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ellipsis) {
						{
						setState(1641);
						match(Ellipsis);
						}
					}

					}
					} 
				}
				setState(1648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
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

	public static class BracedInitListContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(PseudoCodeParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoCodeParser.RightBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PseudoCodeParser.Comma, 0); }
		public BracedInitListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedInitList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterBracedInitList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitBracedInitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitBracedInitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracedInitListContext bracedInitList() throws RecognitionException {
		BracedInitListContext _localctx = new BracedInitListContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_bracedInitList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			match(LeftBrace);
			setState(1654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
				{
				setState(1650);
				initializerList();
				setState(1652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1651);
					match(Comma);
					}
				}

				}
			}

			setState(1656);
			match(RightBrace);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_className);
		try {
			setState(1660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1658);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1659);
				simpleTemplateId();
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

	public static class ClassSpecifierContext extends ParserRuleContext {
		public ClassHeadContext classHead() {
			return getRuleContext(ClassHeadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(PseudoCodeParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoCodeParser.RightBrace, 0); }
		public MemberSpecificationContext memberSpecification() {
			return getRuleContext(MemberSpecificationContext.class,0);
		}
		public ClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSpecifierContext classSpecifier() throws RecognitionException {
		ClassSpecifierContext _localctx = new ClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_classSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			classHead();
			setState(1663);
			match(LeftBrace);
			setState(1665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Operator - 10)) | (1L << (Private - 10)) | (1L << (Protected - 10)) | (1L << (Public - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Colon - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(1664);
				memberSpecification();
				}
			}

			setState(1667);
			match(RightBrace);
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

	public static class ClassHeadContext extends ParserRuleContext {
		public ClassKeyContext classKey() {
			return getRuleContext(ClassKeyContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public ClassHeadNameContext classHeadName() {
			return getRuleContext(ClassHeadNameContext.class,0);
		}
		public BaseClauseContext baseClause() {
			return getRuleContext(BaseClauseContext.class,0);
		}
		public ClassVirtSpecifierContext classVirtSpecifier() {
			return getRuleContext(ClassVirtSpecifierContext.class,0);
		}
		public TerminalNode Union() { return getToken(PseudoCodeParser.Union, 0); }
		public ClassHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeadContext classHead() throws RecognitionException {
		ClassHeadContext _localctx = new ClassHeadContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_classHead);
		int _la;
		try {
			setState(1692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Struct:
				enterOuterAlt(_localctx, 1);
				{
				setState(1669);
				classKey();
				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1670);
					attributeSpecifierSeq();
					}
				}

				setState(1677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(1673);
					classHeadName();
					setState(1675);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(1674);
						classVirtSpecifier();
						}
					}

					}
				}

				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1679);
					baseClause();
					}
				}

				}
				break;
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1682);
				match(Union);
				setState(1684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1683);
					attributeSpecifierSeq();
					}
				}

				setState(1690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(1686);
					classHeadName();
					setState(1688);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(1687);
						classVirtSpecifier();
						}
					}

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

	public static class ClassHeadNameContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public ClassHeadNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeadName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassHeadName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassHeadName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassHeadName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeadNameContext classHeadName() throws RecognitionException {
		ClassHeadNameContext _localctx = new ClassHeadNameContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_classHeadName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1694);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1697);
			className();
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

	public static class ClassVirtSpecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(PseudoCodeParser.Final, 0); }
		public ClassVirtSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVirtSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassVirtSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassVirtSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassVirtSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVirtSpecifierContext classVirtSpecifier() throws RecognitionException {
		ClassVirtSpecifierContext _localctx = new ClassVirtSpecifierContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_classVirtSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1699);
			match(Final);
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

	public static class ClassKeyContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(PseudoCodeParser.Class, 0); }
		public TerminalNode Struct() { return getToken(PseudoCodeParser.Struct, 0); }
		public ClassKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassKeyContext classKey() throws RecognitionException {
		ClassKeyContext _localctx = new ClassKeyContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_classKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			_la = _input.LA(1);
			if ( !(_la==Class || _la==Struct) ) {
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

	public static class MemberSpecificationContext extends ParserRuleContext {
		public List<MemberdeclarationContext> memberdeclaration() {
			return getRuleContexts(MemberdeclarationContext.class);
		}
		public MemberdeclarationContext memberdeclaration(int i) {
			return getRuleContext(MemberdeclarationContext.class,i);
		}
		public List<AccessSpecifierContext> accessSpecifier() {
			return getRuleContexts(AccessSpecifierContext.class);
		}
		public AccessSpecifierContext accessSpecifier(int i) {
			return getRuleContext(AccessSpecifierContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(PseudoCodeParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(PseudoCodeParser.Colon, i);
		}
		public MemberSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMemberSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMemberSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMemberSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberSpecificationContext memberSpecification() throws RecognitionException {
		MemberSpecificationContext _localctx = new MemberSpecificationContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_memberSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1707);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Alignas:
				case Auto:
				case Bool:
				case Char:
				case Char16:
				case Char32:
				case Class:
				case Const:
				case Constexpr:
				case Decltype:
				case Double:
				case Enum:
				case Explicit:
				case Extern:
				case Float:
				case Friend:
				case Inline:
				case Int:
				case Long:
				case Mutable:
				case Operator:
				case Register:
				case Short:
				case Signed:
				case Static:
				case Static_assert:
				case Struct:
				case Template:
				case Thread_local:
				case Typedef:
				case Typename_:
				case Union:
				case Unsigned:
				case Using:
				case Virtual:
				case Void:
				case Volatile:
				case Wchar:
				case LeftParen:
				case LeftBracket:
				case Star:
				case And:
				case Tilde:
				case AndAnd:
				case Colon:
				case Doublecolon:
				case Semi:
				case Ellipsis:
				case Identifier:
					{
					setState(1703);
					memberdeclaration();
					}
					break;
				case Private:
				case Protected:
				case Public:
					{
					setState(1704);
					accessSpecifier();
					setState(1705);
					match(Colon);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1709); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Operator - 10)) | (1L << (Private - 10)) | (1L << (Protected - 10)) | (1L << (Public - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Colon - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0) );
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

	public static class MemberdeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(PseudoCodeParser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public MemberDeclaratorListContext memberDeclaratorList() {
			return getRuleContext(MemberDeclaratorListContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public UsingDeclarationContext usingDeclaration() {
			return getRuleContext(UsingDeclarationContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public AliasDeclarationContext aliasDeclaration() {
			return getRuleContext(AliasDeclarationContext.class,0);
		}
		public EmptyDeclarationContext emptyDeclaration() {
			return getRuleContext(EmptyDeclarationContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMemberdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMemberdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMemberdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_memberdeclaration);
		int _la;
		try {
			setState(1727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1712);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1711);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(1715);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1714);
					declSpecifierSeq();
					}
					break;
				}
				setState(1718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (LeftParen - 85)) | (1L << (LeftBracket - 85)) | (1L << (Star - 85)) | (1L << (And - 85)) | (1L << (Tilde - 85)) | (1L << (AndAnd - 85)) | (1L << (Colon - 85)) | (1L << (Doublecolon - 85)) | (1L << (Ellipsis - 85)) | (1L << (Identifier - 85)))) != 0)) {
					{
					setState(1717);
					memberDeclaratorList();
					}
				}

				setState(1720);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1721);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1722);
				usingDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1723);
				staticAssertDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1724);
				templateDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1725);
				aliasDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1726);
				emptyDeclaration();
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

	public static class MemberDeclaratorListContext extends ParserRuleContext {
		public List<MemberDeclaratorContext> memberDeclarator() {
			return getRuleContexts(MemberDeclaratorContext.class);
		}
		public MemberDeclaratorContext memberDeclarator(int i) {
			return getRuleContext(MemberDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoCodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoCodeParser.Comma, i);
		}
		public MemberDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMemberDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMemberDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMemberDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclaratorListContext memberDeclaratorList() throws RecognitionException {
		MemberDeclaratorListContext _localctx = new MemberDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_memberDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			memberDeclarator();
			setState(1734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1730);
				match(Comma);
				setState(1731);
				memberDeclarator();
				}
				}
				setState(1736);
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

	public static class MemberDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtualSpecifierSeqContext virtualSpecifierSeq() {
			return getRuleContext(VirtualSpecifierSeqContext.class,0);
		}
		public PureSpecifierContext pureSpecifier() {
			return getRuleContext(PureSpecifierContext.class,0);
		}
		public BraceOrEqualInitializerContext braceOrEqualInitializer() {
			return getRuleContext(BraceOrEqualInitializerContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PseudoCodeParser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public MemberDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMemberDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMemberDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMemberDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclaratorContext memberDeclarator() throws RecognitionException {
		MemberDeclaratorContext _localctx = new MemberDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_memberDeclarator);
		int _la;
		try {
			setState(1757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1737);
				declarator();
				setState(1747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1739);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final || _la==Override) {
						{
						setState(1738);
						virtualSpecifierSeq();
						}
					}

					setState(1742);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Assign) {
						{
						setState(1741);
						pureSpecifier();
						}
					}

					}
					break;
				case 2:
					{
					setState(1745);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBrace || _la==Assign) {
						{
						setState(1744);
						braceOrEqualInitializer();
						}
					}

					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1749);
					match(Identifier);
					}
				}

				setState(1753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1752);
					attributeSpecifierSeq();
					}
				}

				setState(1755);
				match(Colon);
				setState(1756);
				constantExpression();
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

	public static class VirtualSpecifierSeqContext extends ParserRuleContext {
		public List<VirtualSpecifierContext> virtualSpecifier() {
			return getRuleContexts(VirtualSpecifierContext.class);
		}
		public VirtualSpecifierContext virtualSpecifier(int i) {
			return getRuleContext(VirtualSpecifierContext.class,i);
		}
		public VirtualSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterVirtualSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitVirtualSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitVirtualSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtualSpecifierSeqContext virtualSpecifierSeq() throws RecognitionException {
		VirtualSpecifierSeqContext _localctx = new VirtualSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_virtualSpecifierSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1759);
				virtualSpecifier();
				}
				}
				setState(1762); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Final || _la==Override );
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

	public static class VirtualSpecifierContext extends ParserRuleContext {
		public TerminalNode Override() { return getToken(PseudoCodeParser.Override, 0); }
		public TerminalNode Final() { return getToken(PseudoCodeParser.Final, 0); }
		public VirtualSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterVirtualSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitVirtualSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitVirtualSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtualSpecifierContext virtualSpecifier() throws RecognitionException {
		VirtualSpecifierContext _localctx = new VirtualSpecifierContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_virtualSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			_la = _input.LA(1);
			if ( !(_la==Final || _la==Override) ) {
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

	public static class PureSpecifierContext extends ParserRuleContext {
		public Token val;
		public TerminalNode Assign() { return getToken(PseudoCodeParser.Assign, 0); }
		public TerminalNode OctalLiteral() { return getToken(PseudoCodeParser.OctalLiteral, 0); }
		public PureSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterPureSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitPureSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitPureSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PureSpecifierContext pureSpecifier() throws RecognitionException {
		PureSpecifierContext _localctx = new PureSpecifierContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_pureSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			match(Assign);
			setState(1767);
			((PureSpecifierContext)_localctx).val = match(OctalLiteral);
			if((((PureSpecifierContext)_localctx).val!=null?((PureSpecifierContext)_localctx).val.getText():null).compareTo("0")!=0) throw new InputMismatchException(this);
					
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

	public static class BaseClauseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(PseudoCodeParser.Colon, 0); }
		public BaseSpecifierListContext baseSpecifierList() {
			return getRuleContext(BaseSpecifierListContext.class,0);
		}
		public BaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterBaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitBaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitBaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseClauseContext baseClause() throws RecognitionException {
		BaseClauseContext _localctx = new BaseClauseContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_baseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			match(Colon);
			setState(1771);
			baseSpecifierList();
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

	public static class BaseSpecifierListContext extends ParserRuleContext {
		public List<BaseSpecifierContext> baseSpecifier() {
			return getRuleContexts(BaseSpecifierContext.class);
		}
		public BaseSpecifierContext baseSpecifier(int i) {
			return getRuleContext(BaseSpecifierContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(PseudoCodeParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(PseudoCodeParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoCodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoCodeParser.Comma, i);
		}
		public BaseSpecifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseSpecifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterBaseSpecifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitBaseSpecifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitBaseSpecifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseSpecifierListContext baseSpecifierList() throws RecognitionException {
		BaseSpecifierListContext _localctx = new BaseSpecifierListContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_baseSpecifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			baseSpecifier();
			setState(1775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1774);
				match(Ellipsis);
				}
			}

			setState(1784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1777);
				match(Comma);
				setState(1778);
				baseSpecifier();
				setState(1780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1779);
					match(Ellipsis);
					}
				}

				}
				}
				setState(1786);
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

	public static class BaseSpecifierContext extends ParserRuleContext {
		public BaseTypeSpecifierContext baseTypeSpecifier() {
			return getRuleContext(BaseTypeSpecifierContext.class,0);
		}
		public TerminalNode Virtual() { return getToken(PseudoCodeParser.Virtual, 0); }
		public AccessSpecifierContext accessSpecifier() {
			return getRuleContext(AccessSpecifierContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public BaseSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterBaseSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitBaseSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitBaseSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseSpecifierContext baseSpecifier() throws RecognitionException {
		BaseSpecifierContext _localctx = new BaseSpecifierContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_baseSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1787);
				attributeSpecifierSeq();
				}
			}

			setState(1802);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Doublecolon:
			case Identifier:
				{
				setState(1790);
				baseTypeSpecifier();
				}
				break;
			case Virtual:
				{
				setState(1791);
				match(Virtual);
				setState(1793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(1792);
					accessSpecifier();
					}
				}

				setState(1795);
				baseTypeSpecifier();
				}
				break;
			case Private:
			case Protected:
			case Public:
				{
				setState(1796);
				accessSpecifier();
				setState(1798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(1797);
					match(Virtual);
					}
				}

				setState(1800);
				baseTypeSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClassOrDeclTypeContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public ClassOrDeclTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrDeclType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterClassOrDeclType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitClassOrDeclType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitClassOrDeclType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrDeclTypeContext classOrDeclType() throws RecognitionException {
		ClassOrDeclTypeContext _localctx = new ClassOrDeclTypeContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_classOrDeclType);
		try {
			setState(1809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1805);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(1804);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1807);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1808);
				decltypeSpecifier();
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

	public static class BaseTypeSpecifierContext extends ParserRuleContext {
		public ClassOrDeclTypeContext classOrDeclType() {
			return getRuleContext(ClassOrDeclTypeContext.class,0);
		}
		public BaseTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterBaseTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitBaseTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitBaseTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeSpecifierContext baseTypeSpecifier() throws RecognitionException {
		BaseTypeSpecifierContext _localctx = new BaseTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_baseTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			classOrDeclType();
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

	public static class AccessSpecifierContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(PseudoCodeParser.Private, 0); }
		public TerminalNode Protected() { return getToken(PseudoCodeParser.Protected, 0); }
		public TerminalNode Public() { return getToken(PseudoCodeParser.Public, 0); }
		public AccessSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterAccessSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitAccessSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitAccessSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessSpecifierContext accessSpecifier() throws RecognitionException {
		AccessSpecifierContext _localctx = new AccessSpecifierContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_accessSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) ) {
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

	public static class ConversionFunctionIdContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(PseudoCodeParser.Operator, 0); }
		public ConversionTypeIdContext conversionTypeId() {
			return getRuleContext(ConversionTypeIdContext.class,0);
		}
		public ConversionFunctionIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionFunctionId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterConversionFunctionId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitConversionFunctionId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitConversionFunctionId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionFunctionIdContext conversionFunctionId() throws RecognitionException {
		ConversionFunctionIdContext _localctx = new ConversionFunctionIdContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_conversionFunctionId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
			match(Operator);
			setState(1816);
			conversionTypeId();
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

	public static class ConversionTypeIdContext extends ParserRuleContext {
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public ConversionDeclaratorContext conversionDeclarator() {
			return getRuleContext(ConversionDeclaratorContext.class,0);
		}
		public ConversionTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterConversionTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitConversionTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitConversionTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionTypeIdContext conversionTypeId() throws RecognitionException {
		ConversionTypeIdContext _localctx = new ConversionTypeIdContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_conversionTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			typeSpecifierSeq();
			setState(1820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(1819);
				conversionDeclarator();
				}
				break;
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

	public static class ConversionDeclaratorContext extends ParserRuleContext {
		public PointerOperatorContext pointerOperator() {
			return getRuleContext(PointerOperatorContext.class,0);
		}
		public ConversionDeclaratorContext conversionDeclarator() {
			return getRuleContext(ConversionDeclaratorContext.class,0);
		}
		public ConversionDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterConversionDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitConversionDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitConversionDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionDeclaratorContext conversionDeclarator() throws RecognitionException {
		ConversionDeclaratorContext _localctx = new ConversionDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_conversionDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			pointerOperator();
			setState(1824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(1823);
				conversionDeclarator();
				}
				break;
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

	public static class ConstructorInitializerContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(PseudoCodeParser.Colon, 0); }
		public MemInitializerListContext memInitializerList() {
			return getRuleContext(MemInitializerListContext.class,0);
		}
		public ConstructorInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterConstructorInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitConstructorInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitConstructorInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorInitializerContext constructorInitializer() throws RecognitionException {
		ConstructorInitializerContext _localctx = new ConstructorInitializerContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_constructorInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826);
			match(Colon);
			setState(1827);
			memInitializerList();
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

	public static class MemInitializerListContext extends ParserRuleContext {
		public List<MemInitializerContext> memInitializer() {
			return getRuleContexts(MemInitializerContext.class);
		}
		public MemInitializerContext memInitializer(int i) {
			return getRuleContext(MemInitializerContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(PseudoCodeParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(PseudoCodeParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoCodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoCodeParser.Comma, i);
		}
		public MemInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMemInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMemInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMemInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemInitializerListContext memInitializerList() throws RecognitionException {
		MemInitializerListContext _localctx = new MemInitializerListContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_memInitializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			memInitializer();
			setState(1831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1830);
				match(Ellipsis);
				}
			}

			setState(1840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1833);
				match(Comma);
				setState(1834);
				memInitializer();
				setState(1836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1835);
					match(Ellipsis);
					}
				}

				}
				}
				setState(1842);
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

	public static class MemInitializerContext extends ParserRuleContext {
		public MeminitializeridContext meminitializerid() {
			return getRuleContext(MeminitializeridContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public MemInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMemInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMemInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMemInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemInitializerContext memInitializer() throws RecognitionException {
		MemInitializerContext _localctx = new MemInitializerContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_memInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1843);
			meminitializerid();
			setState(1850);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				{
				setState(1844);
				match(LeftParen);
				setState(1846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(1845);
					expressionList();
					}
				}

				setState(1848);
				match(RightParen);
				}
				break;
			case LeftBrace:
				{
				setState(1849);
				bracedInitList();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MeminitializeridContext extends ParserRuleContext {
		public ClassOrDeclTypeContext classOrDeclType() {
			return getRuleContext(ClassOrDeclTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterMeminitializerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitMeminitializerid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitMeminitializerid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_meminitializerid);
		try {
			setState(1854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1852);
				classOrDeclType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1853);
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

	public static class OperatorFunctionIdContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(PseudoCodeParser.Operator, 0); }
		public TheOperatorContext theOperator() {
			return getRuleContext(TheOperatorContext.class,0);
		}
		public OperatorFunctionIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorFunctionId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterOperatorFunctionId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitOperatorFunctionId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitOperatorFunctionId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorFunctionIdContext operatorFunctionId() throws RecognitionException {
		OperatorFunctionIdContext _localctx = new OperatorFunctionIdContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_operatorFunctionId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
			match(Operator);
			setState(1857);
			theOperator();
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

	public static class LiteralOperatorIdContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(PseudoCodeParser.Operator, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoCodeParser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TerminalNode UserDefinedStringLiteral() { return getToken(PseudoCodeParser.UserDefinedStringLiteral, 0); }
		public LiteralOperatorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalOperatorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterLiteralOperatorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitLiteralOperatorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitLiteralOperatorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralOperatorIdContext literalOperatorId() throws RecognitionException {
		LiteralOperatorIdContext _localctx = new LiteralOperatorIdContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_literalOperatorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			match(Operator);
			setState(1863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(1860);
				match(StringLiteral);
				setState(1861);
				match(Identifier);
				}
				break;
			case UserDefinedStringLiteral:
				{
				setState(1862);
				match(UserDefinedStringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TemplateDeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(PseudoCodeParser.Template, 0); }
		public TerminalNode Less() { return getToken(PseudoCodeParser.Less, 0); }
		public TemplateparameterListContext templateparameterList() {
			return getRuleContext(TemplateparameterListContext.class,0);
		}
		public TerminalNode Greater() { return getToken(PseudoCodeParser.Greater, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTemplateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTemplateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTemplateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			match(Template);
			setState(1866);
			match(Less);
			setState(1867);
			templateparameterList();
			setState(1868);
			match(Greater);
			setState(1869);
			declaration();
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

	public static class TemplateparameterListContext extends ParserRuleContext {
		public List<TemplateParameterContext> templateParameter() {
			return getRuleContexts(TemplateParameterContext.class);
		}
		public TemplateParameterContext templateParameter(int i) {
			return getRuleContext(TemplateParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoCodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoCodeParser.Comma, i);
		}
		public TemplateparameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTemplateparameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTemplateparameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTemplateparameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateparameterListContext templateparameterList() throws RecognitionException {
		TemplateparameterListContext _localctx = new TemplateparameterListContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_templateparameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
			templateParameter();
			setState(1876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1872);
				match(Comma);
				setState(1873);
				templateParameter();
				}
				}
				setState(1878);
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

	public static class TemplateParameterContext extends ParserRuleContext {
		public TypeParameterContext typeParameter() {
			return getRuleContext(TypeParameterContext.class,0);
		}
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public TemplateParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTemplateParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTemplateParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTemplateParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateParameterContext templateParameter() throws RecognitionException {
		TemplateParameterContext _localctx = new TemplateParameterContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_templateParameter);
		try {
			setState(1881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1879);
				typeParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1880);
				parameterDeclaration();
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(PseudoCodeParser.Class, 0); }
		public TerminalNode Typename_() { return getToken(PseudoCodeParser.Typename_, 0); }
		public TerminalNode Assign() { return getToken(PseudoCodeParser.Assign, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoCodeParser.Template, 0); }
		public TerminalNode Less() { return getToken(PseudoCodeParser.Less, 0); }
		public TemplateparameterListContext templateparameterList() {
			return getRuleContext(TemplateparameterListContext.class,0);
		}
		public TerminalNode Greater() { return getToken(PseudoCodeParser.Greater, 0); }
		public TerminalNode Ellipsis() { return getToken(PseudoCodeParser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
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
		enterRule(_localctx, 338, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1892);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Template:
				{
				setState(1888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1883);
					match(Template);
					setState(1884);
					match(Less);
					setState(1885);
					templateparameterList();
					setState(1886);
					match(Greater);
					}
				}

				setState(1890);
				match(Class);
				}
				break;
			case Typename_:
				{
				setState(1891);
				match(Typename_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				{
				setState(1895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1894);
					match(Ellipsis);
					}
				}

				setState(1898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1897);
					match(Identifier);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(1901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1900);
					match(Identifier);
					}
				}

				setState(1903);
				match(Assign);
				setState(1904);
				theTypeId();
				}
				}
				break;
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

	public static class SimpleTemplateIdContext extends ParserRuleContext {
		public TemplateNameContext templateName() {
			return getRuleContext(TemplateNameContext.class,0);
		}
		public TerminalNode Less() { return getToken(PseudoCodeParser.Less, 0); }
		public TerminalNode Greater() { return getToken(PseudoCodeParser.Greater, 0); }
		public TemplateArgumentListContext templateArgumentList() {
			return getRuleContext(TemplateArgumentListContext.class,0);
		}
		public SimpleTemplateIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTemplateId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterSimpleTemplateId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitSimpleTemplateId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitSimpleTemplateId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTemplateIdContext simpleTemplateId() throws RecognitionException {
		SimpleTemplateIdContext _localctx = new SimpleTemplateIdContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_simpleTemplateId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			templateName();
			setState(1908);
			match(Less);
			setState(1910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
				{
				setState(1909);
				templateArgumentList();
				}
			}

			setState(1912);
			match(Greater);
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

	public static class TemplateIdContext extends ParserRuleContext {
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Less() { return getToken(PseudoCodeParser.Less, 0); }
		public TerminalNode Greater() { return getToken(PseudoCodeParser.Greater, 0); }
		public OperatorFunctionIdContext operatorFunctionId() {
			return getRuleContext(OperatorFunctionIdContext.class,0);
		}
		public LiteralOperatorIdContext literalOperatorId() {
			return getRuleContext(LiteralOperatorIdContext.class,0);
		}
		public TemplateArgumentListContext templateArgumentList() {
			return getRuleContext(TemplateArgumentListContext.class,0);
		}
		public TemplateIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTemplateId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTemplateId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTemplateId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateIdContext templateId() throws RecognitionException {
		TemplateIdContext _localctx = new TemplateIdContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_templateId);
		int _la;
		try {
			setState(1925);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1914);
				simpleTemplateId();
				}
				break;
			case Operator:
				enterOuterAlt(_localctx, 2);
				{
				setState(1917);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
				case 1:
					{
					setState(1915);
					operatorFunctionId();
					}
					break;
				case 2:
					{
					setState(1916);
					literalOperatorId();
					}
					break;
				}
				setState(1919);
				match(Less);
				setState(1921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (Struct - 65)) | (1L << (This - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
					{
					setState(1920);
					templateArgumentList();
					}
				}

				setState(1923);
				match(Greater);
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

	public static class TemplateNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public TemplateNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTemplateName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTemplateName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTemplateName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateNameContext templateName() throws RecognitionException {
		TemplateNameContext _localctx = new TemplateNameContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_templateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
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

	public static class TemplateArgumentListContext extends ParserRuleContext {
		public List<TemplateArgumentContext> templateArgument() {
			return getRuleContexts(TemplateArgumentContext.class);
		}
		public TemplateArgumentContext templateArgument(int i) {
			return getRuleContext(TemplateArgumentContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(PseudoCodeParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(PseudoCodeParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoCodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoCodeParser.Comma, i);
		}
		public TemplateArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTemplateArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTemplateArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTemplateArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateArgumentListContext templateArgumentList() throws RecognitionException {
		TemplateArgumentListContext _localctx = new TemplateArgumentListContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_templateArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			templateArgument();
			setState(1931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1930);
				match(Ellipsis);
				}
			}

			setState(1940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1933);
				match(Comma);
				setState(1934);
				templateArgument();
				setState(1936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1935);
					match(Ellipsis);
					}
				}

				}
				}
				setState(1942);
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

	public static class TemplateArgumentContext extends ParserRuleContext {
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public TemplateArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTemplateArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTemplateArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTemplateArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateArgumentContext templateArgument() throws RecognitionException {
		TemplateArgumentContext _localctx = new TemplateArgumentContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_templateArgument);
		try {
			setState(1946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1943);
				theTypeId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1944);
				constantExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1945);
				idExpression();
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

	public static class TypeNameSpecifierContext extends ParserRuleContext {
		public TerminalNode Typename_() { return getToken(PseudoCodeParser.Typename_, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoCodeParser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoCodeParser.Template, 0); }
		public TypeNameSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNameSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeNameSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeNameSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeNameSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameSpecifierContext typeNameSpecifier() throws RecognitionException {
		TypeNameSpecifierContext _localctx = new TypeNameSpecifierContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_typeNameSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1948);
			match(Typename_);
			setState(1949);
			nestedNameSpecifier(0);
			setState(1955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				setState(1950);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1951);
					match(Template);
					}
				}

				setState(1954);
				simpleTemplateId();
				}
				break;
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

	public static class ExplicitInstantiationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(PseudoCodeParser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Extern() { return getToken(PseudoCodeParser.Extern, 0); }
		public ExplicitInstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitInstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExplicitInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExplicitInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExplicitInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitInstantiationContext explicitInstantiation() throws RecognitionException {
		ExplicitInstantiationContext _localctx = new ExplicitInstantiationContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_explicitInstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(1957);
				match(Extern);
				}
			}

			setState(1960);
			match(Template);
			setState(1961);
			declaration();
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

	public static class ExplicitSpecializationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(PseudoCodeParser.Template, 0); }
		public TerminalNode Less() { return getToken(PseudoCodeParser.Less, 0); }
		public TerminalNode Greater() { return getToken(PseudoCodeParser.Greater, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitSpecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitSpecialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExplicitSpecialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExplicitSpecialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExplicitSpecialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitSpecializationContext explicitSpecialization() throws RecognitionException {
		ExplicitSpecializationContext _localctx = new ExplicitSpecializationContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_explicitSpecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1963);
			match(Template);
			setState(1964);
			match(Less);
			setState(1965);
			match(Greater);
			setState(1966);
			declaration();
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

	public static class TryBlockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(PseudoCodeParser.Try, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public HandlerSeqContext handlerSeq() {
			return getRuleContext(HandlerSeqContext.class,0);
		}
		public TryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryBlockContext tryBlock() throws RecognitionException {
		TryBlockContext _localctx = new TryBlockContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_tryBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			match(Try);
			setState(1969);
			compoundStatement();
			setState(1970);
			handlerSeq();
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

	public static class FunctionTryBlockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(PseudoCodeParser.Try, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public HandlerSeqContext handlerSeq() {
			return getRuleContext(HandlerSeqContext.class,0);
		}
		public ConstructorInitializerContext constructorInitializer() {
			return getRuleContext(ConstructorInitializerContext.class,0);
		}
		public FunctionTryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterFunctionTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitFunctionTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitFunctionTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTryBlockContext functionTryBlock() throws RecognitionException {
		FunctionTryBlockContext _localctx = new FunctionTryBlockContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_functionTryBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			match(Try);
			setState(1974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1973);
				constructorInitializer();
				}
			}

			setState(1976);
			compoundStatement();
			setState(1977);
			handlerSeq();
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

	public static class HandlerSeqContext extends ParserRuleContext {
		public List<HandlerContext> handler() {
			return getRuleContexts(HandlerContext.class);
		}
		public HandlerContext handler(int i) {
			return getRuleContext(HandlerContext.class,i);
		}
		public HandlerSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterHandlerSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitHandlerSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitHandlerSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerSeqContext handlerSeq() throws RecognitionException {
		HandlerSeqContext _localctx = new HandlerSeqContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_handlerSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1979);
				handler();
				}
				}
				setState(1982); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Catch );
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

	public static class HandlerContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(PseudoCodeParser.Catch, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public ExceptionDeclarationContext exceptionDeclaration() {
			return getRuleContext(ExceptionDeclarationContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1984);
			match(Catch);
			setState(1985);
			match(LeftParen);
			setState(1986);
			exceptionDeclaration();
			setState(1987);
			match(RightParen);
			setState(1988);
			compoundStatement();
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

	public static class ExceptionDeclarationContext extends ParserRuleContext {
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(PseudoCodeParser.Ellipsis, 0); }
		public ExceptionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExceptionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExceptionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExceptionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionDeclarationContext exceptionDeclaration() throws RecognitionException {
		ExceptionDeclarationContext _localctx = new ExceptionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_exceptionDeclaration);
		int _la;
		try {
			setState(1999);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Alignas:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename_:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case LeftBracket:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1990);
					attributeSpecifierSeq();
					}
				}

				setState(1993);
				typeSpecifierSeq();
				setState(1996);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(1994);
					declarator();
					}
					break;
				case 2:
					{
					setState(1995);
					abstractDeclarator();
					}
					break;
				}
				}
				break;
			case Ellipsis:
				enterOuterAlt(_localctx, 2);
				{
				setState(1998);
				match(Ellipsis);
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

	public static class ThrowExpressionContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(PseudoCodeParser.Throw, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ThrowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterThrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitThrowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitThrowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowExpressionContext throwExpression() throws RecognitionException {
		ThrowExpressionContext _localctx = new ThrowExpressionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_throwExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2001);
			match(Throw);
			setState(2003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Static_cast - 65)) | (1L << (This - 65)) | (1L << (Throw - 65)) | (1L << (Typeid_ - 65)) | (1L << (Typename_ - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)))) != 0) || _la==Identifier) {
				{
				setState(2002);
				assignmentExpression();
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

	public static class ExceptionSpecificationContext extends ParserRuleContext {
		public DynamicExceptionSpecificationContext dynamicExceptionSpecification() {
			return getRuleContext(DynamicExceptionSpecificationContext.class,0);
		}
		public NoeExceptSpecificationContext noeExceptSpecification() {
			return getRuleContext(NoeExceptSpecificationContext.class,0);
		}
		public ExceptionSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterExceptionSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitExceptionSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitExceptionSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionSpecificationContext exceptionSpecification() throws RecognitionException {
		ExceptionSpecificationContext _localctx = new ExceptionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_exceptionSpecification);
		try {
			setState(2007);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2005);
				dynamicExceptionSpecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2006);
				noeExceptSpecification();
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

	public static class DynamicExceptionSpecificationContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(PseudoCodeParser.Throw, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public TypeIdListContext typeIdList() {
			return getRuleContext(TypeIdListContext.class,0);
		}
		public DynamicExceptionSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicExceptionSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterDynamicExceptionSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitDynamicExceptionSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitDynamicExceptionSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicExceptionSpecificationContext dynamicExceptionSpecification() throws RecognitionException {
		DynamicExceptionSpecificationContext _localctx = new DynamicExceptionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_dynamicExceptionSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2009);
			match(Throw);
			setState(2010);
			match(LeftParen);
			setState(2012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (Auto - 13)) | (1L << (Bool - 13)) | (1L << (Char - 13)) | (1L << (Char16 - 13)) | (1L << (Char32 - 13)) | (1L << (Class - 13)) | (1L << (Const - 13)) | (1L << (Decltype - 13)) | (1L << (Double - 13)) | (1L << (Enum - 13)) | (1L << (Float - 13)) | (1L << (Int - 13)) | (1L << (Long - 13)) | (1L << (Short - 13)) | (1L << (Signed - 13)) | (1L << (Struct - 13)) | (1L << (Typename_ - 13)))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Union - 77)) | (1L << (Unsigned - 77)) | (1L << (Void - 77)) | (1L << (Volatile - 77)) | (1L << (Wchar - 77)) | (1L << (Doublecolon - 77)) | (1L << (Identifier - 77)))) != 0)) {
				{
				setState(2011);
				typeIdList();
				}
			}

			setState(2014);
			match(RightParen);
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

	public static class TypeIdListContext extends ParserRuleContext {
		public List<TheTypeIdContext> theTypeId() {
			return getRuleContexts(TheTypeIdContext.class);
		}
		public TheTypeIdContext theTypeId(int i) {
			return getRuleContext(TheTypeIdContext.class,i);
		}
		public List<TerminalNode> Ellipsis() { return getTokens(PseudoCodeParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(PseudoCodeParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoCodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoCodeParser.Comma, i);
		}
		public TypeIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTypeIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTypeIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTypeIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdListContext typeIdList() throws RecognitionException {
		TypeIdListContext _localctx = new TypeIdListContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_typeIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
			theTypeId();
			setState(2018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(2017);
				match(Ellipsis);
				}
			}

			setState(2027);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(2020);
				match(Comma);
				setState(2021);
				theTypeId();
				setState(2023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2022);
					match(Ellipsis);
					}
				}

				}
				}
				setState(2029);
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

	public static class NoeExceptSpecificationContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(PseudoCodeParser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public NoeExceptSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noeExceptSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterNoeExceptSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitNoeExceptSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitNoeExceptSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoeExceptSpecificationContext noeExceptSpecification() throws RecognitionException {
		NoeExceptSpecificationContext _localctx = new NoeExceptSpecificationContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_noeExceptSpecification);
		try {
			setState(2036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2030);
				match(Noexcept);
				setState(2031);
				match(LeftParen);
				setState(2032);
				constantExpression();
				setState(2033);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2035);
				match(Noexcept);
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

	public static class TheOperatorContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(PseudoCodeParser.New, 0); }
		public TerminalNode LeftBracket() { return getToken(PseudoCodeParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoCodeParser.RightBracket, 0); }
		public TerminalNode Delete() { return getToken(PseudoCodeParser.Delete, 0); }
		public TerminalNode Plus() { return getToken(PseudoCodeParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(PseudoCodeParser.Minus, 0); }
		public TerminalNode Star() { return getToken(PseudoCodeParser.Star, 0); }
		public TerminalNode Div() { return getToken(PseudoCodeParser.Div, 0); }
		public TerminalNode Mod() { return getToken(PseudoCodeParser.Mod, 0); }
		public TerminalNode Caret() { return getToken(PseudoCodeParser.Caret, 0); }
		public TerminalNode And() { return getToken(PseudoCodeParser.And, 0); }
		public TerminalNode Or() { return getToken(PseudoCodeParser.Or, 0); }
		public TerminalNode Tilde() { return getToken(PseudoCodeParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(PseudoCodeParser.Not, 0); }
		public TerminalNode Assign() { return getToken(PseudoCodeParser.Assign, 0); }
		public List<TerminalNode> Greater() { return getTokens(PseudoCodeParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(PseudoCodeParser.Greater, i);
		}
		public List<TerminalNode> Less() { return getTokens(PseudoCodeParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(PseudoCodeParser.Less, i);
		}
		public TerminalNode GreaterEqual() { return getToken(PseudoCodeParser.GreaterEqual, 0); }
		public TerminalNode PlusAssign() { return getToken(PseudoCodeParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(PseudoCodeParser.MinusAssign, 0); }
		public TerminalNode StarAssign() { return getToken(PseudoCodeParser.StarAssign, 0); }
		public TerminalNode ModAssign() { return getToken(PseudoCodeParser.ModAssign, 0); }
		public TerminalNode XorAssign() { return getToken(PseudoCodeParser.XorAssign, 0); }
		public TerminalNode AndAssign() { return getToken(PseudoCodeParser.AndAssign, 0); }
		public TerminalNode OrAssign() { return getToken(PseudoCodeParser.OrAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(PseudoCodeParser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(PseudoCodeParser.LeftShiftAssign, 0); }
		public TerminalNode Equal() { return getToken(PseudoCodeParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(PseudoCodeParser.NotEqual, 0); }
		public TerminalNode LessEqual() { return getToken(PseudoCodeParser.LessEqual, 0); }
		public TerminalNode AndAnd() { return getToken(PseudoCodeParser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(PseudoCodeParser.OrOr, 0); }
		public TerminalNode PlusPlus() { return getToken(PseudoCodeParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(PseudoCodeParser.MinusMinus, 0); }
		public TerminalNode Comma() { return getToken(PseudoCodeParser.Comma, 0); }
		public TerminalNode ArrowStar() { return getToken(PseudoCodeParser.ArrowStar, 0); }
		public TerminalNode Arrow() { return getToken(PseudoCodeParser.Arrow, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoCodeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoCodeParser.RightParen, 0); }
		public TheOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).enterTheOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoCodeListener ) ((PseudoCodeListener)listener).exitTheOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoCodeVisitor ) return ((PseudoCodeVisitor<? extends T>)visitor).visitTheOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheOperatorContext theOperator() throws RecognitionException {
		TheOperatorContext _localctx = new TheOperatorContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_theOperator);
		try {
			setState(2091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2038);
				match(New);
				setState(2041);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2039);
					match(LeftBracket);
					setState(2040);
					match(RightBracket);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2043);
				match(Delete);
				setState(2046);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2044);
					match(LeftBracket);
					setState(2045);
					match(RightBracket);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2048);
				match(Plus);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2049);
				match(Minus);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2050);
				match(Star);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2051);
				match(Div);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2052);
				match(Mod);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2053);
				match(Caret);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2054);
				match(And);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2055);
				match(Or);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2056);
				match(Tilde);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2057);
				match(Not);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2058);
				match(Assign);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2059);
				match(Greater);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2060);
				match(Less);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2061);
				match(GreaterEqual);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2062);
				match(PlusAssign);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2063);
				match(MinusAssign);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2064);
				match(StarAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2065);
				match(Assign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2066);
				match(ModAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2067);
				match(XorAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2068);
				match(AndAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2069);
				match(OrAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2070);
				match(Less);
				setState(2071);
				match(Less);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2072);
				match(Greater);
				setState(2073);
				match(Greater);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2074);
				match(RightShiftAssign);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2075);
				match(LeftShiftAssign);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2076);
				match(Equal);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2077);
				match(NotEqual);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2078);
				match(LessEqual);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2079);
				match(GreaterEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2080);
				match(AndAnd);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2081);
				match(OrOr);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2082);
				match(PlusPlus);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2083);
				match(MinusMinus);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2084);
				match(Comma);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2085);
				match(ArrowStar);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2086);
				match(Arrow);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2087);
				match(LeftParen);
				setState(2088);
				match(RightParen);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2089);
				match(LeftBracket);
				setState(2090);
				match(RightBracket);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(PseudoCodeParser.IntegerLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(PseudoCodeParser.CharacterLiteral, 0); }
		public TerminalNode FloatingLiteral() { return getToken(PseudoCodeParser.FloatingLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoCodeParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(PseudoCodeParser.BooleanLiteral, 0); }
		public TerminalNode PointerLiteral() { return getToken(PseudoCodeParser.PointerLiteral, 0); }
		public TerminalNode UserDefinedLiteral() { return getToken(PseudoCodeParser.UserDefinedLiteral, 0); }
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
		enterRule(_localctx, 378, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return nestedNameSpecifier_sempred((NestedNameSpecifierContext)_localctx, predIndex);
		case 15:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 25:
			return noPointerNewDeclarator_sempred((NoPointerNewDeclaratorContext)_localctx, predIndex);
		case 114:
			return noPointerDeclarator_sempred((NoPointerDeclaratorContext)_localctx, predIndex);
		case 125:
			return noPointerAbstractDeclarator_sempred((NoPointerAbstractDeclaratorContext)_localctx, predIndex);
		case 127:
			return noPointerAbstractPackDeclarator_sempred((NoPointerAbstractPackDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nestedNameSpecifier_sempred(NestedNameSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noPointerNewDeclarator_sempred(NoPointerNewDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noPointerDeclarator_sempred(NoPointerDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noPointerAbstractDeclarator_sempred(NoPointerAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean noPointerAbstractPackDeclarator_sempred(NoPointerAbstractPackDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0093\u0832\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"\3\2\5\2\u0180\n\2\3\2\3\2\3\3\6\3\u0185\n\3\r\3\16\3\u0186\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3\u0190\n\3\3\4\3\4\5\4\u0194\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u019d\n\5\3\5\5\5\u01a0\n\5\3\6\3\6\5\6\u01a4\n\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\5\7\u01ac\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u01b3\n\7\3"+
		"\7\5\7\u01b6\n\7\3\7\7\7\u01b9\n\7\f\7\16\7\u01bc\13\7\3\b\3\b\5\b\u01c0"+
		"\n\b\3\b\3\b\3\t\3\t\5\t\u01c6\n\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u01ce\n"+
		"\n\5\n\u01d0\n\n\3\13\3\13\3\f\3\f\3\f\7\f\u01d7\n\f\f\f\16\f\u01da\13"+
		"\f\3\f\5\f\u01dd\n\f\3\r\3\r\5\r\u01e1\n\r\3\16\5\16\u01e4\n\16\3\16\3"+
		"\16\5\16\u01e8\n\16\3\17\5\17\u01eb\n\17\3\17\3\17\3\17\3\20\3\20\5\20"+
		"\u01f2\n\20\3\20\3\20\5\20\u01f6\n\20\3\20\5\20\u01f9\n\20\3\20\5\20\u01fc"+
		"\n\20\3\20\5\20\u01ff\n\20\3\21\3\21\3\21\3\21\5\21\u0205\n\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u020c\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u021a\n\21\3\21\3\21\5\21\u021e\n\21\3"+
		"\21\3\21\3\21\3\21\5\21\u0224\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0234\n\21\3\21\3\21\5\21\u0238"+
		"\n\21\7\21\u023a\n\21\f\21\16\21\u023d\13\21\3\22\3\22\3\23\3\23\3\24"+
		"\5\24\u0244\n\24\3\24\3\24\3\24\5\24\u0249\n\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0256\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u025d\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0269\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0273\n"+
		"\25\3\26\3\26\3\27\5\27\u0278\n\27\3\27\3\27\5\27\u027c\n\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0283\n\27\3\27\5\27\u0286\n\27\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\5\31\u028e\n\31\3\32\3\32\5\32\u0292\n\32\3\32\5\32\u0295"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u029c\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u02a3\n\33\7\33\u02a5\n\33\f\33\16\33\u02a8\13\33\3\34\3\34\5\34"+
		"\u02ac\n\34\3\34\3\34\5\34\u02b0\n\34\3\35\5\35\u02b3\n\35\3\35\3\35\3"+
		"\35\5\35\u02b8\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u02c7\n\37\3 \3 \3 \7 \u02cc\n \f \16 \u02cf\13 "+
		"\3!\3!\3!\7!\u02d4\n!\f!\16!\u02d7\13!\3\"\3\"\3\"\7\"\u02dc\n\"\f\"\16"+
		"\"\u02df\13\"\3\"\3\"\3\"\3\"\3\"\7\"\u02e6\n\"\f\"\16\"\u02e9\13\"\5"+
		"\"\u02eb\n\"\3#\3#\3#\3#\7#\u02f1\n#\f#\16#\u02f4\13#\3$\3$\3$\3$\5$\u02fa"+
		"\n$\3%\3%\3%\7%\u02ff\n%\f%\16%\u0302\13%\3&\3&\3&\7&\u0307\n&\f&\16&"+
		"\u030a\13&\3&\3&\3&\5&\u030f\n&\3\'\3\'\3\'\7\'\u0314\n\'\f\'\16\'\u0317"+
		"\13\'\3(\3(\3(\7(\u031c\n(\f(\16(\u031f\13(\3)\3)\3)\7)\u0324\n)\f)\16"+
		")\u0327\13)\3*\3*\3*\7*\u032c\n*\f*\16*\u032f\13*\3+\3+\3+\7+\u0334\n"+
		"+\f+\16+\u0337\13+\3,\3,\3,\3,\3,\3,\5,\u033f\n,\3-\3-\3-\3-\3-\3-\5-"+
		"\u0347\n-\3.\3.\3/\3/\3/\7/\u034e\n/\f/\16/\u0351\13/\3\60\3\60\3\61\3"+
		"\61\5\61\u0357\n\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u035f\n\61\3\61"+
		"\5\61\u0362\n\61\3\62\5\62\u0365\n\62\3\62\3\62\3\62\3\62\5\62\u036b\n"+
		"\62\3\62\3\62\3\62\3\63\5\63\u0371\n\63\3\63\3\63\3\64\3\64\5\64\u0377"+
		"\n\64\3\64\3\64\3\65\6\65\u037c\n\65\r\65\16\65\u037d\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\5\67\u0389\n\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\5\67\u0391\n\67\38\38\58\u0395\n8\38\38\38\38\38\58\u039c\n8\58"+
		"\u039e\n8\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u03b2"+
		"\n9\39\39\59\u03b6\n9\39\39\39\39\59\u03bc\n9\39\39\39\59\u03c1\n9\3:"+
		"\3:\5:\u03c5\n:\3;\5;\u03c8\n;\3;\3;\3;\3<\3<\5<\u03cf\n<\3=\3=\3=\3="+
		"\3=\5=\u03d6\n=\3=\3=\5=\u03da\n=\3=\3=\3>\3>\3?\6?\u03e1\n?\r?\16?\u03e2"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u03ee\n@\3A\3A\3A\3A\3A\3A\3A\3A\5A\u03f8"+
		"\nA\3B\3B\3B\5B\u03fd\nB\3B\3B\3B\3B\3C\5C\u0404\nC\3C\5C\u0407\nC\3C"+
		"\3C\3C\5C\u040c\nC\3C\3C\3C\5C\u0411\nC\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E"+
		"\3F\3F\3F\3G\3G\3G\3G\3G\3G\5G\u0426\nG\3H\6H\u0429\nH\rH\16H\u042a\3"+
		"H\5H\u042e\nH\3I\3I\3J\3J\3K\3K\3L\3L\3L\5L\u0439\nL\3M\3M\3M\3M\5M\u043f"+
		"\nM\3N\6N\u0442\nN\rN\16N\u0443\3N\5N\u0447\nN\3O\6O\u044a\nO\rO\16O\u044b"+
		"\3O\5O\u044f\nO\3P\5P\u0452\nP\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\5P\u0468\nP\3Q\3Q\3Q\3Q\5Q\u046e\nQ\3R\3R\3R\3R"+
		"\5R\u0474\nR\3R\3R\3S\3S\5S\u047a\nS\3S\5S\u047d\nS\3S\3S\3S\3S\5S\u0483"+
		"\nS\3S\3S\5S\u0487\nS\3S\3S\5S\u048b\nS\3S\5S\u048e\nS\3T\3T\3U\3U\3U"+
		"\3U\5U\u0496\nU\5U\u0498\nU\3U\3U\3V\3V\5V\u049e\nV\3V\5V\u04a1\nV\3V"+
		"\5V\u04a4\nV\3V\5V\u04a7\nV\3W\3W\5W\u04ab\nW\3W\3W\5W\u04af\nW\3W\3W"+
		"\3X\3X\5X\u04b5\nX\3Y\3Y\3Y\3Z\3Z\3Z\7Z\u04bd\nZ\fZ\16Z\u04c0\13Z\3[\3"+
		"[\3[\5[\u04c5\n[\3\\\3\\\3]\3]\5]\u04cb\n]\3^\3^\3_\5_\u04d0\n_\3_\3_"+
		"\3_\5_\u04d5\n_\3_\3_\5_\u04d9\n_\3_\3_\3`\3`\3a\3a\3a\3a\3a\3a\3b\5b"+
		"\u04e6\nb\3b\3b\3c\3c\5c\u04ec\nc\3c\3c\5c\u04f0\nc\3c\3c\3c\3d\5d\u04f6"+
		"\nd\3d\3d\3d\5d\u04fb\nd\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\5f\u050a"+
		"\nf\3f\3f\5f\u050e\nf\3g\6g\u0511\ng\rg\16g\u0512\3h\3h\3h\5h\u0518\n"+
		"h\3h\3h\3h\5h\u051d\nh\3i\3i\3i\3i\5i\u0523\ni\3i\5i\u0526\ni\3i\3i\3"+
		"j\3j\3j\7j\u052d\nj\fj\16j\u0530\13j\3j\5j\u0533\nj\3k\3k\3k\5k\u0538"+
		"\nk\3k\3k\5k\u053c\nk\3l\3l\3m\3m\5m\u0542\nm\3m\3m\3n\6n\u0547\nn\rn"+
		"\16n\u0548\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\6o\u0558\no\ro\16o\u0559"+
		"\5o\u055c\no\3p\3p\3p\7p\u0561\np\fp\16p\u0564\13p\3q\3q\5q\u0568\nq\3"+
		"r\3r\3r\3r\3r\5r\u056f\nr\3s\3s\5s\u0573\ns\7s\u0575\ns\fs\16s\u0578\13"+
		"s\3s\3s\3t\3t\3t\5t\u057f\nt\3t\3t\3t\3t\5t\u0585\nt\3t\3t\3t\3t\5t\u058b"+
		"\nt\3t\3t\5t\u058f\nt\5t\u0591\nt\7t\u0593\nt\ft\16t\u0596\13t\3u\3u\5"+
		"u\u059a\nu\3u\3u\5u\u059e\nu\3u\5u\u05a1\nu\3u\5u\u05a4\nu\3u\5u\u05a7"+
		"\nu\3v\3v\3v\5v\u05ac\nv\3w\3w\5w\u05b0\nw\3w\5w\u05b3\nw\3w\3w\5w\u05b7"+
		"\nw\3w\5w\u05ba\nw\5w\u05bc\nw\3x\6x\u05bf\nx\rx\16x\u05c0\3y\3y\3z\3"+
		"z\3{\5{\u05c8\n{\3{\3{\3|\3|\5|\u05ce\n|\3}\3}\5}\u05d2\n}\3}\3}\3}\3"+
		"}\5}\u05d8\n}\3~\3~\6~\u05dc\n~\r~\16~\u05dd\3~\5~\u05e1\n~\5~\u05e3\n"+
		"~\3\177\3\177\3\177\3\177\5\177\u05e9\n\177\3\177\3\177\5\177\u05ed\n"+
		"\177\3\177\3\177\3\177\3\177\5\177\u05f3\n\177\3\177\3\177\3\177\3\177"+
		"\3\177\5\177\u05fa\n\177\3\177\3\177\5\177\u05fe\n\177\5\177\u0600\n\177"+
		"\7\177\u0602\n\177\f\177\16\177\u0605\13\177\3\u0080\7\u0080\u0608\n\u0080"+
		"\f\u0080\16\u0080\u060b\13\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0616\n\u0081\3\u0081\3\u0081"+
		"\5\u0081\u061a\n\u0081\5\u0081\u061c\n\u0081\7\u0081\u061e\n\u0081\f\u0081"+
		"\16\u0081\u0621\13\u0081\3\u0082\3\u0082\5\u0082\u0625\n\u0082\3\u0082"+
		"\5\u0082\u0628\n\u0082\3\u0083\3\u0083\3\u0083\7\u0083\u062d\n\u0083\f"+
		"\u0083\16\u0083\u0630\13\u0083\3\u0084\5\u0084\u0633\n\u0084\3\u0084\3"+
		"\u0084\3\u0084\5\u0084\u0638\n\u0084\5\u0084\u063a\n\u0084\3\u0084\3\u0084"+
		"\5\u0084\u063e\n\u0084\3\u0085\5\u0085\u0641\n\u0085\3\u0085\5\u0085\u0644"+
		"\n\u0085\3\u0085\3\u0085\5\u0085\u0648\n\u0085\3\u0085\3\u0085\3\u0086"+
		"\5\u0086\u064d\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086"+
		"\u0654\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u065b\n"+
		"\u0087\3\u0088\3\u0088\3\u0088\5\u0088\u0660\n\u0088\3\u0089\3\u0089\5"+
		"\u0089\u0664\n\u0089\3\u008a\3\u008a\5\u008a\u0668\n\u008a\3\u008a\3\u008a"+
		"\3\u008a\5\u008a\u066d\n\u008a\7\u008a\u066f\n\u008a\f\u008a\16\u008a"+
		"\u0672\13\u008a\3\u008b\3\u008b\3\u008b\5\u008b\u0677\n\u008b\5\u008b"+
		"\u0679\n\u008b\3\u008b\3\u008b\3\u008c\3\u008c\5\u008c\u067f\n\u008c\3"+
		"\u008d\3\u008d\3\u008d\5\u008d\u0684\n\u008d\3\u008d\3\u008d\3\u008e\3"+
		"\u008e\5\u008e\u068a\n\u008e\3\u008e\3\u008e\5\u008e\u068e\n\u008e\5\u008e"+
		"\u0690\n\u008e\3\u008e\5\u008e\u0693\n\u008e\3\u008e\3\u008e\5\u008e\u0697"+
		"\n\u008e\3\u008e\3\u008e\5\u008e\u069b\n\u008e\5\u008e\u069d\n\u008e\5"+
		"\u008e\u069f\n\u008e\3\u008f\5\u008f\u06a2\n\u008f\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\6\u0092\u06ae"+
		"\n\u0092\r\u0092\16\u0092\u06af\3\u0093\5\u0093\u06b3\n\u0093\3\u0093"+
		"\5\u0093\u06b6\n\u0093\3\u0093\5\u0093\u06b9\n\u0093\3\u0093\3\u0093\3"+
		"\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u06c2\n\u0093\3\u0094\3"+
		"\u0094\3\u0094\7\u0094\u06c7\n\u0094\f\u0094\16\u0094\u06ca\13\u0094\3"+
		"\u0095\3\u0095\5\u0095\u06ce\n\u0095\3\u0095\5\u0095\u06d1\n\u0095\3\u0095"+
		"\5\u0095\u06d4\n\u0095\5\u0095\u06d6\n\u0095\3\u0095\5\u0095\u06d9\n\u0095"+
		"\3\u0095\5\u0095\u06dc\n\u0095\3\u0095\3\u0095\5\u0095\u06e0\n\u0095\3"+
		"\u0096\6\u0096\u06e3\n\u0096\r\u0096\16\u0096\u06e4\3\u0097\3\u0097\3"+
		"\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a"+
		"\5\u009a\u06f2\n\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u06f7\n\u009a\7"+
		"\u009a\u06f9\n\u009a\f\u009a\16\u009a\u06fc\13\u009a\3\u009b\5\u009b\u06ff"+
		"\n\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u0704\n\u009b\3\u009b\3\u009b"+
		"\3\u009b\5\u009b\u0709\n\u009b\3\u009b\3\u009b\5\u009b\u070d\n\u009b\3"+
		"\u009c\5\u009c\u0710\n\u009c\3\u009c\3\u009c\5\u009c\u0714\n\u009c\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\5\u00a0"+
		"\u071f\n\u00a0\3\u00a1\3\u00a1\5\u00a1\u0723\n\u00a1\3\u00a2\3\u00a2\3"+
		"\u00a2\3\u00a3\3\u00a3\5\u00a3\u072a\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5"+
		"\u00a3\u072f\n\u00a3\7\u00a3\u0731\n\u00a3\f\u00a3\16\u00a3\u0734\13\u00a3"+
		"\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0739\n\u00a4\3\u00a4\3\u00a4\5\u00a4"+
		"\u073d\n\u00a4\3\u00a5\3\u00a5\5\u00a5\u0741\n\u00a5\3\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u074a\n\u00a7\3\u00a8\3"+
		"\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\7\u00a9"+
		"\u0755\n\u00a9\f\u00a9\16\u00a9\u0758\13\u00a9\3\u00aa\3\u00aa\5\u00aa"+
		"\u075c\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0763\n"+
		"\u00ab\3\u00ab\3\u00ab\5\u00ab\u0767\n\u00ab\3\u00ab\5\u00ab\u076a\n\u00ab"+
		"\3\u00ab\5\u00ab\u076d\n\u00ab\3\u00ab\5\u00ab\u0770\n\u00ab\3\u00ab\3"+
		"\u00ab\5\u00ab\u0774\n\u00ab\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0779\n\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0780\n\u00ad\3\u00ad"+
		"\3\u00ad\5\u00ad\u0784\n\u00ad\3\u00ad\3\u00ad\5\u00ad\u0788\n\u00ad\3"+
		"\u00ae\3\u00ae\3\u00af\3\u00af\5\u00af\u078e\n\u00af\3\u00af\3\u00af\3"+
		"\u00af\5\u00af\u0793\n\u00af\7\u00af\u0795\n\u00af\f\u00af\16\u00af\u0798"+
		"\13\u00af\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u079d\n\u00b0\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\5\u00b1\u07a3\n\u00b1\3\u00b1\5\u00b1\u07a6\n\u00b1\3"+
		"\u00b2\5\u00b2\u07a9\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3"+
		"\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5"+
		"\5\u00b5\u07b9\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b6\6\u00b6\u07bf\n"+
		"\u00b6\r\u00b6\16\u00b6\u07c0\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b8\5\u00b8\u07ca\n\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8"+
		"\u07cf\n\u00b8\3\u00b8\5\u00b8\u07d2\n\u00b8\3\u00b9\3\u00b9\5\u00b9\u07d6"+
		"\n\u00b9\3\u00ba\3\u00ba\5\u00ba\u07da\n\u00ba\3\u00bb\3\u00bb\3\u00bb"+
		"\5\u00bb\u07df\n\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\5\u00bc\u07e5\n"+
		"\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u07ea\n\u00bc\7\u00bc\u07ec\n\u00bc"+
		"\f\u00bc\16\u00bc\u07ef\13\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\5\u00bd\u07f7\n\u00bd\3\u00be\3\u00be\3\u00be\5\u00be\u07fc\n"+
		"\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0801\n\u00be\3\u00be\3\u00be\3"+
		"\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u082e\n\u00be\3\u00bf"+
		"\3\u00bf\3\u00bf\2\b\f \64\u00e6\u00fc\u0100\u00c0\2\4\6\b\n\f\16\20\22"+
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
		"\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\2\27\4\2ccgg\6\2\32\32"+
		"!!<<CC\4\2~~\u0083\u0083\4\2]_cf\4\2}}\u0084\u0084\3\2_a\3\2]^\3\2z{\4"+
		"\2hivw\3\2tu\4\2ggjs\7\2&&\61\61;;AAHH\5\2$$..RR\4\2\27\27DD\3\2W\\\4"+
		"\2ccxx\4\2\30\30TT\3\2\35\36\4\2((\67\67\3\28:\3\2\3\t\2\u0918\2\u017f"+
		"\3\2\2\2\4\u018f\3\2\2\2\6\u0193\3\2\2\2\b\u019f\3\2\2\2\n\u01a1\3\2\2"+
		"\2\f\u01a7\3\2\2\2\16\u01bd\3\2\2\2\20\u01c3\3\2\2\2\22\u01cf\3\2\2\2"+
		"\24\u01d1\3\2\2\2\26\u01d3\3\2\2\2\30\u01e0\3\2\2\2\32\u01e7\3\2\2\2\34"+
		"\u01ea\3\2\2\2\36\u01ef\3\2\2\2 \u021d\3\2\2\2\"\u023e\3\2\2\2$\u0240"+
		"\3\2\2\2&\u0255\3\2\2\2(\u0272\3\2\2\2*\u0274\3\2\2\2,\u0277\3\2\2\2."+
		"\u0287\3\2\2\2\60\u028b\3\2\2\2\62\u0294\3\2\2\2\64\u0296\3\2\2\2\66\u02af"+
		"\3\2\2\28\u02b2\3\2\2\2:\u02bb\3\2\2\2<\u02c6\3\2\2\2>\u02c8\3\2\2\2@"+
		"\u02d0\3\2\2\2B\u02ea\3\2\2\2D\u02ec\3\2\2\2F\u02f9\3\2\2\2H\u02fb\3\2"+
		"\2\2J\u030e\3\2\2\2L\u0310\3\2\2\2N\u0318\3\2\2\2P\u0320\3\2\2\2R\u0328"+
		"\3\2\2\2T\u0330\3\2\2\2V\u0338\3\2\2\2X\u0346\3\2\2\2Z\u0348\3\2\2\2\\"+
		"\u034a\3\2\2\2^\u0352\3\2\2\2`\u0361\3\2\2\2b\u0364\3\2\2\2d\u0370\3\2"+
		"\2\2f\u0374\3\2\2\2h\u037b\3\2\2\2j\u037f\3\2\2\2l\u0390\3\2\2\2n\u039d"+
		"\3\2\2\2p\u03c0\3\2\2\2r\u03c4\3\2\2\2t\u03c7\3\2\2\2v\u03ce\3\2\2\2x"+
		"\u03d9\3\2\2\2z\u03dd\3\2\2\2|\u03e0\3\2\2\2~\u03ed\3\2\2\2\u0080\u03f7"+
		"\3\2\2\2\u0082\u03f9\3\2\2\2\u0084\u0410\3\2\2\2\u0086\u0412\3\2\2\2\u0088"+
		"\u041a\3\2\2\2\u008a\u041c\3\2\2\2\u008c\u0425\3\2\2\2\u008e\u0428\3\2"+
		"\2\2\u0090\u042f\3\2\2\2\u0092\u0431\3\2\2\2\u0094\u0433\3\2\2\2\u0096"+
		"\u0438\3\2\2\2\u0098\u043e\3\2\2\2\u009a\u0441\3\2\2\2\u009c\u0449\3\2"+
		"\2\2\u009e\u0467\3\2\2\2\u00a0\u046d\3\2\2\2\u00a2\u046f\3\2\2\2\u00a4"+
		"\u048d\3\2\2\2\u00a6\u048f\3\2\2\2\u00a8\u0491\3\2\2\2\u00aa\u049b\3\2"+
		"\2\2\u00ac\u04a8\3\2\2\2\u00ae\u04b2\3\2\2\2\u00b0\u04b6\3\2\2\2\u00b2"+
		"\u04b9\3\2\2\2\u00b4\u04c1\3\2\2\2\u00b6\u04c6\3\2\2\2\u00b8\u04ca\3\2"+
		"\2\2\u00ba\u04cc\3\2\2\2\u00bc\u04cf\3\2\2\2\u00be\u04dc\3\2\2\2\u00c0"+
		"\u04de\3\2\2\2\u00c2\u04e5\3\2\2\2\u00c4\u04e9\3\2\2\2\u00c6\u04f5\3\2"+
		"\2\2\u00c8\u04ff\3\2\2\2\u00ca\u0505\3\2\2\2\u00cc\u0510\3\2\2\2\u00ce"+
		"\u051c\3\2\2\2\u00d0\u051e\3\2\2\2\u00d2\u0529\3\2\2\2\u00d4\u0537\3\2"+
		"\2\2\u00d6\u053d\3\2\2\2\u00d8\u053f\3\2\2\2\u00da\u0546\3\2\2\2\u00dc"+
		"\u055b\3\2\2\2\u00de\u055d\3\2\2\2\u00e0\u0565\3\2\2\2\u00e2\u056e\3\2"+
		"\2\2\u00e4\u0576\3\2\2\2\u00e6\u0584\3\2\2\2\u00e8\u0597\3\2\2\2\u00ea"+
		"\u05a8\3\2\2\2\u00ec\u05bb\3\2\2\2\u00ee\u05be\3\2\2\2\u00f0\u05c2\3\2"+
		"\2\2\u00f2\u05c4\3\2\2\2\u00f4\u05c7\3\2\2\2\u00f6\u05cb\3\2\2\2\u00f8"+
		"\u05d7\3\2\2\2\u00fa\u05e2\3\2\2\2\u00fc\u05f2\3\2\2\2\u00fe\u0609\3\2"+
		"\2\2\u0100\u060e\3\2\2\2\u0102\u0622\3\2\2\2\u0104\u0629\3\2\2\2\u0106"+
		"\u0632\3\2\2\2\u0108\u0640\3\2\2\2\u010a\u0653\3\2\2\2\u010c\u065a\3\2"+
		"\2\2\u010e\u065f\3\2\2\2\u0110\u0663\3\2\2\2\u0112\u0665\3\2\2\2\u0114"+
		"\u0673\3\2\2\2\u0116\u067e\3\2\2\2\u0118\u0680\3\2\2\2\u011a\u069e\3\2"+
		"\2\2\u011c\u06a1\3\2\2\2\u011e\u06a5\3\2\2\2\u0120\u06a7\3\2\2\2\u0122"+
		"\u06ad\3\2\2\2\u0124\u06c1\3\2\2\2\u0126\u06c3\3\2\2\2\u0128\u06df\3\2"+
		"\2\2\u012a\u06e2\3\2\2\2\u012c\u06e6\3\2\2\2\u012e\u06e8\3\2\2\2\u0130"+
		"\u06ec\3\2\2\2\u0132\u06ef\3\2\2\2\u0134\u06fe\3\2\2\2\u0136\u0713\3\2"+
		"\2\2\u0138\u0715\3\2\2\2\u013a\u0717\3\2\2\2\u013c\u0719\3\2\2\2\u013e"+
		"\u071c\3\2\2\2\u0140\u0720\3\2\2\2\u0142\u0724\3\2\2\2\u0144\u0727\3\2"+
		"\2\2\u0146\u0735\3\2\2\2\u0148\u0740\3\2\2\2\u014a\u0742\3\2\2\2\u014c"+
		"\u0745\3\2\2\2\u014e\u074b\3\2\2\2\u0150\u0751\3\2\2\2\u0152\u075b\3\2"+
		"\2\2\u0154\u0766\3\2\2\2\u0156\u0775\3\2\2\2\u0158\u0787\3\2\2\2\u015a"+
		"\u0789\3\2\2\2\u015c\u078b\3\2\2\2\u015e\u079c\3\2\2\2\u0160\u079e\3\2"+
		"\2\2\u0162\u07a8\3\2\2\2\u0164\u07ad\3\2\2\2\u0166\u07b2\3\2\2\2\u0168"+
		"\u07b6\3\2\2\2\u016a\u07be\3\2\2\2\u016c\u07c2\3\2\2\2\u016e\u07d1\3\2"+
		"\2\2\u0170\u07d3\3\2\2\2\u0172\u07d9\3\2\2\2\u0174\u07db\3\2\2\2\u0176"+
		"\u07e2\3\2\2\2\u0178\u07f6\3\2\2\2\u017a\u082d\3\2\2\2\u017c\u082f\3\2"+
		"\2\2\u017e\u0180\5|?\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181\u0182\7\2\2\3\u0182\3\3\2\2\2\u0183\u0185\5\u017c\u00bf"+
		"\2\u0184\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187\u0190\3\2\2\2\u0188\u0190\7G\2\2\u0189\u018a\7W\2\2\u018a"+
		"\u018b\5\\/\2\u018b\u018c\7X\2\2\u018c\u0190\3\2\2\2\u018d\u0190\5\6\4"+
		"\2\u018e\u0190\5\16\b\2\u018f\u0184\3\2\2\2\u018f\u0188\3\2\2\2\u018f"+
		"\u0189\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190\5\3\2\2\2"+
		"\u0191\u0194\5\b\5\2\u0192\u0194\5\n\6\2\u0193\u0191\3\2\2\2\u0193\u0192"+
		"\3\2\2\2\u0194\7\3\2\2\2\u0195\u01a0\7\u0086\2\2\u0196\u01a0\5\u014a\u00a6"+
		"\2\u0197\u01a0\5\u013c\u009f\2\u0198\u01a0\5\u014c\u00a7\2\u0199\u019c"+
		"\7e\2\2\u019a\u019d\5\u0116\u008c\2\u019b\u019d\5\u00a2R\2\u019c\u019a"+
		"\3\2\2\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u01a0\5\u0158\u00ad"+
		"\2\u019f\u0195\3\2\2\2\u019f\u0196\3\2\2\2\u019f\u0197\3\2\2\2\u019f\u0198"+
		"\3\2\2\2\u019f\u0199\3\2\2\2\u019f\u019e\3\2\2\2\u01a0\t\3\2\2\2\u01a1"+
		"\u01a3\5\f\7\2\u01a2\u01a4\7F\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\5\b\5\2\u01a6\13\3\2\2\2\u01a7\u01ab"+
		"\b\7\1\2\u01a8\u01ac\5\u00a0Q\2\u01a9\u01ac\5\u00b8]\2\u01aa\u01ac\5\u00a2"+
		"R\2\u01ab\u01a8\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7\u0081\2\2\u01ae\u01ba"+
		"\3\2\2\2\u01af\u01b5\f\3\2\2\u01b0\u01b6\7\u0086\2\2\u01b1\u01b3\7F\2"+
		"\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6"+
		"\5\u0156\u00ac\2\u01b5\u01b0\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b6\u01b7\3"+
		"\2\2\2\u01b7\u01b9\7\u0081\2\2\u01b8\u01af\3\2\2\2\u01b9\u01bc\3\2\2\2"+
		"\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\r\3\2\2\2\u01bc\u01ba\3"+
		"\2\2\2\u01bd\u01bf\5\20\t\2\u01be\u01c0\5\36\20\2\u01bf\u01be\3\2\2\2"+
		"\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\5f\64\2\u01c2\17"+
		"\3\2\2\2\u01c3\u01c5\7Y\2\2\u01c4\u01c6\5\22\n\2\u01c5\u01c4\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7Z\2\2\u01c8\21\3\2\2\2"+
		"\u01c9\u01d0\5\26\f\2\u01ca\u01cd\5\24\13\2\u01cb\u01cc\7|\2\2\u01cc\u01ce"+
		"\5\26\f\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2"+
		"\u01cf\u01c9\3\2\2\2\u01cf\u01ca\3\2\2\2\u01d0\23\3\2\2\2\u01d1\u01d2"+
		"\t\2\2\2\u01d2\25\3\2\2\2\u01d3\u01d8\5\30\r\2\u01d4\u01d5\7|\2\2\u01d5"+
		"\u01d7\5\30\r\2\u01d6\u01d4\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3"+
		"\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01db"+
		"\u01dd\7\u0085\2\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\27\3"+
		"\2\2\2\u01de\u01e1\5\32\16\2\u01df\u01e1\5\34\17\2\u01e0\u01de\3\2\2\2"+
		"\u01e0\u01df\3\2\2\2\u01e1\31\3\2\2\2\u01e2\u01e4\7c\2\2\u01e3\u01e2\3"+
		"\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e8\7\u0086\2\2"+
		"\u01e6\u01e8\7G\2\2\u01e7\u01e3\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8\33\3"+
		"\2\2\2\u01e9\u01eb\7c\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ed\7\u0086\2\2\u01ed\u01ee\5\u010c\u0087\2\u01ee"+
		"\35\3\2\2\2\u01ef\u01f1\7W\2\2\u01f0\u01f2\5\u0102\u0082\2\u01f1\u01f0"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\7X\2\2\u01f4"+
		"\u01f6\7\61\2\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3"+
		"\2\2\2\u01f7\u01f9\5\u0172\u00ba\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2"+
		"\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01fc\5\u00ccg\2\u01fb\u01fa\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ff\5\u00eav\2\u01fe\u01fd"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\37\3\2\2\2\u0200\u0201\b\21\1\2\u0201"+
		"\u021e\5\4\3\2\u0202\u0205\5\u009eP\2\u0203\u0205\5\u0160\u00b1\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205\u020b\3\2\2\2\u0206\u0207\7W"+
		"\2\2\u0207\u0208\5$\23\2\u0208\u0209\7X\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u020c\5\u0114\u008b\2\u020b\u0206\3\2\2\2\u020b\u020a\3\2\2\2\u020c\u021e"+
		"\3\2\2\2\u020d\u020e\t\3\2\2\u020e\u020f\7h\2\2\u020f\u0210\5\u00f6|\2"+
		"\u0210\u0211\7i\2\2\u0211\u0212\7W\2\2\u0212\u0213\5\\/\2\u0213\u0214"+
		"\7X\2\2\u0214\u021e\3\2\2\2\u0215\u0216\5\"\22\2\u0216\u0219\7W\2\2\u0217"+
		"\u021a\5\\/\2\u0218\u021a\5\u00f6|\2\u0219\u0217\3\2\2\2\u0219\u0218\3"+
		"\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\7X\2\2\u021c\u021e\3\2\2\2\u021d"+
		"\u0200\3\2\2\2\u021d\u0204\3\2\2\2\u021d\u020d\3\2\2\2\u021d\u0215\3\2"+
		"\2\2\u021e\u023b\3\2\2\2\u021f\u0220\f\t\2\2\u0220\u0223\7Y\2\2\u0221"+
		"\u0224\5\\/\2\u0222\u0224\5\u0114\u008b\2\u0223\u0221\3\2\2\2\u0223\u0222"+
		"\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\7Z\2\2\u0226\u023a\3\2\2\2\u0227"+
		"\u0228\f\b\2\2\u0228\u0229\7W\2\2\u0229\u022a\5$\23\2\u022a\u022b\7X\2"+
		"\2\u022b\u023a\3\2\2\2\u022c\u022d\f\7\2\2\u022d\u022e\7W\2\2\u022e\u022f"+
		"\7X\2\2\u022f\u023a\b\21\1\2\u0230\u0231\f\5\2\2\u0231\u0237\t\4\2\2\u0232"+
		"\u0234\7F\2\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235\u0238\5\6\4\2\u0236\u0238\5&\24\2\u0237\u0233\3\2\2\2\u0237"+
		"\u0236\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u021f\3\2\2\2\u0239\u0227\3\2"+
		"\2\2\u0239\u022c\3\2\2\2\u0239\u0230\3\2\2\2\u023a\u023d\3\2\2\2\u023b"+
		"\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c!\3\2\2\2\u023d\u023b\3\2\2\2"+
		"\u023e\u023f\7M\2\2\u023f#\3\2\2\2\u0240\u0241\5\u0112\u008a\2\u0241%"+
		"\3\2\2\2\u0242\u0244\5\f\7\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u0248\3\2\2\2\u0245\u0246\5\u00a0Q\2\u0246\u0247\7\u0081\2\2\u0247\u0249"+
		"\3\2\2\2\u0248\u0245\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024b\7e\2\2\u024b\u0256\5\u00a0Q\2\u024c\u024d\5\f\7\2\u024d\u024e\7"+
		"F\2\2\u024e\u024f\5\u0156\u00ac\2\u024f\u0250\7\u0081\2\2\u0250\u0251"+
		"\7e\2\2\u0251\u0252\5\u00a0Q\2\u0252\u0256\3\2\2\2\u0253\u0254\7e\2\2"+
		"\u0254\u0256\5\u00a2R\2\u0255\u0243\3\2\2\2\u0255\u024c\3\2\2\2\u0255"+
		"\u0253\3\2\2\2\u0256\'\3\2\2\2\u0257\u0273\5 \21\2\u0258\u025d\7z\2\2"+
		"\u0259\u025d\7{\2\2\u025a\u025d\5*\26\2\u025b\u025d\7@\2\2\u025c\u0258"+
		"\3\2\2\2\u025c\u0259\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025b\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u0273\5(\25\2\u025f\u0268\7@\2\2\u0260\u0261\7W\2"+
		"\2\u0261\u0262\5\u00f6|\2\u0262\u0263\7X\2\2\u0263\u0269\3\2\2\2\u0264"+
		"\u0265\7\u0085\2\2\u0265\u0266\7W\2\2\u0266\u0267\7\u0086\2\2\u0267\u0269"+
		"\7X\2\2\u0268\u0260\3\2\2\2\u0268\u0264\3\2\2\2\u0269\u0273\3\2\2\2\u026a"+
		"\u026b\7\r\2\2\u026b\u026c\7W\2\2\u026c\u026d\5\u00f6|\2\u026d\u026e\7"+
		"X\2\2\u026e\u0273\3\2\2\2\u026f\u0273\5:\36\2\u0270\u0273\5,\27\2\u0271"+
		"\u0273\58\35\2\u0272\u0257\3\2\2\2\u0272\u025c\3\2\2\2\u0272\u025f\3\2"+
		"\2\2\u0272\u026a\3\2\2\2\u0272\u026f\3\2\2\2\u0272\u0270\3\2\2\2\u0272"+
		"\u0271\3\2\2\2\u0273)\3\2\2\2\u0274\u0275\t\5\2\2\u0275+\3\2\2\2\u0276"+
		"\u0278\7\u0081\2\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279"+
		"\3\2\2\2\u0279\u027b\7\63\2\2\u027a\u027c\5.\30\2\u027b\u027a\3\2\2\2"+
		"\u027b\u027c\3\2\2\2\u027c\u0282\3\2\2\2\u027d\u0283\5\60\31\2\u027e\u027f"+
		"\7W\2\2\u027f\u0280\5\u00f6|\2\u0280\u0281\7X\2\2\u0281\u0283\3\2\2\2"+
		"\u0282\u027d\3\2\2\2\u0282\u027e\3\2\2\2\u0283\u0285\3\2\2\2\u0284\u0286"+
		"\5\66\34\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286-\3\2\2\2\u0287"+
		"\u0288\7W\2\2\u0288\u0289\5$\23\2\u0289\u028a\7X\2\2\u028a/\3\2\2\2\u028b"+
		"\u028d\5\u009aN\2\u028c\u028e\5\62\32\2\u028d\u028c\3\2\2\2\u028d\u028e"+
		"\3\2\2\2\u028e\61\3\2\2\2\u028f\u0291\5\u00ecw\2\u0290\u0292\5\62\32\2"+
		"\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0295"+
		"\5\64\33\2\u0294\u028f\3\2\2\2\u0294\u0293\3\2\2\2\u0295\63\3\2\2\2\u0296"+
		"\u0297\b\33\1\2\u0297\u0298\7Y\2\2\u0298\u0299\5\\/\2\u0299\u029b\7Z\2"+
		"\2\u029a\u029c\5\u00ccg\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c"+
		"\u02a6\3\2\2\2\u029d\u029e\f\3\2\2\u029e\u029f\7Y\2\2\u029f\u02a0\5^\60"+
		"\2\u02a0\u02a2\7Z\2\2\u02a1\u02a3\5\u00ccg\2\u02a2\u02a1\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3\u02a5\3\2\2\2\u02a4\u029d\3\2\2\2\u02a5\u02a8\3\2"+
		"\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\65\3\2\2\2\u02a8\u02a6"+
		"\3\2\2\2\u02a9\u02ab\7W\2\2\u02aa\u02ac\5$\23\2\u02ab\u02aa\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02b0\7X\2\2\u02ae\u02b0\5\u0114"+
		"\u008b\2\u02af\u02a9\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0\67\3\2\2\2\u02b1"+
		"\u02b3\7\u0081\2\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4"+
		"\3\2\2\2\u02b4\u02b7\7\36\2\2\u02b5\u02b6\7Y\2\2\u02b6\u02b8\7Z\2\2\u02b7"+
		"\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\5<"+
		"\37\2\u02ba9\3\2\2\2\u02bb\u02bc\7\64\2\2\u02bc\u02bd\7W\2\2\u02bd\u02be"+
		"\5\\/\2\u02be\u02bf\7X\2\2\u02bf;\3\2\2\2\u02c0\u02c7\5(\25\2\u02c1\u02c2"+
		"\7W\2\2\u02c2\u02c3\5\u00f6|\2\u02c3\u02c4\7X\2\2\u02c4\u02c5\5<\37\2"+
		"\u02c5\u02c7\3\2\2\2\u02c6\u02c0\3\2\2\2\u02c6\u02c1\3\2\2\2\u02c7=\3"+
		"\2\2\2\u02c8\u02cd\5<\37\2\u02c9\u02ca\t\6\2\2\u02ca\u02cc\5<\37\2\u02cb"+
		"\u02c9\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2"+
		"\2\2\u02ce?\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d5\5> \2\u02d1\u02d2"+
		"\t\7\2\2\u02d2\u02d4\5> \2\u02d3\u02d1\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5"+
		"\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6A\3\2\2\2\u02d7\u02d5\3\2\2\2"+
		"\u02d8\u02dd\5@!\2\u02d9\u02da\t\b\2\2\u02da\u02dc\5@!\2\u02db\u02d9\3"+
		"\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de"+
		"\u02eb\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e7\5@!\2\u02e1\u02e2\t\t\2"+
		"\2\u02e2\u02e3\5@!\2\u02e3\u02e4\b\"\1\2\u02e4\u02e6\3\2\2\2\u02e5\u02e1"+
		"\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8"+
		"\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02d8\3\2\2\2\u02ea\u02e0\3\2"+
		"\2\2\u02ebC\3\2\2\2\u02ec\u02f2\5B\"\2\u02ed\u02ee\5F$\2\u02ee\u02ef\5"+
		"B\"\2\u02ef\u02f1\3\2\2\2\u02f0\u02ed\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2"+
		"\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3E\3\2\2\2\u02f4\u02f2\3\2\2\2"+
		"\u02f5\u02f6\7i\2\2\u02f6\u02fa\7i\2\2\u02f7\u02f8\7h\2\2\u02f8\u02fa"+
		"\7h\2\2\u02f9\u02f5\3\2\2\2\u02f9\u02f7\3\2\2\2\u02faG\3\2\2\2\u02fb\u0300"+
		"\5D#\2\u02fc\u02fd\t\n\2\2\u02fd\u02ff\5D#\2\u02fe\u02fc\3\2\2\2\u02ff"+
		"\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301I\3\2\2\2"+
		"\u0302\u0300\3\2\2\2\u0303\u0308\5H%\2\u0304\u0305\t\13\2\2\u0305\u0307"+
		"\5H%\2\u0306\u0304\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308"+
		"\u0309\3\2\2\2\u0309\u030f\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u030c\5 "+
		"\21\2\u030c\u030d\t\t\2\2\u030d\u030f\3\2\2\2\u030e\u0303\3\2\2\2\u030e"+
		"\u030b\3\2\2\2\u030fK\3\2\2\2\u0310\u0315\5J&\2\u0311\u0312\7c\2\2\u0312"+
		"\u0314\5J&\2\u0313\u0311\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2"+
		"\2\u0315\u0316\3\2\2\2\u0316M\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u031d"+
		"\5L\'\2\u0319\u031a\7b\2\2\u031a\u031c\5L\'\2\u031b\u0319\3\2\2\2\u031c"+
		"\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031eO\3\2\2\2"+
		"\u031f\u031d\3\2\2\2\u0320\u0325\5N(\2\u0321\u0322\7d\2\2\u0322\u0324"+
		"\5N(\2\u0323\u0321\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325"+
		"\u0326\3\2\2\2\u0326Q\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u032d\5P)\2\u0329"+
		"\u032a\7x\2\2\u032a\u032c\5P)\2\u032b\u0329\3\2\2\2\u032c\u032f\3\2\2"+
		"\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032eS\3\2\2\2\u032f\u032d"+
		"\3\2\2\2\u0330\u0335\5R*\2\u0331\u0332\7y\2\2\u0332\u0334\5R*\2\u0333"+
		"\u0331\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2"+
		"\2\2\u0336U\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u033e\5T+\2\u0339\u033a"+
		"\7\177\2\2\u033a\u033b\5\\/\2\u033b\u033c\7\u0080\2\2\u033c\u033d\5X-"+
		"\2\u033d\u033f\3\2\2\2\u033e\u0339\3\2\2\2\u033e\u033f\3\2\2\2\u033fW"+
		"\3\2\2\2\u0340\u0347\5V,\2\u0341\u0342\5T+\2\u0342\u0343\5Z.\2\u0343\u0344"+
		"\5\u0110\u0089\2\u0344\u0347\3\2\2\2\u0345\u0347\5\u0170\u00b9\2\u0346"+
		"\u0340\3\2\2\2\u0346\u0341\3\2\2\2\u0346\u0345\3\2\2\2\u0347Y\3\2\2\2"+
		"\u0348\u0349\t\f\2\2\u0349[\3\2\2\2\u034a\u034f\5X-\2\u034b\u034c\7|\2"+
		"\2\u034c\u034e\5X-\2\u034d\u034b\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d"+
		"\3\2\2\2\u034f\u0350\3\2\2\2\u0350]\3\2\2\2\u0351\u034f\3\2\2\2\u0352"+
		"\u0353\5V,\2\u0353_\3\2\2\2\u0354\u0362\5b\62\2\u0355\u0357\5\u00ccg\2"+
		"\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u035e\3\2\2\2\u0358\u035f"+
		"\5d\63\2\u0359\u035f\5f\64\2\u035a\u035f\5l\67\2\u035b\u035f\5p9\2\u035c"+
		"\u035f\5x=\2\u035d\u035f\5\u0166\u00b4\2\u035e\u0358\3\2\2\2\u035e\u0359"+
		"\3\2\2\2\u035e\u035a\3\2\2\2\u035e\u035b\3\2\2\2\u035e\u035c\3\2\2\2\u035e"+
		"\u035d\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u0362\5z>\2\u0361\u0354\3\2\2"+
		"\2\u0361\u0356\3\2\2\2\u0361\u0360\3\2\2\2\u0362a\3\2\2\2\u0363\u0365"+
		"\5\u00ccg\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u036a\3\2\2"+
		"\2\u0366\u036b\7\u0086\2\2\u0367\u0368\7\22\2\2\u0368\u036b\5^\60\2\u0369"+
		"\u036b\7\35\2\2\u036a\u0366\3\2\2\2\u036a\u0367\3\2\2\2\u036a\u0369\3"+
		"\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\7\u0080\2\2\u036d\u036e\5`\61\2"+
		"\u036ec\3\2\2\2\u036f\u0371\5\\/\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2"+
		"\2\2\u0371\u0372\3\2\2\2\u0372\u0373\7\u0082\2\2\u0373e\3\2\2\2\u0374"+
		"\u0376\7[\2\2\u0375\u0377\5h\65\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2"+
		"\2\2\u0377\u0378\3\2\2\2\u0378\u0379\7\\\2\2\u0379g\3\2\2\2\u037a\u037c"+
		"\5`\61\2\u037b\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037b\3\2\2\2\u037d"+
		"\u037e\3\2\2\2\u037ei\3\2\2\2\u037f\u0380\7\u0086\2\2\u0380k\3\2\2\2\u0381"+
		"\u0382\7-\2\2\u0382\u0383\7W\2\2\u0383\u0384\5n8\2\u0384\u0385\7X\2\2"+
		"\u0385\u0388\5`\61\2\u0386\u0387\7\"\2\2\u0387\u0389\5`\61\2\u0388\u0386"+
		"\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u0391\3\2\2\2\u038a\u038b\7E\2\2\u038b"+
		"\u038c\7W\2\2\u038c\u038d\5n8\2\u038d\u038e\7X\2\2\u038e\u038f\5`\61\2"+
		"\u038f\u0391\3\2\2\2\u0390\u0381\3\2\2\2\u0390\u038a\3\2\2\2\u0391m\3"+
		"\2\2\2\u0392\u039e\5\\/\2\u0393\u0395\5\u00ccg\2\u0394\u0393\3\2\2\2\u0394"+
		"\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\5\u008eH\2\u0397\u039b"+
		"\5\u00e2r\2\u0398\u0399\7g\2\2\u0399\u039c\5\u0110\u0089\2\u039a\u039c"+
		"\5\u0114\u008b\2\u039b\u0398\3\2\2\2\u039b\u039a\3\2\2\2\u039c\u039e\3"+
		"\2\2\2\u039d\u0392\3\2\2\2\u039d\u0394\3\2\2\2\u039eo\3\2\2\2\u039f\u03a0"+
		"\7V\2\2\u03a0\u03a1\7W\2\2\u03a1\u03a2\5n8\2\u03a2\u03a3\7X\2\2\u03a3"+
		"\u03a4\5`\61\2\u03a4\u03c1\3\2\2\2\u03a5\u03a6\7\37\2\2\u03a6\u03a7\5"+
		"`\61\2\u03a7\u03a8\7V\2\2\u03a8\u03a9\7W\2\2\u03a9\u03aa\5\\/\2\u03aa"+
		"\u03ab\7X\2\2\u03ab\u03ac\7\u0082\2\2\u03ac\u03c1\3\2\2\2\u03ad\u03ae"+
		"\7*\2\2\u03ae\u03bb\7W\2\2\u03af\u03b1\5r:\2\u03b0\u03b2\5n8\2\u03b1\u03b0"+
		"\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\7\u0082\2"+
		"\2\u03b4\u03b6\5\\/\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03bc"+
		"\3\2\2\2\u03b7\u03b8\5t;\2\u03b8\u03b9\7\u0080\2\2\u03b9\u03ba\5v<\2\u03ba"+
		"\u03bc\3\2\2\2\u03bb\u03af\3\2\2\2\u03bb\u03b7\3\2\2\2\u03bc\u03bd\3\2"+
		"\2\2\u03bd\u03be\7X\2\2\u03be\u03bf\5`\61\2\u03bf\u03c1\3\2\2\2\u03c0"+
		"\u039f\3\2\2\2\u03c0\u03a5\3\2\2\2\u03c0\u03ad\3\2\2\2\u03c1q\3\2\2\2"+
		"\u03c2\u03c5\5d\63\2\u03c3\u03c5\5\u0084C\2\u03c4\u03c2\3\2\2\2\u03c4"+
		"\u03c3\3\2\2\2\u03c5s\3\2\2\2\u03c6\u03c8\5\u00ccg\2\u03c7\u03c6\3\2\2"+
		"\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03ca\5\u008eH\2\u03ca"+
		"\u03cb\5\u00e2r\2\u03cbu\3\2\2\2\u03cc\u03cf\5\\/\2\u03cd\u03cf\5\u0114"+
		"\u008b\2\u03ce\u03cc\3\2\2\2\u03ce\u03cd\3\2\2\2\u03cfw\3\2\2\2\u03d0"+
		"\u03da\7\21\2\2\u03d1\u03da\7\33\2\2\u03d2\u03d5\7=\2\2\u03d3\u03d6\5"+
		"\\/\2\u03d4\u03d6\5\u0114\u008b\2\u03d5\u03d3\3\2\2\2\u03d5\u03d4\3\2"+
		"\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03da\3\2\2\2\u03d7\u03d8\7,\2\2\u03d8"+
		"\u03da\7\u0086\2\2\u03d9\u03d0\3\2\2\2\u03d9\u03d1\3\2\2\2\u03d9\u03d2"+
		"\3\2\2\2\u03d9\u03d7\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dc\7\u0082\2"+
		"\2\u03dcy\3\2\2\2\u03dd\u03de\5\u0080A\2\u03de{\3\2\2\2\u03df\u03e1\5"+
		"~@\2\u03e0\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2"+
		"\u03e3\3\2\2\2\u03e3}\3\2\2\2\u03e4\u03ee\5\u0080A\2\u03e5\u03ee\5\u0108"+
		"\u0085\2\u03e6\u03ee\5\u014e\u00a8\2\u03e7\u03ee\5\u0162\u00b2\2\u03e8"+
		"\u03ee\5\u0164\u00b3\2\u03e9\u03ee\5\u00caf\2\u03ea\u03ee\5\u00bc_\2\u03eb"+
		"\u03ee\5\u0088E\2\u03ec\u03ee\5\u008aF\2\u03ed\u03e4\3\2\2\2\u03ed\u03e5"+
		"\3\2\2\2\u03ed\u03e6\3\2\2\2\u03ed\u03e7\3\2\2\2\u03ed\u03e8\3\2\2\2\u03ed"+
		"\u03e9\3\2\2\2\u03ed\u03ea\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ed\u03ec\3\2"+
		"\2\2\u03ee\177\3\2\2\2\u03ef\u03f8\5\u0084C\2\u03f0\u03f8\5\u00c8e\2\u03f1"+
		"\u03f8\5\u00c0a\2\u03f2\u03f8\5\u00c4c\2\u03f3\u03f8\5\u00c6d\2\u03f4"+
		"\u03f8\5\u0086D\2\u03f5\u03f8\5\u0082B\2\u03f6\u03f8\5\u00acW\2\u03f7"+
		"\u03ef\3\2\2\2\u03f7\u03f0\3\2\2\2\u03f7\u03f1\3\2\2\2\u03f7\u03f2\3\2"+
		"\2\2\u03f7\u03f3\3\2\2\2\u03f7\u03f4\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7"+
		"\u03f6\3\2\2\2\u03f8\u0081\3\2\2\2\u03f9\u03fa\7Q\2\2\u03fa\u03fc\7\u0086"+
		"\2\2\u03fb\u03fd\5\u00ccg\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd"+
		"\u03fe\3\2\2\2\u03fe\u03ff\7g\2\2\u03ff\u0400\5\u00f6|\2\u0400\u0401\7"+
		"\u0082\2\2\u0401\u0083\3\2\2\2\u0402\u0404\5\u008eH\2\u0403\u0402\3\2"+
		"\2\2\u0403\u0404\3\2\2\2\u0404\u0406\3\2\2\2\u0405\u0407\5\u00dep\2\u0406"+
		"\u0405\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0411\7\u0082"+
		"\2\2\u0409\u040b\5\u00ccg\2\u040a\u040c\5\u008eH\2\u040b\u040a\3\2\2\2"+
		"\u040b\u040c\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\5\u00dep\2\u040e"+
		"\u040f\7\u0082\2\2\u040f\u0411\3\2\2\2\u0410\u0403\3\2\2\2\u0410\u0409"+
		"\3\2\2\2\u0411\u0085\3\2\2\2\u0412\u0413\7B\2\2\u0413\u0414\7W\2\2\u0414"+
		"\u0415\5^\60\2\u0415\u0416\7|\2\2\u0416\u0417\7\6\2\2\u0417\u0418\7X\2"+
		"\2\u0418\u0419\7\u0082\2\2\u0419\u0087\3\2\2\2\u041a\u041b\7\u0082\2\2"+
		"\u041b\u0089\3\2\2\2\u041c\u041d\5\u00ccg\2\u041d\u041e\7\u0082\2\2\u041e"+
		"\u008b\3\2\2\2\u041f\u0426\5\u0090I\2\u0420\u0426\5\u0096L\2\u0421\u0426"+
		"\5\u0092J\2\u0422\u0426\7+\2\2\u0423\u0426\7L\2\2\u0424\u0426\7\31\2\2"+
		"\u0425\u041f\3\2\2\2\u0425\u0420\3\2\2\2\u0425\u0421\3\2\2\2\u0425\u0422"+
		"\3\2\2\2\u0425\u0423\3\2\2\2\u0425\u0424\3\2\2\2\u0426\u008d\3\2\2\2\u0427"+
		"\u0429\5\u008cG\2\u0428\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u0428"+
		"\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042d\3\2\2\2\u042c\u042e\5\u00ccg"+
		"\2\u042d\u042c\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u008f\3\2\2\2\u042f\u0430"+
		"\t\r\2\2\u0430\u0091\3\2\2\2\u0431\u0432\t\16\2\2\u0432\u0093\3\2\2\2"+
		"\u0433\u0434\7\u0086\2\2\u0434\u0095\3\2\2\2\u0435\u0439\5\u0098M\2\u0436"+
		"\u0439\5\u0118\u008d\2\u0437\u0439\5\u00a8U\2\u0438\u0435\3\2\2\2\u0438"+
		"\u0436\3\2\2\2\u0438\u0437\3\2\2\2\u0439\u0097\3\2\2\2\u043a\u043f\5\u009e"+
		"P\2\u043b\u043f\5\u00a4S\2\u043c\u043f\5\u0160\u00b1\2\u043d\u043f\5\u00f0"+
		"y\2\u043e\u043a\3\2\2\2\u043e\u043b\3\2\2\2\u043e\u043c\3\2\2\2\u043e"+
		"\u043d\3\2\2\2\u043f\u0099\3\2\2\2\u0440\u0442\5\u0096L\2\u0441\u0440"+
		"\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444"+
		"\u0446\3\2\2\2\u0445\u0447\5\u00ccg\2\u0446\u0445\3\2\2\2\u0446\u0447"+
		"\3\2\2\2\u0447\u009b\3\2\2\2\u0448\u044a\5\u0098M\2\u0449\u0448\3\2\2"+
		"\2\u044a\u044b\3\2\2\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044e"+
		"\3\2\2\2\u044d\u044f\5\u00ccg\2\u044e\u044d\3\2\2\2\u044e\u044f\3\2\2"+
		"\2\u044f\u009d\3\2\2\2\u0450\u0452\5\f\7\2\u0451\u0450\3\2\2\2\u0451\u0452"+
		"\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0468\5\u00a0Q\2\u0454\u0455\5\f\7"+
		"\2\u0455\u0456\7F\2\2\u0456\u0457\5\u0156\u00ac\2\u0457\u0468\3\2\2\2"+
		"\u0458\u0468\7\24\2\2\u0459\u0468\7\25\2\2\u045a\u0468\7\26\2\2\u045b"+
		"\u0468\7U\2\2\u045c\u0468\7\20\2\2\u045d\u0468\7>\2\2\u045e\u0468\7/\2"+
		"\2\u045f\u0468\7\60\2\2\u0460\u0468\7?\2\2\u0461\u0468\7P\2\2\u0462\u0468"+
		"\7)\2\2\u0463\u0468\7 \2\2\u0464\u0468\7S\2\2\u0465\u0468\7\17\2\2\u0466"+
		"\u0468\5\u00a2R\2\u0467\u0451\3\2\2\2\u0467\u0454\3\2\2\2\u0467\u0458"+
		"\3\2\2\2\u0467\u0459\3\2\2\2\u0467\u045a\3\2\2\2\u0467\u045b\3\2\2\2\u0467"+
		"\u045c\3\2\2\2\u0467\u045d\3\2\2\2\u0467\u045e\3\2\2\2\u0467\u045f\3\2"+
		"\2\2\u0467\u0460\3\2\2\2\u0467\u0461\3\2\2\2\u0467\u0462\3\2\2\2\u0467"+
		"\u0463\3\2\2\2\u0467\u0464\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0466\3\2"+
		"\2\2\u0468\u009f\3\2\2\2\u0469\u046e\5\u0116\u008c\2\u046a\u046e\5\u00a6"+
		"T\2\u046b\u046e\5\u0094K\2\u046c\u046e\5\u0156\u00ac\2\u046d\u0469\3\2"+
		"\2\2\u046d\u046a\3\2\2\2\u046d\u046b\3\2\2\2\u046d\u046c\3\2\2\2\u046e"+
		"\u00a1\3\2\2\2\u046f\u0470\7\34\2\2\u0470\u0473\7W\2\2\u0471\u0474\5\\"+
		"/\2\u0472\u0474\7\17\2\2\u0473\u0471\3\2\2\2\u0473\u0472\3\2\2\2\u0474"+
		"\u0475\3\2\2\2\u0475\u0476\7X\2\2\u0476\u00a3\3\2\2\2\u0477\u0486\5\u0120"+
		"\u0091\2\u0478\u047a\5\u00ccg\2\u0479\u0478\3\2\2\2\u0479\u047a\3\2\2"+
		"\2\u047a\u047c\3\2\2\2\u047b\u047d\5\f\7\2\u047c\u047b\3\2\2\2\u047c\u047d"+
		"\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u0487\7\u0086\2\2\u047f\u0487\5\u0156"+
		"\u00ac\2\u0480\u0482\5\f\7\2\u0481\u0483\7F\2\2\u0482\u0481\3\2\2\2\u0482"+
		"\u0483\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0485\5\u0156\u00ac\2\u0485\u0487"+
		"\3\2\2\2\u0486\u0479\3\2\2\2\u0486\u047f\3\2\2\2\u0486\u0480\3\2\2\2\u0487"+
		"\u048e\3\2\2\2\u0488\u048a\7#\2\2\u0489\u048b\5\f\7\2\u048a\u0489\3\2"+
		"\2\2\u048a\u048b\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048e\7\u0086\2\2\u048d"+
		"\u0477\3\2\2\2\u048d\u0488\3\2\2\2\u048e\u00a5\3\2\2\2\u048f\u0490\7\u0086"+
		"\2\2\u0490\u00a7\3\2\2\2\u0491\u0492\5\u00aaV\2\u0492\u0497\7[\2\2\u0493"+
		"\u0495\5\u00b2Z\2\u0494\u0496\7|\2\2\u0495\u0494\3\2\2\2\u0495\u0496\3"+
		"\2\2\2\u0496\u0498\3\2\2\2\u0497\u0493\3\2\2\2\u0497\u0498\3\2\2\2\u0498"+
		"\u0499\3\2\2\2\u0499\u049a\7\\\2\2\u049a\u00a9\3\2\2\2\u049b\u049d\5\u00ae"+
		"X\2\u049c\u049e\5\u00ccg\2\u049d\u049c\3\2\2\2\u049d\u049e\3\2\2\2\u049e"+
		"\u04a3\3\2\2\2\u049f\u04a1\5\f\7\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2"+
		"\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a4\7\u0086\2\2\u04a3\u04a0\3\2\2\2\u04a3"+
		"\u04a4\3\2\2\2\u04a4\u04a6\3\2\2\2\u04a5\u04a7\5\u00b0Y\2\u04a6\u04a5"+
		"\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u00ab\3\2\2\2\u04a8\u04aa\5\u00aeX"+
		"\2\u04a9\u04ab\5\u00ccg\2\u04aa\u04a9\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab"+
		"\u04ac\3\2\2\2\u04ac\u04ae\7\u0086\2\2\u04ad\u04af\5\u00b0Y\2\u04ae\u04ad"+
		"\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\7\u0082\2"+
		"\2\u04b1\u00ad\3\2\2\2\u04b2\u04b4\7#\2\2\u04b3\u04b5\t\17\2\2\u04b4\u04b3"+
		"\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u00af\3\2\2\2\u04b6\u04b7\7\u0080\2"+
		"\2\u04b7\u04b8\5\u009aN\2\u04b8\u00b1\3\2\2\2\u04b9\u04be\5\u00b4[\2\u04ba"+
		"\u04bb\7|\2\2\u04bb\u04bd\5\u00b4[\2\u04bc\u04ba\3\2\2\2\u04bd\u04c0\3"+
		"\2\2\2\u04be\u04bc\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u00b3\3\2\2\2\u04c0"+
		"\u04be\3\2\2\2\u04c1\u04c4\5\u00b6\\\2\u04c2\u04c3\7g\2\2\u04c3\u04c5"+
		"\5^\60\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u00b5\3\2\2\2\u04c6"+
		"\u04c7\7\u0086\2\2\u04c7\u00b7\3\2\2\2\u04c8\u04cb\5\u00ba^\2\u04c9\u04cb"+
		"\5\u00be`\2\u04ca\u04c8\3\2\2\2\u04ca\u04c9\3\2\2\2\u04cb\u00b9\3\2\2"+
		"\2\u04cc\u04cd\7\u0086\2\2\u04cd\u00bb\3\2\2\2\u04ce\u04d0\7.\2\2\u04cf"+
		"\u04ce\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d4\7\62"+
		"\2\2\u04d2\u04d5\7\u0086\2\2\u04d3\u04d5\5\u00ba^\2\u04d4\u04d2\3\2\2"+
		"\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d8"+
		"\7[\2\2\u04d7\u04d9\5|?\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9"+
		"\u04da\3\2\2\2\u04da\u04db\7\\\2\2\u04db\u00bd\3\2\2\2\u04dc\u04dd\7\u0086"+
		"\2\2\u04dd\u00bf\3\2\2\2\u04de\u04df\7\62\2\2\u04df\u04e0\7\u0086\2\2"+
		"\u04e0\u04e1\7g\2\2\u04e1\u04e2\5\u00c2b\2\u04e2\u04e3\7\u0082\2\2\u04e3"+
		"\u00c1\3\2\2\2\u04e4\u04e6\5\f\7\2\u04e5\u04e4\3\2\2\2\u04e5\u04e6\3\2"+
		"\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\5\u00b8]\2\u04e8\u00c3\3\2\2\2\u04e9"+
		"\u04ef\7Q\2\2\u04ea\u04ec\7N\2\2\u04eb\u04ea\3\2\2\2\u04eb\u04ec\3\2\2"+
		"\2\u04ec\u04ed\3\2\2\2\u04ed\u04f0\5\f\7\2\u04ee\u04f0\7\u0081\2\2\u04ef"+
		"\u04eb\3\2\2\2\u04ef\u04ee\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2\5\b"+
		"\5\2\u04f2\u04f3\7\u0082\2\2\u04f3\u00c5\3\2\2\2\u04f4\u04f6\5\u00ccg"+
		"\2\u04f5\u04f4\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8"+
		"\7Q\2\2\u04f8\u04fa\7\62\2\2\u04f9\u04fb\5\f\7\2\u04fa\u04f9\3\2\2\2\u04fa"+
		"\u04fb\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\5\u00b8]\2\u04fd\u04fe"+
		"\7\u0082\2\2\u04fe\u00c7\3\2\2\2\u04ff\u0500\7\16\2\2\u0500\u0501\7W\2"+
		"\2\u0501\u0502\7\6\2\2\u0502\u0503\7X\2\2\u0503\u0504\7\u0082\2\2\u0504"+
		"\u00c9\3\2\2\2\u0505\u0506\7&\2\2\u0506\u050d\7\6\2\2\u0507\u0509\7[\2"+
		"\2\u0508\u050a\5|?\2\u0509\u0508\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b"+
		"\3\2\2\2\u050b\u050e\7\\\2\2\u050c\u050e\5~@\2\u050d\u0507\3\2\2\2\u050d"+
		"\u050c\3\2\2\2\u050e\u00cb\3\2\2\2\u050f\u0511\5\u00ceh\2\u0510\u050f"+
		"\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513"+
		"\u00cd\3\2\2\2\u0514\u0515\7Y\2\2\u0515\u0517\7Y\2\2\u0516\u0518\5\u00d2"+
		"j\2\u0517\u0516\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519\3\2\2\2\u0519"+
		"\u051a\7Z\2\2\u051a\u051d\7Z\2\2\u051b\u051d\5\u00d0i\2\u051c\u0514\3"+
		"\2\2\2\u051c\u051b\3\2\2\2\u051d\u00cf\3\2\2\2\u051e\u051f\7\f\2\2\u051f"+
		"\u0522\7W\2\2\u0520\u0523\5\u00f6|\2\u0521\u0523\5^\60\2\u0522\u0520\3"+
		"\2\2\2\u0522\u0521\3\2\2\2\u0523\u0525\3\2\2\2\u0524\u0526\7\u0085\2\2"+
		"\u0525\u0524\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528"+
		"\7X\2\2\u0528\u00d1\3\2\2\2\u0529\u052e\5\u00d4k\2\u052a\u052b\7|\2\2"+
		"\u052b\u052d\5\u00d4k\2\u052c\u052a\3\2\2\2\u052d\u0530\3\2\2\2\u052e"+
		"\u052c\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0532\3\2\2\2\u0530\u052e\3\2"+
		"\2\2\u0531\u0533\7\u0085\2\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533"+
		"\u00d3\3\2\2\2\u0534\u0535\5\u00d6l\2\u0535\u0536\7\u0081\2\2\u0536\u0538"+
		"\3\2\2\2\u0537\u0534\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\3\2\2\2\u0539"+
		"\u053b\7\u0086\2\2\u053a\u053c\5\u00d8m\2\u053b\u053a\3\2\2\2\u053b\u053c"+
		"\3\2\2\2\u053c\u00d5\3\2\2\2\u053d\u053e\7\u0086\2\2\u053e\u00d7\3\2\2"+
		"\2\u053f\u0541\7W\2\2\u0540\u0542\5\u00dan\2\u0541\u0540\3\2\2\2\u0541"+
		"\u0542\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0544\7X\2\2\u0544\u00d9\3\2"+
		"\2\2\u0545\u0547\5\u00dco\2\u0546\u0545\3\2\2\2\u0547\u0548\3\2\2\2\u0548"+
		"\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u00db\3\2\2\2\u054a\u054b\7W"+
		"\2\2\u054b\u054c\5\u00dan\2\u054c\u054d\7X\2\2\u054d\u055c\3\2\2\2\u054e"+
		"\u054f\7Y\2\2\u054f\u0550\5\u00dan\2\u0550\u0551\7Z\2\2\u0551\u055c\3"+
		"\2\2\2\u0552\u0553\7[\2\2\u0553\u0554\5\u00dan\2\u0554\u0555\7\\\2\2\u0555"+
		"\u055c\3\2\2\2\u0556\u0558\n\20\2\2\u0557\u0556\3\2\2\2\u0558\u0559\3"+
		"\2\2\2\u0559\u0557\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055c\3\2\2\2\u055b"+
		"\u054a\3\2\2\2\u055b\u054e\3\2\2\2\u055b\u0552\3\2\2\2\u055b\u0557\3\2"+
		"\2\2\u055c\u00dd\3\2\2\2\u055d\u0562\5\u00e0q\2\u055e\u055f\7|\2\2\u055f"+
		"\u0561\5\u00e0q\2\u0560\u055e\3\2\2\2\u0561\u0564\3\2\2\2\u0562\u0560"+
		"\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u00df\3\2\2\2\u0564\u0562\3\2\2\2\u0565"+
		"\u0567\5\u00e2r\2\u0566\u0568\5\u010c\u0087\2\u0567\u0566\3\2\2\2\u0567"+
		"\u0568\3\2\2\2\u0568\u00e1\3\2\2\2\u0569\u056f\5\u00e4s\2\u056a\u056b"+
		"\5\u00e6t\2\u056b\u056c\5\u00e8u\2\u056c\u056d\5\u00eav\2\u056d\u056f"+
		"\3\2\2\2\u056e\u0569\3\2\2\2\u056e\u056a\3\2\2\2\u056f\u00e3\3\2\2\2\u0570"+
		"\u0572\5\u00ecw\2\u0571\u0573\7\30\2\2\u0572\u0571\3\2\2\2\u0572\u0573"+
		"\3\2\2\2\u0573\u0575\3\2\2\2\u0574\u0570\3\2\2\2\u0575\u0578\3\2\2\2\u0576"+
		"\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0579\3\2\2\2\u0578\u0576\3\2"+
		"\2\2\u0579\u057a\5\u00e6t\2\u057a\u00e5\3\2\2\2\u057b\u057c\bt\1\2\u057c"+
		"\u057e\5\u00f4{\2\u057d\u057f\5\u00ccg\2\u057e\u057d\3\2\2\2\u057e\u057f"+
		"\3\2\2\2\u057f\u0585\3\2\2\2\u0580\u0581\7W\2\2\u0581\u0582\5\u00e4s\2"+
		"\u0582\u0583\7X\2\2\u0583\u0585\3\2\2\2\u0584\u057b\3\2\2\2\u0584\u0580"+
		"\3\2\2\2\u0585\u0594\3\2\2\2\u0586\u0590\f\4\2\2\u0587\u0591\5\u00e8u"+
		"\2\u0588\u058a\7Y\2\2\u0589\u058b\5^\60\2\u058a\u0589\3\2\2\2\u058a\u058b"+
		"\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058e\7Z\2\2\u058d\u058f\5\u00ccg\2"+
		"\u058e\u058d\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0591\3\2\2\2\u0590\u0587"+
		"\3\2\2\2\u0590\u0588\3\2\2\2\u0591\u0593\3\2\2\2\u0592\u0586\3\2\2\2\u0593"+
		"\u0596\3\2\2\2\u0594\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u00e7\3\2"+
		"\2\2\u0596\u0594\3\2\2\2\u0597\u0599\7W\2\2\u0598\u059a\5\u0102\u0082"+
		"\2\u0599\u0598\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059d"+
		"\7X\2\2\u059c\u059e\5\u00eex\2\u059d\u059c\3\2\2\2\u059d\u059e\3\2\2\2"+
		"\u059e\u05a0\3\2\2\2\u059f\u05a1\5\u00f2z\2\u05a0\u059f\3\2\2\2\u05a0"+
		"\u05a1\3\2\2\2\u05a1\u05a3\3\2\2\2\u05a2\u05a4\5\u0172\u00ba\2\u05a3\u05a2"+
		"\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a6\3\2\2\2\u05a5\u05a7\5\u00ccg"+
		"\2\u05a6\u05a5\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u00e9\3\2\2\2\u05a8\u05a9"+
		"\7~\2\2\u05a9\u05ab\5\u009cO\2\u05aa\u05ac\5\u00f8}\2\u05ab\u05aa\3\2"+
		"\2\2\u05ab\u05ac\3\2\2\2\u05ac\u00eb\3\2\2\2\u05ad\u05af\t\21\2\2\u05ae"+
		"\u05b0\5\u00ccg\2\u05af\u05ae\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05bc"+
		"\3\2\2\2\u05b1\u05b3\5\f\7\2\u05b2\u05b1\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3"+
		"\u05b4\3\2\2\2\u05b4\u05b6\7_\2\2\u05b5\u05b7\5\u00ccg\2\u05b6\u05b5\3"+
		"\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b9\3\2\2\2\u05b8\u05ba\5\u00eex\2"+
		"\u05b9\u05b8\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bc\3\2\2\2\u05bb\u05ad"+
		"\3\2\2\2\u05bb\u05b2\3\2\2\2\u05bc\u00ed\3\2\2\2\u05bd\u05bf\5\u00f0y"+
		"\2\u05be\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1"+
		"\3\2\2\2\u05c1\u00ef\3\2\2\2\u05c2\u05c3\t\22\2\2\u05c3\u00f1\3\2\2\2"+
		"\u05c4\u05c5\t\21\2\2\u05c5\u00f3\3\2\2\2\u05c6\u05c8\7\u0085\2\2\u05c7"+
		"\u05c6\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca\5\6"+
		"\4\2\u05ca\u00f5\3\2\2\2\u05cb\u05cd\5\u009aN\2\u05cc\u05ce\5\u00f8}\2"+
		"\u05cd\u05cc\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u00f7\3\2\2\2\u05cf\u05d8"+
		"\5\u00fa~\2\u05d0\u05d2\5\u00fc\177\2\u05d1\u05d0\3\2\2\2\u05d1\u05d2"+
		"\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4\5\u00e8u\2\u05d4\u05d5\5\u00ea"+
		"v\2\u05d5\u05d8\3\2\2\2\u05d6\u05d8\5\u00fe\u0080\2\u05d7\u05cf\3\2\2"+
		"\2\u05d7\u05d1\3\2\2\2\u05d7\u05d6\3\2\2\2\u05d8\u00f9\3\2\2\2\u05d9\u05e3"+
		"\5\u00fc\177\2\u05da\u05dc\5\u00ecw\2\u05db\u05da\3\2\2\2\u05dc\u05dd"+
		"\3\2\2\2\u05dd\u05db\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05e0\3\2\2\2\u05df"+
		"\u05e1\5\u00fc\177\2\u05e0\u05df\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e3"+
		"\3\2\2\2\u05e2\u05d9\3\2\2\2\u05e2\u05db\3\2\2\2\u05e3\u00fb\3\2\2\2\u05e4"+
		"\u05e5\b\177\1\2\u05e5\u05f3\5\u00e8u\2\u05e6\u05e8\7Y\2\2\u05e7\u05e9"+
		"\5^\60\2\u05e8\u05e7\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea"+
		"\u05ec\7Z\2\2\u05eb\u05ed\5\u00ccg\2\u05ec\u05eb\3\2\2\2\u05ec\u05ed\3"+
		"\2\2\2\u05ed\u05f3\3\2\2\2\u05ee\u05ef\7W\2\2\u05ef\u05f0\5\u00fa~\2\u05f0"+
		"\u05f1\7X\2\2\u05f1\u05f3\3\2\2\2\u05f2\u05e4\3\2\2\2\u05f2\u05e6\3\2"+
		"\2\2\u05f2\u05ee\3\2\2\2\u05f3\u0603\3\2\2\2\u05f4\u05ff\f\6\2\2\u05f5"+
		"\u0600\5\u00e8u\2\u05f6\u05f7\5\u00fc\177\2\u05f7\u05f9\7Y\2\2\u05f8\u05fa"+
		"\5^\60\2\u05f9\u05f8\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb"+
		"\u05fd\7Z\2\2\u05fc\u05fe\5\u00ccg\2\u05fd\u05fc\3\2\2\2\u05fd\u05fe\3"+
		"\2\2\2\u05fe\u0600\3\2\2\2\u05ff\u05f5\3\2\2\2\u05ff\u05f6\3\2\2\2\u0600"+
		"\u0602\3\2\2\2\u0601\u05f4\3\2\2\2\u0602\u0605\3\2\2\2\u0603\u0601\3\2"+
		"\2\2\u0603\u0604\3\2\2\2\u0604\u00fd\3\2\2\2\u0605\u0603\3\2\2\2\u0606"+
		"\u0608\5\u00ecw\2\u0607\u0606\3\2\2\2\u0608\u060b\3\2\2\2\u0609\u0607"+
		"\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060c\3\2\2\2\u060b\u0609\3\2\2\2\u060c"+
		"\u060d\5\u0100\u0081\2\u060d\u00ff\3\2\2\2\u060e\u060f\b\u0081\1\2\u060f"+
		"\u0610\7\u0085\2\2\u0610\u061f\3\2\2\2\u0611\u061b\f\4\2\2\u0612\u061c"+
		"\5\u00e8u\2\u0613\u0615\7Y\2\2\u0614\u0616\5^\60\2\u0615\u0614\3\2\2\2"+
		"\u0615\u0616\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u0619\7Z\2\2\u0618\u061a"+
		"\5\u00ccg\2\u0619\u0618\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061c\3\2\2"+
		"\2\u061b\u0612\3\2\2\2\u061b\u0613\3\2\2\2\u061c\u061e\3\2\2\2\u061d\u0611"+
		"\3\2\2\2\u061e\u0621\3\2\2\2\u061f\u061d\3\2\2\2\u061f\u0620\3\2\2\2\u0620"+
		"\u0101\3\2\2\2\u0621\u061f\3\2\2\2\u0622\u0627\5\u0104\u0083\2\u0623\u0625"+
		"\7|\2\2\u0624\u0623\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u0626\3\2\2\2\u0626"+
		"\u0628\7\u0085\2\2\u0627\u0624\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0103"+
		"\3\2\2\2\u0629\u062e\5\u0106\u0084\2\u062a\u062b\7|\2\2\u062b\u062d\5"+
		"\u0106\u0084\2\u062c\u062a\3\2\2\2\u062d\u0630\3\2\2\2\u062e\u062c\3\2"+
		"\2\2\u062e\u062f\3\2\2\2\u062f\u0105\3\2\2\2\u0630\u062e\3\2\2\2\u0631"+
		"\u0633\5\u00ccg\2\u0632\u0631\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0634"+
		"\3\2\2\2\u0634\u0639\5\u008eH\2\u0635\u063a\5\u00e2r\2\u0636\u0638\5\u00f8"+
		"}\2\u0637\u0636\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u063a\3\2\2\2\u0639"+
		"\u0635\3\2\2\2\u0639\u0637\3\2\2\2\u063a\u063d\3\2\2\2\u063b\u063c\7g"+
		"\2\2\u063c\u063e\5\u0110\u0089\2\u063d\u063b\3\2\2\2\u063d\u063e\3\2\2"+
		"\2\u063e\u0107\3\2\2\2\u063f\u0641\5\u00ccg\2\u0640\u063f\3\2\2\2\u0640"+
		"\u0641\3\2\2\2\u0641\u0643\3\2\2\2\u0642\u0644\5\u008eH\2\u0643\u0642"+
		"\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0647\5\u00e2r"+
		"\2\u0646\u0648\5\u012a\u0096\2\u0647\u0646\3\2\2\2\u0647\u0648\3\2\2\2"+
		"\u0648\u0649\3\2\2\2\u0649\u064a\5\u010a\u0086\2\u064a\u0109\3\2\2\2\u064b"+
		"\u064d\5\u0142\u00a2\2\u064c\u064b\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e"+
		"\3\2\2\2\u064e\u0654\5f\64\2\u064f\u0654\5\u0168\u00b5\2\u0650\u0651\7"+
		"g\2\2\u0651\u0652\t\23\2\2\u0652\u0654\7\u0082\2\2\u0653\u064c\3\2\2\2"+
		"\u0653\u064f\3\2\2\2\u0653\u0650\3\2\2\2\u0654\u010b\3\2\2\2\u0655\u065b"+
		"\5\u010e\u0088\2\u0656\u0657\7W\2\2\u0657\u0658\5$\23\2\u0658\u0659\7"+
		"X\2\2\u0659\u065b\3\2\2\2\u065a\u0655\3\2\2\2\u065a\u0656\3\2\2\2\u065b"+
		"\u010d\3\2\2\2\u065c\u065d\7g\2\2\u065d\u0660\5\u0110\u0089\2\u065e\u0660"+
		"\5\u0114\u008b\2\u065f\u065c\3\2\2\2\u065f\u065e\3\2\2\2\u0660\u010f\3"+
		"\2\2\2\u0661\u0664\5X-\2\u0662\u0664\5\u0114\u008b\2\u0663\u0661\3\2\2"+
		"\2\u0663\u0662\3\2\2\2\u0664\u0111\3\2\2\2\u0665\u0667\5\u0110\u0089\2"+
		"\u0666\u0668\7\u0085\2\2\u0667\u0666\3\2\2\2\u0667\u0668\3\2\2\2\u0668"+
		"\u0670\3\2\2\2\u0669\u066a\7|\2\2\u066a\u066c\5\u0110\u0089\2\u066b\u066d"+
		"\7\u0085\2\2\u066c\u066b\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066f\3\2\2"+
		"\2\u066e\u0669\3\2\2\2\u066f\u0672\3\2\2\2\u0670\u066e\3\2\2\2\u0670\u0671"+
		"\3\2\2\2\u0671\u0113\3\2\2\2\u0672\u0670\3\2\2\2\u0673\u0678\7[\2\2\u0674"+
		"\u0676\5\u0112\u008a\2\u0675\u0677\7|\2\2\u0676\u0675\3\2\2\2\u0676\u0677"+
		"\3\2\2\2\u0677\u0679\3\2\2\2\u0678\u0674\3\2\2\2\u0678\u0679\3\2\2\2\u0679"+
		"\u067a\3\2\2\2\u067a\u067b\7\\\2\2\u067b\u0115\3\2\2\2\u067c\u067f\7\u0086"+
		"\2\2\u067d\u067f\5\u0156\u00ac\2\u067e\u067c\3\2\2\2\u067e\u067d\3\2\2"+
		"\2\u067f\u0117\3\2\2\2\u0680\u0681\5\u011a\u008e\2\u0681\u0683\7[\2\2"+
		"\u0682\u0684\5\u0122\u0092\2\u0683\u0682\3\2\2\2\u0683\u0684\3\2\2\2\u0684"+
		"\u0685\3\2\2\2\u0685\u0686\7\\\2\2\u0686\u0119\3\2\2\2\u0687\u0689\5\u0120"+
		"\u0091\2\u0688\u068a\5\u00ccg\2\u0689\u0688\3\2\2\2\u0689\u068a\3\2\2"+
		"\2\u068a\u068f\3\2\2\2\u068b\u068d\5\u011c\u008f\2\u068c\u068e\5\u011e"+
		"\u0090\2\u068d\u068c\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u0690\3\2\2\2\u068f"+
		"\u068b\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0692\3\2\2\2\u0691\u0693\5\u0130"+
		"\u0099\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u069f\3\2\2\2\u0694"+
		"\u0696\7O\2\2\u0695\u0697\5\u00ccg\2\u0696\u0695\3\2\2\2\u0696\u0697\3"+
		"\2\2\2\u0697\u069c\3\2\2\2\u0698\u069a\5\u011c\u008f\2\u0699\u069b\5\u011e"+
		"\u0090\2\u069a\u0699\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069d\3\2\2\2\u069c"+
		"\u0698\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069f\3\2\2\2\u069e\u0687\3\2"+
		"\2\2\u069e\u0694\3\2\2\2\u069f\u011b\3\2\2\2\u06a0\u06a2\5\f\7\2\u06a1"+
		"\u06a0\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a4\5\u0116"+
		"\u008c\2\u06a4\u011d\3\2\2\2\u06a5\u06a6\7(\2\2\u06a6\u011f\3\2\2\2\u06a7"+
		"\u06a8\t\17\2\2\u06a8\u0121\3\2\2\2\u06a9\u06ae\5\u0124\u0093\2\u06aa"+
		"\u06ab\5\u013a\u009e\2\u06ab\u06ac\7\u0080\2\2\u06ac\u06ae\3\2\2\2\u06ad"+
		"\u06a9\3\2\2\2\u06ad\u06aa\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06ad\3\2"+
		"\2\2\u06af\u06b0\3\2\2\2\u06b0\u0123\3\2\2\2\u06b1\u06b3\5\u00ccg\2\u06b2"+
		"\u06b1\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b5\3\2\2\2\u06b4\u06b6\5\u008e"+
		"H\2\u06b5\u06b4\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b8\3\2\2\2\u06b7"+
		"\u06b9\5\u0126\u0094\2\u06b8\u06b7\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06ba"+
		"\3\2\2\2\u06ba\u06c2\7\u0082\2\2\u06bb\u06c2\5\u0108\u0085\2\u06bc\u06c2"+
		"\5\u00c4c\2\u06bd\u06c2\5\u0086D\2\u06be\u06c2\5\u014e\u00a8\2\u06bf\u06c2"+
		"\5\u0082B\2\u06c0\u06c2\5\u0088E\2\u06c1\u06b2\3\2\2\2\u06c1\u06bb\3\2"+
		"\2\2\u06c1\u06bc\3\2\2\2\u06c1\u06bd\3\2\2\2\u06c1\u06be\3\2\2\2\u06c1"+
		"\u06bf\3\2\2\2\u06c1\u06c0\3\2\2\2\u06c2\u0125\3\2\2\2\u06c3\u06c8\5\u0128"+
		"\u0095\2\u06c4\u06c5\7|\2\2\u06c5\u06c7\5\u0128\u0095\2\u06c6\u06c4\3"+
		"\2\2\2\u06c7\u06ca\3\2\2\2\u06c8\u06c6\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9"+
		"\u0127\3\2\2\2\u06ca\u06c8\3\2\2\2\u06cb\u06d5\5\u00e2r\2\u06cc\u06ce"+
		"\5\u012a\u0096\2\u06cd\u06cc\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d0\3"+
		"\2\2\2\u06cf\u06d1\5\u012e\u0098\2\u06d0\u06cf\3\2\2\2\u06d0\u06d1\3\2"+
		"\2\2\u06d1\u06d6\3\2\2\2\u06d2\u06d4\5\u010e\u0088\2\u06d3\u06d2\3\2\2"+
		"\2\u06d3\u06d4\3\2\2\2\u06d4\u06d6\3\2\2\2\u06d5\u06cd\3\2\2\2\u06d5\u06d3"+
		"\3\2\2\2\u06d6\u06e0\3\2\2\2\u06d7\u06d9\7\u0086\2\2\u06d8\u06d7\3\2\2"+
		"\2\u06d8\u06d9\3\2\2\2\u06d9\u06db\3\2\2\2\u06da\u06dc\5\u00ccg\2\u06db"+
		"\u06da\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06de\7\u0080"+
		"\2\2\u06de\u06e0\5^\60\2\u06df\u06cb\3\2\2\2\u06df\u06d8\3\2\2\2\u06e0"+
		"\u0129\3\2\2\2\u06e1\u06e3\5\u012c\u0097\2\u06e2\u06e1\3\2\2\2\u06e3\u06e4"+
		"\3\2\2\2\u06e4\u06e2\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u012b\3\2\2\2\u06e6"+
		"\u06e7\t\24\2\2\u06e7\u012d\3\2\2\2\u06e8\u06e9\7g\2\2\u06e9\u06ea\7\u0088"+
		"\2\2\u06ea\u06eb\b\u0098\1\2\u06eb\u012f\3\2\2\2\u06ec\u06ed\7\u0080\2"+
		"\2\u06ed\u06ee\5\u0132\u009a\2\u06ee\u0131\3\2\2\2\u06ef\u06f1\5\u0134"+
		"\u009b\2\u06f0\u06f2\7\u0085\2\2\u06f1\u06f0\3\2\2\2\u06f1\u06f2\3\2\2"+
		"\2\u06f2\u06fa\3\2\2\2\u06f3\u06f4\7|\2\2\u06f4\u06f6\5\u0134\u009b\2"+
		"\u06f5\u06f7\7\u0085\2\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7"+
		"\u06f9\3\2\2\2\u06f8\u06f3\3\2\2\2\u06f9\u06fc\3\2\2\2\u06fa\u06f8\3\2"+
		"\2\2\u06fa\u06fb\3\2\2\2\u06fb\u0133\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fd"+
		"\u06ff\5\u00ccg\2\u06fe\u06fd\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u070c"+
		"\3\2\2\2\u0700\u070d\5\u0138\u009d\2\u0701\u0703\7R\2\2\u0702\u0704\5"+
		"\u013a\u009e\2\u0703\u0702\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0705\3\2"+
		"\2\2\u0705\u070d\5\u0138\u009d\2\u0706\u0708\5\u013a\u009e\2\u0707\u0709"+
		"\7R\2\2\u0708\u0707\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070a\3\2\2\2\u070a"+
		"\u070b\5\u0138\u009d\2\u070b\u070d\3\2\2\2\u070c\u0700\3\2\2\2\u070c\u0701"+
		"\3\2\2\2\u070c\u0706\3\2\2\2\u070d\u0135\3\2\2\2\u070e\u0710\5\f\7\2\u070f"+
		"\u070e\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0714\5\u0116"+
		"\u008c\2\u0712\u0714\5\u00a2R\2\u0713\u070f\3\2\2\2\u0713\u0712\3\2\2"+
		"\2\u0714\u0137\3\2\2\2\u0715\u0716\5\u0136\u009c\2\u0716\u0139\3\2\2\2"+
		"\u0717\u0718\t\25\2\2\u0718\u013b\3\2\2\2\u0719\u071a\7\66\2\2\u071a\u071b"+
		"\5\u013e\u00a0\2\u071b\u013d\3\2\2\2\u071c\u071e\5\u009aN\2\u071d\u071f"+
		"\5\u0140\u00a1\2\u071e\u071d\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u013f\3"+
		"\2\2\2\u0720\u0722\5\u00ecw\2\u0721\u0723\5\u0140\u00a1\2\u0722\u0721"+
		"\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0141\3\2\2\2\u0724\u0725\7\u0080\2"+
		"\2\u0725\u0726\5\u0144\u00a3\2\u0726\u0143\3\2\2\2\u0727\u0729\5\u0146"+
		"\u00a4\2\u0728\u072a\7\u0085\2\2\u0729\u0728\3\2\2\2\u0729\u072a\3\2\2"+
		"\2\u072a\u0732\3\2\2\2\u072b\u072c\7|\2\2\u072c\u072e\5\u0146\u00a4\2"+
		"\u072d\u072f\7\u0085\2\2\u072e\u072d\3\2\2\2\u072e\u072f\3\2\2\2\u072f"+
		"\u0731\3\2\2\2\u0730\u072b\3\2\2\2\u0731\u0734\3\2\2\2\u0732\u0730\3\2"+
		"\2\2\u0732\u0733\3\2\2\2\u0733\u0145\3\2\2\2\u0734\u0732\3\2\2\2\u0735"+
		"\u073c\5\u0148\u00a5\2\u0736\u0738\7W\2\2\u0737\u0739\5$\23\2\u0738\u0737"+
		"\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073d\7X\2\2\u073b"+
		"\u073d\5\u0114\u008b\2\u073c\u0736\3\2\2\2\u073c\u073b\3\2\2\2\u073d\u0147"+
		"\3\2\2\2\u073e\u0741\5\u0136\u009c\2\u073f\u0741\7\u0086\2\2\u0740\u073e"+
		"\3\2\2\2\u0740\u073f\3\2\2\2\u0741\u0149\3\2\2\2\u0742\u0743\7\66\2\2"+
		"\u0743\u0744\5\u017a\u00be\2\u0744\u014b\3\2\2\2\u0745\u0749\7\66\2\2"+
		"\u0746\u0747\7\6\2\2\u0747\u074a\7\u0086\2\2\u0748\u074a\7\u008e\2\2\u0749"+
		"\u0746\3\2\2\2\u0749\u0748\3\2\2\2\u074a\u014d\3\2\2\2\u074b\u074c\7F"+
		"\2\2\u074c\u074d\7h\2\2\u074d\u074e\5\u0150\u00a9\2\u074e\u074f\7i\2\2"+
		"\u074f\u0750\5~@\2\u0750\u014f\3\2\2\2\u0751\u0756\5\u0152\u00aa\2\u0752"+
		"\u0753\7|\2\2\u0753\u0755\5\u0152\u00aa\2\u0754\u0752\3\2\2\2\u0755\u0758"+
		"\3\2\2\2\u0756\u0754\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u0151\3\2\2\2\u0758"+
		"\u0756\3\2\2\2\u0759\u075c\5\u0154\u00ab\2\u075a\u075c\5\u0106\u0084\2"+
		"\u075b\u0759\3\2\2\2\u075b\u075a\3\2\2\2\u075c\u0153\3\2\2\2\u075d\u075e"+
		"\7F\2\2\u075e\u075f\7h\2\2\u075f\u0760\5\u0150\u00a9\2\u0760\u0761\7i"+
		"\2\2\u0761\u0763\3\2\2\2\u0762\u075d\3\2\2\2\u0762\u0763\3\2\2\2\u0763"+
		"\u0764\3\2\2\2\u0764\u0767\7\27\2\2\u0765\u0767\7N\2\2\u0766\u0762\3\2"+
		"\2\2\u0766\u0765\3\2\2\2\u0767\u0773\3\2\2\2\u0768\u076a\7\u0085\2\2\u0769"+
		"\u0768\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076c\3\2\2\2\u076b\u076d\7\u0086"+
		"\2\2\u076c\u076b\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u0774\3\2\2\2\u076e"+
		"\u0770\7\u0086\2\2\u076f\u076e\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0771"+
		"\3\2\2\2\u0771\u0772\7g\2\2\u0772\u0774\5\u00f6|\2\u0773\u0769\3\2\2\2"+
		"\u0773\u076f\3\2\2\2\u0774\u0155\3\2\2\2\u0775\u0776\5\u015a\u00ae\2\u0776"+
		"\u0778\7h\2\2\u0777\u0779\5\u015c\u00af\2\u0778\u0777\3\2\2\2\u0778\u0779"+
		"\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077b\7i\2\2\u077b\u0157\3\2\2\2\u077c"+
		"\u0788\5\u0156\u00ac\2\u077d\u0780\5\u014a\u00a6\2\u077e\u0780\5\u014c"+
		"\u00a7\2\u077f\u077d\3\2\2\2\u077f\u077e\3\2\2\2\u0780\u0781\3\2\2\2\u0781"+
		"\u0783\7h\2\2\u0782\u0784\5\u015c\u00af\2\u0783\u0782\3\2\2\2\u0783\u0784"+
		"\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0786\7i\2\2\u0786\u0788\3\2\2\2\u0787"+
		"\u077c\3\2\2\2\u0787\u077f\3\2\2\2\u0788\u0159\3\2\2\2\u0789\u078a\7\u0086"+
		"\2\2\u078a\u015b\3\2\2\2\u078b\u078d\5\u015e\u00b0\2\u078c\u078e\7\u0085"+
		"\2\2\u078d\u078c\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u0796\3\2\2\2\u078f"+
		"\u0790\7|\2\2\u0790\u0792\5\u015e\u00b0\2\u0791\u0793\7\u0085\2\2\u0792"+
		"\u0791\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0795\3\2\2\2\u0794\u078f\3\2"+
		"\2\2\u0795\u0798\3\2\2\2\u0796\u0794\3\2\2\2\u0796\u0797\3\2\2\2\u0797"+
		"\u015d\3\2\2\2\u0798\u0796\3\2\2\2\u0799\u079d\5\u00f6|\2\u079a\u079d"+
		"\5^\60\2\u079b\u079d\5\6\4\2\u079c\u0799\3\2\2\2\u079c\u079a\3\2\2\2\u079c"+
		"\u079b\3\2\2\2\u079d\u015f\3\2\2\2\u079e\u079f\7N\2\2\u079f\u07a5\5\f"+
		"\7\2\u07a0\u07a6\7\u0086\2\2\u07a1\u07a3\7F\2\2\u07a2\u07a1\3\2\2\2\u07a2"+
		"\u07a3\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a6\5\u0156\u00ac\2\u07a5\u07a0"+
		"\3\2\2\2\u07a5\u07a2\3\2\2\2\u07a6\u0161\3\2\2\2\u07a7\u07a9\7&\2\2\u07a8"+
		"\u07a7\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ab\7F"+
		"\2\2\u07ab\u07ac\5~@\2\u07ac\u0163\3\2\2\2\u07ad\u07ae\7F\2\2\u07ae\u07af"+
		"\7h\2\2\u07af\u07b0\7i\2\2\u07b0\u07b1\5~@\2\u07b1\u0165\3\2\2\2\u07b2"+
		"\u07b3\7K\2\2\u07b3\u07b4\5f\64\2\u07b4\u07b5\5\u016a\u00b6\2\u07b5\u0167"+
		"\3\2\2\2\u07b6\u07b8\7K\2\2\u07b7\u07b9\5\u0142\u00a2\2\u07b8\u07b7\3"+
		"\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07bb\5f\64\2\u07bb"+
		"\u07bc\5\u016a\u00b6\2\u07bc\u0169\3\2\2\2\u07bd\u07bf\5\u016c\u00b7\2"+
		"\u07be\u07bd\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0\u07be\3\2\2\2\u07c0\u07c1"+
		"\3\2\2\2\u07c1\u016b\3\2\2\2\u07c2\u07c3\7\23\2\2\u07c3\u07c4\7W\2\2\u07c4"+
		"\u07c5\5\u016e\u00b8\2\u07c5\u07c6\7X\2\2\u07c6\u07c7\5f\64\2\u07c7\u016d"+
		"\3\2\2\2\u07c8\u07ca\5\u00ccg\2\u07c9\u07c8\3\2\2\2\u07c9\u07ca\3\2\2"+
		"\2\u07ca\u07cb\3\2\2\2\u07cb\u07ce\5\u009aN\2\u07cc\u07cf\5\u00e2r\2\u07cd"+
		"\u07cf\5\u00f8}\2\u07ce\u07cc\3\2\2\2\u07ce\u07cd\3\2\2\2\u07ce\u07cf"+
		"\3\2\2\2\u07cf\u07d2\3\2\2\2\u07d0\u07d2\7\u0085\2\2\u07d1\u07c9\3\2\2"+
		"\2\u07d1\u07d0\3\2\2\2\u07d2\u016f\3\2\2\2\u07d3\u07d5\7I\2\2\u07d4\u07d6"+
		"\5X-\2\u07d5\u07d4\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6\u0171\3\2\2\2\u07d7"+
		"\u07da\5\u0174\u00bb\2\u07d8\u07da\5\u0178\u00bd\2\u07d9\u07d7\3\2\2\2"+
		"\u07d9\u07d8\3\2\2\2\u07da\u0173\3\2\2\2\u07db\u07dc\7I\2\2\u07dc\u07de"+
		"\7W\2\2\u07dd\u07df\5\u0176\u00bc\2\u07de\u07dd\3\2\2\2\u07de\u07df\3"+
		"\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e1\7X\2\2\u07e1\u0175\3\2\2\2\u07e2"+
		"\u07e4\5\u00f6|\2\u07e3\u07e5\7\u0085\2\2\u07e4\u07e3\3\2\2\2\u07e4\u07e5"+
		"\3\2\2\2\u07e5\u07ed\3\2\2\2\u07e6\u07e7\7|\2\2\u07e7\u07e9\5\u00f6|\2"+
		"\u07e8\u07ea\7\u0085\2\2\u07e9\u07e8\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea"+
		"\u07ec\3\2\2\2\u07eb\u07e6\3\2\2\2\u07ec\u07ef\3\2\2\2\u07ed\u07eb\3\2"+
		"\2\2\u07ed\u07ee\3\2\2\2\u07ee\u0177\3\2\2\2\u07ef\u07ed\3\2\2\2\u07f0"+
		"\u07f1\7\64\2\2\u07f1\u07f2\7W\2\2\u07f2\u07f3\5^\60\2\u07f3\u07f4\7X"+
		"\2\2\u07f4\u07f7\3\2\2\2\u07f5\u07f7\7\64\2\2\u07f6\u07f0\3\2\2\2\u07f6"+
		"\u07f5\3\2\2\2\u07f7\u0179\3\2\2\2\u07f8\u07fb\7\63\2\2\u07f9\u07fa\7"+
		"Y\2\2\u07fa\u07fc\7Z\2\2\u07fb\u07f9\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc"+
		"\u082e\3\2\2\2\u07fd\u0800\7\36\2\2\u07fe\u07ff\7Y\2\2\u07ff\u0801\7Z"+
		"\2\2\u0800\u07fe\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u082e\3\2\2\2\u0802"+
		"\u082e\7]\2\2\u0803\u082e\7^\2\2\u0804\u082e\7_\2\2\u0805\u082e\7`\2\2"+
		"\u0806\u082e\7a\2\2\u0807\u082e\7b\2\2\u0808\u082e\7c\2\2\u0809\u082e"+
		"\7d\2\2\u080a\u082e\7e\2\2\u080b\u082e\7f\2\2\u080c\u082e\7g\2\2\u080d"+
		"\u082e\7i\2\2\u080e\u082e\7h\2\2\u080f\u082e\7w\2\2\u0810\u082e\7j\2\2"+
		"\u0811\u082e\7k\2\2\u0812\u082e\7l\2\2\u0813\u082e\7g\2\2\u0814\u082e"+
		"\7n\2\2\u0815\u082e\7o\2\2\u0816\u082e\7p\2\2\u0817\u082e\7q\2\2\u0818"+
		"\u0819\7h\2\2\u0819\u082e\7h\2\2\u081a\u081b\7i\2\2\u081b\u082e\7i\2\2"+
		"\u081c\u082e\7s\2\2\u081d\u082e\7r\2\2\u081e\u082e\7t\2\2\u081f\u082e"+
		"\7u\2\2\u0820\u082e\7v\2\2\u0821\u082e\7w\2\2\u0822\u082e\7x\2\2\u0823"+
		"\u082e\7y\2\2\u0824\u082e\7z\2\2\u0825\u082e\7{\2\2\u0826\u082e\7|\2\2"+
		"\u0827\u082e\7}\2\2\u0828\u082e\7~\2\2\u0829\u082a\7W\2\2\u082a\u082e"+
		"\7X\2\2\u082b\u082c\7Y\2\2\u082c\u082e\7Z\2\2\u082d\u07f8\3\2\2\2\u082d"+
		"\u07fd\3\2\2\2\u082d\u0802\3\2\2\2\u082d\u0803\3\2\2\2\u082d\u0804\3\2"+
		"\2\2\u082d\u0805\3\2\2\2\u082d\u0806\3\2\2\2\u082d\u0807\3\2\2\2\u082d"+
		"\u0808\3\2\2\2\u082d\u0809\3\2\2\2\u082d\u080a\3\2\2\2\u082d\u080b\3\2"+
		"\2\2\u082d\u080c\3\2\2\2\u082d\u080d\3\2\2\2\u082d\u080e\3\2\2\2\u082d"+
		"\u080f\3\2\2\2\u082d\u0810\3\2\2\2\u082d\u0811\3\2\2\2\u082d\u0812\3\2"+
		"\2\2\u082d\u0813\3\2\2\2\u082d\u0814\3\2\2\2\u082d\u0815\3\2\2\2\u082d"+
		"\u0816\3\2\2\2\u082d\u0817\3\2\2\2\u082d\u0818\3\2\2\2\u082d\u081a\3\2"+
		"\2\2\u082d\u081c\3\2\2\2\u082d\u081d\3\2\2\2\u082d\u081e\3\2\2\2\u082d"+
		"\u081f\3\2\2\2\u082d\u0820\3\2\2\2\u082d\u0821\3\2\2\2\u082d\u0822\3\2"+
		"\2\2\u082d\u0823\3\2\2\2\u082d\u0824\3\2\2\2\u082d\u0825\3\2\2\2\u082d"+
		"\u0826\3\2\2\2\u082d\u0827\3\2\2\2\u082d\u0828\3\2\2\2\u082d\u0829\3\2"+
		"\2\2\u082d\u082b\3\2\2\2\u082e\u017b\3\2\2\2\u082f\u0830\t\26\2\2\u0830"+
		"\u017d\3\2\2\2\u012c\u017f\u0186\u018f\u0193\u019c\u019f\u01a3\u01ab\u01b2"+
		"\u01b5\u01ba\u01bf\u01c5\u01cd\u01cf\u01d8\u01dc\u01e0\u01e3\u01e7\u01ea"+
		"\u01f1\u01f5\u01f8\u01fb\u01fe\u0204\u020b\u0219\u021d\u0223\u0233\u0237"+
		"\u0239\u023b\u0243\u0248\u0255\u025c\u0268\u0272\u0277\u027b\u0282\u0285"+
		"\u028d\u0291\u0294\u029b\u02a2\u02a6\u02ab\u02af\u02b2\u02b7\u02c6\u02cd"+
		"\u02d5\u02dd\u02e7\u02ea\u02f2\u02f9\u0300\u0308\u030e\u0315\u031d\u0325"+
		"\u032d\u0335\u033e\u0346\u034f\u0356\u035e\u0361\u0364\u036a\u0370\u0376"+
		"\u037d\u0388\u0390\u0394\u039b\u039d\u03b1\u03b5\u03bb\u03c0\u03c4\u03c7"+
		"\u03ce\u03d5\u03d9\u03e2\u03ed\u03f7\u03fc\u0403\u0406\u040b\u0410\u0425"+
		"\u042a\u042d\u0438\u043e\u0443\u0446\u044b\u044e\u0451\u0467\u046d\u0473"+
		"\u0479\u047c\u0482\u0486\u048a\u048d\u0495\u0497\u049d\u04a0\u04a3\u04a6"+
		"\u04aa\u04ae\u04b4\u04be\u04c4\u04ca\u04cf\u04d4\u04d8\u04e5\u04eb\u04ef"+
		"\u04f5\u04fa\u0509\u050d\u0512\u0517\u051c\u0522\u0525\u052e\u0532\u0537"+
		"\u053b\u0541\u0548\u0559\u055b\u0562\u0567\u056e\u0572\u0576\u057e\u0584"+
		"\u058a\u058e\u0590\u0594\u0599\u059d\u05a0\u05a3\u05a6\u05ab\u05af\u05b2"+
		"\u05b6\u05b9\u05bb\u05c0\u05c7\u05cd\u05d1\u05d7\u05dd\u05e0\u05e2\u05e8"+
		"\u05ec\u05f2\u05f9\u05fd\u05ff\u0603\u0609\u0615\u0619\u061b\u061f\u0624"+
		"\u0627\u062e\u0632\u0637\u0639\u063d\u0640\u0643\u0647\u064c\u0653\u065a"+
		"\u065f\u0663\u0667\u066c\u0670\u0676\u0678\u067e\u0683\u0689\u068d\u068f"+
		"\u0692\u0696\u069a\u069c\u069e\u06a1\u06ad\u06af\u06b2\u06b5\u06b8\u06c1"+
		"\u06c8\u06cd\u06d0\u06d3\u06d5\u06d8\u06db\u06df\u06e4\u06f1\u06f6\u06fa"+
		"\u06fe\u0703\u0708\u070c\u070f\u0713\u071e\u0722\u0729\u072e\u0732\u0738"+
		"\u073c\u0740\u0749\u0756\u075b\u0762\u0766\u0769\u076c\u076f\u0773\u0778"+
		"\u077f\u0783\u0787\u078d\u0792\u0796\u079c\u07a2\u07a5\u07a8\u07b8\u07c0"+
		"\u07c9\u07ce\u07d1\u07d5\u07d9\u07de\u07e4\u07e9\u07ed\u07f6\u07fb\u0800"+
		"\u082d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}