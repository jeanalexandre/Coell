package com.jerome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jerome.model.Utilisateur;
import com.jerome.repository.UtilisateurRepository;

@RestController
public class UtilisateurController {

	@Autowired
	UtilisateurRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/utilisateur")
    public Iterable<Utilisateur> findAll() {
    	Iterable<Utilisateur> users= repo.findAll();
    	return users;
    }

}
