package tp2_relation_1_silvestre_corria;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SILVESTRE Richard
 */
public class Personne {

   

    String nom;

    String prenom;

    int nbVoiture;

    voiture[] liste_voitures;

   

    public Personne(String unNom, String unPrenom) {

        this.nom = unNom;

        this.prenom = unPrenom;

        this.liste_voitures = new voiture[3];

        this.nbVoiture = 0;

    }

   

    

    

    @Override

    public String toString() {

        return nom + " " + prenom;

    }

}

 
