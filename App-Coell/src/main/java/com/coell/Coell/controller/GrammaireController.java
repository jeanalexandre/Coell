package com.coell.Coell.controller;

import com.coell.Coell.model.Grammaire;
import com.coell.Coell.repository.GrammaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrammaireController {

	@Autowired
	GrammaireRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/grammaire")
    public Iterable<Grammaire> findAll() {
    	Iterable<Grammaire> articles= repo.findAll();
    	return articles;
    }
    

}
