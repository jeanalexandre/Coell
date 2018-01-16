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
public class LienExterne {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIENEXTERNE_SEQ")
  @SequenceGenerator(sequenceName = "lienexterne_seq", initialValue = 1, allocationSize = 1, name = "LIENEXTERNE_SEQ")
  private Long idlienexterne;

 private String lien1;
 
 private String lien2;
 
 private String lien3;
 
 private String lien4;
 
 private String lien5;
 
 @JsonIgnore
 @OneToOne
 @PrimaryKeyJoinColumn 
 private Analyse analyse;

	public LienExterne() {
		super();
	}

	public LienExterne(Long idlienexterne, String lien1, String lien2, String lien3, String lien4, String lien5,
			Analyse analyse) {
		super();
		this.idlienexterne = idlienexterne;
		this.lien1 = lien1;
		this.lien2 = lien2;
		this.lien3 = lien3;
		this.lien4 = lien4;
		this.lien5 = lien5;
		this.analyse = analyse;
	}

	public Long getIdlienexterne() {
		return idlienexterne;
	}

	public void setIdlienexterne(Long idlienexterne) {
		this.idlienexterne = idlienexterne;
	}

	public String getLien1() {
		return lien1;
	}

	public void setLien1(String lien1) {
		this.lien1 = lien1;
	}

	public String getLien2() {
		return lien2;
	}

	public void setLien2(String lien2) {
		this.lien2 = lien2;
	}

	public String getLien3() {
		return lien3;
	}

	public void setLien3(String lien3) {
		this.lien3 = lien3;
	}

	public String getLien4() {
		return lien4;
	}

	public void setLien4(String lien4) {
		this.lien4 = lien4;
	}

	public String getLien5() {
		return lien5;
	}

	public void setLien5(String lien5) {
		this.lien5 = lien5;
	}

	public Analyse getAnalyse() {
		return analyse;
	}

	public void setAnalyse(Analyse analyse) {
		this.analyse = analyse;
	}

	
  
 }