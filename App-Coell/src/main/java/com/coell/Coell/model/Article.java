package com.coell.Coell.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Article {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARTICLE_SEQ")
  @SequenceGenerator(sequenceName = "article_seq", initialValue = 1, allocationSize = 1, name = "ARTICLE_SEQ")
  private Long idarticle;

  private String titre;
  
  private String contenu;
  
  private Date datepublication;
  
  private String source;
  
  @ManyToOne
  private Utilisateur utilisateur;
  
  @ManyToOne
  private Domaine domaine;
  
  @ManyToOne
  private Langue langue;
  
  @JsonIgnore
  @OneToMany(mappedBy="article", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Analyse> analyse;

	public Article() {
		super();
	}

	public Article(Long idarticle, String titre, String contenu, Date datepublication, String source,
			Utilisateur utilisateur, Domaine domaine, Langue langue, List<Analyse> analyse) {
		super();
		this.idarticle = idarticle;
		this.titre = titre;
		this.contenu = contenu;
		this.datepublication = datepublication;
		this.source = source;
		this.utilisateur = utilisateur;
		this.domaine = domaine;
		this.langue = langue;
		this.analyse = analyse;
	}

	public Long getIdarticle() {
		return idarticle;
	}

	public void setIdarticle(Long idarticle) {
		this.idarticle = idarticle;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Date getDatepublication() {
		return datepublication;
	}

	public void setDatepublication(Date datepublication) {
		this.datepublication = datepublication;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Domaine getDomaine() {
		return domaine;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}

	public Langue getLangue() {
		return langue;
	}

	public void setLangue(Langue langue) {
		this.langue = langue;
	}

	public List<Analyse> getAnalyse() {
		return analyse;
	}

	public void setAnalyse(List<Analyse> analyse) {
		this.analyse = analyse;
	}


 }