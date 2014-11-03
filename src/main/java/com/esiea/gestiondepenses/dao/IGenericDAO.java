package com.esiea.gestiondepenses.dao;

public interface IGenericDAO<T> {
	//Cr�ation d'un methode g�n�rike create de type T
	public T create(final T entity);
	
	public T find(final int id);
	
	public void delete(final int id);
	
	public T update(final T entity);

}
