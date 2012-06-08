package org.eclipse.graphiti.mm.pictograms;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Connection</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "pi_Connection")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter") })
public class Connection extends AnchorContainer {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  @JoinTable()
  private Anchor start = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  @JoinTable()
  private Anchor end = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true)
  private Diagram parent = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<ConnectionDecorator> connectionDecorators = new ArrayList<ConnectionDecorator>();

  /**
   * Returns the value of '<em><b>start</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>start</b></em>' feature
   * @generated
   */
  public Anchor getStart() {
    return start;
  }

  /**
   * Sets the '{@link Connection#getStart() <em>start</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Connection#getStart() start}' feature.
   * @generated
   */
  public void setStart(Anchor newStart) {
    start = newStart;
  }

  /**
   * Returns the value of '<em><b>end</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>end</b></em>' feature
   * @generated
   */
  public Anchor getEnd() {
    return end;
  }

  /**
   * Sets the '{@link Connection#getEnd() <em>end</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Connection#getEnd() end}' feature.
   * @generated
   */
  public void setEnd(Anchor newEnd) {
    end = newEnd;
  }

  /**
   * Returns the value of '<em><b>parent</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>parent</b></em>' feature
   * @generated
   */
  public Diagram getParent() {
    return parent;
  }

  /**
   * Sets the '{@link Connection#getParent() <em>parent</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Connection#getParent() parent}' feature.
   * @generated
   */
  public void setParent(Diagram newParent) {
    parent = newParent;
  }

  /**
   * Returns the value of '<em><b>connectionDecorators</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>connectionDecorators</b></em>' feature
   * @generated
   */
  public List<ConnectionDecorator> getConnectionDecorators() {
    return connectionDecorators;
  }

  /**
   * Adds to the <em>connectionDecorators</em> feature.
   * 
   * @generated
   */
  public void addToConnectionDecorators(ConnectionDecorator connectionDecoratorsValue) {
    if (!connectionDecorators.contains(connectionDecoratorsValue)) {
      connectionDecorators.add(connectionDecoratorsValue);
    }
  }

  /**
   * Removes from the <em>connectionDecorators</em> feature.
   * 
   * @generated
   */
  public void removeFromConnectionDecorators(ConnectionDecorator connectionDecoratorsValue) {
    if (connectionDecorators.contains(connectionDecoratorsValue)) {
      connectionDecorators.remove(connectionDecoratorsValue);
    }
  }

  /**
   * Clears the <em>connectionDecorators</em> feature.
   * 
   * @generated
   */
  public void clearConnectionDecorators() {
    while (!connectionDecorators.isEmpty()) {
      removeFromConnectionDecorators(connectionDecorators.iterator().next());
    }
  }

  /**
   * Sets the '{@link Connection#getConnectionDecorators() <em>connectionDecorators</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Connection#getConnectionDecorators() connectionDecorators}' feature.
   * @generated
   */
  public void setConnectionDecorators(List<ConnectionDecorator> newConnectionDecorators) {
    connectionDecorators = newConnectionDecorators;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Connection ";
  }
}
