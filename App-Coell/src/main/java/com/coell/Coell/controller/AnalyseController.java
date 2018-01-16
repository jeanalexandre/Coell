package com.coell.Coell.controller;

import com.coell.Coell.model.Analyse;
import com.coell.Coell.repository.AnalyseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyseController {

	@Autowired
    AnalyseRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/analyse")
    public Iterable<Analyse> findAll() {
    	Iterable<Analyse> articles= repo.findAll();
    	return articles;
    }
    

}
