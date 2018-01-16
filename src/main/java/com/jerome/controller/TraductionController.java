package com.jerome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jerome.model.Traduction;
import com.jerome.repository.TraductionRepository;

@RestController
public class TraductionController {

	@Autowired
	TraductionRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/Traduction")
    public Iterable<Traduction> findAll() {
    	Iterable<Traduction> articles= repo.findAll();
    	return articles;
    }
    

}
