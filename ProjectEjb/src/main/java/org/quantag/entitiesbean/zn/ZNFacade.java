package org.quantag.entitiesbean.zn;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.quantag.entitiesbean.AbstractFacade;
import org.quantag.entity.EntityZN;



/**
 * Facade for zn locale.
 *
 */
@Stateless
@LocalBean
public class ZNFacade extends AbstractFacade<EntityZN> implements	ZNFacadeLocal {

	@PersistenceContext(unitName = "JDBC")
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public ZNFacade() {
		super(EntityZN.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}





}
