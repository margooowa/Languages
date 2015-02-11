package org.quantag.entitiesbean.es;

import java.util.List;

import javax.ejb.Local;

import org.quantag.entity.EntityES;

/**
 * Interface facade. 
 *
 */
@Local
public interface ESFacadeLocal {

	void create(EntityES locale);

	void edit(EntityES locale);

	void remove(EntityES locale);

	void removeById(int id);

	List<EntityES> findAll() throws Exception;

}
