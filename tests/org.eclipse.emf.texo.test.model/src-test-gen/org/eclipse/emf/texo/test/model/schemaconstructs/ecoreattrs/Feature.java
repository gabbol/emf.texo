package org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Entity;

/** 
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "Feature")
public class Feature {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  private List<FeatureAMapFeatureGroup> aMap = new ArrayList<FeatureAMapFeatureGroup>();

  /**
   * Returns the value of '<em><b>aMap</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>aMap</b></em>' feature
   * @generated
   */
  public List<FeatureAMapFeatureGroup> getAMap() {
    return aMap;
  }

  /**
   * Sets the '{@link Feature#getAMap() <em>aMap</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Feature#getAMap() aMap}' feature.
   * @generated
   */
  public void setAMap(List<FeatureAMapFeatureGroup> newAMap) {
    aMap = newAMap;
  }

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return FeatureAMapFeatureGroup.getSingleFeatureMapValue(getAMap(), FeatureAMapFeatureGroup.Feature.NAME);
  }

  /**
   * Sets the '{@link Feature#getName() <em>name</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Feature#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    setAMap(FeatureAMapFeatureGroup.createFeatureGroupList(FeatureAMapFeatureGroup.Feature.NAME,
        Collections.singletonList(newName)));
  }

  /**
   * Returns the value of '<em><b>value</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>value</b></em>' feature
   * @generated
   */
  public double getValue_() {
    return FeatureAMapFeatureGroup.getSingleFeatureMapValue(getAMap(), FeatureAMapFeatureGroup.Feature.VALUE_);
  }

  /**
   * Sets the '{@link Feature#getValue_() <em>value</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Feature#getValue_() value}' feature.
   * @generated
   */
  public void setValue_(double newValue_) {
    setAMap(FeatureAMapFeatureGroup.createFeatureGroupList(FeatureAMapFeatureGroup.Feature.VALUE_,
        Collections.singletonList(newValue_)));
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "Feature " + " [name: " + getName() + "]" + " [value_: " + getValue_() + "]";
  }
}