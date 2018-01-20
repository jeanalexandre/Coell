package com.coell.Coell.repository;

import com.coell.Coell.model.Langue;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LangueRepository extends CrudRepository<Langue, Long> {
	
	List<Langue> findByNomLangue(String nom);

}
