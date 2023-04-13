/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje09;

import Entidades.Matematica;
import Servicios.MatematicaServicio;

/**
 *
 * @author brian
 */
public class POOEje09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MatematicaServicio operacion = new MatematicaServicio();
        Matematica math = operacion.generarNumeros();
        operacion.devolverMayor(math);
        operacion.calcularPotencia(math);
        operacion.calcularRaiz(math);
   
    }
    
}
