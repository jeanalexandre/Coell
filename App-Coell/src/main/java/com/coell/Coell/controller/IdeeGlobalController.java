package com.coell.Coell.controller;

import com.coell.Coell.model.IdeeGlobal;
import com.coell.Coell.repository.IdeeGlobalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdeeGlobalController {

	@Autowired
	IdeeGlobalRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/idee-global")
    public Iterable<IdeeGlobal> findAll() {
    	Iterable<IdeeGlobal> articles= repo.findAll();
    	return articles;
    }
    

}
