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
public class Traduction {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRADUCTION_SEQ")
  @SequenceGenerator(sequenceName = "traduction_seq", initialValue = 1, allocationSize = 1, name = "TRADUCTION_SEQ")
  private Long idtraduction;

 private String mot1;
 
 private String definition1;
 
 private String mot2;
 
 private String definition2;
 
 private String mot3;
 
 private String definition3;
 
 private String mot4;
 
 private String definition4;
 
 private String mot5;
 
 private String definition5;
 
 private String mot6;
 
 private String definition6;
 
 private String mot7;
 
 private String definition7;
 
 private String mot8;
 
 private String definition8;
 
 private String mot9;
 
 private String definition9;
 
 private String mot10;
 
 private String definition10;
 
 private String mot11;
 
 private String definition11;
 
 private String mot12;
 
 private String definition12;
 
 private String mot13;
 
 private String definition13;
 
 private String mot14;
 
 private String definition14;
 
 private String mot15;
 
 private String definition15;
 
 
 @JsonIgnore
 @OneToOne
 @PrimaryKeyJoinColumn
 private Analyse analyse;

	public Traduction() {
		super();
	}

	public Traduction(Long idtraduction, String mot1, String definition1, String mot2, String definition2, String mot3,
			String definition3, String mot4, String definition4, String mot5, String definition5, String mot6,
			String definition6, String mot7, String definition7, String mot8, String definition8, String mot9,
			String definition9, String mot10, String definition10, String mot11, String definition11, String mot12,
			String definition12, String mot13, String definition13, String mot14, String definition14, String mot15,
			String definition15, Analyse analyse) {
		super();
		this.idtraduction = idtraduction;
		this.mot1 = mot1;
		this.definition1 = definition1;
		this.mot2 = mot2;
		this.definition2 = definition2;
		this.mot3 = mot3;
		this.definition3 = definition3;
		this.mot4 = mot4;
		this.definition4 = definition4;
		this.mot5 = mot5;
		this.definition5 = definition5;
		this.mot6 = mot6;
		this.definition6 = definition6;
		this.mot7 = mot7;
		this.definition7 = definition7;
		this.mot8 = mot8;
		this.definition8 = definition8;
		this.mot9 = mot9;
		this.definition9 = definition9;
		this.mot10 = mot10;
		this.definition10 = definition10;
		this.mot11 = mot11;
		this.definition11 = definition11;
		this.mot12 = mot12;
		this.definition12 = definition12;
		this.mot13 = mot13;
		this.definition13 = definition13;
		this.mot14 = mot14;
		this.definition14 = definition14;
		this.mot15 = mot15;
		this.definition15 = definition15;
		this.analyse = analyse;
	}

	public Long getIdtraduction() {
		return idtraduction;
	}

	public void setIdtraduction(Long idtraduction) {
		this.idtraduction = idtraduction;
	}

	public String getMot1() {
		return mot1;
	}

	public void setMot1(String mot1) {
		this.mot1 = mot1;
	}

	public String getDefinition1() {
		return definition1;
	}

	public void setDefinition1(String definition1) {
		this.definition1 = definition1;
	}

	public String getMot2() {
		return mot2;
	}

	public void setMot2(String mot2) {
		this.mot2 = mot2;
	}

	public String getDefinition2() {
		return definition2;
	}

	public void setDefinition2(String definition2) {
		this.definition2 = definition2;
	}

	public String getMot3() {
		return mot3;
	}

	public void setMot3(String mot3) {
		this.mot3 = mot3;
	}

	public String getDefinition3() {
		return definition3;
	}

	public void setDefinition3(String definition3) {
		this.definition3 = definition3;
	}

	public String getMot4() {
		return mot4;
	}

	public void setMot4(String mot4) {
		this.mot4 = mot4;
	}

	public String getDefinition4() {
		return definition4;
	}

	public void setDefinition4(String definition4) {
		this.definition4 = definition4;
	}

	public String getMot5() {
		return mot5;
	}

	public void setMot5(String mot5) {
		this.mot5 = mot5;
	}

	public String getDefinition5() {
		return definition5;
	}

	public void setDefinition5(String definition5) {
		this.definition5 = definition5;
	}

	public String getMot6() {
		return mot6;
	}

	public void setMot6(String mot6) {
		this.mot6 = mot6;
	}

	public String getDefinition6() {
		return definition6;
	}

	public void setDefinition6(String definition6) {
		this.definition6 = definition6;
	}

	public String getMot7() {
		return mot7;
	}

	public void setMot7(String mot7) {
		this.mot7 = mot7;
	}

	public String getDefinition7() {
		return definition7;
	}

	public void setDefinition7(String definition7) {
		this.definition7 = definition7;
	}

	public String getMot8() {
		return mot8;
	}

	public void setMot8(String mot8) {
		this.mot8 = mot8;
	}

	public String getDefinition8() {
		return definition8;
	}

	public void setDefinition8(String definition8) {
		this.definition8 = definition8;
	}

	public String getMot9() {
		return mot9;
	}

	public void setMot9(String mot9) {
		this.mot9 = mot9;
	}

	public String getDefinition9() {
		return definition9;
	}

	public void setDefinition9(String definition9) {
		this.definition9 = definition9;
	}

	public String getMot10() {
		return mot10;
	}

	public void setMot10(String mot10) {
		this.mot10 = mot10;
	}

	public String getDefinition10() {
		return definition10;
	}

	public void setDefinition10(String definition10) {
		this.definition10 = definition10;
	}

	public String getMot11() {
		return mot11;
	}

	public void setMot11(String mot11) {
		this.mot11 = mot11;
	}

	public String getDefinition11() {
		return definition11;
	}

	public void setDefinition11(String definition11) {
		this.definition11 = definition11;
	}

	public String getMot12() {
		return mot12;
	}

	public void setMot12(String mot12) {
		this.mot12 = mot12;
	}

	public String getDefinition12() {
		return definition12;
	}

	public void setDefinition12(String definition12) {
		this.definition12 = definition12;
	}

	public String getMot13() {
		return mot13;
	}

	public void setMot13(String mot13) {
		this.mot13 = mot13;
	}

	public String getDefinition13() {
		return definition13;
	}

	public void setDefinition13(String definition13) {
		this.definition13 = definition13;
	}

	public String getMot14() {
		return mot14;
	}

	public void setMot14(String mot14) {
		this.mot14 = mot14;
	}

	public String getDefinition14() {
		return definition14;
	}

	public void setDefinition14(String definition14) {
		this.definition14 = definition14;
	}

	public String getMot15() {
		return mot15;
	}

	public void setMot15(String mot15) {
		this.mot15 = mot15;
	}

	public String getDefinition15() {
		return definition15;
	}

	public void setDefinition15(String definition15) {
		this.definition15 = definition15;
	}

	public Analyse getAnalyse() {
		return analyse;
	}

	public void setAnalyse(Analyse analyse) {
		this.analyse = analyse;
	}


 }