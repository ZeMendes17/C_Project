// Generated from dimana.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class dimanaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, ID=31, INT=32, 
		REAL=33, STRING=34, WS=35, LINE_COMMENT=36, ERROR=37;
	public static final int
		RULE_program = 0, RULE_statList = 1, RULE_statement = 2, RULE_variableDeclaration = 3, 
		RULE_assignment = 4, RULE_inputStatement = 5, RULE_outputStatement = 6, 
		RULE_outputFormat = 7, RULE_write_expr = 8, RULE_loopStatement = 9, RULE_headerFile = 10, 
		RULE_prefixUnit = 11, RULE_unit = 12, RULE_alternativeUnit = 13, RULE_listDeclaration = 14, 
		RULE_expression = 15, RULE_dataType = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statList", "statement", "variableDeclaration", "assignment", 
			"inputStatement", "outputStatement", "outputFormat", "write_expr", "loopStatement", 
			"headerFile", "prefixUnit", "unit", "alternativeUnit", "listDeclaration", 
			"expression", "dataType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "'read'", "')'", "'*'", "','", "'string'", 
			"'write'", "'writeln'", "'for'", "'to'", "'length'", "'do'", "'end'", 
			"'use'", "'prefix'", "'1e'", "'-'", "'dimension'", "'['", "']'", "'unit'", 
			"'list'", "'new'", "'/'", "'+'", "'>>'", "'integer'", "'real'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "INT", "REAL", "STRING", 
			"WS", "LINE_COMMENT", "ERROR"
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
	public String getGrammarFileName() { return "dimana.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dimanaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public StatListContext statList() {
			return getRuleContext(StatListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(dimanaParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			statList();
			setState(35);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterStatList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitStatList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitStatList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatListContext statList() throws RecognitionException {
		StatListContext _localctx = new StatListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3784511234L) != 0)) {
				{
				{
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3784511232L) != 0)) {
					{
					setState(37);
					statement();
					}
				}

				setState(40);
				match(T__0);
				}
				}
				setState(45);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public HeaderFileContext headerFile() {
			return getRuleContext(HeaderFileContext.class,0);
		}
		public PrefixUnitContext prefixUnit() {
			return getRuleContext(PrefixUnitContext.class,0);
		}
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public AlternativeUnitContext alternativeUnit() {
			return getRuleContext(AlternativeUnitContext.class,0);
		}
		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				inputStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				outputStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				loopStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				headerFile();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(52);
				prefixUnit();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(53);
				unit();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(54);
				alternativeUnit();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(55);
				listDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			dataType();
			setState(59);
			match(ID);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(60);
				match(T__1);
				setState(61);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
			setState(65);
			match(T__1);
			setState(66);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InputStatementContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitInputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			setState(69);
			match(T__1);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3774873856L) != 0)) {
				{
				setState(70);
				dataType();
				}
			}

			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(73);
				match(T__2);
				}
			}

			setState(76);
			match(T__3);
			setState(77);
			match(STRING);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(78);
				match(T__4);
				}
			}

			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(81);
				match(T__5);
				setState(82);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutputStatementContext extends ParserRuleContext {
		public Write_exprContext write_expr() {
			return getRuleContext(Write_exprContext.class,0);
		}
		public List<OutputFormatContext> outputFormat() {
			return getRuleContexts(OutputFormatContext.class);
		}
		public OutputFormatContext outputFormat(int i) {
			return getRuleContext(OutputFormatContext.class,i);
		}
		public OutputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterOutputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitOutputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitOutputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputStatementContext outputStatement() throws RecognitionException {
		OutputStatementContext _localctx = new OutputStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_outputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			write_expr();
			setState(86);
			outputFormat();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(87);
				match(T__6);
				setState(88);
				outputFormat();
				}
				}
				setState(93);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutputFormatContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(dimanaParser.INT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public OutputFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterOutputFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitOutputFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitOutputFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputFormatContext outputFormat() throws RecognitionException {
		OutputFormatContext _localctx = new OutputFormatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_outputFormat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__7);
			setState(95);
			match(T__2);
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(96);
				expression(0);
				}
				break;
			case 2:
				{
				setState(97);
				match(ID);
				}
				break;
			case 3:
				{
				setState(98);
				match(STRING);
				}
				break;
			}
			setState(101);
			match(T__6);
			setState(102);
			match(INT);
			setState(103);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Write_exprContext extends ParserRuleContext {
		public Write_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterWrite_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitWrite_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitWrite_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_exprContext write_expr() throws RecognitionException {
		Write_exprContext _localctx = new Write_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_write_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopStatementContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(dimanaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(dimanaParser.INT, i);
		}
		public StatListContext statList() {
			return getRuleContext(StatListContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__10);
			setState(108);
			match(ID);
			setState(109);
			match(T__1);
			setState(110);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(111);
			match(T__11);
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(112);
				match(INT);
				}
				break;
			case ID:
				{
				setState(113);
				match(ID);
				}
				break;
			case T__12:
				{
				setState(114);
				match(T__12);
				setState(115);
				match(T__2);
				setState(116);
				match(ID);
				setState(117);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(120);
			match(T__13);
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33839644952L) != 0)) {
					{
					{
					setState(121);
					expression(0);
					setState(122);
					match(T__0);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(129);
				statList();
				}
				break;
			}
			setState(132);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeaderFileContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public HeaderFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterHeaderFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitHeaderFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitHeaderFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderFileContext headerFile() throws RecognitionException {
		HeaderFileContext _localctx = new HeaderFileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_headerFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__15);
			setState(135);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixUnitContext extends ParserRuleContext {
		public Token minus;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public TerminalNode INT() { return getToken(dimanaParser.INT, 0); }
		public PrefixUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterPrefixUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitPrefixUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitPrefixUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixUnitContext prefixUnit() throws RecognitionException {
		PrefixUnitContext _localctx = new PrefixUnitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prefixUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__16);
			setState(138);
			dataType();
			setState(139);
			match(ID);
			setState(140);
			match(T__1);
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(141);
				match(INT);
				}
				break;
			case T__17:
				{
				setState(142);
				match(T__17);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(143);
					((PrefixUnitContext)_localctx).minus = match(T__18);
					}
				}

				setState(146);
				match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnitContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__19);
			setState(150);
			dataType();
			setState(151);
			match(ID);
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				{
				setState(152);
				match(T__20);
				setState(153);
				match(ID);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(154);
					match(T__6);
					setState(155);
					match(ID);
					}
				}

				setState(158);
				match(T__21);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(159);
					match(T__1);
					setState(160);
					expression(0);
					}
				}

				}
				break;
			case T__1:
				{
				setState(163);
				match(T__1);
				setState(164);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlternativeUnitContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AlternativeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternativeUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterAlternativeUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitAlternativeUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitAlternativeUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativeUnitContext alternativeUnit() throws RecognitionException {
		AlternativeUnitContext _localctx = new AlternativeUnitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alternativeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__22);
			setState(168);
			match(ID);
			setState(169);
			match(T__20);
			setState(170);
			match(ID);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(171);
				match(T__6);
				setState(172);
				match(ID);
				}
			}

			setState(175);
			match(T__21);
			setState(176);
			match(T__1);
			setState(177);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListDeclarationContext extends ParserRuleContext {
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public ListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__23);
			setState(180);
			match(T__20);
			setState(181);
			dataType();
			setState(182);
			match(T__21);
			setState(183);
			match(ID);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(184);
				match(T__1);
				setState(185);
				match(T__24);
				setState(186);
				match(T__23);
				setState(187);
				match(T__20);
				setState(188);
				dataType();
				setState(189);
				match(T__21);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class ExprListExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterExprListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitExprListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitExprListExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexExpressionContext extends ExpressionContext {
		public List<TerminalNode> ID() { return getTokens(dimanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimanaParser.ID, i);
		}
		public IndexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public InputExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterInputExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitInputExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitInputExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealLiteralContext extends ExpressionContext {
		public TerminalNode REAL() { return getToken(dimanaParser.REAL, 0); }
		public RealLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterRealLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitRealLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitRealLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAssignExpressionContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(dimanaParser.INT, 0); }
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public StringAssignExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterStringAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitStringAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitStringAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeConversionContext extends ExpressionContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeConversionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterTypeConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitTypeConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitTypeConversion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(dimanaParser.STRING, 0); }
		public StringLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddListExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public AddListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterAddListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitAddListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitAddListExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public IdExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterIdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitIdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitIdExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(dimanaParser.INT, 0); }
		public IntLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterMulDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitMulDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitMulDivExpression(this);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(194);
				match(T__3);
				setState(195);
				match(STRING);
				}
				break;
			case 2:
				{
				_localctx = new StringAssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(T__7);
				setState(197);
				match(T__2);
				setState(198);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(199);
				match(T__6);
				setState(200);
				match(INT);
				setState(201);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				match(T__2);
				setState(203);
				expression(0);
				setState(204);
				match(T__4);
				}
				break;
			case 4:
				{
				_localctx = new IndexExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(ID);
				setState(207);
				match(T__20);
				setState(208);
				match(ID);
				setState(209);
				match(T__21);
				}
				break;
			case 5:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				dataType();
				setState(212);
				match(T__2);
				setState(213);
				expression(0);
				setState(214);
				match(T__4);
				}
				break;
			case 7:
				{
				_localctx = new RealLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(REAL);
				}
				break;
			case 8:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(INT);
				}
				break;
			case 9:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(233);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(222);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(223);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(225);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(228);
						match(T__6);
						setState(229);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new AddListExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(231);
						match(T__27);
						setState(232);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(dimanaParser.ID, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimanaListener ) ((dimanaListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimanaVisitor ) return ((dimanaVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dataType);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(T__29);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(T__7);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(T__23);
				setState(242);
				match(T__20);
				setState(243);
				match(ID);
				setState(244);
				match(T__21);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				match(ID);
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
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u00f9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0003\u0001\'\b\u0001\u0001\u0001\u0005\u0001*\b\u0001\n\u0001\f\u0001"+
		"-\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"9\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"?\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005H\b\u0005\u0001\u0005\u0003\u0005"+
		"K\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005P\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005T\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006Z\b\u0006\n\u0006\f\u0006]\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007d\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\tw\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t}\b\t\n\t\f\t\u0080\t\t\u0001\t\u0003\t\u0083\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0091\b\u000b\u0001\u000b\u0003"+
		"\u000b\u0094\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u009d\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a2\b\f\u0001\f"+
		"\u0001\f\u0003\f\u00a6\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00ae\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c0"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00dc\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ea"+
		"\b\u000f\n\u000f\f\u000f\u00ed\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00f7\b\u0010\u0001\u0010\u0000\u0001\u001e\u0011\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0005"+
		"\u0001\u0000\t\n\u0001\u0000\u001f \u0002\u0000\u001f\u001f\"\"\u0002"+
		"\u0000\u0006\u0006\u001a\u001a\u0002\u0000\u0013\u0013\u001b\u001b\u0115"+
		"\u0000\"\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004"+
		"8\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\b@\u0001\u0000"+
		"\u0000\u0000\nD\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000e"+
		"^\u0001\u0000\u0000\u0000\u0010i\u0001\u0000\u0000\u0000\u0012k\u0001"+
		"\u0000\u0000\u0000\u0014\u0086\u0001\u0000\u0000\u0000\u0016\u0089\u0001"+
		"\u0000\u0000\u0000\u0018\u0095\u0001\u0000\u0000\u0000\u001a\u00a7\u0001"+
		"\u0000\u0000\u0000\u001c\u00b3\u0001\u0000\u0000\u0000\u001e\u00db\u0001"+
		"\u0000\u0000\u0000 \u00f6\u0001\u0000\u0000\u0000\"#\u0003\u0002\u0001"+
		"\u0000#$\u0005\u0000\u0000\u0001$\u0001\u0001\u0000\u0000\u0000%\'\u0003"+
		"\u0004\u0002\u0000&%\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'(\u0001\u0000\u0000\u0000(*\u0005\u0001\u0000\u0000)&\u0001\u0000\u0000"+
		"\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,\u0003\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		".9\u0003\n\u0005\u0000/9\u0003\b\u0004\u000009\u0003\u0006\u0003\u0000"+
		"19\u0003\f\u0006\u000029\u0003\u0012\t\u000039\u0003\u0014\n\u000049\u0003"+
		"\u0016\u000b\u000059\u0003\u0018\f\u000069\u0003\u001a\r\u000079\u0003"+
		"\u001c\u000e\u00008.\u0001\u0000\u0000\u00008/\u0001\u0000\u0000\u0000"+
		"80\u0001\u0000\u0000\u000081\u0001\u0000\u0000\u000082\u0001\u0000\u0000"+
		"\u000083\u0001\u0000\u0000\u000084\u0001\u0000\u0000\u000085\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u00009\u0005"+
		"\u0001\u0000\u0000\u0000:;\u0003 \u0010\u0000;>\u0005\u001f\u0000\u0000"+
		"<=\u0005\u0002\u0000\u0000=?\u0003\u001e\u000f\u0000><\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?\u0007\u0001\u0000\u0000\u0000@A\u0005"+
		"\u001f\u0000\u0000AB\u0005\u0002\u0000\u0000BC\u0003\u001e\u000f\u0000"+
		"C\t\u0001\u0000\u0000\u0000DE\u0005\u001f\u0000\u0000EG\u0005\u0002\u0000"+
		"\u0000FH\u0003 \u0010\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HJ\u0001\u0000\u0000\u0000IK\u0005\u0003\u0000\u0000JI\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0005"+
		"\u0004\u0000\u0000MO\u0005\"\u0000\u0000NP\u0005\u0005\u0000\u0000ON\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000"+
		"QR\u0005\u0006\u0000\u0000RT\u0005\u001f\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0003"+
		"\u0010\b\u0000V[\u0003\u000e\u0007\u0000WX\u0005\u0007\u0000\u0000XZ\u0003"+
		"\u000e\u0007\u0000YW\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\r\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005\b\u0000\u0000_c\u0005\u0003"+
		"\u0000\u0000`d\u0003\u001e\u000f\u0000ad\u0005\u001f\u0000\u0000bd\u0005"+
		"\"\u0000\u0000c`\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0005\u0007\u0000\u0000"+
		"fg\u0005 \u0000\u0000gh\u0005\u0005\u0000\u0000h\u000f\u0001\u0000\u0000"+
		"\u0000ij\u0007\u0000\u0000\u0000j\u0011\u0001\u0000\u0000\u0000kl\u0005"+
		"\u000b\u0000\u0000lm\u0005\u001f\u0000\u0000mn\u0005\u0002\u0000\u0000"+
		"no\u0007\u0001\u0000\u0000ov\u0005\f\u0000\u0000pw\u0005 \u0000\u0000"+
		"qw\u0005\u001f\u0000\u0000rs\u0005\r\u0000\u0000st\u0005\u0003\u0000\u0000"+
		"tu\u0005\u001f\u0000\u0000uw\u0005\u0005\u0000\u0000vp\u0001\u0000\u0000"+
		"\u0000vq\u0001\u0000\u0000\u0000vr\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000x\u0082\u0005\u000e\u0000\u0000yz\u0003\u001e\u000f\u0000"+
		"z{\u0005\u0001\u0000\u0000{}\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0083\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0003\u0002\u0001\u0000\u0082~\u0001\u0000"+
		"\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005\u000f\u0000\u0000\u0085\u0013\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005\u0010\u0000\u0000\u0087\u0088\u0005\"\u0000"+
		"\u0000\u0088\u0015\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0011\u0000"+
		"\u0000\u008a\u008b\u0003 \u0010\u0000\u008b\u008c\u0005\u001f\u0000\u0000"+
		"\u008c\u0093\u0005\u0002\u0000\u0000\u008d\u0094\u0005 \u0000\u0000\u008e"+
		"\u0090\u0005\u0012\u0000\u0000\u008f\u0091\u0005\u0013\u0000\u0000\u0090"+
		"\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0005 \u0000\u0000\u0093\u008d"+
		"\u0001\u0000\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0094\u0017"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0014\u0000\u0000\u0096\u0097"+
		"\u0003 \u0010\u0000\u0097\u00a5\u0005\u001f\u0000\u0000\u0098\u0099\u0005"+
		"\u0015\u0000\u0000\u0099\u009c\u0005\u001f\u0000\u0000\u009a\u009b\u0005"+
		"\u0007\u0000\u0000\u009b\u009d\u0005\u001f\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u00a1\u0005\u0016\u0000\u0000\u009f\u00a0\u0005"+
		"\u0002\u0000\u0000\u00a0\u00a2\u0003\u001e\u000f\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\u0002\u0000\u0000\u00a4\u00a6\u0003"+
		"\u001e\u000f\u0000\u00a5\u0098\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a6\u0019\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"\u0017\u0000\u0000\u00a8\u00a9\u0005\u001f\u0000\u0000\u00a9\u00aa\u0005"+
		"\u0015\u0000\u0000\u00aa\u00ad\u0005\u001f\u0000\u0000\u00ab\u00ac\u0005"+
		"\u0007\u0000\u0000\u00ac\u00ae\u0005\u001f\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0005\u0016\u0000\u0000\u00b0\u00b1\u0005"+
		"\u0002\u0000\u0000\u00b1\u00b2\u0003\u001e\u000f\u0000\u00b2\u001b\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005\u0018\u0000\u0000\u00b4\u00b5\u0005"+
		"\u0015\u0000\u0000\u00b5\u00b6\u0003 \u0010\u0000\u00b6\u00b7\u0005\u0016"+
		"\u0000\u0000\u00b7\u00bf\u0005\u001f\u0000\u0000\u00b8\u00b9\u0005\u0002"+
		"\u0000\u0000\u00b9\u00ba\u0005\u0019\u0000\u0000\u00ba\u00bb\u0005\u0018"+
		"\u0000\u0000\u00bb\u00bc\u0005\u0015\u0000\u0000\u00bc\u00bd\u0003 \u0010"+
		"\u0000\u00bd\u00be\u0005\u0016\u0000\u0000\u00be\u00c0\u0001\u0000\u0000"+
		"\u0000\u00bf\u00b8\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u001d\u0001\u0000\u0000\u0000\u00c1\u00c2\u0006\u000f\uffff"+
		"\uffff\u0000\u00c2\u00c3\u0005\u0004\u0000\u0000\u00c3\u00dc\u0005\"\u0000"+
		"\u0000\u00c4\u00c5\u0005\b\u0000\u0000\u00c5\u00c6\u0005\u0003\u0000\u0000"+
		"\u00c6\u00c7\u0007\u0002\u0000\u0000\u00c7\u00c8\u0005\u0007\u0000\u0000"+
		"\u00c8\u00c9\u0005 \u0000\u0000\u00c9\u00dc\u0005\u0005\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0003\u0000\u0000\u00cb\u00cc\u0003\u001e\u000f\u0000\u00cc"+
		"\u00cd\u0005\u0005\u0000\u0000\u00cd\u00dc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0005\u001f\u0000\u0000\u00cf\u00d0\u0005\u0015\u0000\u0000\u00d0"+
		"\u00d1\u0005\u001f\u0000\u0000\u00d1\u00dc\u0005\u0016\u0000\u0000\u00d2"+
		"\u00dc\u0005\u001f\u0000\u0000\u00d3\u00d4\u0003 \u0010\u0000\u00d4\u00d5"+
		"\u0005\u0003\u0000\u0000\u00d5\u00d6\u0003\u001e\u000f\u0000\u00d6\u00d7"+
		"\u0005\u0005\u0000\u0000\u00d7\u00dc\u0001\u0000\u0000\u0000\u00d8\u00dc"+
		"\u0005!\u0000\u0000\u00d9\u00dc\u0005 \u0000\u0000\u00da\u00dc\u0005\""+
		"\u0000\u0000\u00db\u00c1\u0001\u0000\u0000\u0000\u00db\u00c4\u0001\u0000"+
		"\u0000\u0000\u00db\u00ca\u0001\u0000\u0000\u0000\u00db\u00ce\u0001\u0000"+
		"\u0000\u0000\u00db\u00d2\u0001\u0000\u0000\u0000\u00db\u00d3\u0001\u0000"+
		"\u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00eb\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\n\u000b\u0000\u0000\u00de\u00df\u0007\u0003\u0000"+
		"\u0000\u00df\u00ea\u0003\u001e\u000f\f\u00e0\u00e1\n\n\u0000\u0000\u00e1"+
		"\u00e2\u0007\u0004\u0000\u0000\u00e2\u00ea\u0003\u001e\u000f\u000b\u00e3"+
		"\u00e4\n\b\u0000\u0000\u00e4\u00e5\u0005\u0007\u0000\u0000\u00e5\u00ea"+
		"\u0003\u001e\u000f\t\u00e6\u00e7\n\u0007\u0000\u0000\u00e7\u00e8\u0005"+
		"\u001c\u0000\u0000\u00e8\u00ea\u0005\u001f\u0000\u0000\u00e9\u00dd\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e0\u0001\u0000\u0000\u0000\u00e9\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u001f\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ee\u00f7\u0005\u001d\u0000\u0000\u00ef\u00f7\u0005"+
		"\u001e\u0000\u0000\u00f0\u00f7\u0005\b\u0000\u0000\u00f1\u00f2\u0005\u0018"+
		"\u0000\u0000\u00f2\u00f3\u0005\u0015\u0000\u0000\u00f3\u00f4\u0005\u001f"+
		"\u0000\u0000\u00f4\u00f7\u0005\u0016\u0000\u0000\u00f5\u00f7\u0005\u001f"+
		"\u0000\u0000\u00f6\u00ee\u0001\u0000\u0000\u0000\u00f6\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f0\u0001\u0000\u0000\u0000\u00f6\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7!\u0001\u0000\u0000"+
		"\u0000\u0018&+8>GJOS[cv~\u0082\u0090\u0093\u009c\u00a1\u00a5\u00ad\u00bf"+
		"\u00db\u00e9\u00eb\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}