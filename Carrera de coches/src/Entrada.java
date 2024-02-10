import model.Carrera;
import model.Coche;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        Coche coche1 = new Coche();
        Coche coche2 = new Coche();

        System.out.println("Piloto nº1 -> Indica los datos de tu coche en este orden: marca, modelo, matrícula, CV y CC");
        coche1.setMarca(teclado.next());
        coche1.setModelo(teclado.next());
        coche1.setMatricula(teclado.next());
        coche1.setCv(teclado.nextInt());
        coche1.setCc(teclado.nextInt());

        System.out.println("Piloto nº2 -> Indica los datos de tu coche en este orden: marca, modelo, matrícula, CV y CC");
        coche2.setMarca(teclado.next());
        coche2.setModelo(teclado.next());
        coche2.setMatricula(teclado.next());
        coche2.setCv(teclado.nextInt());
        coche2.setCc(teclado.nextInt());

        Carrera carrera1 = new Carrera(coche1, coche2);
        carrera1.iniciarCarrera();

        coche1.mostrarVelocidadKms();
        coche2.mostrarVelocidadKms();
    }
}
