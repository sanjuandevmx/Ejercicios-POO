/*
 Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, 
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura
 */
package Entidad;

/**
 *
 *
 *
 */
public class Persona {

    //La clase persona tiene los siguientes atributos: nombre, edad, sexo ("H", "M", "NB") de la clase String
    private String nombre;
    private int edad;
    private String sexo;

    //Creamos un constructor por defecto

    public Persona() {
    }
    
   //Creamos un constructor por cada uno de los atributos

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    //Creamos los metodos Getter and Setter de todos los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //Generamos un toString para pasar todos los valores en una cadena.

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
    
    
}
