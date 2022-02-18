package com.apprecyclage.apprecyclage.model;
import com.apprecyclage.apprecyclage.Etat;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenom;

    @Column(nullable = false)
    private String adresse;
    @Column(nullable = false, unique = true)
    private int telephone;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String login;
    @Column(nullable = false)
    private String motDePass;
    @Column(nullable = false)
    private LocalDate dateCreation = LocalDate.now();
    private LocalDate dateModification;
    @Enumerated(EnumType.STRING)
    private Etat etat;

    public Admin() {

    }

    public void setDateModification(LocalDate dateModification) {
        this.dateModification = dateModification;

    }

    public Admin(Long id, String nom, String prenom, String adresse, int telephone, String email, String login, String motDePass, LocalDate dateCreation, LocalDate dateModification, Etat etat) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.login = login;
        this.motDePass = motDePass;
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
        this.etat = etat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePass() {
        return motDePass;
    }

    public void setMotDePass(String motDePass) {
        this.motDePass = motDePass;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDate getDateModification() {
        return dateModification;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
}
