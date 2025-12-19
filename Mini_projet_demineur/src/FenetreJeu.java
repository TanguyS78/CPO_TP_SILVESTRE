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
// Il faut cet import pour pouvoir modifier les marges
import java.awt.Insets; 

public class FenetreJeu extends JFrame implements ActionListener {
    
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
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pan = this.getContentPane();
        pan.setLayout(new GridLayout(lignes, colonnes));

        // 3. Création des boutons
        boutons = new JButton[lignes][colonnes];

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                boutons[i][j] = new JButton();
                boutons[i][j].addActionListener(this);
                
                // --- CORRECTIONS D'AFFICHAGE ---
                // A. Enlever les marges internes (gagne de la place pour le texte)
                boutons[i][j].setMargin(new Insets(0, 0, 0, 0));
                
                // B. Police plus petite et lisible
                boutons[i][j].setFont(new Font("Arial", Font.BOLD, 12));
                
                // C. Taille fixe par bouton (45x45 pixels)
                boutons[i][j].setPreferredSize(new Dimension(45, 45));
                // -------------------------------

                pan.add(boutons[i][j]);
            }
        }
        
        // 4. MAGIE : On adapte la fenêtre au contenu au lieu de fixer une taille
        this.pack();
        this.setLocationRelativeTo(null); // Centre la fenêtre
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boutonClique = (JButton) e.getSource();

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                if (boutons[i][j] == boutonClique) {
                    
                    grille.revelerCellule(i, j);
                    boutonClique.setText(grille.getCellule(i, j).toString());
                    boutonClique.setEnabled(false); // Grisage du bouton

                    verifierFinDePartie();
                }
            }
        }
    }

    private void verifierFinDePartie() {
        if (grille.estPerdu()) {
            JOptionPane.showMessageDialog(this, "BOOM ! Vous avez perdu ! 💥");
            System.exit(0);
        } else if (grille.estGagne()) {
            JOptionPane.showMessageDialog(this, "Félicitations, vous avez gagné ! 🏆");
            System.exit(0);
        }
    }
}