/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.
 */
package Entidad;

/**
 *
 * @author brian
 */
public class Libro {

  //Declaramos atributos

    private String isbn;
    private String titulo;
    private String autor;
    private int npaginas;
    
    //Creamos los constructores
    
    //Constructor por defecto

    public Libro() {
    }

    //Constructores por parametros
    public Libro(String isbn, String titulo, String autor, int npaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.npaginas = npaginas;
    }
    
    //Getters and Setters

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(int npaginas) {
        this.npaginas = npaginas;
    }



}

