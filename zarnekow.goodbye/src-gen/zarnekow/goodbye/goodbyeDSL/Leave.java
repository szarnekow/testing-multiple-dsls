/**
 */
package zarnekow.goodbye.goodbyeDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link zarnekow.goodbye.goodbyeDSL.Leave#getFarewells <em>Farewells</em>}</li>
 * </ul>
 * </p>
 *
 * @see zarnekow.goodbye.goodbyeDSL.GoodbyeDSLPackage#getLeave()
 * @model
 * @generated
 */
public interface Leave extends EObject
{
  /**
   * Returns the value of the '<em><b>Farewells</b></em>' containment reference list.
   * The list contents are of type {@link zarnekow.goodbye.goodbyeDSL.Goodbye}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Farewells</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Farewells</em>' containment reference list.
   * @see zarnekow.goodbye.goodbyeDSL.GoodbyeDSLPackage#getLeave_Farewells()
   * @model containment="true"
   * @generated
   */
  EList<Goodbye> getFarewells();

} // Leave
