/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class AhorcadoService {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado palabra = new Ahorcado();

    public Ahorcado crearJuego(Ahorcado palabra) {
        System.out.print("Ingrese la palabra a buscar: ");
        //String[] ahorcado 
        String palabraJuego = Leer.next();
        char[] ahorcado = new char[palabraJuego.length()];
        System.out.println("La longitud de la palabra es de : " + palabraJuego.length());

        return palabra;

    }
}
