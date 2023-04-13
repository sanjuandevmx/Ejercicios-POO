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
    

    public void llenarCafetera() {
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
        System.out.println("La cafetera tiene:" + cafe.getCantidadActual());
    }
 public void servirTaza(){
     System.out.println("Ingrese el tamaño de la taza");
      int taza = Leer.nextInt();
     cafe.setCantidadActual(cafe.getCantidadActual()-taza) ;
     System.out.println(cafe.getCantidadActual());
     System.out.println("_____________________________________");
     
 }
 public void vaciarCafetera(){
     cafe.setCantidadActual(0);
     double cafeteraVacia = cafe.getCantidadActual();
     if (cafeteraVacia == 0){
         System.out.println("Vaciando CAFETERA..........");
         System.out.println("La cafetera se ah vaciado con EXITO");
         System.out.println("_____________________________________");
     } else {
         System.out.println("Error al vaciar cafetera");
         System.out.println("_____________________________________");
     }
 }
 public void agregarCafe(){
     System.out.println("Ingrese una cantidad de Cafe");
     double cantidadCafe = Leer.nextDouble();
     cafe.setCantidadActual(cantidadCafe);
     System.out.println("Agregando Cafe..............");
     System.out.println("El cafe se relleno con exito");
     System.out.println("La cantidad de cafe es de "+ cafe.getCantidadActual());
     System.out.println("_____________________________________");
 }
}
