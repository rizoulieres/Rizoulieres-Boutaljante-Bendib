package com.example.devtools;

public class Personne {

    private String nom;
    private String prenom;
    private int couleur;

    public Personne(String nom,String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.couleur = 255;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getCouleur() {
        return couleur;
    }
}
