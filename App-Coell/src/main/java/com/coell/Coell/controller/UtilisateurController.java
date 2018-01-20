package com.coell.Coell.controller;

import com.coell.Coell.model.Utilisateur;
import com.coell.Coell.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
