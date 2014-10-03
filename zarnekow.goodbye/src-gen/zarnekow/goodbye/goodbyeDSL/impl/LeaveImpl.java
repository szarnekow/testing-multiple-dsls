/**
 */
package zarnekow.goodbye.goodbyeDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import zarnekow.goodbye.goodbyeDSL.Goodbye;
import zarnekow.goodbye.goodbyeDSL.GoodbyeDSLPackage;
import zarnekow.goodbye.goodbyeDSL.Leave;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leave</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link zarnekow.goodbye.goodbyeDSL.impl.LeaveImpl#getFarewells <em>Farewells</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeaveImpl extends MinimalEObjectImpl.Container implements Leave
{
  /**
   * The cached value of the '{@link #getFarewells() <em>Farewells</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFarewells()
   * @generated
   * @ordered
   */
  protected EList<Goodbye> farewells;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeaveImpl()
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
    return GoodbyeDSLPackage.Literals.LEAVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Goodbye> getFarewells()
  {
    if (farewells == null)
    {
      farewells = new EObjectContainmentEList<Goodbye>(Goodbye.class, this, GoodbyeDSLPackage.LEAVE__FAREWELLS);
    }
    return farewells;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GoodbyeDSLPackage.LEAVE__FAREWELLS:
        return ((InternalEList<?>)getFarewells()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GoodbyeDSLPackage.LEAVE__FAREWELLS:
        return getFarewells();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoodbyeDSLPackage.LEAVE__FAREWELLS:
        getFarewells().clear();
        getFarewells().addAll((Collection<? extends Goodbye>)newValue);
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
      case GoodbyeDSLPackage.LEAVE__FAREWELLS:
        getFarewells().clear();
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
      case GoodbyeDSLPackage.LEAVE__FAREWELLS:
        return farewells != null && !farewells.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LeaveImpl
