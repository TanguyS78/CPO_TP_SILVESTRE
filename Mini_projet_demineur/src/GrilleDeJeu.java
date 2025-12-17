/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SILVESTRE Richard
 */
import java.util.Random;



public class GrilleDeJeu {
    private int nbLignes;
    private int nbColonnes;
    private int nbBombes;
    private Cellule[][] matriceCellules;
    
public int getnbLignes(){
    return nbLignes;
    }

public int getnbColonnes(){
    return nbColonnes;
    }

public int getnbBombes(){
    return nbBombes;
    }


    public GrilleDeJeu(int pLignes, int pColonnes, int pBombes) {
    // 1. Initialiser les variables avec les paramètres
    this.nbLignes = pLignes ;
    this.nbColonnes=pColonnes;
    this.nbBombes=pBombes;
    this.matriceCellules=new Cellule[nbLignes][nbColonnes];
    
    for(int i=0;i<nbLignes;i++){
        for(int j=0;j<nbColonnes;j++){
        this.matriceCellules[i][j] =new Cellule();    
        }
    }fff
    
    public void placerBombesAleatoirement (){
        int bombesPlacees = 0;
        Random generateur = new Random();
        
        while (bombesPlacees < nbBombes){
        int ligneAleatoire=generateur.nextInt(nbLignes);
        int colonneAleatoire=generateur.nextInt(nbColonnes);
        
        }
        
        
    // 2. Créer la matrice (new Cellule[...][...])
    
    // 3. Remplir la grille avec des objets Cellule (double boucle for)
}

