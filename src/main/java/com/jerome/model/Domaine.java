package com.jerome.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Domaine {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DOMAINE_SEQ")
  @SequenceGenerator(sequenceName = "domaine_seq", initialValue = 1, allocationSize = 1, name = "DOMAINE_SEQ")
  private Long iddomaine;

  private String nom;
  
  private String description;
  
  @JsonIgnore
  @OneToMany(mappedBy="domaine", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Article> article;

	public Domaine() {
		super();
	}

	public Domaine(Long iddomaine, String nom, String description, List<Article> article) {
		super();
		this.iddomaine = iddomaine;
		this.nom = nom;
		this.description = description;
		this.article = article;
	}

	public Long getIddomaine() {
		return iddomaine;
	}

	public void setIddomaine(Long iddomaine) {
		this.iddomaine = iddomaine;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Article> getArticle() {
		return article;
	}

	public void setArticle(List<Article> article) {
		this.article = article;
	}
	
	
 }