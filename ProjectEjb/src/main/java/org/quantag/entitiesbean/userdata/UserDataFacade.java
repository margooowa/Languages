package org.quantag.entitiesbean.userdata;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.quantag.entitiesbean.AbstractFacade;
import org.quantag.entity.EntityDE;
import org.quantag.entity.EntityUserdata;



/**
 * Facade for de locale.
 */
@Stateless
@LocalBean
public class UserDataFacade extends AbstractFacade<EntityUserdata> implements	UserDataFacadeLocal {

	@PersistenceContext(unitName = "JDBC")
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public UserDataFacade() {
		super(EntityUserdata.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}





}
