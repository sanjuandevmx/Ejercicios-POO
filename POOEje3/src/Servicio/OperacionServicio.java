/*
int opcion = 0;
        
        do {
            System.out.println("---------------------");
            System.out.println("MENU");
            System.out.println("1 - SUMA"); 
            System.out.println("2 - RESTA"); 
            System.out.println("3 - MULTIPLICACION"); 
            System.out.println("4 - DIVISION"); 
            System.out.println("5 - SALIR"); 
            System.out.println("---------------------"); 
            
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    service.sumar(op1);
                    break;
                case 2:
                    service.restar(op1);
                    break;
                case 3:
                    service.multiplicar(op1);
                    break;
                case 4:
                    service.dividir(op1);
                    break;
                case 5:
                    System.out.println("Saliendo . . . .");
                    break;
                default:
                    System.out.println("Error al elegir una opcion. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class OperacionServicio {

    Scanner Leer = new Scanner(System.in);

    Operacion op1 = new Operacion();

    // Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    public Operacion IngresoDatos() {
        System.out.println(" Ingrese el valor de N1 ");
        op1.setN1(Leer.nextDouble());
        System.out.println(" Ingrese el valor de N2 ");
        op1.setN2(Leer.nextDouble());
        return op1;
    }
//Método sumar(): calcular la suma de los números y devolver el resultado al main.

    public void Sumar(Operacion op1) {
        double suma = op1.getN1() + op1.getN2();
        System.out.println(suma);

    }
// Método restar(): calcular la resta de los números y devolver el resultado al main

    public void Restar(Operacion op1) {
        double resta = op1.getN1() - op1.getN2();
        System.out.println(resta);
    }

    //Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//Si no, se hace la multiplicación y se devuelve el resultado al main.
    public void Multiplicar(Operacion op1) {
        if (op1.getN1() > 0 || op1.getN2() > 0) {
            double producto = op1.getN1() * op1.getN2();
            System.out.println(producto);
        } else {
            System.out.println("Error, uno de los numeros ingresados es 0");
        }

    }
//Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

    public void Division(Operacion op1) {
        if (op1.getN1() > 0 || op1.getN2() > 0) {
            double divi = op1.getN1() / op1.getN2();
            System.out.println(divi);
        } else {
            System.out.println("Error, uno de los numeros ingresados es 0");
        }
    }
}
