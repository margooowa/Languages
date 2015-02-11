package org.quantag.entitiesbean.zn;

import java.util.List;

import javax.ejb.Local;

import org.quantag.entity.EntityZN;

/**
 * Interface facade. 
 *
 */
@Local
public interface ZNFacadeLocal {

	void create(EntityZN locale);

	void edit(EntityZN locale);

	void remove(EntityZN locale);

	void removeById(int id);

	List<EntityZN> findAll() throws Exception;
	
	EntityZN find(int id);

}
