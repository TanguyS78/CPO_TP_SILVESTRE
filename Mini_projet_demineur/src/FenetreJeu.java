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
import java.awt.Insets;
// --- NOUVEAUX IMPORTS POUR LE CLIC DROIT ---
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
// -------------------------------------------

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
                
                // Clic GAUCHE (Révéler)
                boutons[i][j].addActionListener(this);
                
                // --- NOUVEAU : GESTION CLIC DROIT (Drapeau) ---
                final int r = i; 
                final int c = j;
                
                boutons[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        // Si clic droit détecté
                        if (SwingUtilities.isRightMouseButton(e)) {
                            grille.basculerDrapeau(r, c);
                            boutons[r][c].setText(grille.getCellule(r, c).toString());
                        }
                    }
                });
                // ----------------------------------------------

                // Style
                boutons[i][j].setMargin(new Insets(0, 0, 0, 0));
                boutons[i][j].setFont(new Font("Arial", Font.BOLD, 12));
                boutons[i][j].setPreferredSize(new Dimension(45, 45));

                pan.add(boutons[i][j]);
            }
        }
        
        // 4. Adaptation de la taille
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boutonClique = (JButton) e.getSource();

        // 1. On trouve et on révèle la case (avec propagation)
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                if (boutons[i][j] == boutonClique) {
                    grille.revelerCellule(i, j);
                }
            }
        }

        // 2. On met à jour TOUTE la grille (pour afficher la propagation)
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                Cellule c = grille.getCellule(i, j);
                if (c.isDevoilee()) {
                    boutons[i][j].setText(c.toString());
                    boutons[i][j].setEnabled(false);
                }
            }
        }

        verifierFinDePartie();
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