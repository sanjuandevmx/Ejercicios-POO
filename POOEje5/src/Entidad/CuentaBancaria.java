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
public class CuentaBancaria {
    
    private int nCuenta;
    private double dni;
    private int saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int nCuenta, double dni, int saldoActual) {
        this.nCuenta = nCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
}
