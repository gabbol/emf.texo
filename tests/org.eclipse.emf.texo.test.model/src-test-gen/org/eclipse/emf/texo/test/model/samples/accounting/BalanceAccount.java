package org.eclipse.emf.texo.test.model.samples.accounting;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>BalanceAccount</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "accounting_BalanceAccount")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter") })
public class BalanceAccount extends Account {

  /**
   * @generated
   */
  private static final long serialVersionUID = 1L;
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn(name = "accounting_BalanceAccount_report_ind")
  @JoinTable(joinColumns = { @JoinColumn(name = "accounting_BalanceAccount_report") }, inverseJoinColumns = { @JoinColumn(name = "accounting_ReportGroup_account") }, name = "accounting_BalanceAccount_report")
  private List<ReportGroup> report = new ArrayList<ReportGroup>();

  /**
   * Returns the value of '<em><b>report</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>report</b></em>' feature
   * @generated
   */
  public List<ReportGroup> getReport() {
    return report;
  }

  /**
   * Adds to the <em>report</em> feature.
   * 
   * @generated
   */
  public void addToReport(ReportGroup reportValue) {
    if (!report.contains(reportValue)) {
      report.add(reportValue);
    }
  }

  /**
   * Removes from the <em>report</em> feature.
   * 
   * @generated
   */
  public void removeFromReport(ReportGroup reportValue) {
    if (report.contains(reportValue)) {
      report.remove(reportValue);
    }
  }

  /**
   * Clears the <em>report</em> feature.
   * 
   * @generated
   */
  public void clearReport() {
    while (!report.isEmpty()) {
      removeFromReport(report.iterator().next());
    }
  }

  /**
   * Sets the '{@link BalanceAccount#getReport() <em>report</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link BalanceAccount#getReport() report}' feature.
   * @generated
   */
  public void setReport(List<ReportGroup> newReport) {
    report = newReport;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "BalanceAccount ";
  }
}
