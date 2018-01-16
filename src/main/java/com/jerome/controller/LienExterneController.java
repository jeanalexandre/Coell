package com.jerome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jerome.model.LienExterne;
import com.jerome.repository.LienExterneRepository;

@RestController
public class LienExterneController {

	@Autowired
	LienExterneRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/LienExterne")
    public Iterable<LienExterne> findAll() {
    	Iterable<LienExterne> articles= repo.findAll();
    	return articles;
    }
    

}
