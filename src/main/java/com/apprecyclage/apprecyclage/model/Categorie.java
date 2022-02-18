package com.apprecyclage.apprecyclage.model;

import javax.persistence.*;

@Entity
public class Categorie {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(nullable = false)
        private Long idcat;



    @Column(nullable = false)
        private String type;

    @ManyToOne
    private Annonce annonce;
    public Categorie() {
    }
    public void setType(String type) {
        this.type = type;
    }

    public Categorie(Long idcat, String type) {
        this.idcat = idcat;
        this.type = type;
    }

    public Long getIdcat() {
        return idcat;
    }

    public void setIdcat(Long idcat) {
        this.idcat = idcat;
    }

    public String getType() {
        return type;
    }
}


