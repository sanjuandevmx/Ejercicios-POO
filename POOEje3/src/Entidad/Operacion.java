/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
numero2.
SUMAR, RESTAR, MULTIPLICAR Y DIVIDIR
 */
package Entidad;

/**
 *
 * @author brian
 */
public class Operacion {
    
    private double n1;
    private double n2;

    public Operacion() {
    }

    public Operacion(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
        
    }

    @Override
    public String toString() {
        return "Operacion{" + "n1=" + n1 + ", n2=" + n2 + '}';
    }
    
    
}

