package com.infotel.cdsn.keycloak.appclient.item;

import java.util.List;

public class Eurelienne {

    private String nom;
    private String description;
    private String origin;
    private String recommandation;
    private String alcool;
    private String amertume;
    private String categorie;
    private String image;
    private List<Medaille> medailles;


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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getRecommandation() {
        return recommandation;
    }

    public void setRecommandation(String recommandation) {
        this.recommandation = recommandation;
    }

    public String getAlcool() {
        return alcool;
    }

    public void setAlcool(String alcool) {
        this.alcool = alcool;
    }

    public String getAmertume() {
        return amertume;
    }

    public void setAmertume(String amertume) {
        this.amertume = amertume;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Medaille> getMedailles() {
        return medailles;
    }

    public void setMedailles(List<Medaille> medailles) {
        this.medailles = medailles;
    }
}
