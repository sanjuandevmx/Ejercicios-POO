/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package Services;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class CursoService {

    Scanner Leer = new Scanner(System.in);
    Curso alumn = new Curso();
    
//método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
//en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
//nombre de cada alumno.

    public void CrearCurso() {
        
 
        
        System.out.println("Ingrese el nombre del curso");
        alumn.setNombreCurso(Leer.nextLine());
        System.out.println("Ingrese las horas por dia");
        alumn.setCantidadHorasPorDia(Leer.nextFloat());
        System.out.println("Ingrese la cantidad de dias por semana");
        alumn.setCantidadDiasPorSemana(Leer.nextFloat());
        System.out.println("Ingrese el turno MATUTINO O VESPERTINO");
        alumn.setTurno(Leer.next());
        System.out.println("Ingrese el precio por hora ");
        alumn.setPrecioPorHora(Leer.nextFloat());
        this.cargarAlumno(alumn);
        //cargarAlumno();
this.mostrarAlumno();
    }
    
    
    
    public Curso cargarAlumno(Curso alumn) {

        String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Ingrese el nombre del alumno NO." + (i + 1) + " : ");
            alumnos[i] = Leer.next();

        }
        alumn.setAlumnos(alumnos);
        return alumn;

    }

// Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.     
    public void calcularGananciaSemanal(){
        float precio;
        
        precio = alumn.getCantidadHorasPorDia() * alumn.getPrecioPorHora() * alumn.getCantidadDiasPorSemana() * 5;
        
        System.out.println("La ganancia semanal es de :" + precio);
        
    }
    
    public void mostrarAlumno(){
        this.cargarAlumno(alumn);
         String[] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print(alumnos[i]);
            

        }
    }

}
