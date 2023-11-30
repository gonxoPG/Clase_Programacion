import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número para saber si es par o impar");

        int entero = scanner.nextInt();

        switch (entero%2){

            case 0:
                System.out.println("PAR");
                break;
            default:
                System.out.println("IMPAR");
        }
    }
}
