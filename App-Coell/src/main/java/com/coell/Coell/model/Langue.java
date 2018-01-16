package com.coell.Coell.model;

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
public class Langue {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LANGUE_SEQ")
  @SequenceGenerator(sequenceName = "langue_seq", initialValue = 1, allocationSize = 1, name = "LANGUE_SEQ")
  private Long idlangue;

  private String nomlangue;
  
  @JsonIgnore
  @OneToMany(mappedBy="langue", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Article> article;
  
  @JsonIgnore
  @OneToMany(mappedBy="langue", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Analyse> analyse;

	public Langue() {
		super();
	}

	public Langue(Long idlangue, String nomlangue, List<Article> article, List<Analyse> analyse) {
		super();
		this.idlangue = idlangue;
		this.nomlangue = nomlangue;
		this.article = article;
		this.analyse = analyse;
	}

	public Long getIdlangue() {
		return idlangue;
	}

	public void setIdlangue(Long idlangue) {
		this.idlangue = idlangue;
	}

	public String getNomlangue() {
		return nomlangue;
	}

	public void setNomlangue(String nomlangue) {
		this.nomlangue = nomlangue;
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