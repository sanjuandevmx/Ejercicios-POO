
package pooeje12;

import Entidad.Persona;
import Services.PersonaService;


public class POOEje12 {


    public static void main(String[] args) {
        
        PersonaService person1 = new PersonaService();
        Persona edades3 = person1.crearPersona();
        person1.calcularEdad();
        

    }
    
}
