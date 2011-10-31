package org.eclipse.emf.texo.test.model.schemaconstructs.ecoreattrs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Entity;

/** 
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "Element")
public class Element {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  private List<ElementNameMapFeatureGroup> nameMap = new ArrayList<ElementNameMapFeatureGroup>();

  /**
   * Returns the value of '<em><b>nameMap</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>nameMap</b></em>' feature
   * @generated
   */
  public List<ElementNameMapFeatureGroup> getNameMap() {
    return nameMap;
  }

  /**
   * Sets the '{@link Element#getNameMap() <em>nameMap</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Element#getNameMap() nameMap}' feature.
   * @generated
   */
  public void setNameMap(List<ElementNameMapFeatureGroup> newNameMap) {
    nameMap = newNameMap;
  }

  /**
   * Returns the value of '<em><b>names</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>names</b></em>' feature
   * @generated
   */
  public NameList getNames() {
    return ElementNameMapFeatureGroup.getSingleFeatureMapValue(getNameMap(), ElementNameMapFeatureGroup.Feature.NAMES);
  }

  /**
   * Sets the '{@link Element#getNames() <em>names</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Element#getNames() names}' feature.
   * @generated
   */
  public void setNames(NameList newNames) {
    setNameMap(ElementNameMapFeatureGroup.createFeatureGroupList(ElementNameMapFeatureGroup.Feature.NAMES,
        Collections.singletonList(newNames)));
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "Element ";
  }
}