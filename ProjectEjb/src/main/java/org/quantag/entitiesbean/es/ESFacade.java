package org.quantag.entitiesbean.es;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.quantag.entitiesbean.AbstractFacade;
import org.quantag.entity.EntityES;



/**
 * Facade for es locale.
 *
 */
@Stateless
@LocalBean
public class ESFacade extends AbstractFacade<EntityES> implements ESFacadeLocal {

	@PersistenceContext(unitName = "JDBC")
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public ESFacade() {
		super(EntityES.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}





}
