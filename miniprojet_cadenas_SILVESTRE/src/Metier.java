import java.util.Random;

public class Metier {
    private int[] combinaisonSecrete;
    private int tentatives;
    public final int MAX_TENTATIVES = 5;

    public Metier() {
        this.combinaisonSecrete = new int[4];
        this.tentatives = 0;
        genererCombinaison();
    }

    // Génère 4 chiffres aléatoires entre 0 et 9
    public void genererCombinaison() {
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            combinaisonSecrete[i] = rand.nextInt(10);
        }
        this.tentatives = 0;
        // Pour débugger, vous pouvez décommenter la ligne suivante :
        // System.out.println("Code secret : " + java.util.Arrays.toString(combinaisonSecrete));
    }

}