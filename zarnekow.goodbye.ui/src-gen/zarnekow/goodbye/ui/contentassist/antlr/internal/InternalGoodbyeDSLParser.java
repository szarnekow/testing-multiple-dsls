package zarnekow.goodbye.ui.contentassist.antlr.internal; 

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
import zarnekow.goodbye.services.GoodbyeDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoodbyeDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Bye'", "'!'"
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


        public InternalGoodbyeDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoodbyeDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoodbyeDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g"; }


     
     	private GoodbyeDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GoodbyeDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleLeave"
    // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:60:1: entryRuleLeave : ruleLeave EOF ;
    public final void entryRuleLeave() throws RecognitionException {
        try {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:61:1: ( ruleLeave EOF )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:62:1: ruleLeave EOF
            {
             before(grammarAccess.getLeaveRule()); 
            pushFollow(FOLLOW_ruleLeave_in_entryRuleLeave61);
            ruleLeave();

            state._fsp--;

             after(grammarAccess.getLeaveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeave68); 

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
    // $ANTLR end "entryRuleLeave"


    // $ANTLR start "ruleLeave"
    // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:69:1: ruleLeave : ( ( rule__Leave__FarewellsAssignment )* ) ;
    public final void ruleLeave() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:73:2: ( ( ( rule__Leave__FarewellsAssignment )* ) )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:74:1: ( ( rule__Leave__FarewellsAssignment )* )
            {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:74:1: ( ( rule__Leave__FarewellsAssignment )* )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:75:1: ( rule__Leave__FarewellsAssignment )*
            {
             before(grammarAccess.getLeaveAccess().getFarewellsAssignment()); 
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:76:1: ( rule__Leave__FarewellsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:76:2: rule__Leave__FarewellsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Leave__FarewellsAssignment_in_ruleLeave94);
            	    rule__Leave__FarewellsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLeaveAccess().getFarewellsAssignment()); 

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
    // $ANTLR end "ruleLeave"


    // $ANTLR start "entryRuleGoodbye"
    // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:88:1: entryRuleGoodbye : ruleGoodbye EOF ;
    public final void entryRuleGoodbye() throws RecognitionException {
        try {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:89:1: ( ruleGoodbye EOF )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:90:1: ruleGoodbye EOF
            {
             before(grammarAccess.getGoodbyeRule()); 
            pushFollow(FOLLOW_ruleGoodbye_in_entryRuleGoodbye122);
            ruleGoodbye();

            state._fsp--;

             after(grammarAccess.getGoodbyeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoodbye129); 

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
    // $ANTLR end "entryRuleGoodbye"


    // $ANTLR start "ruleGoodbye"
    // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:97:1: ruleGoodbye : ( ( rule__Goodbye__Group__0 ) ) ;
    public final void ruleGoodbye() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:101:2: ( ( ( rule__Goodbye__Group__0 ) ) )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:102:1: ( ( rule__Goodbye__Group__0 ) )
            {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:102:1: ( ( rule__Goodbye__Group__0 ) )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:103:1: ( rule__Goodbye__Group__0 )
            {
             before(grammarAccess.getGoodbyeAccess().getGroup()); 
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:104:1: ( rule__Goodbye__Group__0 )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:104:2: rule__Goodbye__Group__0
            {
            pushFollow(FOLLOW_rule__Goodbye__Group__0_in_ruleGoodbye155);
            rule__Goodbye__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoodbyeAccess().getGroup()); 

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
    // $ANTLR end "ruleGoodbye"


    // $ANTLR start "rule__Goodbye__Group__0"
    // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:118:1: rule__Goodbye__Group__0 : rule__Goodbye__Group__0__Impl rule__Goodbye__Group__1 ;
    public final void rule__Goodbye__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:122:1: ( rule__Goodbye__Group__0__Impl rule__Goodbye__Group__1 )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:123:2: rule__Goodbye__Group__0__Impl rule__Goodbye__Group__1
            {
            pushFollow(FOLLOW_rule__Goodbye__Group__0__Impl_in_rule__Goodbye__Group__0189);
            rule__Goodbye__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goodbye__Group__1_in_rule__Goodbye__Group__0192);
            rule__Goodbye__Group__1();

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
    // $ANTLR end "rule__Goodbye__Group__0"


    // $ANTLR start "rule__Goodbye__Group__0__Impl"
    // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:130:1: rule__Goodbye__Group__0__Impl : ( 'Bye' ) ;
    public final void rule__Goodbye__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:134:1: ( ( 'Bye' ) )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:135:1: ( 'Bye' )
            {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:135:1: ( 'Bye' )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:136:1: 'Bye'
            {
             before(grammarAccess.getGoodbyeAccess().getByeKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Goodbye__Group__0__Impl220); 
             after(grammarAccess.getGoodbyeAccess().getByeKeyword_0()); 

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
    // $ANTLR end "rule__Goodbye__Group__0__Impl"


    // $ANTLR start "rule__Goodbye__Group__1"
    // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:149:1: rule__Goodbye__Group__1 : rule__Goodbye__Group__1__Impl rule__Goodbye__Group__2 ;
    public final void rule__Goodbye__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:153:1: ( rule__Goodbye__Group__1__Impl rule__Goodbye__Group__2 )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:154:2: rule__Goodbye__Group__1__Impl rule__Goodbye__Group__2
            {
            pushFollow(FOLLOW_rule__Goodbye__Group__1__Impl_in_rule__Goodbye__Group__1251);
            rule__Goodbye__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goodbye__Group__2_in_rule__Goodbye__Group__1254);
            rule__Goodbye__Group__2();

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
    // $ANTLR end "rule__Goodbye__Group__1"


    // $ANTLR start "rule__Goodbye__Group__1__Impl"
    // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:161:1: rule__Goodbye__Group__1__Impl : ( ( rule__Goodbye__HelloAssignment_1 ) ) ;
    public final void rule__Goodbye__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:165:1: ( ( ( rule__Goodbye__HelloAssignment_1 ) ) )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:166:1: ( ( rule__Goodbye__HelloAssignment_1 ) )
            {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:166:1: ( ( rule__Goodbye__HelloAssignment_1 ) )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:167:1: ( rule__Goodbye__HelloAssignment_1 )
            {
             before(grammarAccess.getGoodbyeAccess().getHelloAssignment_1()); 
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:168:1: ( rule__Goodbye__HelloAssignment_1 )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:168:2: rule__Goodbye__HelloAssignment_1
            {
            pushFollow(FOLLOW_rule__Goodbye__HelloAssignment_1_in_rule__Goodbye__Group__1__Impl281);
            rule__Goodbye__HelloAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoodbyeAccess().getHelloAssignment_1()); 

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
    // $ANTLR end "rule__Goodbye__Group__1__Impl"


    // $ANTLR start "rule__Goodbye__Group__2"
    // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:178:1: rule__Goodbye__Group__2 : rule__Goodbye__Group__2__Impl ;
    public final void rule__Goodbye__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:182:1: ( rule__Goodbye__Group__2__Impl )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:183:2: rule__Goodbye__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Goodbye__Group__2__Impl_in_rule__Goodbye__Group__2311);
            rule__Goodbye__Group__2__Impl();

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
    // $ANTLR end "rule__Goodbye__Group__2"


    // $ANTLR start "rule__Goodbye__Group__2__Impl"
    // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:189:1: rule__Goodbye__Group__2__Impl : ( '!' ) ;
    public final void rule__Goodbye__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:193:1: ( ( '!' ) )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:194:1: ( '!' )
            {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:194:1: ( '!' )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:195:1: '!'
            {
             before(grammarAccess.getGoodbyeAccess().getExclamationMarkKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Goodbye__Group__2__Impl339); 
             after(grammarAccess.getGoodbyeAccess().getExclamationMarkKeyword_2()); 

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
    // $ANTLR end "rule__Goodbye__Group__2__Impl"


    // $ANTLR start "rule__Leave__FarewellsAssignment"
    // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:215:1: rule__Leave__FarewellsAssignment : ( ruleGoodbye ) ;
    public final void rule__Leave__FarewellsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:219:1: ( ( ruleGoodbye ) )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:220:1: ( ruleGoodbye )
            {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:220:1: ( ruleGoodbye )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:221:1: ruleGoodbye
            {
             before(grammarAccess.getLeaveAccess().getFarewellsGoodbyeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleGoodbye_in_rule__Leave__FarewellsAssignment381);
            ruleGoodbye();

            state._fsp--;

             after(grammarAccess.getLeaveAccess().getFarewellsGoodbyeParserRuleCall_0()); 

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
    // $ANTLR end "rule__Leave__FarewellsAssignment"


    // $ANTLR start "rule__Goodbye__HelloAssignment_1"
    // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:230:1: rule__Goodbye__HelloAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Goodbye__HelloAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:234:1: ( ( ( RULE_ID ) ) )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:235:1: ( ( RULE_ID ) )
            {
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:235:1: ( ( RULE_ID ) )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:236:1: ( RULE_ID )
            {
             before(grammarAccess.getGoodbyeAccess().getHelloHelloCrossReference_1_0()); 
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:237:1: ( RULE_ID )
            // ../zarnekow.goodbye.ui/src-gen/zarnekow/goodbye/ui/contentassist/antlr/internal/InternalGoodbyeDSL.g:238:1: RULE_ID
            {
             before(grammarAccess.getGoodbyeAccess().getHelloHelloIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goodbye__HelloAssignment_1416); 
             after(grammarAccess.getGoodbyeAccess().getHelloHelloIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getGoodbyeAccess().getHelloHelloCrossReference_1_0()); 

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
    // $ANTLR end "rule__Goodbye__HelloAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLeave_in_entryRuleLeave61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeave68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Leave__FarewellsAssignment_in_ruleLeave94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleGoodbye_in_entryRuleGoodbye122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoodbye129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goodbye__Group__0_in_ruleGoodbye155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goodbye__Group__0__Impl_in_rule__Goodbye__Group__0189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Goodbye__Group__1_in_rule__Goodbye__Group__0192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Goodbye__Group__0__Impl220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goodbye__Group__1__Impl_in_rule__Goodbye__Group__1251 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Goodbye__Group__2_in_rule__Goodbye__Group__1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goodbye__HelloAssignment_1_in_rule__Goodbye__Group__1__Impl281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goodbye__Group__2__Impl_in_rule__Goodbye__Group__2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Goodbye__Group__2__Impl339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoodbye_in_rule__Leave__FarewellsAssignment381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goodbye__HelloAssignment_1416 = new BitSet(new long[]{0x0000000000000002L});

}