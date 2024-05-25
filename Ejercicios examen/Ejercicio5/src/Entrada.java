import controller.Colegio;
import model.Alumno;

public class Entrada {
    public static void main(String[] args) {
        Colegio colegio = new Colegio();

        Alumno alumno1 = new Alumno("Gonzalo", "Pastor", "1234A");
        Alumno alumno2 = new Alumno("Ana", "Sánchez", "2345B");
        Alumno alumno3 = new Alumno("Borja", "Martín", "3456C");
        Alumno alumno4 = new Alumno("Francisco", "Romero", "4567D");

        colegio.darAlta(alumno1);
        colegio.darAlta(alumno2);
        colegio.darAlta(alumno3);
        colegio.darAlta(alumno4);

        colegio.calificarAlumno(0001, 8.75);
        colegio.calificarAlumno(0002, 9.5);
        colegio.calificarAlumno(0003, 5.25);
        colegio.calificarAlumno(0004, 4.20);

        colegio.listarAlumnos();
    }
}

    // Ha cogido la matriculación 0000 pero lo ha convertido a un dígito
