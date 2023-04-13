/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package Entidades;

/**
 *
 * @author brian
 */
public class Cancion {
    
    private String cancion;
    private String autor;

    public Cancion() {
    }

    public Cancion(String cancion, String autor) {
        this.cancion = cancion;
        this.autor = autor;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "cancion=" + cancion + ", autor=" + autor + '}';
    }
    
        
    
}
