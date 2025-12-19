/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SILVESTRE Richard
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Paramètres du jeu
        int lignes = 5;
        int colonnes = 5;
        int bombes = 3;

        // 2. Création et préparation de la grille
        GrilleDeJeu grille = new GrilleDeJeu(lignes, colonnes, bombes);
        grille.placerBombesAleatoirement();
        grille.calculerBombesAdjacentes();

        Scanner scanner = new Scanner(System.in);
        boolean fini = false;

        System.out.println("=== DÉMINEUR ===");

        // 3. Boucle de jeu
        while (!fini) {
            // Afficher la grille
            System.out.println(grille.toString());

            // Demander les coordonnées
            System.out.print("Entrez la LIGNE : ");
            int l = scanner.nextInt();
            System.out.print("Entrez la COLONNE : ");
            int c = scanner.nextInt();

            // Révéler la case
            grille.revelerCellule(l, c);

            // Vérifier fin de partie
            if (grille.estPerdu()) {
                System.out.println(grille.toString()); // On affiche la grille finale
                System.out.println("BOOM ! Vous avez perdu ! 💥");
                fini = true;
        