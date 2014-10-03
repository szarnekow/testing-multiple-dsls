/*
* generated by Xtext
*/
grammar InternalHelloDSL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package zarnekow.hello.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleEnter
entryRuleEnter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEnterRule()); }
	 iv_ruleEnter=ruleEnter 
	 { $current=$iv_ruleEnter.current; } 
	 EOF 
;

// Rule Enter
ruleEnter returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getEnterAccess().getGreetingsHelloParserRuleCall_0()); 
	    }
		lv_greetings_0_0=ruleHello		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnterRule());
	        }
       		add(
       			$current, 
       			"greetings",
        		lv_greetings_0_0, 
        		"Hello");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleHello
entryRuleHello returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHelloRule()); }
	 iv_ruleHello=ruleHello 
	 { $current=$iv_ruleHello.current; } 
	 EOF 
;

// Rule Hello
ruleHello returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Hello' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getHelloAccess().getHelloKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getHelloAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHelloRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='!' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getHelloAccess().getExclamationMarkKeyword_2());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

