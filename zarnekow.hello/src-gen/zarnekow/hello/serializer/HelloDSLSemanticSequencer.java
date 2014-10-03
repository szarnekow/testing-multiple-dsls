package zarnekow.hello.serializer;

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
import zarnekow.hello.helloDSL.Enter;
import zarnekow.hello.helloDSL.Hello;
import zarnekow.hello.helloDSL.HelloDSLPackage;
import zarnekow.hello.services.HelloDSLGrammarAccess;

@SuppressWarnings("all")
public class HelloDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private HelloDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == HelloDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case HelloDSLPackage.ENTER:
				if(context == grammarAccess.getEnterRule()) {
					sequence_Enter(context, (Enter) semanticObject); 
					return; 
				}
				else break;
			case HelloDSLPackage.HELLO:
				if(context == grammarAccess.getHelloRule()) {
					sequence_Hello(context, (Hello) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     greetings+=Hello*
	 */
	protected void sequence_Enter(EObject context, Enter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Hello(EObject context, Hello semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HelloDSLPackage.Literals.HELLO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HelloDSLPackage.Literals.HELLO__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHelloAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
