package org.eclipse.emf.texo.test.model.samples.extlibrary;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

/** 
 * A representation of the model object '<em><b>Writer</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "Writer")
public class Writer extends Person {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = Book.class)
  @OrderColumn()
  @JoinTable(name = "Writer_books")
  private List<Book> books = new ArrayList<Book>();

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    // Volatile feature
    // TODO: implement this method to return the 'name'
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * Sets the '{@link Writer#getName() <em>name</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Writer#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    // Volatile feature
    // TODO: implement this method to set the 'name'
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * Returns the value of '<em><b>books</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>books</b></em>' feature
   * @generated
   */
  public List<Book> getBooks() {
    return books;
  }

  /**
   * Adds to the <em>books</em> feature.
   * @generated
   */
  public void addToBooks(Book booksValue) {
    if (!books.contains(booksValue)) {

      books.add(booksValue);
    }

  }

  /**			
   * Removes from the <em>books</em> feature.
   * @generated
   */
  public void removeFromBooks(Book booksValue) {
    if (books.contains(booksValue)) {
      books.remove(booksValue);
    }
  }

  /**			
   * Clears the <em>books</em> feature.
   * @generated
   */
  public void clearBooks() {
    for (Book booksElement : books) {
      removeFromBooks(booksElement);
    }
  }

  /**
   * Sets the '{@link Writer#getBooks() <em>books</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Writer#getBooks() books}' feature.
   * @generated
   */
  public void setBooks(List<Book> newBooks) {
    books = newBooks;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "Writer " + " [name: " + getName() + "]";
  }
}