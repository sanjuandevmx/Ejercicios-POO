/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, 
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la 
persona es mayor de edad. 
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas 
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores 
 */
package pooeje07;

import Entidad.Persona;
import Servicios.PersonaServicios;


public class POOEje07 {

   public static void main(String[] args) {
        // TODO code application logic here
        
        PersonaServicios ps = new PersonaServicios();
        Persona p1 = ps.crearPersona();   }
   
}
