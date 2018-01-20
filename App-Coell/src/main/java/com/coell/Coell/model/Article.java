package com.coell.Coell.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idArticle;

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
    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Analyse> analyse;

    public Article() {
        super();
    }

    public Article(Long idArticle, String titre, String contenu, Date datepublication, String source,
                   Utilisateur utilisateur, Domaine domaine, Langue langue, List<Analyse> analyse) {
        super();
        this.idArticle = idArticle;
        this.titre = titre;
        this.contenu = contenu;
        this.datepublication = datepublication;
        this.source = source;
        this.utilisateur = utilisateur;
        this.domaine = domaine;
        this.langue = langue;
        this.analyse = analyse;
    }

    public Long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
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