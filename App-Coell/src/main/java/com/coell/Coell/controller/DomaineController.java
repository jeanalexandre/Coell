package com.coell.Coell.controller;

import com.coell.Coell.model.Domaine;
import com.coell.Coell.repository.DomaineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
