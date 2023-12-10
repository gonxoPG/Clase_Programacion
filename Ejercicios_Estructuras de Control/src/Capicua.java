import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        System.out.println("Introduce un número entre 1000 y 9999 para saber si es capicúa");
        Scanner scanner = new Scanner(System.in);
        int capicua = scanner.nextInt();
        String numeroPalabra = String.valueOf(capicua);

        if (capicua>=1000 && capicua<=9999){
        System.out.println("El número tiene 4 dígitos");
            if (numeroPalabra.charAt(0) == numeroPalabra.charAt(3) && numeroPalabra.charAt(1) == numeroPalabra.charAt(2)){
                System.out.println("El número es capicúa");
            }else {
                System.out.println("El número no es capicúa");
            }
        }else {
            System.out.println("El número no tiene 4 dígitos");
        }
    }
}
