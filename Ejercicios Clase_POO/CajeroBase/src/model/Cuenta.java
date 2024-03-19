package model;

import java.util.Scanner;

public class Cuenta {
    int ISBN, PIN;
    double saldo;
    String DNI;

    Scanner teclado = new Scanner(System.in);

    public Cuenta() {}

    public Cuenta(int ISBN, int PIN, double saldo, String DNI) {
        this.ISBN = ISBN;
        this.PIN = PIN;
        this.saldo = saldo;
        this.DNI = DNI;
    }

    public void ingresarDinero(double dineroIngresado){

        System.out.println("Introduzca su DNI y su PIN:");
        if (iniciarSesión(teclado.next(),teclado.nextInt())) {

            System.out.println("¿Cuánto dinero desa ingresar?");
            dineroIngresado = teclado.nextDouble();

            if (dineroIngresado >= 0) {
                this.saldo += dineroIngresado;
            } else {
                System.out.println("La cantidad introducida no es válida");
            }
        }
    }

    public void retirarDinero(double dineroRetirado){

        System.out.println("Introduzca su DNI y su PIN:");
        if (iniciarSesión(teclado.next(),teclado.nextInt())){

            System.out.println("¿Cuánto dinero desa retirar?");
            dineroRetirado = teclado.nextDouble();

            if (dineroRetirado <= saldo) {
                this.saldo -= dineroRetirado;
            } else {
                System.out.println("No tiene saldo suficiente");
            }
        }
    }

    public void mostrarDatos(){
        System.out.println("Las cuentas asociadas del cliente con DNI "+DNI+" son:");
        System.out.println("Cuenta nº = " + ISBN);
        System.out.println("PIN = " + PIN);
        System.out.println("Saldo = " + saldo);
    }

    public boolean iniciarSesión(String DNI, int PIN){
        if (this.DNI.equals(DNI) && this.PIN == PIN){
            System.out.println("Identificación correcta");
            return true;
        } else if ((this.DNI.equals(DNI)) && this.PIN != PIN){
            System.out.println("El PIN es erróneo");
            return false;
        }else if (this.PIN == PIN && (!this.DNI.equals(DNI))) {
            System.out.println("El DNI es erróneo");
            return false;
        }else{
            System.out.println("Algo no ha ido bien");
            return false;
        }
    }


    public String getDNI() {
        return DNI;
    }
}

