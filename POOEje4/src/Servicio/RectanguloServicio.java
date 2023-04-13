/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class RectanguloServicio {

    /**
     * @param args the command line arguments
     */
    Scanner Leer = new Scanner(System.in);
    
    Rectangulo form = new Rectangulo();
    //Meetodo para crear el rectangulo con los datos ingresados por el usuario
    public Rectangulo IngresoDatos() {
        
        System.out.println("Ingrese la base");
        form.setBase(Leer.nextFloat());
        System.out.println("Ingrese la altura");
        form.setAltura(Leer.nextFloat());
        return form;
    }
    // Metodo Superficie() Servira para calcular la superficie del rectangulo
    public void Superficie(Rectangulo form){
        form.setSuperficie(form.getBase()*form.getAltura());
        System.out.println("La superficie es de "+form.getSuperficie());
    }
    // Metodo Perimetro() Servira para calcular el perimetro del rectangulo
    public void Perimetro(Rectangulo form){
        form.setPerimetro((form.getBase()+form.getAltura())*2);
        System.out.println( "El perimetro es de: "+form.getPerimetro());
    }
    //Metodo dibujarRectangulo Servira para dibujar el rectangulo con Asteriscos
    public void dibujarRectangulo( Rectangulo form) {
    for (int i = 0; i < form.getAltura(); i++) {
        for (int j = 0; j < form.getBase(); j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
