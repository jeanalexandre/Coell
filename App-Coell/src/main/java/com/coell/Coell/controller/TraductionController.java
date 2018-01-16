package com.coell.Coell.controller;

import com.coell.Coell.model.Traduction;
import com.coell.Coell.repository.TraductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TraductionController {

	@Autowired
	TraductionRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/traduction")
    public Iterable<Traduction> findAll() {
    	Iterable<Traduction> articles= repo.findAll();
    	return articles;
    }
    

}
