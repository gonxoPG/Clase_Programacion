import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraInversa = "";

        System.out.println("Introduce una palabra sin acentos: ");
        String palabraIntroducida = sc.next();

        if (palabraIntroducida.length() < 4){
            palabraIntroducida = palabraIntroducida.toUpperCase();
            System.out.println(palabraIntroducida);
        } else if (palabraIntroducida.length() < 8) {
            palabraIntroducida = palabraIntroducida.toLowerCase();
            System.out.println(palabraIntroducida);
        } else if (palabraIntroducida.length() < 11) {
            palabraIntroducida = palabraIntroducida.replace("a","á").replace("e","é")
                    .replace("o","ó").replace("i","í")
                    .replace("u","ú");

            System.out.println(palabraIntroducida);
        }else {

            for (int i = palabraIntroducida.length()-1; i >= 0; i--) {
                palabraInversa += palabraIntroducida.charAt(i);
            }
            System.out.println("La palabra dada la vuelta es "+palabraInversa+ " sobre la original "+palabraIntroducida);
        }
    }
}
