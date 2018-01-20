package com.coell.Coell.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "traduction")
public class Traduction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTraduction;

    private String mot1;

    private String mot2;

    @JsonIgnore
    @OneToOne
    @PrimaryKeyJoinColumn
    private Analyse analyse;

    public Traduction() {
        super();
    }

    public Traduction(Long idTraduction, String mot1, String mot2, Analyse analyse) {
        super();
        this.idTraduction = idTraduction;
        this.mot1 = mot1;
        this.mot2 = mot2;
        this.analyse = analyse;
    }

    public Long getIdTraduction() {
        return idTraduction;
    }

    public void setIdTraduction(Long idTraduction) {
        this.idTraduction = idTraduction;
    }

    public String getMot1() {
        return mot1;
    }

    public void setMot1(String mot1) {
        this.mot1 = mot1;
    }

    public String getMot2() {
        return mot2;
    }

    public void setMot2(String mot2) {
        this.mot2 = mot2;
    }

    public Analyse getAnalyse() {
        return analyse;
    }

    public void setAnalyse(Analyse analyse) {
        this.analyse = analyse;
    }


}