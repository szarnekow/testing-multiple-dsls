package zarnekow.goodbye.tests

import zarnekow.goodbye.GoodbyeDSLInjectorProvider
import zarnekow.hello.HelloDSLInjectorProvider

class BothLanguagesInjectorProvider extends GoodbyeDSLInjectorProvider {
	
	override protected internalCreateInjector() {
		// trigger injector creation of other language
		new HelloDSLInjectorProvider().injector
		
		super.internalCreateInjector()
	}
	
}