/*
 * generated by Xtext
 */
package zarnekow.goodbye.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractGoodbyeDSLValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(zarnekow.goodbye.goodbyeDSL.GoodbyeDSLPackage.eINSTANCE);
		return result;
	}
}
