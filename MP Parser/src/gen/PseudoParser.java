package gen;// Generated from C:/Users/ShyreneChing/Desktop/DLSU/AY 2020-2021 Term 1/CMPILER/MP/MC01/MP Parser/MP Parser/src\PseudoParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudoParser extends Parser {
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
		RULE_selectionStatement = 52, RULE_condition = 53, RULE_iterationStatement = 54, 
		RULE_forInitStatement = 55, RULE_forRangeDeclaration = 56, RULE_forRangeInitializer = 57, 
		RULE_jumpStatement = 58, RULE_declarationStatement = 59, RULE_declarationseq = 60, 
		RULE_declaration = 61, RULE_blockDeclaration = 62, RULE_aliasDeclaration = 63, 
		RULE_simpleDeclaration = 64, RULE_staticAssertDeclaration = 65, RULE_emptyDeclaration = 66, 
		RULE_attributeDeclaration = 67, RULE_declSpecifier = 68, RULE_declSpecifierSeq = 69, 
		RULE_storageClassSpecifier = 70, RULE_functionSpecifier = 71, RULE_typedefName = 72, 
		RULE_typeSpecifier = 73, RULE_trailingTypeSpecifier = 74, RULE_typeSpecifierSeq = 75, 
		RULE_trailingTypeSpecifierSeq = 76, RULE_simpleTypeSpecifier = 77, RULE_theTypeName = 78, 
		RULE_decltypeSpecifier = 79, RULE_elaboratedTypeSpecifier = 80, RULE_enumName = 81, 
		RULE_enumSpecifier = 82, RULE_enumHead = 83, RULE_opaqueEnumDeclaration = 84, 
		RULE_enumkey = 85, RULE_enumbase = 86, RULE_enumeratorList = 87, RULE_enumeratorDefinition = 88, 
		RULE_enumerator = 89, RULE_namespaceName = 90, RULE_originalNamespaceName = 91, 
		RULE_namespaceDefinition = 92, RULE_namespaceAlias = 93, RULE_namespaceAliasDefinition = 94, 
		RULE_qualifiednamespacespecifier = 95, RULE_usingDeclaration = 96, RULE_usingDirective = 97, 
		RULE_asmDefinition = 98, RULE_linkageSpecification = 99, RULE_attributeSpecifierSeq = 100, 
		RULE_attributeSpecifier = 101, RULE_alignmentspecifier = 102, RULE_attributeList = 103, 
		RULE_attribute = 104, RULE_attributeNamespace = 105, RULE_attributeArgumentClause = 106, 
		RULE_balancedTokenSeq = 107, RULE_balancedtoken = 108, RULE_initDeclaratorList = 109, 
		RULE_initDeclarator = 110, RULE_declarator = 111, RULE_pointerDeclarator = 112, 
		RULE_noPointerDeclarator = 113, RULE_parametersAndQualifiers = 114, RULE_trailingReturnType = 115, 
		RULE_pointerOperator = 116, RULE_cvqualifierseq = 117, RULE_cvQualifier = 118, 
		RULE_refqualifier = 119, RULE_declaratorid = 120, RULE_theTypeId = 121, 
		RULE_abstractDeclarator = 122, RULE_pointerAbstractDeclarator = 123, RULE_noPointerAbstractDeclarator = 124, 
		RULE_abstractPackDeclarator = 125, RULE_noPointerAbstractPackDeclarator = 126, 
		RULE_parameterDeclarationClause = 127, RULE_parameterDeclarationList = 128, 
		RULE_parameterDeclaration = 129, RULE_functionDefinition = 130, RULE_functionBody = 131, 
		RULE_initializer = 132, RULE_braceOrEqualInitializer = 133, RULE_initializerClause = 134, 
		RULE_initializerList = 135, RULE_bracedInitList = 136, RULE_className = 137, 
		RULE_classSpecifier = 138, RULE_classHead = 139, RULE_classHeadName = 140, 
		RULE_classVirtSpecifier = 141, RULE_classKey = 142, RULE_memberSpecification = 143, 
		RULE_memberdeclaration = 144, RULE_memberDeclaratorList = 145, RULE_memberDeclarator = 146, 
		RULE_virtualSpecifierSeq = 147, RULE_virtualSpecifier = 148, RULE_pureSpecifier = 149, 
		RULE_baseClause = 150, RULE_baseSpecifierList = 151, RULE_baseSpecifier = 152, 
		RULE_classOrDeclType = 153, RULE_baseTypeSpecifier = 154, RULE_accessSpecifier = 155, 
		RULE_conversionFunctionId = 156, RULE_conversionTypeId = 157, RULE_conversionDeclarator = 158, 
		RULE_constructorInitializer = 159, RULE_memInitializerList = 160, RULE_memInitializer = 161, 
		RULE_meminitializerid = 162, RULE_operatorFunctionId = 163, RULE_literalOperatorId = 164, 
		RULE_templateDeclaration = 165, RULE_templateparameterList = 166, RULE_templateParameter = 167, 
		RULE_typeParameter = 168, RULE_simpleTemplateId = 169, RULE_templateId = 170, 
		RULE_templateName = 171, RULE_templateArgumentList = 172, RULE_templateArgument = 173, 
		RULE_typeNameSpecifier = 174, RULE_explicitInstantiation = 175, RULE_explicitSpecialization = 176, 
		RULE_tryBlock = 177, RULE_functionTryBlock = 178, RULE_handlerSeq = 179, 
		RULE_handler = 180, RULE_exceptionDeclaration = 181, RULE_throwExpression = 182, 
		RULE_exceptionSpecification = 183, RULE_dynamicExceptionSpecification = 184, 
		RULE_typeIdList = 185, RULE_noeExceptSpecification = 186, RULE_theOperator = 187, 
		RULE_literal = 188;
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
			"selectionStatement", "condition", "iterationStatement", "forInitStatement", 
			"forRangeDeclaration", "forRangeInitializer", "jumpStatement", "declarationStatement", 
			"declarationseq", "declaration", "blockDeclaration", "aliasDeclaration", 
			"simpleDeclaration", "staticAssertDeclaration", "emptyDeclaration", "attributeDeclaration", 
			"declSpecifier", "declSpecifierSeq", "storageClassSpecifier", "functionSpecifier", 
			"typedefName", "typeSpecifier", "trailingTypeSpecifier", "typeSpecifierSeq", 
			"trailingTypeSpecifierSeq", "simpleTypeSpecifier", "theTypeName", "decltypeSpecifier", 
			"elaboratedTypeSpecifier", "enumName", "enumSpecifier", "enumHead", "opaqueEnumDeclaration", 
			"enumkey", "enumbase", "enumeratorList", "enumeratorDefinition", "enumerator", 
			"namespaceName", "originalNamespaceName", "namespaceDefinition", "namespaceAlias", 
			"namespaceAliasDefinition", "qualifiednamespacespecifier", "usingDeclaration", 
			"usingDirective", "asmDefinition", "linkageSpecification", "attributeSpecifierSeq", 
			"attributeSpecifier", "alignmentspecifier", "attributeList", "attribute", 
			"attributeNamespace", "attributeArgumentClause", "balancedTokenSeq", 
			"balancedtoken", "initDeclaratorList", "initDeclarator", "declarator", 
			"pointerDeclarator", "noPointerDeclarator", "parametersAndQualifiers", 
			"trailingReturnType", "pointerOperator", "cvqualifierseq", "cvQualifier", 
			"refqualifier", "declaratorid", "theTypeId", "abstractDeclarator", "pointerAbstractDeclarator", 
			"noPointerAbstractDeclarator", "abstractPackDeclarator", "noPointerAbstractPackDeclarator", 
			"parameterDeclarationClause", "parameterDeclarationList", "parameterDeclaration", 
			"functionDefinition", "functionBody", "initializer", "braceOrEqualInitializer", 
			"initializerClause", "initializerList", "bracedInitList", "className", 
			"classSpecifier", "classHead", "classHeadName", "classVirtSpecifier", 
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
	public String getGrammarFileName() { return "PseudoParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PseudoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PseudoParser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTranslationUnit(this);
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
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Asm - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Namespace - 10)) | (1L << (Operator - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(378);
				declarationseq();
				}
			}

			setState(381);
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
		public TerminalNode This() { return getToken(PseudoParser.This, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryExpression);
		try {
			int _alt;
			setState(395);
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
				setState(384); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(383);
						literal();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(386); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				match(LeftParen);
				setState(390);
				expression();
				setState(391);
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
				setState(393);
				idExpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(394);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterIdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitIdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitIdExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdExpressionContext idExpression() throws RecognitionException {
		IdExpressionContext _localctx = new IdExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idExpression);
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				unqualifiedId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public OperatorFunctionIdContext operatorFunctionId() {
			return getRuleContext(OperatorFunctionIdContext.class,0);
		}
		public ConversionFunctionIdContext conversionFunctionId() {
			return getRuleContext(ConversionFunctionIdContext.class,0);
		}
		public LiteralOperatorIdContext literalOperatorId() {
			return getRuleContext(LiteralOperatorIdContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(PseudoParser.Tilde, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterUnqualifiedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitUnqualifiedId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitUnqualifiedId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedIdContext unqualifiedId() throws RecognitionException {
		UnqualifiedIdContext _localctx = new UnqualifiedIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unqualifiedId);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				operatorFunctionId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				conversionFunctionId();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				literalOperatorId();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(405);
				match(Tilde);
				setState(408);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(406);
					className();
					}
					break;
				case Decltype:
					{
					setState(407);
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
				setState(410);
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
		public TerminalNode Template() { return getToken(PseudoParser.Template, 0); }
		public QualifiedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterQualifiedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitQualifiedId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitQualifiedId(this);
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
			setState(413);
			nestedNameSpecifier(0);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(414);
				match(Template);
				}
			}

			setState(417);
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
		public TerminalNode Doublecolon() { return getToken(PseudoParser.Doublecolon, 0); }
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoParser.Template, 0); }
		public NestedNameSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedNameSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNestedNameSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNestedNameSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNestedNameSpecifier(this);
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
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(420);
				theTypeName();
				}
				break;
			case 2:
				{
				setState(421);
				namespaceName();
				}
				break;
			case 3:
				{
				setState(422);
				decltypeSpecifier();
				}
				break;
			}
			setState(425);
			match(Doublecolon);
			}
			_ctx.stop = _input.LT(-1);
			setState(438);
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
					setState(427);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(433);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(428);
						match(Identifier);
						}
						break;
					case 2:
						{
						setState(430);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(429);
							match(Template);
							}
						}

						setState(432);
						simpleTemplateId();
						}
						break;
					}
					setState(435);
					match(Doublecolon);
					}
					} 
				}
				setState(440);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
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
			setState(441);
			lambdaIntroducer();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(442);
				lambdaDeclarator();
				}
			}

			setState(445);
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
		public TerminalNode LeftBracket() { return getToken(PseudoParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoParser.RightBracket, 0); }
		public LambdaCaptureContext lambdaCapture() {
			return getRuleContext(LambdaCaptureContext.class,0);
		}
		public LambdaIntroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaIntroducer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterLambdaIntroducer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitLambdaIntroducer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitLambdaIntroducer(this);
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
			setState(447);
			match(LeftBracket);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (This - 69)) | (1L << (And - 69)) | (1L << (Assign - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(448);
				lambdaCapture();
				}
			}

			setState(451);
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
		public TerminalNode Comma() { return getToken(PseudoParser.Comma, 0); }
		public LambdaCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaCapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterLambdaCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitLambdaCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitLambdaCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaCaptureContext lambdaCapture() throws RecognitionException {
		LambdaCaptureContext _localctx = new LambdaCaptureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdaCapture);
		int _la;
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				captureList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				captureDefault();
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(455);
					match(Comma);
					setState(456);
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
		public TerminalNode And() { return getToken(PseudoParser.And, 0); }
		public TerminalNode Assign() { return getToken(PseudoParser.Assign, 0); }
		public CaptureDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterCaptureDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitCaptureDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitCaptureDefault(this);
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
			setState(461);
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParser.Comma, i);
		}
		public TerminalNode Ellipsis() { return getToken(PseudoParser.Ellipsis, 0); }
		public CaptureListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterCaptureList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitCaptureList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitCaptureList(this);
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
			setState(463);
			capture();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(464);
				match(Comma);
				setState(465);
				capture();
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(471);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_capture);
		try {
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				simpleCapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public TerminalNode And() { return getToken(PseudoParser.And, 0); }
		public TerminalNode This() { return getToken(PseudoParser.This, 0); }
		public SimpleCaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterSimpleCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitSimpleCapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitSimpleCapture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCaptureContext simpleCapture() throws RecognitionException {
		SimpleCaptureContext _localctx = new SimpleCaptureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleCapture);
		int _la;
		try {
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(478);
					match(And);
					}
				}

				setState(481);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode And() { return getToken(PseudoParser.And, 0); }
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterInitcapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitInitcapture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitInitcapture(this);
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
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==And) {
				{
				setState(485);
				match(And);
				}
			}

			setState(488);
			match(Identifier);
			setState(489);
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
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public ParameterDeclarationClauseContext parameterDeclarationClause() {
			return getRuleContext(ParameterDeclarationClauseContext.class,0);
		}
		public TerminalNode Mutable() { return getToken(PseudoParser.Mutable, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterLambdaDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitLambdaDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitLambdaDeclarator(this);
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
			setState(491);
			match(LeftParen);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Struct - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftBracket - 74)) | (1L << (Doublecolon - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(492);
				parameterDeclarationClause();
				}
			}

			setState(495);
			match(RightParen);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(496);
				match(Mutable);
				}
			}

			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(499);
				exceptionSpecification();
				}
			}

			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(502);
				attributeSpecifierSeq();
				}
			}

			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(505);
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
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Less() { return getToken(PseudoParser.Less, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Greater() { return getToken(PseudoParser.Greater, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dynamic_cast() { return getToken(PseudoParser.Dynamic_cast, 0); }
		public TerminalNode Static_cast() { return getToken(PseudoParser.Static_cast, 0); }
		public TerminalNode Reinterpret_cast() { return getToken(PseudoParser.Reinterpret_cast, 0); }
		public TerminalNode Const_cast() { return getToken(PseudoParser.Const_cast, 0); }
		public TypeIdOfTheTypeIdContext typeIdOfTheTypeId() {
			return getRuleContext(TypeIdOfTheTypeIdContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PseudoParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(PseudoParser.Dot, 0); }
		public TerminalNode Arrow() { return getToken(PseudoParser.Arrow, 0); }
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public PseudoDestructorNameContext pseudoDestructorName() {
			return getRuleContext(PseudoDestructorNameContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoParser.Template, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
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
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(509);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(512);
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
					setState(510);
					simpleTypeSpecifier();
					}
					break;
				case Typename_:
					{
					setState(511);
					typeNameSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(520);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
					{
					setState(514);
					match(LeftParen);
					setState(516);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(515);
						expressionList();
						}
						break;
					}
					setState(518);
					match(RightParen);
					}
					break;
				case LeftBrace:
					{
					setState(519);
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
				setState(522);
				_la = _input.LA(1);
				if ( !(((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (Const_cast - 24)) | (1L << (Dynamic_cast - 24)) | (1L << (Reinterpret_cast - 24)) | (1L << (Static_cast - 24)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(523);
				match(Less);
				setState(524);
				theTypeId();
				setState(525);
				match(Greater);
				setState(526);
				match(LeftParen);
				setState(527);
				expression();
				setState(528);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(530);
				typeIdOfTheTypeId();
				setState(531);
				match(LeftParen);
				setState(534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(532);
					expression();
					}
					break;
				case 2:
					{
					setState(533);
					theTypeId();
					}
					break;
				}
				setState(536);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(563);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(540);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(541);
						match(LeftBracket);
						setState(544);
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
						case RightBracket:
						case Plus:
						case Minus:
						case Star:
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
						case Question:
						case Doublecolon:
						case Identifier:
							{
							setState(542);
							expression();
							}
							break;
						case LeftBrace:
							{
							setState(543);
							bracedInitList();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(546);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(548);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(549);
						match(LeftParen);
						setState(551);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(550);
							expressionList();
							}
							break;
						}
						setState(553);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(554);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(555);
						_la = _input.LA(1);
						if ( !(_la==Arrow || _la==Dot) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(561);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(557);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==Template) {
								{
								setState(556);
								match(Template);
								}
							}

							setState(559);
							idExpression();
							}
							break;
						case 2:
							{
							setState(560);
							pseudoDestructorName();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		public TerminalNode Typeid_() { return getToken(PseudoParser.Typeid_, 0); }
		public TypeIdOfTheTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdOfTheTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTypeIdOfTheTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTypeIdOfTheTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTypeIdOfTheTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdOfTheTypeIdContext typeIdOfTheTypeId() throws RecognitionException {
		TypeIdOfTheTypeIdContext _localctx = new TypeIdOfTheTypeIdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeIdOfTheTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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
		public TerminalNode Tilde() { return getToken(PseudoParser.Tilde, 0); }
		public List<TheTypeNameContext> theTypeName() {
			return getRuleContexts(TheTypeNameContext.class);
		}
		public TheTypeNameContext theTypeName(int i) {
			return getRuleContext(TheTypeNameContext.class,i);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(PseudoParser.Doublecolon, 0); }
		public TerminalNode Template() { return getToken(PseudoParser.Template, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterPseudoDestructorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitPseudoDestructorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitPseudoDestructorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoDestructorNameContext pseudoDestructorName() throws RecognitionException {
		PseudoDestructorNameContext _localctx = new PseudoDestructorNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pseudoDestructorName);
		int _la;
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(572);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(575);
					theTypeName();
					setState(576);
					match(Doublecolon);
					}
				}

				setState(580);
				match(Tilde);
				setState(581);
				theTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				nestedNameSpecifier(0);
				setState(583);
				match(Template);
				setState(584);
				simpleTemplateId();
				setState(585);
				match(Doublecolon);
				setState(586);
				match(Tilde);
				setState(587);
				theTypeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				match(Tilde);
				setState(590);
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
		public TerminalNode PlusPlus() { return getToken(PseudoParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(PseudoParser.MinusMinus, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(PseudoParser.Sizeof, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public TerminalNode Ellipsis() { return getToken(PseudoParser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public TerminalNode Alignof() { return getToken(PseudoParser.Alignof, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryExpression);
		try {
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PlusPlus:
					{
					setState(594);
					match(PlusPlus);
					}
					break;
				case MinusMinus:
					{
					setState(595);
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
					setState(596);
					unaryOperator();
					}
					break;
				case Sizeof:
					{
					setState(597);
					match(Sizeof);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(600);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				match(Sizeof);
				setState(610);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
					{
					setState(602);
					match(LeftParen);
					setState(603);
					theTypeId();
					setState(604);
					match(RightParen);
					}
					break;
				case Ellipsis:
					{
					setState(606);
					match(Ellipsis);
					setState(607);
					match(LeftParen);
					setState(608);
					match(Identifier);
					setState(609);
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
				setState(612);
				match(Alignof);
				setState(613);
				match(LeftParen);
				setState(614);
				theTypeId();
				setState(615);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(617);
				noExceptExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(618);
				newExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(619);
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
		public TerminalNode Or() { return getToken(PseudoParser.Or, 0); }
		public TerminalNode Star() { return getToken(PseudoParser.Star, 0); }
		public TerminalNode And() { return getToken(PseudoParser.And, 0); }
		public TerminalNode Plus() { return getToken(PseudoParser.Plus, 0); }
		public TerminalNode Tilde() { return getToken(PseudoParser.Tilde, 0); }
		public TerminalNode Minus() { return getToken(PseudoParser.Minus, 0); }
		public TerminalNode Not() { return getToken(PseudoParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitUnaryOperator(this);
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
			setState(622);
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
		public TerminalNode New() { return getToken(PseudoParser.New, 0); }
		public NewTypeIdContext newTypeId() {
			return getRuleContext(NewTypeIdContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(PseudoParser.Doublecolon, 0); }
		public NewPlacementContext newPlacement() {
			return getRuleContext(NewPlacementContext.class,0);
		}
		public NewInitializerContext newInitializer() {
			return getRuleContext(NewInitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNewExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNewExpression(this);
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
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doublecolon) {
				{
				setState(624);
				match(Doublecolon);
				}
			}

			setState(627);
			match(New);
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(628);
				newPlacement();
				}
				break;
			}
			setState(636);
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
				setState(631);
				newTypeId();
				}
				break;
			case LeftParen:
				{
				{
				setState(632);
				match(LeftParen);
				setState(633);
				theTypeId();
				setState(634);
				match(RightParen);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen || _la==LeftBrace) {
				{
				setState(638);
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
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public NewPlacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newPlacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNewPlacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNewPlacement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNewPlacement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewPlacementContext newPlacement() throws RecognitionException {
		NewPlacementContext _localctx = new NewPlacementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newPlacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(LeftParen);
			setState(642);
			expressionList();
			setState(643);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNewTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNewTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNewTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewTypeIdContext newTypeId() throws RecognitionException {
		NewTypeIdContext _localctx = new NewTypeIdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_newTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			typeSpecifierSeq();
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(646);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNewDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNewDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNewDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewDeclaratorContext newDeclarator() throws RecognitionException {
		NewDeclaratorContext _localctx = new NewDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_newDeclarator);
		try {
			setState(654);
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
				setState(649);
				pointerOperator();
				setState(651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(650);
					newDeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
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
		public TerminalNode LeftBracket() { return getToken(PseudoParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(PseudoParser.RightBracket, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNoPointerNewDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNoPointerNewDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNoPointerNewDeclarator(this);
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
			setState(657);
			match(LeftBracket);
			setState(658);
			expression();
			setState(659);
			match(RightBracket);
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(660);
				attributeSpecifierSeq();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerNewDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerNewDeclarator);
					setState(663);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(664);
					match(LeftBracket);
					setState(665);
					constantExpression();
					setState(666);
					match(RightBracket);
					setState(668);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(667);
						attributeSpecifierSeq();
						}
						break;
					}
					}
					} 
				}
				setState(674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNewInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNewInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNewInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewInitializerContext newInitializer() throws RecognitionException {
		NewInitializerContext _localctx = new NewInitializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_newInitializer);
		try {
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				match(LeftParen);
				setState(677);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(676);
					expressionList();
					}
					break;
				}
				setState(679);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
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
		public TerminalNode Delete() { return getToken(PseudoParser.Delete, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(PseudoParser.Doublecolon, 0); }
		public TerminalNode LeftBracket() { return getToken(PseudoParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoParser.RightBracket, 0); }
		public DeleteExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterDeleteExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitDeleteExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitDeleteExpression(this);
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
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doublecolon) {
				{
				setState(683);
				match(Doublecolon);
				}
			}

			setState(686);
			match(Delete);
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(687);
				match(LeftBracket);
				setState(688);
				match(RightBracket);
				}
				break;
			}
			setState(691);
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
		public TerminalNode Noexcept() { return getToken(PseudoParser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public NoExceptExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noExceptExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNoExceptExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNoExceptExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNoExceptExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoExceptExpressionContext noExceptExpression() throws RecognitionException {
		NoExceptExpressionContext _localctx = new NoExceptExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_noExceptExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(Noexcept);
			setState(694);
			match(LeftParen);
			setState(695);
			expression();
			setState(696);
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
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_castExpression);
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				match(LeftParen);
				setState(700);
				theTypeId();
				setState(701);
				match(RightParen);
				setState(702);
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
		public List<TerminalNode> DotStar() { return getTokens(PseudoParser.DotStar); }
		public TerminalNode DotStar(int i) {
			return getToken(PseudoParser.DotStar, i);
		}
		public List<TerminalNode> ArrowStar() { return getTokens(PseudoParser.ArrowStar); }
		public TerminalNode ArrowStar(int i) {
			return getToken(PseudoParser.ArrowStar, i);
		}
		public PointerMemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerMemberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterPointerMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitPointerMemberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitPointerMemberExpression(this);
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
			setState(706);
			castExpression();
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ArrowStar || _la==DotStar) {
				{
				{
				setState(707);
				_la = _input.LA(1);
				if ( !(_la==ArrowStar || _la==DotStar) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(708);
				castExpression();
				}
				}
				setState(713);
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
		public List<TerminalNode> Star() { return getTokens(PseudoParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(PseudoParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(PseudoParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(PseudoParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(PseudoParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(PseudoParser.Mod, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
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
			setState(714);
			pointerMemberExpression();
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Star - 93)) | (1L << (Div - 93)) | (1L << (Mod - 93)))) != 0)) {
				{
				{
				setState(715);
				_la = _input.LA(1);
				if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Star - 93)) | (1L << (Div - 93)) | (1L << (Mod - 93)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(716);
				pointerMemberExpression();
				}
				}
				setState(721);
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
		public List<TerminalNode> Plus() { return getTokens(PseudoParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(PseudoParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(PseudoParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(PseudoParser.Minus, i);
		}
		public List<TerminalNode> PlusPlus() { return getTokens(PseudoParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(PseudoParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(PseudoParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(PseudoParser.MinusMinus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_additiveExpression);
		int _la;
		try {
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				multiplicativeExpression();
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Plus || _la==Minus) {
					{
					{
					setState(723);
					_la = _input.LA(1);
					if ( !(_la==Plus || _la==Minus) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(724);
					multiplicativeExpression();
					}
					}
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PlusPlus || _la==MinusMinus) {
					{
					{
					setState(730);
					_la = _input.LA(1);
					if ( !(_la==PlusPlus || _la==MinusMinus) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(731);
					multiplicativeExpression();
					notifyErrorListeners("redundant operator symbol");
					}
					}
					setState(738);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitShiftExpression(this);
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
			setState(741);
			additiveExpression();
			setState(747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(742);
					shiftOperator();
					setState(743);
					additiveExpression();
					}
					} 
				}
				setState(749);
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

	public static class ShiftOperatorContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(PseudoParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(PseudoParser.Greater, i);
		}
		public List<TerminalNode> Less() { return getTokens(PseudoParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(PseudoParser.Less, i);
		}
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterShiftOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitShiftOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitShiftOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftOperatorContext shiftOperator() throws RecognitionException {
		ShiftOperatorContext _localctx = new ShiftOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_shiftOperator);
		try {
			setState(754);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Greater:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				match(Greater);
				setState(751);
				match(Greater);
				}
				break;
			case Less:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				match(Less);
				setState(753);
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
		public List<TerminalNode> Less() { return getTokens(PseudoParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(PseudoParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(PseudoParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(PseudoParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(PseudoParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(PseudoParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(PseudoParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(PseudoParser.GreaterEqual, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
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
			setState(756);
			shiftExpression();
			setState(761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(757);
					_la = _input.LA(1);
					if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (Less - 102)) | (1L << (Greater - 102)) | (1L << (LessEqual - 102)) | (1L << (GreaterEqual - 102)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(758);
					shiftExpression();
					}
					} 
				}
				setState(763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
		public List<TerminalNode> Equal() { return getTokens(PseudoParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(PseudoParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(PseudoParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(PseudoParser.NotEqual, i);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(PseudoParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(PseudoParser.MinusMinus, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_equalityExpression);
		int _la;
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				relationalExpression();
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Equal || _la==NotEqual) {
					{
					{
					setState(765);
					_la = _input.LA(1);
					if ( !(_la==Equal || _la==NotEqual) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(766);
					relationalExpression();
					}
					}
					setState(771);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				postfixExpression(0);
				setState(773);
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
		public List<TerminalNode> And() { return getTokens(PseudoParser.And); }
		public TerminalNode And(int i) {
			return getToken(PseudoParser.And, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAndExpression(this);
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
			setState(777);
			equalityExpression();
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(778);
				match(And);
				setState(779);
				equalityExpression();
				}
				}
				setState(784);
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
		public List<TerminalNode> Caret() { return getTokens(PseudoParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(PseudoParser.Caret, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
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
			setState(785);
			andExpression();
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(786);
				match(Caret);
				setState(787);
				andExpression();
				}
				}
				setState(792);
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
		public List<TerminalNode> Or() { return getTokens(PseudoParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(PseudoParser.Or, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
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
			setState(793);
			exclusiveOrExpression();
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(794);
				match(Or);
				setState(795);
				exclusiveOrExpression();
				}
				}
				setState(800);
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
		public List<TerminalNode> AndAnd() { return getTokens(PseudoParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(PseudoParser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
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
			setState(801);
			inclusiveOrExpression();
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(802);
				match(AndAnd);
				setState(803);
				inclusiveOrExpression();
				}
				}
				setState(808);
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
		public List<TerminalNode> OrOr() { return getTokens(PseudoParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(PseudoParser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
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
			setState(809);
			logicalAndExpression();
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(810);
				match(OrOr);
				setState(811);
				logicalAndExpression();
				}
				}
				setState(816);
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
		public TerminalNode Question() { return getToken(PseudoParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PseudoParser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
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
			setState(817);
			logicalOrExpression();
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(818);
				match(Question);
				setState(819);
				expression();
				setState(820);
				match(Colon);
				setState(821);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assignmentExpression);
		try {
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(826);
				logicalOrExpression();
				setState(827);
				assignmentOperator();
				setState(828);
				initializerClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(830);
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
		public TerminalNode Assign() { return getToken(PseudoParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(PseudoParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(PseudoParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(PseudoParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(PseudoParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(PseudoParser.MinusAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(PseudoParser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(PseudoParser.LeftShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(PseudoParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(PseudoParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(PseudoParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
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
			setState(833);
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParser.Comma, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitExpression(this);
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
			setState(835);
			assignmentExpression();
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(836);
				match(Comma);
				setState(837);
				assignmentExpression();
				}
				}
				setState(842);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_statement);
		try {
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(845);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(846);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(855);
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
				case Question:
				case Doublecolon:
				case Semi:
				case Identifier:
					{
					setState(849);
					expressionStatement();
					}
					break;
				case LeftBrace:
					{
					setState(850);
					compoundStatement();
					}
					break;
				case If:
				case Switch:
					{
					setState(851);
					selectionStatement();
					}
					break;
				case Do:
				case For:
				case While:
					{
					setState(852);
					iterationStatement();
					}
					break;
				case Break:
				case Continue:
				case Goto:
				case Return:
					{
					setState(853);
					jumpStatement();
					}
					break;
				case Try:
					{
					setState(854);
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
				setState(857);
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
		public TerminalNode Colon() { return getToken(PseudoParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public TerminalNode Case() { return getToken(PseudoParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(PseudoParser.Default, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitLabeledStatement(this);
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
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(860);
				attributeSpecifierSeq();
				}
			}

			setState(867);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(863);
				match(Identifier);
				}
				break;
			case Case:
				{
				setState(864);
				match(Case);
				setState(865);
				constantExpression();
				}
				break;
			case Default:
				{
				setState(866);
				match(Default);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(869);
			match(Colon);
			setState(870);
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
		public TerminalNode Semi() { return getToken(PseudoParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(872);
				expression();
				}
				break;
			}
			setState(875);
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
		public TerminalNode LeftBrace() { return getToken(PseudoParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoParser.RightBrace, 0); }
		public StatementSeqContext statementSeq() {
			return getRuleContext(StatementSeqContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitCompoundStatement(this);
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
			setState(877);
			match(LeftBrace);
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (Caret - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (Assign - 64)) | (1L << (Less - 64)) | (1L << (Greater - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Comma - 64)) | (1L << (Question - 64)) | (1L << (Doublecolon - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Semi - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)))) != 0)) {
				{
				setState(878);
				statementSeq();
				}
			}

			setState(881);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterStatementSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitStatementSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitStatementSeq(this);
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
			setState(884); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(883);
				statement();
				}
				}
				setState(886); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (Caret - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (Assign - 64)) | (1L << (Less - 64)) | (1L << (Greater - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Comma - 64)) | (1L << (Question - 64)) | (1L << (Doublecolon - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Semi - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode If() { return getToken(PseudoParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(PseudoParser.Else, 0); }
		public TerminalNode Switch() { return getToken(PseudoParser.Switch, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_selectionStatement);
		try {
			setState(903);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				match(If);
				setState(889);
				match(LeftParen);
				setState(890);
				condition();
				setState(891);
				match(RightParen);
				setState(892);
				statement();
				setState(895);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(893);
					match(Else);
					setState(894);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(897);
				match(Switch);
				setState(898);
				match(LeftParen);
				setState(899);
				condition();
				setState(900);
				match(RightParen);
				setState(901);
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
		public TerminalNode Assign() { return getToken(PseudoParser.Assign, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_condition);
		int _la;
		try {
			setState(916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(905);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(906);
					attributeSpecifierSeq();
					}
				}

				setState(909);
				declSpecifierSeq();
				setState(910);
				declarator();
				setState(914);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Assign:
					{
					setState(911);
					match(Assign);
					setState(912);
					initializerClause();
					}
					break;
				case LeftBrace:
					{
					setState(913);
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
		public TerminalNode While() { return getToken(PseudoParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(PseudoParser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoParser.Semi, 0); }
		public TerminalNode For() { return getToken(PseudoParser.For, 0); }
		public ForInitStatementContext forInitStatement() {
			return getRuleContext(ForInitStatementContext.class,0);
		}
		public ForRangeDeclarationContext forRangeDeclaration() {
			return getRuleContext(ForRangeDeclarationContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PseudoParser.Colon, 0); }
		public ForRangeInitializerContext forRangeInitializer() {
			return getRuleContext(ForRangeInitializerContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_iterationStatement);
		try {
			setState(951);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				match(While);
				setState(919);
				match(LeftParen);
				setState(920);
				condition();
				setState(921);
				match(RightParen);
				setState(922);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
				match(Do);
				setState(925);
				statement();
				setState(926);
				match(While);
				setState(927);
				match(LeftParen);
				setState(928);
				expression();
				setState(929);
				match(RightParen);
				setState(930);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(932);
				match(For);
				setState(933);
				match(LeftParen);
				setState(946);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(934);
					forInitStatement();
					setState(936);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(935);
						condition();
						}
						break;
					}
					setState(938);
					match(Semi);
					setState(940);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(939);
						expression();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(942);
					forRangeDeclaration();
					setState(943);
					match(Colon);
					setState(944);
					forRangeInitializer();
					}
					break;
				}
				setState(948);
				match(RightParen);
				setState(949);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterForInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitForInitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitForInitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitStatementContext forInitStatement() throws RecognitionException {
		ForInitStatementContext _localctx = new ForInitStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_forInitStatement);
		try {
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterForRangeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitForRangeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitForRangeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRangeDeclarationContext forRangeDeclaration() throws RecognitionException {
		ForRangeDeclarationContext _localctx = new ForRangeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forRangeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(957);
				attributeSpecifierSeq();
				}
			}

			setState(960);
			declSpecifierSeq();
			setState(961);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterForRangeInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitForRangeInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitForRangeInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRangeInitializerContext forRangeInitializer() throws RecognitionException {
		ForRangeInitializerContext _localctx = new ForRangeInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forRangeInitializer);
		try {
			setState(965);
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
			case RightParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
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
			case Question:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				expression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
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
		public TerminalNode Semi() { return getToken(PseudoParser.Semi, 0); }
		public TerminalNode Break() { return getToken(PseudoParser.Break, 0); }
		public TerminalNode Continue() { return getToken(PseudoParser.Continue, 0); }
		public TerminalNode Return() { return getToken(PseudoParser.Return, 0); }
		public TerminalNode Goto() { return getToken(PseudoParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_jumpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				{
				setState(967);
				match(Break);
				}
				break;
			case Continue:
				{
				setState(968);
				match(Continue);
				}
				break;
			case Return:
				{
				setState(969);
				match(Return);
				setState(972);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(970);
					expression();
					}
					break;
				case 2:
					{
					setState(971);
					bracedInitList();
					}
					break;
				}
				}
				break;
			case Goto:
				{
				setState(974);
				match(Goto);
				setState(975);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(978);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitDeclarationseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitDeclarationseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_declarationseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(982);
				declaration();
				}
				}
				setState(985); 
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_declaration);
		try {
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				blockDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(989);
				templateDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(990);
				explicitInstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(991);
				explicitSpecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(992);
				linkageSpecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(993);
				namespaceDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(994);
				emptyDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(995);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterBlockDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitBlockDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitBlockDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockDeclarationContext blockDeclaration() throws RecognitionException {
		BlockDeclarationContext _localctx = new BlockDeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_blockDeclaration);
		try {
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				asmDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1000);
				namespaceAliasDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1001);
				usingDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1002);
				usingDirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1003);
				staticAssertDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1004);
				aliasDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1005);
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
		public TerminalNode Using() { return getToken(PseudoParser.Using, 0); }
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(PseudoParser.Assign, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoParser.Semi, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public AliasDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAliasDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAliasDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAliasDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasDeclarationContext aliasDeclaration() throws RecognitionException {
		AliasDeclarationContext _localctx = new AliasDeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_aliasDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(Using);
			setState(1009);
			match(Identifier);
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1010);
				attributeSpecifierSeq();
				}
			}

			setState(1013);
			match(Assign);
			setState(1014);
			theTypeId();
			setState(1015);
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
		public TerminalNode Semi() { return getToken(PseudoParser.Semi, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterSimpleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitSimpleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitSimpleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDeclarationContext simpleDeclaration() throws RecognitionException {
		SimpleDeclarationContext _localctx = new SimpleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_simpleDeclaration);
		int _la;
		try {
			setState(1031);
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
				setState(1018);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1017);
					declSpecifierSeq();
					}
					break;
				}
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Operator || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (LeftParen - 85)) | (1L << (Star - 85)) | (1L << (And - 85)) | (1L << (Tilde - 85)) | (1L << (AndAnd - 85)) | (1L << (Doublecolon - 85)) | (1L << (Ellipsis - 85)) | (1L << (Identifier - 85)))) != 0)) {
					{
					setState(1020);
					initDeclaratorList();
					}
				}

				setState(1023);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1024);
				attributeSpecifierSeq();
				setState(1026);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1025);
					declSpecifierSeq();
					}
					break;
				}
				setState(1028);
				initDeclaratorList();
				setState(1029);
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
		public TerminalNode Static_assert() { return getToken(PseudoParser.Static_assert, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PseudoParser.Comma, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoParser.StringLiteral, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(PseudoParser.Semi, 0); }
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterStaticAssertDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitStaticAssertDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitStaticAssertDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_staticAssertDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(Static_assert);
			setState(1034);
			match(LeftParen);
			setState(1035);
			constantExpression();
			setState(1036);
			match(Comma);
			setState(1037);
			match(StringLiteral);
			setState(1038);
			match(RightParen);
			setState(1039);
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
		public TerminalNode Semi() { return getToken(PseudoParser.Semi, 0); }
		public EmptyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterEmptyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitEmptyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitEmptyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyDeclarationContext emptyDeclaration() throws RecognitionException {
		EmptyDeclarationContext _localctx = new EmptyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_emptyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
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
		public TerminalNode Semi() { return getToken(PseudoParser.Semi, 0); }
		public AttributeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAttributeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAttributeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAttributeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDeclarationContext attributeDeclaration() throws RecognitionException {
		AttributeDeclarationContext _localctx = new AttributeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_attributeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			attributeSpecifierSeq();
			setState(1044);
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
		public TerminalNode Friend() { return getToken(PseudoParser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(PseudoParser.Typedef, 0); }
		public TerminalNode Constexpr() { return getToken(PseudoParser.Constexpr, 0); }
		public DeclSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterDeclSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitDeclSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitDeclSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclSpecifierContext declSpecifier() throws RecognitionException {
		DeclSpecifierContext _localctx = new DeclSpecifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_declSpecifier);
		try {
			setState(1052);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1046);
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
				setState(1047);
				typeSpecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1048);
				functionSpecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1049);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1050);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1051);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterDeclSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitDeclSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitDeclSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclSpecifierSeqContext declSpecifierSeq() throws RecognitionException {
		DeclSpecifierSeqContext _localctx = new DeclSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1055); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1054);
					declSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1057); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1059);
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
		public TerminalNode Register() { return getToken(PseudoParser.Register, 0); }
		public TerminalNode Static() { return getToken(PseudoParser.Static, 0); }
		public TerminalNode Thread_local() { return getToken(PseudoParser.Thread_local, 0); }
		public TerminalNode Extern() { return getToken(PseudoParser.Extern, 0); }
		public TerminalNode Mutable() { return getToken(PseudoParser.Mutable, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitStorageClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
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
		public TerminalNode Inline() { return getToken(PseudoParser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(PseudoParser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(PseudoParser.Explicit, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitFunctionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitFunctionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_functionSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTypedefName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTypedefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_typeSpecifier);
		try {
			setState(1071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1068);
				trailingTypeSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1069);
				classSpecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1070);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTrailingTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTrailingTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTrailingTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingTypeSpecifierContext trailingTypeSpecifier() throws RecognitionException {
		TrailingTypeSpecifierContext _localctx = new TrailingTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_trailingTypeSpecifier);
		try {
			setState(1077);
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
				setState(1073);
				simpleTypeSpecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				elaboratedTypeSpecifier();
				}
				break;
			case Typename_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1075);
				typeNameSpecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1076);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTypeSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTypeSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTypeSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierSeqContext typeSpecifierSeq() throws RecognitionException {
		TypeSpecifierSeqContext _localctx = new TypeSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_typeSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1080); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1079);
					typeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1082); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1084);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTrailingTypeSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTrailingTypeSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTrailingTypeSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingTypeSpecifierSeqContext trailingTypeSpecifierSeq() throws RecognitionException {
		TrailingTypeSpecifierSeqContext _localctx = new TrailingTypeSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_trailingTypeSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1088); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1087);
					trailingTypeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1090); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1092);
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
		public TerminalNode Template() { return getToken(PseudoParser.Template, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Char() { return getToken(PseudoParser.Char, 0); }
		public TerminalNode Char16() { return getToken(PseudoParser.Char16, 0); }
		public TerminalNode Char32() { return getToken(PseudoParser.Char32, 0); }
		public TerminalNode Wchar() { return getToken(PseudoParser.Wchar, 0); }
		public TerminalNode Bool() { return getToken(PseudoParser.Bool, 0); }
		public TerminalNode Short() { return getToken(PseudoParser.Short, 0); }
		public TerminalNode Int() { return getToken(PseudoParser.Int, 0); }
		public TerminalNode Long() { return getToken(PseudoParser.Long, 0); }
		public TerminalNode Signed() { return getToken(PseudoParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(PseudoParser.Unsigned, 0); }
		public TerminalNode Float() { return getToken(PseudoParser.Float, 0); }
		public TerminalNode Double() { return getToken(PseudoParser.Double, 0); }
		public TerminalNode Void() { return getToken(PseudoParser.Void, 0); }
		public TerminalNode Auto() { return getToken(PseudoParser.Auto, 0); }
		public DecltypeSpecifierContext decltypeSpecifier() {
			return getRuleContext(DecltypeSpecifierContext.class,0);
		}
		public SimpleTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterSimpleTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitSimpleTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitSimpleTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeSpecifierContext simpleTypeSpecifier() throws RecognitionException {
		SimpleTypeSpecifierContext _localctx = new SimpleTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_simpleTypeSpecifier);
		try {
			setState(1118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1095);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1098);
				theTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099);
				nestedNameSpecifier(0);
				setState(1100);
				match(Template);
				setState(1101);
				simpleTemplateId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1103);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1104);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1105);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1106);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1107);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1108);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1109);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1110);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1111);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1112);
				match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1113);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1114);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1115);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1116);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1117);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTheTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTheTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTheTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheTypeNameContext theTypeName() throws RecognitionException {
		TheTypeNameContext _localctx = new TheTypeNameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_theTypeName);
		try {
			setState(1124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1120);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1121);
				enumName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1122);
				typedefName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1123);
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
		public TerminalNode Decltype() { return getToken(PseudoParser.Decltype, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Auto() { return getToken(PseudoParser.Auto, 0); }
		public DecltypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterDecltypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitDecltypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitDecltypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecltypeSpecifierContext decltypeSpecifier() throws RecognitionException {
		DecltypeSpecifierContext _localctx = new DecltypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_decltypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			match(Decltype);
			setState(1127);
			match(LeftParen);
			setState(1130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1128);
				expression();
				}
				break;
			case 2:
				{
				setState(1129);
				match(Auto);
				}
				break;
			}
			setState(1132);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoParser.Template, 0); }
		public TerminalNode Enum() { return getToken(PseudoParser.Enum, 0); }
		public ElaboratedTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterElaboratedTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitElaboratedTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitElaboratedTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElaboratedTypeSpecifierContext elaboratedTypeSpecifier() throws RecognitionException {
		ElaboratedTypeSpecifierContext _localctx = new ElaboratedTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_elaboratedTypeSpecifier);
		int _la;
		try {
			setState(1156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Struct:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				classKey();
				setState(1149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Alignas || _la==LeftBracket) {
						{
						setState(1135);
						attributeSpecifierSeq();
						}
					}

					setState(1139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						setState(1138);
						nestedNameSpecifier(0);
						}
						break;
					}
					setState(1141);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(1142);
					simpleTemplateId();
					}
					break;
				case 3:
					{
					setState(1143);
					nestedNameSpecifier(0);
					setState(1145);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Template) {
						{
						setState(1144);
						match(Template);
						}
					}

					setState(1147);
					simpleTemplateId();
					}
					break;
				}
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				match(Enum);
				setState(1153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1152);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1155);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitEnumName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitEnumName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
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
		public TerminalNode LeftBrace() { return getToken(PseudoParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoParser.RightBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PseudoParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitEnumSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_enumSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			enumHead();
			setState(1161);
			match(LeftBrace);
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1162);
				enumeratorList();
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1163);
					match(Comma);
					}
				}

				}
			}

			setState(1168);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterEnumHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitEnumHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitEnumHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumHeadContext enumHead() throws RecognitionException {
		EnumHeadContext _localctx = new EnumHeadContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_enumHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			enumkey();
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1171);
				attributeSpecifierSeq();
				}
			}

			setState(1178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
				{
				setState(1175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1174);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1177);
				match(Identifier);
				}
			}

			setState(1181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1180);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(PseudoParser.Semi, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterOpaqueEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitOpaqueEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitOpaqueEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpaqueEnumDeclarationContext opaqueEnumDeclaration() throws RecognitionException {
		OpaqueEnumDeclarationContext _localctx = new OpaqueEnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_opaqueEnumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			enumkey();
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1184);
				attributeSpecifierSeq();
				}
			}

			setState(1187);
			match(Identifier);
			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1188);
				enumbase();
				}
			}

			setState(1191);
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
		public TerminalNode Enum() { return getToken(PseudoParser.Enum, 0); }
		public TerminalNode Class() { return getToken(PseudoParser.Class, 0); }
		public TerminalNode Struct() { return getToken(PseudoParser.Struct, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterEnumkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitEnumkey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitEnumkey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_enumkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			match(Enum);
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Class || _la==Struct) {
				{
				setState(1194);
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
		public TerminalNode Colon() { return getToken(PseudoParser.Colon, 0); }
		public TypeSpecifierSeqContext typeSpecifierSeq() {
			return getRuleContext(TypeSpecifierSeqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterEnumbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitEnumbase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitEnumbase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(Colon);
			setState(1198);
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParser.Comma, i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitEnumeratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			enumeratorDefinition();
			setState(1205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1201);
					match(Comma);
					setState(1202);
					enumeratorDefinition();
					}
					} 
				}
				setState(1207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
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
		public TerminalNode Assign() { return getToken(PseudoParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterEnumeratorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitEnumeratorDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitEnumeratorDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorDefinitionContext enumeratorDefinition() throws RecognitionException {
		EnumeratorDefinitionContext _localctx = new EnumeratorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_enumeratorDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			enumerator();
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1209);
				match(Assign);
				setState(1210);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceNameContext namespaceName() throws RecognitionException {
		NamespaceNameContext _localctx = new NamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_namespaceName);
		try {
			setState(1217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1215);
				originalNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1216);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public OriginalNamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalNamespaceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterOriginalNamespaceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitOriginalNamespaceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitOriginalNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginalNamespaceNameContext originalNamespaceName() throws RecognitionException {
		OriginalNamespaceNameContext _localctx = new OriginalNamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_originalNamespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
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
		public TerminalNode Namespace() { return getToken(PseudoParser.Namespace, 0); }
		public TerminalNode LeftBrace() { return getToken(PseudoParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoParser.RightBrace, 0); }
		public TerminalNode Inline() { return getToken(PseudoParser.Inline, 0); }
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNamespaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNamespaceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNamespaceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDefinitionContext namespaceDefinition() throws RecognitionException {
		NamespaceDefinitionContext _localctx = new NamespaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_namespaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1221);
				match(Inline);
				}
			}

			setState(1224);
			match(Namespace);
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1225);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1226);
				originalNamespaceName();
				}
				break;
			}
			setState(1229);
			match(LeftBrace);
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Asm - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Namespace - 10)) | (1L << (Operator - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(1230);
				((NamespaceDefinitionContext)_localctx).namespaceBody = declarationseq();
				}
			}

			setState(1233);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public NamespaceAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNamespaceAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNamespaceAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNamespaceAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceAliasContext namespaceAlias() throws RecognitionException {
		NamespaceAliasContext _localctx = new NamespaceAliasContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_namespaceAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
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
		public TerminalNode Namespace() { return getToken(PseudoParser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(PseudoParser.Assign, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoParser.Semi, 0); }
		public NamespaceAliasDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceAliasDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNamespaceAliasDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNamespaceAliasDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNamespaceAliasDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceAliasDefinitionContext namespaceAliasDefinition() throws RecognitionException {
		NamespaceAliasDefinitionContext _localctx = new NamespaceAliasDefinitionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_namespaceAliasDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			match(Namespace);
			setState(1238);
			match(Identifier);
			setState(1239);
			match(Assign);
			setState(1240);
			qualifiednamespacespecifier();
			setState(1241);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterQualifiednamespacespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitQualifiednamespacespecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitQualifiednamespacespecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1243);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1246);
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
		public TerminalNode Using() { return getToken(PseudoParser.Using, 0); }
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoParser.Semi, 0); }
		public TerminalNode Doublecolon() { return getToken(PseudoParser.Doublecolon, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Typename_() { return getToken(PseudoParser.Typename_, 0); }
		public UsingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterUsingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitUsingDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitUsingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingDeclarationContext usingDeclaration() throws RecognitionException {
		UsingDeclarationContext _localctx = new UsingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_usingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			match(Using);
			setState(1254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				{
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Typename_) {
					{
					setState(1249);
					match(Typename_);
					}
				}

				setState(1252);
				nestedNameSpecifier(0);
				}
				}
				break;
			case 2:
				{
				setState(1253);
				match(Doublecolon);
				}
				break;
			}
			setState(1256);
			unqualifiedId();
			setState(1257);
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
		public TerminalNode Using() { return getToken(PseudoParser.Using, 0); }
		public TerminalNode Namespace() { return getToken(PseudoParser.Namespace, 0); }
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoParser.Semi, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterUsingDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitUsingDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitUsingDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingDirectiveContext usingDirective() throws RecognitionException {
		UsingDirectiveContext _localctx = new UsingDirectiveContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_usingDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1259);
				attributeSpecifierSeq();
				}
			}

			setState(1262);
			match(Using);
			setState(1263);
			match(Namespace);
			setState(1265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1264);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1267);
			namespaceName();
			setState(1268);
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
		public TerminalNode Asm() { return getToken(PseudoParser.Asm, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoParser.StringLiteral, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(PseudoParser.Semi, 0); }
		public AsmDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAsmDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAsmDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAsmDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmDefinitionContext asmDefinition() throws RecognitionException {
		AsmDefinitionContext _localctx = new AsmDefinitionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_asmDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			match(Asm);
			setState(1271);
			match(LeftParen);
			setState(1272);
			match(StringLiteral);
			setState(1273);
			match(RightParen);
			setState(1274);
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
		public TerminalNode Extern() { return getToken(PseudoParser.Extern, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoParser.StringLiteral, 0); }
		public TerminalNode LeftBrace() { return getToken(PseudoParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoParser.RightBrace, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterLinkageSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitLinkageSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitLinkageSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkageSpecificationContext linkageSpecification() throws RecognitionException {
		LinkageSpecificationContext _localctx = new LinkageSpecificationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_linkageSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			match(Extern);
			setState(1277);
			match(StringLiteral);
			setState(1284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				{
				setState(1278);
				match(LeftBrace);
				setState(1280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Asm - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Namespace - 10)) | (1L << (Operator - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0)) {
					{
					setState(1279);
					declarationseq();
					}
				}

				setState(1282);
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
				setState(1283);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAttributeSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAttributeSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAttributeSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecifierSeqContext attributeSpecifierSeq() throws RecognitionException {
		AttributeSpecifierSeqContext _localctx = new AttributeSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_attributeSpecifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1287); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1286);
					attributeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1289); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
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
		public List<TerminalNode> LeftBracket() { return getTokens(PseudoParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(PseudoParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(PseudoParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(PseudoParser.RightBracket, i);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAttributeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAttributeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSpecifierContext attributeSpecifier() throws RecognitionException {
		AttributeSpecifierContext _localctx = new AttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_attributeSpecifier);
		int _la;
		try {
			setState(1299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1291);
				match(LeftBracket);
				setState(1292);
				match(LeftBracket);
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1293);
					attributeList();
					}
				}

				setState(1296);
				match(RightBracket);
				setState(1297);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1298);
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
		public TerminalNode Alignas() { return getToken(PseudoParser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(PseudoParser.Ellipsis, 0); }
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAlignmentspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAlignmentspecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAlignmentspecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_alignmentspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			match(Alignas);
			setState(1302);
			match(LeftParen);
			setState(1305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1303);
				theTypeId();
				}
				break;
			case 2:
				{
				setState(1304);
				constantExpression();
				}
				break;
			}
			setState(1308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1307);
				match(Ellipsis);
				}
			}

			setState(1310);
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParser.Comma, i);
		}
		public TerminalNode Ellipsis() { return getToken(PseudoParser.Ellipsis, 0); }
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			attribute();
			setState(1317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1313);
				match(Comma);
				setState(1314);
				attribute();
				}
				}
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1320);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public AttributeNamespaceContext attributeNamespace() {
			return getRuleContext(AttributeNamespaceContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(PseudoParser.Doublecolon, 0); }
		public AttributeArgumentClauseContext attributeArgumentClause() {
			return getRuleContext(AttributeArgumentClauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1323);
				attributeNamespace();
				setState(1324);
				match(Doublecolon);
				}
				break;
			}
			setState(1328);
			match(Identifier);
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(1329);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public AttributeNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAttributeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAttributeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAttributeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNamespaceContext attributeNamespace() throws RecognitionException {
		AttributeNamespaceContext _localctx = new AttributeNamespaceContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_attributeNamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
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
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public BalancedTokenSeqContext balancedTokenSeq() {
			return getRuleContext(BalancedTokenSeqContext.class,0);
		}
		public AttributeArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAttributeArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAttributeArgumentClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAttributeArgumentClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeArgumentClauseContext attributeArgumentClause() throws RecognitionException {
		AttributeArgumentClauseContext _localctx = new AttributeArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_attributeArgumentClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			match(LeftParen);
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << MultiLineMacro) | (1L << Directive) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Catch) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Else) | (1L << Enum) | (1L << Explicit) | (1L << Export) | (1L << Extern) | (1L << False_) | (1L << Final) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Override) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (Template - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True_ - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (Caret - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (Assign - 64)) | (1L << (Less - 64)) | (1L << (Greater - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Comma - 64)) | (1L << (ArrowStar - 64)) | (1L << (Arrow - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Doublecolon - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Semi - 128)) | (1L << (Dot - 128)) | (1L << (DotStar - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (Integersuffix - 128)) | (1L << (UserDefinedIntegerLiteral - 128)) | (1L << (UserDefinedFloatingLiteral - 128)) | (1L << (UserDefinedStringLiteral - 128)) | (1L << (UserDefinedCharacterLiteral - 128)) | (1L << (Whitespace - 128)) | (1L << (Newline - 128)) | (1L << (BlockComment - 128)) | (1L << (LineComment - 128)))) != 0)) {
				{
				setState(1335);
				balancedTokenSeq();
				}
			}

			setState(1338);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterBalancedTokenSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitBalancedTokenSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitBalancedTokenSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalancedTokenSeqContext balancedTokenSeq() throws RecognitionException {
		BalancedTokenSeqContext _localctx = new BalancedTokenSeqContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_balancedTokenSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1340);
				balancedtoken();
				}
				}
				setState(1343); 
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
		public List<TerminalNode> LeftParen() { return getTokens(PseudoParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(PseudoParser.LeftParen, i);
		}
		public BalancedTokenSeqContext balancedTokenSeq() {
			return getRuleContext(BalancedTokenSeqContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(PseudoParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PseudoParser.RightParen, i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(PseudoParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(PseudoParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(PseudoParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(PseudoParser.RightBracket, i);
		}
		public List<TerminalNode> LeftBrace() { return getTokens(PseudoParser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(PseudoParser.LeftBrace, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(PseudoParser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(PseudoParser.RightBrace, i);
		}
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterBalancedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitBalancedtoken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitBalancedtoken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_balancedtoken);
		int _la;
		try {
			int _alt;
			setState(1362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1345);
				match(LeftParen);
				setState(1346);
				balancedTokenSeq();
				setState(1347);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1349);
				match(LeftBracket);
				setState(1350);
				balancedTokenSeq();
				setState(1351);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1353);
				match(LeftBrace);
				setState(1354);
				balancedTokenSeq();
				setState(1355);
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
				setState(1358); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1357);
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
					setState(1360); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			initDeclarator();
			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1365);
				match(Comma);
				setState(1366);
				initDeclarator();
				}
				}
				setState(1371);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			declarator();
			setState(1374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (LeftParen - 85)) | (1L << (LeftBrace - 85)) | (1L << (Assign - 85)))) != 0)) {
				{
				setState(1373);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_declarator);
		try {
			setState(1381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1376);
				pointerDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				noPointerDeclarator(0);
				setState(1378);
				parametersAndQualifiers();
				setState(1379);
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
		public List<TerminalNode> Const() { return getTokens(PseudoParser.Const); }
		public TerminalNode Const(int i) {
			return getToken(PseudoParser.Const, i);
		}
		public PointerDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterPointerDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitPointerDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitPointerDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerDeclaratorContext pointerDeclarator() throws RecognitionException {
		PointerDeclaratorContext _localctx = new PointerDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_pointerDeclarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1383);
					pointerOperator();
					setState(1385);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Const) {
						{
						setState(1384);
						match(Const);
						}
					}

					}
					} 
				}
				setState(1391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			setState(1392);
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
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public PointerDeclaratorContext pointerDeclarator() {
			return getRuleContext(PointerDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public NoPointerDeclaratorContext noPointerDeclarator() {
			return getRuleContext(NoPointerDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PseudoParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoParser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public NoPointerDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noPointerDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNoPointerDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNoPointerDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNoPointerDeclarator(this);
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
		int _startState = 226;
		enterRecursionRule(_localctx, 226, RULE_noPointerDeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1395);
				declaratorid();
				setState(1397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1396);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1399);
				match(LeftParen);
				setState(1400);
				pointerDeclarator();
				setState(1401);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerDeclarator);
					setState(1405);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1415);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LeftParen:
						{
						setState(1406);
						parametersAndQualifiers();
						}
						break;
					case LeftBracket:
						{
						setState(1407);
						match(LeftBracket);
						setState(1409);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
						case 1:
							{
							setState(1408);
							constantExpression();
							}
							break;
						}
						setState(1411);
						match(RightBracket);
						setState(1413);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
						case 1:
							{
							setState(1412);
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
				setState(1421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterParametersAndQualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitParametersAndQualifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitParametersAndQualifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersAndQualifiersContext parametersAndQualifiers() throws RecognitionException {
		ParametersAndQualifiersContext _localctx = new ParametersAndQualifiersContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_parametersAndQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			match(LeftParen);
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Struct - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftBracket - 74)) | (1L << (Doublecolon - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(1423);
				parameterDeclarationClause();
				}
			}

			setState(1426);
			match(RightParen);
			setState(1428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1427);
				cvqualifierseq();
				}
				break;
			}
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1430);
				refqualifier();
				}
				break;
			}
			setState(1434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1433);
				exceptionSpecification();
				}
				break;
			}
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1436);
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
		public TerminalNode Arrow() { return getToken(PseudoParser.Arrow, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTrailingReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTrailingReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTrailingReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailingReturnTypeContext trailingReturnType() throws RecognitionException {
		TrailingReturnTypeContext _localctx = new TrailingReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_trailingReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			match(Arrow);
			setState(1440);
			trailingTypeSpecifierSeq();
			setState(1442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1441);
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
		public TerminalNode And() { return getToken(PseudoParser.And, 0); }
		public TerminalNode AndAnd() { return getToken(PseudoParser.AndAnd, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Star() { return getToken(PseudoParser.Star, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterPointerOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitPointerOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitPointerOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerOperatorContext pointerOperator() throws RecognitionException {
		PointerOperatorContext _localctx = new PointerOperatorContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_pointerOperator);
		int _la;
		try {
			setState(1458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
			case AndAnd:
				enterOuterAlt(_localctx, 1);
				{
				setState(1444);
				_la = _input.LA(1);
				if ( !(_la==And || _la==AndAnd) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1445);
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
				setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(1448);
					nestedNameSpecifier(0);
					}
				}

				setState(1451);
				match(Star);
				setState(1453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1452);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(1456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1455);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterCvqualifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitCvqualifierseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitCvqualifierseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_cvqualifierseq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1461); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1460);
					cvQualifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1463); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
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
		public TerminalNode Const() { return getToken(PseudoParser.Const, 0); }
		public TerminalNode Volatile() { return getToken(PseudoParser.Volatile, 0); }
		public CvQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterCvQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitCvQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitCvQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CvQualifierContext cvQualifier() throws RecognitionException {
		CvQualifierContext _localctx = new CvQualifierContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_cvQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
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
		public TerminalNode And() { return getToken(PseudoParser.And, 0); }
		public TerminalNode AndAnd() { return getToken(PseudoParser.AndAnd, 0); }
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterRefqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitRefqualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitRefqualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
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
		public TerminalNode Ellipsis() { return getToken(PseudoParser.Ellipsis, 0); }
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterDeclaratorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitDeclaratorid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitDeclaratorid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1469);
				match(Ellipsis);
				}
			}

			setState(1472);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTheTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTheTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTheTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheTypeIdContext theTypeId() throws RecognitionException {
		TheTypeIdContext _localctx = new TheTypeIdContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_theTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			typeSpecifierSeq();
			setState(1476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1475);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_abstractDeclarator);
		try {
			setState(1486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1478);
				pointerAbstractDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1479);
					noPointerAbstractDeclarator(0);
					}
					break;
				}
				setState(1482);
				parametersAndQualifiers();
				setState(1483);
				trailingReturnType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1485);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterPointerAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitPointerAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitPointerAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerAbstractDeclaratorContext pointerAbstractDeclarator() throws RecognitionException {
		PointerAbstractDeclaratorContext _localctx = new PointerAbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_pointerAbstractDeclarator);
		int _la;
		try {
			setState(1497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1488);
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
				setState(1490); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1489);
					pointerOperator();
					}
					}
					setState(1492); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Decltype || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Star - 93)) | (1L << (And - 93)) | (1L << (AndAnd - 93)) | (1L << (Doublecolon - 93)) | (1L << (Identifier - 93)))) != 0) );
				setState(1495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1494);
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
		public TerminalNode LeftBracket() { return getToken(PseudoParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoParser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public PointerAbstractDeclaratorContext pointerAbstractDeclarator() {
			return getRuleContext(PointerAbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNoPointerAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNoPointerAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNoPointerAbstractDeclarator(this);
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
		int _startState = 248;
		enterRecursionRule(_localctx, 248, RULE_noPointerAbstractDeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1500);
				parametersAndQualifiers();
				}
				break;
			case 2:
				{
				setState(1501);
				match(LeftBracket);
				setState(1503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1502);
					constantExpression();
					}
					break;
				}
				setState(1505);
				match(RightBracket);
				setState(1507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1506);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1509);
				match(LeftParen);
				setState(1510);
				pointerAbstractDeclarator();
				setState(1511);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerAbstractDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerAbstractDeclarator);
					setState(1515);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(1526);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
					case 1:
						{
						setState(1516);
						parametersAndQualifiers();
						}
						break;
					case 2:
						{
						setState(1517);
						noPointerAbstractDeclarator(0);
						setState(1518);
						match(LeftBracket);
						setState(1520);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
						case 1:
							{
							setState(1519);
							constantExpression();
							}
							break;
						}
						setState(1522);
						match(RightBracket);
						setState(1524);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
						case 1:
							{
							setState(1523);
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
				setState(1532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAbstractPackDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAbstractPackDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAbstractPackDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractPackDeclaratorContext abstractPackDeclarator() throws RecognitionException {
		AbstractPackDeclaratorContext _localctx = new AbstractPackDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_abstractPackDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Decltype || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Star - 93)) | (1L << (And - 93)) | (1L << (AndAnd - 93)) | (1L << (Doublecolon - 93)) | (1L << (Identifier - 93)))) != 0)) {
				{
				{
				setState(1533);
				pointerOperator();
				}
				}
				setState(1538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1539);
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
		public TerminalNode Ellipsis() { return getToken(PseudoParser.Ellipsis, 0); }
		public NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator() {
			return getRuleContext(NoPointerAbstractPackDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PseudoParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoParser.RightBracket, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNoPointerAbstractPackDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNoPointerAbstractPackDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNoPointerAbstractPackDeclarator(this);
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
		int _startState = 252;
		enterRecursionRule(_localctx, 252, RULE_noPointerAbstractPackDeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1542);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoPointerAbstractPackDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noPointerAbstractPackDeclarator);
					setState(1544);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1554);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LeftParen:
						{
						setState(1545);
						parametersAndQualifiers();
						}
						break;
					case LeftBracket:
						{
						setState(1546);
						match(LeftBracket);
						setState(1548);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
						case 1:
							{
							setState(1547);
							constantExpression();
							}
							break;
						}
						setState(1550);
						match(RightBracket);
						setState(1552);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
						case 1:
							{
							setState(1551);
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
				setState(1560);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterDeclarationClauseContext extends ParserRuleContext {
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(PseudoParser.Ellipsis, 0); }
		public TerminalNode Comma() { return getToken(PseudoParser.Comma, 0); }
		public ParameterDeclarationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterParameterDeclarationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitParameterDeclarationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitParameterDeclarationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationClauseContext parameterDeclarationClause() throws RecognitionException {
		ParameterDeclarationClauseContext _localctx = new ParameterDeclarationClauseContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_parameterDeclarationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			parameterDeclarationList();
			setState(1566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma || _la==Ellipsis) {
				{
				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1562);
					match(Comma);
					}
				}

				setState(1565);
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParser.Comma, i);
		}
		public ParameterDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterParameterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitParameterDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitParameterDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationListContext parameterDeclarationList() throws RecognitionException {
		ParameterDeclarationListContext _localctx = new ParameterDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_parameterDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			parameterDeclaration();
			setState(1573);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1569);
					match(Comma);
					setState(1570);
					parameterDeclaration();
					}
					} 
				}
				setState(1575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
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
		public TerminalNode Assign() { return getToken(PseudoParser.Assign, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1576);
				attributeSpecifierSeq();
				}
			}

			setState(1579);
			declSpecifierSeq();
			{
			setState(1584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1580);
				declarator();
				}
				break;
			case 2:
				{
				setState(1582);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1581);
					abstractDeclarator();
					}
					break;
				}
				}
				break;
			}
			setState(1588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1586);
				match(Assign);
				setState(1587);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1590);
				attributeSpecifierSeq();
				}
			}

			setState(1594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1593);
				declSpecifierSeq();
				}
				break;
			}
			setState(1596);
			declarator();
			setState(1598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1597);
				virtualSpecifierSeq();
				}
			}

			setState(1600);
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
		public TerminalNode Assign() { return getToken(PseudoParser.Assign, 0); }
		public TerminalNode Semi() { return getToken(PseudoParser.Semi, 0); }
		public TerminalNode Default() { return getToken(PseudoParser.Default, 0); }
		public TerminalNode Delete() { return getToken(PseudoParser.Delete, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_functionBody);
		int _la;
		try {
			setState(1610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Colon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1602);
					constructorInitializer();
					}
				}

				setState(1605);
				compoundStatement();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 2);
				{
				setState(1606);
				functionTryBlock();
				}
				break;
			case Assign:
				enterOuterAlt(_localctx, 3);
				{
				setState(1607);
				match(Assign);
				setState(1608);
				_la = _input.LA(1);
				if ( !(_la==Default || _la==Delete) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1609);
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
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_initializer);
		try {
			setState(1617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1612);
				braceOrEqualInitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1613);
				match(LeftParen);
				setState(1614);
				expressionList();
				setState(1615);
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
		public TerminalNode Assign() { return getToken(PseudoParser.Assign, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterBraceOrEqualInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitBraceOrEqualInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitBraceOrEqualInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BraceOrEqualInitializerContext braceOrEqualInitializer() throws RecognitionException {
		BraceOrEqualInitializerContext _localctx = new BraceOrEqualInitializerContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_braceOrEqualInitializer);
		try {
			setState(1622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1619);
				match(Assign);
				setState(1620);
				initializerClause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1621);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterInitializerClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitInitializerClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitInitializerClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerClauseContext initializerClause() throws RecognitionException {
		InitializerClauseContext _localctx = new InitializerClauseContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_initializerClause);
		try {
			setState(1626);
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
			case RightParen:
			case LeftBracket:
			case RightBracket:
			case RightBrace:
			case Plus:
			case Minus:
			case Star:
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
			case Question:
			case Colon:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1624);
				assignmentExpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1625);
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
		public List<TerminalNode> Ellipsis() { return getTokens(PseudoParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(PseudoParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParser.Comma, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			initializerClause();
			setState(1630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1629);
				match(Ellipsis);
				}
			}

			setState(1639);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1632);
					match(Comma);
					setState(1633);
					initializerClause();
					setState(1635);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ellipsis) {
						{
						setState(1634);
						match(Ellipsis);
						}
					}

					}
					} 
				}
				setState(1641);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
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
		public TerminalNode LeftBrace() { return getToken(PseudoParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoParser.RightBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PseudoParser.Comma, 0); }
		public BracedInitListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedInitList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterBracedInitList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitBracedInitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitBracedInitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracedInitListContext bracedInitList() throws RecognitionException {
		BracedInitListContext _localctx = new BracedInitListContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_bracedInitList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			match(LeftBrace);
			setState(1647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1643);
				initializerList();
				setState(1645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1644);
					match(Comma);
					}
				}

				}
				break;
			}
			setState(1649);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_className);
		try {
			setState(1653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1651);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1652);
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
		public TerminalNode LeftBrace() { return getToken(PseudoParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoParser.RightBrace, 0); }
		public MemberSpecificationContext memberSpecification() {
			return getRuleContext(MemberSpecificationContext.class,0);
		}
		public ClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSpecifierContext classSpecifier() throws RecognitionException {
		ClassSpecifierContext _localctx = new ClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_classSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			classHead();
			setState(1656);
			match(LeftBrace);
			setState(1658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Alignas - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Operator - 10)) | (1L << (Private - 10)) | (1L << (Protected - 10)) | (1L << (Public - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Typedef - 74)) | (1L << (Typename_ - 74)) | (1L << (Union - 74)) | (1L << (Unsigned - 74)) | (1L << (Using - 74)) | (1L << (Virtual - 74)) | (1L << (Void - 74)) | (1L << (Volatile - 74)) | (1L << (Wchar - 74)) | (1L << (LeftParen - 74)) | (1L << (LeftBracket - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Tilde - 74)) | (1L << (AndAnd - 74)) | (1L << (Colon - 74)) | (1L << (Doublecolon - 74)) | (1L << (Semi - 74)) | (1L << (Ellipsis - 74)) | (1L << (Identifier - 74)))) != 0)) {
				{
				setState(1657);
				memberSpecification();
				}
			}

			setState(1660);
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
		public TerminalNode Union() { return getToken(PseudoParser.Union, 0); }
		public ClassHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterClassHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitClassHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitClassHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeadContext classHead() throws RecognitionException {
		ClassHeadContext _localctx = new ClassHeadContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_classHead);
		int _la;
		try {
			setState(1685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Struct:
				enterOuterAlt(_localctx, 1);
				{
				setState(1662);
				classKey();
				setState(1664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1663);
					attributeSpecifierSeq();
					}
				}

				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(1666);
					classHeadName();
					setState(1668);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(1667);
						classVirtSpecifier();
						}
					}

					}
				}

				setState(1673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1672);
					baseClause();
					}
				}

				}
				break;
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1675);
				match(Union);
				setState(1677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1676);
					attributeSpecifierSeq();
					}
				}

				setState(1683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(1679);
					classHeadName();
					setState(1681);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(1680);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterClassHeadName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitClassHeadName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitClassHeadName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeadNameContext classHeadName() throws RecognitionException {
		ClassHeadNameContext _localctx = new ClassHeadNameContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_classHeadName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1687);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1690);
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
		public TerminalNode Final() { return getToken(PseudoParser.Final, 0); }
		public ClassVirtSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVirtSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterClassVirtSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitClassVirtSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitClassVirtSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVirtSpecifierContext classVirtSpecifier() throws RecognitionException {
		ClassVirtSpecifierContext _localctx = new ClassVirtSpecifierContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_classVirtSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
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
		public TerminalNode Class() { return getToken(PseudoParser.Class, 0); }
		public TerminalNode Struct() { return getToken(PseudoParser.Struct, 0); }
		public ClassKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterClassKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitClassKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitClassKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassKeyContext classKey() throws RecognitionException {
		ClassKeyContext _localctx = new ClassKeyContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_classKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
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
		public List<TerminalNode> Colon() { return getTokens(PseudoParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(PseudoParser.Colon, i);
		}
		public MemberSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterMemberSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitMemberSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitMemberSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberSpecificationContext memberSpecification() throws RecognitionException {
		MemberSpecificationContext _localctx = new MemberSpecificationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_memberSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1700);
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
					setState(1696);
					memberdeclaration();
					}
					break;
				case Private:
				case Protected:
				case Public:
					{
					setState(1697);
					accessSpecifier();
					setState(1698);
					match(Colon);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1702); 
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
		public TerminalNode Semi() { return getToken(PseudoParser.Semi, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterMemberdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitMemberdeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitMemberdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_memberdeclaration);
		int _la;
		try {
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1705);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1704);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(1708);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1707);
					declSpecifierSeq();
					}
					break;
				}
				setState(1711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (LeftParen - 85)) | (1L << (LeftBracket - 85)) | (1L << (Star - 85)) | (1L << (And - 85)) | (1L << (Tilde - 85)) | (1L << (AndAnd - 85)) | (1L << (Colon - 85)) | (1L << (Doublecolon - 85)) | (1L << (Ellipsis - 85)) | (1L << (Identifier - 85)))) != 0)) {
					{
					setState(1710);
					memberDeclaratorList();
					}
				}

				setState(1713);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1714);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1715);
				usingDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1716);
				staticAssertDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1717);
				templateDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1718);
				aliasDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1719);
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParser.Comma, i);
		}
		public MemberDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterMemberDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitMemberDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitMemberDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclaratorListContext memberDeclaratorList() throws RecognitionException {
		MemberDeclaratorListContext _localctx = new MemberDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_memberDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			memberDeclarator();
			setState(1727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1723);
				match(Comma);
				setState(1724);
				memberDeclarator();
				}
				}
				setState(1729);
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
		public TerminalNode Colon() { return getToken(PseudoParser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public MemberDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterMemberDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitMemberDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitMemberDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclaratorContext memberDeclarator() throws RecognitionException {
		MemberDeclaratorContext _localctx = new MemberDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_memberDeclarator);
		int _la;
		try {
			setState(1750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1730);
				declarator();
				setState(1740);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1732);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final || _la==Override) {
						{
						setState(1731);
						virtualSpecifierSeq();
						}
					}

					setState(1735);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Assign) {
						{
						setState(1734);
						pureSpecifier();
						}
					}

					}
					break;
				case 2:
					{
					setState(1738);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBrace || _la==Assign) {
						{
						setState(1737);
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
				setState(1743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1742);
					match(Identifier);
					}
				}

				setState(1746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1745);
					attributeSpecifierSeq();
					}
				}

				setState(1748);
				match(Colon);
				setState(1749);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterVirtualSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitVirtualSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitVirtualSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtualSpecifierSeqContext virtualSpecifierSeq() throws RecognitionException {
		VirtualSpecifierSeqContext _localctx = new VirtualSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_virtualSpecifierSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1753); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1752);
				virtualSpecifier();
				}
				}
				setState(1755); 
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
		public TerminalNode Override() { return getToken(PseudoParser.Override, 0); }
		public TerminalNode Final() { return getToken(PseudoParser.Final, 0); }
		public VirtualSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterVirtualSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitVirtualSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitVirtualSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VirtualSpecifierContext virtualSpecifier() throws RecognitionException {
		VirtualSpecifierContext _localctx = new VirtualSpecifierContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_virtualSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
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
		public TerminalNode Assign() { return getToken(PseudoParser.Assign, 0); }
		public TerminalNode OctalLiteral() { return getToken(PseudoParser.OctalLiteral, 0); }
		public PureSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterPureSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitPureSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitPureSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PureSpecifierContext pureSpecifier() throws RecognitionException {
		PureSpecifierContext _localctx = new PureSpecifierContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_pureSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			match(Assign);
			setState(1760);
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
		public TerminalNode Colon() { return getToken(PseudoParser.Colon, 0); }
		public BaseSpecifierListContext baseSpecifierList() {
			return getRuleContext(BaseSpecifierListContext.class,0);
		}
		public BaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterBaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitBaseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitBaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseClauseContext baseClause() throws RecognitionException {
		BaseClauseContext _localctx = new BaseClauseContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_baseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			match(Colon);
			setState(1764);
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
		public List<TerminalNode> Ellipsis() { return getTokens(PseudoParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(PseudoParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParser.Comma, i);
		}
		public BaseSpecifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseSpecifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterBaseSpecifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitBaseSpecifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitBaseSpecifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseSpecifierListContext baseSpecifierList() throws RecognitionException {
		BaseSpecifierListContext _localctx = new BaseSpecifierListContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_baseSpecifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			baseSpecifier();
			setState(1768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1767);
				match(Ellipsis);
				}
			}

			setState(1777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1770);
				match(Comma);
				setState(1771);
				baseSpecifier();
				setState(1773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1772);
					match(Ellipsis);
					}
				}

				}
				}
				setState(1779);
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
		public TerminalNode Virtual() { return getToken(PseudoParser.Virtual, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterBaseSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitBaseSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitBaseSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseSpecifierContext baseSpecifier() throws RecognitionException {
		BaseSpecifierContext _localctx = new BaseSpecifierContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_baseSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1780);
				attributeSpecifierSeq();
				}
			}

			setState(1795);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Doublecolon:
			case Identifier:
				{
				setState(1783);
				baseTypeSpecifier();
				}
				break;
			case Virtual:
				{
				setState(1784);
				match(Virtual);
				setState(1786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(1785);
					accessSpecifier();
					}
				}

				setState(1788);
				baseTypeSpecifier();
				}
				break;
			case Private:
			case Protected:
			case Public:
				{
				setState(1789);
				accessSpecifier();
				setState(1791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(1790);
					match(Virtual);
					}
				}

				setState(1793);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterClassOrDeclType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitClassOrDeclType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitClassOrDeclType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrDeclTypeContext classOrDeclType() throws RecognitionException {
		ClassOrDeclTypeContext _localctx = new ClassOrDeclTypeContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_classOrDeclType);
		try {
			setState(1802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1797);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1800);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1801);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterBaseTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitBaseTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitBaseTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeSpecifierContext baseTypeSpecifier() throws RecognitionException {
		BaseTypeSpecifierContext _localctx = new BaseTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_baseTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
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
		public TerminalNode Private() { return getToken(PseudoParser.Private, 0); }
		public TerminalNode Protected() { return getToken(PseudoParser.Protected, 0); }
		public TerminalNode Public() { return getToken(PseudoParser.Public, 0); }
		public AccessSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterAccessSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitAccessSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitAccessSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessSpecifierContext accessSpecifier() throws RecognitionException {
		AccessSpecifierContext _localctx = new AccessSpecifierContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_accessSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
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
		public TerminalNode Operator() { return getToken(PseudoParser.Operator, 0); }
		public ConversionTypeIdContext conversionTypeId() {
			return getRuleContext(ConversionTypeIdContext.class,0);
		}
		public ConversionFunctionIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionFunctionId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterConversionFunctionId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitConversionFunctionId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitConversionFunctionId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionFunctionIdContext conversionFunctionId() throws RecognitionException {
		ConversionFunctionIdContext _localctx = new ConversionFunctionIdContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_conversionFunctionId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			match(Operator);
			setState(1809);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterConversionTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitConversionTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitConversionTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionTypeIdContext conversionTypeId() throws RecognitionException {
		ConversionTypeIdContext _localctx = new ConversionTypeIdContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_conversionTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			typeSpecifierSeq();
			setState(1813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(1812);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterConversionDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitConversionDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitConversionDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversionDeclaratorContext conversionDeclarator() throws RecognitionException {
		ConversionDeclaratorContext _localctx = new ConversionDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_conversionDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
			pointerOperator();
			setState(1817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(1816);
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
		public TerminalNode Colon() { return getToken(PseudoParser.Colon, 0); }
		public MemInitializerListContext memInitializerList() {
			return getRuleContext(MemInitializerListContext.class,0);
		}
		public ConstructorInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterConstructorInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitConstructorInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitConstructorInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorInitializerContext constructorInitializer() throws RecognitionException {
		ConstructorInitializerContext _localctx = new ConstructorInitializerContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_constructorInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1819);
			match(Colon);
			setState(1820);
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
		public List<TerminalNode> Ellipsis() { return getTokens(PseudoParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(PseudoParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParser.Comma, i);
		}
		public MemInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterMemInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitMemInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitMemInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemInitializerListContext memInitializerList() throws RecognitionException {
		MemInitializerListContext _localctx = new MemInitializerListContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_memInitializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			memInitializer();
			setState(1824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1823);
				match(Ellipsis);
				}
			}

			setState(1833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1826);
				match(Comma);
				setState(1827);
				memInitializer();
				setState(1829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1828);
					match(Ellipsis);
					}
				}

				}
				}
				setState(1835);
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
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterMemInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitMemInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitMemInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemInitializerContext memInitializer() throws RecognitionException {
		MemInitializerContext _localctx = new MemInitializerContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_memInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			meminitializerid();
			setState(1843);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				{
				setState(1837);
				match(LeftParen);
				setState(1839);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(1838);
					expressionList();
					}
					break;
				}
				setState(1841);
				match(RightParen);
				}
				break;
			case LeftBrace:
				{
				setState(1842);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterMeminitializerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitMeminitializerid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitMeminitializerid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_meminitializerid);
		try {
			setState(1847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1845);
				classOrDeclType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1846);
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
		public TerminalNode Operator() { return getToken(PseudoParser.Operator, 0); }
		public TheOperatorContext theOperator() {
			return getRuleContext(TheOperatorContext.class,0);
		}
		public OperatorFunctionIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorFunctionId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterOperatorFunctionId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitOperatorFunctionId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitOperatorFunctionId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorFunctionIdContext operatorFunctionId() throws RecognitionException {
		OperatorFunctionIdContext _localctx = new OperatorFunctionIdContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_operatorFunctionId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849);
			match(Operator);
			setState(1850);
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
		public TerminalNode Operator() { return getToken(PseudoParser.Operator, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoParser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public TerminalNode UserDefinedStringLiteral() { return getToken(PseudoParser.UserDefinedStringLiteral, 0); }
		public LiteralOperatorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalOperatorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterLiteralOperatorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitLiteralOperatorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitLiteralOperatorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralOperatorIdContext literalOperatorId() throws RecognitionException {
		LiteralOperatorIdContext _localctx = new LiteralOperatorIdContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_literalOperatorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			match(Operator);
			setState(1856);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(1853);
				match(StringLiteral);
				setState(1854);
				match(Identifier);
				}
				break;
			case UserDefinedStringLiteral:
				{
				setState(1855);
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
		public TerminalNode Template() { return getToken(PseudoParser.Template, 0); }
		public TerminalNode Less() { return getToken(PseudoParser.Less, 0); }
		public TemplateparameterListContext templateparameterList() {
			return getRuleContext(TemplateparameterListContext.class,0);
		}
		public TerminalNode Greater() { return getToken(PseudoParser.Greater, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTemplateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTemplateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTemplateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			match(Template);
			setState(1859);
			match(Less);
			setState(1860);
			templateparameterList();
			setState(1861);
			match(Greater);
			setState(1862);
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParser.Comma, i);
		}
		public TemplateparameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTemplateparameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTemplateparameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTemplateparameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateparameterListContext templateparameterList() throws RecognitionException {
		TemplateparameterListContext _localctx = new TemplateparameterListContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_templateparameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
			templateParameter();
			setState(1869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1865);
				match(Comma);
				setState(1866);
				templateParameter();
				}
				}
				setState(1871);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTemplateParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTemplateParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTemplateParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateParameterContext templateParameter() throws RecognitionException {
		TemplateParameterContext _localctx = new TemplateParameterContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_templateParameter);
		try {
			setState(1874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1872);
				typeParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1873);
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
		public TerminalNode Class() { return getToken(PseudoParser.Class, 0); }
		public TerminalNode Typename_() { return getToken(PseudoParser.Typename_, 0); }
		public TerminalNode Assign() { return getToken(PseudoParser.Assign, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoParser.Template, 0); }
		public TerminalNode Less() { return getToken(PseudoParser.Less, 0); }
		public TemplateparameterListContext templateparameterList() {
			return getRuleContext(TemplateparameterListContext.class,0);
		}
		public TerminalNode Greater() { return getToken(PseudoParser.Greater, 0); }
		public TerminalNode Ellipsis() { return getToken(PseudoParser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Template:
				{
				setState(1881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1876);
					match(Template);
					setState(1877);
					match(Less);
					setState(1878);
					templateparameterList();
					setState(1879);
					match(Greater);
					}
				}

				setState(1883);
				match(Class);
				}
				break;
			case Typename_:
				{
				setState(1884);
				match(Typename_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				{
				setState(1888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1887);
					match(Ellipsis);
					}
				}

				setState(1891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1890);
					match(Identifier);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(1894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1893);
					match(Identifier);
					}
				}

				setState(1896);
				match(Assign);
				setState(1897);
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
		public TerminalNode Less() { return getToken(PseudoParser.Less, 0); }
		public TerminalNode Greater() { return getToken(PseudoParser.Greater, 0); }
		public TemplateArgumentListContext templateArgumentList() {
			return getRuleContext(TemplateArgumentListContext.class,0);
		}
		public SimpleTemplateIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTemplateId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterSimpleTemplateId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitSimpleTemplateId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitSimpleTemplateId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTemplateIdContext simpleTemplateId() throws RecognitionException {
		SimpleTemplateIdContext _localctx = new SimpleTemplateIdContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_simpleTemplateId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			templateName();
			setState(1901);
			match(Less);
			setState(1903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(1902);
				templateArgumentList();
				}
				break;
			}
			setState(1905);
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
		public TerminalNode Less() { return getToken(PseudoParser.Less, 0); }
		public TerminalNode Greater() { return getToken(PseudoParser.Greater, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTemplateId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTemplateId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTemplateId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateIdContext templateId() throws RecognitionException {
		TemplateIdContext _localctx = new TemplateIdContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_templateId);
		try {
			setState(1918);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1907);
				simpleTemplateId();
				}
				break;
			case Operator:
				enterOuterAlt(_localctx, 2);
				{
				setState(1910);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(1908);
					operatorFunctionId();
					}
					break;
				case 2:
					{
					setState(1909);
					literalOperatorId();
					}
					break;
				}
				setState(1912);
				match(Less);
				setState(1914);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(1913);
					templateArgumentList();
					}
					break;
				}
				setState(1916);
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
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public TemplateNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTemplateName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTemplateName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTemplateName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateNameContext templateName() throws RecognitionException {
		TemplateNameContext _localctx = new TemplateNameContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_templateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1920);
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
		public List<TerminalNode> Ellipsis() { return getTokens(PseudoParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(PseudoParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParser.Comma, i);
		}
		public TemplateArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTemplateArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTemplateArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTemplateArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateArgumentListContext templateArgumentList() throws RecognitionException {
		TemplateArgumentListContext _localctx = new TemplateArgumentListContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_templateArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1922);
			templateArgument();
			setState(1924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1923);
				match(Ellipsis);
				}
			}

			setState(1933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1926);
				match(Comma);
				setState(1927);
				templateArgument();
				setState(1929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1928);
					match(Ellipsis);
					}
				}

				}
				}
				setState(1935);
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTemplateArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTemplateArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTemplateArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateArgumentContext templateArgument() throws RecognitionException {
		TemplateArgumentContext _localctx = new TemplateArgumentContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_templateArgument);
		try {
			setState(1939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1936);
				theTypeId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1937);
				constantExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1938);
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
		public TerminalNode Typename_() { return getToken(PseudoParser.Typename_, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoParser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoParser.Template, 0); }
		public TypeNameSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNameSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTypeNameSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTypeNameSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTypeNameSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameSpecifierContext typeNameSpecifier() throws RecognitionException {
		TypeNameSpecifierContext _localctx = new TypeNameSpecifierContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_typeNameSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			match(Typename_);
			setState(1942);
			nestedNameSpecifier(0);
			setState(1948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(1943);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1944);
					match(Template);
					}
				}

				setState(1947);
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
		public TerminalNode Template() { return getToken(PseudoParser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Extern() { return getToken(PseudoParser.Extern, 0); }
		public ExplicitInstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitInstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterExplicitInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitExplicitInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitExplicitInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitInstantiationContext explicitInstantiation() throws RecognitionException {
		ExplicitInstantiationContext _localctx = new ExplicitInstantiationContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_explicitInstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(1950);
				match(Extern);
				}
			}

			setState(1953);
			match(Template);
			setState(1954);
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
		public TerminalNode Template() { return getToken(PseudoParser.Template, 0); }
		public TerminalNode Less() { return getToken(PseudoParser.Less, 0); }
		public TerminalNode Greater() { return getToken(PseudoParser.Greater, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitSpecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitSpecialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterExplicitSpecialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitExplicitSpecialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitExplicitSpecialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitSpecializationContext explicitSpecialization() throws RecognitionException {
		ExplicitSpecializationContext _localctx = new ExplicitSpecializationContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_explicitSpecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956);
			match(Template);
			setState(1957);
			match(Less);
			setState(1958);
			match(Greater);
			setState(1959);
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
		public TerminalNode Try() { return getToken(PseudoParser.Try, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryBlockContext tryBlock() throws RecognitionException {
		TryBlockContext _localctx = new TryBlockContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_tryBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1961);
			match(Try);
			setState(1962);
			compoundStatement();
			setState(1963);
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
		public TerminalNode Try() { return getToken(PseudoParser.Try, 0); }
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterFunctionTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitFunctionTryBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitFunctionTryBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTryBlockContext functionTryBlock() throws RecognitionException {
		FunctionTryBlockContext _localctx = new FunctionTryBlockContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_functionTryBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			match(Try);
			setState(1967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1966);
				constructorInitializer();
				}
			}

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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterHandlerSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitHandlerSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitHandlerSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerSeqContext handlerSeq() throws RecognitionException {
		HandlerSeqContext _localctx = new HandlerSeqContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_handlerSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1972);
				handler();
				}
				}
				setState(1975); 
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
		public TerminalNode Catch() { return getToken(PseudoParser.Catch, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public ExceptionDeclarationContext exceptionDeclaration() {
			return getRuleContext(ExceptionDeclarationContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			match(Catch);
			setState(1978);
			match(LeftParen);
			setState(1979);
			exceptionDeclaration();
			setState(1980);
			match(RightParen);
			setState(1981);
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
		public TerminalNode Ellipsis() { return getToken(PseudoParser.Ellipsis, 0); }
		public ExceptionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterExceptionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitExceptionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitExceptionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionDeclarationContext exceptionDeclaration() throws RecognitionException {
		ExceptionDeclarationContext _localctx = new ExceptionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_exceptionDeclaration);
		int _la;
		try {
			setState(1992);
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
				setState(1984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1983);
					attributeSpecifierSeq();
					}
				}

				setState(1986);
				typeSpecifierSeq();
				setState(1989);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(1987);
					declarator();
					}
					break;
				case 2:
					{
					setState(1988);
					abstractDeclarator();
					}
					break;
				}
				}
				break;
			case Ellipsis:
				enterOuterAlt(_localctx, 2);
				{
				setState(1991);
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
		public TerminalNode Throw() { return getToken(PseudoParser.Throw, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ThrowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterThrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitThrowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitThrowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowExpressionContext throwExpression() throws RecognitionException {
		ThrowExpressionContext _localctx = new ThrowExpressionContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_throwExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1994);
			match(Throw);
			setState(1996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(1995);
				assignmentExpression();
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
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterExceptionSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitExceptionSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitExceptionSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionSpecificationContext exceptionSpecification() throws RecognitionException {
		ExceptionSpecificationContext _localctx = new ExceptionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_exceptionSpecification);
		try {
			setState(2000);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(1998);
				dynamicExceptionSpecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(1999);
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
		public TerminalNode Throw() { return getToken(PseudoParser.Throw, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public TypeIdListContext typeIdList() {
			return getRuleContext(TypeIdListContext.class,0);
		}
		public DynamicExceptionSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicExceptionSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterDynamicExceptionSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitDynamicExceptionSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitDynamicExceptionSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicExceptionSpecificationContext dynamicExceptionSpecification() throws RecognitionException {
		DynamicExceptionSpecificationContext _localctx = new DynamicExceptionSpecificationContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_dynamicExceptionSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			match(Throw);
			setState(2003);
			match(LeftParen);
			setState(2005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (Auto - 13)) | (1L << (Bool - 13)) | (1L << (Char - 13)) | (1L << (Char16 - 13)) | (1L << (Char32 - 13)) | (1L << (Class - 13)) | (1L << (Const - 13)) | (1L << (Decltype - 13)) | (1L << (Double - 13)) | (1L << (Enum - 13)) | (1L << (Float - 13)) | (1L << (Int - 13)) | (1L << (Long - 13)) | (1L << (Short - 13)) | (1L << (Signed - 13)) | (1L << (Struct - 13)) | (1L << (Typename_ - 13)))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Union - 77)) | (1L << (Unsigned - 77)) | (1L << (Void - 77)) | (1L << (Volatile - 77)) | (1L << (Wchar - 77)) | (1L << (Doublecolon - 77)) | (1L << (Identifier - 77)))) != 0)) {
				{
				setState(2004);
				typeIdList();
				}
			}

			setState(2007);
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
		public List<TerminalNode> Ellipsis() { return getTokens(PseudoParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(PseudoParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParser.Comma, i);
		}
		public TypeIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTypeIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTypeIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTypeIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdListContext typeIdList() throws RecognitionException {
		TypeIdListContext _localctx = new TypeIdListContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_typeIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2009);
			theTypeId();
			setState(2011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(2010);
				match(Ellipsis);
				}
			}

			setState(2020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(2013);
				match(Comma);
				setState(2014);
				theTypeId();
				setState(2016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2015);
					match(Ellipsis);
					}
				}

				}
				}
				setState(2022);
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
		public TerminalNode Noexcept() { return getToken(PseudoParser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public NoeExceptSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noeExceptSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterNoeExceptSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitNoeExceptSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitNoeExceptSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoeExceptSpecificationContext noeExceptSpecification() throws RecognitionException {
		NoeExceptSpecificationContext _localctx = new NoeExceptSpecificationContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_noeExceptSpecification);
		try {
			setState(2029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2023);
				match(Noexcept);
				setState(2024);
				match(LeftParen);
				setState(2025);
				constantExpression();
				setState(2026);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2028);
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
		public TerminalNode New() { return getToken(PseudoParser.New, 0); }
		public TerminalNode LeftBracket() { return getToken(PseudoParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoParser.RightBracket, 0); }
		public TerminalNode Delete() { return getToken(PseudoParser.Delete, 0); }
		public TerminalNode Plus() { return getToken(PseudoParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(PseudoParser.Minus, 0); }
		public TerminalNode Star() { return getToken(PseudoParser.Star, 0); }
		public TerminalNode Div() { return getToken(PseudoParser.Div, 0); }
		public TerminalNode Mod() { return getToken(PseudoParser.Mod, 0); }
		public TerminalNode Caret() { return getToken(PseudoParser.Caret, 0); }
		public TerminalNode And() { return getToken(PseudoParser.And, 0); }
		public TerminalNode Or() { return getToken(PseudoParser.Or, 0); }
		public TerminalNode Tilde() { return getToken(PseudoParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(PseudoParser.Not, 0); }
		public TerminalNode Assign() { return getToken(PseudoParser.Assign, 0); }
		public List<TerminalNode> Greater() { return getTokens(PseudoParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(PseudoParser.Greater, i);
		}
		public List<TerminalNode> Less() { return getTokens(PseudoParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(PseudoParser.Less, i);
		}
		public TerminalNode GreaterEqual() { return getToken(PseudoParser.GreaterEqual, 0); }
		public TerminalNode PlusAssign() { return getToken(PseudoParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(PseudoParser.MinusAssign, 0); }
		public TerminalNode StarAssign() { return getToken(PseudoParser.StarAssign, 0); }
		public TerminalNode ModAssign() { return getToken(PseudoParser.ModAssign, 0); }
		public TerminalNode XorAssign() { return getToken(PseudoParser.XorAssign, 0); }
		public TerminalNode AndAssign() { return getToken(PseudoParser.AndAssign, 0); }
		public TerminalNode OrAssign() { return getToken(PseudoParser.OrAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(PseudoParser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(PseudoParser.LeftShiftAssign, 0); }
		public TerminalNode Equal() { return getToken(PseudoParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(PseudoParser.NotEqual, 0); }
		public TerminalNode LessEqual() { return getToken(PseudoParser.LessEqual, 0); }
		public TerminalNode AndAnd() { return getToken(PseudoParser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(PseudoParser.OrOr, 0); }
		public TerminalNode PlusPlus() { return getToken(PseudoParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(PseudoParser.MinusMinus, 0); }
		public TerminalNode Comma() { return getToken(PseudoParser.Comma, 0); }
		public TerminalNode ArrowStar() { return getToken(PseudoParser.ArrowStar, 0); }
		public TerminalNode Arrow() { return getToken(PseudoParser.Arrow, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParser.RightParen, 0); }
		public TheOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterTheOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitTheOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitTheOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheOperatorContext theOperator() throws RecognitionException {
		TheOperatorContext _localctx = new TheOperatorContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_theOperator);
		try {
			setState(2084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2031);
				match(New);
				setState(2034);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2032);
					match(LeftBracket);
					setState(2033);
					match(RightBracket);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2036);
				match(Delete);
				setState(2039);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2037);
					match(LeftBracket);
					setState(2038);
					match(RightBracket);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2041);
				match(Plus);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2042);
				match(Minus);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2043);
				match(Star);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2044);
				match(Div);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2045);
				match(Mod);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2046);
				match(Caret);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2047);
				match(And);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2048);
				match(Or);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2049);
				match(Tilde);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2050);
				match(Not);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2051);
				match(Assign);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2052);
				match(Greater);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2053);
				match(Less);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2054);
				match(GreaterEqual);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2055);
				match(PlusAssign);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2056);
				match(MinusAssign);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2057);
				match(StarAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2058);
				match(Assign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2059);
				match(ModAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2060);
				match(XorAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2061);
				match(AndAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2062);
				match(OrAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2063);
				match(Less);
				setState(2064);
				match(Less);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2065);
				match(Greater);
				setState(2066);
				match(Greater);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2067);
				match(RightShiftAssign);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2068);
				match(LeftShiftAssign);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2069);
				match(Equal);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2070);
				match(NotEqual);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2071);
				match(LessEqual);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2072);
				match(GreaterEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2073);
				match(AndAnd);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2074);
				match(OrOr);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2075);
				match(PlusPlus);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2076);
				match(MinusMinus);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2077);
				match(Comma);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2078);
				match(ArrowStar);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2079);
				match(Arrow);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2080);
				match(LeftParen);
				setState(2081);
				match(RightParen);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2082);
				match(LeftBracket);
				setState(2083);
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
		public TerminalNode IntegerLiteral() { return getToken(PseudoParser.IntegerLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(PseudoParser.CharacterLiteral, 0); }
		public TerminalNode FloatingLiteral() { return getToken(PseudoParser.FloatingLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(PseudoParser.BooleanLiteral, 0); }
		public TerminalNode PointerLiteral() { return getToken(PseudoParser.PointerLiteral, 0); }
		public TerminalNode UserDefinedLiteral() { return getToken(PseudoParser.UserDefinedLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2086);
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
		case 113:
			return noPointerDeclarator_sempred((NoPointerDeclaratorContext)_localctx, predIndex);
		case 124:
			return noPointerAbstractDeclarator_sempred((NoPointerAbstractDeclaratorContext)_localctx, predIndex);
		case 126:
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
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noPointerNewDeclarator_sempred(NoPointerNewDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noPointerDeclarator_sempred(NoPointerDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noPointerAbstractDeclarator_sempred(NoPointerAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean noPointerAbstractPackDeclarator_sempred(NoPointerAbstractPackDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0093\u082b\4\2\t"+
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
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\3\2\5\2\u017e"+
		"\n\2\3\2\3\2\3\3\6\3\u0183\n\3\r\3\16\3\u0184\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\u018e\n\3\3\4\3\4\5\4\u0192\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u019b\n\5\3\5\5\5\u019e\n\5\3\6\3\6\5\6\u01a2\n\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\5\7\u01aa\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u01b1\n\7\3\7\5\7\u01b4\n"+
		"\7\3\7\7\7\u01b7\n\7\f\7\16\7\u01ba\13\7\3\b\3\b\5\b\u01be\n\b\3\b\3\b"+
		"\3\t\3\t\5\t\u01c4\n\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u01cc\n\n\5\n\u01ce"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\7\f\u01d5\n\f\f\f\16\f\u01d8\13\f\3\f\5\f\u01db"+
		"\n\f\3\r\3\r\5\r\u01df\n\r\3\16\5\16\u01e2\n\16\3\16\3\16\5\16\u01e6\n"+
		"\16\3\17\5\17\u01e9\n\17\3\17\3\17\3\17\3\20\3\20\5\20\u01f0\n\20\3\20"+
		"\3\20\5\20\u01f4\n\20\3\20\5\20\u01f7\n\20\3\20\5\20\u01fa\n\20\3\20\5"+
		"\20\u01fd\n\20\3\21\3\21\3\21\3\21\5\21\u0203\n\21\3\21\3\21\5\21\u0207"+
		"\n\21\3\21\3\21\5\21\u020b\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0219\n\21\3\21\3\21\5\21\u021d\n\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0223\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u022a\n\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0230\n\21\3\21\3\21\5\21\u0234\n\21\7\21\u0236"+
		"\n\21\f\21\16\21\u0239\13\21\3\22\3\22\3\23\3\23\3\24\5\24\u0240\n\24"+
		"\3\24\3\24\3\24\5\24\u0245\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0252\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0259\n"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0265\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u026f\n\25\3\26\3\26\3\27"+
		"\5\27\u0274\n\27\3\27\3\27\5\27\u0278\n\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u027f\n\27\3\27\5\27\u0282\n\27\3\30\3\30\3\30\3\30\3\31\3\31\5\31"+
		"\u028a\n\31\3\32\3\32\5\32\u028e\n\32\3\32\5\32\u0291\n\32\3\33\3\33\3"+
		"\33\3\33\3\33\5\33\u0298\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u029f\n\33"+
		"\7\33\u02a1\n\33\f\33\16\33\u02a4\13\33\3\34\3\34\5\34\u02a8\n\34\3\34"+
		"\3\34\5\34\u02ac\n\34\3\35\5\35\u02af\n\35\3\35\3\35\3\35\5\35\u02b4\n"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5"+
		"\37\u02c3\n\37\3 \3 \3 \7 \u02c8\n \f \16 \u02cb\13 \3!\3!\3!\7!\u02d0"+
		"\n!\f!\16!\u02d3\13!\3\"\3\"\3\"\7\"\u02d8\n\"\f\"\16\"\u02db\13\"\3\""+
		"\3\"\3\"\3\"\7\"\u02e1\n\"\f\"\16\"\u02e4\13\"\5\"\u02e6\n\"\3#\3#\3#"+
		"\3#\7#\u02ec\n#\f#\16#\u02ef\13#\3$\3$\3$\3$\5$\u02f5\n$\3%\3%\3%\7%\u02fa"+
		"\n%\f%\16%\u02fd\13%\3&\3&\3&\7&\u0302\n&\f&\16&\u0305\13&\3&\3&\3&\5"+
		"&\u030a\n&\3\'\3\'\3\'\7\'\u030f\n\'\f\'\16\'\u0312\13\'\3(\3(\3(\7(\u0317"+
		"\n(\f(\16(\u031a\13(\3)\3)\3)\7)\u031f\n)\f)\16)\u0322\13)\3*\3*\3*\7"+
		"*\u0327\n*\f*\16*\u032a\13*\3+\3+\3+\7+\u032f\n+\f+\16+\u0332\13+\3,\3"+
		",\3,\3,\3,\3,\5,\u033a\n,\3-\3-\3-\3-\3-\3-\5-\u0342\n-\3.\3.\3/\3/\3"+
		"/\7/\u0349\n/\f/\16/\u034c\13/\3\60\3\60\3\61\3\61\5\61\u0352\n\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u035a\n\61\3\61\5\61\u035d\n\61\3\62\5"+
		"\62\u0360\n\62\3\62\3\62\3\62\3\62\5\62\u0366\n\62\3\62\3\62\3\62\3\63"+
		"\5\63\u036c\n\63\3\63\3\63\3\64\3\64\5\64\u0372\n\64\3\64\3\64\3\65\6"+
		"\65\u0377\n\65\r\65\16\65\u0378\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u0382\n\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u038a\n\66\3\67\3\67\5"+
		"\67\u038e\n\67\3\67\3\67\3\67\3\67\3\67\5\67\u0395\n\67\5\67\u0397\n\67"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u03ab\n8\38"+
		"\38\58\u03af\n8\38\38\38\38\58\u03b5\n8\38\38\38\58\u03ba\n8\39\39\59"+
		"\u03be\n9\3:\5:\u03c1\n:\3:\3:\3:\3;\3;\5;\u03c8\n;\3<\3<\3<\3<\3<\5<"+
		"\u03cf\n<\3<\3<\5<\u03d3\n<\3<\3<\3=\3=\3>\6>\u03da\n>\r>\16>\u03db\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u03e7\n?\3@\3@\3@\3@\3@\3@\3@\3@\5@\u03f1"+
		"\n@\3A\3A\3A\5A\u03f6\nA\3A\3A\3A\3A\3B\5B\u03fd\nB\3B\5B\u0400\nB\3B"+
		"\3B\3B\5B\u0405\nB\3B\3B\3B\5B\u040a\nB\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D"+
		"\3E\3E\3E\3F\3F\3F\3F\3F\3F\5F\u041f\nF\3G\6G\u0422\nG\rG\16G\u0423\3"+
		"G\5G\u0427\nG\3H\3H\3I\3I\3J\3J\3K\3K\3K\5K\u0432\nK\3L\3L\3L\3L\5L\u0438"+
		"\nL\3M\6M\u043b\nM\rM\16M\u043c\3M\5M\u0440\nM\3N\6N\u0443\nN\rN\16N\u0444"+
		"\3N\5N\u0448\nN\3O\5O\u044b\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\5O\u0461\nO\3P\3P\3P\3P\5P\u0467\nP\3Q\3Q\3Q\3Q"+
		"\5Q\u046d\nQ\3Q\3Q\3R\3R\5R\u0473\nR\3R\5R\u0476\nR\3R\3R\3R\3R\5R\u047c"+
		"\nR\3R\3R\5R\u0480\nR\3R\3R\5R\u0484\nR\3R\5R\u0487\nR\3S\3S\3T\3T\3T"+
		"\3T\5T\u048f\nT\5T\u0491\nT\3T\3T\3U\3U\5U\u0497\nU\3U\5U\u049a\nU\3U"+
		"\5U\u049d\nU\3U\5U\u04a0\nU\3V\3V\5V\u04a4\nV\3V\3V\5V\u04a8\nV\3V\3V"+
		"\3W\3W\5W\u04ae\nW\3X\3X\3X\3Y\3Y\3Y\7Y\u04b6\nY\fY\16Y\u04b9\13Y\3Z\3"+
		"Z\3Z\5Z\u04be\nZ\3[\3[\3\\\3\\\5\\\u04c4\n\\\3]\3]\3^\5^\u04c9\n^\3^\3"+
		"^\3^\5^\u04ce\n^\3^\3^\5^\u04d2\n^\3^\3^\3_\3_\3`\3`\3`\3`\3`\3`\3a\5"+
		"a\u04df\na\3a\3a\3b\3b\5b\u04e5\nb\3b\3b\5b\u04e9\nb\3b\3b\3b\3c\5c\u04ef"+
		"\nc\3c\3c\3c\5c\u04f4\nc\3c\3c\3c\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\5e\u0503"+
		"\ne\3e\3e\5e\u0507\ne\3f\6f\u050a\nf\rf\16f\u050b\3g\3g\3g\5g\u0511\n"+
		"g\3g\3g\3g\5g\u0516\ng\3h\3h\3h\3h\5h\u051c\nh\3h\5h\u051f\nh\3h\3h\3"+
		"i\3i\3i\7i\u0526\ni\fi\16i\u0529\13i\3i\5i\u052c\ni\3j\3j\3j\5j\u0531"+
		"\nj\3j\3j\5j\u0535\nj\3k\3k\3l\3l\5l\u053b\nl\3l\3l\3m\6m\u0540\nm\rm"+
		"\16m\u0541\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\6n\u0551\nn\rn\16n\u0552"+
		"\5n\u0555\nn\3o\3o\3o\7o\u055a\no\fo\16o\u055d\13o\3p\3p\5p\u0561\np\3"+
		"q\3q\3q\3q\3q\5q\u0568\nq\3r\3r\5r\u056c\nr\7r\u056e\nr\fr\16r\u0571\13"+
		"r\3r\3r\3s\3s\3s\5s\u0578\ns\3s\3s\3s\3s\5s\u057e\ns\3s\3s\3s\3s\5s\u0584"+
		"\ns\3s\3s\5s\u0588\ns\5s\u058a\ns\7s\u058c\ns\fs\16s\u058f\13s\3t\3t\5"+
		"t\u0593\nt\3t\3t\5t\u0597\nt\3t\5t\u059a\nt\3t\5t\u059d\nt\3t\5t\u05a0"+
		"\nt\3u\3u\3u\5u\u05a5\nu\3v\3v\5v\u05a9\nv\3v\5v\u05ac\nv\3v\3v\5v\u05b0"+
		"\nv\3v\5v\u05b3\nv\5v\u05b5\nv\3w\6w\u05b8\nw\rw\16w\u05b9\3x\3x\3y\3"+
		"y\3z\5z\u05c1\nz\3z\3z\3{\3{\5{\u05c7\n{\3|\3|\5|\u05cb\n|\3|\3|\3|\3"+
		"|\5|\u05d1\n|\3}\3}\6}\u05d5\n}\r}\16}\u05d6\3}\5}\u05da\n}\5}\u05dc\n"+
		"}\3~\3~\3~\3~\5~\u05e2\n~\3~\3~\5~\u05e6\n~\3~\3~\3~\3~\5~\u05ec\n~\3"+
		"~\3~\3~\3~\3~\5~\u05f3\n~\3~\3~\5~\u05f7\n~\5~\u05f9\n~\7~\u05fb\n~\f"+
		"~\16~\u05fe\13~\3\177\7\177\u0601\n\177\f\177\16\177\u0604\13\177\3\177"+
		"\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u060f\n\u0080\3\u0080\3\u0080\5\u0080\u0613\n\u0080\5\u0080\u0615\n\u0080"+
		"\7\u0080\u0617\n\u0080\f\u0080\16\u0080\u061a\13\u0080\3\u0081\3\u0081"+
		"\5\u0081\u061e\n\u0081\3\u0081\5\u0081\u0621\n\u0081\3\u0082\3\u0082\3"+
		"\u0082\7\u0082\u0626\n\u0082\f\u0082\16\u0082\u0629\13\u0082\3\u0083\5"+
		"\u0083\u062c\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0631\n\u0083\5\u0083"+
		"\u0633\n\u0083\3\u0083\3\u0083\5\u0083\u0637\n\u0083\3\u0084\5\u0084\u063a"+
		"\n\u0084\3\u0084\5\u0084\u063d\n\u0084\3\u0084\3\u0084\5\u0084\u0641\n"+
		"\u0084\3\u0084\3\u0084\3\u0085\5\u0085\u0646\n\u0085\3\u0085\3\u0085\3"+
		"\u0085\3\u0085\3\u0085\5\u0085\u064d\n\u0085\3\u0086\3\u0086\3\u0086\3"+
		"\u0086\3\u0086\5\u0086\u0654\n\u0086\3\u0087\3\u0087\3\u0087\5\u0087\u0659"+
		"\n\u0087\3\u0088\3\u0088\5\u0088\u065d\n\u0088\3\u0089\3\u0089\5\u0089"+
		"\u0661\n\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u0666\n\u0089\7\u0089\u0668"+
		"\n\u0089\f\u0089\16\u0089\u066b\13\u0089\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u0670\n\u008a\5\u008a\u0672\n\u008a\3\u008a\3\u008a\3\u008b\3\u008b\5"+
		"\u008b\u0678\n\u008b\3\u008c\3\u008c\3\u008c\5\u008c\u067d\n\u008c\3\u008c"+
		"\3\u008c\3\u008d\3\u008d\5\u008d\u0683\n\u008d\3\u008d\3\u008d\5\u008d"+
		"\u0687\n\u008d\5\u008d\u0689\n\u008d\3\u008d\5\u008d\u068c\n\u008d\3\u008d"+
		"\3\u008d\5\u008d\u0690\n\u008d\3\u008d\3\u008d\5\u008d\u0694\n\u008d\5"+
		"\u008d\u0696\n\u008d\5\u008d\u0698\n\u008d\3\u008e\5\u008e\u069b\n\u008e"+
		"\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\6\u0091\u06a7\n\u0091\r\u0091\16\u0091\u06a8\3\u0092\5\u0092"+
		"\u06ac\n\u0092\3\u0092\5\u0092\u06af\n\u0092\3\u0092\5\u0092\u06b2\n\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u06bb"+
		"\n\u0092\3\u0093\3\u0093\3\u0093\7\u0093\u06c0\n\u0093\f\u0093\16\u0093"+
		"\u06c3\13\u0093\3\u0094\3\u0094\5\u0094\u06c7\n\u0094\3\u0094\5\u0094"+
		"\u06ca\n\u0094\3\u0094\5\u0094\u06cd\n\u0094\5\u0094\u06cf\n\u0094\3\u0094"+
		"\5\u0094\u06d2\n\u0094\3\u0094\5\u0094\u06d5\n\u0094\3\u0094\3\u0094\5"+
		"\u0094\u06d9\n\u0094\3\u0095\6\u0095\u06dc\n\u0095\r\u0095\16\u0095\u06dd"+
		"\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\5\u0099\u06eb\n\u0099\3\u0099\3\u0099\3\u0099\5\u0099"+
		"\u06f0\n\u0099\7\u0099\u06f2\n\u0099\f\u0099\16\u0099\u06f5\13\u0099\3"+
		"\u009a\5\u009a\u06f8\n\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u06fd\n\u009a"+
		"\3\u009a\3\u009a\3\u009a\5\u009a\u0702\n\u009a\3\u009a\3\u009a\5\u009a"+
		"\u0706\n\u009a\3\u009b\5\u009b\u0709\n\u009b\3\u009b\3\u009b\5\u009b\u070d"+
		"\n\u009b\3\u009c\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009f"+
		"\3\u009f\5\u009f\u0718\n\u009f\3\u00a0\3\u00a0\5\u00a0\u071c\n\u00a0\3"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\5\u00a2\u0723\n\u00a2\3\u00a2\3"+
		"\u00a2\3\u00a2\5\u00a2\u0728\n\u00a2\7\u00a2\u072a\n\u00a2\f\u00a2\16"+
		"\u00a2\u072d\13\u00a2\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0732\n\u00a3\3"+
		"\u00a3\3\u00a3\5\u00a3\u0736\n\u00a3\3\u00a4\3\u00a4\5\u00a4\u073a\n\u00a4"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u0743"+
		"\n\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a8\7\u00a8\u074e\n\u00a8\f\u00a8\16\u00a8\u0751\13\u00a8\3\u00a9"+
		"\3\u00a9\5\u00a9\u0755\n\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\5\u00aa\u075c\n\u00aa\3\u00aa\3\u00aa\5\u00aa\u0760\n\u00aa\3\u00aa\5"+
		"\u00aa\u0763\n\u00aa\3\u00aa\5\u00aa\u0766\n\u00aa\3\u00aa\5\u00aa\u0769"+
		"\n\u00aa\3\u00aa\3\u00aa\5\u00aa\u076d\n\u00aa\3\u00ab\3\u00ab\3\u00ab"+
		"\5\u00ab\u0772\n\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\5\u00ac"+
		"\u0779\n\u00ac\3\u00ac\3\u00ac\5\u00ac\u077d\n\u00ac\3\u00ac\3\u00ac\5"+
		"\u00ac\u0781\n\u00ac\3\u00ad\3\u00ad\3\u00ae\3\u00ae\5\u00ae\u0787\n\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u078c\n\u00ae\7\u00ae\u078e\n\u00ae\f"+
		"\u00ae\16\u00ae\u0791\13\u00ae\3\u00af\3\u00af\3\u00af\5\u00af\u0796\n"+
		"\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u079c\n\u00b0\3\u00b0\5"+
		"\u00b0\u079f\n\u00b0\3\u00b1\5\u00b1\u07a2\n\u00b1\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b4\3\u00b4\5\u00b4\u07b2\n\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b5"+
		"\6\u00b5\u07b8\n\u00b5\r\u00b5\16\u00b5\u07b9\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b7\5\u00b7\u07c3\n\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\5\u00b7\u07c8\n\u00b7\3\u00b7\5\u00b7\u07cb\n\u00b7\3\u00b8\3"+
		"\u00b8\5\u00b8\u07cf\n\u00b8\3\u00b9\3\u00b9\5\u00b9\u07d3\n\u00b9\3\u00ba"+
		"\3\u00ba\3\u00ba\5\u00ba\u07d8\n\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb"+
		"\5\u00bb\u07de\n\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u07e3\n\u00bb\7"+
		"\u00bb\u07e5\n\u00bb\f\u00bb\16\u00bb\u07e8\13\u00bb\3\u00bc\3\u00bc\3"+
		"\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u07f0\n\u00bc\3\u00bd\3\u00bd\3"+
		"\u00bd\5\u00bd\u07f5\n\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u07fa\n\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u0827"+
		"\n\u00bd\3\u00be\3\u00be\3\u00be\2\b\f \64\u00e4\u00fa\u00fe\u00bf\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166"+
		"\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\2\27\4\2"+
		"ccgg\6\2\32\32!!<<CC\4\2~~\u0083\u0083\4\2]_cf\4\2}}\u0084\u0084\3\2_"+
		"a\3\2]^\3\2z{\4\2hivw\3\2tu\4\2ggjs\7\2&&\61\61;;AAHH\5\2$$..RR\4\2\27"+
		"\27DD\3\2W\\\4\2ccxx\4\2\30\30TT\3\2\35\36\4\2((\67\67\3\28:\3\2\3\t\2"+
		"\u0913\2\u017d\3\2\2\2\4\u018d\3\2\2\2\6\u0191\3\2\2\2\b\u019d\3\2\2\2"+
		"\n\u019f\3\2\2\2\f\u01a5\3\2\2\2\16\u01bb\3\2\2\2\20\u01c1\3\2\2\2\22"+
		"\u01cd\3\2\2\2\24\u01cf\3\2\2\2\26\u01d1\3\2\2\2\30\u01de\3\2\2\2\32\u01e5"+
		"\3\2\2\2\34\u01e8\3\2\2\2\36\u01ed\3\2\2\2 \u021c\3\2\2\2\"\u023a\3\2"+
		"\2\2$\u023c\3\2\2\2&\u0251\3\2\2\2(\u026e\3\2\2\2*\u0270\3\2\2\2,\u0273"+
		"\3\2\2\2.\u0283\3\2\2\2\60\u0287\3\2\2\2\62\u0290\3\2\2\2\64\u0292\3\2"+
		"\2\2\66\u02ab\3\2\2\28\u02ae\3\2\2\2:\u02b7\3\2\2\2<\u02c2\3\2\2\2>\u02c4"+
		"\3\2\2\2@\u02cc\3\2\2\2B\u02e5\3\2\2\2D\u02e7\3\2\2\2F\u02f4\3\2\2\2H"+
		"\u02f6\3\2\2\2J\u0309\3\2\2\2L\u030b\3\2\2\2N\u0313\3\2\2\2P\u031b\3\2"+
		"\2\2R\u0323\3\2\2\2T\u032b\3\2\2\2V\u0333\3\2\2\2X\u0341\3\2\2\2Z\u0343"+
		"\3\2\2\2\\\u0345\3\2\2\2^\u034d\3\2\2\2`\u035c\3\2\2\2b\u035f\3\2\2\2"+
		"d\u036b\3\2\2\2f\u036f\3\2\2\2h\u0376\3\2\2\2j\u0389\3\2\2\2l\u0396\3"+
		"\2\2\2n\u03b9\3\2\2\2p\u03bd\3\2\2\2r\u03c0\3\2\2\2t\u03c7\3\2\2\2v\u03d2"+
		"\3\2\2\2x\u03d6\3\2\2\2z\u03d9\3\2\2\2|\u03e6\3\2\2\2~\u03f0\3\2\2\2\u0080"+
		"\u03f2\3\2\2\2\u0082\u0409\3\2\2\2\u0084\u040b\3\2\2\2\u0086\u0413\3\2"+
		"\2\2\u0088\u0415\3\2\2\2\u008a\u041e\3\2\2\2\u008c\u0421\3\2\2\2\u008e"+
		"\u0428\3\2\2\2\u0090\u042a\3\2\2\2\u0092\u042c\3\2\2\2\u0094\u0431\3\2"+
		"\2\2\u0096\u0437\3\2\2\2\u0098\u043a\3\2\2\2\u009a\u0442\3\2\2\2\u009c"+
		"\u0460\3\2\2\2\u009e\u0466\3\2\2\2\u00a0\u0468\3\2\2\2\u00a2\u0486\3\2"+
		"\2\2\u00a4\u0488\3\2\2\2\u00a6\u048a\3\2\2\2\u00a8\u0494\3\2\2\2\u00aa"+
		"\u04a1\3\2\2\2\u00ac\u04ab\3\2\2\2\u00ae\u04af\3\2\2\2\u00b0\u04b2\3\2"+
		"\2\2\u00b2\u04ba\3\2\2\2\u00b4\u04bf\3\2\2\2\u00b6\u04c3\3\2\2\2\u00b8"+
		"\u04c5\3\2\2\2\u00ba\u04c8\3\2\2\2\u00bc\u04d5\3\2\2\2\u00be\u04d7\3\2"+
		"\2\2\u00c0\u04de\3\2\2\2\u00c2\u04e2\3\2\2\2\u00c4\u04ee\3\2\2\2\u00c6"+
		"\u04f8\3\2\2\2\u00c8\u04fe\3\2\2\2\u00ca\u0509\3\2\2\2\u00cc\u0515\3\2"+
		"\2\2\u00ce\u0517\3\2\2\2\u00d0\u0522\3\2\2\2\u00d2\u0530\3\2\2\2\u00d4"+
		"\u0536\3\2\2\2\u00d6\u0538\3\2\2\2\u00d8\u053f\3\2\2\2\u00da\u0554\3\2"+
		"\2\2\u00dc\u0556\3\2\2\2\u00de\u055e\3\2\2\2\u00e0\u0567\3\2\2\2\u00e2"+
		"\u056f\3\2\2\2\u00e4\u057d\3\2\2\2\u00e6\u0590\3\2\2\2\u00e8\u05a1\3\2"+
		"\2\2\u00ea\u05b4\3\2\2\2\u00ec\u05b7\3\2\2\2\u00ee\u05bb\3\2\2\2\u00f0"+
		"\u05bd\3\2\2\2\u00f2\u05c0\3\2\2\2\u00f4\u05c4\3\2\2\2\u00f6\u05d0\3\2"+
		"\2\2\u00f8\u05db\3\2\2\2\u00fa\u05eb\3\2\2\2\u00fc\u0602\3\2\2\2\u00fe"+
		"\u0607\3\2\2\2\u0100\u061b\3\2\2\2\u0102\u0622\3\2\2\2\u0104\u062b\3\2"+
		"\2\2\u0106\u0639\3\2\2\2\u0108\u064c\3\2\2\2\u010a\u0653\3\2\2\2\u010c"+
		"\u0658\3\2\2\2\u010e\u065c\3\2\2\2\u0110\u065e\3\2\2\2\u0112\u066c\3\2"+
		"\2\2\u0114\u0677\3\2\2\2\u0116\u0679\3\2\2\2\u0118\u0697\3\2\2\2\u011a"+
		"\u069a\3\2\2\2\u011c\u069e\3\2\2\2\u011e\u06a0\3\2\2\2\u0120\u06a6\3\2"+
		"\2\2\u0122\u06ba\3\2\2\2\u0124\u06bc\3\2\2\2\u0126\u06d8\3\2\2\2\u0128"+
		"\u06db\3\2\2\2\u012a\u06df\3\2\2\2\u012c\u06e1\3\2\2\2\u012e\u06e5\3\2"+
		"\2\2\u0130\u06e8\3\2\2\2\u0132\u06f7\3\2\2\2\u0134\u070c\3\2\2\2\u0136"+
		"\u070e\3\2\2\2\u0138\u0710\3\2\2\2\u013a\u0712\3\2\2\2\u013c\u0715\3\2"+
		"\2\2\u013e\u0719\3\2\2\2\u0140\u071d\3\2\2\2\u0142\u0720\3\2\2\2\u0144"+
		"\u072e\3\2\2\2\u0146\u0739\3\2\2\2\u0148\u073b\3\2\2\2\u014a\u073e\3\2"+
		"\2\2\u014c\u0744\3\2\2\2\u014e\u074a\3\2\2\2\u0150\u0754\3\2\2\2\u0152"+
		"\u075f\3\2\2\2\u0154\u076e\3\2\2\2\u0156\u0780\3\2\2\2\u0158\u0782\3\2"+
		"\2\2\u015a\u0784\3\2\2\2\u015c\u0795\3\2\2\2\u015e\u0797\3\2\2\2\u0160"+
		"\u07a1\3\2\2\2\u0162\u07a6\3\2\2\2\u0164\u07ab\3\2\2\2\u0166\u07af\3\2"+
		"\2\2\u0168\u07b7\3\2\2\2\u016a\u07bb\3\2\2\2\u016c\u07ca\3\2\2\2\u016e"+
		"\u07cc\3\2\2\2\u0170\u07d2\3\2\2\2\u0172\u07d4\3\2\2\2\u0174\u07db\3\2"+
		"\2\2\u0176\u07ef\3\2\2\2\u0178\u0826\3\2\2\2\u017a\u0828\3\2\2\2\u017c"+
		"\u017e\5z>\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2"+
		"\2\u017f\u0180\7\2\2\3\u0180\3\3\2\2\2\u0181\u0183\5\u017a\u00be\2\u0182"+
		"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u018e\3\2\2\2\u0186\u018e\7G\2\2\u0187\u0188\7W\2\2\u0188\u0189"+
		"\5\\/\2\u0189\u018a\7X\2\2\u018a\u018e\3\2\2\2\u018b\u018e\5\6\4\2\u018c"+
		"\u018e\5\16\b\2\u018d\u0182\3\2\2\2\u018d\u0186\3\2\2\2\u018d\u0187\3"+
		"\2\2\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018e\5\3\2\2\2\u018f\u0192"+
		"\5\b\5\2\u0190\u0192\5\n\6\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2\2\2\u0192"+
		"\7\3\2\2\2\u0193\u019e\7\u0086\2\2\u0194\u019e\5\u0148\u00a5\2\u0195\u019e"+
		"\5\u013a\u009e\2\u0196\u019e\5\u014a\u00a6\2\u0197\u019a\7e\2\2\u0198"+
		"\u019b\5\u0114\u008b\2\u0199\u019b\5\u00a0Q\2\u019a\u0198\3\2\2\2\u019a"+
		"\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019e\5\u0156\u00ac\2\u019d\u0193"+
		"\3\2\2\2\u019d\u0194\3\2\2\2\u019d\u0195\3\2\2\2\u019d\u0196\3\2\2\2\u019d"+
		"\u0197\3\2\2\2\u019d\u019c\3\2\2\2\u019e\t\3\2\2\2\u019f\u01a1\5\f\7\2"+
		"\u01a0\u01a2\7F\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3\u01a4\5\b\5\2\u01a4\13\3\2\2\2\u01a5\u01a9\b\7\1\2\u01a6"+
		"\u01aa\5\u009eP\2\u01a7\u01aa\5\u00b6\\\2\u01a8\u01aa\5\u00a0Q\2\u01a9"+
		"\u01a6\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2"+
		"\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7\u0081\2\2\u01ac\u01b8\3\2\2\2\u01ad"+
		"\u01b3\f\3\2\2\u01ae\u01b4\7\u0086\2\2\u01af\u01b1\7F\2\2\u01b0\u01af"+
		"\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\5\u0154\u00ab"+
		"\2\u01b3\u01ae\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7"+
		"\7\u0081\2\2\u01b6\u01ad\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2"+
		"\2\u01b8\u01b9\3\2\2\2\u01b9\r\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bd"+
		"\5\20\t\2\u01bc\u01be\5\36\20\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2"+
		"\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\5f\64\2\u01c0\17\3\2\2\2\u01c1\u01c3"+
		"\7Y\2\2\u01c2\u01c4\5\22\n\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\7Z\2\2\u01c6\21\3\2\2\2\u01c7\u01ce\5\26\f"+
		"\2\u01c8\u01cb\5\24\13\2\u01c9\u01ca\7|\2\2\u01ca\u01cc\5\26\f\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01c7\3\2"+
		"\2\2\u01cd\u01c8\3\2\2\2\u01ce\23\3\2\2\2\u01cf\u01d0\t\2\2\2\u01d0\25"+
		"\3\2\2\2\u01d1\u01d6\5\30\r\2\u01d2\u01d3\7|\2\2\u01d3\u01d5\5\30\r\2"+
		"\u01d4\u01d2\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01db\7\u0085\2"+
		"\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\27\3\2\2\2\u01dc\u01df"+
		"\5\32\16\2\u01dd\u01df\5\34\17\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2"+
		"\2\u01df\31\3\2\2\2\u01e0\u01e2\7c\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e6\7\u0086\2\2\u01e4\u01e6\7G\2"+
		"\2\u01e5\u01e1\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e6\33\3\2\2\2\u01e7\u01e9"+
		"\7c\2\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01eb\7\u0086\2\2\u01eb\u01ec\5\u010a\u0086\2\u01ec\35\3\2\2\2\u01ed"+
		"\u01ef\7W\2\2\u01ee\u01f0\5\u0100\u0081\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\7X\2\2\u01f2\u01f4\7\61\2\2\u01f3"+
		"\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f7\5\u0170"+
		"\u00b9\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8"+
		"\u01fa\5\u00caf\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc"+
		"\3\2\2\2\u01fb\u01fd\5\u00e8u\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2"+
		"\2\u01fd\37\3\2\2\2\u01fe\u01ff\b\21\1\2\u01ff\u021d\5\4\3\2\u0200\u0203"+
		"\5\u009cO\2\u0201\u0203\5\u015e\u00b0\2\u0202\u0200\3\2\2\2\u0202\u0201"+
		"\3\2\2\2\u0203\u020a\3\2\2\2\u0204\u0206\7W\2\2\u0205\u0207\5$\23\2\u0206"+
		"\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020b\7X"+
		"\2\2\u0209\u020b\5\u0112\u008a\2\u020a\u0204\3\2\2\2\u020a\u0209\3\2\2"+
		"\2\u020b\u021d\3\2\2\2\u020c\u020d\t\3\2\2\u020d\u020e\7h\2\2\u020e\u020f"+
		"\5\u00f4{\2\u020f\u0210\7i\2\2\u0210\u0211\7W\2\2\u0211\u0212\5\\/\2\u0212"+
		"\u0213\7X\2\2\u0213\u021d\3\2\2\2\u0214\u0215\5\"\22\2\u0215\u0218\7W"+
		"\2\2\u0216\u0219\5\\/\2\u0217\u0219\5\u00f4{\2\u0218\u0216\3\2\2\2\u0218"+
		"\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\7X\2\2\u021b\u021d\3\2"+
		"\2\2\u021c\u01fe\3\2\2\2\u021c\u0202\3\2\2\2\u021c\u020c\3\2\2\2\u021c"+
		"\u0214\3\2\2\2\u021d\u0237\3\2\2\2\u021e\u021f\f\b\2\2\u021f\u0222\7Y"+
		"\2\2\u0220\u0223\5\\/\2\u0221\u0223\5\u0112\u008a\2\u0222\u0220\3\2\2"+
		"\2\u0222\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\7Z\2\2\u0225\u0236"+
		"\3\2\2\2\u0226\u0227\f\7\2\2\u0227\u0229\7W\2\2\u0228\u022a\5$\23\2\u0229"+
		"\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0236\7X"+
		"\2\2\u022c\u022d\f\5\2\2\u022d\u0233\t\4\2\2\u022e\u0230\7F\2\2\u022f"+
		"\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0234\5\6"+
		"\4\2\u0232\u0234\5&\24\2\u0233\u022f\3\2\2\2\u0233\u0232\3\2\2\2\u0234"+
		"\u0236\3\2\2\2\u0235\u021e\3\2\2\2\u0235\u0226\3\2\2\2\u0235\u022c\3\2"+
		"\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"!\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023b\7M\2\2\u023b#\3\2\2\2\u023c"+
		"\u023d\5\u0110\u0089\2\u023d%\3\2\2\2\u023e\u0240\5\f\7\2\u023f\u023e"+
		"\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0244\3\2\2\2\u0241\u0242\5\u009eP"+
		"\2\u0242\u0243\7\u0081\2\2\u0243\u0245\3\2\2\2\u0244\u0241\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\7e\2\2\u0247\u0252\5\u009e"+
		"P\2\u0248\u0249\5\f\7\2\u0249\u024a\7F\2\2\u024a\u024b\5\u0154\u00ab\2"+
		"\u024b\u024c\7\u0081\2\2\u024c\u024d\7e\2\2\u024d\u024e\5\u009eP\2\u024e"+
		"\u0252\3\2\2\2\u024f\u0250\7e\2\2\u0250\u0252\5\u00a0Q\2\u0251\u023f\3"+
		"\2\2\2\u0251\u0248\3\2\2\2\u0251\u024f\3\2\2\2\u0252\'\3\2\2\2\u0253\u026f"+
		"\5 \21\2\u0254\u0259\7z\2\2\u0255\u0259\7{\2\2\u0256\u0259\5*\26\2\u0257"+
		"\u0259\7@\2\2\u0258\u0254\3\2\2\2\u0258\u0255\3\2\2\2\u0258\u0256\3\2"+
		"\2\2\u0258\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u026f\5(\25\2\u025b"+
		"\u0264\7@\2\2\u025c\u025d\7W\2\2\u025d\u025e\5\u00f4{\2\u025e\u025f\7"+
		"X\2\2\u025f\u0265\3\2\2\2\u0260\u0261\7\u0085\2\2\u0261\u0262\7W\2\2\u0262"+
		"\u0263\7\u0086\2\2\u0263\u0265\7X\2\2\u0264\u025c\3\2\2\2\u0264\u0260"+
		"\3\2\2\2\u0265\u026f\3\2\2\2\u0266\u0267\7\r\2\2\u0267\u0268\7W\2\2\u0268"+
		"\u0269\5\u00f4{\2\u0269\u026a\7X\2\2\u026a\u026f\3\2\2\2\u026b\u026f\5"+
		":\36\2\u026c\u026f\5,\27\2\u026d\u026f\58\35\2\u026e\u0253\3\2\2\2\u026e"+
		"\u0258\3\2\2\2\u026e\u025b\3\2\2\2\u026e\u0266\3\2\2\2\u026e\u026b\3\2"+
		"\2\2\u026e\u026c\3\2\2\2\u026e\u026d\3\2\2\2\u026f)\3\2\2\2\u0270\u0271"+
		"\t\5\2\2\u0271+\3\2\2\2\u0272\u0274\7\u0081\2\2\u0273\u0272\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\7\63\2\2\u0276\u0278\5"+
		".\30\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027e\3\2\2\2\u0279"+
		"\u027f\5\60\31\2\u027a\u027b\7W\2\2\u027b\u027c\5\u00f4{\2\u027c\u027d"+
		"\7X\2\2\u027d\u027f\3\2\2\2\u027e\u0279\3\2\2\2\u027e\u027a\3\2\2\2\u027f"+
		"\u0281\3\2\2\2\u0280\u0282\5\66\34\2\u0281\u0280\3\2\2\2\u0281\u0282\3"+
		"\2\2\2\u0282-\3\2\2\2\u0283\u0284\7W\2\2\u0284\u0285\5$\23\2\u0285\u0286"+
		"\7X\2\2\u0286/\3\2\2\2\u0287\u0289\5\u0098M\2\u0288\u028a\5\62\32\2\u0289"+
		"\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\61\3\2\2\2\u028b\u028d\5\u00ea"+
		"v\2\u028c\u028e\5\62\32\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u0291\3\2\2\2\u028f\u0291\5\64\33\2\u0290\u028b\3\2\2\2\u0290\u028f\3"+
		"\2\2\2\u0291\63\3\2\2\2\u0292\u0293\b\33\1\2\u0293\u0294\7Y\2\2\u0294"+
		"\u0295\5\\/\2\u0295\u0297\7Z\2\2\u0296\u0298\5\u00caf\2\u0297\u0296\3"+
		"\2\2\2\u0297\u0298\3\2\2\2\u0298\u02a2\3\2\2\2\u0299\u029a\f\3\2\2\u029a"+
		"\u029b\7Y\2\2\u029b\u029c\5^\60\2\u029c\u029e\7Z\2\2\u029d\u029f\5\u00ca"+
		"f\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0"+
		"\u0299\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2"+
		"\2\2\u02a3\65\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a7\7W\2\2\u02a6\u02a8"+
		"\5$\23\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u02ac\7X\2\2\u02aa\u02ac\5\u0112\u008a\2\u02ab\u02a5\3\2\2\2\u02ab\u02aa"+
		"\3\2\2\2\u02ac\67\3\2\2\2\u02ad\u02af\7\u0081\2\2\u02ae\u02ad\3\2\2\2"+
		"\u02ae\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b3\7\36\2\2\u02b1\u02b2"+
		"\7Y\2\2\u02b2\u02b4\7Z\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u02b6\5<\37\2\u02b69\3\2\2\2\u02b7\u02b8\7\64\2\2"+
		"\u02b8\u02b9\7W\2\2\u02b9\u02ba\5\\/\2\u02ba\u02bb\7X\2\2\u02bb;\3\2\2"+
		"\2\u02bc\u02c3\5(\25\2\u02bd\u02be\7W\2\2\u02be\u02bf\5\u00f4{\2\u02bf"+
		"\u02c0\7X\2\2\u02c0\u02c1\5<\37\2\u02c1\u02c3\3\2\2\2\u02c2\u02bc\3\2"+
		"\2\2\u02c2\u02bd\3\2\2\2\u02c3=\3\2\2\2\u02c4\u02c9\5<\37\2\u02c5\u02c6"+
		"\t\6\2\2\u02c6\u02c8\5<\37\2\u02c7\u02c5\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9"+
		"\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca?\3\2\2\2\u02cb\u02c9\3\2\2\2"+
		"\u02cc\u02d1\5> \2\u02cd\u02ce\t\7\2\2\u02ce\u02d0\5> \2\u02cf\u02cd\3"+
		"\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"A\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d9\5@!\2\u02d5\u02d6\t\b\2\2\u02d6"+
		"\u02d8\5@!\2\u02d7\u02d5\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2"+
		"\2\u02d9\u02da\3\2\2\2\u02da\u02e6\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02dd"+
		"\t\t\2\2\u02dd\u02de\5@!\2\u02de\u02df\b\"\1\2\u02df\u02e1\3\2\2\2\u02e0"+
		"\u02dc\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2"+
		"\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02d4\3\2\2\2\u02e5"+
		"\u02e2\3\2\2\2\u02e6C\3\2\2\2\u02e7\u02ed\5B\"\2\u02e8\u02e9\5F$\2\u02e9"+
		"\u02ea\5B\"\2\u02ea\u02ec\3\2\2\2\u02eb\u02e8\3\2\2\2\u02ec\u02ef\3\2"+
		"\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02eeE\3\2\2\2\u02ef\u02ed"+
		"\3\2\2\2\u02f0\u02f1\7i\2\2\u02f1\u02f5\7i\2\2\u02f2\u02f3\7h\2\2\u02f3"+
		"\u02f5\7h\2\2\u02f4\u02f0\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5G\3\2\2\2\u02f6"+
		"\u02fb\5D#\2\u02f7\u02f8\t\n\2\2\u02f8\u02fa\5D#\2\u02f9\u02f7\3\2\2\2"+
		"\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fcI\3"+
		"\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u0303\5H%\2\u02ff\u0300\t\13\2\2\u0300"+
		"\u0302\5H%\2\u0301\u02ff\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2"+
		"\2\u0303\u0304\3\2\2\2\u0304\u030a\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u0307"+
		"\5 \21\2\u0307\u0308\t\t\2\2\u0308\u030a\3\2\2\2\u0309\u02fe\3\2\2\2\u0309"+
		"\u0306\3\2\2\2\u030aK\3\2\2\2\u030b\u0310\5J&\2\u030c\u030d\7c\2\2\u030d"+
		"\u030f\5J&\2\u030e\u030c\3\2\2\2\u030f\u0312\3\2\2\2\u0310\u030e\3\2\2"+
		"\2\u0310\u0311\3\2\2\2\u0311M\3\2\2\2\u0312\u0310\3\2\2\2\u0313\u0318"+
		"\5L\'\2\u0314\u0315\7b\2\2\u0315\u0317\5L\'\2\u0316\u0314\3\2\2\2\u0317"+
		"\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319O\3\2\2\2"+
		"\u031a\u0318\3\2\2\2\u031b\u0320\5N(\2\u031c\u031d\7d\2\2\u031d\u031f"+
		"\5N(\2\u031e\u031c\3\2\2\2\u031f\u0322\3\2\2\2\u0320\u031e\3\2\2\2\u0320"+
		"\u0321\3\2\2\2\u0321Q\3\2\2\2\u0322\u0320\3\2\2\2\u0323\u0328\5P)\2\u0324"+
		"\u0325\7x\2\2\u0325\u0327\5P)\2\u0326\u0324\3\2\2\2\u0327\u032a\3\2\2"+
		"\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329S\3\2\2\2\u032a\u0328"+
		"\3\2\2\2\u032b\u0330\5R*\2\u032c\u032d\7y\2\2\u032d\u032f\5R*\2\u032e"+
		"\u032c\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2"+
		"\2\2\u0331U\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0339\5T+\2\u0334\u0335"+
		"\7\177\2\2\u0335\u0336\5\\/\2\u0336\u0337\7\u0080\2\2\u0337\u0338\5X-"+
		"\2\u0338\u033a\3\2\2\2\u0339\u0334\3\2\2\2\u0339\u033a\3\2\2\2\u033aW"+
		"\3\2\2\2\u033b\u0342\5V,\2\u033c\u033d\5T+\2\u033d\u033e\5Z.\2\u033e\u033f"+
		"\5\u010e\u0088\2\u033f\u0342\3\2\2\2\u0340\u0342\5\u016e\u00b8\2\u0341"+
		"\u033b\3\2\2\2\u0341\u033c\3\2\2\2\u0341\u0340\3\2\2\2\u0342Y\3\2\2\2"+
		"\u0343\u0344\t\f\2\2\u0344[\3\2\2\2\u0345\u034a\5X-\2\u0346\u0347\7|\2"+
		"\2\u0347\u0349\5X-\2\u0348\u0346\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348"+
		"\3\2\2\2\u034a\u034b\3\2\2\2\u034b]\3\2\2\2\u034c\u034a\3\2\2\2\u034d"+
		"\u034e\5V,\2\u034e_\3\2\2\2\u034f\u035d\5b\62\2\u0350\u0352\5\u00caf\2"+
		"\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0359\3\2\2\2\u0353\u035a"+
		"\5d\63\2\u0354\u035a\5f\64\2\u0355\u035a\5j\66\2\u0356\u035a\5n8\2\u0357"+
		"\u035a\5v<\2\u0358\u035a\5\u0164\u00b3\2\u0359\u0353\3\2\2\2\u0359\u0354"+
		"\3\2\2\2\u0359\u0355\3\2\2\2\u0359\u0356\3\2\2\2\u0359\u0357\3\2\2\2\u0359"+
		"\u0358\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u035d\5x=\2\u035c\u034f\3\2\2"+
		"\2\u035c\u0351\3\2\2\2\u035c\u035b\3\2\2\2\u035da\3\2\2\2\u035e\u0360"+
		"\5\u00caf\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0365\3\2\2"+
		"\2\u0361\u0366\7\u0086\2\2\u0362\u0363\7\22\2\2\u0363\u0366\5^\60\2\u0364"+
		"\u0366\7\35\2\2\u0365\u0361\3\2\2\2\u0365\u0362\3\2\2\2\u0365\u0364\3"+
		"\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\7\u0080\2\2\u0368\u0369\5`\61\2"+
		"\u0369c\3\2\2\2\u036a\u036c\5\\/\2\u036b\u036a\3\2\2\2\u036b\u036c\3\2"+
		"\2\2\u036c\u036d\3\2\2\2\u036d\u036e\7\u0082\2\2\u036ee\3\2\2\2\u036f"+
		"\u0371\7[\2\2\u0370\u0372\5h\65\2\u0371\u0370\3\2\2\2\u0371\u0372\3\2"+
		"\2\2\u0372\u0373\3\2\2\2\u0373\u0374\7\\\2\2\u0374g\3\2\2\2\u0375\u0377"+
		"\5`\61\2\u0376\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0376\3\2\2\2\u0378"+
		"\u0379\3\2\2\2\u0379i\3\2\2\2\u037a\u037b\7-\2\2\u037b\u037c\7W\2\2\u037c"+
		"\u037d\5l\67\2\u037d\u037e\7X\2\2\u037e\u0381\5`\61\2\u037f\u0380\7\""+
		"\2\2\u0380\u0382\5`\61\2\u0381\u037f\3\2\2\2\u0381\u0382\3\2\2\2\u0382"+
		"\u038a\3\2\2\2\u0383\u0384\7E\2\2\u0384\u0385\7W\2\2\u0385\u0386\5l\67"+
		"\2\u0386\u0387\7X\2\2\u0387\u0388\5`\61\2\u0388\u038a\3\2\2\2\u0389\u037a"+
		"\3\2\2\2\u0389\u0383\3\2\2\2\u038ak\3\2\2\2\u038b\u0397\5\\/\2\u038c\u038e"+
		"\5\u00caf\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\3\2\2"+
		"\2\u038f\u0390\5\u008cG\2\u0390\u0394\5\u00e0q\2\u0391\u0392\7g\2\2\u0392"+
		"\u0395\5\u010e\u0088\2\u0393\u0395\5\u0112\u008a\2\u0394\u0391\3\2\2\2"+
		"\u0394\u0393\3\2\2\2\u0395\u0397\3\2\2\2\u0396\u038b\3\2\2\2\u0396\u038d"+
		"\3\2\2\2\u0397m\3\2\2\2\u0398\u0399\7V\2\2\u0399\u039a\7W\2\2\u039a\u039b"+
		"\5l\67\2\u039b\u039c\7X\2\2\u039c\u039d\5`\61\2\u039d\u03ba\3\2\2\2\u039e"+
		"\u039f\7\37\2\2\u039f\u03a0\5`\61\2\u03a0\u03a1\7V\2\2\u03a1\u03a2\7W"+
		"\2\2\u03a2\u03a3\5\\/\2\u03a3\u03a4\7X\2\2\u03a4\u03a5\7\u0082\2\2\u03a5"+
		"\u03ba\3\2\2\2\u03a6\u03a7\7*\2\2\u03a7\u03b4\7W\2\2\u03a8\u03aa\5p9\2"+
		"\u03a9\u03ab\5l\67\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac"+
		"\3\2\2\2\u03ac\u03ae\7\u0082\2\2\u03ad\u03af\5\\/\2\u03ae\u03ad\3\2\2"+
		"\2\u03ae\u03af\3\2\2\2\u03af\u03b5\3\2\2\2\u03b0\u03b1\5r:\2\u03b1\u03b2"+
		"\7\u0080\2\2\u03b2\u03b3\5t;\2\u03b3\u03b5\3\2\2\2\u03b4\u03a8\3\2\2\2"+
		"\u03b4\u03b0\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\7X\2\2\u03b7\u03b8"+
		"\5`\61\2\u03b8\u03ba\3\2\2\2\u03b9\u0398\3\2\2\2\u03b9\u039e\3\2\2\2\u03b9"+
		"\u03a6\3\2\2\2\u03bao\3\2\2\2\u03bb\u03be\5d\63\2\u03bc\u03be\5\u0082"+
		"B\2\u03bd\u03bb\3\2\2\2\u03bd\u03bc\3\2\2\2\u03beq\3\2\2\2\u03bf\u03c1"+
		"\5\u00caf\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\3\2\2"+
		"\2\u03c2\u03c3\5\u008cG\2\u03c3\u03c4\5\u00e0q\2\u03c4s\3\2\2\2\u03c5"+
		"\u03c8\5\\/\2\u03c6\u03c8\5\u0112\u008a\2\u03c7\u03c5\3\2\2\2\u03c7\u03c6"+
		"\3\2\2\2\u03c8u\3\2\2\2\u03c9\u03d3\7\21\2\2\u03ca\u03d3\7\33\2\2\u03cb"+
		"\u03ce\7=\2\2\u03cc\u03cf\5\\/\2\u03cd\u03cf\5\u0112\u008a\2\u03ce\u03cc"+
		"\3\2\2\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d3\3\2\2\2\u03d0"+
		"\u03d1\7,\2\2\u03d1\u03d3\7\u0086\2\2\u03d2\u03c9\3\2\2\2\u03d2\u03ca"+
		"\3\2\2\2\u03d2\u03cb\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4"+
		"\u03d5\7\u0082\2\2\u03d5w\3\2\2\2\u03d6\u03d7\5~@\2\u03d7y\3\2\2\2\u03d8"+
		"\u03da\5|?\2\u03d9\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03d9\3\2\2"+
		"\2\u03db\u03dc\3\2\2\2\u03dc{\3\2\2\2\u03dd\u03e7\5~@\2\u03de\u03e7\5"+
		"\u0106\u0084\2\u03df\u03e7\5\u014c\u00a7\2\u03e0\u03e7\5\u0160\u00b1\2"+
		"\u03e1\u03e7\5\u0162\u00b2\2\u03e2\u03e7\5\u00c8e\2\u03e3\u03e7\5\u00ba"+
		"^\2\u03e4\u03e7\5\u0086D\2\u03e5\u03e7\5\u0088E\2\u03e6\u03dd\3\2\2\2"+
		"\u03e6\u03de\3\2\2\2\u03e6\u03df\3\2\2\2\u03e6\u03e0\3\2\2\2\u03e6\u03e1"+
		"\3\2\2\2\u03e6\u03e2\3\2\2\2\u03e6\u03e3\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6"+
		"\u03e5\3\2\2\2\u03e7}\3\2\2\2\u03e8\u03f1\5\u0082B\2\u03e9\u03f1\5\u00c6"+
		"d\2\u03ea\u03f1\5\u00be`\2\u03eb\u03f1\5\u00c2b\2\u03ec\u03f1\5\u00c4"+
		"c\2\u03ed\u03f1\5\u0084C\2\u03ee\u03f1\5\u0080A\2\u03ef\u03f1\5\u00aa"+
		"V\2\u03f0\u03e8\3\2\2\2\u03f0\u03e9\3\2\2\2\u03f0\u03ea\3\2\2\2\u03f0"+
		"\u03eb\3\2\2\2\u03f0\u03ec\3\2\2\2\u03f0\u03ed\3\2\2\2\u03f0\u03ee\3\2"+
		"\2\2\u03f0\u03ef\3\2\2\2\u03f1\177\3\2\2\2\u03f2\u03f3\7Q\2\2\u03f3\u03f5"+
		"\7\u0086\2\2\u03f4\u03f6\5\u00caf\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3"+
		"\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\7g\2\2\u03f8\u03f9\5\u00f4{\2\u03f9"+
		"\u03fa\7\u0082\2\2\u03fa\u0081\3\2\2\2\u03fb\u03fd\5\u008cG\2\u03fc\u03fb"+
		"\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03ff\3\2\2\2\u03fe\u0400\5\u00dco"+
		"\2\u03ff\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u040a"+
		"\7\u0082\2\2\u0402\u0404\5\u00caf\2\u0403\u0405\5\u008cG\2\u0404\u0403"+
		"\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\5\u00dco"+
		"\2\u0407\u0408\7\u0082\2\2\u0408\u040a\3\2\2\2\u0409\u03fc\3\2\2\2\u0409"+
		"\u0402\3\2\2\2\u040a\u0083\3\2\2\2\u040b\u040c\7B\2\2\u040c\u040d\7W\2"+
		"\2\u040d\u040e\5^\60\2\u040e\u040f\7|\2\2\u040f\u0410\7\6\2\2\u0410\u0411"+
		"\7X\2\2\u0411\u0412\7\u0082\2\2\u0412\u0085\3\2\2\2\u0413\u0414\7\u0082"+
		"\2\2\u0414\u0087\3\2\2\2\u0415\u0416\5\u00caf\2\u0416\u0417\7\u0082\2"+
		"\2\u0417\u0089\3\2\2\2\u0418\u041f\5\u008eH\2\u0419\u041f\5\u0094K\2\u041a"+
		"\u041f\5\u0090I\2\u041b\u041f\7+\2\2\u041c\u041f\7L\2\2\u041d\u041f\7"+
		"\31\2\2\u041e\u0418\3\2\2\2\u041e\u0419\3\2\2\2\u041e\u041a\3\2\2\2\u041e"+
		"\u041b\3\2\2\2\u041e\u041c\3\2\2\2\u041e\u041d\3\2\2\2\u041f\u008b\3\2"+
		"\2\2\u0420\u0422\5\u008aF\2\u0421\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423"+
		"\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426\3\2\2\2\u0425\u0427\5\u00ca"+
		"f\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u008d\3\2\2\2\u0428"+
		"\u0429\t\r\2\2\u0429\u008f\3\2\2\2\u042a\u042b\t\16\2\2\u042b\u0091\3"+
		"\2\2\2\u042c\u042d\7\u0086\2\2\u042d\u0093\3\2\2\2\u042e\u0432\5\u0096"+
		"L\2\u042f\u0432\5\u0116\u008c\2\u0430\u0432\5\u00a6T\2\u0431\u042e\3\2"+
		"\2\2\u0431\u042f\3\2\2\2\u0431\u0430\3\2\2\2\u0432\u0095\3\2\2\2\u0433"+
		"\u0438\5\u009cO\2\u0434\u0438\5\u00a2R\2\u0435\u0438\5\u015e\u00b0\2\u0436"+
		"\u0438\5\u00eex\2\u0437\u0433\3\2\2\2\u0437\u0434\3\2\2\2\u0437\u0435"+
		"\3\2\2\2\u0437\u0436\3\2\2\2\u0438\u0097\3\2\2\2\u0439\u043b\5\u0094K"+
		"\2\u043a\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043a\3\2\2\2\u043c\u043d"+
		"\3\2\2\2\u043d\u043f\3\2\2\2\u043e\u0440\5\u00caf\2\u043f\u043e\3\2\2"+
		"\2\u043f\u0440\3\2\2\2\u0440\u0099\3\2\2\2\u0441\u0443\5\u0096L\2\u0442"+
		"\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0442\3\2\2\2\u0444\u0445\3\2"+
		"\2\2\u0445\u0447\3\2\2\2\u0446\u0448\5\u00caf\2\u0447\u0446\3\2\2\2\u0447"+
		"\u0448\3\2\2\2\u0448\u009b\3\2\2\2\u0449\u044b\5\f\7\2\u044a\u0449\3\2"+
		"\2\2\u044a\u044b\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u0461\5\u009eP\2\u044d"+
		"\u044e\5\f\7\2\u044e\u044f\7F\2\2\u044f\u0450\5\u0154\u00ab\2\u0450\u0461"+
		"\3\2\2\2\u0451\u0461\7\24\2\2\u0452\u0461\7\25\2\2\u0453\u0461\7\26\2"+
		"\2\u0454\u0461\7U\2\2\u0455\u0461\7\20\2\2\u0456\u0461\7>\2\2\u0457\u0461"+
		"\7/\2\2\u0458\u0461\7\60\2\2\u0459\u0461\7?\2\2\u045a\u0461\7P\2\2\u045b"+
		"\u0461\7)\2\2\u045c\u0461\7 \2\2\u045d\u0461\7S\2\2\u045e\u0461\7\17\2"+
		"\2\u045f\u0461\5\u00a0Q\2\u0460\u044a\3\2\2\2\u0460\u044d\3\2\2\2\u0460"+
		"\u0451\3\2\2\2\u0460\u0452\3\2\2\2\u0460\u0453\3\2\2\2\u0460\u0454\3\2"+
		"\2\2\u0460\u0455\3\2\2\2\u0460\u0456\3\2\2\2\u0460\u0457\3\2\2\2\u0460"+
		"\u0458\3\2\2\2\u0460\u0459\3\2\2\2\u0460\u045a\3\2\2\2\u0460\u045b\3\2"+
		"\2\2\u0460\u045c\3\2\2\2\u0460\u045d\3\2\2\2\u0460\u045e\3\2\2\2\u0460"+
		"\u045f\3\2\2\2\u0461\u009d\3\2\2\2\u0462\u0467\5\u0114\u008b\2\u0463\u0467"+
		"\5\u00a4S\2\u0464\u0467\5\u0092J\2\u0465\u0467\5\u0154\u00ab\2\u0466\u0462"+
		"\3\2\2\2\u0466\u0463\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0465\3\2\2\2\u0467"+
		"\u009f\3\2\2\2\u0468\u0469\7\34\2\2\u0469\u046c\7W\2\2\u046a\u046d\5\\"+
		"/\2\u046b\u046d\7\17\2\2\u046c\u046a\3\2\2\2\u046c\u046b\3\2\2\2\u046d"+
		"\u046e\3\2\2\2\u046e\u046f\7X\2\2\u046f\u00a1\3\2\2\2\u0470\u047f\5\u011e"+
		"\u0090\2\u0471\u0473\5\u00caf\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2"+
		"\2\u0473\u0475\3\2\2\2\u0474\u0476\5\f\7\2\u0475\u0474\3\2\2\2\u0475\u0476"+
		"\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0480\7\u0086\2\2\u0478\u0480\5\u0154"+
		"\u00ab\2\u0479\u047b\5\f\7\2\u047a\u047c\7F\2\2\u047b\u047a\3\2\2\2\u047b"+
		"\u047c\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\5\u0154\u00ab\2\u047e\u0480"+
		"\3\2\2\2\u047f\u0472\3\2\2\2\u047f\u0478\3\2\2\2\u047f\u0479\3\2\2\2\u0480"+
		"\u0487\3\2\2\2\u0481\u0483\7#\2\2\u0482\u0484\5\f\7\2\u0483\u0482\3\2"+
		"\2\2\u0483\u0484\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0487\7\u0086\2\2\u0486"+
		"\u0470\3\2\2\2\u0486\u0481\3\2\2\2\u0487\u00a3\3\2\2\2\u0488\u0489\7\u0086"+
		"\2\2\u0489\u00a5\3\2\2\2\u048a\u048b\5\u00a8U\2\u048b\u0490\7[\2\2\u048c"+
		"\u048e\5\u00b0Y\2\u048d\u048f\7|\2\2\u048e\u048d\3\2\2\2\u048e\u048f\3"+
		"\2\2\2\u048f\u0491\3\2\2\2\u0490\u048c\3\2\2\2\u0490\u0491\3\2\2\2\u0491"+
		"\u0492\3\2\2\2\u0492\u0493\7\\\2\2\u0493\u00a7\3\2\2\2\u0494\u0496\5\u00ac"+
		"W\2\u0495\u0497\5\u00caf\2\u0496\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497"+
		"\u049c\3\2\2\2\u0498\u049a\5\f\7\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2"+
		"\2\2\u049a\u049b\3\2\2\2\u049b\u049d\7\u0086\2\2\u049c\u0499\3\2\2\2\u049c"+
		"\u049d\3\2\2\2\u049d\u049f\3\2\2\2\u049e\u04a0\5\u00aeX\2\u049f\u049e"+
		"\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u00a9\3\2\2\2\u04a1\u04a3\5\u00acW"+
		"\2\u04a2\u04a4\5\u00caf\2\u04a3\u04a2\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4"+
		"\u04a5\3\2\2\2\u04a5\u04a7\7\u0086\2\2\u04a6\u04a8\5\u00aeX\2\u04a7\u04a6"+
		"\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa\7\u0082\2"+
		"\2\u04aa\u00ab\3\2\2\2\u04ab\u04ad\7#\2\2\u04ac\u04ae\t\17\2\2\u04ad\u04ac"+
		"\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u00ad\3\2\2\2\u04af\u04b0\7\u0080\2"+
		"\2\u04b0\u04b1\5\u0098M\2\u04b1\u00af\3\2\2\2\u04b2\u04b7\5\u00b2Z\2\u04b3"+
		"\u04b4\7|\2\2\u04b4\u04b6\5\u00b2Z\2\u04b5\u04b3\3\2\2\2\u04b6\u04b9\3"+
		"\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u00b1\3\2\2\2\u04b9"+
		"\u04b7\3\2\2\2\u04ba\u04bd\5\u00b4[\2\u04bb\u04bc\7g\2\2\u04bc\u04be\5"+
		"^\60\2\u04bd\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u00b3\3\2\2\2\u04bf"+
		"\u04c0\7\u0086\2\2\u04c0\u00b5\3\2\2\2\u04c1\u04c4\5\u00b8]\2\u04c2\u04c4"+
		"\5\u00bc_\2\u04c3\u04c1\3\2\2\2\u04c3\u04c2\3\2\2\2\u04c4\u00b7\3\2\2"+
		"\2\u04c5\u04c6\7\u0086\2\2\u04c6\u00b9\3\2\2\2\u04c7\u04c9\7.\2\2\u04c8"+
		"\u04c7\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cd\7\62"+
		"\2\2\u04cb\u04ce\7\u0086\2\2\u04cc\u04ce\5\u00b8]\2\u04cd\u04cb\3\2\2"+
		"\2\u04cd\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d1"+
		"\7[\2\2\u04d0\u04d2\5z>\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2"+
		"\u04d3\3\2\2\2\u04d3\u04d4\7\\\2\2\u04d4\u00bb\3\2\2\2\u04d5\u04d6\7\u0086"+
		"\2\2\u04d6\u00bd\3\2\2\2\u04d7\u04d8\7\62\2\2\u04d8\u04d9\7\u0086\2\2"+
		"\u04d9\u04da\7g\2\2\u04da\u04db\5\u00c0a\2\u04db\u04dc\7\u0082\2\2\u04dc"+
		"\u00bf\3\2\2\2\u04dd\u04df\5\f\7\2\u04de\u04dd\3\2\2\2\u04de\u04df\3\2"+
		"\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\5\u00b6\\\2\u04e1\u00c1\3\2\2\2\u04e2"+
		"\u04e8\7Q\2\2\u04e3\u04e5\7N\2\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3\2\2"+
		"\2\u04e5\u04e6\3\2\2\2\u04e6\u04e9\5\f\7\2\u04e7\u04e9\7\u0081\2\2\u04e8"+
		"\u04e4\3\2\2\2\u04e8\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\5\b"+
		"\5\2\u04eb\u04ec\7\u0082\2\2\u04ec\u00c3\3\2\2\2\u04ed\u04ef\5\u00caf"+
		"\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1"+
		"\7Q\2\2\u04f1\u04f3\7\62\2\2\u04f2\u04f4\5\f\7\2\u04f3\u04f2\3\2\2\2\u04f3"+
		"\u04f4\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\5\u00b6\\\2\u04f6\u04f7"+
		"\7\u0082\2\2\u04f7\u00c5\3\2\2\2\u04f8\u04f9\7\16\2\2\u04f9\u04fa\7W\2"+
		"\2\u04fa\u04fb\7\6\2\2\u04fb\u04fc\7X\2\2\u04fc\u04fd\7\u0082\2\2\u04fd"+
		"\u00c7\3\2\2\2\u04fe\u04ff\7&\2\2\u04ff\u0506\7\6\2\2\u0500\u0502\7[\2"+
		"\2\u0501\u0503\5z>\2\u0502\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0504"+
		"\3\2\2\2\u0504\u0507\7\\\2\2\u0505\u0507\5|?\2\u0506\u0500\3\2\2\2\u0506"+
		"\u0505\3\2\2\2\u0507\u00c9\3\2\2\2\u0508\u050a\5\u00ccg\2\u0509\u0508"+
		"\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u0509\3\2\2\2\u050b\u050c\3\2\2\2\u050c"+
		"\u00cb\3\2\2\2\u050d\u050e\7Y\2\2\u050e\u0510\7Y\2\2\u050f\u0511\5\u00d0"+
		"i\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512"+
		"\u0513\7Z\2\2\u0513\u0516\7Z\2\2\u0514\u0516\5\u00ceh\2\u0515\u050d\3"+
		"\2\2\2\u0515\u0514\3\2\2\2\u0516\u00cd\3\2\2\2\u0517\u0518\7\f\2\2\u0518"+
		"\u051b\7W\2\2\u0519\u051c\5\u00f4{\2\u051a\u051c\5^\60\2\u051b\u0519\3"+
		"\2\2\2\u051b\u051a\3\2\2\2\u051c\u051e\3\2\2\2\u051d\u051f\7\u0085\2\2"+
		"\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0521"+
		"\7X\2\2\u0521\u00cf\3\2\2\2\u0522\u0527\5\u00d2j\2\u0523\u0524\7|\2\2"+
		"\u0524\u0526\5\u00d2j\2\u0525\u0523\3\2\2\2\u0526\u0529\3\2\2\2\u0527"+
		"\u0525\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u052b\3\2\2\2\u0529\u0527\3\2"+
		"\2\2\u052a\u052c\7\u0085\2\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c"+
		"\u00d1\3\2\2\2\u052d\u052e\5\u00d4k\2\u052e\u052f\7\u0081\2\2\u052f\u0531"+
		"\3\2\2\2\u0530\u052d\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\3\2\2\2\u0532"+
		"\u0534\7\u0086\2\2\u0533\u0535\5\u00d6l\2\u0534\u0533\3\2\2\2\u0534\u0535"+
		"\3\2\2\2\u0535\u00d3\3\2\2\2\u0536\u0537\7\u0086\2\2\u0537\u00d5\3\2\2"+
		"\2\u0538\u053a\7W\2\2\u0539\u053b\5\u00d8m\2\u053a\u0539\3\2\2\2\u053a"+
		"\u053b\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053d\7X\2\2\u053d\u00d7\3\2"+
		"\2\2\u053e\u0540\5\u00dan\2\u053f\u053e\3\2\2\2\u0540\u0541\3\2\2\2\u0541"+
		"\u053f\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u00d9\3\2\2\2\u0543\u0544\7W"+
		"\2\2\u0544\u0545\5\u00d8m\2\u0545\u0546\7X\2\2\u0546\u0555\3\2\2\2\u0547"+
		"\u0548\7Y\2\2\u0548\u0549\5\u00d8m\2\u0549\u054a\7Z\2\2\u054a\u0555\3"+
		"\2\2\2\u054b\u054c\7[\2\2\u054c\u054d\5\u00d8m\2\u054d\u054e\7\\\2\2\u054e"+
		"\u0555\3\2\2\2\u054f\u0551\n\20\2\2\u0550\u054f\3\2\2\2\u0551\u0552\3"+
		"\2\2\2\u0552\u0550\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0555\3\2\2\2\u0554"+
		"\u0543\3\2\2\2\u0554\u0547\3\2\2\2\u0554\u054b\3\2\2\2\u0554\u0550\3\2"+
		"\2\2\u0555\u00db\3\2\2\2\u0556\u055b\5\u00dep\2\u0557\u0558\7|\2\2\u0558"+
		"\u055a\5\u00dep\2\u0559\u0557\3\2\2\2\u055a\u055d\3\2\2\2\u055b\u0559"+
		"\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u00dd\3\2\2\2\u055d\u055b\3\2\2\2\u055e"+
		"\u0560\5\u00e0q\2\u055f\u0561\5\u010a\u0086\2\u0560\u055f\3\2\2\2\u0560"+
		"\u0561\3\2\2\2\u0561\u00df\3\2\2\2\u0562\u0568\5\u00e2r\2\u0563\u0564"+
		"\5\u00e4s\2\u0564\u0565\5\u00e6t\2\u0565\u0566\5\u00e8u\2\u0566\u0568"+
		"\3\2\2\2\u0567\u0562\3\2\2\2\u0567\u0563\3\2\2\2\u0568\u00e1\3\2\2\2\u0569"+
		"\u056b\5\u00eav\2\u056a\u056c\7\30\2\2\u056b\u056a\3\2\2\2\u056b\u056c"+
		"\3\2\2\2\u056c\u056e\3\2\2\2\u056d\u0569\3\2\2\2\u056e\u0571\3\2\2\2\u056f"+
		"\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0572\3\2\2\2\u0571\u056f\3\2"+
		"\2\2\u0572\u0573\5\u00e4s\2\u0573\u00e3\3\2\2\2\u0574\u0575\bs\1\2\u0575"+
		"\u0577\5\u00f2z\2\u0576\u0578\5\u00caf\2\u0577\u0576\3\2\2\2\u0577\u0578"+
		"\3\2\2\2\u0578\u057e\3\2\2\2\u0579\u057a\7W\2\2\u057a\u057b\5\u00e2r\2"+
		"\u057b\u057c\7X\2\2\u057c\u057e\3\2\2\2\u057d\u0574\3\2\2\2\u057d\u0579"+
		"\3\2\2\2\u057e\u058d\3\2\2\2\u057f\u0589\f\4\2\2\u0580\u058a\5\u00e6t"+
		"\2\u0581\u0583\7Y\2\2\u0582\u0584\5^\60\2\u0583\u0582\3\2\2\2\u0583\u0584"+
		"\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u0587\7Z\2\2\u0586\u0588\5\u00caf\2"+
		"\u0587\u0586\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u058a\3\2\2\2\u0589\u0580"+
		"\3\2\2\2\u0589\u0581\3\2\2\2\u058a\u058c\3\2\2\2\u058b\u057f\3\2\2\2\u058c"+
		"\u058f\3\2\2\2\u058d\u058b\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u00e5\3\2"+
		"\2\2\u058f\u058d\3\2\2\2\u0590\u0592\7W\2\2\u0591\u0593\5\u0100\u0081"+
		"\2\u0592\u0591\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0596"+
		"\7X\2\2\u0595\u0597\5\u00ecw\2\u0596\u0595\3\2\2\2\u0596\u0597\3\2\2\2"+
		"\u0597\u0599\3\2\2\2\u0598\u059a\5\u00f0y\2\u0599\u0598\3\2\2\2\u0599"+
		"\u059a\3\2\2\2\u059a\u059c\3\2\2\2\u059b\u059d\5\u0170\u00b9\2\u059c\u059b"+
		"\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059f\3\2\2\2\u059e\u05a0\5\u00caf"+
		"\2\u059f\u059e\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u00e7\3\2\2\2\u05a1\u05a2"+
		"\7~\2\2\u05a2\u05a4\5\u009aN\2\u05a3\u05a5\5\u00f6|\2\u05a4\u05a3\3\2"+
		"\2\2\u05a4\u05a5\3\2\2\2\u05a5\u00e9\3\2\2\2\u05a6\u05a8\t\21\2\2\u05a7"+
		"\u05a9\5\u00caf\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05b5"+
		"\3\2\2\2\u05aa\u05ac\5\f\7\2\u05ab\u05aa\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac"+
		"\u05ad\3\2\2\2\u05ad\u05af\7_\2\2\u05ae\u05b0\5\u00caf\2\u05af\u05ae\3"+
		"\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b2\3\2\2\2\u05b1\u05b3\5\u00ecw\2"+
		"\u05b2\u05b1\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b5\3\2\2\2\u05b4\u05a6"+
		"\3\2\2\2\u05b4\u05ab\3\2\2\2\u05b5\u00eb\3\2\2\2\u05b6\u05b8\5\u00eex"+
		"\2\u05b7\u05b6\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba"+
		"\3\2\2\2\u05ba\u00ed\3\2\2\2\u05bb\u05bc\t\22\2\2\u05bc\u00ef\3\2\2\2"+
		"\u05bd\u05be\t\21\2\2\u05be\u00f1\3\2\2\2\u05bf\u05c1\7\u0085\2\2\u05c0"+
		"\u05bf\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\5\6"+
		"\4\2\u05c3\u00f3\3\2\2\2\u05c4\u05c6\5\u0098M\2\u05c5\u05c7\5\u00f6|\2"+
		"\u05c6\u05c5\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u00f5\3\2\2\2\u05c8\u05d1"+
		"\5\u00f8}\2\u05c9\u05cb\5\u00fa~\2\u05ca\u05c9\3\2\2\2\u05ca\u05cb\3\2"+
		"\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\5\u00e6t\2\u05cd\u05ce\5\u00e8u\2"+
		"\u05ce\u05d1\3\2\2\2\u05cf\u05d1\5\u00fc\177\2\u05d0\u05c8\3\2\2\2\u05d0"+
		"\u05ca\3\2\2\2\u05d0\u05cf\3\2\2\2\u05d1\u00f7\3\2\2\2\u05d2\u05dc\5\u00fa"+
		"~\2\u05d3\u05d5\5\u00eav\2\u05d4\u05d3\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6"+
		"\u05d4\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d9\3\2\2\2\u05d8\u05da\5\u00fa"+
		"~\2\u05d9\u05d8\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05dc\3\2\2\2\u05db"+
		"\u05d2\3\2\2\2\u05db\u05d4\3\2\2\2\u05dc\u00f9\3\2\2\2\u05dd\u05de\b~"+
		"\1\2\u05de\u05ec\5\u00e6t\2\u05df\u05e1\7Y\2\2\u05e0\u05e2\5^\60\2\u05e1"+
		"\u05e0\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e5\7Z"+
		"\2\2\u05e4\u05e6\5\u00caf\2\u05e5\u05e4\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6"+
		"\u05ec\3\2\2\2\u05e7\u05e8\7W\2\2\u05e8\u05e9\5\u00f8}\2\u05e9\u05ea\7"+
		"X\2\2\u05ea\u05ec\3\2\2\2\u05eb\u05dd\3\2\2\2\u05eb\u05df\3\2\2\2\u05eb"+
		"\u05e7\3\2\2\2\u05ec\u05fc\3\2\2\2\u05ed\u05f8\f\6\2\2\u05ee\u05f9\5\u00e6"+
		"t\2\u05ef\u05f0\5\u00fa~\2\u05f0\u05f2\7Y\2\2\u05f1\u05f3\5^\60\2\u05f2"+
		"\u05f1\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f6\7Z"+
		"\2\2\u05f5\u05f7\5\u00caf\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7"+
		"\u05f9\3\2\2\2\u05f8\u05ee\3\2\2\2\u05f8\u05ef\3\2\2\2\u05f9\u05fb\3\2"+
		"\2\2\u05fa\u05ed\3\2\2\2\u05fb\u05fe\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fc"+
		"\u05fd\3\2\2\2\u05fd\u00fb\3\2\2\2\u05fe\u05fc\3\2\2\2\u05ff\u0601\5\u00ea"+
		"v\2\u0600\u05ff\3\2\2\2\u0601\u0604\3\2\2\2\u0602\u0600\3\2\2\2\u0602"+
		"\u0603\3\2\2\2\u0603\u0605\3\2\2\2\u0604\u0602\3\2\2\2\u0605\u0606\5\u00fe"+
		"\u0080\2\u0606\u00fd\3\2\2\2\u0607\u0608\b\u0080\1\2\u0608\u0609\7\u0085"+
		"\2\2\u0609\u0618\3\2\2\2\u060a\u0614\f\4\2\2\u060b\u0615\5\u00e6t\2\u060c"+
		"\u060e\7Y\2\2\u060d\u060f\5^\60\2\u060e\u060d\3\2\2\2\u060e\u060f\3\2"+
		"\2\2\u060f\u0610\3\2\2\2\u0610\u0612\7Z\2\2\u0611\u0613\5\u00caf\2\u0612"+
		"\u0611\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0615\3\2\2\2\u0614\u060b\3\2"+
		"\2\2\u0614\u060c\3\2\2\2\u0615\u0617\3\2\2\2\u0616\u060a\3\2\2\2\u0617"+
		"\u061a\3\2\2\2\u0618\u0616\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u00ff\3\2"+
		"\2\2\u061a\u0618\3\2\2\2\u061b\u0620\5\u0102\u0082\2\u061c\u061e\7|\2"+
		"\2\u061d\u061c\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0621"+
		"\7\u0085\2\2\u0620\u061d\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0101\3\2\2"+
		"\2\u0622\u0627\5\u0104\u0083\2\u0623\u0624\7|\2\2\u0624\u0626\5\u0104"+
		"\u0083\2\u0625\u0623\3\2\2\2\u0626\u0629\3\2\2\2\u0627\u0625\3\2\2\2\u0627"+
		"\u0628\3\2\2\2\u0628\u0103\3\2\2\2\u0629\u0627\3\2\2\2\u062a\u062c\5\u00ca"+
		"f\2\u062b\u062a\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062d\3\2\2\2\u062d"+
		"\u0632\5\u008cG\2\u062e\u0633\5\u00e0q\2\u062f\u0631\5\u00f6|\2\u0630"+
		"\u062f\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0633\3\2\2\2\u0632\u062e\3\2"+
		"\2\2\u0632\u0630\3\2\2\2\u0633\u0636\3\2\2\2\u0634\u0635\7g\2\2\u0635"+
		"\u0637\5\u010e\u0088\2\u0636\u0634\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0105"+
		"\3\2\2\2\u0638\u063a\5\u00caf\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2\2"+
		"\2\u063a\u063c\3\2\2\2\u063b\u063d\5\u008cG\2\u063c\u063b\3\2\2\2\u063c"+
		"\u063d\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u0640\5\u00e0q\2\u063f\u0641"+
		"\5\u0128\u0095\2\u0640\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0642\3"+
		"\2\2\2\u0642\u0643\5\u0108\u0085\2\u0643\u0107\3\2\2\2\u0644\u0646\5\u0140"+
		"\u00a1\2\u0645\u0644\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0647\3\2\2\2\u0647"+
		"\u064d\5f\64\2\u0648\u064d\5\u0166\u00b4\2\u0649\u064a\7g\2\2\u064a\u064b"+
		"\t\23\2\2\u064b\u064d\7\u0082\2\2\u064c\u0645\3\2\2\2\u064c\u0648\3\2"+
		"\2\2\u064c\u0649\3\2\2\2\u064d\u0109\3\2\2\2\u064e\u0654\5\u010c\u0087"+
		"\2\u064f\u0650\7W\2\2\u0650\u0651\5$\23\2\u0651\u0652\7X\2\2\u0652\u0654"+
		"\3\2\2\2\u0653\u064e\3\2\2\2\u0653\u064f\3\2\2\2\u0654\u010b\3\2\2\2\u0655"+
		"\u0656\7g\2\2\u0656\u0659\5\u010e\u0088\2\u0657\u0659\5\u0112\u008a\2"+
		"\u0658\u0655\3\2\2\2\u0658\u0657\3\2\2\2\u0659\u010d\3\2\2\2\u065a\u065d"+
		"\5X-\2\u065b\u065d\5\u0112\u008a\2\u065c\u065a\3\2\2\2\u065c\u065b\3\2"+
		"\2\2\u065d\u010f\3\2\2\2\u065e\u0660\5\u010e\u0088\2\u065f\u0661\7\u0085"+
		"\2\2\u0660\u065f\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u0669\3\2\2\2\u0662"+
		"\u0663\7|\2\2\u0663\u0665\5\u010e\u0088\2\u0664\u0666\7\u0085\2\2\u0665"+
		"\u0664\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0668\3\2\2\2\u0667\u0662\3\2"+
		"\2\2\u0668\u066b\3\2\2\2\u0669\u0667\3\2\2\2\u0669\u066a\3\2\2\2\u066a"+
		"\u0111\3\2\2\2\u066b\u0669\3\2\2\2\u066c\u0671\7[\2\2\u066d\u066f\5\u0110"+
		"\u0089\2\u066e\u0670\7|\2\2\u066f\u066e\3\2\2\2\u066f\u0670\3\2\2\2\u0670"+
		"\u0672\3\2\2\2\u0671\u066d\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0673\3\2"+
		"\2\2\u0673\u0674\7\\\2\2\u0674\u0113\3\2\2\2\u0675\u0678\7\u0086\2\2\u0676"+
		"\u0678\5\u0154\u00ab\2\u0677\u0675\3\2\2\2\u0677\u0676\3\2\2\2\u0678\u0115"+
		"\3\2\2\2\u0679\u067a\5\u0118\u008d\2\u067a\u067c\7[\2\2\u067b\u067d\5"+
		"\u0120\u0091\2\u067c\u067b\3\2\2\2\u067c\u067d\3\2\2\2\u067d\u067e\3\2"+
		"\2\2\u067e\u067f\7\\\2\2\u067f\u0117\3\2\2\2\u0680\u0682\5\u011e\u0090"+
		"\2\u0681\u0683\5\u00caf\2\u0682\u0681\3\2\2\2\u0682\u0683\3\2\2\2\u0683"+
		"\u0688\3\2\2\2\u0684\u0686\5\u011a\u008e\2\u0685\u0687\5\u011c\u008f\2"+
		"\u0686\u0685\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u0689\3\2\2\2\u0688\u0684"+
		"\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068b\3\2\2\2\u068a\u068c\5\u012e\u0098"+
		"\2\u068b\u068a\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u0698\3\2\2\2\u068d\u068f"+
		"\7O\2\2\u068e\u0690\5\u00caf\2\u068f\u068e\3\2\2\2\u068f\u0690\3\2\2\2"+
		"\u0690\u0695\3\2\2\2\u0691\u0693\5\u011a\u008e\2\u0692\u0694\5\u011c\u008f"+
		"\2\u0693\u0692\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0696\3\2\2\2\u0695\u0691"+
		"\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u0698\3\2\2\2\u0697\u0680\3\2\2\2\u0697"+
		"\u068d\3\2\2\2\u0698\u0119\3\2\2\2\u0699\u069b\5\f\7\2\u069a\u0699\3\2"+
		"\2\2\u069a\u069b\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069d\5\u0114\u008b"+
		"\2\u069d\u011b\3\2\2\2\u069e\u069f\7(\2\2\u069f\u011d\3\2\2\2\u06a0\u06a1"+
		"\t\17\2\2\u06a1\u011f\3\2\2\2\u06a2\u06a7\5\u0122\u0092\2\u06a3\u06a4"+
		"\5\u0138\u009d\2\u06a4\u06a5\7\u0080\2\2\u06a5\u06a7\3\2\2\2\u06a6\u06a2"+
		"\3\2\2\2\u06a6\u06a3\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06a6\3\2\2\2\u06a8"+
		"\u06a9\3\2\2\2\u06a9\u0121\3\2\2\2\u06aa\u06ac\5\u00caf\2\u06ab\u06aa"+
		"\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ae\3\2\2\2\u06ad\u06af\5\u008cG"+
		"\2\u06ae\u06ad\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b1\3\2\2\2\u06b0\u06b2"+
		"\5\u0124\u0093\2\u06b1\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3"+
		"\2\2\2\u06b3\u06bb\7\u0082\2\2\u06b4\u06bb\5\u0106\u0084\2\u06b5\u06bb"+
		"\5\u00c2b\2\u06b6\u06bb\5\u0084C\2\u06b7\u06bb\5\u014c\u00a7\2\u06b8\u06bb"+
		"\5\u0080A\2\u06b9\u06bb\5\u0086D\2\u06ba\u06ab\3\2\2\2\u06ba\u06b4\3\2"+
		"\2\2\u06ba\u06b5\3\2\2\2\u06ba\u06b6\3\2\2\2\u06ba\u06b7\3\2\2\2\u06ba"+
		"\u06b8\3\2\2\2\u06ba\u06b9\3\2\2\2\u06bb\u0123\3\2\2\2\u06bc\u06c1\5\u0126"+
		"\u0094\2\u06bd\u06be\7|\2\2\u06be\u06c0\5\u0126\u0094\2\u06bf\u06bd\3"+
		"\2\2\2\u06c0\u06c3\3\2\2\2\u06c1\u06bf\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2"+
		"\u0125\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c4\u06ce\5\u00e0q\2\u06c5\u06c7"+
		"\5\u0128\u0095\2\u06c6\u06c5\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c9\3"+
		"\2\2\2\u06c8\u06ca\5\u012c\u0097\2\u06c9\u06c8\3\2\2\2\u06c9\u06ca\3\2"+
		"\2\2\u06ca\u06cf\3\2\2\2\u06cb\u06cd\5\u010c\u0087\2\u06cc\u06cb\3\2\2"+
		"\2\u06cc\u06cd\3\2\2\2\u06cd\u06cf\3\2\2\2\u06ce\u06c6\3\2\2\2\u06ce\u06cc"+
		"\3\2\2\2\u06cf\u06d9\3\2\2\2\u06d0\u06d2\7\u0086\2\2\u06d1\u06d0\3\2\2"+
		"\2\u06d1\u06d2\3\2\2\2\u06d2\u06d4\3\2\2\2\u06d3\u06d5\5\u00caf\2\u06d4"+
		"\u06d3\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d7\7\u0080"+
		"\2\2\u06d7\u06d9\5^\60\2\u06d8\u06c4\3\2\2\2\u06d8\u06d1\3\2\2\2\u06d9"+
		"\u0127\3\2\2\2\u06da\u06dc\5\u012a\u0096\2\u06db\u06da\3\2\2\2\u06dc\u06dd"+
		"\3\2\2\2\u06dd\u06db\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u0129\3\2\2\2\u06df"+
		"\u06e0\t\24\2\2\u06e0\u012b\3\2\2\2\u06e1\u06e2\7g\2\2\u06e2\u06e3\7\u0088"+
		"\2\2\u06e3\u06e4\b\u0097\1\2\u06e4\u012d\3\2\2\2\u06e5\u06e6\7\u0080\2"+
		"\2\u06e6\u06e7\5\u0130\u0099\2\u06e7\u012f\3\2\2\2\u06e8\u06ea\5\u0132"+
		"\u009a\2\u06e9\u06eb\7\u0085\2\2\u06ea\u06e9\3\2\2\2\u06ea\u06eb\3\2\2"+
		"\2\u06eb\u06f3\3\2\2\2\u06ec\u06ed\7|\2\2\u06ed\u06ef\5\u0132\u009a\2"+
		"\u06ee\u06f0\7\u0085\2\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0"+
		"\u06f2\3\2\2\2\u06f1\u06ec\3\2\2\2\u06f2\u06f5\3\2\2\2\u06f3\u06f1\3\2"+
		"\2\2\u06f3\u06f4\3\2\2\2\u06f4\u0131\3\2\2\2\u06f5\u06f3\3\2\2\2\u06f6"+
		"\u06f8\5\u00caf\2\u06f7\u06f6\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u0705"+
		"\3\2\2\2\u06f9\u0706\5\u0136\u009c\2\u06fa\u06fc\7R\2\2\u06fb\u06fd\5"+
		"\u0138\u009d\2\u06fc\u06fb\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u06fe\3\2"+
		"\2\2\u06fe\u0706\5\u0136\u009c\2\u06ff\u0701\5\u0138\u009d\2\u0700\u0702"+
		"\7R\2\2\u0701\u0700\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0703\3\2\2\2\u0703"+
		"\u0704\5\u0136\u009c\2\u0704\u0706\3\2\2\2\u0705\u06f9\3\2\2\2\u0705\u06fa"+
		"\3\2\2\2\u0705\u06ff\3\2\2\2\u0706\u0133\3\2\2\2\u0707\u0709\5\f\7\2\u0708"+
		"\u0707\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u070d\5\u0114"+
		"\u008b\2\u070b\u070d\5\u00a0Q\2\u070c\u0708\3\2\2\2\u070c\u070b\3\2\2"+
		"\2\u070d\u0135\3\2\2\2\u070e\u070f\5\u0134\u009b\2\u070f\u0137\3\2\2\2"+
		"\u0710\u0711\t\25\2\2\u0711\u0139\3\2\2\2\u0712\u0713\7\66\2\2\u0713\u0714"+
		"\5\u013c\u009f\2\u0714\u013b\3\2\2\2\u0715\u0717\5\u0098M\2\u0716\u0718"+
		"\5\u013e\u00a0\2\u0717\u0716\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u013d\3"+
		"\2\2\2\u0719\u071b\5\u00eav\2\u071a\u071c\5\u013e\u00a0\2\u071b\u071a"+
		"\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u013f\3\2\2\2\u071d\u071e\7\u0080\2"+
		"\2\u071e\u071f\5\u0142\u00a2\2\u071f\u0141\3\2\2\2\u0720\u0722\5\u0144"+
		"\u00a3\2\u0721\u0723\7\u0085\2\2\u0722\u0721\3\2\2\2\u0722\u0723\3\2\2"+
		"\2\u0723\u072b\3\2\2\2\u0724\u0725\7|\2\2\u0725\u0727\5\u0144\u00a3\2"+
		"\u0726\u0728\7\u0085\2\2\u0727\u0726\3\2\2\2\u0727\u0728\3\2\2\2\u0728"+
		"\u072a\3\2\2\2\u0729\u0724\3\2\2\2\u072a\u072d\3\2\2\2\u072b\u0729\3\2"+
		"\2\2\u072b\u072c\3\2\2\2\u072c\u0143\3\2\2\2\u072d\u072b\3\2\2\2\u072e"+
		"\u0735\5\u0146\u00a4\2\u072f\u0731\7W\2\2\u0730\u0732\5$\23\2\u0731\u0730"+
		"\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0736\7X\2\2\u0734"+
		"\u0736\5\u0112\u008a\2\u0735\u072f\3\2\2\2\u0735\u0734\3\2\2\2\u0736\u0145"+
		"\3\2\2\2\u0737\u073a\5\u0134\u009b\2\u0738\u073a\7\u0086\2\2\u0739\u0737"+
		"\3\2\2\2\u0739\u0738\3\2\2\2\u073a\u0147\3\2\2\2\u073b\u073c\7\66\2\2"+
		"\u073c\u073d\5\u0178\u00bd\2\u073d\u0149\3\2\2\2\u073e\u0742\7\66\2\2"+
		"\u073f\u0740\7\6\2\2\u0740\u0743\7\u0086\2\2\u0741\u0743\7\u008e\2\2\u0742"+
		"\u073f\3\2\2\2\u0742\u0741\3\2\2\2\u0743\u014b\3\2\2\2\u0744\u0745\7F"+
		"\2\2\u0745\u0746\7h\2\2\u0746\u0747\5\u014e\u00a8\2\u0747\u0748\7i\2\2"+
		"\u0748\u0749\5|?\2\u0749\u014d\3\2\2\2\u074a\u074f\5\u0150\u00a9\2\u074b"+
		"\u074c\7|\2\2\u074c\u074e\5\u0150\u00a9\2\u074d\u074b\3\2\2\2\u074e\u0751"+
		"\3\2\2\2\u074f\u074d\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u014f\3\2\2\2\u0751"+
		"\u074f\3\2\2\2\u0752\u0755\5\u0152\u00aa\2\u0753\u0755\5\u0104\u0083\2"+
		"\u0754\u0752\3\2\2\2\u0754\u0753\3\2\2\2\u0755\u0151\3\2\2\2\u0756\u0757"+
		"\7F\2\2\u0757\u0758\7h\2\2\u0758\u0759\5\u014e\u00a8\2\u0759\u075a\7i"+
		"\2\2\u075a\u075c\3\2\2\2\u075b\u0756\3\2\2\2\u075b\u075c\3\2\2\2\u075c"+
		"\u075d\3\2\2\2\u075d\u0760\7\27\2\2\u075e\u0760\7N\2\2\u075f\u075b\3\2"+
		"\2\2\u075f\u075e\3\2\2\2\u0760\u076c\3\2\2\2\u0761\u0763\7\u0085\2\2\u0762"+
		"\u0761\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0765\3\2\2\2\u0764\u0766\7\u0086"+
		"\2\2\u0765\u0764\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u076d\3\2\2\2\u0767"+
		"\u0769\7\u0086\2\2\u0768\u0767\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u076a"+
		"\3\2\2\2\u076a\u076b\7g\2\2\u076b\u076d\5\u00f4{\2\u076c\u0762\3\2\2\2"+
		"\u076c\u0768\3\2\2\2\u076d\u0153\3\2\2\2\u076e\u076f\5\u0158\u00ad\2\u076f"+
		"\u0771\7h\2\2\u0770\u0772\5\u015a\u00ae\2\u0771\u0770\3\2\2\2\u0771\u0772"+
		"\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0774\7i\2\2\u0774\u0155\3\2\2\2\u0775"+
		"\u0781\5\u0154\u00ab\2\u0776\u0779\5\u0148\u00a5\2\u0777\u0779\5\u014a"+
		"\u00a6\2\u0778\u0776\3\2\2\2\u0778\u0777\3\2\2\2\u0779\u077a\3\2\2\2\u077a"+
		"\u077c\7h\2\2\u077b\u077d\5\u015a\u00ae\2\u077c\u077b\3\2\2\2\u077c\u077d"+
		"\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u077f\7i\2\2\u077f\u0781\3\2\2\2\u0780"+
		"\u0775\3\2\2\2\u0780\u0778\3\2\2\2\u0781\u0157\3\2\2\2\u0782\u0783\7\u0086"+
		"\2\2\u0783\u0159\3\2\2\2\u0784\u0786\5\u015c\u00af\2\u0785\u0787\7\u0085"+
		"\2\2\u0786\u0785\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u078f\3\2\2\2\u0788"+
		"\u0789\7|\2\2\u0789\u078b\5\u015c\u00af\2\u078a\u078c\7\u0085\2\2\u078b"+
		"\u078a\3\2\2\2\u078b\u078c\3\2\2\2\u078c\u078e\3\2\2\2\u078d\u0788\3\2"+
		"\2\2\u078e\u0791\3\2\2\2\u078f\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790"+
		"\u015b\3\2\2\2\u0791\u078f\3\2\2\2\u0792\u0796\5\u00f4{\2\u0793\u0796"+
		"\5^\60\2\u0794\u0796\5\6\4\2\u0795\u0792\3\2\2\2\u0795\u0793\3\2\2\2\u0795"+
		"\u0794\3\2\2\2\u0796\u015d\3\2\2\2\u0797\u0798\7N\2\2\u0798\u079e\5\f"+
		"\7\2\u0799\u079f\7\u0086\2\2\u079a\u079c\7F\2\2\u079b\u079a\3\2\2\2\u079b"+
		"\u079c\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079f\5\u0154\u00ab\2\u079e\u0799"+
		"\3\2\2\2\u079e\u079b\3\2\2\2\u079f\u015f\3\2\2\2\u07a0\u07a2\7&\2\2\u07a1"+
		"\u07a0\3\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07a4\7F"+
		"\2\2\u07a4\u07a5\5|?\2\u07a5\u0161\3\2\2\2\u07a6\u07a7\7F\2\2\u07a7\u07a8"+
		"\7h\2\2\u07a8\u07a9\7i\2\2\u07a9\u07aa\5|?\2\u07aa\u0163\3\2\2\2\u07ab"+
		"\u07ac\7K\2\2\u07ac\u07ad\5f\64\2\u07ad\u07ae\5\u0168\u00b5\2\u07ae\u0165"+
		"\3\2\2\2\u07af\u07b1\7K\2\2\u07b0\u07b2\5\u0140\u00a1\2\u07b1\u07b0\3"+
		"\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b4\5f\64\2\u07b4"+
		"\u07b5\5\u0168\u00b5\2\u07b5\u0167\3\2\2\2\u07b6\u07b8\5\u016a\u00b6\2"+
		"\u07b7\u07b6\3\2\2\2\u07b8\u07b9\3\2\2\2\u07b9\u07b7\3\2\2\2\u07b9\u07ba"+
		"\3\2\2\2\u07ba\u0169\3\2\2\2\u07bb\u07bc\7\23\2\2\u07bc\u07bd\7W\2\2\u07bd"+
		"\u07be\5\u016c\u00b7\2\u07be\u07bf\7X\2\2\u07bf\u07c0\5f\64\2\u07c0\u016b"+
		"\3\2\2\2\u07c1\u07c3\5\u00caf\2\u07c2\u07c1\3\2\2\2\u07c2\u07c3\3\2\2"+
		"\2\u07c3\u07c4\3\2\2\2\u07c4\u07c7\5\u0098M\2\u07c5\u07c8\5\u00e0q\2\u07c6"+
		"\u07c8\5\u00f6|\2\u07c7\u07c5\3\2\2\2\u07c7\u07c6\3\2\2\2\u07c7\u07c8"+
		"\3\2\2\2\u07c8\u07cb\3\2\2\2\u07c9\u07cb\7\u0085\2\2\u07ca\u07c2\3\2\2"+
		"\2\u07ca\u07c9\3\2\2\2\u07cb\u016d\3\2\2\2\u07cc\u07ce\7I\2\2\u07cd\u07cf"+
		"\5X-\2\u07ce\u07cd\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u016f\3\2\2\2\u07d0"+
		"\u07d3\5\u0172\u00ba\2\u07d1\u07d3\5\u0176\u00bc\2\u07d2\u07d0\3\2\2\2"+
		"\u07d2\u07d1\3\2\2\2\u07d3\u0171\3\2\2\2\u07d4\u07d5\7I\2\2\u07d5\u07d7"+
		"\7W\2\2\u07d6\u07d8\5\u0174\u00bb\2\u07d7\u07d6\3\2\2\2\u07d7\u07d8\3"+
		"\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07da\7X\2\2\u07da\u0173\3\2\2\2\u07db"+
		"\u07dd\5\u00f4{\2\u07dc\u07de\7\u0085\2\2\u07dd\u07dc\3\2\2\2\u07dd\u07de"+
		"\3\2\2\2\u07de\u07e6\3\2\2\2\u07df\u07e0\7|\2\2\u07e0\u07e2\5\u00f4{\2"+
		"\u07e1\u07e3\7\u0085\2\2\u07e2\u07e1\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3"+
		"\u07e5\3\2\2\2\u07e4\u07df\3\2\2\2\u07e5\u07e8\3\2\2\2\u07e6\u07e4\3\2"+
		"\2\2\u07e6\u07e7\3\2\2\2\u07e7\u0175\3\2\2\2\u07e8\u07e6\3\2\2\2\u07e9"+
		"\u07ea\7\64\2\2\u07ea\u07eb\7W\2\2\u07eb\u07ec\5^\60\2\u07ec\u07ed\7X"+
		"\2\2\u07ed\u07f0\3\2\2\2\u07ee\u07f0\7\64\2\2\u07ef\u07e9\3\2\2\2\u07ef"+
		"\u07ee\3\2\2\2\u07f0\u0177\3\2\2\2\u07f1\u07f4\7\63\2\2\u07f2\u07f3\7"+
		"Y\2\2\u07f3\u07f5\7Z\2\2\u07f4\u07f2\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5"+
		"\u0827\3\2\2\2\u07f6\u07f9\7\36\2\2\u07f7\u07f8\7Y\2\2\u07f8\u07fa\7Z"+
		"\2\2\u07f9\u07f7\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u0827\3\2\2\2\u07fb"+
		"\u0827\7]\2\2\u07fc\u0827\7^\2\2\u07fd\u0827\7_\2\2\u07fe\u0827\7`\2\2"+
		"\u07ff\u0827\7a\2\2\u0800\u0827\7b\2\2\u0801\u0827\7c\2\2\u0802\u0827"+
		"\7d\2\2\u0803\u0827\7e\2\2\u0804\u0827\7f\2\2\u0805\u0827\7g\2\2\u0806"+
		"\u0827\7i\2\2\u0807\u0827\7h\2\2\u0808\u0827\7w\2\2\u0809\u0827\7j\2\2"+
		"\u080a\u0827\7k\2\2\u080b\u0827\7l\2\2\u080c\u0827\7g\2\2\u080d\u0827"+
		"\7n\2\2\u080e\u0827\7o\2\2\u080f\u0827\7p\2\2\u0810\u0827\7q\2\2\u0811"+
		"\u0812\7h\2\2\u0812\u0827\7h\2\2\u0813\u0814\7i\2\2\u0814\u0827\7i\2\2"+
		"\u0815\u0827\7s\2\2\u0816\u0827\7r\2\2\u0817\u0827\7t\2\2\u0818\u0827"+
		"\7u\2\2\u0819\u0827\7v\2\2\u081a\u0827\7w\2\2\u081b\u0827\7x\2\2\u081c"+
		"\u0827\7y\2\2\u081d\u0827\7z\2\2\u081e\u0827\7{\2\2\u081f\u0827\7|\2\2"+
		"\u0820\u0827\7}\2\2\u0821\u0827\7~\2\2\u0822\u0823\7W\2\2\u0823\u0827"+
		"\7X\2\2\u0824\u0825\7Y\2\2\u0825\u0827\7Z\2\2\u0826\u07f1\3\2\2\2\u0826"+
		"\u07f6\3\2\2\2\u0826\u07fb\3\2\2\2\u0826\u07fc\3\2\2\2\u0826\u07fd\3\2"+
		"\2\2\u0826\u07fe\3\2\2\2\u0826\u07ff\3\2\2\2\u0826\u0800\3\2\2\2\u0826"+
		"\u0801\3\2\2\2\u0826\u0802\3\2\2\2\u0826\u0803\3\2\2\2\u0826\u0804\3\2"+
		"\2\2\u0826\u0805\3\2\2\2\u0826\u0806\3\2\2\2\u0826\u0807\3\2\2\2\u0826"+
		"\u0808\3\2\2\2\u0826\u0809\3\2\2\2\u0826\u080a\3\2\2\2\u0826\u080b\3\2"+
		"\2\2\u0826\u080c\3\2\2\2\u0826\u080d\3\2\2\2\u0826\u080e\3\2\2\2\u0826"+
		"\u080f\3\2\2\2\u0826\u0810\3\2\2\2\u0826\u0811\3\2\2\2\u0826\u0813\3\2"+
		"\2\2\u0826\u0815\3\2\2\2\u0826\u0816\3\2\2\2\u0826\u0817\3\2\2\2\u0826"+
		"\u0818\3\2\2\2\u0826\u0819\3\2\2\2\u0826\u081a\3\2\2\2\u0826\u081b\3\2"+
		"\2\2\u0826\u081c\3\2\2\2\u0826\u081d\3\2\2\2\u0826\u081e\3\2\2\2\u0826"+
		"\u081f\3\2\2\2\u0826\u0820\3\2\2\2\u0826\u0821\3\2\2\2\u0826\u0822\3\2"+
		"\2\2\u0826\u0824\3\2\2\2\u0827\u0179\3\2\2\2\u0828\u0829\t\26\2\2\u0829"+
		"\u017b\3\2\2\2\u012e\u017d\u0184\u018d\u0191\u019a\u019d\u01a1\u01a9\u01b0"+
		"\u01b3\u01b8\u01bd\u01c3\u01cb\u01cd\u01d6\u01da\u01de\u01e1\u01e5\u01e8"+
		"\u01ef\u01f3\u01f6\u01f9\u01fc\u0202\u0206\u020a\u0218\u021c\u0222\u0229"+
		"\u022f\u0233\u0235\u0237\u023f\u0244\u0251\u0258\u0264\u026e\u0273\u0277"+
		"\u027e\u0281\u0289\u028d\u0290\u0297\u029e\u02a2\u02a7\u02ab\u02ae\u02b3"+
		"\u02c2\u02c9\u02d1\u02d9\u02e2\u02e5\u02ed\u02f4\u02fb\u0303\u0309\u0310"+
		"\u0318\u0320\u0328\u0330\u0339\u0341\u034a\u0351\u0359\u035c\u035f\u0365"+
		"\u036b\u0371\u0378\u0381\u0389\u038d\u0394\u0396\u03aa\u03ae\u03b4\u03b9"+
		"\u03bd\u03c0\u03c7\u03ce\u03d2\u03db\u03e6\u03f0\u03f5\u03fc\u03ff\u0404"+
		"\u0409\u041e\u0423\u0426\u0431\u0437\u043c\u043f\u0444\u0447\u044a\u0460"+
		"\u0466\u046c\u0472\u0475\u047b\u047f\u0483\u0486\u048e\u0490\u0496\u0499"+
		"\u049c\u049f\u04a3\u04a7\u04ad\u04b7\u04bd\u04c3\u04c8\u04cd\u04d1\u04de"+
		"\u04e4\u04e8\u04ee\u04f3\u0502\u0506\u050b\u0510\u0515\u051b\u051e\u0527"+
		"\u052b\u0530\u0534\u053a\u0541\u0552\u0554\u055b\u0560\u0567\u056b\u056f"+
		"\u0577\u057d\u0583\u0587\u0589\u058d\u0592\u0596\u0599\u059c\u059f\u05a4"+
		"\u05a8\u05ab\u05af\u05b2\u05b4\u05b9\u05c0\u05c6\u05ca\u05d0\u05d6\u05d9"+
		"\u05db\u05e1\u05e5\u05eb\u05f2\u05f6\u05f8\u05fc\u0602\u060e\u0612\u0614"+
		"\u0618\u061d\u0620\u0627\u062b\u0630\u0632\u0636\u0639\u063c\u0640\u0645"+
		"\u064c\u0653\u0658\u065c\u0660\u0665\u0669\u066f\u0671\u0677\u067c\u0682"+
		"\u0686\u0688\u068b\u068f\u0693\u0695\u0697\u069a\u06a6\u06a8\u06ab\u06ae"+
		"\u06b1\u06ba\u06c1\u06c6\u06c9\u06cc\u06ce\u06d1\u06d4\u06d8\u06dd\u06ea"+
		"\u06ef\u06f3\u06f7\u06fc\u0701\u0705\u0708\u070c\u0717\u071b\u0722\u0727"+
		"\u072b\u0731\u0735\u0739\u0742\u074f\u0754\u075b\u075f\u0762\u0765\u0768"+
		"\u076c\u0771\u0778\u077c\u0780\u0786\u078b\u078f\u0795\u079b\u079e\u07a1"+
		"\u07b1\u07b9\u07c2\u07c7\u07ca\u07ce\u07d2\u07d7\u07dd\u07e2\u07e6\u07ef"+
		"\u07f4\u07f9\u0826";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}