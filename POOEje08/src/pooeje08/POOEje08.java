/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada.
 */
package pooeje08;

import Entidades.Cadena;
import Servicios.CadenaServicio;

/**
 *
 * @author brian
 */
public class POOEje08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        CadenaServicio cser = new CadenaServicio();
        Cadena frase3 = cser.crearFrase();
        cser.longitudFrase();
        cser.invertirFrase();
        cser.vecesRepetido();
        cser.compararLongitud();
        cser.unirFrases();
    }
    
}
