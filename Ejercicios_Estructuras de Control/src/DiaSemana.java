import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número de semana");
        int numeroSemana = scanner.nextInt();

        switch (numeroSemana) {

            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIÉRCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SÁBADO");
                break;
            case 7:
                System.out.println("DOMINGO");
            default:
                System.out.println("El día introducido no es válido, tiene que estar entre 1 y 7");
        }
    }
}
