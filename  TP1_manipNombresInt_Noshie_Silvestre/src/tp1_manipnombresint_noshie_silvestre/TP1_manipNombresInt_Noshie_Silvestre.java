/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_noshie_silvestre;

import java.util.Scanner;

/**
 *
 * @author SILVESTRE Richard
 */
public class TP1_manipNombresInt_Noshie_Silvestre {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer deux entiers");
        int Var1 = sc.nextInt();
        int Var2 = sc.nextInt();
        System.out.println("Variable 1 : "+Var1+"\nVariable 2 : "+Var2);
        System.out.println("La somme des deux nombre: "+(Var1+Var2));
        System.out.println("La difference des deux nombre: "+(Var1-Var2));
        System.out.println("Le produit des deux nombre: "+(Var1*Var2));
        System.out.println("Le quotient entier des deux nombre: "+(Var1/Var2)+"\nLe reste du quotient : "+(Var1%Var2));
           
        // TODO code application logic here
    }
   
}