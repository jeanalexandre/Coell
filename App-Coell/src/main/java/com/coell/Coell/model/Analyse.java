package com.coell.Coell.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "analyse")
public class Analyse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAnalyse;

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

    @OneToMany(mappedBy = "idTraduction", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Traduction> traductions;

    @OneToMany(mappedBy = "idGrammaire", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Grammaire> grammaires;

    @OneToMany(mappedBy = "idIdeeGlobale", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<IdeeGlobale> ideeGlobales;

    @OneToMany(mappedBy = "idVocabulaire", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Vocabulaire> vocabulaires;

    @OneToMany(mappedBy = "idLienExterne", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<LienExterne> lienExternes;

    public Analyse() {
        super();
    }

    public Analyse(Long idAnalyse, String argumentation, double vocabulaireScore, double traductionScore,
                   double grammaireScore, double ideeGlobalScore, double analyseScore, Utilisateur utilisateur, Langue langue,
                   Article article) {
        super();
        this.idAnalyse = idAnalyse;
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

    public Long getIdAnalyse() {
        return idAnalyse;
    }

    public void setIdAnalyse(Long idAnalyse) {
        this.idAnalyse = idAnalyse;
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

    public List<Traduction> getTraductions() {
        return traductions;
    }

    public void setTraductions(List<Traduction> traductions) {
        this.traductions = traductions;
    }

    public List<Grammaire> getGrammaires() {
        return grammaires;
    }

    public void setGrammaires(List<Grammaire> grammaires) {
        this.grammaires = grammaires;
    }

    public List<IdeeGlobale> getIdeeGlobales() {
        return ideeGlobales;
    }

    public void setIdeeGlobales(List<IdeeGlobale> ideeGlobales) {
        this.ideeGlobales = ideeGlobales;
    }

    public List<Vocabulaire> getVocabulaires() {
        return vocabulaires;
    }

    public void setVocabulaires(List<Vocabulaire> vocabulaires) {
        this.vocabulaires = vocabulaires;
    }

    public List<LienExterne> getLienExternes() {
        return lienExternes;
    }

    public void setLienExternes(List<LienExterne> lienExternes) {
        this.lienExternes = lienExternes;
    }


}