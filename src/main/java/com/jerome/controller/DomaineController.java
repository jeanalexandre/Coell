package com.jerome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jerome.model.Domaine;
import com.jerome.repository.DomaineRepository;

@RestController
public class DomaineController {

	@Autowired
	DomaineRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/domaine")
    public Iterable<Domaine> findAll() {
    	Iterable<Domaine> articles= repo.findAll();
    	return articles;
    }
    

}
