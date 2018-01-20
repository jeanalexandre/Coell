package com.coell.Coell.controller;

import com.coell.Coell.model.Langue;
import com.coell.Coell.repository.LangueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LangueController {

	@Autowired
	LangueRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/langue")
    public Iterable<Langue> findAll() {
    	Iterable<Langue> articles= repo.findAll();
    	return articles;
    }
    

}
