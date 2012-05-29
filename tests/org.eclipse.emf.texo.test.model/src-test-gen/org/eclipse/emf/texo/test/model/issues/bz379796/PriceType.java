package org.eclipse.emf.texo.test.model.issues.bz379796;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>PriceType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "bz379796_PriceType")
public class PriceType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private Integer valueElement = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private Integer nillableValueElement = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private int requiredValueElement = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private ComparisonType comparisonElement = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private ComparisonType requiredComparisonElement = ComparisonType.LESS;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private ComparisonType comparison = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private ComparisonType requiredComparison = ComparisonType.LESS;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String requiredValue = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String value = "";

  /**
   * Returns the value of '<em><b>valueElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>valueElement</b></em>' feature
   * @generated
   */
  public Integer getValueElement() {
    return valueElement;
  }

  /**
   * Sets the '{@link PriceType#getValueElement() <em>valueElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PriceType#getValueElement() valueElement}' feature.
   * @generated
   */
  public void setValueElement(Integer newValueElement) {
    valueElement = newValueElement;
  }

  /**
   * Returns the value of '<em><b>nillableValueElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>nillableValueElement</b></em>' feature
   * @generated
   */
  public Integer getNillableValueElement() {
    return nillableValueElement;
  }

  /**
   * Sets the '{@link PriceType#getNillableValueElement() <em>nillableValueElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PriceType#getNillableValueElement() nillableValueElement}' feature.
   * @generated
   */
  public void setNillableValueElement(Integer newNillableValueElement) {
    nillableValueElement = newNillableValueElement;
  }

  /**
   * Returns the value of '<em><b>requiredValueElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>requiredValueElement</b></em>' feature
   * @generated
   */
  public int getRequiredValueElement() {
    return requiredValueElement;
  }

  /**
   * Sets the '{@link PriceType#getRequiredValueElement() <em>requiredValueElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PriceType#getRequiredValueElement() requiredValueElement}' feature.
   * @generated
   */
  public void setRequiredValueElement(int newRequiredValueElement) {
    requiredValueElement = newRequiredValueElement;
  }

  /**
   * Returns the value of '<em><b>comparisonElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>comparisonElement</b></em>' feature
   * @generated
   */
  public ComparisonType getComparisonElement() {
    return comparisonElement;
  }

  /**
   * Sets the '{@link PriceType#getComparisonElement() <em>comparisonElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PriceType#getComparisonElement() comparisonElement}' feature.
   * @generated
   */
  public void setComparisonElement(ComparisonType newComparisonElement) {
    comparisonElement = newComparisonElement;
  }

  /**
   * Returns the value of '<em><b>requiredComparisonElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>requiredComparisonElement</b></em>' feature
   * @generated
   */
  public ComparisonType getRequiredComparisonElement() {
    return requiredComparisonElement;
  }

  /**
   * Sets the '{@link PriceType#getRequiredComparisonElement() <em>requiredComparisonElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PriceType#getRequiredComparisonElement() requiredComparisonElement}' feature.
   * @generated
   */
  public void setRequiredComparisonElement(ComparisonType newRequiredComparisonElement) {
    requiredComparisonElement = newRequiredComparisonElement;
  }

  /**
   * Returns the value of '<em><b>comparison</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>comparison</b></em>' feature
   * @generated
   */
  public ComparisonType getComparison() {
    return comparison;
  }

  /**
   * Sets the '{@link PriceType#getComparison() <em>comparison</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PriceType#getComparison() comparison}' feature.
   * @generated
   */
  public void setComparison(ComparisonType newComparison) {
    comparison = newComparison;
  }

  /**
   * Returns the value of '<em><b>requiredComparison</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>requiredComparison</b></em>' feature
   * @generated
   */
  public ComparisonType getRequiredComparison() {
    return requiredComparison;
  }

  /**
   * Sets the '{@link PriceType#getRequiredComparison() <em>requiredComparison</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PriceType#getRequiredComparison() requiredComparison}' feature.
   * @generated
   */
  public void setRequiredComparison(ComparisonType newRequiredComparison) {
    requiredComparison = newRequiredComparison;
  }

  /**
   * Returns the value of '<em><b>requiredValue</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>requiredValue</b></em>' feature
   * @generated
   */
  public String getRequiredValue() {
    return requiredValue;
  }

  /**
   * Sets the '{@link PriceType#getRequiredValue() <em>requiredValue</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PriceType#getRequiredValue() requiredValue}' feature.
   * @generated
   */
  public void setRequiredValue(String newRequiredValue) {
    requiredValue = newRequiredValue;
  }

  /**
   * Returns the value of '<em><b>value</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>value</b></em>' feature
   * @generated
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the '{@link PriceType#getValue() <em>value</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PriceType#getValue() value}' feature.
   * @generated
   */
  public void setValue(String newValue) {
    value = newValue;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PriceType " + " [valueElement: " + getValueElement() + "]" + " [nillableValueElement: "
        + getNillableValueElement() + "]" + " [requiredValueElement: " + getRequiredValueElement() + "]"
        + " [comparisonElement: " + getComparisonElement() + "]" + " [requiredComparisonElement: "
        + getRequiredComparisonElement() + "]" + " [comparison: " + getComparison() + "]" + " [requiredComparison: "
        + getRequiredComparison() + "]" + " [requiredValue: " + getRequiredValue() + "]" + " [value: " + getValue()
        + "]";
  }
}
