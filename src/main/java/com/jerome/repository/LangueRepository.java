package com.jerome.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jerome.model.Langue;

public interface LangueRepository extends CrudRepository<Langue, Long> {
	
	List<Langue> findByNomlangue(String nom);

}
