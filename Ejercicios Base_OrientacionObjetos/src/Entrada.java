import model.Persona;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu nombre, apellido, DNI, edad, peso y altura");
        String nombre = teclado.next();
        String apellido = teclado.next();
        String DNI = teclado.next();
        double edad = teclado.nextDouble();
        double peso = teclado.nextDouble();
        int altura = teclado.nextInt();

        Persona persona1 = new Persona(nombre, apellido, DNI, edad, peso, altura);
        Persona persona2 = new Persona("Gonzalo", "Pastor");
        Persona persona3 = new Persona();

        persona1.mostrarDatos();
        System.out.println();
        persona2.mostrarDatos();
        System.out.println();
        persona3.mostrarDatos();

        System.out.println();

        persona1.setEdad(20);
        persona2.setEdad(20);
        persona3.setEdad(20);

        System.out.println();
        persona1.mostrarDatos();
        System.out.println();
        persona2.mostrarDatos();
        System.out.println();
        persona3.mostrarDatos();

        System.out.println();
        persona1.IMC();

        System.out.println();
        System.out.println("¿Eres hombre o mujer?");
        persona1.generoIMC(teclado.next());

    }
}
