/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje5;

import Entidad.CuentaBancaria;
import Servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class POOEje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        CuentaServicio ctaser = new CuentaServicio();
        CuentaBancaria user1 = ctaser.altaCuenta();

        int option;
        System.out.println("Ingrese una de las opciones");
        System.out.println("1 Ingresar Dinero");
        System.out.println("2 Ingresar Dinero");
        System.out.println("3 Ingresar Dinero");
        option = Leer.nextInt();

        switch (option) {
            case 1:
                ctaser.ingresarDinero(user1);
                break;
            case 2:
                ctaser.retirarDinero(user1);
                break;
            case 3:
                ctaser.retiroRapido(user1);
                break;
        }

        ctaser.consultarSaldo(user1);
        ctaser.detallesCuenta(user1);

    }

}
