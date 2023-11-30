import java.util.Scanner;

public class VocalConsonante {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una vocal o una consonante");

        char letra = scanner.next().charAt(0);

        switch (String.valueOf(letra).toUpperCase().charAt(0)){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");

        }
    }
}
