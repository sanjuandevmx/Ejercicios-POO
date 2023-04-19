/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class CafeteraService {

    Scanner Leer = new Scanner(System.in);
    Cafetera cafe = new Cafetera();

    public Cafetera crearCafetera() {
        Cafetera cafetera = new Cafetera();
        System.out.println("Ingrese la capacidad maxima de la cafetera en ml: ");
        cafe.setCapacidadMaxima(Leer.nextDouble());
        return cafe;
    }

    public void llenarCafetera() {
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
        System.out.println("La cafetera tiene:" + cafe.getCantidadActual());
    }

    public void servirTaza() {
        System.out.println("Ingrese el tamaño de la taza");
        int taza = Leer.nextInt();
        if (taza <= cafe.getCantidadActual()) {
            cafe.setCantidadActual(cafe.getCantidadActual() - taza);
            System.out.println("Taza llenada con exito, quedan: " + cafe.getCantidadActual() + "ml de cafe");
        } else {
            
            System.out.println("Cafe insuficiente, " + "El porcentaje que se ha llenado de la taza es: " + (100 * cafe.getCantidadActual()) / taza + "%.");

            cafe.setCantidadActual(0);
            // System.out.println(cafe.getCantidadActual());
            System.out.println("_____________________________________");

        }
    }

    public void vaciarCafetera() {

        if (cafe.getCantidadActual() == 0) {
            System.out.println("CAFETERA VACIA");
            System.out.println("");
            System.out.println("_____________________________________");
        } else {
            cafe.setCantidadActual(0);
            System.out.println("VACIANDO CAFETERA............");
            System.out.println("LA CAFETERA SE AH VACIADO CON EXITO");
            System.out.println("_____________________________________");
        }
    }

    public void agregarCafe() {

        System.out.println("Agregando Cafe..............");
        System.out.println("El cafe se relleno con exito");
        System.out.println("La cantidad de cafe es de " + cafe.getCantidadActual());
        System.out.println("Puede agregar un maximo de: " + (cafe.getCapacidadMaxima() - cafe.getCantidadActual()) + " ml de cafe.");
        cafe.setCantidadActual(cafe.getCantidadActual() + Leer.nextInt());
        System.out.println("_____________________________________");
    }
}
