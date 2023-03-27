/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class CircunferenciaServicio {

    Scanner Leer = new Scanner(System.in);

    Circunferencia c1 = new Circunferencia();

    public Circunferencia CrearCircunferencia() {

        System.out.println(" Ingrese el radio ");
        c1.setRadio(Leer.nextDouble());
        return c1;

    }

    public void CalcularArea(Circunferencia c1) {
        c1.setArea(c1.getRadio() * 3.1416);
        System.out.println(c1.getArea());
    }

    public void CalcularPerimetro(Circunferencia c1) {
        c1.setPerimetro(3.1416 * 2 * c1.getRadio());
        System.out.println(c1.getPerimetro());
    }

}
