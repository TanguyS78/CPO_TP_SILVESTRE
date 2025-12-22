/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SILVESTRE Richard
 */
public class Cellule {
    private boolean presenceBombe;
    private boolean devoilee;
    private int nbBombesAdjacentes;
    private boolean isDrapeau; // <--- NOUVEAU : On retient si c'est un drapeau

    public Cellule() {
        this.presenceBombe = false;
        this.devoilee = false;
        this.nbBombesAdjacentes = 0;
        this.isDrapeau = false;
    }

    public void placerBombe() {
        this.presenceBombe = true;
    }

    public boolean getPresenceBombe() {
        return this.presenceBombe;
    }

    public void revelerCellule() {
        this.devoilee = true;
        this.isDrapeau = false; // Si on révèle, le drapeau s'en va
    }

    public boolean isDevoilee() {
        return this.devoilee;
    }

    public void setNbBombesAdjacentes(int nb) {
        this.nbBombesAdjacentes = nb;
    }

    public int getNbBombesAdjacentes() {
        return this.nbBombesAdjacentes;
    }

    // --- NOUVELLE MÉTHODE POUR LE DRAPEAU ---
    public void basculerDrapeau() {
        if (!this.devoilee) { // On ne peut mettre un drapeau que si la case est cachée
            this.isDrapeau = !this.isDrapeau; // Inverse (si true devient false, et inversement)
        }
    }

    public boolean isDrapeau() {
        return isDrapeau;
    }

    @Override
    public String toString() {
        // 1. Si la case est marquée d'un DRAPEAU
        if (this.isDrapeau) {
            return "🚩"; 
        }

        // 2. Si la case est encore cachée
        if (!this.devoilee) {
            return "";
        }

        // 3. Si c'est une bombe
        if (this.presenceBombe) {
            return "💣";
        }

        // 4. Si c'est un chiffre
        if (this.nbBombesAdjacentes > 0) {
            return String.valueOf(this.nbBombesAdjacentes);
        }

        // 5. Case vide
        return "";
    }
}