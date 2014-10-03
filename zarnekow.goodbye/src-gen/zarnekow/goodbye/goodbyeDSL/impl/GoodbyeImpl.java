/**
 */
package zarnekow.goodbye.goodbyeDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import zarnekow.goodbye.goodbyeDSL.Goodbye;
import zarnekow.goodbye.goodbyeDSL.GoodbyeDSLPackage;

import zarnekow.hello.helloDSL.Hello;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goodbye</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link zarnekow.goodbye.goodbyeDSL.impl.GoodbyeImpl#getHello <em>Hello</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoodbyeImpl extends MinimalEObjectImpl.Container implements Goodbye
{
  /**
   * The cached value of the '{@link #getHello() <em>Hello</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHello()
   * @generated
   * @ordered
   */
  protected Hello hello;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoodbyeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GoodbyeDSLPackage.Literals.GOODBYE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hello getHello()
  {
    if (hello != null && hello.eIsProxy())
    {
      InternalEObject oldHello = (InternalEObject)hello;
      hello = (Hello)eResolveProxy(oldHello);
      if (hello != oldHello)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GoodbyeDSLPackage.GOODBYE__HELLO, oldHello, hello));
      }
    }
    return hello;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hello basicGetHello()
  {
    return hello;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHello(Hello newHello)
  {
    Hello oldHello = hello;
    hello = newHello;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoodbyeDSLPackage.GOODBYE__HELLO, oldHello, hello));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GoodbyeDSLPackage.GOODBYE__HELLO:
        if (resolve) return getHello();
        return basicGetHello();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoodbyeDSLPackage.GOODBYE__HELLO:
        setHello((Hello)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GoodbyeDSLPackage.GOODBYE__HELLO:
        setHello((Hello)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GoodbyeDSLPackage.GOODBYE__HELLO:
        return hello != null;
    }
    return super.eIsSet(featureID);
  }

} //GoodbyeImpl
