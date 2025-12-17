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
    // On parcourt chaque case de la grille (i, j)
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            
            // Si la case n'est PAS une bombe, on doit compter ses voisines
            if (!matriceCellules[i][j].getPresenceBombe()) {
                int nbBombesVoisines = 0;
                
                // On regarde les voisins : carré de 3x3 autour de (i, j)
                for (int l = i - 1; l <= i + 1; l++) {
                    for (int c = j - 1; c <= j + 1; c++) {
                        
                        // 🛡️ SÉCURITÉ : On vérifie que la case voisine (l, c) est bien DANS la grille
                        // Il ne faut pas sortir en haut (l < 0), en bas (l >= nbLignes), etc.
                        if (l >= 0 && l < nbLignes && c >= 0 && c < nbColonnes) {
                            
                            // Si la case existe, on regarde si c'est une bombe
                            if (matriceCellules[l][c].getPresenceBombe()) {
                                nbBombesVoisines++;
                            }
                        }
                    }
                }
                // À la fin, on enregistre le nombre trouvé dans la cellule
                matriceCellules[i][j].setNbBombesAdjacentes(nbBombesVoisines);
            }
        }
    }
        
    }
}

