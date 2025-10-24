/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_noshie_silvestre;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SILVESTRE Richard
 */
public class TP1_guessMyNumber_Noshie_Silvestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Random generateurAleat = new Random(); 
    int n = generateurAleat.nextInt(100);
    int v = generateurAleat.nextInt(500);
    int m = generateurAleat.nextInt(1000);
    Scanner sc = new Scanner(System.in);
    System.out.println(" Quel niveau de difficulté souhaitez vous?\n1 facile\n2 moyen\n3 difficile");
    int Var2=sc.nextInt();
    
    
    
    if (Var2==1){
         System.out.println(" saisir un nombre entre 0 et 100");
    int Var1= sc.nextInt();
    int tentat=1;
    
    while (Var1!=n) {
        if (Var1<n){
        System.out.println("Trop petit");
        Var1= sc.nextInt();

    }
    else if (Var1>n){
        System.out.println("trop grand");
        Var1= sc.nextInt();
    }
    tentat=tentat+1;
    
            
}
    if (Var1==n);{
        System.out.println("Gagner!");
        System.out.println("Vous avez effectué"+tentat+"tentative");

    }
        
}

    
    
    if (Var2==2){
         System.out.println(" saisir un nombre entre 0 et 500");
    int Var1= sc.nextInt();
    int tentat=1;
    
    while (Var1!=v) {
        if (Var1<v){
        System.out.println("Trop petit");
        Var1= sc.nextInt();

    }
    else if (Var1>v){
        System.out.println("trop grand");
        Var1= sc.nextInt();
    }
    tentat=tentat+1;
    
            
}
    if (Var1==v);{
        System.out.println("Gagner!");
        System.out.println("Vous avez effectué"+tentat+"tentative");

    }
        
}

    
    
    
    
    
   if (Var2==3){
         System.out.println(" saisir un nombre entre 0 et 1000");
    int Var1= sc.nextInt();
    int tentat=1;
    
    while (Var1!=m) {
        if (Var1<m){
        System.out.println("Trop petit");
        Var1= sc.nextInt();

    }
    else if (Var1>m){
        System.out.println("trop grand");
        Var1= sc.nextInt();
    }
    tentat=tentat+1;
    
            
}
    if (Var1==m);{
        System.out.println("Gagner!");
        System.out.println("Vous avez effectué"+tentat+"tentative");

    }
        
}

    
    
    
    
    
    
    
    
}
}
   

   