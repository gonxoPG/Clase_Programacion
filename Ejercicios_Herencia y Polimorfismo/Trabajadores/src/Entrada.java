import controller.Empresa;
import model.Asalariado;
import model.Autonomo;
import model.Jefe;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Empresa empresa = new Empresa();
        Jefe jefe = new Jefe();
        Asalariado asalariado = new Asalariado();
        Autonomo autonomo = new Autonomo();

        empresa.registrarTrabajador();
        empresa.registrarTrabajador();
        empresa.listarTrabajadores();
        empresa.mostrarDatos();
        System.out.println("Introduce el DNI del trabajador a despedir:");
        jefe.despedirTrabajador(teclado.next());
    }
}
