package zarnekow.goodbye.tests;

import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import zarnekow.goodbye.goodbyeDSL.Goodbye;
import zarnekow.goodbye.goodbyeDSL.GoodbyeDSLPackage;
import zarnekow.goodbye.goodbyeDSL.Leave;
import zarnekow.goodbye.tests.BothLanguagesInjectorProvider;
import zarnekow.hello.helloDSL.Enter;
import zarnekow.hello.helloDSL.Hello;

@RunWith(XtextRunner.class)
@InjectWith(BothLanguagesInjectorProvider.class)
@SuppressWarnings("all")
public class LinkingTest extends Assert {
  @Inject
  private ParseHelper<Leave> parseHelper;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  @Inject
  private ValidationTestHelper validationTester;
  
  @Test
  public void successfulLanguageTest() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      URI _createURI = URI.createURI("sample.hello");
      final Resource helloLang = resourceSet.createResource(_createURI);
      StringInputStream _stringInputStream = new StringInputStream("Hello Sebastian!");
      Map<Object, Object> _emptyMap = CollectionLiterals.<Object, Object>emptyMap();
      helloLang.load(_stringInputStream, _emptyMap);
      EList<EObject> _contents = helloLang.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      final Enter enter = ((Enter) _head);
      Assert.assertNotNull(enter);
      this.validationTester.assertNoIssues(enter);
      final Leave leave = this.parseHelper.parse("Bye Sebastian!", resourceSet);
      Assert.assertNotNull(leave);
      this.validationTester.assertNoIssues(leave);
      EList<Goodbye> _farewells = leave.getFarewells();
      final Goodbye goodbye = IterableExtensions.<Goodbye>head(_farewells);
      EList<Hello> _greetings = enter.getGreetings();
      Hello _head_1 = IterableExtensions.<Hello>head(_greetings);
      Hello _hello = goodbye.getHello();
      Assert.assertSame(_head_1, _hello);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void linkIsUnresolvedTest() {
    try {
      final XtextResourceSet resourceSet = this.resourceSetProvider.get();
      final Leave leave = this.parseHelper.parse("Bye MissingHello!", resourceSet);
      Assert.assertNotNull(leave);
      this.validationTester.assertError(leave, GoodbyeDSLPackage.Literals.GOODBYE, Diagnostic.LINKING_DIAGNOSTIC);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
