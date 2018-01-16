package com.jerome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jerome.model.IdeeGlobal;
import com.jerome.repository.IdeeGlobalRepository;

@RestController
public class IdeeGlobalController {

	@Autowired
	IdeeGlobalRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/IdeeGlobal")
    public Iterable<IdeeGlobal> findAll() {
    	Iterable<IdeeGlobal> articles= repo.findAll();
    	return articles;
    }
    

}
