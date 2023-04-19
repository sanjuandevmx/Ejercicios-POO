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

        PersonaServicios service = new PersonaServicios();

        double menorPeso = 0, pesoIdeal = 0, mayorPeso = 0, mayorEdad = 0, menorEdad = 0, imc  =0;
        boolean edad = false;

         Persona[] persona = new Persona[4];

        for (int i = 0; i < persona.length; i++) {
            persona[i] = service.crearPersona();

           imc = service.calcularIMC(persona[i], i);
            if (imc == -1) {
                menorPeso++;
            } else if (imc == 0) {
                pesoIdeal++;
            } else {
                mayorPeso++;
            }
            edad = service.esMayorDeEdad(persona[i]);
            if (edad) {
                mayorEdad++;
            } else {
                menorEdad++;
            }
        }

        System.out.println("Hay " + menorPeso + " con bajo peso, " + pesoIdeal + " con peso ideal y " + mayorPeso + " con sobre peso.");
        System.out.println("Hay " + mayorEdad + " personas mayores y " + menorEdad + " personas menores de edad.");
    }

}
