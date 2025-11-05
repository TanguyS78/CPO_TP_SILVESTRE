package tp2_relation_1_silvestre_corria;


import tp2_relation_1_silvestre_corria.Personne;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SILVESTRE Richard
 */
public class voiture {

 

    String modele;

    String marque;

    int puissanceCV;

    Personne Proprietaire;

 

   

    

    public voiture(String unModele, String uneMarque, int unePuissanceCV) {

        this.modele = unModele;

        this.marque = uneMarque;

        this.puissanceCV = unePuissanceCV;

        this.Proprietaire = null;

    }

   

 

    @Override

    public String toString() {

        return modele + " (" + marque + ") avec une puissance de " + puissanceCV + " chevaux";

    }

}
