/*
* generated by Xtext
*/
package zarnekow.hello;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class HelloDSLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return zarnekow.hello.ui.internal.HelloDSLActivator.getInstance().getInjector("zarnekow.hello.HelloDSL");
	}
	
}
