/**
 */
package zarnekow.goodbye.goodbyeDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import zarnekow.goodbye.goodbyeDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoodbyeDSLFactoryImpl extends EFactoryImpl implements GoodbyeDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GoodbyeDSLFactory init()
  {
    try
    {
      GoodbyeDSLFactory theGoodbyeDSLFactory = (GoodbyeDSLFactory)EPackage.Registry.INSTANCE.getEFactory(GoodbyeDSLPackage.eNS_URI);
      if (theGoodbyeDSLFactory != null)
      {
        return theGoodbyeDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GoodbyeDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoodbyeDSLFactoryImpl()
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
      case GoodbyeDSLPackage.LEAVE: return createLeave();
      case GoodbyeDSLPackage.GOODBYE: return createGoodbye();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Leave createLeave()
  {
    LeaveImpl leave = new LeaveImpl();
    return leave;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goodbye createGoodbye()
  {
    GoodbyeImpl goodbye = new GoodbyeImpl();
    return goodbye;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoodbyeDSLPackage getGoodbyeDSLPackage()
  {
    return (GoodbyeDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GoodbyeDSLPackage getPackage()
  {
    return GoodbyeDSLPackage.eINSTANCE;
  }

} //GoodbyeDSLFactoryImpl
