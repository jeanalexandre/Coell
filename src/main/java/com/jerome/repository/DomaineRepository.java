package com.jerome.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jerome.model.Domaine;

public interface DomaineRepository extends CrudRepository<Domaine, Long> {
	
	List<Domaine> findByNom(String nom);

}
