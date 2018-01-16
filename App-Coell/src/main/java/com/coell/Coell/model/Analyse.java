package com.coell.Coell.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Analyse {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ANALYSE_SEQ")
  @SequenceGenerator(sequenceName = "analyse_seq", initialValue = 1, allocationSize = 1, name = "ANALYSE_SEQ")
  private Long idanalyse;

  private String argumentation;
  private double vocabulaireScore; 
  private double traductionScore;
  private double grammaireScore;
  private double ideeGlobalScore;
  private double analyseScore;
  
  @ManyToOne
  private Utilisateur utilisateur;
  
  @ManyToOne
  private Langue langue;

  @ManyToOne
  private Article article;
  
  @OneToOne(mappedBy="analyse") 
  private Traduction traduction;
  
  @OneToOne(mappedBy="analyse") 
  private Grammaire grammaire;
  
  @OneToOne(mappedBy="analyse", fetch = FetchType.EAGER)
  private IdeeGlobal ideeglobal;

  @OneToOne(mappedBy="analyse") 
  private Vocabulaire vocabulaire;
  
  @OneToOne(mappedBy="analyse") 
  private LienExterne lienExterne;

	public Analyse() {
		super();
	}

	public Analyse(Long idanalyse, String argumentation, double vocabulaireScore, double traductionScore,
			double grammaireScore, double ideeGlobalScore, double analyseScore, Utilisateur utilisateur, Langue langue,
			Article article) {
		super();
		this.idanalyse = idanalyse;
		this.argumentation = argumentation;
		this.vocabulaireScore = vocabulaireScore;
		this.traductionScore = traductionScore;
		this.grammaireScore = grammaireScore;
		this.ideeGlobalScore = ideeGlobalScore;
		this.analyseScore = analyseScore;
		this.utilisateur = utilisateur;
		this.langue = langue;
		this.article = article;
	}

	public Long getIdanalyse() {
		return idanalyse;
	}

	public void setIdanalyse(Long idanalyse) {
		this.idanalyse = idanalyse;
	}

	public String getArgumentation() {
		return argumentation;
	}

	public void setArgumentation(String argumentation) {
		this.argumentation = argumentation;
	}

	public double getVocabulaireScore() {
		return vocabulaireScore;
	}

	public void setVocabulaireScore(double vocabulaireScore) {
		this.vocabulaireScore = vocabulaireScore;
	}

	public double getTraductionScore() {
		return traductionScore;
	}

	public void setTraductionScore(double traductionScore) {
		this.traductionScore = traductionScore;
	}

	public double getGrammaireScore() {
		return grammaireScore;
	}

	public void setGrammaireScore(double grammaireScore) {
		this.grammaireScore = grammaireScore;
	}

	public double getIdeeGlobalScore() {
		return ideeGlobalScore;
	}

	public void setIdeeGlobalScore(double ideeGlobalScore) {
		this.ideeGlobalScore = ideeGlobalScore;
	}

	public double getAnalyseScore() {
		return analyseScore;
	}

	public void setAnalyseScore(double analyseScore) {
		this.analyseScore = analyseScore;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Langue getLangue() {
		return langue;
	}

	public void setLangue(Langue langue) {
		this.langue = langue;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Traduction getTraduction() {
		return traduction;
	}

	public void setTraduction(Traduction traduction) {
		this.traduction = traduction;
	}

	public Grammaire getGrammaire() {
		return grammaire;
	}

	public void setGrammaire(Grammaire grammaire) {
		this.grammaire = grammaire;
	}

	public IdeeGlobal getIdeeGlobal() {
		return ideeglobal;
	}

	public void setIdeeGlobal(IdeeGlobal ideeglobal) {
		this.ideeglobal = ideeglobal;
	}

	public Vocabulaire getVocabulaire() {
		return vocabulaire;
	}

	public void setVocabulaire(Vocabulaire vocabulaire) {
		this.vocabulaire = vocabulaire;
	}

	public LienExterne getLienExterne() {
		return lienExterne;
	}

	public void setLienExterne(LienExterne lienExterne) {
		this.lienExterne = lienExterne;
	}
	
	

  
 }