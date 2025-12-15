package tp3_heroic_fantasy_silvestre;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SILVESTRE Richard
 */


public class armes {
    String nom;
    int nvattaque;
    
    public armes (int nvattaque,String nom){
        this.nom=nom;
        if (nvattaque >100){
            nvattaque=100;
        }
        this.nvattaque=nvattaque;
    }
    @Override
    public String toString(){
        return "arme :" + nom+ "/n lvl "+ nvattaque;
    }
}
