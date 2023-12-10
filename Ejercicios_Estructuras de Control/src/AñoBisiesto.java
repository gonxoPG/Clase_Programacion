import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {
        System.out.println("Introduce un año para saber si es bisiesto");
        Scanner scanner = new Scanner(System.in);
        int año = scanner.nextInt();

        if (año%4==0){
            System.out.println("Este año es bisiesto");
        }else{
            System.out.println("Este año no es bisiesto");
        }
    }
}
