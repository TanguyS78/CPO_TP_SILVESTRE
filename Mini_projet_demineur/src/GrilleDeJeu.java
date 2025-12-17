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
    }
    }
    public void placerBombesAleatoirement() {
    Random generateur = new Random();
    int bombesPlacees = 0;

    while (bombesPlacees < nbBombes) {
        // 1. On choisit une case au hasard À CHAQUE tour de boucle
        int i = generateur.nextInt(nbLignes);
        int j = generateur.nextInt(nbColonnes);

        // 2. On vérifie si la case n'a PAS déjà une bombe
        if (!matriceCellules[i][j].getPresenceBombe()) {
            
            // 3. On place la bombe
            matriceCellules[i][j].placerBombe();
            
            // 4. On valide qu'une bombe de plus est placée
            bombesPlacees++; 
        }
    }
    }
    
    public void calculerBombesAdjacentes() {
        for(int i=0;i<nbLignes;i++){
        for(int j=0;j<nbColonnes;j++){
        if (!matriceCellules[i][j].getPresenceBombe()) {
            int nbBombesVoisines = 0;
            for (int l = i - 1; l <= i + 1; l++) {
                for (int c = j - 1; c <= j + 1; c++) {
                
        }
        }
        }    
        }}
        
        
        
        
    }
}

