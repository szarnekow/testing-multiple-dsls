/**
 */
package zarnekow.goodbye.goodbyeDSL;

import org.eclipse.emf.ecore.EObject;

import zarnekow.hello.helloDSL.Hello;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goodbye</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link zarnekow.goodbye.goodbyeDSL.Goodbye#getHello <em>Hello</em>}</li>
 * </ul>
 * </p>
 *
 * @see zarnekow.goodbye.goodbyeDSL.GoodbyeDSLPackage#getGoodbye()
 * @model
 * @generated
 */
public interface Goodbye extends EObject
{
  /**
   * Returns the value of the '<em><b>Hello</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hello</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hello</em>' reference.
   * @see #setHello(Hello)
   * @see zarnekow.goodbye.goodbyeDSL.GoodbyeDSLPackage#getGoodbye_Hello()
   * @model
   * @generated
   */
  Hello getHello();

  /**
   * Sets the value of the '{@link zarnekow.goodbye.goodbyeDSL.Goodbye#getHello <em>Hello</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hello</em>' reference.
   * @see #getHello()
   * @generated
   */
  void setHello(Hello value);

} // Goodbye
