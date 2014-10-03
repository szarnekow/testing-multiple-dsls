/**
 */
package zarnekow.goodbye.goodbyeDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see zarnekow.goodbye.goodbyeDSL.GoodbyeDSLPackage
 * @generated
 */
public interface GoodbyeDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GoodbyeDSLFactory eINSTANCE = zarnekow.goodbye.goodbyeDSL.impl.GoodbyeDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Leave</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Leave</em>'.
   * @generated
   */
  Leave createLeave();

  /**
   * Returns a new object of class '<em>Goodbye</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goodbye</em>'.
   * @generated
   */
  Goodbye createGoodbye();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GoodbyeDSLPackage getGoodbyeDSLPackage();

} //GoodbyeDSLFactory
