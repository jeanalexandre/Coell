package com.coell.Coell.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "langue")
public class Langue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLangue;

    private String nomLangue;

    @JsonIgnore
    @OneToMany(mappedBy = "langue", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Article> article;

    @JsonIgnore
    @OneToMany(mappedBy = "langue", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Analyse> analyse;

    public Langue() {
        super();
    }

    public Langue(Long idLangue, String nomLangue, List<Article> article, List<Analyse> analyse) {
        super();
        this.idLangue = idLangue;
        this.nomLangue = nomLangue;
        this.article = article;
        this.analyse = analyse;
    }

    public Long getIdLangue() {
        return idLangue;
    }

    public void setIdLangue(Long idLangue) {
        this.idLangue = idLangue;
    }

    public String getNomLangue() {
        return nomLangue;
    }

    public void setNomLangue(String nomLangue) {
        this.nomLangue = nomLangue;
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