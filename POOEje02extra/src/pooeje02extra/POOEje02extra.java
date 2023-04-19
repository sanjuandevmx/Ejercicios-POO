/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje02extra;

import Entidades.Distancia;
import Servicios.DistanciaServicios;

/**
 *
 * @author brian
 */
public class POOEje02extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DistanciaServicios ds = new DistanciaServicios();
        Distancia d1 = ds.crearPuntos();
        System.out.println("La distancia entre los puntos es de "+ ds.calcularDistancia(d1));
        
    }
    
}
