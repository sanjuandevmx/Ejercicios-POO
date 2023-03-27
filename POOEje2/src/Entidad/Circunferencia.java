/*

Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real.

Constructores Vacios y por parametros.
Set & Getter
Area
Perimetro

 */
package Entidad;

/**
 *
 * @author brian
 */
public class Circunferencia {

    private double radio;
    public double area;
    public double perimetro;

    public Circunferencia() {
    }
    
    
    public Circunferencia(double radio, double area, double perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
        
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

}
