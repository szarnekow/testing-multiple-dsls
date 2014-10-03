/**
 */
package zarnekow.goodbye.goodbyeDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import zarnekow.goodbye.goodbyeDSL.Goodbye;
import zarnekow.goodbye.goodbyeDSL.GoodbyeDSLFactory;
import zarnekow.goodbye.goodbyeDSL.GoodbyeDSLPackage;
import zarnekow.goodbye.goodbyeDSL.Leave;

import zarnekow.hello.helloDSL.HelloDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoodbyeDSLPackageImpl extends EPackageImpl implements GoodbyeDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leaveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goodbyeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see zarnekow.goodbye.goodbyeDSL.GoodbyeDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GoodbyeDSLPackageImpl()
  {
    super(eNS_URI, GoodbyeDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GoodbyeDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GoodbyeDSLPackage init()
  {
    if (isInited) return (GoodbyeDSLPackage)EPackage.Registry.INSTANCE.getEPackage(GoodbyeDSLPackage.eNS_URI);

    // Obtain or create and register package
    GoodbyeDSLPackageImpl theGoodbyeDSLPackage = (GoodbyeDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GoodbyeDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GoodbyeDSLPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    HelloDSLPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theGoodbyeDSLPackage.createPackageContents();

    // Initialize created meta-data
    theGoodbyeDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGoodbyeDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GoodbyeDSLPackage.eNS_URI, theGoodbyeDSLPackage);
    return theGoodbyeDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeave()
  {
    return leaveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLeave_Farewells()
  {
    return (EReference)leaveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoodbye()
  {
    return goodbyeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoodbye_Hello()
  {
    return (EReference)goodbyeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoodbyeDSLFactory getGoodbyeDSLFactory()
  {
    return (GoodbyeDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    leaveEClass = createEClass(LEAVE);
    createEReference(leaveEClass, LEAVE__FAREWELLS);

    goodbyeEClass = createEClass(GOODBYE);
    createEReference(goodbyeEClass, GOODBYE__HELLO);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    HelloDSLPackage theHelloDSLPackage = (HelloDSLPackage)EPackage.Registry.INSTANCE.getEPackage(HelloDSLPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(leaveEClass, Leave.class, "Leave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLeave_Farewells(), this.getGoodbye(), null, "farewells", null, 0, -1, Leave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goodbyeEClass, Goodbye.class, "Goodbye", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGoodbye_Hello(), theHelloDSLPackage.getHello(), null, "hello", null, 0, 1, Goodbye.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GoodbyeDSLPackageImpl
