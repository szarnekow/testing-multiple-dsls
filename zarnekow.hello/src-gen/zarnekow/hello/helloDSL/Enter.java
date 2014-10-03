/**
 */
package zarnekow.hello.helloDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link zarnekow.hello.helloDSL.Enter#getGreetings <em>Greetings</em>}</li>
 * </ul>
 * </p>
 *
 * @see zarnekow.hello.helloDSL.HelloDSLPackage#getEnter()
 * @model
 * @generated
 */
public interface Enter extends EObject
{
  /**
   * Returns the value of the '<em><b>Greetings</b></em>' containment reference list.
   * The list contents are of type {@link zarnekow.hello.helloDSL.Hello}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Greetings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greetings</em>' containment reference list.
   * @see zarnekow.hello.helloDSL.HelloDSLPackage#getEnter_Greetings()
   * @model containment="true"
   * @generated
   */
  EList<Hello> getGreetings();

} // Enter
