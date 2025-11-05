/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_silvestre_corria;

/**
 *
 * @author SILVESTRE Richard
 */
public class TP2_relation_1_Silvestre_Corria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       

        

        

        voiture uneClio = new voiture ("Clio", "Renault", 5 ) ;

        voiture uneAutreClio = new voiture ("Clio", "Renault", 5 ) ;

        voiture une2008 = new voiture ("2008", "Peugeot", 6 ) ;

        voiture uneMicra = new voiture ("Micra", "Nissan", 4 ) ;

       

        Personne bob = new Personne("Bobby", "Sixkiller");

        Personne reno = new Personne("Reno", "Raines");

       

        bob.liste_voitures[0] = uneClio ;

        bob.nbVoiture = 1;

        uneClio.Proprietaire = bob;

       

        System.out.println("la premiere voiture de Bob est " +

        bob.liste_voitures[0] ) ;

       

        

        

        System.out.println("liste des voitures disponibles "+ uneClio +

        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

        

        

    }

   

}

 
