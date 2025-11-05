package tp2_convertisseurobjet_silvestre;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SILVESTRE Richard
 */
public class Convertisseur {

    int nbConversions = 0;

    

    

    public Convertisseur() {

        nbConversions = 0;

    }

 

    public float CelsiusVersKelvin(float celsius) {

        nbConversions++;

        return celsius + 273.15f;

    }

 

    public float KelvinVersCelsius(float kelvin) {     

        nbConversions++;

        return kelvin - 273.15f;

    }

 

    public float FahrenheitVersCelsius(float fahrenheit) {

        nbConversions++;

        return (fahrenheit - 32) * 5f / 9f;

    }

 

    public float CelsiusVersFahrenheit(float celsius) {

        nbConversions++;

        return (celsius * 9f / 5f) + 32;

    }

 

    public float FahrenheitVersKelvin(float fahrenheit) {

        nbConversions++;

        return (fahrenheit - 32) * 5f / 9f + 273.15f;

    }

 

    public float KelvinVersFahrenheit(float kelvin) {

        nbConversions++;

        return (kelvin - 273.15f) * 9f / 5f + 32;

    }

 

    @Override

    public String toString() {

        return "Nombre de conversions : " + nbConversions;

    }

}

 