/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.Column;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.RangePartition;
import org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Partitioning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.RangePartitioningImpl#getPartitionColumn <em>Partition Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.RangePartitioningImpl#getPartition <em>Partition</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.RangePartitioningImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.RangePartitioningImpl#getPartitionValueType <em>Partition Value Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.RangePartitioningImpl#isUnionUnpartitionableQueries <em>Union Unpartitionable Queries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangePartitioningImpl extends BaseOrmAnnotationImpl implements RangePartitioning {
	/**
	 * The cached value of the '{@link #getPartitionColumn() <em>Partition Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionColumn()
	 * @generated
	 * @ordered
	 */
	protected Column partitionColumn;

	/**
	 * The cached value of the '{@link #getPartition() <em>Partition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartition()
	 * @generated
	 * @ordered
	 */
	protected EList<RangePartition> partition;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartitionValueType() <em>Partition Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionValueType()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTITION_VALUE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitionValueType() <em>Partition Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionValueType()
	 * @generated
	 * @ordered
	 */
	protected String partitionValueType = PARTITION_VALUE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnionUnpartitionableQueries() <em>Union Unpartitionable Queries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnionUnpartitionableQueries()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNION_UNPARTITIONABLE_QUERIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnionUnpartitionableQueries() <em>Union Unpartitionable Queries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnionUnpartitionableQueries()
	 * @generated
	 * @ordered
	 */
	protected boolean unionUnpartitionableQueries = UNION_UNPARTITIONABLE_QUERIES_EDEFAULT;

	/**
	 * This is true if the Union Unpartitionable Queries attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unionUnpartitionableQueriesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangePartitioningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrmPackage.eINSTANCE.getRangePartitioning();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getPartitionColumn() {
		return partitionColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitionColumn(Column newPartitionColumn, NotificationChain msgs) {
		Column oldPartitionColumn = partitionColumn;
		partitionColumn = newPartitionColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.RANGE_PARTITIONING__PARTITION_COLUMN, oldPartitionColumn, newPartitionColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionColumn(Column newPartitionColumn) {
		if (newPartitionColumn != partitionColumn) {
			NotificationChain msgs = null;
			if (partitionColumn != null)
				msgs = ((InternalEObject)partitionColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.RANGE_PARTITIONING__PARTITION_COLUMN, null, msgs);
			if (newPartitionColumn != null)
				msgs = ((InternalEObject)newPartitionColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.RANGE_PARTITIONING__PARTITION_COLUMN, null, msgs);
			msgs = basicSetPartitionColumn(newPartitionColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RANGE_PARTITIONING__PARTITION_COLUMN, newPartitionColumn, newPartitionColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RangePartition> getPartition() {
		if (partition == null) {
			partition = new EObjectContainmentEList<RangePartition>(RangePartition.class, this, OrmPackage.RANGE_PARTITIONING__PARTITION);
		}
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RANGE_PARTITIONING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartitionValueType() {
		return partitionValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionValueType(String newPartitionValueType) {
		String oldPartitionValueType = partitionValueType;
		partitionValueType = newPartitionValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RANGE_PARTITIONING__PARTITION_VALUE_TYPE, oldPartitionValueType, partitionValueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnionUnpartitionableQueries() {
		return unionUnpartitionableQueries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnionUnpartitionableQueries(boolean newUnionUnpartitionableQueries) {
		boolean oldUnionUnpartitionableQueries = unionUnpartitionableQueries;
		unionUnpartitionableQueries = newUnionUnpartitionableQueries;
		boolean oldUnionUnpartitionableQueriesESet = unionUnpartitionableQueriesESet;
		unionUnpartitionableQueriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RANGE_PARTITIONING__UNION_UNPARTITIONABLE_QUERIES, oldUnionUnpartitionableQueries, unionUnpartitionableQueries, !oldUnionUnpartitionableQueriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnionUnpartitionableQueries() {
		boolean oldUnionUnpartitionableQueries = unionUnpartitionableQueries;
		boolean oldUnionUnpartitionableQueriesESet = unionUnpartitionableQueriesESet;
		unionUnpartitionableQueries = UNION_UNPARTITIONABLE_QUERIES_EDEFAULT;
		unionUnpartitionableQueriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.RANGE_PARTITIONING__UNION_UNPARTITIONABLE_QUERIES, oldUnionUnpartitionableQueries, UNION_UNPARTITIONABLE_QUERIES_EDEFAULT, oldUnionUnpartitionableQueriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnionUnpartitionableQueries() {
		return unionUnpartitionableQueriesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.RANGE_PARTITIONING__PARTITION_COLUMN:
				return basicSetPartitionColumn(null, msgs);
			case OrmPackage.RANGE_PARTITIONING__PARTITION:
				return ((InternalEList<?>)getPartition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrmPackage.RANGE_PARTITIONING__PARTITION_COLUMN:
				return getPartitionColumn();
			case OrmPackage.RANGE_PARTITIONING__PARTITION:
				return getPartition();
			case OrmPackage.RANGE_PARTITIONING__NAME:
				return getName();
			case OrmPackage.RANGE_PARTITIONING__PARTITION_VALUE_TYPE:
				return getPartitionValueType();
			case OrmPackage.RANGE_PARTITIONING__UNION_UNPARTITIONABLE_QUERIES:
				return isUnionUnpartitionableQueries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrmPackage.RANGE_PARTITIONING__PARTITION_COLUMN:
				setPartitionColumn((Column)newValue);
				return;
			case OrmPackage.RANGE_PARTITIONING__PARTITION:
				getPartition().clear();
				getPartition().addAll((Collection<? extends RangePartition>)newValue);
				return;
			case OrmPackage.RANGE_PARTITIONING__NAME:
				setName((String)newValue);
				return;
			case OrmPackage.RANGE_PARTITIONING__PARTITION_VALUE_TYPE:
				setPartitionValueType((String)newValue);
				return;
			case OrmPackage.RANGE_PARTITIONING__UNION_UNPARTITIONABLE_QUERIES:
				setUnionUnpartitionableQueries((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OrmPackage.RANGE_PARTITIONING__PARTITION_COLUMN:
				setPartitionColumn((Column)null);
				return;
			case OrmPackage.RANGE_PARTITIONING__PARTITION:
				getPartition().clear();
				return;
			case OrmPackage.RANGE_PARTITIONING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OrmPackage.RANGE_PARTITIONING__PARTITION_VALUE_TYPE:
				setPartitionValueType(PARTITION_VALUE_TYPE_EDEFAULT);
				return;
			case OrmPackage.RANGE_PARTITIONING__UNION_UNPARTITIONABLE_QUERIES:
				unsetUnionUnpartitionableQueries();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrmPackage.RANGE_PARTITIONING__PARTITION_COLUMN:
				return partitionColumn != null;
			case OrmPackage.RANGE_PARTITIONING__PARTITION:
				return partition != null && !partition.isEmpty();
			case OrmPackage.RANGE_PARTITIONING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OrmPackage.RANGE_PARTITIONING__PARTITION_VALUE_TYPE:
				return PARTITION_VALUE_TYPE_EDEFAULT == null ? partitionValueType != null : !PARTITION_VALUE_TYPE_EDEFAULT.equals(partitionValueType);
			case OrmPackage.RANGE_PARTITIONING__UNION_UNPARTITIONABLE_QUERIES:
				return isSetUnionUnpartitionableQueries();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", partitionValueType: ");
		result.append(partitionValueType);
		result.append(", unionUnpartitionableQueries: ");
		if (unionUnpartitionableQueriesESet) result.append(unionUnpartitionableQueries); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RangePartitioningImpl
