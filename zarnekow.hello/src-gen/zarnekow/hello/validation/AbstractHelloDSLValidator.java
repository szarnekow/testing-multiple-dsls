/*
 * generated by Xtext
 */
package zarnekow.hello.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractHelloDSLValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(zarnekow.hello.helloDSL.HelloDSLPackage.eINSTANCE);
		return result;
	}
}
