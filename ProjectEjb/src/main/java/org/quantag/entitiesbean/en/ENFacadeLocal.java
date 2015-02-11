package org.quantag.entitiesbean.en;

import java.util.List;

import javax.ejb.Local;

import org.quantag.entity.EntityEN;

/**
 * Interface facade. 
 *
 */
@Local
public interface ENFacadeLocal {

	void create(EntityEN locale);

	void edit(EntityEN locale);

	void remove(EntityEN locale);

	void removeById(int id);

	List<EntityEN> findAll() throws Exception;

}
