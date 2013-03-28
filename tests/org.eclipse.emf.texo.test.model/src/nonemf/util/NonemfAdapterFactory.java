/**
 * <copyright>
 * </copyright>
 *
 * $Id: NonemfAdapterFactory.java,v 1.4 2011/08/26 07:29:15 mtaal Exp $
 */
package nonemf.util;

import java.io.Serializable;

import nonemf.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * @see nonemf.NonemfPackage
 * @generated
 */
public class NonemfAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static NonemfPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NonemfAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = NonemfPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc --> This implementation
   * returns <code>true</code> if the object is either the model's package or is an instance object of the model. <!--
   * end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected NonemfSwitch<Adapter> modelSwitch = new NonemfSwitch<Adapter>() {
      @Override
      public Adapter caseSerializable(Serializable object) {
        return createSerializableAdapter();
      }
      @Override
      public Adapter caseMySerializableClass(MySerializableClass object) {
        return createMySerializableClassAdapter();
      }
      @Override
      public Adapter caseB(B object) {
        return createBAdapter();
      }
      @Override
      public Adapter caseA(A object) {
        return createAAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }

  /**
   * Creates a new adapter for an object of class '{@link java.io.Serializable <em>Serializable</em>}'. <!--
   * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * 
   * @return the new adapter.
   * @see java.io.Serializable
   * @generated
   */
  public Adapter createSerializableAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nonemf.MySerializableClass <em>My Serializable Class</em>}'.
   * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
   * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
   * @return the new adapter.
   * @see nonemf.MySerializableClass
   * @generated
   */
  public Adapter createMySerializableClassAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nonemf.B <em>B</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nonemf.B
   * @generated
   */
  public Adapter createBAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nonemf.A <em>A</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nonemf.A
   * @generated
   */
  public Adapter createAAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc --> This default implementation returns null. <!--
   * end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} // NonemfAdapterFactory
