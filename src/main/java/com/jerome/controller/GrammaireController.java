package com.jerome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jerome.model.Grammaire;
import com.jerome.repository.GrammaireRepository;

@RestController
public class GrammaireController {

	@Autowired
	GrammaireRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/Grammaire")
    public Iterable<Grammaire> findAll() {
    	Iterable<Grammaire> articles= repo.findAll();
    	return articles;
    }
    

}
