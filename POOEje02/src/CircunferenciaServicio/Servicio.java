/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircunferenciaServicio;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Servicio {

    Scanner Leer = new Scanner(System.in);

    public Circunferencia CrearCircunferencia() {
        Circunferencia circle = new Circunferencia();

        System.out.println("Ingrese el radio de la circunferencia");
        circle.setRadio(Leer.nextFloat());
        return circle;
    }

    public void CalcularPerimetro(Circunferencia circle) {
        double perimetro = (2 * 3.14) * circle.getRadio();
        System.out.println(" El perimetro es de: " + perimetro);

    }
    public void CalcularArea(Circunferencia circle){
        double area = 3.14 * Math.pow(circle.getRadio(), 2);
        System.out.println(" El area es de: " + area);
    }
    
}
