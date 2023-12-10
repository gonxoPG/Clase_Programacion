import java.util.Scanner;

public class CodigoProducto {
    public static void main(String[] args) {
        System.out.println("Introduce el código de producto");
        Scanner scanner = new Scanner(System.in);
        String codProducto = scanner.next();

        switch (codProducto){

            case "A001":
                System.out.println("Leche (10€)");
                break;
            case "B002":
                System.out.println("Pan (1€)");
                break;
            case "C003":
                System.out.println("Huevos (5€)");
                break;
            case "D004":
                System.out.println("Agua 2€");
                break;
            default:
                System.out.println("Producto no encontrado");
        }
    }
}
