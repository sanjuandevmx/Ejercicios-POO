/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package Services;

import Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class CancionService {
    
    Scanner Leer = new Scanner(System.in);
    Cancion cancion1 = new Cancion();
    
    public Cancion cargarCancion(){
        
        System.out.println("Ingrese el nombre de la cancion");
        cancion1.setCancion(Leer.nextLine());
        System.out.println("Ingrese el nombre del autor");
        cancion1.setAutor(Leer.nextLine());
        return cancion1;
    }
    
    public void mostrarCancion(){
        System.out.println("CANCIÓNN");
        System.out.println("_______________________________");
        System.out.println("Cancion: "+ cancion1.getCancion());
        System.out.println("Artista: "+cancion1.getAutor());
    }
}
