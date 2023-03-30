/*
gjkf
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class CuentaServicio {

    Scanner Leer = new Scanner(System.in);
    CuentaBancaria cta = new CuentaBancaria();

    public CuentaBancaria altaCuenta() {
        System.out.println("Ingrese un nombre");
        cta.setNombre(Leer.nextLine());
        System.out.println("Ingrese un No de cuenta");
        cta.setnCuenta(Leer.nextInt());
        System.out.println(" Ingrese su DNI ");
        cta.setDni(Leer.nextLong());
        return cta;
    }

    public void ingresarDinero(CuentaBancaria cta) {
        System.out.println("Ingrese la cantidad de dinero a guardar");
        int deposito = Leer.nextInt();
        cta.setSaldoActual(cta.getSaldoActual() + deposito);
        System.out.println(cta.getSaldoActual());

    }

    public void retirarDinero(CuentaBancaria cta) {
        System.out.println("Ingrese un monto a retirat");
        int retiro = Leer.nextInt();
        cta.setSaldoActual(cta.getSaldoActual() - retiro);
        System.out.println("Su saldo es de :" + cta.getSaldoActual());
    }

    public void retiroRapido(CuentaBancaria cta) {
        System.out.println(" Ingrese el monto a retirar");
        int monto = Leer.nextInt();
        double porcentaje = cta.getSaldoActual() * 0.2;
        if (monto <= porcentaje) {
            double retiro = cta.getSaldoActual() - monto;
            
            System.out.println("Es posible retirar" + cta.getSaldoActual());
        } else {
            System.out.println("No es posible retirar");
        }

    }

    public void consultarSaldo(CuentaBancaria cta) {
        System.out.println("Su saldo actual es de:" + cta.getSaldoActual());

    }

    public void detallesCuenta(CuentaBancaria cta) {
        System.out.println("No Cuenta:" + cta.getnCuenta());
        System.out.println("El DNI es: " + cta.getDni());
        System.out.println("Su saldo es de: " + cta.getSaldoActual());
    }
}
