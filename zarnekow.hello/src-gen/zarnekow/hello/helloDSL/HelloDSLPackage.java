/**
 */
package zarnekow.hello.helloDSL;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see zarnekow.hello.helloDSL.HelloDSLFactory
 * @model kind="package"
 * @generated
 */
public interface HelloDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "helloDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.hello.zarnekow/HelloDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "helloDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HelloDSLPackage eINSTANCE = zarnekow.hello.helloDSL.impl.HelloDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link zarnekow.hello.helloDSL.impl.EnterImpl <em>Enter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see zarnekow.hello.helloDSL.impl.EnterImpl
   * @see zarnekow.hello.helloDSL.impl.HelloDSLPackageImpl#getEnter()
   * @generated
   */
  int ENTER = 0;

  /**
   * The feature id for the '<em><b>Greetings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTER__GREETINGS = 0;

  /**
   * The number of structural features of the '<em>Enter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link zarnekow.hello.helloDSL.impl.HelloImpl <em>Hello</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see zarnekow.hello.helloDSL.impl.HelloImpl
   * @see zarnekow.hello.helloDSL.impl.HelloDSLPackageImpl#getHello()
   * @generated
   */
  int HELLO = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELLO__NAME = 0;

  /**
   * The number of structural features of the '<em>Hello</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELLO_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link zarnekow.hello.helloDSL.Enter <em>Enter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enter</em>'.
   * @see zarnekow.hello.helloDSL.Enter
   * @generated
   */
  EClass getEnter();

  /**
   * Returns the meta object for the containment reference list '{@link zarnekow.hello.helloDSL.Enter#getGreetings <em>Greetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Greetings</em>'.
   * @see zarnekow.hello.helloDSL.Enter#getGreetings()
   * @see #getEnter()
   * @generated
   */
  EReference getEnter_Greetings();

  /**
   * Returns the meta object for class '{@link zarnekow.hello.helloDSL.Hello <em>Hello</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hello</em>'.
   * @see zarnekow.hello.helloDSL.Hello
   * @generated
   */
  EClass getHello();

  /**
   * Returns the meta object for the attribute '{@link zarnekow.hello.helloDSL.Hello#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see zarnekow.hello.helloDSL.Hello#getName()
   * @see #getHello()
   * @generated
   */
  EAttribute getHello_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HelloDSLFactory getHelloDSLFactory();

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
     * The meta object literal for the '{@link zarnekow.hello.helloDSL.impl.EnterImpl <em>Enter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see zarnekow.hello.helloDSL.impl.EnterImpl
     * @see zarnekow.hello.helloDSL.impl.HelloDSLPackageImpl#getEnter()
     * @generated
     */
    EClass ENTER = eINSTANCE.getEnter();

    /**
     * The meta object literal for the '<em><b>Greetings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTER__GREETINGS = eINSTANCE.getEnter_Greetings();

    /**
     * The meta object literal for the '{@link zarnekow.hello.helloDSL.impl.HelloImpl <em>Hello</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see zarnekow.hello.helloDSL.impl.HelloImpl
     * @see zarnekow.hello.helloDSL.impl.HelloDSLPackageImpl#getHello()
     * @generated
     */
    EClass HELLO = eINSTANCE.getHello();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELLO__NAME = eINSTANCE.getHello_Name();

  }

} //HelloDSLPackage
