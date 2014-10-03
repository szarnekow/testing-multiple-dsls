/**
 */
package zarnekow.goodbye.goodbyeDSL;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see zarnekow.goodbye.goodbyeDSL.GoodbyeDSLFactory
 * @model kind="package"
 * @generated
 */
public interface GoodbyeDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "goodbyeDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.goodbye.zarnekow/GoodbyeDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "goodbyeDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GoodbyeDSLPackage eINSTANCE = zarnekow.goodbye.goodbyeDSL.impl.GoodbyeDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link zarnekow.goodbye.goodbyeDSL.impl.LeaveImpl <em>Leave</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see zarnekow.goodbye.goodbyeDSL.impl.LeaveImpl
   * @see zarnekow.goodbye.goodbyeDSL.impl.GoodbyeDSLPackageImpl#getLeave()
   * @generated
   */
  int LEAVE = 0;

  /**
   * The feature id for the '<em><b>Farewells</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAVE__FAREWELLS = 0;

  /**
   * The number of structural features of the '<em>Leave</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAVE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link zarnekow.goodbye.goodbyeDSL.impl.GoodbyeImpl <em>Goodbye</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see zarnekow.goodbye.goodbyeDSL.impl.GoodbyeImpl
   * @see zarnekow.goodbye.goodbyeDSL.impl.GoodbyeDSLPackageImpl#getGoodbye()
   * @generated
   */
  int GOODBYE = 1;

  /**
   * The feature id for the '<em><b>Hello</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOODBYE__HELLO = 0;

  /**
   * The number of structural features of the '<em>Goodbye</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOODBYE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link zarnekow.goodbye.goodbyeDSL.Leave <em>Leave</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leave</em>'.
   * @see zarnekow.goodbye.goodbyeDSL.Leave
   * @generated
   */
  EClass getLeave();

  /**
   * Returns the meta object for the containment reference list '{@link zarnekow.goodbye.goodbyeDSL.Leave#getFarewells <em>Farewells</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Farewells</em>'.
   * @see zarnekow.goodbye.goodbyeDSL.Leave#getFarewells()
   * @see #getLeave()
   * @generated
   */
  EReference getLeave_Farewells();

  /**
   * Returns the meta object for class '{@link zarnekow.goodbye.goodbyeDSL.Goodbye <em>Goodbye</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goodbye</em>'.
   * @see zarnekow.goodbye.goodbyeDSL.Goodbye
   * @generated
   */
  EClass getGoodbye();

  /**
   * Returns the meta object for the reference '{@link zarnekow.goodbye.goodbyeDSL.Goodbye#getHello <em>Hello</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Hello</em>'.
   * @see zarnekow.goodbye.goodbyeDSL.Goodbye#getHello()
   * @see #getGoodbye()
   * @generated
   */
  EReference getGoodbye_Hello();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GoodbyeDSLFactory getGoodbyeDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link zarnekow.goodbye.goodbyeDSL.impl.LeaveImpl <em>Leave</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see zarnekow.goodbye.goodbyeDSL.impl.LeaveImpl
     * @see zarnekow.goodbye.goodbyeDSL.impl.GoodbyeDSLPackageImpl#getLeave()
     * @generated
     */
    EClass LEAVE = eINSTANCE.getLeave();

    /**
     * The meta object literal for the '<em><b>Farewells</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEAVE__FAREWELLS = eINSTANCE.getLeave_Farewells();

    /**
     * The meta object literal for the '{@link zarnekow.goodbye.goodbyeDSL.impl.GoodbyeImpl <em>Goodbye</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see zarnekow.goodbye.goodbyeDSL.impl.GoodbyeImpl
     * @see zarnekow.goodbye.goodbyeDSL.impl.GoodbyeDSLPackageImpl#getGoodbye()
     * @generated
     */
    EClass GOODBYE = eINSTANCE.getGoodbye();

    /**
     * The meta object literal for the '<em><b>Hello</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOODBYE__HELLO = eINSTANCE.getGoodbye_Hello();

  }

} //GoodbyeDSLPackage
