/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author brian
 */
public class Cadena {
    
    private String Frase;
    private int Longitud;

    public Cadena() {
    }

    public Cadena(String Frase, int Longitud) {
        this.Frase = Frase;
        this.Longitud = Longitud;
    }

    public String getFrase() {
        return Frase;
    }

    public void setFrase(String Frase) {
        this.Frase = Frase;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "Frase=" + Frase + ", Longitud=" + Longitud + '}';
    }
    
}
