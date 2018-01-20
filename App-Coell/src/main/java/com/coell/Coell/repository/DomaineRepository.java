package com.coell.Coell.repository;

import com.coell.Coell.model.Domaine;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DomaineRepository extends CrudRepository<Domaine, Long> {
	
	List<Domaine> findByNom(String nom);

}
