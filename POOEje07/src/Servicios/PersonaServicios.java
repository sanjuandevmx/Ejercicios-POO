/*
La clase servicios incluye los siguientes metodos.

Metodo crearPersona():
Metodo CalcularIMC();
Metodo CalcularMayorEdad();

 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicios {

    //Generamos la utilidad
    Scanner Leer = new Scanner(System.in);
    //Generamos la persona

    Persona prsn = new Persona();

    //Creamos el metodo CrearPersona();
    //En este metodo imprimiremos un mensaje en pantalla para pedir los datos.
    //Los datos se ingresan por teclado
    public Persona crearPersona() {
        
        System.out.println("Ingresar nombre");
        prsn.setNombre(Leer.nextLine());
        System.out.println(" Ingrese edad ");
        prsn.setEdad(Leer.nextInt());
        System.out.println("Elige tu sexo");
        String sex = Leer.nextLine();
        if (sex.contentEquals("M") || sex.contentEquals("m")) {
            prsn.setSexo(sex);}
                if (sex.contentEquals("H") || sex.contentEquals("h")) {
                    prsn.setSexo(sex);
                } else if (sex.contentEquals("NB") || sex.contentEquals("nb")){
        prsn.setSexo(sex);
    }
                return prsn;
    }
}


                  
            
    
            
          
   
