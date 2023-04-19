/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Distancia;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class DistanciaServicios {

    Scanner Leer = new Scanner(System.in);

    public Distancia crearPuntos() {
        Distancia d1 = new Distancia();

        System.out.println("Ingrese el primer bloque de puntos");
        System.out.println("Ingrese el valor de x1");
        d1.setX1(Leer.nextInt());
        System.out.println("Ingrese el valor de y1");
        d1.setY1(Leer.nextInt());
        System.out.println("Ingrese el segundo bloque de puntos");
        System.out.println("Ingrese el valor de x2");
        d1.setX2(Leer.nextInt());
        System.out.println("Ingrese el valor de y2");
        d1.setY2(Leer.nextInt());

        return d1;

    }
    
     public double calcularDistancia(Distancia d1){
        double distancia1 = 0;
        distancia1 = Math.sqrt((Math.pow((d1.getX2()-d1.getX1()), 2))+(Math.pow((d1.getY2()-d1.getY1()), 2)));
        return distancia1;
    }

}
