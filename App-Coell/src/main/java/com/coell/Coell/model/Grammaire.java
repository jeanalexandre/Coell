package com.coell.Coell.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Grammaire {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GRAMMAIRE_SEQ")
  @SequenceGenerator(sequenceName = "grammaire_seq", initialValue = 1, allocationSize = 1, name = "GRAMMAIRE_SEQ")
  private Long idgrammaire;

 private String phrase1;
 
 private String analyse1;
 
 private String phrase2;
 
 private String analyse2;
 
 private String phrase3;
 
 private String analyse3;
 
 private String phrase4;
 
 private String analyse4;
 
 private String phrase5;
 
 private String analyse5;
 
 @JsonIgnore
 @OneToOne
 @PrimaryKeyJoinColumn 
 private Analyse analyse;

	public Grammaire() {
		super();
	}

	public Grammaire(Long idgrammaire, String phrase1, String analyse1, String phrase2, String analyse2, String phrase3,
			String analyse3, String phrase4, String analyse4, String phrase5, String analyse5, Analyse analyse) {
		super();
		this.idgrammaire = idgrammaire;
		this.phrase1 = phrase1;
		this.analyse1 = analyse1;
		this.phrase2 = phrase2;
		this.analyse2 = analyse2;
		this.phrase3 = phrase3;
		this.analyse3 = analyse3;
		this.phrase4 = phrase4;
		this.analyse4 = analyse4;
		this.phrase5 = phrase5;
		this.analyse5 = analyse5;
		this.analyse = analyse;
	}

	public Long getIdgrammaire() {
		return idgrammaire;
	}

	public void setIdgrammaire(Long idgrammaire) {
		this.idgrammaire = idgrammaire;
	}

	public String getPhrase1() {
		return phrase1;
	}

	public void setPhrase1(String phrase1) {
		this.phrase1 = phrase1;
	}

	public String getAnalyse1() {
		return analyse1;
	}

	public void setAnalyse1(String analyse1) {
		this.analyse1 = analyse1;
	}

	public String getPhrase2() {
		return phrase2;
	}

	public void setPhrase2(String phrase2) {
		this.phrase2 = phrase2;
	}

	public String getAnalyse2() {
		return analyse2;
	}

	public void setAnalyse2(String analyse2) {
		this.analyse2 = analyse2;
	}

	public String getPhrase3() {
		return phrase3;
	}

	public void setPhrase3(String phrase3) {
		this.phrase3 = phrase3;
	}

	public String getAnalyse3() {
		return analyse3;
	}

	public void setAnalyse3(String analyse3) {
		this.analyse3 = analyse3;
	}

	public String getPhrase4() {
		return phrase4;
	}

	public void setPhrase4(String phrase4) {
		this.phrase4 = phrase4;
	}

	public String getAnalyse4() {
		return analyse4;
	}

	public void setAnalyse4(String analyse4) {
		this.analyse4 = analyse4;
	}

	public String getPhrase5() {
		return phrase5;
	}

	public void setPhrase5(String phrase5) {
		this.phrase5 = phrase5;
	}

	public String getAnalyse5() {
		return analyse5;
	}

	public void setAnalyse5(String analyse5) {
		this.analyse5 = analyse5;
	}

	public Analyse getAnalyse() {
		return analyse;
	}

	public void setAnalyse(Analyse analyse) {
		this.analyse = analyse;
	}

 }