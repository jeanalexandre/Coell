package com.coell.Coell.repository;


import com.coell.Coell.model.Utilisateur;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {
	
	List<Utilisateur> findByNom(String nom);

}
