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
    
    public Rectangulo IngresoDatos() {
        
        System.out.println("Ingrese la base");
        form.setBase(Leer.nextFloat());
        System.out.println("Ingrese la altura");
        form.setAltura(Leer.nextFloat());
        return form;
    }
    
    public void Superficie(Rectangulo form){
        form.setSuperficie(form.getBase()*form.getAltura());
        System.out.println(form.getSuperficie());
    }
    
    public void Perimetro(Rectangulo form){
        form.setPerimetro((form.getBase()+form.getAltura())*2);
        System.out.println(form.getPerimetro());
    }
    
    public void dibujarRectangulo( Rectangulo form) {
    for (int i = 0; i < form.getAltura(); i++) {
        for (int j = 0; j < form.getBase(); j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
