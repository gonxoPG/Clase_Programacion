import java.util.Scanner;

public class NotasTipos {
    public static void main(String[] args) {

        int aprobados = 0, condicionados = 0, suspensos = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce la nota del alumno");

            int notaAlumno = scanner.nextInt();

            if (notaAlumno>=5){
                aprobados++;
            } else if (notaAlumno==4){
                condicionados++;
            }else{
                suspensos++;
            }
        }
        System.out.println("La cantidad de alumnos aprobados es "+aprobados);
        System.out.println("La cantidad de alumnos condicionados es "+condicionados);
        System.out.println("La cantidad de alumnos suspensos es "+suspensos);

    }
}
