package com.coell.Coell.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="vocabulaire")
public class Vocabulaire {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long idVocabulaire;

 private String mot;
 
 private String definition;
 
 @JsonIgnore
 @OneToOne
 @PrimaryKeyJoinColumn
 private Analyse analyse;

	public Vocabulaire() {
		super();
	}

	public Vocabulaire(Long idVocabulaire, String mot, String definition, Analyse analyse) {
		super();
		this.idVocabulaire = idVocabulaire;
		this.mot = mot;
		this.definition = definition;
		this.analyse = analyse;
	}

	public Long getIdVocabulaire() {
		return idVocabulaire;
	}

	public void setIdVocabulaire(Long idVocabulaire) {
		this.idVocabulaire = idVocabulaire;
	}

	public String getMot() {
		return mot;
	}

	public void setMot(String mot) {
		this.mot = mot;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public Analyse getAnalyse() {
		return analyse;
	}

	public void setAnalyse(Analyse analyse) {
		this.analyse = analyse;
	}


 }