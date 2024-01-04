import java.util.Scanner;

public class MenuCalculo {

    public static void main(String[] args) {
        int opcion = 0;
        int operando1 = 0;
        int operando2 = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Bienvenido a la aplicación de cálculos.");

            System.out.println("Introduce operando 1:");
            operando1 = scanner.nextInt();
            System.out.println("Introduce operando 2:");
            operando2= scanner.nextInt();

            System.out.println("Selecciona que operación quieres hacer con los operandos introducidos:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Módulo");
            System.out.println("6. Salir");

            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El resultado de la operación es "+(operando1+operando2));
                    break;
                case 2:
                    System.out.println("El resultado de la operación es "+(operando1-operando2));
                    break;
                case 3:
                    System.out.println("El resultado de la operación es "+(operando1*operando2));
                    break;
                case 4:
                    System.out.println("El resultado de la operación es "+(operando1/operando2));
                case 5:
                    System.out.println("El resultado de la operación es "+(operando1%operando2));
                    break;
                case 6:
                    System.out.println("Saliendo...");
                default:
                    System.out.println("Opción no contemplada");
            }
        }while (opcion != 6);

        System.out.println("Programa finalizado");
    }
}
