/**
 * <copyright>
 * </copyright>
 *
 * $Id: MapKeyJoinColumnItemProvider.java,v 1.4 2011/08/25 15:03:09 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class MapKeyJoinColumnItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public MapKeyJoinColumnItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addColumnDefinitionPropertyDescriptor(object);
			addInsertablePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNullablePropertyDescriptor(object);
			addReferencedColumnNamePropertyDescriptor(object);
			addTablePropertyDescriptor(object);
			addUniquePropertyDescriptor(object);
			addUpdatablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Column Definition feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addColumnDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapKeyJoinColumn_columnDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapKeyJoinColumn_columnDefinition_feature", "_UI_MapKeyJoinColumn_type"),
				 OrmPackage.eINSTANCE.getMapKeyJoinColumn_ColumnDefinition(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Insertable feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addInsertablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapKeyJoinColumn_insertable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapKeyJoinColumn_insertable_feature", "_UI_MapKeyJoinColumn_type"),
				 OrmPackage.eINSTANCE.getMapKeyJoinColumn_Insertable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapKeyJoinColumn_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapKeyJoinColumn_name_feature", "_UI_MapKeyJoinColumn_type"),
				 OrmPackage.eINSTANCE.getMapKeyJoinColumn_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Nullable feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addNullablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapKeyJoinColumn_nullable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapKeyJoinColumn_nullable_feature", "_UI_MapKeyJoinColumn_type"),
				 OrmPackage.eINSTANCE.getMapKeyJoinColumn_Nullable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
   * This adds a property descriptor for the Referenced Column Name feature. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  protected void addReferencedColumnNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapKeyJoinColumn_referencedColumnName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapKeyJoinColumn_referencedColumnName_feature", "_UI_MapKeyJoinColumn_type"),
				 OrmPackage.eINSTANCE.getMapKeyJoinColumn_ReferencedColumnName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Table feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapKeyJoinColumn_table_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapKeyJoinColumn_table_feature", "_UI_MapKeyJoinColumn_type"),
				 OrmPackage.eINSTANCE.getMapKeyJoinColumn_Table(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Unique feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapKeyJoinColumn_unique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapKeyJoinColumn_unique_feature", "_UI_MapKeyJoinColumn_type"),
				 OrmPackage.eINSTANCE.getMapKeyJoinColumn_Unique(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Updatable feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected void addUpdatablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapKeyJoinColumn_updatable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapKeyJoinColumn_updatable_feature", "_UI_MapKeyJoinColumn_type"),
				 OrmPackage.eINSTANCE.getMapKeyJoinColumn_Updatable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This returns MapKeyJoinColumn.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MapKeyJoinColumn"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object) {
		String label = ((MapKeyJoinColumn)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MapKeyJoinColumn_type") :
			getString("_UI_MapKeyJoinColumn_type") + " " + label;
	}

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MapKeyJoinColumn.class)) {
			case OrmPackage.MAP_KEY_JOIN_COLUMN__COLUMN_DEFINITION:
			case OrmPackage.MAP_KEY_JOIN_COLUMN__INSERTABLE:
			case OrmPackage.MAP_KEY_JOIN_COLUMN__NAME:
			case OrmPackage.MAP_KEY_JOIN_COLUMN__NULLABLE:
			case OrmPackage.MAP_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME:
			case OrmPackage.MAP_KEY_JOIN_COLUMN__TABLE:
			case OrmPackage.MAP_KEY_JOIN_COLUMN__UNIQUE:
			case OrmPackage.MAP_KEY_JOIN_COLUMN__UPDATABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

  /**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

  /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator() {
		return Eclipselink_ormEditPlugin.INSTANCE;
	}

}
