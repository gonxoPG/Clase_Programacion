package model;

import java.util.Scanner;

public class Coche {
    Scanner teclado = new Scanner(System.in);
    private String marca, modelo, matricula;
    private int cv, cc, velocidad;
    private double kms;

    public Coche() {
    }

    public void acelerar (){

        System.out.println("¿Cuántos Km/h quieres acelerar?");
        int velocidadAceleracion = teclado.nextInt();

        int formulaAceleracion1 = 0;
        int formulaAceleracion2 = 0;

        if (cv<=100){
            formulaAceleracion1 = (int) (Math.random()*velocidadAceleracion);
            velocidad += formulaAceleracion1;
            kms += (int) (formulaAceleracion1*0.5);
        }else if (cv > 100){
            formulaAceleracion2 = (int) ((Math.random()*velocidadAceleracion) + 10);
            kms += (int) (formulaAceleracion2*0.5);
        } else {
            velocidad += 10;
            kms += 5;
        }

    }

    public void mostrarDatos (){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Matrícula: "+matricula);
        System.out.println("Cavallos: "+cv);
        System.out.println("Cilindrada: "+cc);
        System.out.println("Velocidad: "+velocidad);
        System.out.println("Kilómetros recorridos: "+kms);
    }

}
