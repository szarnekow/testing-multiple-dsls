/*
* generated by Xtext
*/
package zarnekow.goodbye;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class GoodbyeDSLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return zarnekow.goodbye.ui.internal.GoodbyeDSLActivator.getInstance().getInjector("zarnekow.goodbye.GoodbyeDSL");
	}
	
}
