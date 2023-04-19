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
        prsn.setNombre(Leer.next());
        System.out.println(" Ingrese edad ");
        prsn.setEdad(Leer.nextInt());
        System.out.println("Elige tu sexo");
        prsn.setSexo(Leer.next().toUpperCase().charAt(0));
        while (prsn.getSexo() != 'H' && prsn.getSexo() != 'M' && prsn.getSexo() != 'O') {
            System.out.println("ERROR. Vuelva a ingresar su sexo(H - Hombre // M - Mujer // O - Otro): ");
            prsn.setSexo(Leer.next().toUpperCase().charAt(0));
        }
        System.out.println("Ingrese su peso");
        prsn.setPeso(Leer.nextDouble());
        System.out.println("Ingrese su altura");
        prsn.setAltura(Leer.nextDouble());
        return prsn;
    }

    public int calcularIMC(Persona peso, int altura) {
        int x = 0;
        double formulaIMC = prsn.getPeso() / (Math.pow(prsn.getAltura(), 2));
        if (formulaIMC < 20) {
            x = -1;
        } else if (formulaIMC >= 20 && formulaIMC <= 25) {
            x = 0;
        } else {
            x = 1;
        }
        return x;
    }

    public boolean esMayorDeEdad(Persona edad) {
        boolean mayorDeEdad = false;
        if (prsn.getEdad() >= 18) {
            mayorDeEdad = true;

        }
        return mayorDeEdad;
    }
}
