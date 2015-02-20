package org.quantag.entitiesbean.userdata;

import java.util.List;

import javax.ejb.Local;

import org.quantag.entity.EntityDE;
import org.quantag.entity.EntityUserdata;


/**
 * Facade interface.
 *
 */
@Local
public interface UserDataFacadeLocal {

	void create(EntityUserdata data);

	void edit(EntityUserdata data);

	void remove(EntityUserdata data);

	void removeById(int id);

	List<EntityUserdata> findAll() throws Exception;
	
	EntityUserdata find(int id);

}
