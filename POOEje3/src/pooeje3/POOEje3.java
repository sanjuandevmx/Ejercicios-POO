/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje3;

import Entidad.Operacion;
import Servicio.OperacionServicio;

/**
 *
 * @author brian
 */
public class POOEje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        OperacionServicio os = new OperacionServicio();
        Operacion op = os.IngresoDatos();
        os.Sumar(op);
        os.Restar(op);
        os.Multiplicar(op);
        os.Dividir(op);
        
    }
    
}
