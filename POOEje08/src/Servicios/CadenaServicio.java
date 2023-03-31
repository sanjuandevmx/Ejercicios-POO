/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class CadenaServicio {

    public Scanner Leer = new Scanner(System.in);
    Cadena frase = new Cadena();

    public Cadena crearFrase() {
        System.out.println("Ingrese una frase ");
        frase.setFrase(Leer.nextLine());
        System.out.println("_________________________________________________");
        return frase;

    }

    public void longitudFrase() {
        frase.setLongitud(frase.getFrase().length());

        System.out.println(" La frase " + frase.getFrase() + " tiene " + frase.getLongitud() + " caracteres ");
        System.out.println("_________________________________________________");

    }

    public void invertirFrase() {
        String fraseInvertida;
        char ch[] = frase.getFrase().toCharArray();
        fraseInvertida = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            fraseInvertida += ch[i];

        }
        System.out.println(fraseInvertida);
        System.out.println("_________________________________________________");

    }

    public void vecesRepetido() {
        int posicion = 0;
        int contador = 0;
        System.out.println("Ingrese una letra a buscar");
        String letra = Leer.nextLine();
        posicion = frase.getFrase().indexOf(letra);
        while (posicion != -1) {
            contador++;
            posicion = frase.getFrase().indexOf(letra, posicion + 1);
        }
        System.out.println(" La letra " + letra + " Se repite " + contador + " Veces ");
        System.out.println("_________________________________________________");

    }

    public void compararLongitud() {
        String fraseComparar;
        int longitudFraseNueva;
        System.out.println("Ingrese una frase para comparar");
        fraseComparar = Leer.nextLine();
        longitudFraseNueva = fraseComparar.length();

        if (frase.getLongitud() == longitudFraseNueva) {
            System.out.println(" Ambas cadenas tienen la misma longitud ");

        } else {

            System.out.println("La longitud de las cademas no coincide");
        }
        System.out.println("_________________________________________________");
    }

    public void unirFrases() {

        String fraseConcatenar;
        System.out.println("Ingrese una nueva frase");
        fraseConcatenar = Leer.nextLine();

        System.out.println("La nueva frase es: " + frase.getFrase() + "" + fraseConcatenar);
        System.out.println("_________________________________________________");
    }

}
