import model.Articulo;
import model.Cuenta;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //ArrayList que permita registrar consumiciones
        ArrayList<Cuenta> registroConsumiciones = new ArrayList<>();

        //Registrar una cuenta en la colección ??
        Cuenta cuenta1 = new Cuenta(01);
        registroConsumiciones.add(cuenta1);
        Cuenta cuenta2 = new Cuenta(02);

        Articulo ordenador = new Articulo("ordenador", 900);
        //cuenta1.agregarArticulo(ordenador);
        Articulo tv = new Articulo("televisión",1500);

        System.out.println("El valor total de la cuenta es "+cuenta1.costeTotalConsumicion());

        cuenta1.setEstado(true);

        System.out.println("Selecciona la cuenta que quieres utilizar:\n1.Cuenta 1\n2.Cuenta 2");
        int seleccion = teclado.nextInt();

        if (seleccion==1){
            System.out.println("Has seleccionado la cuenta 1");
            System.out.println("¿Qué artículos quieres comprar?");
                //se mostrarían los artículos disponibles
                    Articulo articuloComprado = null; //artículo seleccionado
        }else {
            System.out.println("Has seleccionado la cuenta 2");
            System.out.println("¿Qué artículo quieres comprar?");
                //se mostraríanlos artículos disponibles
                    Articulo articuloComprado = null; //artículo seleccionado
        }

    }
}
