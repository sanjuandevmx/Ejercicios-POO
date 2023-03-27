/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real.
 */
package pooeje2;

import Entidad.Circunferencia;
import Servicio.CircunferenciaServicio;

/**
 *
 * @author brian
 */
public class POOEje2 {
    
    public static void main(String[] args) {
        
        CircunferenciaServicio circle = new CircunferenciaServicio();
        Circunferencia circle1 = circle.CrearCircunferencia();
        circle.CalcularArea(circle1);
        circle.CalcularPerimetro(circle1);
    }
    
}
