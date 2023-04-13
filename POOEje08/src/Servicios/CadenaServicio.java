/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    public Scanner Leer = new Scanner(System.in);
    Cadena frase = new Cadena();

    /*
Metodo crearFrase() Pide al usuario una frase para empezar a trabajar con los siguientes metodos.
     */
    public Cadena crearFrase() {
        System.out.println("Ingrese una frase ");
        String fraseSinFormato= Leer.nextLine();
        frase.setFrase(fraseSinFormato.toLowerCase());
        System.out.println(frase.getFrase());
        System.out.println("_________________________________________________");
        return frase;

    }

    /*
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
     */
    public void mostrarVocales() {
        String vocalA = "a";
        String vocalE = "e";
        String vocalI = "i";
        String vocalO = "o";
        String vocalU = "u";
        int posicionA, posicionE, posicionI, posicionO, posicionU = 0;
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        posicionA = frase.getFrase().indexOf(vocalA);
        while (posicionA != -1) {
            contadorA++;
            posicionA = frase.getFrase().indexOf(vocalA, posicionA + 1);
        }
        System.out.println("La vocal A aparece "+contadorA+"veces");
        posicionE = frase.getFrase().indexOf(vocalE);
        while (posicionE != -1) {
            contadorE++;
            posicionE = frase.getFrase().indexOf(vocalE, posicionE + 1);
        }
        System.out.println("La vocal E aparece "+contadorE+"veces");
        posicionI = frase.getFrase().indexOf(vocalI);
        while (posicionI != -1) {
            contadorI++;
            posicionI = frase.getFrase().indexOf(vocalI, posicionI + 1);
        }
        System.out.println("La vocal I aparece "+contadorI+"veces");
        posicionO = frase.getFrase().indexOf(vocalO);
        while (posicionO != -1) {
            contadorO++;
            posicionO = frase.getFrase().indexOf(vocalO, posicionO + 1);
        }
        System.out.println("La vocal O aparece "+contadorO+"veces");
        posicionU = frase.getFrase().indexOf(vocalU);
        while (posicionU != -1) {
            contadorU++;
            posicionU = frase.getFrase().indexOf(vocalU, posicionU + 1);
        }
        System.out.println( "La vocal U aparece "+contadorU+"veces");

        System.out.println("___________________________________________________-");
    }

    /*
Metodo longitudFrase() Calcula la longitud de la frase ingresada, de manera automatica con el uso de los Getters and Setters
     */
    public void longitudFrase() {
        frase.setLongitud(frase.getFrase().length());

        System.out.println(" La frase " + frase.getFrase() + " tiene " + frase.getLongitud() + " caracteres ");
        System.out.println("_________________________________________________");

    }

    /*
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
     */
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

    /*
  Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase
     */
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

    /*
Método compararLongitud(), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
     */
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

    /*
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     */
    public void unirFrases() {

        String fraseConcatenar;
        System.out.println("Ingrese una nueva frase");
        fraseConcatenar = Leer.nextLine();

        System.out.println("La nueva frase es: " + frase.getFrase() + "" + fraseConcatenar);
        System.out.println("_________________________________________________");
    }

    /*
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
     */
    public void reemplazar() {
        char nuevoCaracter;
        String fraseNueva;
        System.out.println(" Ingrese un caracter ");
        nuevoCaracter = Leer.nextLine().charAt(0);
        fraseNueva = frase.getFrase().replace('a', nuevoCaracter);

        System.out.println(fraseNueva);
        System.out.println("_________________________________________________________");

    }

    /*
 Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    public void contiene() {
        String letraValidar;
        System.out.println("Ingrese la letra a buscar");
        letraValidar = Leer.nextLine();
        boolean cierto = frase.getFrase().contains(letraValidar);
        System.out.println(cierto);
        System.out.println("__________________________________________________________");
    }
}
