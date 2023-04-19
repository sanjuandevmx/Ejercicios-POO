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
public class Raices {
    
    private int a, b, c;
    private double discriminante;

    public Raices() {
    }
    
     public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Raices(int a, int b, int c, double discriminante) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminante = discriminante;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminante() {
        return discriminante;
    }

    public void setDiscriminante(double discriminante) {
        this.discriminante = discriminante;
    }

    @Override
    public String toString() {
        return "Raices{" + "a=" + a + ", b=" + b + ", c=" + c + ", discriminante=" + discriminante + '}';
    }
    
    
}
