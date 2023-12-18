import java.util.Random;

public class Dado {
    public static void main(String[] args) {
        int lanzamiento = 100;
        int dado = 0;
        Random aleatorio = new Random();

        for (int i = 0; i <= lanzamiento; i++) {
            dado = aleatorio.nextInt(6)+1;

            System.out.println(dado);
        }
    }
}
