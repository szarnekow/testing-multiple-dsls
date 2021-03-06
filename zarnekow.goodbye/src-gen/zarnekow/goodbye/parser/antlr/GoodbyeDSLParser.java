/*
* generated by Xtext
*/
package zarnekow.goodbye.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import zarnekow.goodbye.services.GoodbyeDSLGrammarAccess;

public class GoodbyeDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private GoodbyeDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected zarnekow.goodbye.parser.antlr.internal.InternalGoodbyeDSLParser createParser(XtextTokenStream stream) {
		return new zarnekow.goodbye.parser.antlr.internal.InternalGoodbyeDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Leave";
	}
	
	public GoodbyeDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GoodbyeDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
