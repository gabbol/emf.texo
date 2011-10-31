package org.eclipse.emf.texo.test.model.samples.forum;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

/** 
 * A representation of the model object '<em><b>Forum</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "Forum")
public class Forum {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private String title = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = Member.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<Member> members = new ArrayList<Member>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = Topic.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<Topic> topics = new ArrayList<Topic>();

  /**
   * Returns the value of '<em><b>title</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>title</b></em>' feature
   * @generated
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the '{@link Forum#getTitle() <em>title</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Forum#getTitle() title}' feature.
   * @generated
   */
  public void setTitle(String newTitle) {
    title = newTitle;
  }

  /**
   * Returns the value of '<em><b>members</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>members</b></em>' feature
   * @generated
   */
  public List<Member> getMembers() {
    return members;
  }

  /**
   * Adds to the <em>members</em> feature.
   * @generated
   */
  public void addToMembers(Member membersValue) {
    if (!members.contains(membersValue)) {

      members.add(membersValue);
    }

  }

  /**			
   * Removes from the <em>members</em> feature.
   * @generated
   */
  public void removeFromMembers(Member membersValue) {
    if (members.contains(membersValue)) {
      members.remove(membersValue);
    }
  }

  /**			
   * Clears the <em>members</em> feature.
   * @generated
   */
  public void clearMembers() {
    for (Member membersElement : members) {
      removeFromMembers(membersElement);
    }
  }

  /**
   * Sets the '{@link Forum#getMembers() <em>members</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Forum#getMembers() members}' feature.
   * @generated
   */
  public void setMembers(List<Member> newMembers) {
    members = newMembers;
  }

  /**
   * Returns the value of '<em><b>topics</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>topics</b></em>' feature
   * @generated
   */
  public List<Topic> getTopics() {
    return topics;
  }

  /**
   * Adds to the <em>topics</em> feature.
   * @generated
   */
  public void addToTopics(Topic topicsValue) {
    if (!topics.contains(topicsValue)) {

      topics.add(topicsValue);
    }

  }

  /**			
   * Removes from the <em>topics</em> feature.
   * @generated
   */
  public void removeFromTopics(Topic topicsValue) {
    if (topics.contains(topicsValue)) {
      topics.remove(topicsValue);
    }
  }

  /**			
   * Clears the <em>topics</em> feature.
   * @generated
   */
  public void clearTopics() {
    for (Topic topicsElement : topics) {
      removeFromTopics(topicsElement);
    }
  }

  /**
   * Sets the '{@link Forum#getTopics() <em>topics</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Forum#getTopics() topics}' feature.
   * @generated
   */
  public void setTopics(List<Topic> newTopics) {
    topics = newTopics;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "Forum " + " [title: " + getTitle() + "]";
  }
}