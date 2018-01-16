package com.jerome.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jerome.model.Analyse;

public interface AnalyseRepository extends CrudRepository<Analyse, Long> {
	
	List<Analyse> findByArgumentation(String arg);

}
