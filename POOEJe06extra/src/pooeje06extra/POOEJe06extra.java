/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje06extra;

import Entidad.Ahorcado;
import Servicios.AhorcadoService;

/**
 *
 * @author brian
 */
public class POOEJe06extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AhorcadoService cs = new AhorcadoService();
        Ahorcado palabra1 = cs.crearJuego();
                
    }
    
}
