package com.coell.Coell.controller;

import com.coell.Coell.model.Vocabulaire;
import com.coell.Coell.repository.VocabulaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VocabulaireController {

	@Autowired
	VocabulaireRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/vocabulaire")
    public Iterable<Vocabulaire> findAll() {
    	Iterable<Vocabulaire> articles= repo.findAll();
    	return articles;
    }
    

}
