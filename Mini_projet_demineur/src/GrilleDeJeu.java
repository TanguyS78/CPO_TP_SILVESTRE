/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SILVESTRE Richard
 */
import java.util.Random; // <--- Indispensable pour le générateur

public class GrilleDeJeu {
    private int nbLignes;
    private int nbColonnes;
    private int nbBombes;
    private Cellule[][] matriceCellules;

    public GrilleDeJeu(int pLignes, int pColonnes, int pBombes) {
        this.nbLignes = pLignes;
        this.nbColonnes = pColonnes;
        this.nbBombes = pBombes;
        this.matriceCellules = new Cellule[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                this.matriceCellules[i][j] = new Cellule();
            }
        }
    }

    public int getNbLignes() {
        return nbLignes;
    }

    public int getNbColonnes() {
        return nbColonnes;
    }

    public int getNbBombes() {
        return nbBombes;
    }

    public Cellule getCellule(int i, int j) {
        return matriceCellules[i][j];
    }

    public void placerBombesAleatoirement() {
        Random generateur = new Random();
        int bombesPlacees = 0;

        while (bombesPlacees < nbBombes) {
            int i = generateur.nextInt(nbLignes);
            int j = generateur.nextInt(nbColonnes);

            if (!matriceCellules[i][j].getPresenceBombe()) {
                matriceCellules[i][j].placerBombe();
                bombesPlacees++;
            }
        }
    }

    public void calculerBombesAdjacentes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].getPresenceBombe()) {
                    int nbBombesVoisines = 0;
                    for (int l = i - 1; l <= i + 1; l++) {
                        for (int c = j - 1; c <= j + 1; c++) {
                            if (l >= 0 && l < nbLignes && c >= 0 && c < nbColonnes) {
                                if (matriceCellules[l][c].getPresenceBombe()) {
                                    nbBombesVoisines++;
                                }
                            }
                        }
                    }
                    matriceCellules[i][j].setNbBombesAdjacentes(nbBombesVoisines);
                }
            }
        }
    }

    public void revelerCellule(int l, int c) {
        // 1. Sécurité : Si on est hors grille, on sort
        if (l < 0 || l >= nbLignes || c < 0 || c >= nbColonnes) {
            return;
        }

        // 2. Si la case est déjà ouverte, on sort
        if (matriceCellules[l][c].isDevoilee()) {
            return;
        }

        // --- NOUVEAU : SÉCURITÉ DRAPEAU ---
        // 3. Si la case a un drapeau, on INTERDIT l'ouverture (on sort)
        if (matriceCellules[l][c].isDrapeau()) {
            return;
        }
        // ----------------------------------

        // 4. On révèle la case actuelle
        matriceCellules[l][c].revelerCellule();

        // 5. PROPAGATION : Si la case est vide (0) et pas une bombe
        if (matriceCellules[l][c].getNbBombesAdjacentes() == 0 && !matriceCellules[l][c].getPresenceBombe()) {
            for (int i = l - 1; i <= l + 1; i++) {
                for (int j = c - 1; j <= c + 1; j++) {
                    if (i != l || j != c) {
                        revelerCellule(i, j);
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                s += matriceCellules[i][j].toString() + " ";
            }
            s += "\n";
        }
        return s;
    }

    public boolean estPerdu() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                // ATTENTION : vérifie ici si ta méthode s'appelle isDevoilee() ou getDevoilee() dans Cellule
                if (matriceCellules[i][j].isDevoilee() && matriceCellules[i][j].getPresenceBombe()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean estGagne() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].getPresenceBombe() && !matriceCellules[i][j].isDevoilee()) {
                    return false;
                }
            }
        }
        return true;
    }
    public void basculerDrapeau(int l, int c) {
        if (l >= 0 && l < nbLignes && c >= 0 && c < nbColonnes) {
            matriceCellules[l][c].basculerDrapeau();
        }
    }
}