package com.coell.Coell.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "domaine")
public class Domaine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDomaine;

    private String nom;

    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "domaine", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Article> article;

    public Domaine() {
        super();
    }

    public Domaine(Long idDomaine, String nom, String description, List<Article> article) {
        super();
        this.idDomaine = idDomaine;
        this.nom = nom;
        this.description = description;
        this.article = article;
    }

    public Long getIdDomaine() {
        return idDomaine;
    }

    public void setIdDomaine(Long idDomaine) {
        this.idDomaine = idDomaine;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Article> getArticle() {
        return article;
    }

    public void setArticle(List<Article> article) {
        this.article = article;
    }


}