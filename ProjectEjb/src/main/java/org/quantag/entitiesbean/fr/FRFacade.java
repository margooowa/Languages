package org.quantag.entitiesbean.fr;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.quantag.entitiesbean.AbstractFacade;
import org.quantag.entity.EntityFR;



/**
 * Facade for fr locale.
 *
 */
@Stateless
@LocalBean
public class FRFacade extends AbstractFacade<EntityFR> implements	FRFacadeLocal {

	@PersistenceContext(unitName = "JDBC")
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public FRFacade() {
		super(EntityFR.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}





}
