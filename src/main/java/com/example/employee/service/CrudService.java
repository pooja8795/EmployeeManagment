package com.example.employee.service;

import java.util.Set;

public interface CrudService<T, ID> {
	
	Set<T> findAll();
	
	T findById(ID id);
	// Object can be anything
	T save(T object);
	
	void deleteAll();
	void deleteById(ID id);

	String retrieveMessage();



}
