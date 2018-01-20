package com.coell.Coell.model;


import javax.persistence.*;

@Entity
@Table(name = "ideeGlobale")
public class IdeeGlobale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idIdeeGlobale;

    private String idee;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Analyse analyse;

    public IdeeGlobale() {
        super();
    }

    public IdeeGlobale(Long idIdeeGlobale, String idee, Analyse analyse) {
        super();
        this.idIdeeGlobale = idIdeeGlobale;
        this.idee = idee;
        this.analyse = analyse;
    }

    public Long getIdIdeeGlobale() {
        return idIdeeGlobale;
    }

    public void setIdIdeeGlobale(Long idIdeeGlobale) {
        this.idIdeeGlobale = idIdeeGlobale;
    }

    public String getIdee() {
        return idee;
    }

    public void setIdee(String phrase) {
        this.idee = phrase;
    }

    public Analyse getAnalyse() {
        return analyse;
    }

    public void setAnalyse(Analyse analyse) {
        this.analyse = analyse;
    }


}