package com.esiea.gestiondepenses.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.esiea.gestiondepenses.dao.IGenericDAO;

public class GenericDAOImpl<T> implements IGenericDAO<T> {
	
	//PersistenceContext permet de dire à Spring k'il faut injecter un Entity Manager.
	@PersistenceContext
	protected EntityManager entityManager;
	
	
	@Override
	public T create(T entity) {
	
		
		return null;
	}

	@Override
	public T find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T update(T entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Le set permet d'affecter em crée par Spring au préalable à la variable de classe entityManager.
	public void setEntityManager(EntityManager em) {
		this.entityManager = em;
	}
	
	
	

}
