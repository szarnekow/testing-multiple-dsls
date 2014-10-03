package zarnekow.hello.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import zarnekow.hello.services.HelloDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHelloDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalHelloDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHelloDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHelloDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g"; }


     
     	private HelloDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(HelloDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleEnter"
    // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:60:1: entryRuleEnter : ruleEnter EOF ;
    public final void entryRuleEnter() throws RecognitionException {
        try {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:61:1: ( ruleEnter EOF )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:62:1: ruleEnter EOF
            {
             before(grammarAccess.getEnterRule()); 
            pushFollow(FOLLOW_ruleEnter_in_entryRuleEnter61);
            ruleEnter();

            state._fsp--;

             after(grammarAccess.getEnterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnter68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnter"


    // $ANTLR start "ruleEnter"
    // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:69:1: ruleEnter : ( ( rule__Enter__GreetingsAssignment )* ) ;
    public final void ruleEnter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:73:2: ( ( ( rule__Enter__GreetingsAssignment )* ) )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:74:1: ( ( rule__Enter__GreetingsAssignment )* )
            {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:74:1: ( ( rule__Enter__GreetingsAssignment )* )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:75:1: ( rule__Enter__GreetingsAssignment )*
            {
             before(grammarAccess.getEnterAccess().getGreetingsAssignment()); 
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:76:1: ( rule__Enter__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:76:2: rule__Enter__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Enter__GreetingsAssignment_in_ruleEnter94);
            	    rule__Enter__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getEnterAccess().getGreetingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnter"


    // $ANTLR start "entryRuleHello"
    // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:88:1: entryRuleHello : ruleHello EOF ;
    public final void entryRuleHello() throws RecognitionException {
        try {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:89:1: ( ruleHello EOF )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:90:1: ruleHello EOF
            {
             before(grammarAccess.getHelloRule()); 
            pushFollow(FOLLOW_ruleHello_in_entryRuleHello122);
            ruleHello();

            state._fsp--;

             after(grammarAccess.getHelloRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHello129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHello"


    // $ANTLR start "ruleHello"
    // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:97:1: ruleHello : ( ( rule__Hello__Group__0 ) ) ;
    public final void ruleHello() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:101:2: ( ( ( rule__Hello__Group__0 ) ) )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:102:1: ( ( rule__Hello__Group__0 ) )
            {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:102:1: ( ( rule__Hello__Group__0 ) )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:103:1: ( rule__Hello__Group__0 )
            {
             before(grammarAccess.getHelloAccess().getGroup()); 
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:104:1: ( rule__Hello__Group__0 )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:104:2: rule__Hello__Group__0
            {
            pushFollow(FOLLOW_rule__Hello__Group__0_in_ruleHello155);
            rule__Hello__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHelloAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHello"


    // $ANTLR start "rule__Hello__Group__0"
    // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:118:1: rule__Hello__Group__0 : rule__Hello__Group__0__Impl rule__Hello__Group__1 ;
    public final void rule__Hello__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:122:1: ( rule__Hello__Group__0__Impl rule__Hello__Group__1 )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:123:2: rule__Hello__Group__0__Impl rule__Hello__Group__1
            {
            pushFollow(FOLLOW_rule__Hello__Group__0__Impl_in_rule__Hello__Group__0189);
            rule__Hello__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hello__Group__1_in_rule__Hello__Group__0192);
            rule__Hello__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hello__Group__0"


    // $ANTLR start "rule__Hello__Group__0__Impl"
    // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:130:1: rule__Hello__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Hello__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:134:1: ( ( 'Hello' ) )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:135:1: ( 'Hello' )
            {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:135:1: ( 'Hello' )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:136:1: 'Hello'
            {
             before(grammarAccess.getHelloAccess().getHelloKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Hello__Group__0__Impl220); 
             after(grammarAccess.getHelloAccess().getHelloKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hello__Group__0__Impl"


    // $ANTLR start "rule__Hello__Group__1"
    // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:149:1: rule__Hello__Group__1 : rule__Hello__Group__1__Impl rule__Hello__Group__2 ;
    public final void rule__Hello__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:153:1: ( rule__Hello__Group__1__Impl rule__Hello__Group__2 )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:154:2: rule__Hello__Group__1__Impl rule__Hello__Group__2
            {
            pushFollow(FOLLOW_rule__Hello__Group__1__Impl_in_rule__Hello__Group__1251);
            rule__Hello__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Hello__Group__2_in_rule__Hello__Group__1254);
            rule__Hello__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hello__Group__1"


    // $ANTLR start "rule__Hello__Group__1__Impl"
    // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:161:1: rule__Hello__Group__1__Impl : ( ( rule__Hello__NameAssignment_1 ) ) ;
    public final void rule__Hello__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:165:1: ( ( ( rule__Hello__NameAssignment_1 ) ) )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:166:1: ( ( rule__Hello__NameAssignment_1 ) )
            {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:166:1: ( ( rule__Hello__NameAssignment_1 ) )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:167:1: ( rule__Hello__NameAssignment_1 )
            {
             before(grammarAccess.getHelloAccess().getNameAssignment_1()); 
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:168:1: ( rule__Hello__NameAssignment_1 )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:168:2: rule__Hello__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Hello__NameAssignment_1_in_rule__Hello__Group__1__Impl281);
            rule__Hello__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHelloAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hello__Group__1__Impl"


    // $ANTLR start "rule__Hello__Group__2"
    // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:178:1: rule__Hello__Group__2 : rule__Hello__Group__2__Impl ;
    public final void rule__Hello__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:182:1: ( rule__Hello__Group__2__Impl )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:183:2: rule__Hello__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Hello__Group__2__Impl_in_rule__Hello__Group__2311);
            rule__Hello__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hello__Group__2"


    // $ANTLR start "rule__Hello__Group__2__Impl"
    // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:189:1: rule__Hello__Group__2__Impl : ( '!' ) ;
    public final void rule__Hello__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:193:1: ( ( '!' ) )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:194:1: ( '!' )
            {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:194:1: ( '!' )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:195:1: '!'
            {
             before(grammarAccess.getHelloAccess().getExclamationMarkKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Hello__Group__2__Impl339); 
             after(grammarAccess.getHelloAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hello__Group__2__Impl"


    // $ANTLR start "rule__Enter__GreetingsAssignment"
    // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:215:1: rule__Enter__GreetingsAssignment : ( ruleHello ) ;
    public final void rule__Enter__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:219:1: ( ( ruleHello ) )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:220:1: ( ruleHello )
            {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:220:1: ( ruleHello )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:221:1: ruleHello
            {
             before(grammarAccess.getEnterAccess().getGreetingsHelloParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleHello_in_rule__Enter__GreetingsAssignment381);
            ruleHello();

            state._fsp--;

             after(grammarAccess.getEnterAccess().getGreetingsHelloParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enter__GreetingsAssignment"


    // $ANTLR start "rule__Hello__NameAssignment_1"
    // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:230:1: rule__Hello__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Hello__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:234:1: ( ( RULE_ID ) )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:235:1: ( RULE_ID )
            {
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:235:1: ( RULE_ID )
            // ../zarnekow.hello.ui/src-gen/zarnekow/hello/ui/contentassist/antlr/internal/InternalHelloDSL.g:236:1: RULE_ID
            {
             before(grammarAccess.getHelloAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Hello__NameAssignment_1412); 
             after(grammarAccess.getHelloAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hello__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleEnter_in_entryRuleEnter61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnter68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__GreetingsAssignment_in_ruleEnter94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleHello_in_entryRuleHello122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHello129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hello__Group__0_in_ruleHello155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hello__Group__0__Impl_in_rule__Hello__Group__0189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Hello__Group__1_in_rule__Hello__Group__0192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Hello__Group__0__Impl220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hello__Group__1__Impl_in_rule__Hello__Group__1251 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Hello__Group__2_in_rule__Hello__Group__1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hello__NameAssignment_1_in_rule__Hello__Group__1__Impl281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Hello__Group__2__Impl_in_rule__Hello__Group__2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Hello__Group__2__Impl339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHello_in_rule__Enter__GreetingsAssignment381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Hello__NameAssignment_1412 = new BitSet(new long[]{0x0000000000000002L});

}