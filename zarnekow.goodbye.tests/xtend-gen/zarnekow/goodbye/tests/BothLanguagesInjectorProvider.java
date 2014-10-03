package zarnekow.goodbye.tests;

import com.google.inject.Injector;
import zarnekow.goodbye.GoodbyeDSLInjectorProvider;
import zarnekow.hello.HelloDSLInjectorProvider;

@SuppressWarnings("all")
public class BothLanguagesInjectorProvider extends GoodbyeDSLInjectorProvider {
  protected Injector internalCreateInjector() {
    Injector _xblockexpression = null;
    {
      HelloDSLInjectorProvider _helloDSLInjectorProvider = new HelloDSLInjectorProvider();
      _helloDSLInjectorProvider.getInjector();
      _xblockexpression = super.internalCreateInjector();
    }
    return _xblockexpression;
  }
}
