/**
 */
package zarnekow.hello.helloDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see zarnekow.hello.helloDSL.HelloDSLPackage
 * @generated
 */
public interface HelloDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HelloDSLFactory eINSTANCE = zarnekow.hello.helloDSL.impl.HelloDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Enter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enter</em>'.
   * @generated
   */
  Enter createEnter();

  /**
   * Returns a new object of class '<em>Hello</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hello</em>'.
   * @generated
   */
  Hello createHello();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HelloDSLPackage getHelloDSLPackage();

} //HelloDSLFactory
