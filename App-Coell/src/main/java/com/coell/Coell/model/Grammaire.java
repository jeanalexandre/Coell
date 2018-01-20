package com.coell.Coell.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "grammaire")
public class Grammaire {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idGrammaire;

    private String phrase;

    @JsonIgnore
    @OneToOne
    @PrimaryKeyJoinColumn
    private Analyse analyse;

    public Grammaire() {
        super();
    }

    public Grammaire(Long idGrammaire, String phrase, Analyse analyse) {
        super();
        this.idGrammaire = idGrammaire;
        this.phrase = phrase;
        this.analyse = analyse;
    }

    public Long getIdGrammaire() {
        return idGrammaire;
    }

    public void setIdGrammaire(Long idGrammaire) {
        this.idGrammaire = idGrammaire;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public Analyse getAnalyse() {
        return analyse;
    }

    public void setAnalyse(Analyse analyse) {
        this.analyse = analyse;
    }

}