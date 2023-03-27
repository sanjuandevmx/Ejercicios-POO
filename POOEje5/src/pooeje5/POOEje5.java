/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje5;

import Entidad.CuentaBancaria;
import Servicio.CuentaServicio;

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
        
        CuentaServicio ctaser = new CuentaServicio();
        CuentaBancaria user1 = ctaser.altaCuenta();
        ctaser.ingresarDinero(user1);
        ctaser.retirarDinero(user1);
        ctaser.retiroRapido(user1);
        ctaser.consultarSaldo(user1);
        ctaser.detallesCuenta(user1);
        
    }
    
}
