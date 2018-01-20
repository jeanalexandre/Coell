package com.coell.Coell.controller;

import com.coell.Coell.model.LienExterne;
import com.coell.Coell.repository.LienExterneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LienExterneController {

	@Autowired
	LienExterneRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/lien-externe")
    public Iterable<LienExterne> findAll() {
    	Iterable<LienExterne> articles= repo.findAll();
    	return articles;
    }
    

}
