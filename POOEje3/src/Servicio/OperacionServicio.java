/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    

public Operacion IngresoDatos(){
    System.out.println(" Ingrese el valor de N1 ");
    op1.setN1(Leer.nextDouble());
    System.out.println(" Ingrese el valor de N2 ");
    op1.setN2(Leer.nextDouble());
    return op1;
}    

public void Sumar( Operacion op1){
  double  suma = op1.getN1() + op1.getN2();
    System.out.println(suma);
    
}

public void Restar(Operacion op1){
    double resta = op1.getN1() - op1.getN2();
    System.out.println(resta);
}

public void Multiplicar(Operacion op1){
    double producto = op1.getN1() * op1.getN2();
    System.out.println(producto);
    
}

public void Dividir(Operacion op1){
    double division = op1.getN1() / op1.getN2();
    System.out.println(division);
}
}
