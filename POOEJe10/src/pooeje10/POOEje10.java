//Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.
package pooeje10;

import java.util.Arrays;

/**
 *
 * @author brian
 */
public class POOEje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner Leer = new Scanner(System.in).useDelimiter("\n");

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random() * 10;

        }
        System.out.println(Arrays.toString(arregloA));
        Arrays.sort(arregloA);

        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        
        Arrays.fill(arregloB, 10, 20, 0.5);
        
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println("[" + i + "=" + arregloA[i] + "]");
        }
        for (int i = 0; i < arregloB.length; i++) {
            System.out.println("[" + i + "=" + arregloB[i] + "]");
        }

    }

}
