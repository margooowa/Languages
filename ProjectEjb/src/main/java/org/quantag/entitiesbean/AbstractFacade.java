package org.quantag.entitiesbean;

import java.util.List;

import javax.persistence.EntityManager;

/**
 * Abstact facade. 
 * 
 * @param <T>
 */
public abstract class AbstractFacade<T> {

	private Class<T> entityClass;

	public AbstractFacade(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	protected abstract EntityManager getEntityManager();

	public void create(T entity) {
		getEntityManager().persist(entity);
	}

	public void edit(T entity) {
		getEntityManager().merge(entity);
	}

	public void remove(T entity) {
		getEntityManager().remove(getEntityManager().merge(entity));
	}

	public void removeById(int id) {
		T entity = find(id);
		getEntityManager().remove(getEntityManager().merge(entity));
	}

	public T find(int id) {
		return getEntityManager().find(entityClass, id);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<T> findAll() {
		javax.persistence.criteria.CriteriaQuery cq = getEntityManager()				.getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));
		return getEntityManager().createQuery(cq).getResultList();
	}

}
