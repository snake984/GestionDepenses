package com.esiea.gestiondepenses.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esiea.gestiondepenses.dao.IGenericDAO;

public abstract class GenericDAOImpl<T> implements IGenericDAO<T> {
	
	//PersistenceContext permet de dire à Spring k'il faut injecter un Entity Manager.
	@PersistenceContext
	protected EntityManager entityManager;
	
	// permet de récupérer les informations sur la classe de l'entité représenté par T (par exemple : AccountHolder)
	private Class<T> entityClass;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GenericDAOImpl() {
		ParameterizedType pt = (ParameterizedType) getClass().getGenericSuperclass();
        entityClass = (Class) pt.getActualTypeArguments()[0];
    }
	
	@Override
	public T create(T entity) {
		entityManager.persist(entity);
		return entity;
	}

	@Override
	public T find(int id) {
		return (T) this.entityManager.find(entityClass, id);
	}

	@Override
	public void delete(int id) {
		entityManager.remove(entityManager.getReference(entityClass, id));
		
	}

	@Override
	public T update(T entity) {
		return entityManager.merge(entity);
	}

}
