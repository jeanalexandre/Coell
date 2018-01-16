package com.jerome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jerome.model.Analyse;
import com.jerome.repository.AnalyseRepository;

@RestController
public class AnalyseController {

	@Autowired
	AnalyseRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/Analyse")
    public Iterable<Analyse> findAll() {
    	Iterable<Analyse> articles= repo.findAll();
    	return articles;
    }
    

}
