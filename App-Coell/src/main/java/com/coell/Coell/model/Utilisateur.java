package com.coell.Coell.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

@Entity
@Table(name="utilisateur")
public class Utilisateur {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long idUtilisateur;

  @NotNull
  private String nom;

  @NotNull
  private String prenom;

  @NotNull
  private String mail;

  @NotNull
  private String password;

  @NotNull
  private int role;

  @JsonIgnore
  @OneToMany(mappedBy="utilisateur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Article> article;

  @JsonIgnore
  @OneToMany(mappedBy="utilisateur", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Analyse> analyse;
  

	public Utilisateur() {
		super();
	}


	public Utilisateur(Long idUtilisateur, String nom, String prenom, String mail, String password, int role,
					   List<Article> article, List<Analyse> analyse) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.password = password;
		this.role = role;
		this.article = article;
		this.analyse = analyse;
	}


	public Long getIdUtilisateur() {
		return idUtilisateur;
	}


	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getRole() {
		return role;
	}


	public void setRole(int role) {
		this.role = role;
	}


	public List<Article> getArticle() {
		return article;
	}


	public void setArticle(List<Article> article) {
		this.article = article;
	}


	public List<Analyse> getAnalyse() {
		return analyse;
	}


	public void setAnalyse(List<Analyse> analyse) {
		this.analyse = analyse;
	}


  
 }