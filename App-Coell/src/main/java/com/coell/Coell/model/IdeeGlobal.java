package com.coell.Coell.model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class IdeeGlobal {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDEEGLOBAL_SEQ")
  @SequenceGenerator(sequenceName = "ideeglobal_seq", initialValue = 1, allocationSize = 1, name = "IDEEGLOBAL_SEQ")
  private Long idideeglobal;

 private String ideeglobal1;
 
 private String ideeglobal2;
 
 private String ideeglobal3;
 
 private String ideeglobal4;
 
 private String ideeglobal5;
 
 private String ideeglobal6;
 
 private String ideeglobal7;
 
 private String ideeglobal8;
 
 @OneToOne
 @PrimaryKeyJoinColumn
 private Analyse analyse;
 
	public IdeeGlobal() {
		super();
	}

	public IdeeGlobal(Long idideeglobal, String ideeglobal1, String ideeglobal2, String ideeglobal3, String ideeglobal4,
			String ideeglobal5, String ideeglobal6, String ideeglobal7, String ideeglobal8, Analyse analyse) {
		super();
		this.idideeglobal = idideeglobal;
		this.ideeglobal1 = ideeglobal1;
		this.ideeglobal2 = ideeglobal2;
		this.ideeglobal3 = ideeglobal3;
		this.ideeglobal4 = ideeglobal4;
		this.ideeglobal5 = ideeglobal5;
		this.ideeglobal6 = ideeglobal6;
		this.ideeglobal7 = ideeglobal7;
		this.ideeglobal8 = ideeglobal8;
		this.analyse = analyse;
	}

	public Long getIdideeglobal() {
		return idideeglobal;
	}

	public void setIdideeglobal(Long idideeglobal) {
		this.idideeglobal = idideeglobal;
	}

	public String getIdeeglobal1() {
		return ideeglobal1;
	}

	public void setIdeeglobal1(String ideeglobal1) {
		this.ideeglobal1 = ideeglobal1;
	}

	public String getIdeeglobal2() {
		return ideeglobal2;
	}

	public void setIdeeglobal2(String ideeglobal2) {
		this.ideeglobal2 = ideeglobal2;
	}

	public String getIdeeglobal3() {
		return ideeglobal3;
	}

	public void setIdeeglobal3(String ideeglobal3) {
		this.ideeglobal3 = ideeglobal3;
	}

	public String getIdeeglobal4() {
		return ideeglobal4;
	}

	public void setIdeeglobal4(String ideeglobal4) {
		this.ideeglobal4 = ideeglobal4;
	}

	public String getIdeeglobal5() {
		return ideeglobal5;
	}

	public void setIdeeglobal5(String ideeglobal5) {
		this.ideeglobal5 = ideeglobal5;
	}

	public String getIdeeglobal6() {
		return ideeglobal6;
	}

	public void setIdeeglobal6(String ideeglobal6) {
		this.ideeglobal6 = ideeglobal6;
	}

	public String getIdeeglobal7() {
		return ideeglobal7;
	}

	public void setIdeeglobal7(String ideeglobal7) {
		this.ideeglobal7 = ideeglobal7;
	}

	public String getIdeeglobal8() {
		return ideeglobal8;
	}

	public void setIdeeglobal8(String ideeglobal8) {
		this.ideeglobal8 = ideeglobal8;
	}

	public Analyse getAnalyse() {
		return analyse;
	}

	public void setAnalyse(Analyse analyse) {
		this.analyse = analyse;
	}

	
 }