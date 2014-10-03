package zarnekow.goodbye.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import zarnekow.goodbye.goodbyeDSL.Goodbye;
import zarnekow.goodbye.goodbyeDSL.GoodbyeDSLPackage;
import zarnekow.goodbye.goodbyeDSL.Leave;
import zarnekow.goodbye.services.GoodbyeDSLGrammarAccess;

@SuppressWarnings("all")
public class GoodbyeDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GoodbyeDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GoodbyeDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GoodbyeDSLPackage.GOODBYE:
				if(context == grammarAccess.getGoodbyeRule()) {
					sequence_Goodbye(context, (Goodbye) semanticObject); 
					return; 
				}
				else break;
			case GoodbyeDSLPackage.LEAVE:
				if(context == grammarAccess.getLeaveRule()) {
					sequence_Leave(context, (Leave) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     hello=[Hello|ID]
	 */
	protected void sequence_Goodbye(EObject context, Goodbye semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GoodbyeDSLPackage.Literals.GOODBYE__HELLO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GoodbyeDSLPackage.Literals.GOODBYE__HELLO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGoodbyeAccess().getHelloHelloIDTerminalRuleCall_1_0_1(), semanticObject.getHello());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     farewells+=Goodbye*
	 */
	protected void sequence_Leave(EObject context, Leave semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
