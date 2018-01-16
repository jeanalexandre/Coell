package com.jerome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jerome.model.Langue;
import com.jerome.repository.LangueRepository;

@RestController
public class LangueController {

	@Autowired
	LangueRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/Langue")
    public Iterable<Langue> findAll() {
    	Iterable<Langue> articles= repo.findAll();
    	return articles;
    }
    

}
