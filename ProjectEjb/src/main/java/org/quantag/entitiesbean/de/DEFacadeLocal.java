package org.quantag.entitiesbean.de;

import java.util.List;

import javax.ejb.Local;

import org.quantag.entity.EntityDE;


/**
 * Facade interface.
 *
 */
@Local
public interface DEFacadeLocal {

	void create(EntityDE locale);

	void edit(EntityDE locale);

	void remove(EntityDE locale);

	void removeById(int id);

	List<EntityDE> findAll() throws Exception;
	
	EntityDE find(int id);

}
