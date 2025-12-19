/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SILVESTRE Richard
 */
public class Cellule {
    private boolean presenceBombe;
    private boolean devoilee;
    private int nbBombesAdjacentes;
    
    public boolean getPresenceBombe() {
    return presenceBombe;
    }
    
    public boolean getDevoilee() {
    return devoilee;
    }
    
    public int getNbBombesAdjacentes() {
    return nbBombesAdjacentes;
}
    
    public void placerBombe(){
        this.presenceBombe=true;
    }
    
    public void revelerCellule(){
        this.devoilee=true;
    }
    
    public void setNbBombesAdjacentes (int nvBombesAdjacente){
        this.nbBombesAdjacentes = nvBombesAdjacente;
    }
    
    public String toString() {
        if (devoilee==false) {
            return "?";
        }
        else if (presenceBombe == true){ 
            return "B";
        }
        else if (nbBombesAdjacentes>0){
            return ""+ nbBombesAdjacentes;
        } 
        else 
            return " ";
}
}
