/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*22/10/2025, convertisseur*/
package tp1_convertisseur_silvestre_noshie;

import java.util.Scanner;

public class TP1_convertisseur_SILVESTRE_NOSHIE {
    public static double CelciusVersKelvin (double tCelcius) {
       
        double tKelvin = tCelcius + 273.15;
       
        return tKelvin;
   
    }
    public static double KelvinVersCelcius (double tKelvin) {
       
        double tCelcius = tKelvin - 273.15;
       
        return tCelcius;
   
    }
    public static double FarenheitVersCelcius (double tFarenheit) {
       
        double tCelcius = ((tFarenheit - 32)*5)/9;
       
        return tCelcius;
    }
    public static double CelciusVersFarenheit (double tCelcius) {
       
        double tFarenheit = ((tCelcius*9)/5)+32;
       
        return tFarenheit;
    }
    public static double KelvinVersFarenheit (double tKelvin) {
       
        double tFarenheit = (tKelvin-273.15)*(9/5)+32;
       
        return tFarenheit;
    }
    public static double FarenheitVersKelvin (double tFarenheit) {
       
        double tKelvin = (tFarenheit-32)*(5/9)+273.15;
       
        return tKelvin;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println( "Bonjour, saisissez une valeur : ");
        double Var1= sc.nextDouble();
        System.out.println( "Saisissez la conversion que vous souhaiter effectuer : \n1) De Celcius vers Kelvin\n2) De Kelvin vers Celcius\n3) De Farenheit vers Kelvin\n4) De Kelvin vers Farenheit\n5) De Farenheit vers Celcius\n6) De Celcius vers Farenheit");
        double convertion= sc.nextDouble();
       
        if (convertion < 1) {
            System.out.println(" Erreur ");
        }
        else if (convertion >6){
            System.out.println(" Erreur ");
        }
        else if (convertion == 1){
            System.out.println(Var1+ " degre Celcius est egal a "+CelciusVersKelvin(Var1)+" degres Kelvin");
        }
        else if (convertion == 2 ){
        System.out.println(Var1+ " degre Kelvin est egal a "+KelvinVersCelcius(Var1)+" degres Celcius");
        }
        else if (convertion == 3 ){
        System.out.println(Var1+ " degre Farenheit est egal a "+FarenheitVersKelvin(Var1)+" degres Kelvin");
        }
        else if (convertion == 4){
        System.out.println(Var1+ " degre Kelvin est egal a "+KelvinVersFarenheit(Var1)+" degres Farenheit");
        }
        else if (convertion == 5){
        System.out.println(Var1+ " degre Farenheit est egal a "+FarenheitVersCelcius(Var1)+" degres Celcius" );
        }
        else if (convertion == 6){
        System.out.println(Var1+ " degre Celcius est egal a "+CelciusVersFarenheit(Var1)+" degres Farenheit");
        }
    }
   
}