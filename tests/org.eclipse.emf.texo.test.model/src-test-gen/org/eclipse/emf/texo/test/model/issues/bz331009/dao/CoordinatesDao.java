package org.eclipse.emf.texo.test.model.issues.bz331009.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.issues.bz331009.Coordinates;
import org.eclipse.emf.texo.test.model.issues.bz331009.ModelModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Coordinates</b></em>'.
 * 
 * @generated
 */
public class CoordinatesDao extends BaseDao<Coordinates> {

  /**
   * @generated
   */
  @Override
  public Class<Coordinates> getEntityClass() {
    return Coordinates.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ModelModelPackage.INSTANCE.getCoordinatesEClass();
  }
}
