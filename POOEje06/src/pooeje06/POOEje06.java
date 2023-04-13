/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje06;

import Service.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class POOEje06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        CafeteraService nesspreso = new CafeteraService();

        int option;
        do {
            System.out.println("Ingrese una de las opciones");
            System.out.println("1 Llenar cafetera");
            System.out.println("2 Servir taza");
            System.out.println("3 Vaciar cafetera");
            System.out.println("4 Agregar cafe");
            option = Leer.nextInt();

            switch (option) {
                case 1:
                    nesspreso.llenarCafetera();
                    break;
                case 2:
                    nesspreso.servirTaza();
                    break;
                case 3:
                    nesspreso.vaciarCafetera();
                    break;
                case 4:
                    nesspreso.agregarCafe();
                    break;
                case 5:
                    nesspreso.llenarCafetera();
                case 6:
                    System.out.println("Apagando cafetera..............");
                default:
                    System.out.println("Opcion incorrecta, ingrese una opcion valida");
            }
        } while (option != 6);

    }

}
