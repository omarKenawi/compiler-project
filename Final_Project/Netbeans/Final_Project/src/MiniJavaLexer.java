// $ANTLR 3.4 F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g 2024-05-14 02:06:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int AndOr=4;
    public static final int Array=5;
    public static final int Assigment=6;
    public static final int BOOLEAN=7;
    public static final int COMMENT=8;
    public static final int CallMethod=9;
    public static final int Class=10;
    public static final int ClassDeclaration=11;
    public static final int Elsestmt=12;
    public static final int Expression=13;
    public static final int Extends=14;
    public static final int Forloop=15;
    public static final int Goal=16;
    public static final int INT=17;
    public static final int Ifstmt=18;
    public static final int ML_COMMENT=19;
    public static final int MainClass=20;
    public static final int Method=21;
    public static final int MethodBody=22;
    public static final int NUM=23;
    public static final int New=24;
    public static final int NewArray=25;
    public static final int Print=26;
    public static final int PrintStmt=27;
    public static final int Public=28;
    public static final int RelationalOperators=29;
    public static final int ReturnMethod=30;
    public static final int SEMICOLON=31;
    public static final int SL_COMMENT=32;
    public static final int TYPE=33;
    public static final int This=34;
    public static final int ThisOperator=35;
    public static final int Type_dec=36;
    public static final int VAR=37;
    public static final int VOID=38;
    public static final int VarDeclaration=39;
    public static final int Whilestmt=40;
    public static final int WhiteSpace=41;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MiniJavaLexer() {} 
    public MiniJavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniJavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g"; }

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:2:7: ( '!' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:2:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:3:7: ( '(' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:3:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:4:7: ( ')' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:4:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:5:7: ( '*' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:5:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:6:7: ( '+' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:6:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:7:7: ( '++' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:7:9: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:8:7: ( '+=' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:8:9: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:9:7: ( ',' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:10:7: ( '-' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:10:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:11:7: ( '--' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:11:9: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:12:7: ( '-=' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:12:9: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:13:7: ( '.' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:13:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:14:7: ( '/' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:14:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:15:7: ( '=' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:15:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:16:7: ( 'String' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:16:9: 'String'
            {
            match("String"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:17:7: ( '[' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:17:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:18:7: ( ']' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:18:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:19:7: ( 'else' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:19:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:20:7: ( 'for' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:20:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:21:7: ( 'if' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:21:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:22:7: ( 'length' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:22:9: 'length'
            {
            match("length"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:23:7: ( 'main' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:23:9: 'main'
            {
            match("main"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:24:7: ( 'return' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:24:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:25:7: ( 'static' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:25:9: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:26:7: ( 'while' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:26:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:27:7: ( '{' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:27:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:28:7: ( '}' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:28:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "AndOr"
    public final void mAndOr() throws RecognitionException {
        try {
            int _type = AndOr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:217:7: ( '&&' | '||' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='&') ) {
                alt1=1;
            }
            else if ( (LA1_0=='|') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:217:9: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:217:16: '||'
                    {
                    match("||"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AndOr"

    // $ANTLR start "Class"
    public final void mClass() throws RecognitionException {
        try {
            int _type = Class;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:218:7: ( 'class' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:218:9: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Class"

    // $ANTLR start "This"
    public final void mThis() throws RecognitionException {
        try {
            int _type = This;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:219:6: ( 'this' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:219:8: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "This"

    // $ANTLR start "Extends"
    public final void mExtends() throws RecognitionException {
        try {
            int _type = Extends;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:220:8: ( 'extends' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:220:9: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Extends"

    // $ANTLR start "New"
    public final void mNew() throws RecognitionException {
        try {
            int _type = New;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:221:5: ( 'new' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:221:7: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "New"

    // $ANTLR start "Public"
    public final void mPublic() throws RecognitionException {
        try {
            int _type = Public;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:222:8: ( 'public' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:222:10: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Public"

    // $ANTLR start "Print"
    public final void mPrint() throws RecognitionException {
        try {
            int _type = Print;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:223:7: ( 'System.out.println' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:223:9: 'System.out.println'
            {
            match("System.out.println"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Print"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:224:5: ( 'int' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:224:7: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:225:6: ( 'void' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:225:8: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:226:9: ( 'boolean' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:226:11: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:227:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:227:7: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:227:41: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:228:5: ( ( '0' .. '9' )* )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:228:7: ( '0' .. '9' )*
            {
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:228:7: ( '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:229:11: ( ';' )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:229:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "RelationalOperators"
    public final void mRelationalOperators() throws RecognitionException {
        try {
            int _type = RelationalOperators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:230:21: ( '==' | '!=' | '>' | '<' | '>=' | '<=' )
            int alt4=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt4=1;
                }
                break;
            case '!':
                {
                alt4=2;
                }
                break;
            case '>':
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3=='=') ) {
                    alt4=5;
                }
                else {
                    alt4=3;
                }
                }
                break;
            case '<':
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4=='=') ) {
                    alt4=6;
                }
                else {
                    alt4=4;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:230:23: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 2 :
                    // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:230:30: '!='
                    {
                    match("!="); 



                    }
                    break;
                case 3 :
                    // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:230:37: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:230:43: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 5 :
                    // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:230:49: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 6 :
                    // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:230:56: '<='
                    {
                    match("<="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RelationalOperators"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:231:12: ( '/*' ( options {greedy=false; } : . )* ( '*/' )+ )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:231:14: '/*' ( options {greedy=false; } : . )* ( '*/' )+
            {
            match("/*"); 



            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:231:19: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:231:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:231:51: ( '*/' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:231:51: '*/'
            	    {
            	    match("*/"); 



            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:232:12: ( '//' ( . )* ( '\\n' )+ )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:232:14: '//' ( . )* ( '\\n' )+
            {
            match("//"); 



            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:232:19: ( . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\n') ) {
                    alt7=2;
                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:232:20: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:232:23: ( '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\n') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:232:23: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "WhiteSpace"
    public final void mWhiteSpace() throws RecognitionException {
        try {
            int _type = WhiteSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:233:12: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:233:14: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:233:14: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WhiteSpace"

    public void mTokens() throws RecognitionException {
        // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:8: ( T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | AndOr | Class | This | Extends | New | Public | Print | INT | VOID | BOOLEAN | VAR | NUM | SEMICOLON | RelationalOperators | ML_COMMENT | SL_COMMENT | WhiteSpace )
        int alt10=44;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:10: T__42
                {
                mT__42(); 


                }
                break;
            case 2 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:16: T__43
                {
                mT__43(); 


                }
                break;
            case 3 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:22: T__44
                {
                mT__44(); 


                }
                break;
            case 4 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:28: T__45
                {
                mT__45(); 


                }
                break;
            case 5 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:34: T__46
                {
                mT__46(); 


                }
                break;
            case 6 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:40: T__47
                {
                mT__47(); 


                }
                break;
            case 7 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:46: T__48
                {
                mT__48(); 


                }
                break;
            case 8 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:52: T__49
                {
                mT__49(); 


                }
                break;
            case 9 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:58: T__50
                {
                mT__50(); 


                }
                break;
            case 10 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:64: T__51
                {
                mT__51(); 


                }
                break;
            case 11 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:70: T__52
                {
                mT__52(); 


                }
                break;
            case 12 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:76: T__53
                {
                mT__53(); 


                }
                break;
            case 13 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:82: T__54
                {
                mT__54(); 


                }
                break;
            case 14 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:88: T__55
                {
                mT__55(); 


                }
                break;
            case 15 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:94: T__56
                {
                mT__56(); 


                }
                break;
            case 16 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:100: T__57
                {
                mT__57(); 


                }
                break;
            case 17 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:106: T__58
                {
                mT__58(); 


                }
                break;
            case 18 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:112: T__59
                {
                mT__59(); 


                }
                break;
            case 19 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:118: T__60
                {
                mT__60(); 


                }
                break;
            case 20 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:124: T__61
                {
                mT__61(); 


                }
                break;
            case 21 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:130: T__62
                {
                mT__62(); 


                }
                break;
            case 22 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:136: T__63
                {
                mT__63(); 


                }
                break;
            case 23 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:142: T__64
                {
                mT__64(); 


                }
                break;
            case 24 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:148: T__65
                {
                mT__65(); 


                }
                break;
            case 25 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:154: T__66
                {
                mT__66(); 


                }
                break;
            case 26 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:160: T__67
                {
                mT__67(); 


                }
                break;
            case 27 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:166: T__68
                {
                mT__68(); 


                }
                break;
            case 28 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:172: AndOr
                {
                mAndOr(); 


                }
                break;
            case 29 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:178: Class
                {
                mClass(); 


                }
                break;
            case 30 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:184: This
                {
                mThis(); 


                }
                break;
            case 31 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:189: Extends
                {
                mExtends(); 


                }
                break;
            case 32 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:197: New
                {
                mNew(); 


                }
                break;
            case 33 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:201: Public
                {
                mPublic(); 


                }
                break;
            case 34 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:208: Print
                {
                mPrint(); 


                }
                break;
            case 35 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:214: INT
                {
                mINT(); 


                }
                break;
            case 36 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:218: VOID
                {
                mVOID(); 


                }
                break;
            case 37 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:223: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 38 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:231: VAR
                {
                mVAR(); 


                }
                break;
            case 39 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:235: NUM
                {
                mNUM(); 


                }
                break;
            case 40 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:239: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 41 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:249: RelationalOperators
                {
                mRelationalOperators(); 


                }
                break;
            case 42 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:269: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 43 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:280: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 44 :
                // F:\\Second Term\\Compiler 407\\Final_Project\\MiniJava.g:1:291: WhiteSpace
                {
                mWhiteSpace(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\40\1\44\3\uffff\1\47\1\uffff\1\52\1\uffff\1\55\1\56\1\37\2\uffff"+
        "\10\37\3\uffff\6\37\20\uffff\5\37\1\106\20\37\1\127\1\uffff\1\130"+
        "\7\37\1\140\5\37\1\146\1\37\2\uffff\1\37\1\151\4\37\1\156\1\uffff"+
        "\1\37\1\160\3\37\1\uffff\2\37\1\uffff\2\37\1\170\1\171\1\uffff\1"+
        "\37\1\uffff\1\37\1\174\2\37\1\177\1\u0080\1\u0081\2\uffff\1\u0082"+
        "\1\37\2\uffff\1\u0084\4\uffff\1\u0085\2\uffff";
    static final String DFA10_eofS =
        "\u0086\uffff";
    static final String DFA10_minS =
        "\1\11\1\75\3\uffff\1\53\1\uffff\1\55\1\uffff\1\52\1\75\1\164\2\uffff"+
        "\1\154\1\157\1\146\1\145\1\141\1\145\1\164\1\150\3\uffff\1\154\1"+
        "\150\1\145\1\165\2\157\20\uffff\1\162\2\163\1\164\1\162\1\60\1\164"+
        "\1\156\1\151\1\164\1\141\1\151\1\141\1\151\1\167\1\142\1\151\1\157"+
        "\1\151\1\164\2\145\1\60\1\uffff\1\60\1\147\1\156\1\165\1\164\1\154"+
        "\2\163\1\60\1\154\1\144\1\154\1\156\1\145\1\60\1\156\2\uffff\1\164"+
        "\1\60\1\162\1\151\1\145\1\163\1\60\1\uffff\1\151\1\60\1\145\1\147"+
        "\1\155\1\uffff\1\144\1\150\1\uffff\1\156\1\143\2\60\1\uffff\1\143"+
        "\1\uffff\1\141\1\60\1\56\1\163\3\60\2\uffff\1\60\1\156\2\uffff\1"+
        "\60\4\uffff\1\60\2\uffff";
    static final String DFA10_maxS =
        "\1\175\1\75\3\uffff\1\75\1\uffff\1\75\1\uffff\1\57\1\75\1\171\2"+
        "\uffff\1\170\1\157\1\156\1\145\1\141\1\145\1\164\1\150\3\uffff\1"+
        "\154\1\150\1\145\1\165\2\157\20\uffff\1\162\2\163\1\164\1\162\1"+
        "\172\1\164\1\156\1\151\1\164\1\141\1\151\1\141\1\151\1\167\1\142"+
        "\1\151\1\157\1\151\1\164\2\145\1\172\1\uffff\1\172\1\147\1\156\1"+
        "\165\1\164\1\154\2\163\1\172\1\154\1\144\1\154\1\156\1\145\1\172"+
        "\1\156\2\uffff\1\164\1\172\1\162\1\151\1\145\1\163\1\172\1\uffff"+
        "\1\151\1\172\1\145\1\147\1\155\1\uffff\1\144\1\150\1\uffff\1\156"+
        "\1\143\2\172\1\uffff\1\143\1\uffff\1\141\1\172\1\56\1\163\3\172"+
        "\2\uffff\1\172\1\156\2\uffff\1\172\4\uffff\1\172\2\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\10\1\uffff\1\14\3\uffff\1\20\1\21"+
        "\10\uffff\1\32\1\33\1\34\6\uffff\1\46\1\47\1\50\1\51\1\54\1\1\1"+
        "\6\1\7\1\5\1\12\1\13\1\11\1\52\1\53\1\15\1\16\27\uffff\1\24\20\uffff"+
        "\1\23\1\43\7\uffff\1\40\5\uffff\1\22\2\uffff\1\26\4\uffff\1\36\1"+
        "\uffff\1\44\7\uffff\1\31\1\35\2\uffff\1\17\1\42\1\uffff\1\25\1\27"+
        "\1\30\1\41\1\uffff\1\37\1\45";
    static final String DFA10_specialS =
        "\u0086\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\43\2\uffff\1\43\22\uffff\1\43\1\1\2\uffff\1\37\1\uffff\1"+
            "\30\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\13\uffff\1\41"+
            "\1\42\1\12\1\42\2\uffff\22\37\1\13\7\37\1\14\1\uffff\1\15\1"+
            "\uffff\1\37\1\uffff\1\37\1\36\1\31\1\37\1\16\1\17\2\37\1\20"+
            "\2\37\1\21\1\22\1\33\1\37\1\34\1\37\1\23\1\24\1\32\1\37\1\35"+
            "\1\25\3\37\1\26\1\30\1\27",
            "\1\42",
            "",
            "",
            "",
            "\1\45\21\uffff\1\46",
            "",
            "\1\50\17\uffff\1\51",
            "",
            "\1\53\4\uffff\1\54",
            "\1\42",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\1\61\13\uffff\1\62",
            "\1\63",
            "\1\64\7\uffff\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\147",
            "",
            "",
            "\1\150",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\157",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "",
            "\1\166",
            "\1\167",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\172",
            "",
            "\1\173",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\175",
            "\1\176",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0083",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | AndOr | Class | This | Extends | New | Public | Print | INT | VOID | BOOLEAN | VAR | NUM | SEMICOLON | RelationalOperators | ML_COMMENT | SL_COMMENT | WhiteSpace );";
        }
    }
 

}