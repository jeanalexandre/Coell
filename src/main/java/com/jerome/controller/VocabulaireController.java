package com.jerome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jerome.model.Vocabulaire;
import com.jerome.repository.VocabulaireRepository;

@RestController
public class VocabulaireController {

	@Autowired
	VocabulaireRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/Vocabulaire")
    public Iterable<Vocabulaire> findAll() {
    	Iterable<Vocabulaire> articles= repo.findAll();
    	return articles;
    }
    

}
