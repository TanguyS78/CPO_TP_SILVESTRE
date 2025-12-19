/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SILVESTRE Richard
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreJeu extends JFrame implements ActionListener {
    
    // Attributs : La logique (grille) et le visuel (boutons)
    private GrilleDeJeu grille;
    private JButton[][] boutons;
    private int lignes;
    private int colonnes;

    public FenetreJeu(int pLignes, int pColonnes, int pBombes) {
        this.lignes = pLignes;
        this.colonnes = pColonnes;

        // 1. Initialisation de la logique
        grille = new GrilleDeJeu(lignes, colonnes, pBombes);
        grille.placerBombesAleatoirement();
        grille.calculerBombesAdjacentes();

        // 2. Configuration de la fenêtre
        this.setTitle("Démineur");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // On utilise un GridLayout pour faire une grille parfaite
        Container pan = this.getContentPane();
        pan.setLayout(new GridLayout(lignes, colonnes));

        // 3. Création des boutons
        boutons = new JButton[lignes][colonnes];

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                boutons[i][j] = new JButton();
                boutons[i][j].addActionListener(this); // Le bouton écoute les clics
                pan.add(boutons[i][j]); // On ajoute le bouton à la fenêtre
            }
        }
        
        this.setVisible(true);
    }

    // Cette méthode est appelée quand on clique sur un bouton
    @Override
    public void actionPerformed(ActionEvent e) {
        // On cherche quel bouton a été cliqué
        JButton boutonClique = (JButton) e.getSource();

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                if (boutons[i][j] == boutonClique) {
                    
                    // 1. On révèle la case dans la logique
                    grille.revelerCellule(i, j);

                    // 2. On met à jour le texte du bouton avec le symbole de la cellule
                    // (Cela utilise ta méthode toString de Cellule qui renvoie "?" ou " " ou "X")
                    boutonClique.setText(grille.getCellule(i, j).toString());
                    
                    // 3. On désactive le bouton pour ne plus pouvoir cliquer dessus
                    boutonClique.setEnabled(false);

                    // 4. Vérification de victoire ou défaite
                    verifierFinDePartie();
                }
            }
        }
    }

    private void verifierFinDePartie() {
        if (grille.estPerdu()) {
            JOptionPane.showMessageDialog(this, "BOOM ! Vous avez perdu !");
            System.exit(0);
        } else if (grille.estGagne()) {
            JOptionPane.showMessageDialog(this, "Félicitations, vous avez gagné !");
            System.exit(0);
        }
    }
}
