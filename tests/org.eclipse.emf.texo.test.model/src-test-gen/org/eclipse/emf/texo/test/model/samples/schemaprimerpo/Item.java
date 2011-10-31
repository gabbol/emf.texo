package org.eclipse.emf.texo.test.model.samples.schemaprimerpo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** 
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "Item")
public class Item {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private String productName = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private BigInteger quantity = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private BigDecimal uSPrice = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private String comment = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Temporal(TemporalType.DATE)
  private Date shipDate = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private String partNum = null;

  /**
   * Returns the value of '<em><b>productName</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>productName</b></em>' feature
   * @generated
   */
  public String getProductName() {
    return productName;
  }

  /**
   * Sets the '{@link Item#getProductName() <em>productName</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Item#getProductName() productName}' feature.
   * @generated
   */
  public void setProductName(String newProductName) {
    productName = newProductName;
  }

  /**
   * Returns the value of '<em><b>quantity</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>quantity</b></em>' feature
   * @generated
   */
  public BigInteger getQuantity() {
    return quantity;
  }

  /**
   * Sets the '{@link Item#getQuantity() <em>quantity</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Item#getQuantity() quantity}' feature.
   * @generated
   */
  public void setQuantity(BigInteger newQuantity) {
    quantity = newQuantity;
  }

  /**
   * Returns the value of '<em><b>uSPrice</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>uSPrice</b></em>' feature
   * @generated
   */
  public BigDecimal getUSPrice() {
    return uSPrice;
  }

  /**
   * Sets the '{@link Item#getUSPrice() <em>uSPrice</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Item#getUSPrice() uSPrice}' feature.
   * @generated
   */
  public void setUSPrice(BigDecimal newUSPrice) {
    uSPrice = newUSPrice;
  }

  /**
   * Returns the value of '<em><b>comment</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>comment</b></em>' feature
   * @generated
   */
  public String getComment() {
    return comment;
  }

  /**
   * Sets the '{@link Item#getComment() <em>comment</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Item#getComment() comment}' feature.
   * @generated
   */
  public void setComment(String newComment) {
    comment = newComment;
  }

  /**
   * Returns the value of '<em><b>shipDate</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>shipDate</b></em>' feature
   * @generated
   */
  public Date getShipDate() {
    return shipDate;
  }

  /**
   * Sets the '{@link Item#getShipDate() <em>shipDate</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Item#getShipDate() shipDate}' feature.
   * @generated
   */
  public void setShipDate(Date newShipDate) {
    shipDate = newShipDate;
  }

  /**
   * Returns the value of '<em><b>partNum</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>partNum</b></em>' feature
   * @generated
   */
  public String getPartNum() {
    return partNum;
  }

  /**
   * Sets the '{@link Item#getPartNum() <em>partNum</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Item#getPartNum() partNum}' feature.
   * @generated
   */
  public void setPartNum(String newPartNum) {
    partNum = newPartNum;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "Item " + " [productName: " + getProductName() + "]" + " [quantity: " + getQuantity() + "]" + " [uSPrice: "
        + getUSPrice() + "]" + " [comment: " + getComment() + "]" + " [shipDate: " + getShipDate() + "]"
        + " [partNum: " + getPartNum() + "]";
  }
}