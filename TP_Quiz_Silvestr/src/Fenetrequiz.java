import java.util.ArrayList;



public class Fenetrequiz extends javax.swing.JFrame {

    private int indexQuestionCourante = 0;
    private int scoreValue = 0;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Fenetrequiz.class.getName());
    private ArrayList<Question> ListeQuestions = new ArrayList<>();

    /**
     * Creates new form FenetreQuizz
     */
    public Fenetrequiz() {
        initComponents();

        ListeQuestions.add(new Question(
                "Quelle est la capitale de la France ?",
                "Lyon",
                "Paris",
                "Marseille",
                "Bordeaux",
                2));
        ListeQuestions.add(new Question(
                "Quelle est la capitale de l'Italie ?",
                "Rome",
                "Milan",
                "Naples",
                "Turin",
                1
        ));

        ListeQuestions.add(new Question(
                "Quel est le symbole chimique de l’eau ?",
                "O2",
                "H2O",
                "CO2",
                "HO",
                2
        ));

        ListeQuestions.add(new Question(
                "En quelle année a eu lieu la Révolution française ?",
                "1515",
                "1789",
                "1914",
                "1848",
                2
        ));

        ListeQuestions.add(new Question(
                "Combien font 7 × 8 ?",
                "48",
                "54",
                "56",
                "64",
                3
        ));

        ListeQuestions.add(new Question(
                "Quel est l’océan le plus vaste ?",
                "Atlantique",
                "Indien",
                "Pacifique",
                "Arctique",
                3
        ));

        ListeQuestions.add(new Question(
                "Quel pays a remporté la Coupe du monde de football 2018 ?",
                "Allemagne",
                "France",
                "Brésil",
                "Argentine",
                2
        ));

        ListeQuestions.add(new Questions(
                "Quel est l’élément le plus léger du tableau périodique ?",
                "Hydrogène",
                "Hélium",
                "Lithium",
                "Carbone",
                1
        ));

        ListeQuestions.add(new Question(
                "Qui a peint la Joconde ?",
                "Picasso",
                "Van Gogh",
                "Monet",
                "Leonard de Vinci",
                4
        ));

        ListeQuestions.add(new Question(
                "Quelle est la planète la plus proche du Soleil ?",
                "Vénus",
                "Mercure",
                "Terre",
                "Mars",
                2
        ));
java.util.Collections.shuffle(ListeQuestions);

        afficherQuestionCourante();

    }

    private void afficherQuestionCourante() {
        Question q = ListeQuestions.get(indexQuestionCourante);
q.melangerReponses();

        // Construire un énoncé complet
        String texte
                = "<html>"
                + q.getIntitule() + "<br><br>"
                + "A) " + q.getProposition1() + "<br>"
                + "B) " + q.getProposition2() + "<br>"
                + "C) " + q.getProposition3() + "<br>"
                + "D) " + q.getProposition4()
                + "</html>";

        enonce.setText(texte);

        // Les boutons restent A, B, C, D → aucun changement
        // Réactiver les boutons
        bouttonréponse1.setEnabled(true);
        bouttonréponse2.setEnabled(true);
        bouttonréponse3.setEnabled(true);
        bouttonréponse4.setEnabled(true);

        // Effacer l’ancienne réponse affichée
        repquestion.setText("");
    }

    private void verifierReponse(int choixUtilisateur) {
 
        Question q = ListeQuestions.get(indexQuestionCourante);

        // Vérifier si le choix correspond à la bonne réponse
        if (choixUtilisateur == q.getIndexBonneReponse()) {
            scoreValue++;  // On incrémente
            score.setText(String.valueOf(scoreValue)); // Met à jour l’affichage du score
            repquestion.setText("Bonne réponse !");


        } else {
            repquestion.setText(
    "Mauvaise réponse ! La bonne réponse était : "
    + getLettreBonneReponse(q.getIndexBonneReponse())
);
 
        }

       
        // Désactiver les boutons après la réponse
        bouttonréponse1.setEnabled(false);
        bouttonréponse2.setEnabled(false);
        bouttonréponse3.setEnabled(false);
        bouttonréponse4.setEnabled(false);
       
   
    }
    private String getLettreBonneReponse(int index) {
    switch (index) {
        case 1: return "A";
        case 2: return "B";
        case 3: return "C";
        case 4: return "D";
        default: return "?";
    }
}
       

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enonce = new javax.swing.JLabel();
        bouttonréponse1 = new javax.swing.JButton();
        bouttonréponse2 = new javax.swing.JButton();
        bouttonréponse3 = new javax.swing.JButton();
        bouttonréponse4 = new javax.swing.JButton();
        repquestion = new javax.swing.JLabel();
        boutonprochainequestion = new javax.swing.JButton();
        score = new javax.swing.JLabel();
        textscore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enonce.setText("1b1 Question");

        bouttonréponse1.setText("rep1");
        bouttonréponse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouttonréponse1ActionPerformed(evt);
            }
        });

        bouttonréponse2.setText("rep2");
        bouttonréponse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouttonréponse2ActionPerformed(evt);
            }
        });

        bouttonréponse3.setText("rep3");
        bouttonréponse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouttonréponse3ActionPerformed(evt);
            }
        });

        bouttonréponse4.setText("rep4");
        bouttonréponse4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouttonréponse4ActionPerformed(evt);
            }
        });

        repquestion.setText("bonne réponse");

        boutonprochainequestion.setText("question suivante");
        boutonprochainequestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonprochainequestionActionPerformed(evt);
            }
        });

        score.setText("score");

        textscore.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bouttonréponse3)
                                    .addComponent(bouttonréponse1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(enonce)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bouttonréponse2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bouttonréponse4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(score)
                                .addGap(18, 18, 18)
                                .addComponent(textscore))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 84, Short.MAX_VALUE)
                        .addComponent(repquestion)
                        .addGap(92, 92, 92)
                        .addComponent(boutonprochainequestion)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enonce)
                    .addComponent(score)
                    .addComponent(textscore))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bouttonréponse1)
                    .addComponent(bouttonréponse2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bouttonréponse3)
                    .addComponent(bouttonréponse4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonprochainequestion)
                    .addComponent(repquestion))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bouttonréponse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouttonréponse1ActionPerformed
        verifierReponse(1);        // TODO add your handling code here:
    }//GEN-LAST:event_bouttonréponse1ActionPerformed

    private void bouttonréponse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouttonréponse2ActionPerformed
 verifierReponse(2);
    }//GEN-LAST:event_bouttonréponse2ActionPerformed

    private void bouttonréponse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouttonréponse3ActionPerformed
  verifierReponse(3);    // TODO add your handling code here:
    }//GEN-LAST:event_bouttonréponse3ActionPerformed

    private void bouttonréponse4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouttonréponse4ActionPerformed
    verifierReponse(4);         // TODO add your handling code here:
    }//GEN-LAST:event_bouttonréponse4ActionPerformed

    private void boutonprochainequestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonprochainequestionActionPerformed
          // Passer à la question suivante
        indexQuestionCourante++;

        // Vérifier si on est encore dans les limites de la liste
        if (indexQuestionCourante < ListeQuestions.size()) {
            afficherQuestionCourante();
        } else {
            // PLUS AUCUNE QUESTION → fin du quiz
            enonce.setText("<html><h3>Quiz terminé !</h3><br>Score final : "
                    + scoreValue + " / " + ListeQuestions.size() + "</html>");

            // Désactiver les boutons
            bouttonréponse1.setEnabled(false);
            bouttonréponse2.setEnabled(false);
            bouttonréponse3.setEnabled(false);
            bouttonréponse4.setEnabled(false);

            // Désactiver le bouton Question suivante
            next.setEnabled(false);

            // Facultatif : Effacer réponse correcte
            repquestion.setText("");
        } // TODO add your handling code here:
    }//GEN-LAST:event_boutonprochainequestionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Fenetrequiz().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonprochainequestion;
    private javax.swing.JButton bouttonréponse1;
    private javax.swing.JButton bouttonréponse2;
    private javax.swing.JButton bouttonréponse3;
    private javax.swing.JButton bouttonréponse4;
    private javax.swing.JLabel enonce;
    private javax.swing.JLabel repquestion;
    private javax.swing.JLabel score;
    private javax.swing.JLabel textscore;
    // End of variables declaration//GEN-END:variables

    private void initialiserquestion() {
        questions.add
        ("La Terre tourne autour du Soleil.",
                "Vrai", "Faux", "f", "f","f");
        questions.add("2 + 2 = 5.");
        questions.add("L'eau bout à 100°C.");
        questions.add("Les oiseaux sont des mammifères.");
        questions.add("Java est un langage de programmation.");
        
        questions.add(new Question(
                 "La Terre tourne autour du Soleil.",
                "Vrai", "Faux", "", ""
        )
        
        } 
    private void afficherQuestionCourante() {
            questions Q1= questions.get(0);

    
}
}

    
