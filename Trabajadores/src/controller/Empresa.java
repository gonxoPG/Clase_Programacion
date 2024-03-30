package controller;

import model.Asalariado;
import model.Autonomo;
import model.Jefe;
import model.Trabajador;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Empresa {
    Scanner teclado = new Scanner(System.in);
    private ArrayList<Trabajador> listaTrabajadores;

    public Empresa() {
        listaTrabajadores = new ArrayList<>();
    }

    public void registrarTrabajador() {
        System.out.println("¿Este trabajador es jefe, asalariado o autónomo?");
        String tipo = teclado.next();
        System.out.println("Introduce los datos del trabajador");
        System.out.println("DNI:");
        String DNI = teclado.next();

        if (!estaJefe()) {
            if (buscarTrabajador(DNI) == null) {

                System.out.println("Nombre:");
                String nombre = teclado.next();
                System.out.println("Apellido:");
                String apellido = teclado.next();

                if (tipo.equalsIgnoreCase("jefe")) {
                    System.out.println("Acciones");
                    int acciones = teclado.nextInt();
                    System.out.println("Beneficio");
                    int beneficio = teclado.nextInt();
                    listaTrabajadores.add(new Jefe(nombre, apellido, DNI, acciones, beneficio));
                    System.out.println("Jefe agregado correctamente");
                }

                if (tipo.equalsIgnoreCase("asalariado")) {
                    System.out.println("Sueldo:");
                    int sueldo = teclado.nextInt();
                    System.out.println("Número de pagas");
                    int nPagas = teclado.nextInt();
                    boolean contratado = true;
                    listaTrabajadores.add(new Asalariado(nombre, apellido, DNI, sueldo, nPagas, contratado));
                    System.out.println("Asalariado agregado correctamente");
                }

                if (tipo.equalsIgnoreCase("autónomo")) {
                    System.out.println("Sueldo:");
                    int sueldo = teclado.nextInt();
                    boolean contratado = true;
                    listaTrabajadores.add(new Autonomo(nombre, apellido, DNI, sueldo, contratado));
                    System.out.println("Autónomo agregado correctamente");
                }
            } else {
                System.out.println("El trabajador ya está contratado.");
            }
        } else {
            System.out.println("Solo puede haber un jefe en la empresa.");
        }
    }

    public void despedirTrabajador(String DNI){ // solo puede hacerlo el Jefe, pero no puedo meterlo en la clase Jefe

        if (buscarTrabajador(DNI)==null){
            System.out.println("No se puede despedir porque no existe");
        }else {
            listaTrabajadores.remove(buscarTrabajador(DNI));
            System.out.println("Trabajador despedido.");
        }
    }

    public void listarTrabajadores() {
        System.out.println("¿Qué trabajadores quieres listar: asalariados, autónomos u todos?");
        String listar = teclado.next();

        for (Trabajador item : listaTrabajadores) {
            switch (listar) {
                case "asalariados":
                    if (item instanceof Asalariado) {
                        System.out.println(item.getNombre() +" "+item.getApellido());
                    }
                    break;
                case "autónomos":
                    if (item instanceof Autonomo) {
                        System.out.println(item.getNombre() +" "+item.getApellido());
                    }
                    break;
                default:
                    System.out.println(item.getNombre() +" "+item.getApellido());
            }
        }
    }

    public void mostrarDatos() {
        System.out.println("Introduce el DNI del trabajador");
        String DNI = teclado.next();
        Trabajador trabajadorEncontrando = buscarTrabajador(DNI);
        trabajadorEncontrando.mostrarDatos();
    }

    public Trabajador buscarTrabajador(String DNI) {
        for (Trabajador item : listaTrabajadores) {
            if (item.getDNI().equalsIgnoreCase(DNI)) {
                System.out.println("Trabajador encontrando");
                return item;
            }
        }
        System.out.println("El trabajador todavía no está en la empresa");
        return null;
    }

    public boolean estaJefe() {
        for (Trabajador item : listaTrabajadores) {
            if (item instanceof Jefe) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }
}
