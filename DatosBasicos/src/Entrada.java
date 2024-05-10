import model.Usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usuario;
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        String respuesta;

        do {

            System.out.println("Introduce nombre, apellido, DNI, número de teléfono y edad para crear un nuevo usuario:");

            usuario = new Usuario(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt());

            System.out.println("Usuario creado correctamente\n");

            listaUsuarios.add(usuario);
            System.out.println("Usuario agregado correctamente\n");


            System.out.println("¿Quieres crear otro usuario? Y / N");
            respuesta = sc.next();

        } while (respuesta.equalsIgnoreCase("Y"));

        for (Usuario item : listaUsuarios) {
            System.out.println(item);
        }
        System.out.println();

        File file = new File("src/resources/usuarios.txt");
        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(new FileWriter(file));

            for (int i = 0; i < listaUsuarios.size(); i++) {

                Usuario item = listaUsuarios.get(i);

                printWriter.println("Usuario "+(i+1));
                printWriter.println("- Nombre: "+item.getNombre());
                printWriter.println("- Apellido: "+item.getApellido());
                printWriter.println("- DNI: "+item.getDNI());
                printWriter.println("- Teléfono: "+item.getTelefono());
                printWriter.println("- Edad: "+item.getEdad());

            }

            System.out.println("Usuarios exportados correctamente");
        } catch (IOException e) {
            System.out.println("Error en la escritura");
        }finally {
            printWriter.close();
        }
    }
}
