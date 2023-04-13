/*

 */
package pooeje013;

import Entidades.Curso;
import Services.CursoService;

public class POOEje013 {

    public static void main(String[] args) {

        CursoService cs = new CursoService();

        Curso curso1 = new Curso();
        cs.CrearCurso();
        cs.cargarAlumno(curso1);
        cs.calcularGananciaSemanal();

    }

}
