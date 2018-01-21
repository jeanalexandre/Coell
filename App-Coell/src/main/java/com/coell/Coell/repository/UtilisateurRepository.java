package com.coell.Coell.repository;


import com.coell.Coell.model.Utilisateur;
import org.springframework.data.repository.CrudRepository;

import javax.rmi.CORBA.Util;
import java.util.List;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {

	List<Utilisateur> findUtilisateurByNom(String nom);

	List<Utilisateur> findUtilisateurByMail(String mail);

}
