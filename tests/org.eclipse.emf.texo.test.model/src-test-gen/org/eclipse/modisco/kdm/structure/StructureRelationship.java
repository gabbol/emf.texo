package org.eclipse.modisco.kdm.structure;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.eclipse.modisco.kdm.core.KDMEntity;

/** 
 * A representation of the model object '<em><b>StructureRelationship</b></em>'.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated 
 */
@Entity(name = "StructureRelationship")
public class StructureRelationship extends AbstractStructureRelationship {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = KDMEntity.class)
  @JoinColumns({ @JoinColumn() })
  private KDMEntity to = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = AbstractStructureElement.class)
  @JoinColumns({ @JoinColumn() })
  private AbstractStructureElement from = null;

  /**
   * Returns the value of '<em><b>to</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>to</b></em>' feature
   * @generated
   */
  public KDMEntity getTo() {
    return to;
  }

  /**
   * Sets the '{@link StructureRelationship#getTo() <em>to</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link StructureRelationship#getTo() to}' feature.
   * @generated
   */
  public void setTo(KDMEntity newTo) {
    to = newTo;
  }

  /**
   * Returns the value of '<em><b>from</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>from</b></em>' feature
   * @generated
   */
  public AbstractStructureElement getFrom() {
    return from;
  }

  /**
   * Sets the '{@link StructureRelationship#getFrom() <em>from</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link StructureRelationship#getFrom() from}' feature.
   * @generated
   */
  public void setFrom(AbstractStructureElement newFrom) {
    from = newFrom;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "StructureRelationship ";
  }
}