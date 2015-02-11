package org.quantag.entitiesbean.fr;

import java.util.List;

import javax.ejb.Local;

import org.quantag.entity.EntityFR;

/**
 * Interface facade. 
 *
 */
@Local
public interface FRFacadeLocal {

	void create(EntityFR locale);

	void edit(EntityFR locale);

	void remove(EntityFR locale);

	void removeById(int id);

	List<EntityFR> findAll() throws Exception;

}
