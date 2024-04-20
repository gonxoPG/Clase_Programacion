import model.Ingrediente;
import model.Pizza;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre de la pizza que quieres:");
        Pizza pizza = new Pizza(teclado.next());

        String respuesta;
        do {
            System.out.println("Indica un ingrediente y su precio:");
            pizza.aniadirIngrediente(new Ingrediente(teclado.next(), teclado.nextDouble()));

            System.out.println("¿Quieres añadir más ingredientes?");
            respuesta = teclado.next();

        } while (respuesta.equalsIgnoreCase("Si"));

        pizza.mostrarDatos();
    }
}
