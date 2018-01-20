package com.coell.Coell.repository;


import com.coell.Coell.model.Analyse;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnalyseRepository extends CrudRepository<Analyse, Long> {
	
	List<Analyse> findByArgumentation(String arg);

}
