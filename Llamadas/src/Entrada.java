import controller.Centralita;
import model.LlamadaLocal;
import model.LlamadaNacional;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Centralita centralita = new Centralita(new ArrayList<>(),new ArrayList<>(),0);
        int seleccion;
        do {

            System.out.println("Elige una de estas opciones:");
            System.out.println("1. Agregar llamada local");
            System.out.println("2. Agregar llamada nacional");
            System.out.println("3. Mostrar datos llamadas locales");
            System.out.println("4. Mostrar datos llamadas nacionales");
            System.out.println("5. Mostrar coste acumulado");

            seleccion = teclado.nextInt();
            switch (seleccion) {
                case 1:
                    centralita.agregarLocal(new LlamadaLocal(123456789, 987654321, 120));
                    System.out.println();
                    break;

                case 2:
                    centralita.agregarNacional(new LlamadaNacional(369258147, 741852963, 'A', 200));
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Los datos de las llamadas locales son:");
                    centralita.listarLocales();
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Los datos de las llamadas nacionales son:");
                    centralita.listarNacionales();
                    System.out.println();
                    break;

                case 5:
                    double costeLocales =0;
                    double costeNacionales = 0;

                    for (LlamadaLocal item : centralita.getListaLocales()){
                        costeLocales = item.getCoste();
                    }
                    for (LlamadaNacional item : centralita.getListaNacionales()){
                        costeNacionales = item.getCoste();
                    }

                    int acumulado = (int) (costeLocales+costeNacionales);

                    centralita.setCosteAcumulado(acumulado);
                    centralita.mostrarCostes();
                    System.out.println();
                    break;

                default:
                    System.out.println("No has seleccionado ninguna de las opciones");
            }
        }while (seleccion <=5);
        System.out.println("Programa finalizado");
    }
}
