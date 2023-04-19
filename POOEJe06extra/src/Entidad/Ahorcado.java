/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author brian
 */
public class Ahorcado {
    
  private String[] ahorcado = new String[7];
  private char cantidadLetrasEncontradas;
  private int cantidadJugadas;

    public Ahorcado() {
    }

    public Ahorcado(char cantidadLetrasEncontradas, int cantidadJugadas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadJugadas = cantidadJugadas;
    }

    public String[] getAhorcado() {
        return ahorcado;
    }

    public void setAhorcado(String[] ahorcado) {
        this.ahorcado = ahorcado;
    }

    public char getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(char cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }
  
  
    
}
