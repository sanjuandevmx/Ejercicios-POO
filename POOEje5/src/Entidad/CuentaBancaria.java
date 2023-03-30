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
    private String nombre;
    private int nCuenta;
    private long dni;
    private int saldoActual;

    public CuentaBancaria() {
    }
    
    public CuentaBancaria(String nombre, int nCuenta, long dni, int saldoActual) {
        this.nombre = nombre;
        this.nCuenta = nCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {return "CuentaBancaria{" + "nombre=" + nombre + ", nCuenta=" + nCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }

}
