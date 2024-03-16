import model.Alumno;
import model.Asignatura;
import model.Profesor;

public class Entrada {

    public static void main(String[] args) {

        Asignatura matematicas = new Asignatura(1);
        Asignatura lengua = new Asignatura(2);
        Asignatura musica = new Asignatura(3);

        Alumno Miguel = new Alumno(matematicas, lengua, musica);

        Profesor tutor = new Profesor();

        tutor.ponerNotas(Miguel);
        System.out.println("La nota media del alumno es "+tutor.calcularMedia(Miguel));

        Miguel.mostrarDatos();
    }
}
