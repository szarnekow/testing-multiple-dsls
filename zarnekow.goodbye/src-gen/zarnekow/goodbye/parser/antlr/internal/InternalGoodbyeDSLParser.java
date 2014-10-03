package zarnekow.goodbye.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import zarnekow.goodbye.services.GoodbyeDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoodbyeDSLParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g"; }



     	private GoodbyeDSLGrammarAccess grammarAccess;
     	
        public InternalGoodbyeDSLParser(TokenStream input, GoodbyeDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Leave";	
       	}
       	
       	@Override
       	protected GoodbyeDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLeave"
    // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:67:1: entryRuleLeave returns [EObject current=null] : iv_ruleLeave= ruleLeave EOF ;
    public final EObject entryRuleLeave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeave = null;


        try {
            // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:68:2: (iv_ruleLeave= ruleLeave EOF )
            // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:69:2: iv_ruleLeave= ruleLeave EOF
            {
             newCompositeNode(grammarAccess.getLeaveRule()); 
            pushFollow(FOLLOW_ruleLeave_in_entryRuleLeave75);
            iv_ruleLeave=ruleLeave();

            state._fsp--;

             current =iv_ruleLeave; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeave85); 

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
    // $ANTLR end "entryRuleLeave"


    // $ANTLR start "ruleLeave"
    // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:76:1: ruleLeave returns [EObject current=null] : ( (lv_farewells_0_0= ruleGoodbye ) )* ;
    public final EObject ruleLeave() throws RecognitionException {
        EObject current = null;

        EObject lv_farewells_0_0 = null;


         enterRule(); 
            
        try {
            // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:79:28: ( ( (lv_farewells_0_0= ruleGoodbye ) )* )
            // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:80:1: ( (lv_farewells_0_0= ruleGoodbye ) )*
            {
            // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:80:1: ( (lv_farewells_0_0= ruleGoodbye ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:81:1: (lv_farewells_0_0= ruleGoodbye )
            	    {
            	    // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:81:1: (lv_farewells_0_0= ruleGoodbye )
            	    // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:82:3: lv_farewells_0_0= ruleGoodbye
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLeaveAccess().getFarewellsGoodbyeParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGoodbye_in_ruleLeave130);
            	    lv_farewells_0_0=ruleGoodbye();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLeaveRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"farewells",
            	            		lv_farewells_0_0, 
            	            		"Goodbye");
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
    // $ANTLR end "ruleLeave"


    // $ANTLR start "entryRuleGoodbye"
    // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:106:1: entryRuleGoodbye returns [EObject current=null] : iv_ruleGoodbye= ruleGoodbye EOF ;
    public final EObject entryRuleGoodbye() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoodbye = null;


        try {
            // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:107:2: (iv_ruleGoodbye= ruleGoodbye EOF )
            // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:108:2: iv_ruleGoodbye= ruleGoodbye EOF
            {
             newCompositeNode(grammarAccess.getGoodbyeRule()); 
            pushFollow(FOLLOW_ruleGoodbye_in_entryRuleGoodbye166);
            iv_ruleGoodbye=ruleGoodbye();

            state._fsp--;

             current =iv_ruleGoodbye; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoodbye176); 

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
    // $ANTLR end "entryRuleGoodbye"


    // $ANTLR start "ruleGoodbye"
    // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:115:1: ruleGoodbye returns [EObject current=null] : (otherlv_0= 'Bye' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGoodbye() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:118:28: ( (otherlv_0= 'Bye' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) )
            // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:119:1: (otherlv_0= 'Bye' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
            {
            // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:119:1: (otherlv_0= 'Bye' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
            // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:119:3: otherlv_0= 'Bye' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleGoodbye213); 

                	newLeafNode(otherlv_0, grammarAccess.getGoodbyeAccess().getByeKeyword_0());
                
            // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:123:1: ( (otherlv_1= RULE_ID ) )
            // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:124:1: (otherlv_1= RULE_ID )
            {
            // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:124:1: (otherlv_1= RULE_ID )
            // ../zarnekow.goodbye/src-gen/zarnekow/goodbye/parser/antlr/internal/InternalGoodbyeDSL.g:125:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGoodbyeRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoodbye233); 

            		newLeafNode(otherlv_1, grammarAccess.getGoodbyeAccess().getHelloHelloCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGoodbye245); 

                	newLeafNode(otherlv_2, grammarAccess.getGoodbyeAccess().getExclamationMarkKeyword_2());
                

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
    // $ANTLR end "ruleGoodbye"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLeave_in_entryRuleLeave75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeave85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoodbye_in_ruleLeave130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleGoodbye_in_entryRuleGoodbye166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoodbye176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGoodbye213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoodbye233 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGoodbye245 = new BitSet(new long[]{0x0000000000000002L});

}