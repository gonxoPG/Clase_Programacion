import java.util.Scanner;

public class MenuSimple {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Selecciona una opción del Menú:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Opción 4");
            System.out.println("5. Salir");

            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Has seleccionado la opción 1");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opción 2");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción 3");
                    break;
                case 4:
                    System.out.println("Has seleccionado la opción 4");
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }
        }while (opcion != 5);

        System.out.println("Programa finalizado");
    }
}
