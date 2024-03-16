import model.Banco;
import model.Cuenta;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String DNI;
        int PIN;
        Cuenta cuentaAsociada;
        double saldo;

        //creo 2 bancos: BBVA y Santander
        Banco BBVA = new Banco("BBVA", "202401A");
        Banco Santander = new Banco("Santander", "202402B");


            System.out.println("Selecciona con qué banco quieres operar:");
            System.out.println("1. BBVA");
            System.out.println("2. Banco Santander");

            int bancoSeleccionado = teclado.nextInt();

            if (bancoSeleccionado == 1) {
                System.out.println("-- Seleccionado BBVA --");

                do {
                    System.out.println("¿Qué operación desea realizar?");
                        System.out.println("1. Crear una cuenta");
                        System.out.println("2. Ingresar dinero");
                        System.out.println("3. Sacar dinero");
                        System.out.println("4. Ver cuenta de un cliente");
                        System.out.println("5. Ver todas las cuentas");

                        int operacionBBVA = teclado.nextInt();

                        switch (operacionBBVA){
                            case 1:
                                System.out.println("-- Seleccionado crear cuenta --");
                                System.out.println("Introduce DNI del titular");
                                DNI = teclado.next();
                                BBVA.abrirCuenta(DNI);
                                System.out.println("Cuenta creada correctamente");
                                break;

                            case 2:
                                System.out.println("-- Seleccionado ingresar dinero");
                                System.out.println("Introduce DNI del titular");
                                DNI = teclado.next();
                                System.out.println("PIN:");
                                PIN = teclado.nextInt();

                                //obtener la cuenta
                                cuentaAsociada = BBVA.estaCuenta(DNI);

                                System.out.println("Introduce saldo a ingresar");
                                saldo = teclado.nextDouble();
                                cuentaAsociada.ingresarDinero(saldo);
                                System.out.println("-- Dinero ingresado correctamente");
                                break;

                            case 3:
                                System.out.println("-- Seleccionado retirar dinero --");
                                System.out.println("Introduce DNI del titular");
                                DNI = teclado.next();
                                System.out.println("PIN:");
                                PIN = teclado.nextInt();

                                //obtener cuenta
                                cuentaAsociada = BBVA.estaCuenta(DNI);

                                System.out.println("Introduce saldo a retirar");
                                saldo = teclado.nextDouble();
                                cuentaAsociada.retirarDinero(saldo);
                                System.out.println("-- Dinero retirado correctamente");
                                break;

                            case 4:
                                System.out.println("-- Seleccionado ver cuentas cliente");

                                break;
                        }

                }while ();

            } else if (bancoSeleccionado == 2) {
                System.out.println("-- Seleccionado Banco Santander --");

                do {

                }while ();

            } else {
                System.out.println("Error en la selección");
            }

    }
}
