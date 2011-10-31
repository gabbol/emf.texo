package org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;

/** 
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "A")
public class A {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private String name = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  private List<AGroupFeatureGroup> group = new ArrayList<AGroupFeatureGroup>();

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link A#getName() <em>name</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link A#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>group</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>group</b></em>' feature
   * @generated
   */
  public List<AGroupFeatureGroup> getGroup() {
    return group;
  }

  /**
   * Sets the '{@link A#getGroup() <em>group</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link A#getGroup() group}' feature.
   * @generated
   */
  public void setGroup(List<AGroupFeatureGroup> newGroup) {
    group = newGroup;
  }

  /**
   * Returns the value of '<em><b>b</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>b</b></em>' feature
   * @generated
   */
  public List<String> getB() {
    return AGroupFeatureGroup.createUnmodifiableValueList(getGroup(), AGroupFeatureGroup.Feature.B);
  }

  /**
   * Sets the '{@link A#getB() <em>b</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link A#getB() b}' feature.
   * @generated
   */
  public void setB(List<String> newB) {
    setGroup(AGroupFeatureGroup.createFeatureGroupList(AGroupFeatureGroup.Feature.B, newB));
  }

  /**
   * Returns the value of '<em><b>c</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>c</b></em>' feature
   * @generated
   */
  public List<CType> getC() {
    return AGroupFeatureGroup.createUnmodifiableValueList(getGroup(), AGroupFeatureGroup.Feature.C);
  }

  /**
   * Sets the '{@link A#getC() <em>c</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link A#getC() c}' feature.
   * @generated
   */
  public void setC(List<CType> newC) {
    setGroup(AGroupFeatureGroup.createFeatureGroupList(AGroupFeatureGroup.Feature.C, newC));
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "A " + " [name: " + getName() + "]";
  }
}