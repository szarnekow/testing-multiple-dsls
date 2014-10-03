/**
 */
package zarnekow.hello.helloDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import zarnekow.hello.helloDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HelloDSLFactoryImpl extends EFactoryImpl implements HelloDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HelloDSLFactory init()
  {
    try
    {
      HelloDSLFactory theHelloDSLFactory = (HelloDSLFactory)EPackage.Registry.INSTANCE.getEFactory(HelloDSLPackage.eNS_URI);
      if (theHelloDSLFactory != null)
      {
        return theHelloDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HelloDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HelloDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case HelloDSLPackage.ENTER: return createEnter();
      case HelloDSLPackage.HELLO: return createHello();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enter createEnter()
  {
    EnterImpl enter = new EnterImpl();
    return enter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hello createHello()
  {
    HelloImpl hello = new HelloImpl();
    return hello;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HelloDSLPackage getHelloDSLPackage()
  {
    return (HelloDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HelloDSLPackage getPackage()
  {
    return HelloDSLPackage.eINSTANCE;
  }

} //HelloDSLFactoryImpl
