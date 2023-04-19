/*
//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
//se puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
 */
package pooeje11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class POOEje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);

        int dia, mes, anio;
        
        System.out.println("Ingrese su dia de nacimiento:");
        dia = Leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento con numero:");
        mes = Leer.nextInt();
        System.out.println("Ingrese su año de nacimiento a cuatro digitos");
        anio = Leer.nextInt();
        
        Date fecha = new Date(anio-1900, mes-1, dia);
        Date fechaActual = new Date();
        System.out.println("La fecha ingresada es "+ fecha.toString());
        double diferenciaAnios = fecha.getYear()- fechaActual.getYear();
        System.out.println("Hay" + diferenciaAnios + " años dse diferencia");
        System.out.println("La fecha actual es de:"+ fechaActual);
        
    }

}
