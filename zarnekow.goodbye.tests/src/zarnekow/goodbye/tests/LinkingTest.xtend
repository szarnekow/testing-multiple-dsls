package zarnekow.goodbye.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.util.StringInputStream
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import zarnekow.goodbye.goodbyeDSL.Leave
import zarnekow.hello.helloDSL.Enter
import zarnekow.goodbye.goodbyeDSL.GoodbyeDSLPackage
import org.eclipse.xtext.diagnostics.Diagnostic

@RunWith(XtextRunner)
@InjectWith(BothLanguagesInjectorProvider)
// Alternatively trigger the HelloDSL already in the StandaloneSetup of the 
// GoodbyeDSL (see zarnekow.goodbye.GoodbyeDSLStandaloneSetup.createInjectorAndDoEMFRegistration
//@InjectWith(GoodbyeDSLInjectorProvider)
class LinkingTest extends Assert {
	
	// Helper to read GoodbyeDSL models - cannot be used to read other language's models
	@Inject ParseHelper<Leave> parseHelper
	// Allows to obtain a new resource set
	@Inject Provider<XtextResourceSet> resourceSetProvider
	// Helper to test all validation rules and ensure resolved links
	@Inject ValidationTestHelper validationTester
	
	@Test def void successfulLanguageTest() {
		val resourceSet = resourceSetProvider.get
		
		// create a resource of language 'HelloDSL'
		val helloLang = resourceSet.createResource(URI.createURI("sample.hello"))
		// parse some contents
		helloLang.load(new StringInputStream("Hello Sebastian!"), emptyMap)
		// and read the root instance
		val enter = helloLang.contents.head as Enter
		// ensure it's not null
		assertNotNull(enter)
		// and valid
		validationTester.assertNoIssues(enter)
		
		// use the parse helper to read a model of the 'GoodbyeDSL' into the same resource set
		val leave = parseHelper.parse("Bye Sebastian!", resourceSet)
		// it's not null, too
		assertNotNull(leave)
		// and also valid		
		validationTester.assertNoIssues(leave)
		
		val goodbye = leave.farewells.head
		// explicitly check the cross reference
		assertSame(enter.greetings.head, goodbye.hello)
	}
	
	@Test def void linkIsUnresolvedTest() {
		val resourceSet = resourceSetProvider.get
		
		// use the parse helper to read a model of the 'GoodbyeDSL' into the same resource set
		val leave = parseHelper.parse("Bye MissingHello!", resourceSet)
		// it's not null
		assertNotNull(leave)
		// but has an unresolved proxy		
		validationTester.assertError(leave, GoodbyeDSLPackage.Literals.GOODBYE, Diagnostic.LINKING_DIAGNOSTIC)
	}
	
}