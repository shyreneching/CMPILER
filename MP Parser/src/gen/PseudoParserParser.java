// Generated from C:/Users/erwin/Desktop/CMPILER/MP-Parser/MP Parser/src\PseudoParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudoParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, CharacterLiteral=2, FloatingLiteral=3, StringLiteral=4, 
		BooleanLiteral=5, PointerLiteral=6, UserDefinedLiteral=7, MultiLineMacro=8, 
		Directive=9, Func=10, Main=11, Alignas=12, Alignof=13, Asm=14, Auto=15, 
		Bool=16, Break=17, Case=18, Catch=19, Char=20, Char16=21, Char32=22, Class=23, 
		Const=24, Constexpr=25, Const_cast=26, Continue=27, Decltype=28, Default=29, 
		Delete=30, Do=31, Double=32, Dynamic_cast=33, Else=34, Enum=35, Explicit=36, 
		Export=37, Extern=38, False_=39, Final=40, Float=41, For=42, Friend=43, 
		Goto=44, If=45, Inline=46, Int=47, Long=48, Mutable=49, Namespace=50, 
		New=51, Noexcept=52, Nullptr=53, Operator=54, Override=55, Private=56, 
		Protected=57, Public=58, Register=59, Reinterpret_cast=60, Return=61, 
		Short=62, Signed=63, Sizeof=64, Static=65, Static_assert=66, Static_cast=67, 
		Struct=68, Switch=69, Template=70, This=71, Thread_local=72, Throw=73, 
		True_=74, Try=75, Typedef=76, Typeid_=77, Typename_=78, Union=79, Unsigned=80, 
		Using=81, Virtual=82, Void=83, Volatile=84, Wchar=85, While=86, LeftParen=87, 
		RightParen=88, LeftBracket=89, RightBracket=90, LeftBrace=91, RightBrace=92, 
		Plus=93, Minus=94, Star=95, Div=96, Mod=97, Caret=98, And=99, Or=100, 
		Tilde=101, Not=102, Assign=103, Less=104, Greater=105, PlusAssign=106, 
		MinusAssign=107, StarAssign=108, DivAssign=109, ModAssign=110, XorAssign=111, 
		AndAssign=112, OrAssign=113, LeftShiftAssign=114, RightShiftAssign=115, 
		Equal=116, NotEqual=117, LessEqual=118, GreaterEqual=119, AndAnd=120, 
		OrOr=121, PlusPlus=122, MinusMinus=123, Comma=124, ArrowStar=125, Arrow=126, 
		Question=127, Colon=128, Doublecolon=129, Semi=130, Dot=131, DotStar=132, 
		Ellipsis=133, Identifier=134, DecimalLiteral=135, OctalLiteral=136, HexadecimalLiteral=137, 
		BinaryLiteral=138, Integersuffix=139, UserDefinedIntegerLiteral=140, UserDefinedFloatingLiteral=141, 
		UserDefinedStringLiteral=142, UserDefinedCharacterLiteral=143, Whitespace=144, 
		Newline=145, BlockComment=146, LineComment=147;
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
		RULE_parameterDeclaration = 129, RULE_functionDefinition = 130, RULE_mainDefinition = 131, 
		RULE_functionBody = 132, RULE_initializer = 133, RULE_braceOrEqualInitializer = 134, 
		RULE_initializerClause = 135, RULE_initializerList = 136, RULE_bracedInitList = 137, 
		RULE_className = 138, RULE_classSpecifier = 139, RULE_classHead = 140, 
		RULE_classHeadName = 141, RULE_classVirtSpecifier = 142, RULE_classKey = 143, 
		RULE_memberSpecification = 144, RULE_memberdeclaration = 145, RULE_memberDeclaratorList = 146, 
		RULE_memberDeclarator = 147, RULE_virtualSpecifierSeq = 148, RULE_virtualSpecifier = 149, 
		RULE_pureSpecifier = 150, RULE_baseClause = 151, RULE_baseSpecifierList = 152, 
		RULE_baseSpecifier = 153, RULE_classOrDeclType = 154, RULE_baseTypeSpecifier = 155, 
		RULE_accessSpecifier = 156, RULE_conversionFunctionId = 157, RULE_conversionTypeId = 158, 
		RULE_conversionDeclarator = 159, RULE_constructorInitializer = 160, RULE_memInitializerList = 161, 
		RULE_memInitializer = 162, RULE_meminitializerid = 163, RULE_operatorFunctionId = 164, 
		RULE_literalOperatorId = 165, RULE_templateDeclaration = 166, RULE_templateparameterList = 167, 
		RULE_templateParameter = 168, RULE_typeParameter = 169, RULE_simpleTemplateId = 170, 
		RULE_templateId = 171, RULE_templateName = 172, RULE_templateArgumentList = 173, 
		RULE_templateArgument = 174, RULE_typeNameSpecifier = 175, RULE_explicitInstantiation = 176, 
		RULE_explicitSpecialization = 177, RULE_tryBlock = 178, RULE_functionTryBlock = 179, 
		RULE_handlerSeq = 180, RULE_handler = 181, RULE_exceptionDeclaration = 182, 
		RULE_throwExpression = 183, RULE_exceptionSpecification = 184, RULE_dynamicExceptionSpecification = 185, 
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
			"functionDefinition", "mainDefinition", "functionBody", "initializer", 
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
			null, null, null, null, null, null, null, null, null, null, "'func'", 
			"'main'", "'alignas'", "'alignof'", "'asm'", "'auto'", "'bool'", "'break'", 
			"'case'", "'catch'", "'char'", "'char16_t'", "'char32_t'", "'class'", 
			"'const'", "'constexpr'", "'const_cast'", "'continue'", "'decltype'", 
			"'default'", "'delete'", "'do'", "'double'", "'dynamic_cast'", "'else'", 
			"'enum'", "'explicit'", "'export'", "'extern'", "'false'", "'final'", 
			"'float'", "'for'", "'friend'", "'goto'", "'if'", "'inline'", "'int'", 
			"'long'", "'mutable'", "'namespace'", "'new'", "'noexcept'", "'nullptr'", 
			"'operator'", "'override'", "'private'", "'protected'", "'public'", "'register'", 
			"'reinterpret_cast'", "'return'", "'short'", "'signed'", "'sizeof'", 
			"'static'", "'static_assert'", "'static_cast'", "'struct'", "'switch'", 
			"'template'", "'this'", "'thread_local'", "'throw'", "'true'", "'try'", 
			"'typedef'", "'typeid'", "'typename'", "'union'", "'unsigned'", "'using'", 
			"'virtual'", "'void'", "'volatile'", "'wchar_t'", "'while'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", 
			"'&'", "'|'", "'~'", null, "'='", "'<'", "'>'", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'^='", "'&='", "'|='", "'<<='", "'>>='", "'=='", "'!='", 
			"'<='", "'>='", null, null, "'++'", "'--'", "','", "'->*'", "'->'", "'?'", 
			"':'", "'::'", "';'", "'.'", "'.*'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "CharacterLiteral", "FloatingLiteral", "StringLiteral", 
			"BooleanLiteral", "PointerLiteral", "UserDefinedLiteral", "MultiLineMacro", 
			"Directive", "Func", "Main", "Alignas", "Alignof", "Asm", "Auto", "Bool", 
			"Break", "Case", "Catch", "Char", "Char16", "Char32", "Class", "Const", 
			"Constexpr", "Const_cast", "Continue", "Decltype", "Default", "Delete", 
			"Do", "Double", "Dynamic_cast", "Else", "Enum", "Explicit", "Export", 
			"Extern", "False_", "Final", "Float", "For", "Friend", "Goto", "If", 
			"Inline", "Int", "Long", "Mutable", "Namespace", "New", "Noexcept", "Nullptr", 
			"Operator", "Override", "Private", "Protected", "Public", "Register", 
			"Reinterpret_cast", "Return", "Short", "Signed", "Sizeof", "Static", 
			"Static_assert", "Static_cast", "Struct", "Switch", "Template", "This", 
			"Thread_local", "Throw", "True_", "Try", "Typedef", "Typeid_", "Typename_", 
			"Union", "Unsigned", "Using", "Virtual", "Void", "Volatile", "Wchar", 
			"While", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Caret", "And", 
			"Or", "Tilde", "Not", "Assign", "Less", "Greater", "PlusAssign", "MinusAssign", 
			"StarAssign", "DivAssign", "ModAssign", "XorAssign", "AndAssign", "OrAssign", 
			"LeftShiftAssign", "RightShiftAssign", "Equal", "NotEqual", "LessEqual", 
			"GreaterEqual", "AndAnd", "OrOr", "PlusPlus", "MinusMinus", "Comma", 
			"ArrowStar", "Arrow", "Question", "Colon", "Doublecolon", "Semi", "Dot", 
			"DotStar", "Ellipsis", "Identifier", "DecimalLiteral", "OctalLiteral", 
			"HexadecimalLiteral", "BinaryLiteral", "Integersuffix", "UserDefinedIntegerLiteral", 
			"UserDefinedFloatingLiteral", "UserDefinedStringLiteral", "UserDefinedCharacterLiteral", 
			"Whitespace", "Newline", "BlockComment", "LineComment"
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

	public PseudoParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PseudoParserParser.EOF, 0); }
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
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Func || _la==Main) {
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
		public TerminalNode This() { return getToken(PseudoParserParser.This, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
		public OperatorFunctionIdContext operatorFunctionId() {
			return getRuleContext(OperatorFunctionIdContext.class,0);
		}
		public ConversionFunctionIdContext conversionFunctionId() {
			return getRuleContext(ConversionFunctionIdContext.class,0);
		}
		public LiteralOperatorIdContext literalOperatorId() {
			return getRuleContext(LiteralOperatorIdContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(PseudoParserParser.Tilde, 0); }
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
		public TerminalNode Template() { return getToken(PseudoParserParser.Template, 0); }
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
		public TerminalNode Doublecolon() { return getToken(PseudoParserParser.Doublecolon, 0); }
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoParserParser.Template, 0); }
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
		public TerminalNode LeftBracket() { return getToken(PseudoParserParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoParserParser.RightBracket, 0); }
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
			setState(449);
			match(LeftBracket);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (This - 71)) | (1L << (And - 71)) | (1L << (Assign - 71)) | (1L << (Identifier - 71)))) != 0)) {
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
		public TerminalNode Comma() { return getToken(PseudoParserParser.Comma, 0); }
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
		public TerminalNode And() { return getToken(PseudoParserParser.And, 0); }
		public TerminalNode Assign() { return getToken(PseudoParserParser.Assign, 0); }
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParserParser.Comma, i);
		}
		public TerminalNode Ellipsis() { return getToken(PseudoParserParser.Ellipsis, 0); }
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
		public TerminalNode And() { return getToken(PseudoParserParser.And, 0); }
		public TerminalNode This() { return getToken(PseudoParserParser.This, 0); }
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode And() { return getToken(PseudoParserParser.And, 0); }
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
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
		public ParameterDeclarationClauseContext parameterDeclarationClause() {
			return getRuleContext(ParameterDeclarationClauseContext.class,0);
		}
		public TerminalNode Mutable() { return getToken(PseudoParserParser.Mutable, 0); }
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
			setState(493);
			match(LeftParen);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (Alignas - 12)) | (1L << (Auto - 12)) | (1L << (Bool - 12)) | (1L << (Char - 12)) | (1L << (Char16 - 12)) | (1L << (Char32 - 12)) | (1L << (Class - 12)) | (1L << (Const - 12)) | (1L << (Constexpr - 12)) | (1L << (Decltype - 12)) | (1L << (Double - 12)) | (1L << (Enum - 12)) | (1L << (Explicit - 12)) | (1L << (Extern - 12)) | (1L << (Float - 12)) | (1L << (Friend - 12)) | (1L << (Inline - 12)) | (1L << (Int - 12)) | (1L << (Long - 12)) | (1L << (Mutable - 12)) | (1L << (Register - 12)) | (1L << (Short - 12)) | (1L << (Signed - 12)) | (1L << (Static - 12)) | (1L << (Struct - 12)) | (1L << (Thread_local - 12)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Typedef - 76)) | (1L << (Typename_ - 76)) | (1L << (Union - 76)) | (1L << (Unsigned - 76)) | (1L << (Virtual - 76)) | (1L << (Void - 76)) | (1L << (Volatile - 76)) | (1L << (Wchar - 76)) | (1L << (LeftBracket - 76)) | (1L << (Doublecolon - 76)) | (1L << (Identifier - 76)))) != 0)) {
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
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
		public BracedInitListContext bracedInitList() {
			return getRuleContext(BracedInitListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Less() { return getToken(PseudoParserParser.Less, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Greater() { return getToken(PseudoParserParser.Greater, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dynamic_cast() { return getToken(PseudoParserParser.Dynamic_cast, 0); }
		public TerminalNode Static_cast() { return getToken(PseudoParserParser.Static_cast, 0); }
		public TerminalNode Reinterpret_cast() { return getToken(PseudoParserParser.Reinterpret_cast, 0); }
		public TerminalNode Const_cast() { return getToken(PseudoParserParser.Const_cast, 0); }
		public TypeIdOfTheTypeIdContext typeIdOfTheTypeId() {
			return getRuleContext(TypeIdOfTheTypeIdContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PseudoParserParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoParserParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(PseudoParserParser.Dot, 0); }
		public TerminalNode Arrow() { return getToken(PseudoParserParser.Arrow, 0); }
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public PseudoDestructorNameContext pseudoDestructorName() {
			return getRuleContext(PseudoDestructorNameContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoParserParser.Template, 0); }
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
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
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
				setState(522);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
					{
					setState(516);
					match(LeftParen);
					setState(518);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(517);
						expressionList();
						}
						break;
					}
					setState(520);
					match(RightParen);
					}
					break;
				case LeftBrace:
					{
					setState(521);
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
				setState(524);
				_la = _input.LA(1);
				if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (Const_cast - 26)) | (1L << (Dynamic_cast - 26)) | (1L << (Reinterpret_cast - 26)) | (1L << (Static_cast - 26)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(525);
				match(Less);
				setState(526);
				theTypeId();
				setState(527);
				match(Greater);
				setState(528);
				match(LeftParen);
				setState(529);
				expression();
				setState(530);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(532);
				typeIdOfTheTypeId();
				setState(533);
				match(LeftParen);
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(534);
					expression();
					}
					break;
				case 2:
					{
					setState(535);
					theTypeId();
					}
					break;
				}
				setState(538);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(565);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(542);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(543);
						match(LeftBracket);
						setState(546);
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
							setState(544);
							expression();
							}
							break;
						case LeftBrace:
							{
							setState(545);
							bracedInitList();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(548);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(550);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(551);
						match(LeftParen);
						setState(553);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(552);
							expressionList();
							}
							break;
						}
						setState(555);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(556);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(557);
						_la = _input.LA(1);
						if ( !(_la==Arrow || _la==Dot) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(563);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(559);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==Template) {
								{
								setState(558);
								match(Template);
								}
							}

							setState(561);
							idExpression();
							}
							break;
						case 2:
							{
							setState(562);
							pseudoDestructorName();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(569);
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
		public TerminalNode Typeid_() { return getToken(PseudoParserParser.Typeid_, 0); }
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
			setState(570);
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
			setState(572);
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
		public TerminalNode Tilde() { return getToken(PseudoParserParser.Tilde, 0); }
		public List<TheTypeNameContext> theTypeName() {
			return getRuleContexts(TheTypeNameContext.class);
		}
		public TheTypeNameContext theTypeName(int i) {
			return getRuleContext(TheTypeNameContext.class,i);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(PseudoParserParser.Doublecolon, 0); }
		public TerminalNode Template() { return getToken(PseudoParserParser.Template, 0); }
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
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(574);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(577);
					theTypeName();
					setState(578);
					match(Doublecolon);
					}
				}

				setState(582);
				match(Tilde);
				setState(583);
				theTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				nestedNameSpecifier(0);
				setState(585);
				match(Template);
				setState(586);
				simpleTemplateId();
				setState(587);
				match(Doublecolon);
				setState(588);
				match(Tilde);
				setState(589);
				theTypeName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				match(Tilde);
				setState(592);
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
		public TerminalNode PlusPlus() { return getToken(PseudoParserParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(PseudoParserParser.MinusMinus, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(PseudoParserParser.Sizeof, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
		public TerminalNode Ellipsis() { return getToken(PseudoParserParser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
		public TerminalNode Alignof() { return getToken(PseudoParserParser.Alignof, 0); }
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
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PlusPlus:
					{
					setState(596);
					match(PlusPlus);
					}
					break;
				case MinusMinus:
					{
					setState(597);
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
					setState(598);
					unaryOperator();
					}
					break;
				case Sizeof:
					{
					setState(599);
					match(Sizeof);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(602);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				match(Sizeof);
				setState(612);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
					{
					setState(604);
					match(LeftParen);
					setState(605);
					theTypeId();
					setState(606);
					match(RightParen);
					}
					break;
				case Ellipsis:
					{
					setState(608);
					match(Ellipsis);
					setState(609);
					match(LeftParen);
					setState(610);
					match(Identifier);
					setState(611);
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
				setState(614);
				match(Alignof);
				setState(615);
				match(LeftParen);
				setState(616);
				theTypeId();
				setState(617);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(619);
				noExceptExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(620);
				newExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(621);
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
		public TerminalNode Or() { return getToken(PseudoParserParser.Or, 0); }
		public TerminalNode Star() { return getToken(PseudoParserParser.Star, 0); }
		public TerminalNode And() { return getToken(PseudoParserParser.And, 0); }
		public TerminalNode Plus() { return getToken(PseudoParserParser.Plus, 0); }
		public TerminalNode Tilde() { return getToken(PseudoParserParser.Tilde, 0); }
		public TerminalNode Minus() { return getToken(PseudoParserParser.Minus, 0); }
		public TerminalNode Not() { return getToken(PseudoParserParser.Not, 0); }
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
			setState(624);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Plus - 93)) | (1L << (Minus - 93)) | (1L << (Star - 93)) | (1L << (And - 93)) | (1L << (Or - 93)) | (1L << (Tilde - 93)) | (1L << (Not - 93)))) != 0)) ) {
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
		public TerminalNode New() { return getToken(PseudoParserParser.New, 0); }
		public NewTypeIdContext newTypeId() {
			return getRuleContext(NewTypeIdContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(PseudoParserParser.Doublecolon, 0); }
		public NewPlacementContext newPlacement() {
			return getRuleContext(NewPlacementContext.class,0);
		}
		public NewInitializerContext newInitializer() {
			return getRuleContext(NewInitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
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
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doublecolon) {
				{
				setState(626);
				match(Doublecolon);
				}
			}

			setState(629);
			match(New);
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(630);
				newPlacement();
				}
				break;
			}
			setState(638);
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
				setState(633);
				newTypeId();
				}
				break;
			case LeftParen:
				{
				{
				setState(634);
				match(LeftParen);
				setState(635);
				theTypeId();
				setState(636);
				match(RightParen);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen || _la==LeftBrace) {
				{
				setState(640);
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
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
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
			setState(643);
			match(LeftParen);
			setState(644);
			expressionList();
			setState(645);
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
			setState(647);
			typeSpecifierSeq();
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(648);
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
			setState(656);
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
				setState(651);
				pointerOperator();
				setState(653);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(652);
					newDeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(655);
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
		public TerminalNode LeftBracket() { return getToken(PseudoParserParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(PseudoParserParser.RightBracket, 0); }
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
			setState(659);
			match(LeftBracket);
			setState(660);
			expression();
			setState(661);
			match(RightBracket);
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(662);
				attributeSpecifierSeq();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(674);
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
					setState(665);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(666);
					match(LeftBracket);
					setState(667);
					constantExpression();
					setState(668);
					match(RightBracket);
					setState(670);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(669);
						attributeSpecifierSeq();
						}
						break;
					}
					}
					} 
				}
				setState(676);
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
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
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
			setState(683);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				match(LeftParen);
				setState(679);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(678);
					expressionList();
					}
					break;
				}
				setState(681);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
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
		public TerminalNode Delete() { return getToken(PseudoParserParser.Delete, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(PseudoParserParser.Doublecolon, 0); }
		public TerminalNode LeftBracket() { return getToken(PseudoParserParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoParserParser.RightBracket, 0); }
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
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Doublecolon) {
				{
				setState(685);
				match(Doublecolon);
				}
			}

			setState(688);
			match(Delete);
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(689);
				match(LeftBracket);
				setState(690);
				match(RightBracket);
				}
				break;
			}
			setState(693);
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
		public TerminalNode Noexcept() { return getToken(PseudoParserParser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
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
			setState(695);
			match(Noexcept);
			setState(696);
			match(LeftParen);
			setState(697);
			expression();
			setState(698);
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
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
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
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				match(LeftParen);
				setState(702);
				theTypeId();
				setState(703);
				match(RightParen);
				setState(704);
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
		public List<TerminalNode> DotStar() { return getTokens(PseudoParserParser.DotStar); }
		public TerminalNode DotStar(int i) {
			return getToken(PseudoParserParser.DotStar, i);
		}
		public List<TerminalNode> ArrowStar() { return getTokens(PseudoParserParser.ArrowStar); }
		public TerminalNode ArrowStar(int i) {
			return getToken(PseudoParserParser.ArrowStar, i);
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
			setState(708);
			castExpression();
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ArrowStar || _la==DotStar) {
				{
				{
				setState(709);
				_la = _input.LA(1);
				if ( !(_la==ArrowStar || _la==DotStar) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(710);
				castExpression();
				}
				}
				setState(715);
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
		public List<TerminalNode> Star() { return getTokens(PseudoParserParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(PseudoParserParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(PseudoParserParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(PseudoParserParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(PseudoParserParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(PseudoParserParser.Mod, i);
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
			setState(716);
			pointerMemberExpression();
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Star - 95)) | (1L << (Div - 95)) | (1L << (Mod - 95)))) != 0)) {
				{
				{
				setState(717);
				_la = _input.LA(1);
				if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Star - 95)) | (1L << (Div - 95)) | (1L << (Mod - 95)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(718);
				pointerMemberExpression();
				}
				}
				setState(723);
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
		public List<TerminalNode> Plus() { return getTokens(PseudoParserParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(PseudoParserParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(PseudoParserParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(PseudoParserParser.Minus, i);
		}
		public List<TerminalNode> PlusPlus() { return getTokens(PseudoParserParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(PseudoParserParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(PseudoParserParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(PseudoParserParser.MinusMinus, i);
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
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				multiplicativeExpression();
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Plus || _la==Minus) {
					{
					{
					setState(725);
					_la = _input.LA(1);
					if ( !(_la==Plus || _la==Minus) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(726);
					multiplicativeExpression();
					}
					}
					setState(731);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PlusPlus || _la==MinusMinus) {
					{
					{
					setState(732);
					_la = _input.LA(1);
					if ( !(_la==PlusPlus || _la==MinusMinus) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(733);
					multiplicativeExpression();
					notifyErrorListeners("redundant operator symbol");
					}
					}
					setState(740);
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
			setState(743);
			additiveExpression();
			setState(749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(744);
					shiftOperator();
					setState(745);
					additiveExpression();
					}
					} 
				}
				setState(751);
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
		public List<TerminalNode> Greater() { return getTokens(PseudoParserParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(PseudoParserParser.Greater, i);
		}
		public List<TerminalNode> Less() { return getTokens(PseudoParserParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(PseudoParserParser.Less, i);
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
			setState(756);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Greater:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				match(Greater);
				setState(753);
				match(Greater);
				}
				break;
			case Less:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				match(Less);
				setState(755);
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
		public List<TerminalNode> Less() { return getTokens(PseudoParserParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(PseudoParserParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(PseudoParserParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(PseudoParserParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(PseudoParserParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(PseudoParserParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(PseudoParserParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(PseudoParserParser.GreaterEqual, i);
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
			setState(758);
			shiftExpression();
			setState(763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(759);
					_la = _input.LA(1);
					if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Less - 104)) | (1L << (Greater - 104)) | (1L << (LessEqual - 104)) | (1L << (GreaterEqual - 104)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(760);
					shiftExpression();
					}
					} 
				}
				setState(765);
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
		public List<TerminalNode> Equal() { return getTokens(PseudoParserParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(PseudoParserParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(PseudoParserParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(PseudoParserParser.NotEqual, i);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(PseudoParserParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(PseudoParserParser.MinusMinus, 0); }
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
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				relationalExpression();
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Equal || _la==NotEqual) {
					{
					{
					setState(767);
					_la = _input.LA(1);
					if ( !(_la==Equal || _la==NotEqual) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(768);
					relationalExpression();
					}
					}
					setState(773);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				postfixExpression(0);
				setState(775);
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
		public List<TerminalNode> And() { return getTokens(PseudoParserParser.And); }
		public TerminalNode And(int i) {
			return getToken(PseudoParserParser.And, i);
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
			setState(779);
			equalityExpression();
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(780);
				match(And);
				setState(781);
				equalityExpression();
				}
				}
				setState(786);
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
		public List<TerminalNode> Caret() { return getTokens(PseudoParserParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(PseudoParserParser.Caret, i);
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
			setState(787);
			andExpression();
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(788);
				match(Caret);
				setState(789);
				andExpression();
				}
				}
				setState(794);
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
		public List<TerminalNode> Or() { return getTokens(PseudoParserParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(PseudoParserParser.Or, i);
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
			setState(795);
			exclusiveOrExpression();
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(796);
				match(Or);
				setState(797);
				exclusiveOrExpression();
				}
				}
				setState(802);
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
		public List<TerminalNode> AndAnd() { return getTokens(PseudoParserParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(PseudoParserParser.AndAnd, i);
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
			setState(803);
			inclusiveOrExpression();
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(804);
				match(AndAnd);
				setState(805);
				inclusiveOrExpression();
				}
				}
				setState(810);
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
		public List<TerminalNode> OrOr() { return getTokens(PseudoParserParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(PseudoParserParser.OrOr, i);
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
			setState(811);
			logicalAndExpression();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(812);
				match(OrOr);
				setState(813);
				logicalAndExpression();
				}
				}
				setState(818);
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
		public TerminalNode Question() { return getToken(PseudoParserParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PseudoParserParser.Colon, 0); }
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
			setState(819);
			logicalOrExpression();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(820);
				match(Question);
				setState(821);
				expression();
				setState(822);
				match(Colon);
				setState(823);
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
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				logicalOrExpression();
				setState(829);
				assignmentOperator();
				setState(830);
				initializerClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(832);
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
		public TerminalNode Assign() { return getToken(PseudoParserParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(PseudoParserParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(PseudoParserParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(PseudoParserParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(PseudoParserParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(PseudoParserParser.MinusAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(PseudoParserParser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(PseudoParserParser.LeftShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(PseudoParserParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(PseudoParserParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(PseudoParserParser.OrAssign, 0); }
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
			setState(835);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Assign - 103)) | (1L << (PlusAssign - 103)) | (1L << (MinusAssign - 103)) | (1L << (StarAssign - 103)) | (1L << (DivAssign - 103)) | (1L << (ModAssign - 103)) | (1L << (XorAssign - 103)) | (1L << (AndAssign - 103)) | (1L << (OrAssign - 103)) | (1L << (LeftShiftAssign - 103)) | (1L << (RightShiftAssign - 103)))) != 0)) ) {
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParserParser.Comma, i);
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
			setState(837);
			assignmentExpression();
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(838);
				match(Comma);
				setState(839);
				assignmentExpression();
				}
				}
				setState(844);
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
			setState(845);
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
			setState(860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(848);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(857);
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
					setState(851);
					expressionStatement();
					}
					break;
				case LeftBrace:
					{
					setState(852);
					compoundStatement();
					}
					break;
				case If:
				case Switch:
					{
					setState(853);
					selectionStatement();
					}
					break;
				case Do:
				case For:
				case While:
					{
					setState(854);
					iterationStatement();
					}
					break;
				case Break:
				case Continue:
				case Goto:
				case Return:
					{
					setState(855);
					jumpStatement();
					}
					break;
				case Try:
					{
					setState(856);
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
				setState(859);
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
		public TerminalNode Colon() { return getToken(PseudoParserParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
		public TerminalNode Case() { return getToken(PseudoParserParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(PseudoParserParser.Default, 0); }
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
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(862);
				attributeSpecifierSeq();
				}
			}

			setState(869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(865);
				match(Identifier);
				}
				break;
			case Case:
				{
				setState(866);
				match(Case);
				setState(867);
				constantExpression();
				}
				break;
			case Default:
				{
				setState(868);
				match(Default);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(871);
			match(Colon);
			setState(872);
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
		public TerminalNode Semi() { return getToken(PseudoParserParser.Semi, 0); }
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
			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(874);
				expression();
				}
				break;
			}
			setState(877);
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
		public TerminalNode LeftBrace() { return getToken(PseudoParserParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoParserParser.RightBrace, 0); }
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
			setState(879);
			match(LeftBrace);
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Sizeof - 64)) | (1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (Caret - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (Assign - 64)) | (1L << (Less - 64)) | (1L << (Greater - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Comma - 64)) | (1L << (Question - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Doublecolon - 129)) | (1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0)) {
				{
				setState(880);
				statementSeq();
				}
			}

			setState(883);
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
			setState(886); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(885);
				statement();
				}
				}
				setState(888); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Sizeof - 64)) | (1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (Caret - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (Assign - 64)) | (1L << (Less - 64)) | (1L << (Greater - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Comma - 64)) | (1L << (Question - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (Doublecolon - 129)) | (1L << (Semi - 129)) | (1L << (Ellipsis - 129)) | (1L << (Identifier - 129)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode If() { return getToken(PseudoParserParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(PseudoParserParser.Else, 0); }
		public TerminalNode Switch() { return getToken(PseudoParserParser.Switch, 0); }
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
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				match(If);
				setState(891);
				match(LeftParen);
				setState(892);
				condition();
				setState(893);
				match(RightParen);
				setState(894);
				statement();
				setState(897);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(895);
					match(Else);
					setState(896);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				match(Switch);
				setState(900);
				match(LeftParen);
				setState(901);
				condition();
				setState(902);
				match(RightParen);
				setState(903);
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
		public TerminalNode Assign() { return getToken(PseudoParserParser.Assign, 0); }
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
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(908);
					attributeSpecifierSeq();
					}
				}

				setState(911);
				declSpecifierSeq();
				setState(912);
				declarator();
				setState(916);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Assign:
					{
					setState(913);
					match(Assign);
					setState(914);
					initializerClause();
					}
					break;
				case LeftBrace:
					{
					setState(915);
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
		public TerminalNode While() { return getToken(PseudoParserParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(PseudoParserParser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoParserParser.Semi, 0); }
		public TerminalNode For() { return getToken(PseudoParserParser.For, 0); }
		public ForInitStatementContext forInitStatement() {
			return getRuleContext(ForInitStatementContext.class,0);
		}
		public ForRangeDeclarationContext forRangeDeclaration() {
			return getRuleContext(ForRangeDeclarationContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PseudoParserParser.Colon, 0); }
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
			setState(953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				match(While);
				setState(921);
				match(LeftParen);
				setState(922);
				condition();
				setState(923);
				match(RightParen);
				setState(924);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				match(Do);
				setState(927);
				statement();
				setState(928);
				match(While);
				setState(929);
				match(LeftParen);
				setState(930);
				expression();
				setState(931);
				match(RightParen);
				setState(932);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(934);
				match(For);
				setState(935);
				match(LeftParen);
				setState(948);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(936);
					forInitStatement();
					setState(938);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(937);
						condition();
						}
						break;
					}
					setState(940);
					match(Semi);
					setState(942);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(941);
						expression();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(944);
					forRangeDeclaration();
					setState(945);
					match(Colon);
					setState(946);
					forRangeInitializer();
					}
					break;
				}
				setState(950);
				match(RightParen);
				setState(951);
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
			setState(957);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
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
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(959);
				attributeSpecifierSeq();
				}
			}

			setState(962);
			declSpecifierSeq();
			setState(963);
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
			setState(967);
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
				setState(965);
				expression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(966);
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
		public TerminalNode Semi() { return getToken(PseudoParserParser.Semi, 0); }
		public TerminalNode Break() { return getToken(PseudoParserParser.Break, 0); }
		public TerminalNode Continue() { return getToken(PseudoParserParser.Continue, 0); }
		public TerminalNode Return() { return getToken(PseudoParserParser.Return, 0); }
		public TerminalNode Goto() { return getToken(PseudoParserParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
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
			setState(978);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				{
				setState(969);
				match(Break);
				}
				break;
			case Continue:
				{
				setState(970);
				match(Continue);
				}
				break;
			case Return:
				{
				setState(971);
				match(Return);
				setState(974);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(972);
					expression();
					}
					break;
				case 2:
					{
					setState(973);
					bracedInitList();
					}
					break;
				}
				}
				break;
			case Goto:
				{
				setState(976);
				match(Goto);
				setState(977);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(980);
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
			setState(982);
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
			setState(985); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(984);
				declaration();
				}
				}
				setState(987); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Func || _la==Main );
			}
		}
		catch (RecognitionException re) {
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
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public MainDefinitionContext mainDefinition() {
			return getRuleContext(MainDefinitionContext.class,0);
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
			setState(991);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Func:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				functionDefinition();
				}
				break;
			case Main:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				mainDefinition();
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
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				asmDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(995);
				namespaceAliasDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(996);
				usingDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(997);
				usingDirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(998);
				staticAssertDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(999);
				aliasDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1000);
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
		public TerminalNode Using() { return getToken(PseudoParserParser.Using, 0); }
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(PseudoParserParser.Assign, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoParserParser.Semi, 0); }
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
			setState(1003);
			match(Using);
			setState(1004);
			match(Identifier);
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1005);
				attributeSpecifierSeq();
				}
			}

			setState(1008);
			match(Assign);
			setState(1009);
			theTypeId();
			setState(1010);
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
		public TerminalNode Semi() { return getToken(PseudoParserParser.Semi, 0); }
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
			setState(1026);
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
				setState(1013);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(1012);
					declSpecifierSeq();
					}
					break;
				}
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Operator || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (LeftParen - 87)) | (1L << (Star - 87)) | (1L << (And - 87)) | (1L << (Tilde - 87)) | (1L << (AndAnd - 87)) | (1L << (Doublecolon - 87)) | (1L << (Ellipsis - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					setState(1015);
					initDeclaratorList();
					}
				}

				setState(1018);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				attributeSpecifierSeq();
				setState(1021);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1020);
					declSpecifierSeq();
					}
					break;
				}
				setState(1023);
				initDeclaratorList();
				setState(1024);
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
		public TerminalNode Static_assert() { return getToken(PseudoParserParser.Static_assert, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PseudoParserParser.Comma, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoParserParser.StringLiteral, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(PseudoParserParser.Semi, 0); }
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
			setState(1028);
			match(Static_assert);
			setState(1029);
			match(LeftParen);
			setState(1030);
			constantExpression();
			setState(1031);
			match(Comma);
			setState(1032);
			match(StringLiteral);
			setState(1033);
			match(RightParen);
			setState(1034);
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
		public TerminalNode Semi() { return getToken(PseudoParserParser.Semi, 0); }
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
			setState(1036);
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
		public TerminalNode Semi() { return getToken(PseudoParserParser.Semi, 0); }
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
			setState(1038);
			attributeSpecifierSeq();
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
		public TerminalNode Friend() { return getToken(PseudoParserParser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(PseudoParserParser.Typedef, 0); }
		public TerminalNode Constexpr() { return getToken(PseudoParserParser.Constexpr, 0); }
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
			setState(1047);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1041);
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
				setState(1042);
				typeSpecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1043);
				functionSpecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1044);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1045);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1046);
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
			setState(1050); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1049);
					declSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1052); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1054);
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
		public TerminalNode Register() { return getToken(PseudoParserParser.Register, 0); }
		public TerminalNode Static() { return getToken(PseudoParserParser.Static, 0); }
		public TerminalNode Thread_local() { return getToken(PseudoParserParser.Thread_local, 0); }
		public TerminalNode Extern() { return getToken(PseudoParserParser.Extern, 0); }
		public TerminalNode Mutable() { return getToken(PseudoParserParser.Mutable, 0); }
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
			setState(1057);
			_la = _input.LA(1);
			if ( !(((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (Extern - 38)) | (1L << (Mutable - 38)) | (1L << (Register - 38)) | (1L << (Static - 38)) | (1L << (Thread_local - 38)))) != 0)) ) {
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
		public TerminalNode Inline() { return getToken(PseudoParserParser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(PseudoParserParser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(PseudoParserParser.Explicit, 0); }
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
			setState(1059);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (Explicit - 36)) | (1L << (Inline - 36)) | (1L << (Virtual - 36)))) != 0)) ) {
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
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
			setState(1061);
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
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				trailingTypeSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1064);
				classSpecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1065);
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
			setState(1072);
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
				setState(1068);
				simpleTypeSpecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
				enterOuterAlt(_localctx, 2);
				{
				setState(1069);
				elaboratedTypeSpecifier();
				}
				break;
			case Typename_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1070);
				typeNameSpecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1071);
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
			setState(1075); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1074);
					typeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1077); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1079);
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
			setState(1083); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1082);
					trailingTypeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1085); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1087);
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
		public TerminalNode Template() { return getToken(PseudoParserParser.Template, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Char() { return getToken(PseudoParserParser.Char, 0); }
		public TerminalNode Char16() { return getToken(PseudoParserParser.Char16, 0); }
		public TerminalNode Char32() { return getToken(PseudoParserParser.Char32, 0); }
		public TerminalNode Wchar() { return getToken(PseudoParserParser.Wchar, 0); }
		public TerminalNode Bool() { return getToken(PseudoParserParser.Bool, 0); }
		public TerminalNode Short() { return getToken(PseudoParserParser.Short, 0); }
		public TerminalNode Int() { return getToken(PseudoParserParser.Int, 0); }
		public TerminalNode Long() { return getToken(PseudoParserParser.Long, 0); }
		public TerminalNode Signed() { return getToken(PseudoParserParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(PseudoParserParser.Unsigned, 0); }
		public TerminalNode Float() { return getToken(PseudoParserParser.Float, 0); }
		public TerminalNode Double() { return getToken(PseudoParserParser.Double, 0); }
		public TerminalNode Void() { return getToken(PseudoParserParser.Void, 0); }
		public TerminalNode Auto() { return getToken(PseudoParserParser.Auto, 0); }
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
			setState(1113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1091);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1090);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1093);
				theTypeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
				nestedNameSpecifier(0);
				setState(1095);
				match(Template);
				setState(1096);
				simpleTemplateId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1098);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1099);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1100);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1101);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1102);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1103);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1104);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1105);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1106);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1107);
				match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1108);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1109);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1110);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1111);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1112);
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
			setState(1119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1115);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1116);
				enumName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1117);
				typedefName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1118);
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
		public TerminalNode Decltype() { return getToken(PseudoParserParser.Decltype, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Auto() { return getToken(PseudoParserParser.Auto, 0); }
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
			setState(1121);
			match(Decltype);
			setState(1122);
			match(LeftParen);
			setState(1125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1123);
				expression();
				}
				break;
			case 2:
				{
				setState(1124);
				match(Auto);
				}
				break;
			}
			setState(1127);
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoParserParser.Template, 0); }
		public TerminalNode Enum() { return getToken(PseudoParserParser.Enum, 0); }
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
			setState(1151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Struct:
				enterOuterAlt(_localctx, 1);
				{
				setState(1129);
				classKey();
				setState(1144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Alignas || _la==LeftBracket) {
						{
						setState(1130);
						attributeSpecifierSeq();
						}
					}

					setState(1134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						setState(1133);
						nestedNameSpecifier(0);
						}
						break;
					}
					setState(1136);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(1137);
					simpleTemplateId();
					}
					break;
				case 3:
					{
					setState(1138);
					nestedNameSpecifier(0);
					setState(1140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Template) {
						{
						setState(1139);
						match(Template);
						}
					}

					setState(1142);
					simpleTemplateId();
					}
					break;
				}
				}
				break;
			case Enum:
				enterOuterAlt(_localctx, 2);
				{
				setState(1146);
				match(Enum);
				setState(1148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1147);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1150);
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
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
			setState(1153);
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
		public TerminalNode LeftBrace() { return getToken(PseudoParserParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoParserParser.RightBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PseudoParserParser.Comma, 0); }
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
			setState(1155);
			enumHead();
			setState(1156);
			match(LeftBrace);
			setState(1161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1157);
				enumeratorList();
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1158);
					match(Comma);
					}
				}

				}
			}

			setState(1163);
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
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
			setState(1165);
			enumkey();
			setState(1167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1166);
				attributeSpecifierSeq();
				}
			}

			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
				{
				setState(1170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1169);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1172);
				match(Identifier);
				}
			}

			setState(1176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1175);
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(PseudoParserParser.Semi, 0); }
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
			setState(1178);
			enumkey();
			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1179);
				attributeSpecifierSeq();
				}
			}

			setState(1182);
			match(Identifier);
			setState(1184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1183);
				enumbase();
				}
			}

			setState(1186);
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
		public TerminalNode Enum() { return getToken(PseudoParserParser.Enum, 0); }
		public TerminalNode Class() { return getToken(PseudoParserParser.Class, 0); }
		public TerminalNode Struct() { return getToken(PseudoParserParser.Struct, 0); }
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
			setState(1188);
			match(Enum);
			setState(1190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Class || _la==Struct) {
				{
				setState(1189);
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
		public TerminalNode Colon() { return getToken(PseudoParserParser.Colon, 0); }
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
			setState(1192);
			match(Colon);
			setState(1193);
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParserParser.Comma, i);
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
			setState(1195);
			enumeratorDefinition();
			setState(1200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1196);
					match(Comma);
					setState(1197);
					enumeratorDefinition();
					}
					} 
				}
				setState(1202);
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
		public TerminalNode Assign() { return getToken(PseudoParserParser.Assign, 0); }
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
			setState(1203);
			enumerator();
			setState(1206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1204);
				match(Assign);
				setState(1205);
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
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
			setState(1208);
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
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1210);
				originalNamespaceName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1211);
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
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
			setState(1214);
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
		public TerminalNode Namespace() { return getToken(PseudoParserParser.Namespace, 0); }
		public TerminalNode LeftBrace() { return getToken(PseudoParserParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoParserParser.RightBrace, 0); }
		public TerminalNode Inline() { return getToken(PseudoParserParser.Inline, 0); }
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
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
			setState(1217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1216);
				match(Inline);
				}
			}

			setState(1219);
			match(Namespace);
			setState(1222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1220);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1221);
				originalNamespaceName();
				}
				break;
			}
			setState(1224);
			match(LeftBrace);
			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Func || _la==Main) {
				{
				setState(1225);
				((NamespaceDefinitionContext)_localctx).namespaceBody = declarationseq();
				}
			}

			setState(1228);
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
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
			setState(1230);
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
		public TerminalNode Namespace() { return getToken(PseudoParserParser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(PseudoParserParser.Assign, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoParserParser.Semi, 0); }
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
			setState(1232);
			match(Namespace);
			setState(1233);
			match(Identifier);
			setState(1234);
			match(Assign);
			setState(1235);
			qualifiednamespacespecifier();
			setState(1236);
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
			setState(1239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1238);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1241);
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
		public TerminalNode Using() { return getToken(PseudoParserParser.Using, 0); }
		public UnqualifiedIdContext unqualifiedId() {
			return getRuleContext(UnqualifiedIdContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoParserParser.Semi, 0); }
		public TerminalNode Doublecolon() { return getToken(PseudoParserParser.Doublecolon, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Typename_() { return getToken(PseudoParserParser.Typename_, 0); }
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
			setState(1243);
			match(Using);
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				{
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Typename_) {
					{
					setState(1244);
					match(Typename_);
					}
				}

				setState(1247);
				nestedNameSpecifier(0);
				}
				}
				break;
			case 2:
				{
				setState(1248);
				match(Doublecolon);
				}
				break;
			}
			setState(1251);
			unqualifiedId();
			setState(1252);
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
		public TerminalNode Using() { return getToken(PseudoParserParser.Using, 0); }
		public TerminalNode Namespace() { return getToken(PseudoParserParser.Namespace, 0); }
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudoParserParser.Semi, 0); }
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
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1254);
				attributeSpecifierSeq();
				}
			}

			setState(1257);
			match(Using);
			setState(1258);
			match(Namespace);
			setState(1260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1259);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1262);
			namespaceName();
			setState(1263);
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
		public TerminalNode Asm() { return getToken(PseudoParserParser.Asm, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoParserParser.StringLiteral, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(PseudoParserParser.Semi, 0); }
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
			setState(1265);
			match(Asm);
			setState(1266);
			match(LeftParen);
			setState(1267);
			match(StringLiteral);
			setState(1268);
			match(RightParen);
			setState(1269);
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
		public TerminalNode Extern() { return getToken(PseudoParserParser.Extern, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoParserParser.StringLiteral, 0); }
		public TerminalNode LeftBrace() { return getToken(PseudoParserParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoParserParser.RightBrace, 0); }
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
			setState(1271);
			match(Extern);
			setState(1272);
			match(StringLiteral);
			setState(1279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				{
				setState(1273);
				match(LeftBrace);
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Func || _la==Main) {
					{
					setState(1274);
					declarationseq();
					}
				}

				setState(1277);
				match(RightBrace);
				}
				break;
			case Func:
			case Main:
				{
				setState(1278);
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
			setState(1282); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1281);
					attributeSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1284); 
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
		public List<TerminalNode> LeftBracket() { return getTokens(PseudoParserParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(PseudoParserParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(PseudoParserParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(PseudoParserParser.RightBracket, i);
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
			setState(1294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1286);
				match(LeftBracket);
				setState(1287);
				match(LeftBracket);
				setState(1289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1288);
					attributeList();
					}
				}

				setState(1291);
				match(RightBracket);
				setState(1292);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1293);
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
		public TerminalNode Alignas() { return getToken(PseudoParserParser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(PseudoParserParser.Ellipsis, 0); }
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
			setState(1296);
			match(Alignas);
			setState(1297);
			match(LeftParen);
			setState(1300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1298);
				theTypeId();
				}
				break;
			case 2:
				{
				setState(1299);
				constantExpression();
				}
				break;
			}
			setState(1303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1302);
				match(Ellipsis);
				}
			}

			setState(1305);
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParserParser.Comma, i);
		}
		public TerminalNode Ellipsis() { return getToken(PseudoParserParser.Ellipsis, 0); }
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
			setState(1307);
			attribute();
			setState(1312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1308);
				match(Comma);
				setState(1309);
				attribute();
				}
				}
				setState(1314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1315);
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
		public AttributeNamespaceContext attributeNamespace() {
			return getRuleContext(AttributeNamespaceContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(PseudoParserParser.Doublecolon, 0); }
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
			setState(1321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1318);
				attributeNamespace();
				setState(1319);
				match(Doublecolon);
				}
				break;
			}
			setState(1323);
			match(Identifier);
			setState(1325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(1324);
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
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
			setState(1327);
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
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
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
			setState(1329);
			match(LeftParen);
			setState(1331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << MultiLineMacro) | (1L << Directive) | (1L << Func) | (1L << Main) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Catch) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Else) | (1L << Enum) | (1L << Explicit) | (1L << Export) | (1L << Extern) | (1L << False_) | (1L << Final) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Override) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Sizeof - 64)) | (1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (Template - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True_ - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (Caret - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (Assign - 64)) | (1L << (Less - 64)) | (1L << (Greater - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Comma - 64)) | (1L << (ArrowStar - 64)) | (1L << (Arrow - 64)) | (1L << (Question - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Colon - 128)) | (1L << (Doublecolon - 128)) | (1L << (Semi - 128)) | (1L << (Dot - 128)) | (1L << (DotStar - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (Integersuffix - 128)) | (1L << (UserDefinedIntegerLiteral - 128)) | (1L << (UserDefinedFloatingLiteral - 128)) | (1L << (UserDefinedStringLiteral - 128)) | (1L << (UserDefinedCharacterLiteral - 128)) | (1L << (Whitespace - 128)) | (1L << (Newline - 128)) | (1L << (BlockComment - 128)) | (1L << (LineComment - 128)))) != 0)) {
				{
				setState(1330);
				balancedTokenSeq();
				}
			}

			setState(1333);
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
			setState(1336); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1335);
				balancedtoken();
				}
				}
				setState(1338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << MultiLineMacro) | (1L << Directive) | (1L << Func) | (1L << Main) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Catch) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Else) | (1L << Enum) | (1L << Explicit) | (1L << Export) | (1L << Extern) | (1L << False_) | (1L << Final) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Override) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Sizeof - 64)) | (1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (Template - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True_ - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (Caret - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (Assign - 64)) | (1L << (Less - 64)) | (1L << (Greater - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Comma - 64)) | (1L << (ArrowStar - 64)) | (1L << (Arrow - 64)) | (1L << (Question - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Colon - 128)) | (1L << (Doublecolon - 128)) | (1L << (Semi - 128)) | (1L << (Dot - 128)) | (1L << (DotStar - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (Integersuffix - 128)) | (1L << (UserDefinedIntegerLiteral - 128)) | (1L << (UserDefinedFloatingLiteral - 128)) | (1L << (UserDefinedStringLiteral - 128)) | (1L << (UserDefinedCharacterLiteral - 128)) | (1L << (Whitespace - 128)) | (1L << (Newline - 128)) | (1L << (BlockComment - 128)) | (1L << (LineComment - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> LeftParen() { return getTokens(PseudoParserParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(PseudoParserParser.LeftParen, i);
		}
		public BalancedTokenSeqContext balancedTokenSeq() {
			return getRuleContext(BalancedTokenSeqContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(PseudoParserParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PseudoParserParser.RightParen, i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(PseudoParserParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(PseudoParserParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(PseudoParserParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(PseudoParserParser.RightBracket, i);
		}
		public List<TerminalNode> LeftBrace() { return getTokens(PseudoParserParser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(PseudoParserParser.LeftBrace, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(PseudoParserParser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(PseudoParserParser.RightBrace, i);
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
			setState(1357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1340);
				match(LeftParen);
				setState(1341);
				balancedTokenSeq();
				setState(1342);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1344);
				match(LeftBracket);
				setState(1345);
				balancedTokenSeq();
				setState(1346);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1348);
				match(LeftBrace);
				setState(1349);
				balancedTokenSeq();
				setState(1350);
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
			case Func:
			case Main:
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
				setState(1353); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1352);
						_la = _input.LA(1);
						if ( _la <= 0 || (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (LeftParen - 87)) | (1L << (RightParen - 87)) | (1L << (LeftBracket - 87)) | (1L << (RightBracket - 87)) | (1L << (LeftBrace - 87)) | (1L << (RightBrace - 87)))) != 0)) ) {
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
					setState(1355); 
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParserParser.Comma, i);
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
			setState(1359);
			initDeclarator();
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1360);
				match(Comma);
				setState(1361);
				initDeclarator();
				}
				}
				setState(1366);
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
			setState(1367);
			declarator();
			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (LeftParen - 87)) | (1L << (LeftBrace - 87)) | (1L << (Assign - 87)))) != 0)) {
				{
				setState(1368);
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
			setState(1376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1371);
				pointerDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1372);
				noPointerDeclarator(0);
				setState(1373);
				parametersAndQualifiers();
				setState(1374);
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
		public List<TerminalNode> Const() { return getTokens(PseudoParserParser.Const); }
		public TerminalNode Const(int i) {
			return getToken(PseudoParserParser.Const, i);
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
			setState(1384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1378);
					pointerOperator();
					setState(1380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Const) {
						{
						setState(1379);
						match(Const);
						}
					}

					}
					} 
				}
				setState(1386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			setState(1387);
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
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public PointerDeclaratorContext pointerDeclarator() {
			return getRuleContext(PointerDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
		public NoPointerDeclaratorContext noPointerDeclarator() {
			return getRuleContext(NoPointerDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PseudoParserParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoParserParser.RightBracket, 0); }
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
			setState(1398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1390);
				declaratorid();
				setState(1392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1391);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1394);
				match(LeftParen);
				setState(1395);
				pointerDeclarator();
				setState(1396);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1414);
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
					setState(1400);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1410);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LeftParen:
						{
						setState(1401);
						parametersAndQualifiers();
						}
						break;
					case LeftBracket:
						{
						setState(1402);
						match(LeftBracket);
						setState(1404);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
						case 1:
							{
							setState(1403);
							constantExpression();
							}
							break;
						}
						setState(1406);
						match(RightBracket);
						setState(1408);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
						case 1:
							{
							setState(1407);
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
				setState(1416);
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
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
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
			setState(1417);
			match(LeftParen);
			setState(1419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (Alignas - 12)) | (1L << (Auto - 12)) | (1L << (Bool - 12)) | (1L << (Char - 12)) | (1L << (Char16 - 12)) | (1L << (Char32 - 12)) | (1L << (Class - 12)) | (1L << (Const - 12)) | (1L << (Constexpr - 12)) | (1L << (Decltype - 12)) | (1L << (Double - 12)) | (1L << (Enum - 12)) | (1L << (Explicit - 12)) | (1L << (Extern - 12)) | (1L << (Float - 12)) | (1L << (Friend - 12)) | (1L << (Inline - 12)) | (1L << (Int - 12)) | (1L << (Long - 12)) | (1L << (Mutable - 12)) | (1L << (Register - 12)) | (1L << (Short - 12)) | (1L << (Signed - 12)) | (1L << (Static - 12)) | (1L << (Struct - 12)) | (1L << (Thread_local - 12)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Typedef - 76)) | (1L << (Typename_ - 76)) | (1L << (Union - 76)) | (1L << (Unsigned - 76)) | (1L << (Virtual - 76)) | (1L << (Void - 76)) | (1L << (Volatile - 76)) | (1L << (Wchar - 76)) | (1L << (LeftBracket - 76)) | (1L << (Doublecolon - 76)) | (1L << (Identifier - 76)))) != 0)) {
				{
				setState(1418);
				parameterDeclarationClause();
				}
			}

			setState(1421);
			match(RightParen);
			setState(1423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1422);
				cvqualifierseq();
				}
				break;
			}
			setState(1426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1425);
				refqualifier();
				}
				break;
			}
			setState(1429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1428);
				exceptionSpecification();
				}
				break;
			}
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1431);
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
		public TerminalNode Arrow() { return getToken(PseudoParserParser.Arrow, 0); }
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
			setState(1434);
			match(Arrow);
			setState(1435);
			trailingTypeSpecifierSeq();
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1436);
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
		public TerminalNode And() { return getToken(PseudoParserParser.And, 0); }
		public TerminalNode AndAnd() { return getToken(PseudoParserParser.AndAnd, 0); }
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode Star() { return getToken(PseudoParserParser.Star, 0); }
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
			setState(1453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
			case AndAnd:
				enterOuterAlt(_localctx, 1);
				{
				setState(1439);
				_la = _input.LA(1);
				if ( !(_la==And || _la==AndAnd) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1441);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1440);
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
				setState(1444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(1443);
					nestedNameSpecifier(0);
					}
				}

				setState(1446);
				match(Star);
				setState(1448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1447);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(1451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1450);
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
			setState(1456); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1455);
					cvQualifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1458); 
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
		public TerminalNode Const() { return getToken(PseudoParserParser.Const, 0); }
		public TerminalNode Volatile() { return getToken(PseudoParserParser.Volatile, 0); }
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
			setState(1460);
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
		public TerminalNode And() { return getToken(PseudoParserParser.And, 0); }
		public TerminalNode AndAnd() { return getToken(PseudoParserParser.AndAnd, 0); }
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
			setState(1462);
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
		public TerminalNode Ellipsis() { return getToken(PseudoParserParser.Ellipsis, 0); }
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
			setState(1465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1464);
				match(Ellipsis);
				}
			}

			setState(1467);
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
			setState(1469);
			typeSpecifierSeq();
			setState(1471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1470);
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
			setState(1481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1473);
				pointerAbstractDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1475);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1474);
					noPointerAbstractDeclarator(0);
					}
					break;
				}
				setState(1477);
				parametersAndQualifiers();
				setState(1478);
				trailingReturnType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1480);
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
			setState(1492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1483);
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
				setState(1485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1484);
					pointerOperator();
					}
					}
					setState(1487); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Decltype || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Star - 95)) | (1L << (And - 95)) | (1L << (AndAnd - 95)) | (1L << (Doublecolon - 95)) | (1L << (Identifier - 95)))) != 0) );
				setState(1490);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1489);
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
		public TerminalNode LeftBracket() { return getToken(PseudoParserParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoParserParser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AttributeSpecifierSeqContext attributeSpecifierSeq() {
			return getRuleContext(AttributeSpecifierSeqContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public PointerAbstractDeclaratorContext pointerAbstractDeclarator() {
			return getRuleContext(PointerAbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
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
			setState(1508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1495);
				parametersAndQualifiers();
				}
				break;
			case 2:
				{
				setState(1496);
				match(LeftBracket);
				setState(1498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1497);
					constantExpression();
					}
					break;
				}
				setState(1500);
				match(RightBracket);
				setState(1502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1501);
					attributeSpecifierSeq();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1504);
				match(LeftParen);
				setState(1505);
				pointerAbstractDeclarator();
				setState(1506);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1525);
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
					setState(1510);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(1521);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
					case 1:
						{
						setState(1511);
						parametersAndQualifiers();
						}
						break;
					case 2:
						{
						setState(1512);
						noPointerAbstractDeclarator(0);
						setState(1513);
						match(LeftBracket);
						setState(1515);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
						case 1:
							{
							setState(1514);
							constantExpression();
							}
							break;
						}
						setState(1517);
						match(RightBracket);
						setState(1519);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
						case 1:
							{
							setState(1518);
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
				setState(1527);
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
			setState(1531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Decltype || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Star - 95)) | (1L << (And - 95)) | (1L << (AndAnd - 95)) | (1L << (Doublecolon - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				{
				setState(1528);
				pointerOperator();
				}
				}
				setState(1533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1534);
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
		public TerminalNode Ellipsis() { return getToken(PseudoParserParser.Ellipsis, 0); }
		public NoPointerAbstractPackDeclaratorContext noPointerAbstractPackDeclarator() {
			return getRuleContext(NoPointerAbstractPackDeclaratorContext.class,0);
		}
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PseudoParserParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoParserParser.RightBracket, 0); }
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
			setState(1537);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1553);
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
					setState(1539);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1549);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LeftParen:
						{
						setState(1540);
						parametersAndQualifiers();
						}
						break;
					case LeftBracket:
						{
						setState(1541);
						match(LeftBracket);
						setState(1543);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
						case 1:
							{
							setState(1542);
							constantExpression();
							}
							break;
						}
						setState(1545);
						match(RightBracket);
						setState(1547);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
						case 1:
							{
							setState(1546);
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
				setState(1555);
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
		public TerminalNode Ellipsis() { return getToken(PseudoParserParser.Ellipsis, 0); }
		public TerminalNode Comma() { return getToken(PseudoParserParser.Comma, 0); }
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
			setState(1556);
			parameterDeclarationList();
			setState(1561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma || _la==Ellipsis) {
				{
				setState(1558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1557);
					match(Comma);
					}
				}

				setState(1560);
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParserParser.Comma, i);
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
			setState(1563);
			parameterDeclaration();
			setState(1568);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1564);
					match(Comma);
					setState(1565);
					parameterDeclaration();
					}
					} 
				}
				setState(1570);
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
		public TerminalNode Assign() { return getToken(PseudoParserParser.Assign, 0); }
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
			setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1571);
				attributeSpecifierSeq();
				}
			}

			setState(1574);
			declSpecifierSeq();
			{
			setState(1579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1575);
				declarator();
				}
				break;
			case 2:
				{
				setState(1577);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1576);
					abstractDeclarator();
					}
					break;
				}
				}
				break;
			}
			setState(1583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1581);
				match(Assign);
				setState(1582);
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
		public TerminalNode Func() { return getToken(PseudoParserParser.Func, 0); }
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
			setState(1585);
			match(Func);
			setState(1587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1586);
				attributeSpecifierSeq();
				}
			}

			setState(1590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1589);
				declSpecifierSeq();
				}
				break;
			}
			setState(1592);
			declarator();
			setState(1594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1593);
				virtualSpecifierSeq();
				}
			}

			setState(1596);
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

	public static class MainDefinitionContext extends ParserRuleContext {
		public TerminalNode Main() { return getToken(PseudoParserParser.Main, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public MainDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).enterMainDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudoParserListener ) ((PseudoParserListener)listener).exitMainDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudoParserVisitor ) return ((PseudoParserVisitor<? extends T>)visitor).visitMainDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDefinitionContext mainDefinition() throws RecognitionException {
		MainDefinitionContext _localctx = new MainDefinitionContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_mainDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			match(Main);
			setState(1599);
			match(LeftParen);
			setState(1600);
			match(RightParen);
			setState(1601);
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
		public TerminalNode Assign() { return getToken(PseudoParserParser.Assign, 0); }
		public TerminalNode Semi() { return getToken(PseudoParserParser.Semi, 0); }
		public TerminalNode Default() { return getToken(PseudoParserParser.Default, 0); }
		public TerminalNode Delete() { return getToken(PseudoParserParser.Delete, 0); }
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
		enterRule(_localctx, 264, RULE_functionBody);
		int _la;
		try {
			setState(1611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Colon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1603);
					constructorInitializer();
					}
				}

				setState(1606);
				compoundStatement();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 2);
				{
				setState(1607);
				functionTryBlock();
				}
				break;
			case Assign:
				enterOuterAlt(_localctx, 3);
				{
				setState(1608);
				match(Assign);
				setState(1609);
				_la = _input.LA(1);
				if ( !(_la==Default || _la==Delete) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1610);
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
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
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
		enterRule(_localctx, 266, RULE_initializer);
		try {
			setState(1618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1613);
				braceOrEqualInitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1614);
				match(LeftParen);
				setState(1615);
				expressionList();
				setState(1616);
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
		public TerminalNode Assign() { return getToken(PseudoParserParser.Assign, 0); }
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
		enterRule(_localctx, 268, RULE_braceOrEqualInitializer);
		try {
			setState(1623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1620);
				match(Assign);
				setState(1621);
				initializerClause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1622);
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
		enterRule(_localctx, 270, RULE_initializerClause);
		try {
			setState(1627);
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
				setState(1625);
				assignmentExpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1626);
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
		public List<TerminalNode> Ellipsis() { return getTokens(PseudoParserParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(PseudoParserParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParserParser.Comma, i);
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
		enterRule(_localctx, 272, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			initializerClause();
			setState(1631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1630);
				match(Ellipsis);
				}
			}

			setState(1640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1633);
					match(Comma);
					setState(1634);
					initializerClause();
					setState(1636);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Ellipsis) {
						{
						setState(1635);
						match(Ellipsis);
						}
					}

					}
					} 
				}
				setState(1642);
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
		public TerminalNode LeftBrace() { return getToken(PseudoParserParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoParserParser.RightBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(PseudoParserParser.Comma, 0); }
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
		enterRule(_localctx, 274, RULE_bracedInitList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
			match(LeftBrace);
			setState(1648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1644);
				initializerList();
				setState(1646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1645);
					match(Comma);
					}
				}

				}
				break;
			}
			setState(1650);
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
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
		enterRule(_localctx, 276, RULE_className);
		try {
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1652);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1653);
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
		public TerminalNode LeftBrace() { return getToken(PseudoParserParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(PseudoParserParser.RightBrace, 0); }
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
		enterRule(_localctx, 278, RULE_classSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			classHead();
			setState(1657);
			match(LeftBrace);
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Func - 10)) | (1L << (Alignas - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Operator - 10)) | (1L << (Private - 10)) | (1L << (Protected - 10)) | (1L << (Public - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Typedef - 76)) | (1L << (Typename_ - 76)) | (1L << (Union - 76)) | (1L << (Unsigned - 76)) | (1L << (Using - 76)) | (1L << (Virtual - 76)) | (1L << (Void - 76)) | (1L << (Volatile - 76)) | (1L << (Wchar - 76)) | (1L << (LeftParen - 76)) | (1L << (LeftBracket - 76)) | (1L << (Star - 76)) | (1L << (And - 76)) | (1L << (Tilde - 76)) | (1L << (AndAnd - 76)) | (1L << (Colon - 76)) | (1L << (Doublecolon - 76)) | (1L << (Semi - 76)) | (1L << (Ellipsis - 76)) | (1L << (Identifier - 76)))) != 0)) {
				{
				setState(1658);
				memberSpecification();
				}
			}

			setState(1661);
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
		public TerminalNode Union() { return getToken(PseudoParserParser.Union, 0); }
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
		enterRule(_localctx, 280, RULE_classHead);
		int _la;
		try {
			setState(1686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Struct:
				enterOuterAlt(_localctx, 1);
				{
				setState(1663);
				classKey();
				setState(1665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1664);
					attributeSpecifierSeq();
					}
				}

				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(1667);
					classHeadName();
					setState(1669);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(1668);
						classVirtSpecifier();
						}
					}

					}
				}

				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1673);
					baseClause();
					}
				}

				}
				break;
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1676);
				match(Union);
				setState(1678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1677);
					attributeSpecifierSeq();
					}
				}

				setState(1684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(1680);
					classHeadName();
					setState(1682);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final) {
						{
						setState(1681);
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
		enterRule(_localctx, 282, RULE_classHeadName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1688);
				nestedNameSpecifier(0);
				}
				break;
			}
			setState(1691);
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
		public TerminalNode Final() { return getToken(PseudoParserParser.Final, 0); }
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
		enterRule(_localctx, 284, RULE_classVirtSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
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
		public TerminalNode Class() { return getToken(PseudoParserParser.Class, 0); }
		public TerminalNode Struct() { return getToken(PseudoParserParser.Struct, 0); }
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
		enterRule(_localctx, 286, RULE_classKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
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
		public List<TerminalNode> Colon() { return getTokens(PseudoParserParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(PseudoParserParser.Colon, i);
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
		enterRule(_localctx, 288, RULE_memberSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1701);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Func:
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
					setState(1697);
					memberdeclaration();
					}
					break;
				case Private:
				case Protected:
				case Public:
					{
					setState(1698);
					accessSpecifier();
					setState(1699);
					match(Colon);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1703); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (Func - 10)) | (1L << (Alignas - 10)) | (1L << (Auto - 10)) | (1L << (Bool - 10)) | (1L << (Char - 10)) | (1L << (Char16 - 10)) | (1L << (Char32 - 10)) | (1L << (Class - 10)) | (1L << (Const - 10)) | (1L << (Constexpr - 10)) | (1L << (Decltype - 10)) | (1L << (Double - 10)) | (1L << (Enum - 10)) | (1L << (Explicit - 10)) | (1L << (Extern - 10)) | (1L << (Float - 10)) | (1L << (Friend - 10)) | (1L << (Inline - 10)) | (1L << (Int - 10)) | (1L << (Long - 10)) | (1L << (Mutable - 10)) | (1L << (Operator - 10)) | (1L << (Private - 10)) | (1L << (Protected - 10)) | (1L << (Public - 10)) | (1L << (Register - 10)) | (1L << (Short - 10)) | (1L << (Signed - 10)) | (1L << (Static - 10)) | (1L << (Static_assert - 10)) | (1L << (Struct - 10)) | (1L << (Template - 10)) | (1L << (Thread_local - 10)))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Typedef - 76)) | (1L << (Typename_ - 76)) | (1L << (Union - 76)) | (1L << (Unsigned - 76)) | (1L << (Using - 76)) | (1L << (Virtual - 76)) | (1L << (Void - 76)) | (1L << (Volatile - 76)) | (1L << (Wchar - 76)) | (1L << (LeftParen - 76)) | (1L << (LeftBracket - 76)) | (1L << (Star - 76)) | (1L << (And - 76)) | (1L << (Tilde - 76)) | (1L << (AndAnd - 76)) | (1L << (Colon - 76)) | (1L << (Doublecolon - 76)) | (1L << (Semi - 76)) | (1L << (Ellipsis - 76)) | (1L << (Identifier - 76)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode Semi() { return getToken(PseudoParserParser.Semi, 0); }
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
		enterRule(_localctx, 290, RULE_memberdeclaration);
		int _la;
		try {
			setState(1721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1705);
					attributeSpecifierSeq();
					}
					break;
				}
				setState(1709);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1708);
					declSpecifierSeq();
					}
					break;
				}
				setState(1712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (LeftParen - 87)) | (1L << (LeftBracket - 87)) | (1L << (Star - 87)) | (1L << (And - 87)) | (1L << (Tilde - 87)) | (1L << (AndAnd - 87)) | (1L << (Colon - 87)) | (1L << (Doublecolon - 87)) | (1L << (Ellipsis - 87)) | (1L << (Identifier - 87)))) != 0)) {
					{
					setState(1711);
					memberDeclaratorList();
					}
				}

				setState(1714);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1715);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1716);
				usingDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1717);
				staticAssertDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1718);
				templateDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1719);
				aliasDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1720);
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParserParser.Comma, i);
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
		enterRule(_localctx, 292, RULE_memberDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			memberDeclarator();
			setState(1728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1724);
				match(Comma);
				setState(1725);
				memberDeclarator();
				}
				}
				setState(1730);
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
		public TerminalNode Colon() { return getToken(PseudoParserParser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
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
		enterRule(_localctx, 294, RULE_memberDeclarator);
		int _la;
		try {
			setState(1751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1731);
				declarator();
				setState(1741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1733);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Final || _la==Override) {
						{
						setState(1732);
						virtualSpecifierSeq();
						}
					}

					setState(1736);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Assign) {
						{
						setState(1735);
						pureSpecifier();
						}
					}

					}
					break;
				case 2:
					{
					setState(1739);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBrace || _la==Assign) {
						{
						setState(1738);
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
				setState(1744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1743);
					match(Identifier);
					}
				}

				setState(1747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1746);
					attributeSpecifierSeq();
					}
				}

				setState(1749);
				match(Colon);
				setState(1750);
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
		enterRule(_localctx, 296, RULE_virtualSpecifierSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1753);
				virtualSpecifier();
				}
				}
				setState(1756); 
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
		public TerminalNode Override() { return getToken(PseudoParserParser.Override, 0); }
		public TerminalNode Final() { return getToken(PseudoParserParser.Final, 0); }
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
		enterRule(_localctx, 298, RULE_virtualSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
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
		public TerminalNode Assign() { return getToken(PseudoParserParser.Assign, 0); }
		public TerminalNode OctalLiteral() { return getToken(PseudoParserParser.OctalLiteral, 0); }
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
		enterRule(_localctx, 300, RULE_pureSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			match(Assign);
			setState(1761);
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
		public TerminalNode Colon() { return getToken(PseudoParserParser.Colon, 0); }
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
		enterRule(_localctx, 302, RULE_baseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			match(Colon);
			setState(1765);
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
		public List<TerminalNode> Ellipsis() { return getTokens(PseudoParserParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(PseudoParserParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParserParser.Comma, i);
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
		enterRule(_localctx, 304, RULE_baseSpecifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
			baseSpecifier();
			setState(1769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1768);
				match(Ellipsis);
				}
			}

			setState(1778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1771);
				match(Comma);
				setState(1772);
				baseSpecifier();
				setState(1774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1773);
					match(Ellipsis);
					}
				}

				}
				}
				setState(1780);
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
		public TerminalNode Virtual() { return getToken(PseudoParserParser.Virtual, 0); }
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
		enterRule(_localctx, 306, RULE_baseSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1781);
				attributeSpecifierSeq();
				}
			}

			setState(1796);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Doublecolon:
			case Identifier:
				{
				setState(1784);
				baseTypeSpecifier();
				}
				break;
			case Virtual:
				{
				setState(1785);
				match(Virtual);
				setState(1787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(1786);
					accessSpecifier();
					}
				}

				setState(1789);
				baseTypeSpecifier();
				}
				break;
			case Private:
			case Protected:
			case Public:
				{
				setState(1790);
				accessSpecifier();
				setState(1792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(1791);
					match(Virtual);
					}
				}

				setState(1794);
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
		enterRule(_localctx, 308, RULE_classOrDeclType);
		try {
			setState(1803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1799);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1798);
					nestedNameSpecifier(0);
					}
					break;
				}
				setState(1801);
				className();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1802);
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
		enterRule(_localctx, 310, RULE_baseTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
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
		public TerminalNode Private() { return getToken(PseudoParserParser.Private, 0); }
		public TerminalNode Protected() { return getToken(PseudoParserParser.Protected, 0); }
		public TerminalNode Public() { return getToken(PseudoParserParser.Public, 0); }
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
		enterRule(_localctx, 312, RULE_accessSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1807);
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
		public TerminalNode Operator() { return getToken(PseudoParserParser.Operator, 0); }
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
		enterRule(_localctx, 314, RULE_conversionFunctionId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			match(Operator);
			setState(1810);
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
		enterRule(_localctx, 316, RULE_conversionTypeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			typeSpecifierSeq();
			setState(1814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(1813);
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
		enterRule(_localctx, 318, RULE_conversionDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			pointerOperator();
			setState(1818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(1817);
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
		public TerminalNode Colon() { return getToken(PseudoParserParser.Colon, 0); }
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
		enterRule(_localctx, 320, RULE_constructorInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			match(Colon);
			setState(1821);
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
		public List<TerminalNode> Ellipsis() { return getTokens(PseudoParserParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(PseudoParserParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParserParser.Comma, i);
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
		enterRule(_localctx, 322, RULE_memInitializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			memInitializer();
			setState(1825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1824);
				match(Ellipsis);
				}
			}

			setState(1834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1827);
				match(Comma);
				setState(1828);
				memInitializer();
				setState(1830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1829);
					match(Ellipsis);
					}
				}

				}
				}
				setState(1836);
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
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
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
		enterRule(_localctx, 324, RULE_memInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1837);
			meminitializerid();
			setState(1844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				{
				setState(1838);
				match(LeftParen);
				setState(1840);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(1839);
					expressionList();
					}
					break;
				}
				setState(1842);
				match(RightParen);
				}
				break;
			case LeftBrace:
				{
				setState(1843);
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
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
		enterRule(_localctx, 326, RULE_meminitializerid);
		try {
			setState(1848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1846);
				classOrDeclType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1847);
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
		public TerminalNode Operator() { return getToken(PseudoParserParser.Operator, 0); }
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
		enterRule(_localctx, 328, RULE_operatorFunctionId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			match(Operator);
			setState(1851);
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
		public TerminalNode Operator() { return getToken(PseudoParserParser.Operator, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoParserParser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
		public TerminalNode UserDefinedStringLiteral() { return getToken(PseudoParserParser.UserDefinedStringLiteral, 0); }
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
		enterRule(_localctx, 330, RULE_literalOperatorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			match(Operator);
			setState(1857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(1854);
				match(StringLiteral);
				setState(1855);
				match(Identifier);
				}
				break;
			case UserDefinedStringLiteral:
				{
				setState(1856);
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
		public TerminalNode Template() { return getToken(PseudoParserParser.Template, 0); }
		public TerminalNode Less() { return getToken(PseudoParserParser.Less, 0); }
		public TemplateparameterListContext templateparameterList() {
			return getRuleContext(TemplateparameterListContext.class,0);
		}
		public TerminalNode Greater() { return getToken(PseudoParserParser.Greater, 0); }
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
		enterRule(_localctx, 332, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			match(Template);
			setState(1860);
			match(Less);
			setState(1861);
			templateparameterList();
			setState(1862);
			match(Greater);
			setState(1863);
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
		public List<TerminalNode> Comma() { return getTokens(PseudoParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParserParser.Comma, i);
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
		enterRule(_localctx, 334, RULE_templateparameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			templateParameter();
			setState(1870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1866);
				match(Comma);
				setState(1867);
				templateParameter();
				}
				}
				setState(1872);
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
		enterRule(_localctx, 336, RULE_templateParameter);
		try {
			setState(1875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1873);
				typeParameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1874);
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
		public TerminalNode Class() { return getToken(PseudoParserParser.Class, 0); }
		public TerminalNode Typename_() { return getToken(PseudoParserParser.Typename_, 0); }
		public TerminalNode Assign() { return getToken(PseudoParserParser.Assign, 0); }
		public TheTypeIdContext theTypeId() {
			return getRuleContext(TheTypeIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoParserParser.Template, 0); }
		public TerminalNode Less() { return getToken(PseudoParserParser.Less, 0); }
		public TemplateparameterListContext templateparameterList() {
			return getRuleContext(TemplateparameterListContext.class,0);
		}
		public TerminalNode Greater() { return getToken(PseudoParserParser.Greater, 0); }
		public TerminalNode Ellipsis() { return getToken(PseudoParserParser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
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
		enterRule(_localctx, 338, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Class:
			case Template:
				{
				setState(1882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1877);
					match(Template);
					setState(1878);
					match(Less);
					setState(1879);
					templateparameterList();
					setState(1880);
					match(Greater);
					}
				}

				setState(1884);
				match(Class);
				}
				break;
			case Typename_:
				{
				setState(1885);
				match(Typename_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				{
				setState(1889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1888);
					match(Ellipsis);
					}
				}

				setState(1892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1891);
					match(Identifier);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(1895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1894);
					match(Identifier);
					}
				}

				setState(1897);
				match(Assign);
				setState(1898);
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
		public TerminalNode Less() { return getToken(PseudoParserParser.Less, 0); }
		public TerminalNode Greater() { return getToken(PseudoParserParser.Greater, 0); }
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
		enterRule(_localctx, 340, RULE_simpleTemplateId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			templateName();
			setState(1902);
			match(Less);
			setState(1904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(1903);
				templateArgumentList();
				}
				break;
			}
			setState(1906);
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
		public TerminalNode Less() { return getToken(PseudoParserParser.Less, 0); }
		public TerminalNode Greater() { return getToken(PseudoParserParser.Greater, 0); }
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
		enterRule(_localctx, 342, RULE_templateId);
		try {
			setState(1919);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1908);
				simpleTemplateId();
				}
				break;
			case Operator:
				enterOuterAlt(_localctx, 2);
				{
				setState(1911);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(1909);
					operatorFunctionId();
					}
					break;
				case 2:
					{
					setState(1910);
					literalOperatorId();
					}
					break;
				}
				setState(1913);
				match(Less);
				setState(1915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(1914);
					templateArgumentList();
					}
					break;
				}
				setState(1917);
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
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
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
		enterRule(_localctx, 344, RULE_templateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
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
		public List<TerminalNode> Ellipsis() { return getTokens(PseudoParserParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(PseudoParserParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParserParser.Comma, i);
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
		enterRule(_localctx, 346, RULE_templateArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			templateArgument();
			setState(1925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1924);
				match(Ellipsis);
				}
			}

			setState(1934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1927);
				match(Comma);
				setState(1928);
				templateArgument();
				setState(1930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1929);
					match(Ellipsis);
					}
				}

				}
				}
				setState(1936);
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
		enterRule(_localctx, 348, RULE_templateArgument);
		try {
			setState(1940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1937);
				theTypeId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1938);
				constantExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1939);
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
		public TerminalNode Typename_() { return getToken(PseudoParserParser.Typename_, 0); }
		public NestedNameSpecifierContext nestedNameSpecifier() {
			return getRuleContext(NestedNameSpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudoParserParser.Identifier, 0); }
		public SimpleTemplateIdContext simpleTemplateId() {
			return getRuleContext(SimpleTemplateIdContext.class,0);
		}
		public TerminalNode Template() { return getToken(PseudoParserParser.Template, 0); }
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
		enterRule(_localctx, 350, RULE_typeNameSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1942);
			match(Typename_);
			setState(1943);
			nestedNameSpecifier(0);
			setState(1949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(1944);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1945);
					match(Template);
					}
				}

				setState(1948);
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
		public TerminalNode Template() { return getToken(PseudoParserParser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Extern() { return getToken(PseudoParserParser.Extern, 0); }
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
		enterRule(_localctx, 352, RULE_explicitInstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(1951);
				match(Extern);
				}
			}

			setState(1954);
			match(Template);
			setState(1955);
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
		public TerminalNode Template() { return getToken(PseudoParserParser.Template, 0); }
		public TerminalNode Less() { return getToken(PseudoParserParser.Less, 0); }
		public TerminalNode Greater() { return getToken(PseudoParserParser.Greater, 0); }
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
		enterRule(_localctx, 354, RULE_explicitSpecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			match(Template);
			setState(1958);
			match(Less);
			setState(1959);
			match(Greater);
			setState(1960);
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
		public TerminalNode Try() { return getToken(PseudoParserParser.Try, 0); }
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
		enterRule(_localctx, 356, RULE_tryBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			match(Try);
			setState(1963);
			compoundStatement();
			setState(1964);
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
		public TerminalNode Try() { return getToken(PseudoParserParser.Try, 0); }
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
		enterRule(_localctx, 358, RULE_functionTryBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			match(Try);
			setState(1968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1967);
				constructorInitializer();
				}
			}

			setState(1970);
			compoundStatement();
			setState(1971);
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
		enterRule(_localctx, 360, RULE_handlerSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1974); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1973);
				handler();
				}
				}
				setState(1976); 
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
		public TerminalNode Catch() { return getToken(PseudoParserParser.Catch, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public ExceptionDeclarationContext exceptionDeclaration() {
			return getRuleContext(ExceptionDeclarationContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
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
		enterRule(_localctx, 362, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1978);
			match(Catch);
			setState(1979);
			match(LeftParen);
			setState(1980);
			exceptionDeclaration();
			setState(1981);
			match(RightParen);
			setState(1982);
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
		public TerminalNode Ellipsis() { return getToken(PseudoParserParser.Ellipsis, 0); }
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
		enterRule(_localctx, 364, RULE_exceptionDeclaration);
		int _la;
		try {
			setState(1993);
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
				setState(1985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1984);
					attributeSpecifierSeq();
					}
				}

				setState(1987);
				typeSpecifierSeq();
				setState(1990);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(1988);
					declarator();
					}
					break;
				case 2:
					{
					setState(1989);
					abstractDeclarator();
					}
					break;
				}
				}
				break;
			case Ellipsis:
				enterOuterAlt(_localctx, 2);
				{
				setState(1992);
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
		public TerminalNode Throw() { return getToken(PseudoParserParser.Throw, 0); }
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
		enterRule(_localctx, 366, RULE_throwExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			match(Throw);
			setState(1997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(1996);
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
		enterRule(_localctx, 368, RULE_exceptionSpecification);
		try {
			setState(2001);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(1999);
				dynamicExceptionSpecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2000);
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
		public TerminalNode Throw() { return getToken(PseudoParserParser.Throw, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
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
		enterRule(_localctx, 370, RULE_dynamicExceptionSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2003);
			match(Throw);
			setState(2004);
			match(LeftParen);
			setState(2006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (Auto - 15)) | (1L << (Bool - 15)) | (1L << (Char - 15)) | (1L << (Char16 - 15)) | (1L << (Char32 - 15)) | (1L << (Class - 15)) | (1L << (Const - 15)) | (1L << (Decltype - 15)) | (1L << (Double - 15)) | (1L << (Enum - 15)) | (1L << (Float - 15)) | (1L << (Int - 15)) | (1L << (Long - 15)) | (1L << (Short - 15)) | (1L << (Signed - 15)) | (1L << (Struct - 15)) | (1L << (Typename_ - 15)))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Union - 79)) | (1L << (Unsigned - 79)) | (1L << (Void - 79)) | (1L << (Volatile - 79)) | (1L << (Wchar - 79)) | (1L << (Doublecolon - 79)) | (1L << (Identifier - 79)))) != 0)) {
				{
				setState(2005);
				typeIdList();
				}
			}

			setState(2008);
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
		public List<TerminalNode> Ellipsis() { return getTokens(PseudoParserParser.Ellipsis); }
		public TerminalNode Ellipsis(int i) {
			return getToken(PseudoParserParser.Ellipsis, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudoParserParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudoParserParser.Comma, i);
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
		enterRule(_localctx, 372, RULE_typeIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
			theTypeId();
			setState(2012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(2011);
				match(Ellipsis);
				}
			}

			setState(2021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(2014);
				match(Comma);
				setState(2015);
				theTypeId();
				setState(2017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2016);
					match(Ellipsis);
					}
				}

				}
				}
				setState(2023);
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
		public TerminalNode Noexcept() { return getToken(PseudoParserParser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
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
		enterRule(_localctx, 374, RULE_noeExceptSpecification);
		try {
			setState(2030);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2024);
				match(Noexcept);
				setState(2025);
				match(LeftParen);
				setState(2026);
				constantExpression();
				setState(2027);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2029);
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
		public TerminalNode New() { return getToken(PseudoParserParser.New, 0); }
		public TerminalNode LeftBracket() { return getToken(PseudoParserParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudoParserParser.RightBracket, 0); }
		public TerminalNode Delete() { return getToken(PseudoParserParser.Delete, 0); }
		public TerminalNode Plus() { return getToken(PseudoParserParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(PseudoParserParser.Minus, 0); }
		public TerminalNode Star() { return getToken(PseudoParserParser.Star, 0); }
		public TerminalNode Div() { return getToken(PseudoParserParser.Div, 0); }
		public TerminalNode Mod() { return getToken(PseudoParserParser.Mod, 0); }
		public TerminalNode Caret() { return getToken(PseudoParserParser.Caret, 0); }
		public TerminalNode And() { return getToken(PseudoParserParser.And, 0); }
		public TerminalNode Or() { return getToken(PseudoParserParser.Or, 0); }
		public TerminalNode Tilde() { return getToken(PseudoParserParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(PseudoParserParser.Not, 0); }
		public TerminalNode Assign() { return getToken(PseudoParserParser.Assign, 0); }
		public List<TerminalNode> Greater() { return getTokens(PseudoParserParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(PseudoParserParser.Greater, i);
		}
		public List<TerminalNode> Less() { return getTokens(PseudoParserParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(PseudoParserParser.Less, i);
		}
		public TerminalNode GreaterEqual() { return getToken(PseudoParserParser.GreaterEqual, 0); }
		public TerminalNode PlusAssign() { return getToken(PseudoParserParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(PseudoParserParser.MinusAssign, 0); }
		public TerminalNode StarAssign() { return getToken(PseudoParserParser.StarAssign, 0); }
		public TerminalNode ModAssign() { return getToken(PseudoParserParser.ModAssign, 0); }
		public TerminalNode XorAssign() { return getToken(PseudoParserParser.XorAssign, 0); }
		public TerminalNode AndAssign() { return getToken(PseudoParserParser.AndAssign, 0); }
		public TerminalNode OrAssign() { return getToken(PseudoParserParser.OrAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(PseudoParserParser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(PseudoParserParser.LeftShiftAssign, 0); }
		public TerminalNode Equal() { return getToken(PseudoParserParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(PseudoParserParser.NotEqual, 0); }
		public TerminalNode LessEqual() { return getToken(PseudoParserParser.LessEqual, 0); }
		public TerminalNode AndAnd() { return getToken(PseudoParserParser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(PseudoParserParser.OrOr, 0); }
		public TerminalNode PlusPlus() { return getToken(PseudoParserParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(PseudoParserParser.MinusMinus, 0); }
		public TerminalNode Comma() { return getToken(PseudoParserParser.Comma, 0); }
		public TerminalNode ArrowStar() { return getToken(PseudoParserParser.ArrowStar, 0); }
		public TerminalNode Arrow() { return getToken(PseudoParserParser.Arrow, 0); }
		public TerminalNode LeftParen() { return getToken(PseudoParserParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudoParserParser.RightParen, 0); }
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
		enterRule(_localctx, 376, RULE_theOperator);
		try {
			setState(2085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2032);
				match(New);
				setState(2035);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2033);
					match(LeftBracket);
					setState(2034);
					match(RightBracket);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2037);
				match(Delete);
				setState(2040);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2038);
					match(LeftBracket);
					setState(2039);
					match(RightBracket);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2042);
				match(Plus);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2043);
				match(Minus);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2044);
				match(Star);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2045);
				match(Div);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2046);
				match(Mod);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2047);
				match(Caret);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2048);
				match(And);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2049);
				match(Or);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2050);
				match(Tilde);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2051);
				match(Not);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2052);
				match(Assign);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2053);
				match(Greater);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2054);
				match(Less);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2055);
				match(GreaterEqual);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2056);
				match(PlusAssign);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2057);
				match(MinusAssign);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2058);
				match(StarAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2059);
				match(Assign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2060);
				match(ModAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2061);
				match(XorAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2062);
				match(AndAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2063);
				match(OrAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2064);
				match(Less);
				setState(2065);
				match(Less);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2066);
				match(Greater);
				setState(2067);
				match(Greater);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2068);
				match(RightShiftAssign);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2069);
				match(LeftShiftAssign);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2070);
				match(Equal);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2071);
				match(NotEqual);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2072);
				match(LessEqual);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2073);
				match(GreaterEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2074);
				match(AndAnd);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2075);
				match(OrOr);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2076);
				match(PlusPlus);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2077);
				match(MinusMinus);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2078);
				match(Comma);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2079);
				match(ArrowStar);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2080);
				match(Arrow);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2081);
				match(LeftParen);
				setState(2082);
				match(RightParen);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2083);
				match(LeftBracket);
				setState(2084);
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
		public TerminalNode IntegerLiteral() { return getToken(PseudoParserParser.IntegerLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(PseudoParserParser.CharacterLiteral, 0); }
		public TerminalNode FloatingLiteral() { return getToken(PseudoParserParser.FloatingLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudoParserParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(PseudoParserParser.BooleanLiteral, 0); }
		public TerminalNode PointerLiteral() { return getToken(PseudoParserParser.PointerLiteral, 0); }
		public TerminalNode UserDefinedLiteral() { return getToken(PseudoParserParser.UserDefinedLiteral, 0); }
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
		enterRule(_localctx, 378, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2087);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0095\u082c\4\2\t"+
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
		"\21\5\21\u0209\n\21\3\21\3\21\5\21\u020d\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u021b\n\21\3\21\3\21\5\21\u021f"+
		"\n\21\3\21\3\21\3\21\3\21\5\21\u0225\n\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u022c\n\21\3\21\3\21\3\21\3\21\5\21\u0232\n\21\3\21\3\21\5\21\u0236\n"+
		"\21\7\21\u0238\n\21\f\21\16\21\u023b\13\21\3\22\3\22\3\23\3\23\3\24\5"+
		"\24\u0242\n\24\3\24\3\24\3\24\5\24\u0247\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0254\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u025b\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0267\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0271\n\25\3"+
		"\26\3\26\3\27\5\27\u0276\n\27\3\27\3\27\5\27\u027a\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0281\n\27\3\27\5\27\u0284\n\27\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\5\31\u028c\n\31\3\32\3\32\5\32\u0290\n\32\3\32\5\32\u0293\n\32"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u029a\n\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u02a1\n\33\7\33\u02a3\n\33\f\33\16\33\u02a6\13\33\3\34\3\34\5\34\u02aa"+
		"\n\34\3\34\3\34\5\34\u02ae\n\34\3\35\5\35\u02b1\n\35\3\35\3\35\3\35\5"+
		"\35\u02b6\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u02c5\n\37\3 \3 \3 \7 \u02ca\n \f \16 \u02cd\13 \3!\3"+
		"!\3!\7!\u02d2\n!\f!\16!\u02d5\13!\3\"\3\"\3\"\7\"\u02da\n\"\f\"\16\"\u02dd"+
		"\13\"\3\"\3\"\3\"\3\"\7\"\u02e3\n\"\f\"\16\"\u02e6\13\"\5\"\u02e8\n\""+
		"\3#\3#\3#\3#\7#\u02ee\n#\f#\16#\u02f1\13#\3$\3$\3$\3$\5$\u02f7\n$\3%\3"+
		"%\3%\7%\u02fc\n%\f%\16%\u02ff\13%\3&\3&\3&\7&\u0304\n&\f&\16&\u0307\13"+
		"&\3&\3&\3&\5&\u030c\n&\3\'\3\'\3\'\7\'\u0311\n\'\f\'\16\'\u0314\13\'\3"+
		"(\3(\3(\7(\u0319\n(\f(\16(\u031c\13(\3)\3)\3)\7)\u0321\n)\f)\16)\u0324"+
		"\13)\3*\3*\3*\7*\u0329\n*\f*\16*\u032c\13*\3+\3+\3+\7+\u0331\n+\f+\16"+
		"+\u0334\13+\3,\3,\3,\3,\3,\3,\5,\u033c\n,\3-\3-\3-\3-\3-\3-\5-\u0344\n"+
		"-\3.\3.\3/\3/\3/\7/\u034b\n/\f/\16/\u034e\13/\3\60\3\60\3\61\3\61\5\61"+
		"\u0354\n\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u035c\n\61\3\61\5\61\u035f"+
		"\n\61\3\62\5\62\u0362\n\62\3\62\3\62\3\62\3\62\5\62\u0368\n\62\3\62\3"+
		"\62\3\62\3\63\5\63\u036e\n\63\3\63\3\63\3\64\3\64\5\64\u0374\n\64\3\64"+
		"\3\64\3\65\6\65\u0379\n\65\r\65\16\65\u037a\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\5\66\u0384\n\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u038c\n\66"+
		"\3\67\3\67\5\67\u0390\n\67\3\67\3\67\3\67\3\67\3\67\5\67\u0397\n\67\5"+
		"\67\u0399\n\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\5"+
		"8\u03ad\n8\38\38\58\u03b1\n8\38\38\38\38\58\u03b7\n8\38\38\38\58\u03bc"+
		"\n8\39\39\59\u03c0\n9\3:\5:\u03c3\n:\3:\3:\3:\3;\3;\5;\u03ca\n;\3<\3<"+
		"\3<\3<\3<\5<\u03d1\n<\3<\3<\5<\u03d5\n<\3<\3<\3=\3=\3>\6>\u03dc\n>\r>"+
		"\16>\u03dd\3?\3?\5?\u03e2\n?\3@\3@\3@\3@\3@\3@\3@\3@\5@\u03ec\n@\3A\3"+
		"A\3A\5A\u03f1\nA\3A\3A\3A\3A\3B\5B\u03f8\nB\3B\5B\u03fb\nB\3B\3B\3B\5"+
		"B\u0400\nB\3B\3B\3B\5B\u0405\nB\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3E\3E\3"+
		"E\3F\3F\3F\3F\3F\3F\5F\u041a\nF\3G\6G\u041d\nG\rG\16G\u041e\3G\5G\u0422"+
		"\nG\3H\3H\3I\3I\3J\3J\3K\3K\3K\5K\u042d\nK\3L\3L\3L\3L\5L\u0433\nL\3M"+
		"\6M\u0436\nM\rM\16M\u0437\3M\5M\u043b\nM\3N\6N\u043e\nN\rN\16N\u043f\3"+
		"N\5N\u0443\nN\3O\5O\u0446\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\5O\u045c\nO\3P\3P\3P\3P\5P\u0462\nP\3Q\3Q\3Q\3Q\5"+
		"Q\u0468\nQ\3Q\3Q\3R\3R\5R\u046e\nR\3R\5R\u0471\nR\3R\3R\3R\3R\5R\u0477"+
		"\nR\3R\3R\5R\u047b\nR\3R\3R\5R\u047f\nR\3R\5R\u0482\nR\3S\3S\3T\3T\3T"+
		"\3T\5T\u048a\nT\5T\u048c\nT\3T\3T\3U\3U\5U\u0492\nU\3U\5U\u0495\nU\3U"+
		"\5U\u0498\nU\3U\5U\u049b\nU\3V\3V\5V\u049f\nV\3V\3V\5V\u04a3\nV\3V\3V"+
		"\3W\3W\5W\u04a9\nW\3X\3X\3X\3Y\3Y\3Y\7Y\u04b1\nY\fY\16Y\u04b4\13Y\3Z\3"+
		"Z\3Z\5Z\u04b9\nZ\3[\3[\3\\\3\\\5\\\u04bf\n\\\3]\3]\3^\5^\u04c4\n^\3^\3"+
		"^\3^\5^\u04c9\n^\3^\3^\5^\u04cd\n^\3^\3^\3_\3_\3`\3`\3`\3`\3`\3`\3a\5"+
		"a\u04da\na\3a\3a\3b\3b\5b\u04e0\nb\3b\3b\5b\u04e4\nb\3b\3b\3b\3c\5c\u04ea"+
		"\nc\3c\3c\3c\5c\u04ef\nc\3c\3c\3c\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\5e\u04fe"+
		"\ne\3e\3e\5e\u0502\ne\3f\6f\u0505\nf\rf\16f\u0506\3g\3g\3g\5g\u050c\n"+
		"g\3g\3g\3g\5g\u0511\ng\3h\3h\3h\3h\5h\u0517\nh\3h\5h\u051a\nh\3h\3h\3"+
		"i\3i\3i\7i\u0521\ni\fi\16i\u0524\13i\3i\5i\u0527\ni\3j\3j\3j\5j\u052c"+
		"\nj\3j\3j\5j\u0530\nj\3k\3k\3l\3l\5l\u0536\nl\3l\3l\3m\6m\u053b\nm\rm"+
		"\16m\u053c\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\6n\u054c\nn\rn\16n\u054d"+
		"\5n\u0550\nn\3o\3o\3o\7o\u0555\no\fo\16o\u0558\13o\3p\3p\5p\u055c\np\3"+
		"q\3q\3q\3q\3q\5q\u0563\nq\3r\3r\5r\u0567\nr\7r\u0569\nr\fr\16r\u056c\13"+
		"r\3r\3r\3s\3s\3s\5s\u0573\ns\3s\3s\3s\3s\5s\u0579\ns\3s\3s\3s\3s\5s\u057f"+
		"\ns\3s\3s\5s\u0583\ns\5s\u0585\ns\7s\u0587\ns\fs\16s\u058a\13s\3t\3t\5"+
		"t\u058e\nt\3t\3t\5t\u0592\nt\3t\5t\u0595\nt\3t\5t\u0598\nt\3t\5t\u059b"+
		"\nt\3u\3u\3u\5u\u05a0\nu\3v\3v\5v\u05a4\nv\3v\5v\u05a7\nv\3v\3v\5v\u05ab"+
		"\nv\3v\5v\u05ae\nv\5v\u05b0\nv\3w\6w\u05b3\nw\rw\16w\u05b4\3x\3x\3y\3"+
		"y\3z\5z\u05bc\nz\3z\3z\3{\3{\5{\u05c2\n{\3|\3|\5|\u05c6\n|\3|\3|\3|\3"+
		"|\5|\u05cc\n|\3}\3}\6}\u05d0\n}\r}\16}\u05d1\3}\5}\u05d5\n}\5}\u05d7\n"+
		"}\3~\3~\3~\3~\5~\u05dd\n~\3~\3~\5~\u05e1\n~\3~\3~\3~\3~\5~\u05e7\n~\3"+
		"~\3~\3~\3~\3~\5~\u05ee\n~\3~\3~\5~\u05f2\n~\5~\u05f4\n~\7~\u05f6\n~\f"+
		"~\16~\u05f9\13~\3\177\7\177\u05fc\n\177\f\177\16\177\u05ff\13\177\3\177"+
		"\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u060a\n\u0080\3\u0080\3\u0080\5\u0080\u060e\n\u0080\5\u0080\u0610\n\u0080"+
		"\7\u0080\u0612\n\u0080\f\u0080\16\u0080\u0615\13\u0080\3\u0081\3\u0081"+
		"\5\u0081\u0619\n\u0081\3\u0081\5\u0081\u061c\n\u0081\3\u0082\3\u0082\3"+
		"\u0082\7\u0082\u0621\n\u0082\f\u0082\16\u0082\u0624\13\u0082\3\u0083\5"+
		"\u0083\u0627\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u062c\n\u0083\5\u0083"+
		"\u062e\n\u0083\3\u0083\3\u0083\5\u0083\u0632\n\u0083\3\u0084\3\u0084\5"+
		"\u0084\u0636\n\u0084\3\u0084\5\u0084\u0639\n\u0084\3\u0084\3\u0084\5\u0084"+
		"\u063d\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0086\5\u0086\u0647\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\5\u0086\u064e\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087"+
		"\u0655\n\u0087\3\u0088\3\u0088\3\u0088\5\u0088\u065a\n\u0088\3\u0089\3"+
		"\u0089\5\u0089\u065e\n\u0089\3\u008a\3\u008a\5\u008a\u0662\n\u008a\3\u008a"+
		"\3\u008a\3\u008a\5\u008a\u0667\n\u008a\7\u008a\u0669\n\u008a\f\u008a\16"+
		"\u008a\u066c\13\u008a\3\u008b\3\u008b\3\u008b\5\u008b\u0671\n\u008b\5"+
		"\u008b\u0673\n\u008b\3\u008b\3\u008b\3\u008c\3\u008c\5\u008c\u0679\n\u008c"+
		"\3\u008d\3\u008d\3\u008d\5\u008d\u067e\n\u008d\3\u008d\3\u008d\3\u008e"+
		"\3\u008e\5\u008e\u0684\n\u008e\3\u008e\3\u008e\5\u008e\u0688\n\u008e\5"+
		"\u008e\u068a\n\u008e\3\u008e\5\u008e\u068d\n\u008e\3\u008e\3\u008e\5\u008e"+
		"\u0691\n\u008e\3\u008e\3\u008e\5\u008e\u0695\n\u008e\5\u008e\u0697\n\u008e"+
		"\5\u008e\u0699\n\u008e\3\u008f\5\u008f\u069c\n\u008f\3\u008f\3\u008f\3"+
		"\u0090\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\6\u0092"+
		"\u06a8\n\u0092\r\u0092\16\u0092\u06a9\3\u0093\5\u0093\u06ad\n\u0093\3"+
		"\u0093\5\u0093\u06b0\n\u0093\3\u0093\5\u0093\u06b3\n\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u06bc\n\u0093\3\u0094"+
		"\3\u0094\3\u0094\7\u0094\u06c1\n\u0094\f\u0094\16\u0094\u06c4\13\u0094"+
		"\3\u0095\3\u0095\5\u0095\u06c8\n\u0095\3\u0095\5\u0095\u06cb\n\u0095\3"+
		"\u0095\5\u0095\u06ce\n\u0095\5\u0095\u06d0\n\u0095\3\u0095\5\u0095\u06d3"+
		"\n\u0095\3\u0095\5\u0095\u06d6\n\u0095\3\u0095\3\u0095\5\u0095\u06da\n"+
		"\u0095\3\u0096\6\u0096\u06dd\n\u0096\r\u0096\16\u0096\u06de\3\u0097\3"+
		"\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u009a"+
		"\3\u009a\5\u009a\u06ec\n\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u06f1\n"+
		"\u009a\7\u009a\u06f3\n\u009a\f\u009a\16\u009a\u06f6\13\u009a\3\u009b\5"+
		"\u009b\u06f9\n\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u06fe\n\u009b\3\u009b"+
		"\3\u009b\3\u009b\5\u009b\u0703\n\u009b\3\u009b\3\u009b\5\u009b\u0707\n"+
		"\u009b\3\u009c\5\u009c\u070a\n\u009c\3\u009c\3\u009c\5\u009c\u070e\n\u009c"+
		"\3\u009d\3\u009d\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0"+
		"\5\u00a0\u0719\n\u00a0\3\u00a1\3\u00a1\5\u00a1\u071d\n\u00a1\3\u00a2\3"+
		"\u00a2\3\u00a2\3\u00a3\3\u00a3\5\u00a3\u0724\n\u00a3\3\u00a3\3\u00a3\3"+
		"\u00a3\5\u00a3\u0729\n\u00a3\7\u00a3\u072b\n\u00a3\f\u00a3\16\u00a3\u072e"+
		"\13\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4\u0733\n\u00a4\3\u00a4\3\u00a4"+
		"\5\u00a4\u0737\n\u00a4\3\u00a5\3\u00a5\5\u00a5\u073b\n\u00a5\3\u00a6\3"+
		"\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0744\n\u00a7\3"+
		"\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9"+
		"\7\u00a9\u074f\n\u00a9\f\u00a9\16\u00a9\u0752\13\u00a9\3\u00aa\3\u00aa"+
		"\5\u00aa\u0756\n\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab"+
		"\u075d\n\u00ab\3\u00ab\3\u00ab\5\u00ab\u0761\n\u00ab\3\u00ab\5\u00ab\u0764"+
		"\n\u00ab\3\u00ab\5\u00ab\u0767\n\u00ab\3\u00ab\5\u00ab\u076a\n\u00ab\3"+
		"\u00ab\3\u00ab\5\u00ab\u076e\n\u00ab\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0773"+
		"\n\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u077a\n\u00ad"+
		"\3\u00ad\3\u00ad\5\u00ad\u077e\n\u00ad\3\u00ad\3\u00ad\5\u00ad\u0782\n"+
		"\u00ad\3\u00ae\3\u00ae\3\u00af\3\u00af\5\u00af\u0788\n\u00af\3\u00af\3"+
		"\u00af\3\u00af\5\u00af\u078d\n\u00af\7\u00af\u078f\n\u00af\f\u00af\16"+
		"\u00af\u0792\13\u00af\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u0797\n\u00b0\3"+
		"\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u079d\n\u00b1\3\u00b1\5\u00b1\u07a0"+
		"\n\u00b1\3\u00b2\5\u00b2\u07a3\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b5"+
		"\3\u00b5\5\u00b5\u07b3\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b6\6\u00b6"+
		"\u07b9\n\u00b6\r\u00b6\16\u00b6\u07ba\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b8\5\u00b8\u07c4\n\u00b8\3\u00b8\3\u00b8\3\u00b8"+
		"\5\u00b8\u07c9\n\u00b8\3\u00b8\5\u00b8\u07cc\n\u00b8\3\u00b9\3\u00b9\5"+
		"\u00b9\u07d0\n\u00b9\3\u00ba\3\u00ba\5\u00ba\u07d4\n\u00ba\3\u00bb\3\u00bb"+
		"\3\u00bb\5\u00bb\u07d9\n\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\5\u00bc"+
		"\u07df\n\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u07e4\n\u00bc\7\u00bc\u07e6"+
		"\n\u00bc\f\u00bc\16\u00bc\u07e9\13\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\5\u00bd\u07f1\n\u00bd\3\u00be\3\u00be\3\u00be\5\u00be"+
		"\u07f6\n\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u07fb\n\u00be\3\u00be\3"+
		"\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0828\n\u00be"+
		"\3\u00bf\3\u00bf\3\u00bf\2\b\f \64\u00e4\u00fa\u00fe\u00c0\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150"+
		"\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168"+
		"\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\2\27\4\2"+
		"eeii\6\2\34\34##>>EE\4\2\u0080\u0080\u0085\u0085\4\2_aeh\4\2\177\177\u0086"+
		"\u0086\3\2ac\3\2_`\3\2|}\4\2jkxy\3\2vw\4\2iilu\7\2((\63\63==CCJJ\5\2&"+
		"&\60\60TT\4\2\31\31FF\3\2Y^\4\2eezz\4\2\32\32VV\3\2\37 \4\2**99\3\2:<"+
		"\3\2\3\t\2\u090c\2\u017f\3\2\2\2\4\u018f\3\2\2\2\6\u0193\3\2\2\2\b\u019f"+
		"\3\2\2\2\n\u01a1\3\2\2\2\f\u01a7\3\2\2\2\16\u01bd\3\2\2\2\20\u01c3\3\2"+
		"\2\2\22\u01cf\3\2\2\2\24\u01d1\3\2\2\2\26\u01d3\3\2\2\2\30\u01e0\3\2\2"+
		"\2\32\u01e7\3\2\2\2\34\u01ea\3\2\2\2\36\u01ef\3\2\2\2 \u021e\3\2\2\2\""+
		"\u023c\3\2\2\2$\u023e\3\2\2\2&\u0253\3\2\2\2(\u0270\3\2\2\2*\u0272\3\2"+
		"\2\2,\u0275\3\2\2\2.\u0285\3\2\2\2\60\u0289\3\2\2\2\62\u0292\3\2\2\2\64"+
		"\u0294\3\2\2\2\66\u02ad\3\2\2\28\u02b0\3\2\2\2:\u02b9\3\2\2\2<\u02c4\3"+
		"\2\2\2>\u02c6\3\2\2\2@\u02ce\3\2\2\2B\u02e7\3\2\2\2D\u02e9\3\2\2\2F\u02f6"+
		"\3\2\2\2H\u02f8\3\2\2\2J\u030b\3\2\2\2L\u030d\3\2\2\2N\u0315\3\2\2\2P"+
		"\u031d\3\2\2\2R\u0325\3\2\2\2T\u032d\3\2\2\2V\u0335\3\2\2\2X\u0343\3\2"+
		"\2\2Z\u0345\3\2\2\2\\\u0347\3\2\2\2^\u034f\3\2\2\2`\u035e\3\2\2\2b\u0361"+
		"\3\2\2\2d\u036d\3\2\2\2f\u0371\3\2\2\2h\u0378\3\2\2\2j\u038b\3\2\2\2l"+
		"\u0398\3\2\2\2n\u03bb\3\2\2\2p\u03bf\3\2\2\2r\u03c2\3\2\2\2t\u03c9\3\2"+
		"\2\2v\u03d4\3\2\2\2x\u03d8\3\2\2\2z\u03db\3\2\2\2|\u03e1\3\2\2\2~\u03eb"+
		"\3\2\2\2\u0080\u03ed\3\2\2\2\u0082\u0404\3\2\2\2\u0084\u0406\3\2\2\2\u0086"+
		"\u040e\3\2\2\2\u0088\u0410\3\2\2\2\u008a\u0419\3\2\2\2\u008c\u041c\3\2"+
		"\2\2\u008e\u0423\3\2\2\2\u0090\u0425\3\2\2\2\u0092\u0427\3\2\2\2\u0094"+
		"\u042c\3\2\2\2\u0096\u0432\3\2\2\2\u0098\u0435\3\2\2\2\u009a\u043d\3\2"+
		"\2\2\u009c\u045b\3\2\2\2\u009e\u0461\3\2\2\2\u00a0\u0463\3\2\2\2\u00a2"+
		"\u0481\3\2\2\2\u00a4\u0483\3\2\2\2\u00a6\u0485\3\2\2\2\u00a8\u048f\3\2"+
		"\2\2\u00aa\u049c\3\2\2\2\u00ac\u04a6\3\2\2\2\u00ae\u04aa\3\2\2\2\u00b0"+
		"\u04ad\3\2\2\2\u00b2\u04b5\3\2\2\2\u00b4\u04ba\3\2\2\2\u00b6\u04be\3\2"+
		"\2\2\u00b8\u04c0\3\2\2\2\u00ba\u04c3\3\2\2\2\u00bc\u04d0\3\2\2\2\u00be"+
		"\u04d2\3\2\2\2\u00c0\u04d9\3\2\2\2\u00c2\u04dd\3\2\2\2\u00c4\u04e9\3\2"+
		"\2\2\u00c6\u04f3\3\2\2\2\u00c8\u04f9\3\2\2\2\u00ca\u0504\3\2\2\2\u00cc"+
		"\u0510\3\2\2\2\u00ce\u0512\3\2\2\2\u00d0\u051d\3\2\2\2\u00d2\u052b\3\2"+
		"\2\2\u00d4\u0531\3\2\2\2\u00d6\u0533\3\2\2\2\u00d8\u053a\3\2\2\2\u00da"+
		"\u054f\3\2\2\2\u00dc\u0551\3\2\2\2\u00de\u0559\3\2\2\2\u00e0\u0562\3\2"+
		"\2\2\u00e2\u056a\3\2\2\2\u00e4\u0578\3\2\2\2\u00e6\u058b\3\2\2\2\u00e8"+
		"\u059c\3\2\2\2\u00ea\u05af\3\2\2\2\u00ec\u05b2\3\2\2\2\u00ee\u05b6\3\2"+
		"\2\2\u00f0\u05b8\3\2\2\2\u00f2\u05bb\3\2\2\2\u00f4\u05bf\3\2\2\2\u00f6"+
		"\u05cb\3\2\2\2\u00f8\u05d6\3\2\2\2\u00fa\u05e6\3\2\2\2\u00fc\u05fd\3\2"+
		"\2\2\u00fe\u0602\3\2\2\2\u0100\u0616\3\2\2\2\u0102\u061d\3\2\2\2\u0104"+
		"\u0626\3\2\2\2\u0106\u0633\3\2\2\2\u0108\u0640\3\2\2\2\u010a\u064d\3\2"+
		"\2\2\u010c\u0654\3\2\2\2\u010e\u0659\3\2\2\2\u0110\u065d\3\2\2\2\u0112"+
		"\u065f\3\2\2\2\u0114\u066d\3\2\2\2\u0116\u0678\3\2\2\2\u0118\u067a\3\2"+
		"\2\2\u011a\u0698\3\2\2\2\u011c\u069b\3\2\2\2\u011e\u069f\3\2\2\2\u0120"+
		"\u06a1\3\2\2\2\u0122\u06a7\3\2\2\2\u0124\u06bb\3\2\2\2\u0126\u06bd\3\2"+
		"\2\2\u0128\u06d9\3\2\2\2\u012a\u06dc\3\2\2\2\u012c\u06e0\3\2\2\2\u012e"+
		"\u06e2\3\2\2\2\u0130\u06e6\3\2\2\2\u0132\u06e9\3\2\2\2\u0134\u06f8\3\2"+
		"\2\2\u0136\u070d\3\2\2\2\u0138\u070f\3\2\2\2\u013a\u0711\3\2\2\2\u013c"+
		"\u0713\3\2\2\2\u013e\u0716\3\2\2\2\u0140\u071a\3\2\2\2\u0142\u071e\3\2"+
		"\2\2\u0144\u0721\3\2\2\2\u0146\u072f\3\2\2\2\u0148\u073a\3\2\2\2\u014a"+
		"\u073c\3\2\2\2\u014c\u073f\3\2\2\2\u014e\u0745\3\2\2\2\u0150\u074b\3\2"+
		"\2\2\u0152\u0755\3\2\2\2\u0154\u0760\3\2\2\2\u0156\u076f\3\2\2\2\u0158"+
		"\u0781\3\2\2\2\u015a\u0783\3\2\2\2\u015c\u0785\3\2\2\2\u015e\u0796\3\2"+
		"\2\2\u0160\u0798\3\2\2\2\u0162\u07a2\3\2\2\2\u0164\u07a7\3\2\2\2\u0166"+
		"\u07ac\3\2\2\2\u0168\u07b0\3\2\2\2\u016a\u07b8\3\2\2\2\u016c\u07bc\3\2"+
		"\2\2\u016e\u07cb\3\2\2\2\u0170\u07cd\3\2\2\2\u0172\u07d3\3\2\2\2\u0174"+
		"\u07d5\3\2\2\2\u0176\u07dc\3\2\2\2\u0178\u07f0\3\2\2\2\u017a\u0827\3\2"+
		"\2\2\u017c\u0829\3\2\2\2\u017e\u0180\5z>\2\u017f\u017e\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7\2\2\3\u0182\3\3\2\2\2\u0183"+
		"\u0185\5\u017c\u00bf\2\u0184\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0190\3\2\2\2\u0188\u0190\7I\2\2\u0189"+
		"\u018a\7Y\2\2\u018a\u018b\5\\/\2\u018b\u018c\7Z\2\2\u018c\u0190\3\2\2"+
		"\2\u018d\u0190\5\6\4\2\u018e\u0190\5\16\b\2\u018f\u0184\3\2\2\2\u018f"+
		"\u0188\3\2\2\2\u018f\u0189\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2"+
		"\2\2\u0190\5\3\2\2\2\u0191\u0194\5\b\5\2\u0192\u0194\5\n\6\2\u0193\u0191"+
		"\3\2\2\2\u0193\u0192\3\2\2\2\u0194\7\3\2\2\2\u0195\u01a0\7\u0088\2\2\u0196"+
		"\u01a0\5\u014a\u00a6\2\u0197\u01a0\5\u013c\u009f\2\u0198\u01a0\5\u014c"+
		"\u00a7\2\u0199\u019c\7g\2\2\u019a\u019d\5\u0116\u008c\2\u019b\u019d\5"+
		"\u00a0Q\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2\2"+
		"\u019e\u01a0\5\u0158\u00ad\2\u019f\u0195\3\2\2\2\u019f\u0196\3\2\2\2\u019f"+
		"\u0197\3\2\2\2\u019f\u0198\3\2\2\2\u019f\u0199\3\2\2\2\u019f\u019e\3\2"+
		"\2\2\u01a0\t\3\2\2\2\u01a1\u01a3\5\f\7\2\u01a2\u01a4\7H\2\2\u01a3\u01a2"+
		"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\5\b\5\2\u01a6"+
		"\13\3\2\2\2\u01a7\u01ab\b\7\1\2\u01a8\u01ac\5\u009eP\2\u01a9\u01ac\5\u00b6"+
		"\\\2\u01aa\u01ac\5\u00a0Q\2\u01ab\u01a8\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7\u0083"+
		"\2\2\u01ae\u01ba\3\2\2\2\u01af\u01b5\f\3\2\2\u01b0\u01b6\7\u0088\2\2\u01b1"+
		"\u01b3\7H\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b6\5\u0156\u00ac\2\u01b5\u01b0\3\2\2\2\u01b5\u01b2\3\2\2"+
		"\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\7\u0083\2\2\u01b8\u01af\3\2\2\2\u01b9"+
		"\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\r\3\2\2\2"+
		"\u01bc\u01ba\3\2\2\2\u01bd\u01bf\5\20\t\2\u01be\u01c0\5\36\20\2\u01bf"+
		"\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\5f"+
		"\64\2\u01c2\17\3\2\2\2\u01c3\u01c5\7[\2\2\u01c4\u01c6\5\22\n\2\u01c5\u01c4"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7\\\2\2\u01c8"+
		"\21\3\2\2\2\u01c9\u01d0\5\26\f\2\u01ca\u01cd\5\24\13\2\u01cb\u01cc\7~"+
		"\2\2\u01cc\u01ce\5\26\f\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01d0\3\2\2\2\u01cf\u01c9\3\2\2\2\u01cf\u01ca\3\2\2\2\u01d0\23\3\2\2"+
		"\2\u01d1\u01d2\t\2\2\2\u01d2\25\3\2\2\2\u01d3\u01d8\5\30\r\2\u01d4\u01d5"+
		"\7~\2\2\u01d5\u01d7\5\30\r\2\u01d6\u01d4\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2"+
		"\2\2\u01db\u01dd\7\u0087\2\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\27\3\2\2\2\u01de\u01e1\5\32\16\2\u01df\u01e1\5\34\17\2\u01e0\u01de\3"+
		"\2\2\2\u01e0\u01df\3\2\2\2\u01e1\31\3\2\2\2\u01e2\u01e4\7e\2\2\u01e3\u01e2"+
		"\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e8\7\u0088\2"+
		"\2\u01e6\u01e8\7I\2\2\u01e7\u01e3\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8\33"+
		"\3\2\2\2\u01e9\u01eb\7e\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ed\7\u0088\2\2\u01ed\u01ee\5\u010c\u0087\2\u01ee"+
		"\35\3\2\2\2\u01ef\u01f1\7Y\2\2\u01f0\u01f2\5\u0100\u0081\2\u01f1\u01f0"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\7Z\2\2\u01f4"+
		"\u01f6\7\63\2\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3"+
		"\2\2\2\u01f7\u01f9\5\u0172\u00ba\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2"+
		"\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01fc\5\u00caf\2\u01fb\u01fa\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ff\5\u00e8u\2\u01fe\u01fd"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\37\3\2\2\2\u0200\u0201\b\21\1\2\u0201"+
		"\u021f\5\4\3\2\u0202\u0205\5\u009cO\2\u0203\u0205\5\u0160\u00b1\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205\u020c\3\2\2\2\u0206\u0208\7Y"+
		"\2\2\u0207\u0209\5$\23\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020d\7Z\2\2\u020b\u020d\5\u0114\u008b\2\u020c\u0206"+
		"\3\2\2\2\u020c\u020b\3\2\2\2\u020d\u021f\3\2\2\2\u020e\u020f\t\3\2\2\u020f"+
		"\u0210\7j\2\2\u0210\u0211\5\u00f4{\2\u0211\u0212\7k\2\2\u0212\u0213\7"+
		"Y\2\2\u0213\u0214\5\\/\2\u0214\u0215\7Z\2\2\u0215\u021f\3\2\2\2\u0216"+
		"\u0217\5\"\22\2\u0217\u021a\7Y\2\2\u0218\u021b\5\\/\2\u0219\u021b\5\u00f4"+
		"{\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021d\7Z\2\2\u021d\u021f\3\2\2\2\u021e\u0200\3\2\2\2\u021e\u0204\3\2"+
		"\2\2\u021e\u020e\3\2\2\2\u021e\u0216\3\2\2\2\u021f\u0239\3\2\2\2\u0220"+
		"\u0221\f\b\2\2\u0221\u0224\7[\2\2\u0222\u0225\5\\/\2\u0223\u0225\5\u0114"+
		"\u008b\2\u0224\u0222\3\2\2\2\u0224\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"\u0227\7\\\2\2\u0227\u0238\3\2\2\2\u0228\u0229\f\7\2\2\u0229\u022b\7Y"+
		"\2\2\u022a\u022c\5$\23\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u0238\7Z\2\2\u022e\u022f\f\5\2\2\u022f\u0235\t\4"+
		"\2\2\u0230\u0232\7H\2\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0236\5\6\4\2\u0234\u0236\5&\24\2\u0235\u0231\3\2"+
		"\2\2\u0235\u0234\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0220\3\2\2\2\u0237"+
		"\u0228\3\2\2\2\u0237\u022e\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2"+
		"\2\2\u0239\u023a\3\2\2\2\u023a!\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023d"+
		"\7O\2\2\u023d#\3\2\2\2\u023e\u023f\5\u0112\u008a\2\u023f%\3\2\2\2\u0240"+
		"\u0242\5\f\7\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0246\3\2"+
		"\2\2\u0243\u0244\5\u009eP\2\u0244\u0245\7\u0083\2\2\u0245\u0247\3\2\2"+
		"\2\u0246\u0243\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249"+
		"\7g\2\2\u0249\u0254\5\u009eP\2\u024a\u024b\5\f\7\2\u024b\u024c\7H\2\2"+
		"\u024c\u024d\5\u0156\u00ac\2\u024d\u024e\7\u0083\2\2\u024e\u024f\7g\2"+
		"\2\u024f\u0250\5\u009eP\2\u0250\u0254\3\2\2\2\u0251\u0252\7g\2\2\u0252"+
		"\u0254\5\u00a0Q\2\u0253\u0241\3\2\2\2\u0253\u024a\3\2\2\2\u0253\u0251"+
		"\3\2\2\2\u0254\'\3\2\2\2\u0255\u0271\5 \21\2\u0256\u025b\7|\2\2\u0257"+
		"\u025b\7}\2\2\u0258\u025b\5*\26\2\u0259\u025b\7B\2\2\u025a\u0256\3\2\2"+
		"\2\u025a\u0257\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u0259\3\2\2\2\u025b\u025c"+
		"\3\2\2\2\u025c\u0271\5(\25\2\u025d\u0266\7B\2\2\u025e\u025f\7Y\2\2\u025f"+
		"\u0260\5\u00f4{\2\u0260\u0261\7Z\2\2\u0261\u0267\3\2\2\2\u0262\u0263\7"+
		"\u0087\2\2\u0263\u0264\7Y\2\2\u0264\u0265\7\u0088\2\2\u0265\u0267\7Z\2"+
		"\2\u0266\u025e\3\2\2\2\u0266\u0262\3\2\2\2\u0267\u0271\3\2\2\2\u0268\u0269"+
		"\7\17\2\2\u0269\u026a\7Y\2\2\u026a\u026b\5\u00f4{\2\u026b\u026c\7Z\2\2"+
		"\u026c\u0271\3\2\2\2\u026d\u0271\5:\36\2\u026e\u0271\5,\27\2\u026f\u0271"+
		"\58\35\2\u0270\u0255\3\2\2\2\u0270\u025a\3\2\2\2\u0270\u025d\3\2\2\2\u0270"+
		"\u0268\3\2\2\2\u0270\u026d\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2"+
		"\2\2\u0271)\3\2\2\2\u0272\u0273\t\5\2\2\u0273+\3\2\2\2\u0274\u0276\7\u0083"+
		"\2\2\u0275\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u0279\7\65\2\2\u0278\u027a\5.\30\2\u0279\u0278\3\2\2\2\u0279\u027a\3"+
		"\2\2\2\u027a\u0280\3\2\2\2\u027b\u0281\5\60\31\2\u027c\u027d\7Y\2\2\u027d"+
		"\u027e\5\u00f4{\2\u027e\u027f\7Z\2\2\u027f\u0281\3\2\2\2\u0280\u027b\3"+
		"\2\2\2\u0280\u027c\3\2\2\2\u0281\u0283\3\2\2\2\u0282\u0284\5\66\34\2\u0283"+
		"\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284-\3\2\2\2\u0285\u0286\7Y\2\2\u0286"+
		"\u0287\5$\23\2\u0287\u0288\7Z\2\2\u0288/\3\2\2\2\u0289\u028b\5\u0098M"+
		"\2\u028a\u028c\5\62\32\2\u028b\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\61\3\2\2\2\u028d\u028f\5\u00eav\2\u028e\u0290\5\62\32\2\u028f\u028e\3"+
		"\2\2\2\u028f\u0290\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u0293\5\64\33\2\u0292"+
		"\u028d\3\2\2\2\u0292\u0291\3\2\2\2\u0293\63\3\2\2\2\u0294\u0295\b\33\1"+
		"\2\u0295\u0296\7[\2\2\u0296\u0297\5\\/\2\u0297\u0299\7\\\2\2\u0298\u029a"+
		"\5\u00caf\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u02a4\3\2\2"+
		"\2\u029b\u029c\f\3\2\2\u029c\u029d\7[\2\2\u029d\u029e\5^\60\2\u029e\u02a0"+
		"\7\\\2\2\u029f\u02a1\5\u00caf\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2"+
		"\2\u02a1\u02a3\3\2\2\2\u02a2\u029b\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2"+
		"\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\65\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7"+
		"\u02a9\7Y\2\2\u02a8\u02aa\5$\23\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2"+
		"\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ae\7Z\2\2\u02ac\u02ae\5\u0114\u008b"+
		"\2\u02ad\u02a7\3\2\2\2\u02ad\u02ac\3\2\2\2\u02ae\67\3\2\2\2\u02af\u02b1"+
		"\7\u0083\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2"+
		"\2\u02b2\u02b5\7 \2\2\u02b3\u02b4\7[\2\2\u02b4\u02b6\7\\\2\2\u02b5\u02b3"+
		"\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\5<\37\2\u02b8"+
		"9\3\2\2\2\u02b9\u02ba\7\66\2\2\u02ba\u02bb\7Y\2\2\u02bb\u02bc\5\\/\2\u02bc"+
		"\u02bd\7Z\2\2\u02bd;\3\2\2\2\u02be\u02c5\5(\25\2\u02bf\u02c0\7Y\2\2\u02c0"+
		"\u02c1\5\u00f4{\2\u02c1\u02c2\7Z\2\2\u02c2\u02c3\5<\37\2\u02c3\u02c5\3"+
		"\2\2\2\u02c4\u02be\3\2\2\2\u02c4\u02bf\3\2\2\2\u02c5=\3\2\2\2\u02c6\u02cb"+
		"\5<\37\2\u02c7\u02c8\t\6\2\2\u02c8\u02ca\5<\37\2\u02c9\u02c7\3\2\2\2\u02ca"+
		"\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc?\3\2\2\2"+
		"\u02cd\u02cb\3\2\2\2\u02ce\u02d3\5> \2\u02cf\u02d0\t\7\2\2\u02d0\u02d2"+
		"\5> \2\u02d1\u02cf\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3"+
		"\u02d4\3\2\2\2\u02d4A\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02db\5@!\2\u02d7"+
		"\u02d8\t\b\2\2\u02d8\u02da\5@!\2\u02d9\u02d7\3\2\2\2\u02da\u02dd\3\2\2"+
		"\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02e8\3\2\2\2\u02dd\u02db"+
		"\3\2\2\2\u02de\u02df\t\t\2\2\u02df\u02e0\5@!\2\u02e0\u02e1\b\"\1\2\u02e1"+
		"\u02e3\3\2\2\2\u02e2\u02de\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2"+
		"\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e7"+
		"\u02d6\3\2\2\2\u02e7\u02e4\3\2\2\2\u02e8C\3\2\2\2\u02e9\u02ef\5B\"\2\u02ea"+
		"\u02eb\5F$\2\u02eb\u02ec\5B\"\2\u02ec\u02ee\3\2\2\2\u02ed\u02ea\3\2\2"+
		"\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0E"+
		"\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3\7k\2\2\u02f3\u02f7\7k\2\2\u02f4"+
		"\u02f5\7j\2\2\u02f5\u02f7\7j\2\2\u02f6\u02f2\3\2\2\2\u02f6\u02f4\3\2\2"+
		"\2\u02f7G\3\2\2\2\u02f8\u02fd\5D#\2\u02f9\u02fa\t\n\2\2\u02fa\u02fc\5"+
		"D#\2\u02fb\u02f9\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd"+
		"\u02fe\3\2\2\2\u02feI\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u0305\5H%\2\u0301"+
		"\u0302\t\13\2\2\u0302\u0304\5H%\2\u0303\u0301\3\2\2\2\u0304\u0307\3\2"+
		"\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u030c\3\2\2\2\u0307"+
		"\u0305\3\2\2\2\u0308\u0309\5 \21\2\u0309\u030a\t\t\2\2\u030a\u030c\3\2"+
		"\2\2\u030b\u0300\3\2\2\2\u030b\u0308\3\2\2\2\u030cK\3\2\2\2\u030d\u0312"+
		"\5J&\2\u030e\u030f\7e\2\2\u030f\u0311\5J&\2\u0310\u030e\3\2\2\2\u0311"+
		"\u0314\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313M\3\2\2\2"+
		"\u0314\u0312\3\2\2\2\u0315\u031a\5L\'\2\u0316\u0317\7d\2\2\u0317\u0319"+
		"\5L\'\2\u0318\u0316\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031a"+
		"\u031b\3\2\2\2\u031bO\3\2\2\2\u031c\u031a\3\2\2\2\u031d\u0322\5N(\2\u031e"+
		"\u031f\7f\2\2\u031f\u0321\5N(\2\u0320\u031e\3\2\2\2\u0321\u0324\3\2\2"+
		"\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323Q\3\2\2\2\u0324\u0322"+
		"\3\2\2\2\u0325\u032a\5P)\2\u0326\u0327\7z\2\2\u0327\u0329\5P)\2\u0328"+
		"\u0326\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2"+
		"\2\2\u032bS\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u0332\5R*\2\u032e\u032f"+
		"\7{\2\2\u032f\u0331\5R*\2\u0330\u032e\3\2\2\2\u0331\u0334\3\2\2\2\u0332"+
		"\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333U\3\2\2\2\u0334\u0332\3\2\2\2"+
		"\u0335\u033b\5T+\2\u0336\u0337\7\u0081\2\2\u0337\u0338\5\\/\2\u0338\u0339"+
		"\7\u0082\2\2\u0339\u033a\5X-\2\u033a\u033c\3\2\2\2\u033b\u0336\3\2\2\2"+
		"\u033b\u033c\3\2\2\2\u033cW\3\2\2\2\u033d\u0344\5V,\2\u033e\u033f\5T+"+
		"\2\u033f\u0340\5Z.\2\u0340\u0341\5\u0110\u0089\2\u0341\u0344\3\2\2\2\u0342"+
		"\u0344\5\u0170\u00b9\2\u0343\u033d\3\2\2\2\u0343\u033e\3\2\2\2\u0343\u0342"+
		"\3\2\2\2\u0344Y\3\2\2\2\u0345\u0346\t\f\2\2\u0346[\3\2\2\2\u0347\u034c"+
		"\5X-\2\u0348\u0349\7~\2\2\u0349\u034b\5X-\2\u034a\u0348\3\2\2\2\u034b"+
		"\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d]\3\2\2\2"+
		"\u034e\u034c\3\2\2\2\u034f\u0350\5V,\2\u0350_\3\2\2\2\u0351\u035f\5b\62"+
		"\2\u0352\u0354\5\u00caf\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u035b\3\2\2\2\u0355\u035c\5d\63\2\u0356\u035c\5f\64\2\u0357\u035c\5j"+
		"\66\2\u0358\u035c\5n8\2\u0359\u035c\5v<\2\u035a\u035c\5\u0166\u00b4\2"+
		"\u035b\u0355\3\2\2\2\u035b\u0356\3\2\2\2\u035b\u0357\3\2\2\2\u035b\u0358"+
		"\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035a\3\2\2\2\u035c\u035f\3\2\2\2\u035d"+
		"\u035f\5x=\2\u035e\u0351\3\2\2\2\u035e\u0353\3\2\2\2\u035e\u035d\3\2\2"+
		"\2\u035fa\3\2\2\2\u0360\u0362\5\u00caf\2\u0361\u0360\3\2\2\2\u0361\u0362"+
		"\3\2\2\2\u0362\u0367\3\2\2\2\u0363\u0368\7\u0088\2\2\u0364\u0365\7\24"+
		"\2\2\u0365\u0368\5^\60\2\u0366\u0368\7\37\2\2\u0367\u0363\3\2\2\2\u0367"+
		"\u0364\3\2\2\2\u0367\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036a\7\u0082"+
		"\2\2\u036a\u036b\5`\61\2\u036bc\3\2\2\2\u036c\u036e\5\\/\2\u036d\u036c"+
		"\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\7\u0084\2"+
		"\2\u0370e\3\2\2\2\u0371\u0373\7]\2\2\u0372\u0374\5h\65\2\u0373\u0372\3"+
		"\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\7^\2\2\u0376"+
		"g\3\2\2\2\u0377\u0379\5`\61\2\u0378\u0377\3\2\2\2\u0379\u037a\3\2\2\2"+
		"\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037bi\3\2\2\2\u037c\u037d\7"+
		"/\2\2\u037d\u037e\7Y\2\2\u037e\u037f\5l\67\2\u037f\u0380\7Z\2\2\u0380"+
		"\u0383\5`\61\2\u0381\u0382\7$\2\2\u0382\u0384\5`\61\2\u0383\u0381\3\2"+
		"\2\2\u0383\u0384\3\2\2\2\u0384\u038c\3\2\2\2\u0385\u0386\7G\2\2\u0386"+
		"\u0387\7Y\2\2\u0387\u0388\5l\67\2\u0388\u0389\7Z\2\2\u0389\u038a\5`\61"+
		"\2\u038a\u038c\3\2\2\2\u038b\u037c\3\2\2\2\u038b\u0385\3\2\2\2\u038ck"+
		"\3\2\2\2\u038d\u0399\5\\/\2\u038e\u0390\5\u00caf\2\u038f\u038e\3\2\2\2"+
		"\u038f\u0390\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392\5\u008cG\2\u0392"+
		"\u0396\5\u00e0q\2\u0393\u0394\7i\2\2\u0394\u0397\5\u0110\u0089\2\u0395"+
		"\u0397\5\u0114\u008b\2\u0396\u0393\3\2\2\2\u0396\u0395\3\2\2\2\u0397\u0399"+
		"\3\2\2\2\u0398\u038d\3\2\2\2\u0398\u038f\3\2\2\2\u0399m\3\2\2\2\u039a"+
		"\u039b\7X\2\2\u039b\u039c\7Y\2\2\u039c\u039d\5l\67\2\u039d\u039e\7Z\2"+
		"\2\u039e\u039f\5`\61\2\u039f\u03bc\3\2\2\2\u03a0\u03a1\7!\2\2\u03a1\u03a2"+
		"\5`\61\2\u03a2\u03a3\7X\2\2\u03a3\u03a4\7Y\2\2\u03a4\u03a5\5\\/\2\u03a5"+
		"\u03a6\7Z\2\2\u03a6\u03a7\7\u0084\2\2\u03a7\u03bc\3\2\2\2\u03a8\u03a9"+
		"\7,\2\2\u03a9\u03b6\7Y\2\2\u03aa\u03ac\5p9\2\u03ab\u03ad\5l\67\2\u03ac"+
		"\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03b0\7\u0084"+
		"\2\2\u03af\u03b1\5\\/\2\u03b0\u03af\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1"+
		"\u03b7\3\2\2\2\u03b2\u03b3\5r:\2\u03b3\u03b4\7\u0082\2\2\u03b4\u03b5\5"+
		"t;\2\u03b5\u03b7\3\2\2\2\u03b6\u03aa\3\2\2\2\u03b6\u03b2\3\2\2\2\u03b7"+
		"\u03b8\3\2\2\2\u03b8\u03b9\7Z\2\2\u03b9\u03ba\5`\61\2\u03ba\u03bc\3\2"+
		"\2\2\u03bb\u039a\3\2\2\2\u03bb\u03a0\3\2\2\2\u03bb\u03a8\3\2\2\2\u03bc"+
		"o\3\2\2\2\u03bd\u03c0\5d\63\2\u03be\u03c0\5\u0082B\2\u03bf\u03bd\3\2\2"+
		"\2\u03bf\u03be\3\2\2\2\u03c0q\3\2\2\2\u03c1\u03c3\5\u00caf\2\u03c2\u03c1"+
		"\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\5\u008cG"+
		"\2\u03c5\u03c6\5\u00e0q\2\u03c6s\3\2\2\2\u03c7\u03ca\5\\/\2\u03c8\u03ca"+
		"\5\u0114\u008b\2\u03c9\u03c7\3\2\2\2\u03c9\u03c8\3\2\2\2\u03cau\3\2\2"+
		"\2\u03cb\u03d5\7\23\2\2\u03cc\u03d5\7\35\2\2\u03cd\u03d0\7?\2\2\u03ce"+
		"\u03d1\5\\/\2\u03cf\u03d1\5\u0114\u008b\2\u03d0\u03ce\3\2\2\2\u03d0\u03cf"+
		"\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d5\3\2\2\2\u03d2\u03d3\7.\2\2\u03d3"+
		"\u03d5\7\u0088\2\2\u03d4\u03cb\3\2\2\2\u03d4\u03cc\3\2\2\2\u03d4\u03cd"+
		"\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d7\7\u0084\2"+
		"\2\u03d7w\3\2\2\2\u03d8\u03d9\5~@\2\u03d9y\3\2\2\2\u03da\u03dc\5|?\2\u03db"+
		"\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2"+
		"\2\2\u03de{\3\2\2\2\u03df\u03e2\5\u0106\u0084\2\u03e0\u03e2\5\u0108\u0085"+
		"\2\u03e1\u03df\3\2\2\2\u03e1\u03e0\3\2\2\2\u03e2}\3\2\2\2\u03e3\u03ec"+
		"\5\u0082B\2\u03e4\u03ec\5\u00c6d\2\u03e5\u03ec\5\u00be`\2\u03e6\u03ec"+
		"\5\u00c2b\2\u03e7\u03ec\5\u00c4c\2\u03e8\u03ec\5\u0084C\2\u03e9\u03ec"+
		"\5\u0080A\2\u03ea\u03ec\5\u00aaV\2\u03eb\u03e3\3\2\2\2\u03eb\u03e4\3\2"+
		"\2\2\u03eb\u03e5\3\2\2\2\u03eb\u03e6\3\2\2\2\u03eb\u03e7\3\2\2\2\u03eb"+
		"\u03e8\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ea\3\2\2\2\u03ec\177\3\2\2"+
		"\2\u03ed\u03ee\7S\2\2\u03ee\u03f0\7\u0088\2\2\u03ef\u03f1\5\u00caf\2\u03f0"+
		"\u03ef\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\7i"+
		"\2\2\u03f3\u03f4\5\u00f4{\2\u03f4\u03f5\7\u0084\2\2\u03f5\u0081\3\2\2"+
		"\2\u03f6\u03f8\5\u008cG\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8"+
		"\u03fa\3\2\2\2\u03f9\u03fb\5\u00dco\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb"+
		"\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u0405\7\u0084\2\2\u03fd\u03ff\5\u00ca"+
		"f\2\u03fe\u0400\5\u008cG\2\u03ff\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400"+
		"\u0401\3\2\2\2\u0401\u0402\5\u00dco\2\u0402\u0403\7\u0084\2\2\u0403\u0405"+
		"\3\2\2\2\u0404\u03f7\3\2\2\2\u0404\u03fd\3\2\2\2\u0405\u0083\3\2\2\2\u0406"+
		"\u0407\7D\2\2\u0407\u0408\7Y\2\2\u0408\u0409\5^\60\2\u0409\u040a\7~\2"+
		"\2\u040a\u040b\7\6\2\2\u040b\u040c\7Z\2\2\u040c\u040d\7\u0084\2\2\u040d"+
		"\u0085\3\2\2\2\u040e\u040f\7\u0084\2\2\u040f\u0087\3\2\2\2\u0410\u0411"+
		"\5\u00caf\2\u0411\u0412\7\u0084\2\2\u0412\u0089\3\2\2\2\u0413\u041a\5"+
		"\u008eH\2\u0414\u041a\5\u0094K\2\u0415\u041a\5\u0090I\2\u0416\u041a\7"+
		"-\2\2\u0417\u041a\7N\2\2\u0418\u041a\7\33\2\2\u0419\u0413\3\2\2\2\u0419"+
		"\u0414\3\2\2\2\u0419\u0415\3\2\2\2\u0419\u0416\3\2\2\2\u0419\u0417\3\2"+
		"\2\2\u0419\u0418\3\2\2\2\u041a\u008b\3\2\2\2\u041b\u041d\5\u008aF\2\u041c"+
		"\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041c\3\2\2\2\u041e\u041f\3\2"+
		"\2\2\u041f\u0421\3\2\2\2\u0420\u0422\5\u00caf\2\u0421\u0420\3\2\2\2\u0421"+
		"\u0422\3\2\2\2\u0422\u008d\3\2\2\2\u0423\u0424\t\r\2\2\u0424\u008f\3\2"+
		"\2\2\u0425\u0426\t\16\2\2\u0426\u0091\3\2\2\2\u0427\u0428\7\u0088\2\2"+
		"\u0428\u0093\3\2\2\2\u0429\u042d\5\u0096L\2\u042a\u042d\5\u0118\u008d"+
		"\2\u042b\u042d\5\u00a6T\2\u042c\u0429\3\2\2\2\u042c\u042a\3\2\2\2\u042c"+
		"\u042b\3\2\2\2\u042d\u0095\3\2\2\2\u042e\u0433\5\u009cO\2\u042f\u0433"+
		"\5\u00a2R\2\u0430\u0433\5\u0160\u00b1\2\u0431\u0433\5\u00eex\2\u0432\u042e"+
		"\3\2\2\2\u0432\u042f\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0431\3\2\2\2\u0433"+
		"\u0097\3\2\2\2\u0434\u0436\5\u0094K\2\u0435\u0434\3\2\2\2\u0436\u0437"+
		"\3\2\2\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u043a\3\2\2\2\u0439"+
		"\u043b\5\u00caf\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u0099"+
		"\3\2\2\2\u043c\u043e\5\u0096L\2\u043d\u043c\3\2\2\2\u043e\u043f\3\2\2"+
		"\2\u043f\u043d\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0442\3\2\2\2\u0441\u0443"+
		"\5\u00caf\2\u0442\u0441\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u009b\3\2\2"+
		"\2\u0444\u0446\5\f\7\2\u0445\u0444\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0447"+
		"\3\2\2\2\u0447\u045c\5\u009eP\2\u0448\u0449\5\f\7\2\u0449\u044a\7H\2\2"+
		"\u044a\u044b\5\u0156\u00ac\2\u044b\u045c\3\2\2\2\u044c\u045c\7\26\2\2"+
		"\u044d\u045c\7\27\2\2\u044e\u045c\7\30\2\2\u044f\u045c\7W\2\2\u0450\u045c"+
		"\7\22\2\2\u0451\u045c\7@\2\2\u0452\u045c\7\61\2\2\u0453\u045c\7\62\2\2"+
		"\u0454\u045c\7A\2\2\u0455\u045c\7R\2\2\u0456\u045c\7+\2\2\u0457\u045c"+
		"\7\"\2\2\u0458\u045c\7U\2\2\u0459\u045c\7\21\2\2\u045a\u045c\5\u00a0Q"+
		"\2\u045b\u0445\3\2\2\2\u045b\u0448\3\2\2\2\u045b\u044c\3\2\2\2\u045b\u044d"+
		"\3\2\2\2\u045b\u044e\3\2\2\2\u045b\u044f\3\2\2\2\u045b\u0450\3\2\2\2\u045b"+
		"\u0451\3\2\2\2\u045b\u0452\3\2\2\2\u045b\u0453\3\2\2\2\u045b\u0454\3\2"+
		"\2\2\u045b\u0455\3\2\2\2\u045b\u0456\3\2\2\2\u045b\u0457\3\2\2\2\u045b"+
		"\u0458\3\2\2\2\u045b\u0459\3\2\2\2\u045b\u045a\3\2\2\2\u045c\u009d\3\2"+
		"\2\2\u045d\u0462\5\u0116\u008c\2\u045e\u0462\5\u00a4S\2\u045f\u0462\5"+
		"\u0092J\2\u0460\u0462\5\u0156\u00ac\2\u0461\u045d\3\2\2\2\u0461\u045e"+
		"\3\2\2\2\u0461\u045f\3\2\2\2\u0461\u0460\3\2\2\2\u0462\u009f\3\2\2\2\u0463"+
		"\u0464\7\36\2\2\u0464\u0467\7Y\2\2\u0465\u0468\5\\/\2\u0466\u0468\7\21"+
		"\2\2\u0467\u0465\3\2\2\2\u0467\u0466\3\2\2\2\u0468\u0469\3\2\2\2\u0469"+
		"\u046a\7Z\2\2\u046a\u00a1\3\2\2\2\u046b\u047a\5\u0120\u0091\2\u046c\u046e"+
		"\5\u00caf\2\u046d\u046c\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0470\3\2\2"+
		"\2\u046f\u0471\5\f\7\2\u0470\u046f\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472"+
		"\3\2\2\2\u0472\u047b\7\u0088\2\2\u0473\u047b\5\u0156\u00ac\2\u0474\u0476"+
		"\5\f\7\2\u0475\u0477\7H\2\2\u0476\u0475\3\2\2\2\u0476\u0477\3\2\2\2\u0477"+
		"\u0478\3\2\2\2\u0478\u0479\5\u0156\u00ac\2\u0479\u047b\3\2\2\2\u047a\u046d"+
		"\3\2\2\2\u047a\u0473\3\2\2\2\u047a\u0474\3\2\2\2\u047b\u0482\3\2\2\2\u047c"+
		"\u047e\7%\2\2\u047d\u047f\5\f\7\2\u047e\u047d\3\2\2\2\u047e\u047f\3\2"+
		"\2\2\u047f\u0480\3\2\2\2\u0480\u0482\7\u0088\2\2\u0481\u046b\3\2\2\2\u0481"+
		"\u047c\3\2\2\2\u0482\u00a3\3\2\2\2\u0483\u0484\7\u0088\2\2\u0484\u00a5"+
		"\3\2\2\2\u0485\u0486\5\u00a8U\2\u0486\u048b\7]\2\2\u0487\u0489\5\u00b0"+
		"Y\2\u0488\u048a\7~\2\2\u0489\u0488\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048c"+
		"\3\2\2\2\u048b\u0487\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2\u048d"+
		"\u048e\7^\2\2\u048e\u00a7\3\2\2\2\u048f\u0491\5\u00acW\2\u0490\u0492\5"+
		"\u00caf\2\u0491\u0490\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0497\3\2\2\2"+
		"\u0493\u0495\5\f\7\2\u0494\u0493\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496"+
		"\3\2\2\2\u0496\u0498\7\u0088\2\2\u0497\u0494\3\2\2\2\u0497\u0498\3\2\2"+
		"\2\u0498\u049a\3\2\2\2\u0499\u049b\5\u00aeX\2\u049a\u0499\3\2\2\2\u049a"+
		"\u049b\3\2\2\2\u049b\u00a9\3\2\2\2\u049c\u049e\5\u00acW\2\u049d\u049f"+
		"\5\u00caf\2\u049e\u049d\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a0\3\2\2"+
		"\2\u04a0\u04a2\7\u0088\2\2\u04a1\u04a3\5\u00aeX\2\u04a2\u04a1\3\2\2\2"+
		"\u04a2\u04a3\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\7\u0084\2\2\u04a5"+
		"\u00ab\3\2\2\2\u04a6\u04a8\7%\2\2\u04a7\u04a9\t\17\2\2\u04a8\u04a7\3\2"+
		"\2\2\u04a8\u04a9\3\2\2\2\u04a9\u00ad\3\2\2\2\u04aa\u04ab\7\u0082\2\2\u04ab"+
		"\u04ac\5\u0098M\2\u04ac\u00af\3\2\2\2\u04ad\u04b2\5\u00b2Z\2\u04ae\u04af"+
		"\7~\2\2\u04af\u04b1\5\u00b2Z\2\u04b0\u04ae\3\2\2\2\u04b1\u04b4\3\2\2\2"+
		"\u04b2\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u00b1\3\2\2\2\u04b4\u04b2"+
		"\3\2\2\2\u04b5\u04b8\5\u00b4[\2\u04b6\u04b7\7i\2\2\u04b7\u04b9\5^\60\2"+
		"\u04b8\u04b6\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u00b3\3\2\2\2\u04ba\u04bb"+
		"\7\u0088\2\2\u04bb\u00b5\3\2\2\2\u04bc\u04bf\5\u00b8]\2\u04bd\u04bf\5"+
		"\u00bc_\2\u04be\u04bc\3\2\2\2\u04be\u04bd\3\2\2\2\u04bf\u00b7\3\2\2\2"+
		"\u04c0\u04c1\7\u0088\2\2\u04c1\u00b9\3\2\2\2\u04c2\u04c4\7\60\2\2\u04c3"+
		"\u04c2\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c8\7\64"+
		"\2\2\u04c6\u04c9\7\u0088\2\2\u04c7\u04c9\5\u00b8]\2\u04c8\u04c6\3\2\2"+
		"\2\u04c8\u04c7\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cc"+
		"\7]\2\2\u04cb\u04cd\5z>\2\u04cc\u04cb\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd"+
		"\u04ce\3\2\2\2\u04ce\u04cf\7^\2\2\u04cf\u00bb\3\2\2\2\u04d0\u04d1\7\u0088"+
		"\2\2\u04d1\u00bd\3\2\2\2\u04d2\u04d3\7\64\2\2\u04d3\u04d4\7\u0088\2\2"+
		"\u04d4\u04d5\7i\2\2\u04d5\u04d6\5\u00c0a\2\u04d6\u04d7\7\u0084\2\2\u04d7"+
		"\u00bf\3\2\2\2\u04d8\u04da\5\f\7\2\u04d9\u04d8\3\2\2\2\u04d9\u04da\3\2"+
		"\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\5\u00b6\\\2\u04dc\u00c1\3\2\2\2\u04dd"+
		"\u04e3\7S\2\2\u04de\u04e0\7P\2\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2"+
		"\2\u04e0\u04e1\3\2\2\2\u04e1\u04e4\5\f\7\2\u04e2\u04e4\7\u0083\2\2\u04e3"+
		"\u04df\3\2\2\2\u04e3\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\5\b"+
		"\5\2\u04e6\u04e7\7\u0084\2\2\u04e7\u00c3\3\2\2\2\u04e8\u04ea\5\u00caf"+
		"\2\u04e9\u04e8\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec"+
		"\7S\2\2\u04ec\u04ee\7\64\2\2\u04ed\u04ef\5\f\7\2\u04ee\u04ed\3\2\2\2\u04ee"+
		"\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\5\u00b6\\\2\u04f1\u04f2"+
		"\7\u0084\2\2\u04f2\u00c5\3\2\2\2\u04f3\u04f4\7\20\2\2\u04f4\u04f5\7Y\2"+
		"\2\u04f5\u04f6\7\6\2\2\u04f6\u04f7\7Z\2\2\u04f7\u04f8\7\u0084\2\2\u04f8"+
		"\u00c7\3\2\2\2\u04f9\u04fa\7(\2\2\u04fa\u0501\7\6\2\2\u04fb\u04fd\7]\2"+
		"\2\u04fc\u04fe\5z>\2\u04fd\u04fc\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff"+
		"\3\2\2\2\u04ff\u0502\7^\2\2\u0500\u0502\5|?\2\u0501\u04fb\3\2\2\2\u0501"+
		"\u0500\3\2\2\2\u0502\u00c9\3\2\2\2\u0503\u0505\5\u00ccg\2\u0504\u0503"+
		"\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0504\3\2\2\2\u0506\u0507\3\2\2\2\u0507"+
		"\u00cb\3\2\2\2\u0508\u0509\7[\2\2\u0509\u050b\7[\2\2\u050a\u050c\5\u00d0"+
		"i\2\u050b\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050d\3\2\2\2\u050d"+
		"\u050e\7\\\2\2\u050e\u0511\7\\\2\2\u050f\u0511\5\u00ceh\2\u0510\u0508"+
		"\3\2\2\2\u0510\u050f\3\2\2\2\u0511\u00cd\3\2\2\2\u0512\u0513\7\16\2\2"+
		"\u0513\u0516\7Y\2\2\u0514\u0517\5\u00f4{\2\u0515\u0517\5^\60\2\u0516\u0514"+
		"\3\2\2\2\u0516\u0515\3\2\2\2\u0517\u0519\3\2\2\2\u0518\u051a\7\u0087\2"+
		"\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051c"+
		"\7Z\2\2\u051c\u00cf\3\2\2\2\u051d\u0522\5\u00d2j\2\u051e\u051f\7~\2\2"+
		"\u051f\u0521\5\u00d2j\2\u0520\u051e\3\2\2\2\u0521\u0524\3\2\2\2\u0522"+
		"\u0520\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0526\3\2\2\2\u0524\u0522\3\2"+
		"\2\2\u0525\u0527\7\u0087\2\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527"+
		"\u00d1\3\2\2\2\u0528\u0529\5\u00d4k\2\u0529\u052a\7\u0083\2\2\u052a\u052c"+
		"\3\2\2\2\u052b\u0528\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\3\2\2\2\u052d"+
		"\u052f\7\u0088\2\2\u052e\u0530\5\u00d6l\2\u052f\u052e\3\2\2\2\u052f\u0530"+
		"\3\2\2\2\u0530\u00d3\3\2\2\2\u0531\u0532\7\u0088\2\2\u0532\u00d5\3\2\2"+
		"\2\u0533\u0535\7Y\2\2\u0534\u0536\5\u00d8m\2\u0535\u0534\3\2\2\2\u0535"+
		"\u0536\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0538\7Z\2\2\u0538\u00d7\3\2"+
		"\2\2\u0539\u053b\5\u00dan\2\u053a\u0539\3\2\2\2\u053b\u053c\3\2\2\2\u053c"+
		"\u053a\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u00d9\3\2\2\2\u053e\u053f\7Y"+
		"\2\2\u053f\u0540\5\u00d8m\2\u0540\u0541\7Z\2\2\u0541\u0550\3\2\2\2\u0542"+
		"\u0543\7[\2\2\u0543\u0544\5\u00d8m\2\u0544\u0545\7\\\2\2\u0545\u0550\3"+
		"\2\2\2\u0546\u0547\7]\2\2\u0547\u0548\5\u00d8m\2\u0548\u0549\7^\2\2\u0549"+
		"\u0550\3\2\2\2\u054a\u054c\n\20\2\2\u054b\u054a\3\2\2\2\u054c\u054d\3"+
		"\2\2\2\u054d\u054b\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0550\3\2\2\2\u054f"+
		"\u053e\3\2\2\2\u054f\u0542\3\2\2\2\u054f\u0546\3\2\2\2\u054f\u054b\3\2"+
		"\2\2\u0550\u00db\3\2\2\2\u0551\u0556\5\u00dep\2\u0552\u0553\7~\2\2\u0553"+
		"\u0555\5\u00dep\2\u0554\u0552\3\2\2\2\u0555\u0558\3\2\2\2\u0556\u0554"+
		"\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u00dd\3\2\2\2\u0558\u0556\3\2\2\2\u0559"+
		"\u055b\5\u00e0q\2\u055a\u055c\5\u010c\u0087\2\u055b\u055a\3\2\2\2\u055b"+
		"\u055c\3\2\2\2\u055c\u00df\3\2\2\2\u055d\u0563\5\u00e2r\2\u055e\u055f"+
		"\5\u00e4s\2\u055f\u0560\5\u00e6t\2\u0560\u0561\5\u00e8u\2\u0561\u0563"+
		"\3\2\2\2\u0562\u055d\3\2\2\2\u0562\u055e\3\2\2\2\u0563\u00e1\3\2\2\2\u0564"+
		"\u0566\5\u00eav\2\u0565\u0567\7\32\2\2\u0566\u0565\3\2\2\2\u0566\u0567"+
		"\3\2\2\2\u0567\u0569\3\2\2\2\u0568\u0564\3\2\2\2\u0569\u056c\3\2\2\2\u056a"+
		"\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056d\3\2\2\2\u056c\u056a\3\2"+
		"\2\2\u056d\u056e\5\u00e4s\2\u056e\u00e3\3\2\2\2\u056f\u0570\bs\1\2\u0570"+
		"\u0572\5\u00f2z\2\u0571\u0573\5\u00caf\2\u0572\u0571\3\2\2\2\u0572\u0573"+
		"\3\2\2\2\u0573\u0579\3\2\2\2\u0574\u0575\7Y\2\2\u0575\u0576\5\u00e2r\2"+
		"\u0576\u0577\7Z\2\2\u0577\u0579\3\2\2\2\u0578\u056f\3\2\2\2\u0578\u0574"+
		"\3\2\2\2\u0579\u0588\3\2\2\2\u057a\u0584\f\4\2\2\u057b\u0585\5\u00e6t"+
		"\2\u057c\u057e\7[\2\2\u057d\u057f\5^\60\2\u057e\u057d\3\2\2\2\u057e\u057f"+
		"\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0582\7\\\2\2\u0581\u0583\5\u00caf"+
		"\2\u0582\u0581\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0585\3\2\2\2\u0584\u057b"+
		"\3\2\2\2\u0584\u057c\3\2\2\2\u0585\u0587\3\2\2\2\u0586\u057a\3\2\2\2\u0587"+
		"\u058a\3\2\2\2\u0588\u0586\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u00e5\3\2"+
		"\2\2\u058a\u0588\3\2\2\2\u058b\u058d\7Y\2\2\u058c\u058e\5\u0100\u0081"+
		"\2\u058d\u058c\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0591"+
		"\7Z\2\2\u0590\u0592\5\u00ecw\2\u0591\u0590\3\2\2\2\u0591\u0592\3\2\2\2"+
		"\u0592\u0594\3\2\2\2\u0593\u0595\5\u00f0y\2\u0594\u0593\3\2\2\2\u0594"+
		"\u0595\3\2\2\2\u0595\u0597\3\2\2\2\u0596\u0598\5\u0172\u00ba\2\u0597\u0596"+
		"\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u059a\3\2\2\2\u0599\u059b\5\u00caf"+
		"\2\u059a\u0599\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u00e7\3\2\2\2\u059c\u059d"+
		"\7\u0080\2\2\u059d\u059f\5\u009aN\2\u059e\u05a0\5\u00f6|\2\u059f\u059e"+
		"\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u00e9\3\2\2\2\u05a1\u05a3\t\21\2\2"+
		"\u05a2\u05a4\5\u00caf\2\u05a3\u05a2\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4"+
		"\u05b0\3\2\2\2\u05a5\u05a7\5\f\7\2\u05a6\u05a5\3\2\2\2\u05a6\u05a7\3\2"+
		"\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05aa\7a\2\2\u05a9\u05ab\5\u00caf\2\u05aa"+
		"\u05a9\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ad\3\2\2\2\u05ac\u05ae\5\u00ec"+
		"w\2\u05ad\u05ac\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05b0\3\2\2\2\u05af"+
		"\u05a1\3\2\2\2\u05af\u05a6\3\2\2\2\u05b0\u00eb\3\2\2\2\u05b1\u05b3\5\u00ee"+
		"x\2\u05b2\u05b1\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4"+
		"\u05b5\3\2\2\2\u05b5\u00ed\3\2\2\2\u05b6\u05b7\t\22\2\2\u05b7\u00ef\3"+
		"\2\2\2\u05b8\u05b9\t\21\2\2\u05b9\u00f1\3\2\2\2\u05ba\u05bc\7\u0087\2"+
		"\2\u05bb\u05ba\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05be"+
		"\5\6\4\2\u05be\u00f3\3\2\2\2\u05bf\u05c1\5\u0098M\2\u05c0\u05c2\5\u00f6"+
		"|\2\u05c1\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u00f5\3\2\2\2\u05c3"+
		"\u05cc\5\u00f8}\2\u05c4\u05c6\5\u00fa~\2\u05c5\u05c4\3\2\2\2\u05c5\u05c6"+
		"\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\5\u00e6t\2\u05c8\u05c9\5\u00e8"+
		"u\2\u05c9\u05cc\3\2\2\2\u05ca\u05cc\5\u00fc\177\2\u05cb\u05c3\3\2\2\2"+
		"\u05cb\u05c5\3\2\2\2\u05cb\u05ca\3\2\2\2\u05cc\u00f7\3\2\2\2\u05cd\u05d7"+
		"\5\u00fa~\2\u05ce\u05d0\5\u00eav\2\u05cf\u05ce\3\2\2\2\u05d0\u05d1\3\2"+
		"\2\2\u05d1\u05cf\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d4\3\2\2\2\u05d3"+
		"\u05d5\5\u00fa~\2\u05d4\u05d3\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d7"+
		"\3\2\2\2\u05d6\u05cd\3\2\2\2\u05d6\u05cf\3\2\2\2\u05d7\u00f9\3\2\2\2\u05d8"+
		"\u05d9\b~\1\2\u05d9\u05e7\5\u00e6t\2\u05da\u05dc\7[\2\2\u05db\u05dd\5"+
		"^\60\2\u05dc\u05db\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05de\3\2\2\2\u05de"+
		"\u05e0\7\\\2\2\u05df\u05e1\5\u00caf\2\u05e0\u05df\3\2\2\2\u05e0\u05e1"+
		"\3\2\2\2\u05e1\u05e7\3\2\2\2\u05e2\u05e3\7Y\2\2\u05e3\u05e4\5\u00f8}\2"+
		"\u05e4\u05e5\7Z\2\2\u05e5\u05e7\3\2\2\2\u05e6\u05d8\3\2\2\2\u05e6\u05da"+
		"\3\2\2\2\u05e6\u05e2\3\2\2\2\u05e7\u05f7\3\2\2\2\u05e8\u05f3\f\6\2\2\u05e9"+
		"\u05f4\5\u00e6t\2\u05ea\u05eb\5\u00fa~\2\u05eb\u05ed\7[\2\2\u05ec\u05ee"+
		"\5^\60\2\u05ed\u05ec\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef"+
		"\u05f1\7\\\2\2\u05f0\u05f2\5\u00caf\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2"+
		"\3\2\2\2\u05f2\u05f4\3\2\2\2\u05f3\u05e9\3\2\2\2\u05f3\u05ea\3\2\2\2\u05f4"+
		"\u05f6\3\2\2\2\u05f5\u05e8\3\2\2\2\u05f6\u05f9\3\2\2\2\u05f7\u05f5\3\2"+
		"\2\2\u05f7\u05f8\3\2\2\2\u05f8\u00fb\3\2\2\2\u05f9\u05f7\3\2\2\2\u05fa"+
		"\u05fc\5\u00eav\2\u05fb\u05fa\3\2\2\2\u05fc\u05ff\3\2\2\2\u05fd\u05fb"+
		"\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u0600\3\2\2\2\u05ff\u05fd\3\2\2\2\u0600"+
		"\u0601\5\u00fe\u0080\2\u0601\u00fd\3\2\2\2\u0602\u0603\b\u0080\1\2\u0603"+
		"\u0604\7\u0087\2\2\u0604\u0613\3\2\2\2\u0605\u060f\f\4\2\2\u0606\u0610"+
		"\5\u00e6t\2\u0607\u0609\7[\2\2\u0608\u060a\5^\60\2\u0609\u0608\3\2\2\2"+
		"\u0609\u060a\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060d\7\\\2\2\u060c\u060e"+
		"\5\u00caf\2\u060d\u060c\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u0610\3\2\2"+
		"\2\u060f\u0606\3\2\2\2\u060f\u0607\3\2\2\2\u0610\u0612\3\2\2\2\u0611\u0605"+
		"\3\2\2\2\u0612\u0615\3\2\2\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614"+
		"\u00ff\3\2\2\2\u0615\u0613\3\2\2\2\u0616\u061b\5\u0102\u0082\2\u0617\u0619"+
		"\7~\2\2\u0618\u0617\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061a\3\2\2\2\u061a"+
		"\u061c\7\u0087\2\2\u061b\u0618\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u0101"+
		"\3\2\2\2\u061d\u0622\5\u0104\u0083\2\u061e\u061f\7~\2\2\u061f\u0621\5"+
		"\u0104\u0083\2\u0620\u061e\3\2\2\2\u0621\u0624\3\2\2\2\u0622\u0620\3\2"+
		"\2\2\u0622\u0623\3\2\2\2\u0623\u0103\3\2\2\2\u0624\u0622\3\2\2\2\u0625"+
		"\u0627\5\u00caf\2\u0626\u0625\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0628"+
		"\3\2\2\2\u0628\u062d\5\u008cG\2\u0629\u062e\5\u00e0q\2\u062a\u062c\5\u00f6"+
		"|\2\u062b\u062a\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062e\3\2\2\2\u062d"+
		"\u0629\3\2\2\2\u062d\u062b\3\2\2\2\u062e\u0631\3\2\2\2\u062f\u0630\7i"+
		"\2\2\u0630\u0632\5\u0110\u0089\2\u0631\u062f\3\2\2\2\u0631\u0632\3\2\2"+
		"\2\u0632\u0105\3\2\2\2\u0633\u0635\7\f\2\2\u0634\u0636\5\u00caf\2\u0635"+
		"\u0634\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0638\3\2\2\2\u0637\u0639\5\u008c"+
		"G\2\u0638\u0637\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063a\3\2\2\2\u063a"+
		"\u063c\5\u00e0q\2\u063b\u063d\5\u012a\u0096\2\u063c\u063b\3\2\2\2\u063c"+
		"\u063d\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u063f\5\u010a\u0086\2\u063f\u0107"+
		"\3\2\2\2\u0640\u0641\7\r\2\2\u0641\u0642\7Y\2\2\u0642\u0643\7Z\2\2\u0643"+
		"\u0644\5\u010a\u0086\2\u0644\u0109\3\2\2\2\u0645\u0647\5\u0142\u00a2\2"+
		"\u0646\u0645\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u064e"+
		"\5f\64\2\u0649\u064e\5\u0168\u00b5\2\u064a\u064b\7i\2\2\u064b\u064c\t"+
		"\23\2\2\u064c\u064e\7\u0084\2\2\u064d\u0646\3\2\2\2\u064d\u0649\3\2\2"+
		"\2\u064d\u064a\3\2\2\2\u064e\u010b\3\2\2\2\u064f\u0655\5\u010e\u0088\2"+
		"\u0650\u0651\7Y\2\2\u0651\u0652\5$\23\2\u0652\u0653\7Z\2\2\u0653\u0655"+
		"\3\2\2\2\u0654\u064f\3\2\2\2\u0654\u0650\3\2\2\2\u0655\u010d\3\2\2\2\u0656"+
		"\u0657\7i\2\2\u0657\u065a\5\u0110\u0089\2\u0658\u065a\5\u0114\u008b\2"+
		"\u0659\u0656\3\2\2\2\u0659\u0658\3\2\2\2\u065a\u010f\3\2\2\2\u065b\u065e"+
		"\5X-\2\u065c\u065e\5\u0114\u008b\2\u065d\u065b\3\2\2\2\u065d\u065c\3\2"+
		"\2\2\u065e\u0111\3\2\2\2\u065f\u0661\5\u0110\u0089\2\u0660\u0662\7\u0087"+
		"\2\2\u0661\u0660\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u066a\3\2\2\2\u0663"+
		"\u0664\7~\2\2\u0664\u0666\5\u0110\u0089\2\u0665\u0667\7\u0087\2\2\u0666"+
		"\u0665\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u0669\3\2\2\2\u0668\u0663\3\2"+
		"\2\2\u0669\u066c\3\2\2\2\u066a\u0668\3\2\2\2\u066a\u066b\3\2\2\2\u066b"+
		"\u0113\3\2\2\2\u066c\u066a\3\2\2\2\u066d\u0672\7]\2\2\u066e\u0670\5\u0112"+
		"\u008a\2\u066f\u0671\7~\2\2\u0670\u066f\3\2\2\2\u0670\u0671\3\2\2\2\u0671"+
		"\u0673\3\2\2\2\u0672\u066e\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0674\3\2"+
		"\2\2\u0674\u0675\7^\2\2\u0675\u0115\3\2\2\2\u0676\u0679\7\u0088\2\2\u0677"+
		"\u0679\5\u0156\u00ac\2\u0678\u0676\3\2\2\2\u0678\u0677\3\2\2\2\u0679\u0117"+
		"\3\2\2\2\u067a\u067b\5\u011a\u008e\2\u067b\u067d\7]\2\2\u067c\u067e\5"+
		"\u0122\u0092\2\u067d\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u067f\3\2"+
		"\2\2\u067f\u0680\7^\2\2\u0680\u0119\3\2\2\2\u0681\u0683\5\u0120\u0091"+
		"\2\u0682\u0684\5\u00caf\2\u0683\u0682\3\2\2\2\u0683\u0684\3\2\2\2\u0684"+
		"\u0689\3\2\2\2\u0685\u0687\5\u011c\u008f\2\u0686\u0688\5\u011e\u0090\2"+
		"\u0687\u0686\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u068a\3\2\2\2\u0689\u0685"+
		"\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068c\3\2\2\2\u068b\u068d\5\u0130\u0099"+
		"\2\u068c\u068b\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u0699\3\2\2\2\u068e\u0690"+
		"\7Q\2\2\u068f\u0691\5\u00caf\2\u0690\u068f\3\2\2\2\u0690\u0691\3\2\2\2"+
		"\u0691\u0696\3\2\2\2\u0692\u0694\5\u011c\u008f\2\u0693\u0695\5\u011e\u0090"+
		"\2\u0694\u0693\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0697\3\2\2\2\u0696\u0692"+
		"\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0699\3\2\2\2\u0698\u0681\3\2\2\2\u0698"+
		"\u068e\3\2\2\2\u0699\u011b\3\2\2\2\u069a\u069c\5\f\7\2\u069b\u069a\3\2"+
		"\2\2\u069b\u069c\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069e\5\u0116\u008c"+
		"\2\u069e\u011d\3\2\2\2\u069f\u06a0\7*\2\2\u06a0\u011f\3\2\2\2\u06a1\u06a2"+
		"\t\17\2\2\u06a2\u0121\3\2\2\2\u06a3\u06a8\5\u0124\u0093\2\u06a4\u06a5"+
		"\5\u013a\u009e\2\u06a5\u06a6\7\u0082\2\2\u06a6\u06a8\3\2\2\2\u06a7\u06a3"+
		"\3\2\2\2\u06a7\u06a4\3\2\2\2\u06a8\u06a9\3\2\2\2\u06a9\u06a7\3\2\2\2\u06a9"+
		"\u06aa\3\2\2\2\u06aa\u0123\3\2\2\2\u06ab\u06ad\5\u00caf\2\u06ac\u06ab"+
		"\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06af\3\2\2\2\u06ae\u06b0\5\u008cG"+
		"\2\u06af\u06ae\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b2\3\2\2\2\u06b1\u06b3"+
		"\5\u0126\u0094\2\u06b2\u06b1\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b4\3"+
		"\2\2\2\u06b4\u06bc\7\u0084\2\2\u06b5\u06bc\5\u0106\u0084\2\u06b6\u06bc"+
		"\5\u00c2b\2\u06b7\u06bc\5\u0084C\2\u06b8\u06bc\5\u014e\u00a8\2\u06b9\u06bc"+
		"\5\u0080A\2\u06ba\u06bc\5\u0086D\2\u06bb\u06ac\3\2\2\2\u06bb\u06b5\3\2"+
		"\2\2\u06bb\u06b6\3\2\2\2\u06bb\u06b7\3\2\2\2\u06bb\u06b8\3\2\2\2\u06bb"+
		"\u06b9\3\2\2\2\u06bb\u06ba\3\2\2\2\u06bc\u0125\3\2\2\2\u06bd\u06c2\5\u0128"+
		"\u0095\2\u06be\u06bf\7~\2\2\u06bf\u06c1\5\u0128\u0095\2\u06c0\u06be\3"+
		"\2\2\2\u06c1\u06c4\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3"+
		"\u0127\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c5\u06cf\5\u00e0q\2\u06c6\u06c8"+
		"\5\u012a\u0096\2\u06c7\u06c6\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06ca\3"+
		"\2\2\2\u06c9\u06cb\5\u012e\u0098\2\u06ca\u06c9\3\2\2\2\u06ca\u06cb\3\2"+
		"\2\2\u06cb\u06d0\3\2\2\2\u06cc\u06ce\5\u010e\u0088\2\u06cd\u06cc\3\2\2"+
		"\2\u06cd\u06ce\3\2\2\2\u06ce\u06d0\3\2\2\2\u06cf\u06c7\3\2\2\2\u06cf\u06cd"+
		"\3\2\2\2\u06d0\u06da\3\2\2\2\u06d1\u06d3\7\u0088\2\2\u06d2\u06d1\3\2\2"+
		"\2\u06d2\u06d3\3\2\2\2\u06d3\u06d5\3\2\2\2\u06d4\u06d6\5\u00caf\2\u06d5"+
		"\u06d4\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06d8\7\u0082"+
		"\2\2\u06d8\u06da\5^\60\2\u06d9\u06c5\3\2\2\2\u06d9\u06d2\3\2\2\2\u06da"+
		"\u0129\3\2\2\2\u06db\u06dd\5\u012c\u0097\2\u06dc\u06db\3\2\2\2\u06dd\u06de"+
		"\3\2\2\2\u06de\u06dc\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u012b\3\2\2\2\u06e0"+
		"\u06e1\t\24\2\2\u06e1\u012d\3\2\2\2\u06e2\u06e3\7i\2\2\u06e3\u06e4\7\u008a"+
		"\2\2\u06e4\u06e5\b\u0098\1\2\u06e5\u012f\3\2\2\2\u06e6\u06e7\7\u0082\2"+
		"\2\u06e7\u06e8\5\u0132\u009a\2\u06e8\u0131\3\2\2\2\u06e9\u06eb\5\u0134"+
		"\u009b\2\u06ea\u06ec\7\u0087\2\2\u06eb\u06ea\3\2\2\2\u06eb\u06ec\3\2\2"+
		"\2\u06ec\u06f4\3\2\2\2\u06ed\u06ee\7~\2\2\u06ee\u06f0\5\u0134\u009b\2"+
		"\u06ef\u06f1\7\u0087\2\2\u06f0\u06ef\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1"+
		"\u06f3\3\2\2\2\u06f2\u06ed\3\2\2\2\u06f3\u06f6\3\2\2\2\u06f4\u06f2\3\2"+
		"\2\2\u06f4\u06f5\3\2\2\2\u06f5\u0133\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f7"+
		"\u06f9\5\u00caf\2\u06f8\u06f7\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u0706"+
		"\3\2\2\2\u06fa\u0707\5\u0138\u009d\2\u06fb\u06fd\7T\2\2\u06fc\u06fe\5"+
		"\u013a\u009e\2\u06fd\u06fc\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u06ff\3\2"+
		"\2\2\u06ff\u0707\5\u0138\u009d\2\u0700\u0702\5\u013a\u009e\2\u0701\u0703"+
		"\7T\2\2\u0702\u0701\3\2\2\2\u0702\u0703\3\2\2\2\u0703\u0704\3\2\2\2\u0704"+
		"\u0705\5\u0138\u009d\2\u0705\u0707\3\2\2\2\u0706\u06fa\3\2\2\2\u0706\u06fb"+
		"\3\2\2\2\u0706\u0700\3\2\2\2\u0707\u0135\3\2\2\2\u0708\u070a\5\f\7\2\u0709"+
		"\u0708\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070e\5\u0116"+
		"\u008c\2\u070c\u070e\5\u00a0Q\2\u070d\u0709\3\2\2\2\u070d\u070c\3\2\2"+
		"\2\u070e\u0137\3\2\2\2\u070f\u0710\5\u0136\u009c\2\u0710\u0139\3\2\2\2"+
		"\u0711\u0712\t\25\2\2\u0712\u013b\3\2\2\2\u0713\u0714\78\2\2\u0714\u0715"+
		"\5\u013e\u00a0\2\u0715\u013d\3\2\2\2\u0716\u0718\5\u0098M\2\u0717\u0719"+
		"\5\u0140\u00a1\2\u0718\u0717\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u013f\3"+
		"\2\2\2\u071a\u071c\5\u00eav\2\u071b\u071d\5\u0140\u00a1\2\u071c\u071b"+
		"\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u0141\3\2\2\2\u071e\u071f\7\u0082\2"+
		"\2\u071f\u0720\5\u0144\u00a3\2\u0720\u0143\3\2\2\2\u0721\u0723\5\u0146"+
		"\u00a4\2\u0722\u0724\7\u0087\2\2\u0723\u0722\3\2\2\2\u0723\u0724\3\2\2"+
		"\2\u0724\u072c\3\2\2\2\u0725\u0726\7~\2\2\u0726\u0728\5\u0146\u00a4\2"+
		"\u0727\u0729\7\u0087\2\2\u0728\u0727\3\2\2\2\u0728\u0729\3\2\2\2\u0729"+
		"\u072b\3\2\2\2\u072a\u0725\3\2\2\2\u072b\u072e\3\2\2\2\u072c\u072a\3\2"+
		"\2\2\u072c\u072d\3\2\2\2\u072d\u0145\3\2\2\2\u072e\u072c\3\2\2\2\u072f"+
		"\u0736\5\u0148\u00a5\2\u0730\u0732\7Y\2\2\u0731\u0733\5$\23\2\u0732\u0731"+
		"\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u0737\7Z\2\2\u0735"+
		"\u0737\5\u0114\u008b\2\u0736\u0730\3\2\2\2\u0736\u0735\3\2\2\2\u0737\u0147"+
		"\3\2\2\2\u0738\u073b\5\u0136\u009c\2\u0739\u073b\7\u0088\2\2\u073a\u0738"+
		"\3\2\2\2\u073a\u0739\3\2\2\2\u073b\u0149\3\2\2\2\u073c\u073d\78\2\2\u073d"+
		"\u073e\5\u017a\u00be\2\u073e\u014b\3\2\2\2\u073f\u0743\78\2\2\u0740\u0741"+
		"\7\6\2\2\u0741\u0744\7\u0088\2\2\u0742\u0744\7\u0090\2\2\u0743\u0740\3"+
		"\2\2\2\u0743\u0742\3\2\2\2\u0744\u014d\3\2\2\2\u0745\u0746\7H\2\2\u0746"+
		"\u0747\7j\2\2\u0747\u0748\5\u0150\u00a9\2\u0748\u0749\7k\2\2\u0749\u074a"+
		"\5|?\2\u074a\u014f\3\2\2\2\u074b\u0750\5\u0152\u00aa\2\u074c\u074d\7~"+
		"\2\2\u074d\u074f\5\u0152\u00aa\2\u074e\u074c\3\2\2\2\u074f\u0752\3\2\2"+
		"\2\u0750\u074e\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0151\3\2\2\2\u0752\u0750"+
		"\3\2\2\2\u0753\u0756\5\u0154\u00ab\2\u0754\u0756\5\u0104\u0083\2\u0755"+
		"\u0753\3\2\2\2\u0755\u0754\3\2\2\2\u0756\u0153\3\2\2\2\u0757\u0758\7H"+
		"\2\2\u0758\u0759\7j\2\2\u0759\u075a\5\u0150\u00a9\2\u075a\u075b\7k\2\2"+
		"\u075b\u075d\3\2\2\2\u075c\u0757\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u075e"+
		"\3\2\2\2\u075e\u0761\7\31\2\2\u075f\u0761\7P\2\2\u0760\u075c\3\2\2\2\u0760"+
		"\u075f\3\2\2\2\u0761\u076d\3\2\2\2\u0762\u0764\7\u0087\2\2\u0763\u0762"+
		"\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u0766\3\2\2\2\u0765\u0767\7\u0088\2"+
		"\2\u0766\u0765\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u076e\3\2\2\2\u0768\u076a"+
		"\7\u0088\2\2\u0769\u0768\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076b\3\2\2"+
		"\2\u076b\u076c\7i\2\2\u076c\u076e\5\u00f4{\2\u076d\u0763\3\2\2\2\u076d"+
		"\u0769\3\2\2\2\u076e\u0155\3\2\2\2\u076f\u0770\5\u015a\u00ae\2\u0770\u0772"+
		"\7j\2\2\u0771\u0773\5\u015c\u00af\2\u0772\u0771\3\2\2\2\u0772\u0773\3"+
		"\2\2\2\u0773\u0774\3\2\2\2\u0774\u0775\7k\2\2\u0775\u0157\3\2\2\2\u0776"+
		"\u0782\5\u0156\u00ac\2\u0777\u077a\5\u014a\u00a6\2\u0778\u077a\5\u014c"+
		"\u00a7\2\u0779\u0777\3\2\2\2\u0779\u0778\3\2\2\2\u077a\u077b\3\2\2\2\u077b"+
		"\u077d\7j\2\2\u077c\u077e\5\u015c\u00af\2\u077d\u077c\3\2\2\2\u077d\u077e"+
		"\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u0780\7k\2\2\u0780\u0782\3\2\2\2\u0781"+
		"\u0776\3\2\2\2\u0781\u0779\3\2\2\2\u0782\u0159\3\2\2\2\u0783\u0784\7\u0088"+
		"\2\2\u0784\u015b\3\2\2\2\u0785\u0787\5\u015e\u00b0\2\u0786\u0788\7\u0087"+
		"\2\2\u0787\u0786\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u0790\3\2\2\2\u0789"+
		"\u078a\7~\2\2\u078a\u078c\5\u015e\u00b0\2\u078b\u078d\7\u0087\2\2\u078c"+
		"\u078b\3\2\2\2\u078c\u078d\3\2\2\2\u078d\u078f\3\2\2\2\u078e\u0789\3\2"+
		"\2\2\u078f\u0792\3\2\2\2\u0790\u078e\3\2\2\2\u0790\u0791\3\2\2\2\u0791"+
		"\u015d\3\2\2\2\u0792\u0790\3\2\2\2\u0793\u0797\5\u00f4{\2\u0794\u0797"+
		"\5^\60\2\u0795\u0797\5\6\4\2\u0796\u0793\3\2\2\2\u0796\u0794\3\2\2\2\u0796"+
		"\u0795\3\2\2\2\u0797\u015f\3\2\2\2\u0798\u0799\7P\2\2\u0799\u079f\5\f"+
		"\7\2\u079a\u07a0\7\u0088\2\2\u079b\u079d\7H\2\2\u079c\u079b\3\2\2\2\u079c"+
		"\u079d\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u07a0\5\u0156\u00ac\2\u079f\u079a"+
		"\3\2\2\2\u079f\u079c\3\2\2\2\u07a0\u0161\3\2\2\2\u07a1\u07a3\7(\2\2\u07a2"+
		"\u07a1\3\2\2\2\u07a2\u07a3\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u07a5\7H"+
		"\2\2\u07a5\u07a6\5|?\2\u07a6\u0163\3\2\2\2\u07a7\u07a8\7H\2\2\u07a8\u07a9"+
		"\7j\2\2\u07a9\u07aa\7k\2\2\u07aa\u07ab\5|?\2\u07ab\u0165\3\2\2\2\u07ac"+
		"\u07ad\7M\2\2\u07ad\u07ae\5f\64\2\u07ae\u07af\5\u016a\u00b6\2\u07af\u0167"+
		"\3\2\2\2\u07b0\u07b2\7M\2\2\u07b1\u07b3\5\u0142\u00a2\2\u07b2\u07b1\3"+
		"\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b5\5f\64\2\u07b5"+
		"\u07b6\5\u016a\u00b6\2\u07b6\u0169\3\2\2\2\u07b7\u07b9\5\u016c\u00b7\2"+
		"\u07b8\u07b7\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07b8\3\2\2\2\u07ba\u07bb"+
		"\3\2\2\2\u07bb\u016b\3\2\2\2\u07bc\u07bd\7\25\2\2\u07bd\u07be\7Y\2\2\u07be"+
		"\u07bf\5\u016e\u00b8\2\u07bf\u07c0\7Z\2\2\u07c0\u07c1\5f\64\2\u07c1\u016d"+
		"\3\2\2\2\u07c2\u07c4\5\u00caf\2\u07c3\u07c2\3\2\2\2\u07c3\u07c4\3\2\2"+
		"\2\u07c4\u07c5\3\2\2\2\u07c5\u07c8\5\u0098M\2\u07c6\u07c9\5\u00e0q\2\u07c7"+
		"\u07c9\5\u00f6|\2\u07c8\u07c6\3\2\2\2\u07c8\u07c7\3\2\2\2\u07c8\u07c9"+
		"\3\2\2\2\u07c9\u07cc\3\2\2\2\u07ca\u07cc\7\u0087\2\2\u07cb\u07c3\3\2\2"+
		"\2\u07cb\u07ca\3\2\2\2\u07cc\u016f\3\2\2\2\u07cd\u07cf\7K\2\2\u07ce\u07d0"+
		"\5X-\2\u07cf\u07ce\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0\u0171\3\2\2\2\u07d1"+
		"\u07d4\5\u0174\u00bb\2\u07d2\u07d4\5\u0178\u00bd\2\u07d3\u07d1\3\2\2\2"+
		"\u07d3\u07d2\3\2\2\2\u07d4\u0173\3\2\2\2\u07d5\u07d6\7K\2\2\u07d6\u07d8"+
		"\7Y\2\2\u07d7\u07d9\5\u0176\u00bc\2\u07d8\u07d7\3\2\2\2\u07d8\u07d9\3"+
		"\2\2\2\u07d9\u07da\3\2\2\2\u07da\u07db\7Z\2\2\u07db\u0175\3\2\2\2\u07dc"+
		"\u07de\5\u00f4{\2\u07dd\u07df\7\u0087\2\2\u07de\u07dd\3\2\2\2\u07de\u07df"+
		"\3\2\2\2\u07df\u07e7\3\2\2\2\u07e0\u07e1\7~\2\2\u07e1\u07e3\5\u00f4{\2"+
		"\u07e2\u07e4\7\u0087\2\2\u07e3\u07e2\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4"+
		"\u07e6\3\2\2\2\u07e5\u07e0\3\2\2\2\u07e6\u07e9\3\2\2\2\u07e7\u07e5\3\2"+
		"\2\2\u07e7\u07e8\3\2\2\2\u07e8\u0177\3\2\2\2\u07e9\u07e7\3\2\2\2\u07ea"+
		"\u07eb\7\66\2\2\u07eb\u07ec\7Y\2\2\u07ec\u07ed\5^\60\2\u07ed\u07ee\7Z"+
		"\2\2\u07ee\u07f1\3\2\2\2\u07ef\u07f1\7\66\2\2\u07f0\u07ea\3\2\2\2\u07f0"+
		"\u07ef\3\2\2\2\u07f1\u0179\3\2\2\2\u07f2\u07f5\7\65\2\2\u07f3\u07f4\7"+
		"[\2\2\u07f4\u07f6\7\\\2\2\u07f5\u07f3\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6"+
		"\u0828\3\2\2\2\u07f7\u07fa\7 \2\2\u07f8\u07f9\7[\2\2\u07f9\u07fb\7\\\2"+
		"\2\u07fa\u07f8\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u0828\3\2\2\2\u07fc\u0828"+
		"\7_\2\2\u07fd\u0828\7`\2\2\u07fe\u0828\7a\2\2\u07ff\u0828\7b\2\2\u0800"+
		"\u0828\7c\2\2\u0801\u0828\7d\2\2\u0802\u0828\7e\2\2\u0803\u0828\7f\2\2"+
		"\u0804\u0828\7g\2\2\u0805\u0828\7h\2\2\u0806\u0828\7i\2\2\u0807\u0828"+
		"\7k\2\2\u0808\u0828\7j\2\2\u0809\u0828\7y\2\2\u080a\u0828\7l\2\2\u080b"+
		"\u0828\7m\2\2\u080c\u0828\7n\2\2\u080d\u0828\7i\2\2\u080e\u0828\7p\2\2"+
		"\u080f\u0828\7q\2\2\u0810\u0828\7r\2\2\u0811\u0828\7s\2\2\u0812\u0813"+
		"\7j\2\2\u0813\u0828\7j\2\2\u0814\u0815\7k\2\2\u0815\u0828\7k\2\2\u0816"+
		"\u0828\7u\2\2\u0817\u0828\7t\2\2\u0818\u0828\7v\2\2\u0819\u0828\7w\2\2"+
		"\u081a\u0828\7x\2\2\u081b\u0828\7y\2\2\u081c\u0828\7z\2\2\u081d\u0828"+
		"\7{\2\2\u081e\u0828\7|\2\2\u081f\u0828\7}\2\2\u0820\u0828\7~\2\2\u0821"+
		"\u0828\7\177\2\2\u0822\u0828\7\u0080\2\2\u0823\u0824\7Y\2\2\u0824\u0828"+
		"\7Z\2\2\u0825\u0826\7[\2\2\u0826\u0828\7\\\2\2\u0827\u07f2\3\2\2\2\u0827"+
		"\u07f7\3\2\2\2\u0827\u07fc\3\2\2\2\u0827\u07fd\3\2\2\2\u0827\u07fe\3\2"+
		"\2\2\u0827\u07ff\3\2\2\2\u0827\u0800\3\2\2\2\u0827\u0801\3\2\2\2\u0827"+
		"\u0802\3\2\2\2\u0827\u0803\3\2\2\2\u0827\u0804\3\2\2\2\u0827\u0805\3\2"+
		"\2\2\u0827\u0806\3\2\2\2\u0827\u0807\3\2\2\2\u0827\u0808\3\2\2\2\u0827"+
		"\u0809\3\2\2\2\u0827\u080a\3\2\2\2\u0827\u080b\3\2\2\2\u0827\u080c\3\2"+
		"\2\2\u0827\u080d\3\2\2\2\u0827\u080e\3\2\2\2\u0827\u080f\3\2\2\2\u0827"+
		"\u0810\3\2\2\2\u0827\u0811\3\2\2\2\u0827\u0812\3\2\2\2\u0827\u0814\3\2"+
		"\2\2\u0827\u0816\3\2\2\2\u0827\u0817\3\2\2\2\u0827\u0818\3\2\2\2\u0827"+
		"\u0819\3\2\2\2\u0827\u081a\3\2\2\2\u0827\u081b\3\2\2\2\u0827\u081c\3\2"+
		"\2\2\u0827\u081d\3\2\2\2\u0827\u081e\3\2\2\2\u0827\u081f\3\2\2\2\u0827"+
		"\u0820\3\2\2\2\u0827\u0821\3\2\2\2\u0827\u0822\3\2\2\2\u0827\u0823\3\2"+
		"\2\2\u0827\u0825\3\2\2\2\u0828\u017b\3\2\2\2\u0829\u082a\t\26\2\2\u082a"+
		"\u017d\3\2\2\2\u012e\u017f\u0186\u018f\u0193\u019c\u019f\u01a3\u01ab\u01b2"+
		"\u01b5\u01ba\u01bf\u01c5\u01cd\u01cf\u01d8\u01dc\u01e0\u01e3\u01e7\u01ea"+
		"\u01f1\u01f5\u01f8\u01fb\u01fe\u0204\u0208\u020c\u021a\u021e\u0224\u022b"+
		"\u0231\u0235\u0237\u0239\u0241\u0246\u0253\u025a\u0266\u0270\u0275\u0279"+
		"\u0280\u0283\u028b\u028f\u0292\u0299\u02a0\u02a4\u02a9\u02ad\u02b0\u02b5"+
		"\u02c4\u02cb\u02d3\u02db\u02e4\u02e7\u02ef\u02f6\u02fd\u0305\u030b\u0312"+
		"\u031a\u0322\u032a\u0332\u033b\u0343\u034c\u0353\u035b\u035e\u0361\u0367"+
		"\u036d\u0373\u037a\u0383\u038b\u038f\u0396\u0398\u03ac\u03b0\u03b6\u03bb"+
		"\u03bf\u03c2\u03c9\u03d0\u03d4\u03dd\u03e1\u03eb\u03f0\u03f7\u03fa\u03ff"+
		"\u0404\u0419\u041e\u0421\u042c\u0432\u0437\u043a\u043f\u0442\u0445\u045b"+
		"\u0461\u0467\u046d\u0470\u0476\u047a\u047e\u0481\u0489\u048b\u0491\u0494"+
		"\u0497\u049a\u049e\u04a2\u04a8\u04b2\u04b8\u04be\u04c3\u04c8\u04cc\u04d9"+
		"\u04df\u04e3\u04e9\u04ee\u04fd\u0501\u0506\u050b\u0510\u0516\u0519\u0522"+
		"\u0526\u052b\u052f\u0535\u053c\u054d\u054f\u0556\u055b\u0562\u0566\u056a"+
		"\u0572\u0578\u057e\u0582\u0584\u0588\u058d\u0591\u0594\u0597\u059a\u059f"+
		"\u05a3\u05a6\u05aa\u05ad\u05af\u05b4\u05bb\u05c1\u05c5\u05cb\u05d1\u05d4"+
		"\u05d6\u05dc\u05e0\u05e6\u05ed\u05f1\u05f3\u05f7\u05fd\u0609\u060d\u060f"+
		"\u0613\u0618\u061b\u0622\u0626\u062b\u062d\u0631\u0635\u0638\u063c\u0646"+
		"\u064d\u0654\u0659\u065d\u0661\u0666\u066a\u0670\u0672\u0678\u067d\u0683"+
		"\u0687\u0689\u068c\u0690\u0694\u0696\u0698\u069b\u06a7\u06a9\u06ac\u06af"+
		"\u06b2\u06bb\u06c2\u06c7\u06ca\u06cd\u06cf\u06d2\u06d5\u06d9\u06de\u06eb"+
		"\u06f0\u06f4\u06f8\u06fd\u0702\u0706\u0709\u070d\u0718\u071c\u0723\u0728"+
		"\u072c\u0732\u0736\u073a\u0743\u0750\u0755\u075c\u0760\u0763\u0766\u0769"+
		"\u076d\u0772\u0779\u077d\u0781\u0787\u078c\u0790\u0796\u079c\u079f\u07a2"+
		"\u07b2\u07ba\u07c3\u07c8\u07cb\u07cf\u07d3\u07d8\u07de\u07e3\u07e7\u07f0"+
		"\u07f5\u07fa\u0827";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}