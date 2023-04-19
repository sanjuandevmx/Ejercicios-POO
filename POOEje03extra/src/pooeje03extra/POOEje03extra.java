/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje03extra;

import Entidades.Raices;
import Servicios.RaicesService;

/**
 *
 * @author brian
 */
public class POOEje03extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here+
        
        RaicesService service = new RaicesService();
        Raices raices = new Raices(1, -8, 16);        
        
        if (service.sacarDiscriminante(raices)>=0) {
            service.calcular(raices);
        }else{
            System.out.println("La ecuación no contiene raices.");
        }
    }
    
}
