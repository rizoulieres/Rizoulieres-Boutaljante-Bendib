package com.example.devtools;

import java.util.ArrayList;

public class DataPersonne {

    static ArrayList<Personne> liste = new ArrayList<>();

    public static void addPerson(Personne p){
        liste.add(p);
    }

    public static ArrayList<Personne> getPerson() {
        return liste;
    }
}
