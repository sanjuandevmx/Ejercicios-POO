/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set.
 */
package Entidades;

/**
 *
 * @author brian
 */
public class Matematica {
    private double nReal1;
    private double nReal2;

    public Matematica() {
    }

    public Matematica(double nReal1, double nReal2) {
        this.nReal1 = nReal1;
        this.nReal2 = nReal2;
    }

    public double getnReal1() {
        return nReal1;
    }

    public void setnReal1(double nReal1) {
        this.nReal1 = nReal1;
    }

    public double getnReal2() {
        return nReal2;
    }

    public void setnReal2(double nReal2) {
        this.nReal2 = nReal2;
    }
    
}
