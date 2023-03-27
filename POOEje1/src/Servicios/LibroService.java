/*
  Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.
 */
package Servicios;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class LibroService {

    public Scanner Leer = new Scanner(System.in);

    Libro ln = new Libro();

    public Libro altaLibro() {
        System.out.println(" Ingrese el ISBN ");
        ln.setIsbn(Leer.nextLine());
        System.out.println("Ingrese el titulo del libro ");
        ln.setTitulo(Leer.nextLine());
        System.out.println(" Ingrese el nombre del autor ");
        ln.setAutor(Leer.nextLine());
        System.out.println(" Ingrese el numero de paginas ");
        ln.setNpaginas(Leer.nextInt());
        return ln;

    }

    public Libro mostrarLibro() {
        System.out.println(" El ISBN es: " + ln.getIsbn());
        System.out.println("El nombre del titulo es: " + ln.getTitulo());
        System.out.println("El nombre del autor es:" + ln.getAutor());
        System.out.println(" Tiene " + ln.getNpaginas() + " Paginas ");
       return ln;

    

}
}
// Are you doing the homework now?
// What do you do.
// You have to do Everything for be a champions

