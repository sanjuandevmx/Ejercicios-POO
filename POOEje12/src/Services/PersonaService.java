/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidad.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class PersonaService {

    Persona people  = new Persona();
    Scanner Leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        System.out.println("Ingrese su nombre");
        people.setPersona(Leer.nextLine());
        System.out.println("Ingrese el día de su fecha de nacimiento");
        int dia = Leer.nextInt();
        
        System.out.println("Ingrese el mes de su fecha de nacimiento");
        int mes = Leer.nextInt();
        
        System.out.println("Ingrese el año de su fecha de nacimiento");
        int anio = Leer.nextInt();
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        people.setfdn(fecha);
        return people;
    }
    
    public void calcularEdad(){
        LocalDate ahora = LocalDate.now();
        LocalDate fechaNac= LocalDate.parse((CharSequence) people.getfdn());
        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("Tu edad es: %s años, %s meses y %s dias", periodo.getYears(), periodo.getMonths(), periodo.getDays());

    }
    
}
