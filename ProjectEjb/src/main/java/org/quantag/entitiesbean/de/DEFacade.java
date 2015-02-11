package org.quantag.entitiesbean.de;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.quantag.entitiesbean.AbstractFacade;
import org.quantag.entity.EntityDE;



/**
 * Facade for de locale.
 */
@Stateless
@LocalBean
public class DEFacade extends AbstractFacade<EntityDE> implements	DEFacadeLocal {

	@PersistenceContext(unitName = "JDBC")
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public DEFacade() {
		super(EntityDE.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}





}
