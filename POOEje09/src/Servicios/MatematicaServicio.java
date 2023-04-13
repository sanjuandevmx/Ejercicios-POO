/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Matematica;

/**
 *
 * @author brian
 */
public class MatematicaServicio {

    Matematica math = new Matematica();

    public Matematica generarNumeros() {
        math.setnReal1(Math.random() * 10);
        math.setnReal2(Math.random() * 10);
        System.out.println(math.getnReal1());
        System.out.println(math.getnReal2());
        return math;

    }

    //Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public void devolverMayor(Matematica math) {

        if (math.getnReal1() > math.getnReal2()) {
            System.out.println(math.getnReal1() + "Es mayor que " + math.getnReal2());
//          double numMayor= math.getnReal1();
//          double numMenor= math.getnReal2();
            if (math.getnReal2() > math.getnReal1()) {
                System.out.println(math.getnReal2() + "Es mayor");
//                numMayor=math.getnReal2();
//                numMenor=math.getnReal1();
            }
        }

    }

    //Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
    public void calcularPotencia(Matematica math) {
        math.setnReal1(Math.round(math.getnReal1()));
        math.setnReal2(Math.round(math.getnReal2()));
        System.out.println(math.getnReal1() + "  || " + math.getnReal2());
        if (math.getnReal1() >= math.getnReal2()) {

            System.out.println("el resultado de la potencia es : " + Math.pow(math.getnReal1(), math.getnReal2()));
        } else {
            System.out.println("el resultado de la potencia es : " + Math.pow(math.getnReal2(), math.getnReal1()));
        }

    }
 //Metodo calcularRaiz() para calcular la raiz cuadrada del menor de los dos valores, antes de calcular la raiz cuadrada se debe obtener el valor absoluto de los dos numeros.
 public void calcularRaiz(Matematica math){
     math.setnReal1(Math.abs(math.getnReal1()));
        math.setnReal2(Math.abs(math.getnReal2()));
        System.out.println(math.getnReal1() + "  || " + math.getnReal2());
        if (math.getnReal1() >= math.getnReal2()) {

            System.out.println("el resultado de la raiz es : " + Math.sqrt(math.getnReal2()));
        } else {
            System.out.println("el resultado de la raiz es : " + Math.sqrt(math.getnReal1()));
        }
 } 
}
