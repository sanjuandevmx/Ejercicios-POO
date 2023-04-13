/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que 
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda 
almacenar cada producto con su información. Crear una entidad Movil con los atributos 
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será 
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número 
correspondiente al código. A continuación, se implementarán los siguientes métodos: 
 Un constructor por defecto. 
 Un constructor con todos los atributos como parámetro. 
 Métodos getters y setters de cada atributo. 
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para 
instanciar un objeto Celular y poder cargarlo en nuestro programa. 
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete 
números de un celular. Para ello, puede utilizarse un bucle repetitivo 

 */
package Servicios;

import Entidades.Celular;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class CelularService {

    Scanner Leer = new Scanner(System.in);

    Celular cel1 = new Celular();

    public void cargarCelular() {
        System.out.println("Ingrese la marca del celular");
        cel1.setMarca(Leer.nextLine());
        System.out.println("Ingrese el precio del celular");
        cel1.setPrecio(Leer.nextDouble());
        System.out.println("Ingrese el modelo del celular");
        cel1.setModelo(Leer.nextLine());
        System.out.println("Ingrese la memoria ram");
        cel1.setMemoriaRam(Leer.nextLine());
        System.out.println("Ingrese el tamaño de almacenamiento");
        cel1.setAlmacenamiento(Leer.nextLine());
        this.cargarCodigo(cel1);
        

    }

    public Celular cargarCodigo(Celular cel1) {

        int[] codigo = new int[7];
        for (int i = 0; i < codigo.length; i++) {
            System.out.print("Ingrese el codigo del celular:");
            codigo[i] = Leer.nextInt();

        }
        cel1.setCodigo(codigo);
        return cel1;

    }
}
