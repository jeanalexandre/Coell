package com.coell.Coell.controller;

import com.coell.Coell.model.Utilisateur;
import com.coell.Coell.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.StreamSupport;

@RestController
public class UtilisateurController {

	@Autowired
	UtilisateurRepository repo;
    
    @RequestMapping(method = RequestMethod.GET, value="/utilisateur")
    public Iterable<Utilisateur> findAll() {
    	Iterable<Utilisateur> users= repo.findAll();
    	return users;
    }

    @RequestMapping(method = RequestMethod.GET, value="/utilisateur/name/{name}")
    public Utilisateur findUserByUserName(@PathVariable("name") String name){
        return StreamSupport.stream(repo.findUtilisateurByNom(name).spliterator(), false)
                .filter(user -> name.equals(user.getNom()))
                .findFirst()
                .orElse(null);
    }

    @RequestMapping(method = RequestMethod.GET, value="/utilisateur/mail/{mail}")
	public Utilisateur findUserByUserMail(@PathVariable("mail") String mail){
        return StreamSupport.stream(repo.findUtilisateurByMail(mail + ".com").spliterator(), false)
                .filter(user -> mail.equals(user.getNom()))
                .findFirst()
                .orElse(null);
	}

	public Boolean authenticate(String userName, String passWord)
	{
		Utilisateur user = findUserByUserName(userName);
		if (null!=user)
		{
			return user.getPassword().equals(passWord);
		}
		return false;
	}

}
