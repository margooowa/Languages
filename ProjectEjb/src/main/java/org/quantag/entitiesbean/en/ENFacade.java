package org.quantag.entitiesbean.en;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.quantag.entitiesbean.AbstractFacade;
import org.quantag.entity.EntityEN;



/**
 * Facade for en locale.
 *
 */
@Stateless
@LocalBean
public class ENFacade extends AbstractFacade<EntityEN> implements ENFacadeLocal {

	@PersistenceContext(unitName = "JDBC")
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public ENFacade() {
		super(EntityEN.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	


}
