package org.eclipse.emf.texo.test.model.samples.workflow;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

/** 
 * A representation of the model object '<em><b>OutputPort</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "OutputPort")
public class OutputPort extends Port {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = WorkflowNode.class)
  @JoinColumns({ @JoinColumn() })
  private WorkflowNode node = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = Edge.class)
  @OrderColumn()
  @JoinTable(name = "OutputPort_edges")
  private List<Edge> edges = new ArrayList<Edge>();

  /**
   * Returns the value of '<em><b>node</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>node</b></em>' feature
   * @generated
   */
  public WorkflowNode getNode() {
    return node;
  }

  /**
   * Sets the '{@link OutputPort#getNode() <em>node</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link OutputPort#getNode() node}' feature.
   * @generated
   */
  public void setNode(WorkflowNode newNode) {
    node = newNode;
  }

  /**
   * Returns the value of '<em><b>edges</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>edges</b></em>' feature
   * @generated
   */
  public List<Edge> getEdges() {
    return edges;
  }

  /**
   * Adds to the <em>edges</em> feature.
   * @generated
   */
  public void addToEdges(Edge edgesValue) {
    if (!edges.contains(edgesValue)) {

      edges.add(edgesValue);
    }

  }

  /**			
   * Removes from the <em>edges</em> feature.
   * @generated
   */
  public void removeFromEdges(Edge edgesValue) {
    if (edges.contains(edgesValue)) {
      edges.remove(edgesValue);
    }
  }

  /**			
   * Clears the <em>edges</em> feature.
   * @generated
   */
  public void clearEdges() {
    for (Edge edgesElement : edges) {
      removeFromEdges(edgesElement);
    }
  }

  /**
   * Sets the '{@link OutputPort#getEdges() <em>edges</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link OutputPort#getEdges() edges}' feature.
   * @generated
   */
  public void setEdges(List<Edge> newEdges) {
    edges = newEdges;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "OutputPort ";
  }
}