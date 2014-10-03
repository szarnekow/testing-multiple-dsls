package zarnekow.hello.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import zarnekow.hello.services.HelloDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHelloDSLParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g"; }



     	private HelloDSLGrammarAccess grammarAccess;
     	
        public InternalHelloDSLParser(TokenStream input, HelloDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Enter";	
       	}
       	
       	@Override
       	protected HelloDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleEnter"
    // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:67:1: entryRuleEnter returns [EObject current=null] : iv_ruleEnter= ruleEnter EOF ;
    public final EObject entryRuleEnter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnter = null;


        try {
            // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:68:2: (iv_ruleEnter= ruleEnter EOF )
            // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:69:2: iv_ruleEnter= ruleEnter EOF
            {
             newCompositeNode(grammarAccess.getEnterRule()); 
            pushFollow(FOLLOW_ruleEnter_in_entryRuleEnter75);
            iv_ruleEnter=ruleEnter();

            state._fsp--;

             current =iv_ruleEnter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnter85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnter"


    // $ANTLR start "ruleEnter"
    // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:76:1: ruleEnter returns [EObject current=null] : ( (lv_greetings_0_0= ruleHello ) )* ;
    public final EObject ruleEnter() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:79:28: ( ( (lv_greetings_0_0= ruleHello ) )* )
            // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:80:1: ( (lv_greetings_0_0= ruleHello ) )*
            {
            // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:80:1: ( (lv_greetings_0_0= ruleHello ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:81:1: (lv_greetings_0_0= ruleHello )
            	    {
            	    // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:81:1: (lv_greetings_0_0= ruleHello )
            	    // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:82:3: lv_greetings_0_0= ruleHello
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnterAccess().getGreetingsHelloParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHello_in_ruleEnter130);
            	    lv_greetings_0_0=ruleHello();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"greetings",
            	            		lv_greetings_0_0, 
            	            		"Hello");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnter"


    // $ANTLR start "entryRuleHello"
    // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:106:1: entryRuleHello returns [EObject current=null] : iv_ruleHello= ruleHello EOF ;
    public final EObject entryRuleHello() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHello = null;


        try {
            // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:107:2: (iv_ruleHello= ruleHello EOF )
            // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:108:2: iv_ruleHello= ruleHello EOF
            {
             newCompositeNode(grammarAccess.getHelloRule()); 
            pushFollow(FOLLOW_ruleHello_in_entryRuleHello166);
            iv_ruleHello=ruleHello();

            state._fsp--;

             current =iv_ruleHello; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHello176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHello"


    // $ANTLR start "ruleHello"
    // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:115:1: ruleHello returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleHello() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:118:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:119:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:119:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:119:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleHello213); 

                	newLeafNode(otherlv_0, grammarAccess.getHelloAccess().getHelloKeyword_0());
                
            // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:124:1: (lv_name_1_0= RULE_ID )
            // ../zarnekow.hello/src-gen/zarnekow/hello/parser/antlr/internal/InternalHelloDSL.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHello230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHelloAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHelloRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleHello247); 

                	newLeafNode(otherlv_2, grammarAccess.getHelloAccess().getExclamationMarkKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHello"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleEnter_in_entryRuleEnter75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnter85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHello_in_ruleEnter130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleHello_in_entryRuleHello166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHello176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleHello213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHello230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleHello247 = new BitSet(new long[]{0x0000000000000002L});

}