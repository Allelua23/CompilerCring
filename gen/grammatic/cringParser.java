// Generated from E:/IntelliJ IDEA Community Edition 2019.2.4/Kurs/src/grammatic\cring.g4 by ANTLR 4.8
package grammatic;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cringParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, STRING=5, OR=6, AND=7, EQ=8, NE=9, GT=10, 
		LT=11, GE=12, LE=13, PLUS=14, MINUS=15, MUL=16, DIV=17, MOD=18, POW=19, 
		NOT=20, SCOL=21, ASSIGN=22, OPAR=23, CPAR=24, OBRACE=25, CBRACE=26, TRUE=27, 
		FALSE=28, FOR=29, IF=30, ELSE=31, WHILE=32, PRINT=33, FUNC=34, MAIN=35, 
		BREAK=36, CONT=37, RET=38, INT=39, CHAR=40, FLOAT=41, BOOL=42, IDENTIFIER=43, 
		NUMBER=44, Newline=45, WS=46, COMMENTS=47, LINE_COMM=48;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_mainProg = 2, RULE_block = 3, 
		RULE_statement = 4, RULE_varDeclaration = 5, RULE_callMethod = 6, RULE_print = 7, 
		RULE_ifStatement = 8, RULE_assign = 9, RULE_whileStatement = 10, RULE_forStatement = 11, 
		RULE_forInside = 12, RULE_forInit = 13, RULE_breakStat = 14, RULE_contStat = 15, 
		RULE_retStat = 16, RULE_parametr = 17, RULE_parametrs = 18, RULE_parametrList = 19, 
		RULE_expression = 20, RULE_expressionList = 21, RULE_literal = 22, RULE_intLiteral = 23, 
		RULE_charLiteral = 24, RULE_floatLiteral = 25, RULE_boolLiteral = 26, 
		RULE_type = 27, RULE_varname = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "mainProg", "block", "statement", "varDeclaration", 
			"callMethod", "print", "ifStatement", "assign", "whileStatement", "forStatement", 
			"forInside", "forInit", "breakStat", "contStat", "retStat", "parametr", 
			"parametrs", "parametrList", "expression", "expressionList", "literal", 
			"intLiteral", "charLiteral", "floatLiteral", "boolLiteral", "type", "varname"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'''", "'.'", "'string'", null, null, null, "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", 
			"'!'", "';'", "'='", "'('", "')'", "'{'", "'}'", "'true'", "'false'", 
			"'for'", "'if'", "'else'", "'while'", "'print'", "'function'", "'main()'", 
			"'break'", "'continue'", "'return'", "'int'", "'char'", "'float'", "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "STRING", "OR", "AND", "EQ", "NE", "GT", 
			"LT", "GE", "LE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "NOT", 
			"SCOL", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "TRUE", "FALSE", 
			"FOR", "IF", "ELSE", "WHILE", "PRINT", "FUNC", "MAIN", "BREAK", "CONT", 
			"RET", "INT", "CHAR", "FLOAT", "BOOL", "IDENTIFIER", "NUMBER", "Newline", 
			"WS", "COMMENTS", "LINE_COMM"
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
	public String getGrammarFileName() { return "cring.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cringParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainProgContext mainProg() {
			return getRuleContext(MainProgContext.class,0);
		}
		public TerminalNode EOF() { return getToken(cringParser.EOF, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << INT) | (1L << CHAR) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
				{
				setState(58);
				function();
				}
			}

			setState(61);
			mainProg();
			setState(62);
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

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> FUNC() { return getTokens(cringParser.FUNC); }
		public TerminalNode FUNC(int i) {
			return getToken(cringParser.FUNC, i);
		}
		public List<VarnameContext> varname() {
			return getRuleContexts(VarnameContext.class);
		}
		public VarnameContext varname(int i) {
			return getRuleContext(VarnameContext.class,i);
		}
		public List<TerminalNode> OPAR() { return getTokens(cringParser.OPAR); }
		public TerminalNode OPAR(int i) {
			return getToken(cringParser.OPAR, i);
		}
		public List<ParametrListContext> parametrList() {
			return getRuleContexts(ParametrListContext.class);
		}
		public ParametrListContext parametrList(int i) {
			return getRuleContext(ParametrListContext.class,i);
		}
		public List<TerminalNode> CPAR() { return getTokens(cringParser.CPAR); }
		public TerminalNode CPAR(int i) {
			return getToken(cringParser.CPAR, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			type();
			setState(65);
			match(FUNC);
			setState(66);
			varname();
			setState(67);
			match(OPAR);
			setState(68);
			parametrList();
			setState(69);
			match(CPAR);
			setState(70);
			block();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(71);
				match(FUNC);
				setState(72);
				varname();
				setState(73);
				match(OPAR);
				setState(74);
				parametrList();
				setState(75);
				match(CPAR);
				setState(76);
				block();
				}
				}
				setState(82);
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

	public static class MainProgContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(cringParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainProg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterMainProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitMainProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitMainProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainProgContext mainProg() throws RecognitionException {
		MainProgContext _localctx = new MainProgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainProg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(MAIN);
			setState(84);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(cringParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(cringParser.CBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(OBRACE);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << STRING) | (1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << BREAK) | (1L << CONT) | (1L << RET) | (1L << INT) | (1L << CHAR) | (1L << FLOAT) | (1L << BOOL) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(87);
				statement();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(CBRACE);
			}
		}
		catch (RecognitionException re) {
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
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(cringParser.SCOL, 0); }
		public CallMethodContext callMethod() {
			return getRuleContext(CallMethodContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BreakStatContext breakStat() {
			return getRuleContext(BreakStatContext.class,0);
		}
		public ContStatContext contStat() {
			return getRuleContext(ContStatContext.class,0);
		}
		public RetStatContext retStat() {
			return getRuleContext(RetStatContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				varDeclaration();
				setState(96);
				match(SCOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				callMethod();
				setState(99);
				match(SCOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				expression(0);
				setState(102);
				match(SCOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				print();
				setState(105);
				match(SCOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				assign();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(109);
				whileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(110);
				forStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(111);
				breakStat();
				setState(112);
				match(SCOL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(114);
				contStat();
				setState(115);
				match(SCOL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(117);
				retStat();
				setState(118);
				match(SCOL);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(cringParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			type();
			setState(123);
			varname();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(124);
				match(ASSIGN);
				setState(125);
				expression(0);
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

	public static class CallMethodContext extends ParserRuleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(cringParser.OPAR, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(cringParser.CPAR, 0); }
		public CallMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterCallMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitCallMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitCallMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallMethodContext callMethod() throws RecognitionException {
		CallMethodContext _localctx = new CallMethodContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_callMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			varname();
			setState(129);
			match(OPAR);
			setState(130);
			expressionList();
			setState(131);
			match(CPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(cringParser.PRINT, 0); }
		public TerminalNode OPAR() { return getToken(cringParser.OPAR, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(cringParser.CPAR, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(PRINT);
			setState(134);
			match(OPAR);
			setState(135);
			expressionList();
			setState(136);
			match(CPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(cringParser.IF, 0); }
		public TerminalNode OPAR() { return getToken(cringParser.OPAR, 0); }
		public ParametrsContext parametrs() {
			return getRuleContext(ParametrsContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(cringParser.CPAR, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(cringParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IF);
			setState(139);
			match(OPAR);
			setState(140);
			parametrs();
			setState(141);
			match(CPAR);
			setState(142);
			block();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(143);
				match(ELSE);
				setState(144);
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

	public static class AssignContext extends ParserRuleContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(cringParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(cringParser.SCOL, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			varname();
			setState(148);
			match(ASSIGN);
			setState(149);
			expression(0);
			setState(150);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode WHILE() { return getToken(cringParser.WHILE, 0); }
		public TerminalNode OPAR() { return getToken(cringParser.OPAR, 0); }
		public ParametrsContext parametrs() {
			return getRuleContext(ParametrsContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(cringParser.CPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(WHILE);
			setState(153);
			match(OPAR);
			setState(154);
			parametrs();
			setState(155);
			match(CPAR);
			setState(156);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(cringParser.FOR, 0); }
		public TerminalNode OPAR() { return getToken(cringParser.OPAR, 0); }
		public ForInsideContext forInside() {
			return getRuleContext(ForInsideContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(cringParser.CPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(FOR);
			setState(159);
			match(OPAR);
			setState(160);
			forInside();
			setState(161);
			match(CPAR);
			setState(162);
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

	public static class ForInsideContext extends ParserRuleContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(cringParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(cringParser.SCOL, i);
		}
		public ParametrsContext parametrs() {
			return getRuleContext(ParametrsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterForInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitForInside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitForInside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInsideContext forInside() throws RecognitionException {
		ForInsideContext _localctx = new ForInsideContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forInside);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			forInit();
			setState(165);
			match(SCOL);
			setState(166);
			parametrs();
			setState(167);
			match(SCOL);
			setState(168);
			expression(0);
			}
		}
		catch (RecognitionException re) {
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
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case INT:
			case CHAR:
			case FLOAT:
			case BOOL:
				{
				setState(170);
				varDeclaration();
				}
				break;
			case T__1:
			case STRING:
			case MINUS:
			case NOT:
			case OPAR:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
			case NUMBER:
				{
				setState(171);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(174);
				match(T__0);
				setState(177);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case INT:
				case CHAR:
				case FLOAT:
				case BOOL:
					{
					setState(175);
					varDeclaration();
					}
					break;
				case T__1:
				case STRING:
				case MINUS:
				case NOT:
				case OPAR:
				case TRUE:
				case FALSE:
				case IDENTIFIER:
				case NUMBER:
					{
					setState(176);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(183);
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

	public static class BreakStatContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(cringParser.BREAK, 0); }
		public BreakStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterBreakStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitBreakStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitBreakStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatContext breakStat() throws RecognitionException {
		BreakStatContext _localctx = new BreakStatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_breakStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContStatContext extends ParserRuleContext {
		public TerminalNode CONT() { return getToken(cringParser.CONT, 0); }
		public ContStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterContStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitContStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitContStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContStatContext contStat() throws RecognitionException {
		ContStatContext _localctx = new ContStatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_contStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(CONT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetStatContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(cringParser.RET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterRetStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitRetStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitRetStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetStatContext retStat() throws RecognitionException {
		RetStatContext _localctx = new RetStatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_retStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(RET);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << STRING) | (1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(189);
				expression(0);
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

	public static class ParametrContext extends ParserRuleContext {
		public ParametrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametr; }
	 
		public ParametrContext() { }
		public void copyFrom(ParametrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LessThenConclusionContext extends ParametrContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(cringParser.LT, 0); }
		public TerminalNode LE() { return getToken(cringParser.LE, 0); }
		public LessThenConclusionContext(ParametrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterLessThenConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitLessThenConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitLessThenConclusion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallMethodConlusinContext extends ParametrContext {
		public CallMethodContext callMethod() {
			return getRuleContext(CallMethodContext.class,0);
		}
		public CallMethodConlusinContext(ParametrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterCallMethodConlusin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitCallMethodConlusin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitCallMethodConlusin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityConclusionContext extends ParametrContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(cringParser.EQ, 0); }
		public TerminalNode NE() { return getToken(cringParser.NE, 0); }
		public EqualityConclusionContext(ParametrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterEqualityConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitEqualityConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitEqualityConclusion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpConclusinContext extends ParametrContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpConclusinContext(ParametrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterExpConclusin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitExpConclusin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitExpConclusin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoreThenConclusionContext extends ParametrContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(cringParser.GT, 0); }
		public TerminalNode GE() { return getToken(cringParser.GE, 0); }
		public MoreThenConclusionContext(ParametrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterMoreThenConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitMoreThenConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitMoreThenConclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrContext parametr() throws RecognitionException {
		ParametrContext _localctx = new ParametrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parametr);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ExpConclusinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				expression(0);
				}
				break;
			case 2:
				_localctx = new CallMethodConlusinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				callMethod();
				}
				break;
			case 3:
				_localctx = new EqualityConclusionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				expression(0);
				setState(195);
				((EqualityConclusionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NE) ) {
					((EqualityConclusionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(196);
				expression(0);
				}
				break;
			case 4:
				_localctx = new MoreThenConclusionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				expression(0);
				setState(199);
				((MoreThenConclusionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GT || _la==GE) ) {
					((MoreThenConclusionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(200);
				expression(0);
				}
				break;
			case 5:
				_localctx = new LessThenConclusionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				expression(0);
				setState(203);
				((LessThenConclusionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LT || _la==LE) ) {
					((LessThenConclusionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
				expression(0);
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

	public static class ParametrsContext extends ParserRuleContext {
		public Token pob;
		public List<ParametrContext> parametr() {
			return getRuleContexts(ParametrContext.class);
		}
		public ParametrContext parametr(int i) {
			return getRuleContext(ParametrContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(cringParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(cringParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(cringParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(cringParser.OR, i);
		}
		public ParametrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterParametrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitParametrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitParametrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrsContext parametrs() throws RecognitionException {
		ParametrsContext _localctx = new ParametrsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parametrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			parametr();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(209);
				((ParametrsContext)_localctx).pob = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
					((ParametrsContext)_localctx).pob = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(210);
				parametr();
				}
				}
				setState(215);
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

	public static class ParametrListContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ParametrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterParametrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitParametrList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitParametrList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrListContext parametrList() throws RecognitionException {
		ParametrListContext _localctx = new ParametrListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametrList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << INT) | (1L << CHAR) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
				{
				setState(216);
				varDeclaration();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(217);
					match(T__0);
					setState(218);
					varDeclaration();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditiveExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(cringParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(cringParser.MINUS, 0); }
		public AdditiveExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallMethodExprContext extends ExpressionContext {
		public CallMethodContext callMethod() {
			return getRuleContext(CallMethodContext.class,0);
		}
		public CallMethodExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterCallMethodExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitCallMethodExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitCallMethodExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarnameExprContext extends ExpressionContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public VarnameExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterVarnameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitVarnameExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitVarnameExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExprContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(cringParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExpressionContext {
		public TerminalNode OPAR() { return getToken(cringParser.OPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(cringParser.CPAR, 0); }
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(cringParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(cringParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(cringParser.MOD, 0); }
		public MultiplicationExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitMultiplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitMultiplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExpressionContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExprContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(cringParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitUnaryMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitUnaryMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(227);
				assign();
				}
				break;
			case 2:
				{
				_localctx = new CallMethodExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				callMethod();
				}
				break;
			case 3:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(MINUS);
				setState(230);
				expression(7);
				}
				break;
			case 4:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				match(NOT);
				setState(232);
				expression(6);
				}
				break;
			case 5:
				{
				_localctx = new VarnameExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				varname();
				}
				break;
			case 6:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				literal();
				}
				break;
			case 7:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				match(OPAR);
				setState(236);
				expression(0);
				setState(237);
				match(CPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(242);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(243);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(245);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(246);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << STRING) | (1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) {
				{
				setState(252);
				expression(0);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(253);
					match(T__0);
					setState(254);
					expression(0);
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class LiteralContext extends ParserRuleContext {
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_literal);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				intLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				charLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				floatLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				boolLiteral();
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

	public static class IntLiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(cringParser.NUMBER, 0); }
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_intLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharLiteralContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(cringParser.IDENTIFIER, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitCharLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_charLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__1);
			setState(271);
			match(IDENTIFIER);
			setState(272);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(cringParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(cringParser.NUMBER, i);
		}
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(NUMBER);
			setState(275);
			match(T__2);
			setState(276);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(cringParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(cringParser.FALSE, 0); }
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
		public TerminalNode INT() { return getToken(cringParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(cringParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(cringParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(cringParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << INT) | (1L << CHAR) | (1L << FLOAT) | (1L << BOOL))) != 0)) ) {
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

	public static class VarnameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(cringParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(cringParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(cringParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(cringParser.NUMBER, i);
		}
		public TerminalNode STRING() { return getToken(cringParser.STRING, 0); }
		public VarnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cringListener ) ((cringListener)listener).exitVarname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cringVisitor ) return ((cringVisitor<? extends T>)visitor).visitVarname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_varname);
		int _la;
		try {
			int _alt;
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(IDENTIFIER);
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(283);
						_la = _input.LA(1);
						if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
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
					setState(288);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0127\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\5\2>\n\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3Q\n"+
		"\3\f\3\16\3T\13\3\3\4\3\4\3\4\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\7\3\7\3\7\3\7\5\7\u0081\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0094\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u00af\n"+
		"\17\3\17\3\17\3\17\5\17\u00b4\n\17\7\17\u00b6\n\17\f\17\16\17\u00b9\13"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\5\22\u00c1\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d1\n\23\3\24"+
		"\3\24\3\24\7\24\u00d6\n\24\f\24\16\24\u00d9\13\24\3\25\3\25\3\25\7\25"+
		"\u00de\n\25\f\25\16\25\u00e1\13\25\5\25\u00e3\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f2\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u00fa\n\26\f\26\16\26\u00fd\13\26\3\27\3\27"+
		"\3\27\7\27\u0102\n\27\f\27\16\27\u0105\13\27\5\27\u0107\n\27\3\30\3\30"+
		"\3\30\3\30\5\30\u010d\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\7\36\u011f\n\36\f\36\16\36\u0122\13"+
		"\36\3\36\5\36\u0125\n\36\3\36\2\3*\37\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:\2\13\3\2\n\13\4\2\f\f\16\16\4\2\r\r\17\17"+
		"\3\2\b\t\3\2\22\24\3\2\20\21\3\2\35\36\4\2\6\6),\3\2-.\2\u0132\2=\3\2"+
		"\2\2\4B\3\2\2\2\6U\3\2\2\2\bX\3\2\2\2\nz\3\2\2\2\f|\3\2\2\2\16\u0082\3"+
		"\2\2\2\20\u0087\3\2\2\2\22\u008c\3\2\2\2\24\u0095\3\2\2\2\26\u009a\3\2"+
		"\2\2\30\u00a0\3\2\2\2\32\u00a6\3\2\2\2\34\u00ae\3\2\2\2\36\u00ba\3\2\2"+
		"\2 \u00bc\3\2\2\2\"\u00be\3\2\2\2$\u00d0\3\2\2\2&\u00d2\3\2\2\2(\u00e2"+
		"\3\2\2\2*\u00f1\3\2\2\2,\u0106\3\2\2\2.\u010c\3\2\2\2\60\u010e\3\2\2\2"+
		"\62\u0110\3\2\2\2\64\u0114\3\2\2\2\66\u0118\3\2\2\28\u011a\3\2\2\2:\u0124"+
		"\3\2\2\2<>\5\4\3\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\5\6\4\2@A\7\2\2\3A"+
		"\3\3\2\2\2BC\58\35\2CD\7$\2\2DE\5:\36\2EF\7\31\2\2FG\5(\25\2GH\7\32\2"+
		"\2HR\5\b\5\2IJ\7$\2\2JK\5:\36\2KL\7\31\2\2LM\5(\25\2MN\7\32\2\2NO\5\b"+
		"\5\2OQ\3\2\2\2PI\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\5\3\2\2\2TR\3"+
		"\2\2\2UV\7%\2\2VW\5\b\5\2W\7\3\2\2\2X\\\7\33\2\2Y[\5\n\6\2ZY\3\2\2\2["+
		"^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\34\2\2`\t\3\2"+
		"\2\2ab\5\f\7\2bc\7\27\2\2c{\3\2\2\2de\5\16\b\2ef\7\27\2\2f{\3\2\2\2gh"+
		"\5*\26\2hi\7\27\2\2i{\3\2\2\2jk\5\20\t\2kl\7\27\2\2l{\3\2\2\2m{\5\22\n"+
		"\2n{\5\24\13\2o{\5\26\f\2p{\5\30\r\2qr\5\36\20\2rs\7\27\2\2s{\3\2\2\2"+
		"tu\5 \21\2uv\7\27\2\2v{\3\2\2\2wx\5\"\22\2xy\7\27\2\2y{\3\2\2\2za\3\2"+
		"\2\2zd\3\2\2\2zg\3\2\2\2zj\3\2\2\2zm\3\2\2\2zn\3\2\2\2zo\3\2\2\2zp\3\2"+
		"\2\2zq\3\2\2\2zt\3\2\2\2zw\3\2\2\2{\13\3\2\2\2|}\58\35\2}\u0080\5:\36"+
		"\2~\177\7\30\2\2\177\u0081\5*\26\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\r\3\2\2\2\u0082\u0083\5:\36\2\u0083\u0084\7\31\2\2\u0084\u0085"+
		"\5,\27\2\u0085\u0086\7\32\2\2\u0086\17\3\2\2\2\u0087\u0088\7#\2\2\u0088"+
		"\u0089\7\31\2\2\u0089\u008a\5,\27\2\u008a\u008b\7\32\2\2\u008b\21\3\2"+
		"\2\2\u008c\u008d\7 \2\2\u008d\u008e\7\31\2\2\u008e\u008f\5&\24\2\u008f"+
		"\u0090\7\32\2\2\u0090\u0093\5\b\5\2\u0091\u0092\7!\2\2\u0092\u0094\5\b"+
		"\5\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\23\3\2\2\2\u0095\u0096"+
		"\5:\36\2\u0096\u0097\7\30\2\2\u0097\u0098\5*\26\2\u0098\u0099\7\27\2\2"+
		"\u0099\25\3\2\2\2\u009a\u009b\7\"\2\2\u009b\u009c\7\31\2\2\u009c\u009d"+
		"\5&\24\2\u009d\u009e\7\32\2\2\u009e\u009f\5\b\5\2\u009f\27\3\2\2\2\u00a0"+
		"\u00a1\7\37\2\2\u00a1\u00a2\7\31\2\2\u00a2\u00a3\5\32\16\2\u00a3\u00a4"+
		"\7\32\2\2\u00a4\u00a5\5\b\5\2\u00a5\31\3\2\2\2\u00a6\u00a7\5\34\17\2\u00a7"+
		"\u00a8\7\27\2\2\u00a8\u00a9\5&\24\2\u00a9\u00aa\7\27\2\2\u00aa\u00ab\5"+
		"*\26\2\u00ab\33\3\2\2\2\u00ac\u00af\5\f\7\2\u00ad\u00af\5*\26\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b7\3\2\2\2\u00b0\u00b3\7\3"+
		"\2\2\u00b1\u00b4\5\f\7\2\u00b2\u00b4\5*\26\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6\u00b9\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\35\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bb\7&\2\2\u00bb\37\3\2\2\2\u00bc\u00bd\7\'\2\2\u00bd"+
		"!\3\2\2\2\u00be\u00c0\7(\2\2\u00bf\u00c1\5*\26\2\u00c0\u00bf\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1#\3\2\2\2\u00c2\u00d1\5*\26\2\u00c3\u00d1\5\16\b\2"+
		"\u00c4\u00c5\5*\26\2\u00c5\u00c6\t\2\2\2\u00c6\u00c7\5*\26\2\u00c7\u00d1"+
		"\3\2\2\2\u00c8\u00c9\5*\26\2\u00c9\u00ca\t\3\2\2\u00ca\u00cb\5*\26\2\u00cb"+
		"\u00d1\3\2\2\2\u00cc\u00cd\5*\26\2\u00cd\u00ce\t\4\2\2\u00ce\u00cf\5*"+
		"\26\2\u00cf\u00d1\3\2\2\2\u00d0\u00c2\3\2\2\2\u00d0\u00c3\3\2\2\2\u00d0"+
		"\u00c4\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1%\3\2\2\2"+
		"\u00d2\u00d7\5$\23\2\u00d3\u00d4\t\5\2\2\u00d4\u00d6\5$\23\2\u00d5\u00d3"+
		"\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\'\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00df\5\f\7\2\u00db\u00dc\7\3\2\2"+
		"\u00dc\u00de\5\f\7\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00da\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3)\3\2\2\2\u00e4\u00e5\b\26\1\2"+
		"\u00e5\u00f2\5\24\13\2\u00e6\u00f2\5\16\b\2\u00e7\u00e8\7\21\2\2\u00e8"+
		"\u00f2\5*\26\t\u00e9\u00ea\7\26\2\2\u00ea\u00f2\5*\26\b\u00eb\u00f2\5"+
		":\36\2\u00ec\u00f2\5.\30\2\u00ed\u00ee\7\31\2\2\u00ee\u00ef\5*\26\2\u00ef"+
		"\u00f0\7\32\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00e4\3\2\2\2\u00f1\u00e6\3"+
		"\2\2\2\u00f1\u00e7\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1"+
		"\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2\u00fb\3\2\2\2\u00f3\u00f4\f\7"+
		"\2\2\u00f4\u00f5\t\6\2\2\u00f5\u00fa\5*\26\b\u00f6\u00f7\f\6\2\2\u00f7"+
		"\u00f8\t\7\2\2\u00f8\u00fa\5*\26\7\u00f9\u00f3\3\2\2\2\u00f9\u00f6\3\2"+
		"\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"+\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0103\5*\26\2\u00ff\u0100\7\3\2\2"+
		"\u0100\u0102\5*\26\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u00fe\3\2\2\2\u0106\u0107\3\2\2\2\u0107-\3\2\2\2\u0108\u010d\5\60\31"+
		"\2\u0109\u010d\5\62\32\2\u010a\u010d\5\64\33\2\u010b\u010d\5\66\34\2\u010c"+
		"\u0108\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2"+
		"\2\2\u010d/\3\2\2\2\u010e\u010f\7.\2\2\u010f\61\3\2\2\2\u0110\u0111\7"+
		"\4\2\2\u0111\u0112\7-\2\2\u0112\u0113\7\4\2\2\u0113\63\3\2\2\2\u0114\u0115"+
		"\7.\2\2\u0115\u0116\7\5\2\2\u0116\u0117\7.\2\2\u0117\65\3\2\2\2\u0118"+
		"\u0119\t\b\2\2\u0119\67\3\2\2\2\u011a\u011b\t\t\2\2\u011b9\3\2\2\2\u011c"+
		"\u0120\7-\2\2\u011d\u011f\t\n\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0125\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0125\7\7\2\2\u0124\u011c\3\2\2\2\u0124\u0123\3\2"+
		"\2\2\u0125;\3\2\2\2\30=R\\z\u0080\u0093\u00ae\u00b3\u00b7\u00c0\u00d0"+
		"\u00d7\u00df\u00e2\u00f1\u00f9\u00fb\u0103\u0106\u010c\u0120\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}