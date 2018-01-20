package com.coell.Coell.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "lienExterne")
public class LienExterne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLienExterne;

    private String lien;

    @JsonIgnore
    @OneToOne
    @PrimaryKeyJoinColumn
    private Analyse analyse;

    public LienExterne() {
        super();
    }

    public LienExterne(Long idLienExterne, String lien, Analyse analyse) {
        super();
        this.idLienExterne = idLienExterne;
        this.lien = lien;
        this.analyse = analyse;
    }

    public Long getIdLienExterne() {
        return idLienExterne;
    }

    public void setIdLienExterne(Long idLienExterne) {
        this.idLienExterne = idLienExterne;
    }

    public String getLien() {
        return lien;
    }

    public void setLien1(String lien1) {
        this.lien = lien;
    }

    public Analyse getAnalyse() {
        return analyse;
    }

    public void setAnalyse(Analyse analyse) {
        this.analyse = analyse;
    }


}