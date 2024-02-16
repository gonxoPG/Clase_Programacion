package model;

import java.util.Scanner;

public class Carrera {
    private Coche participante1;
    private Coche participante2;
    private Coche ganador;

    private int kmTotales, numeroVueltas, vueltasTotales;
    Scanner teclado = new Scanner(System.in);

    public Carrera() {
    }

    public Carrera(Coche participante1, Coche participante2) {
        this.participante1 = participante1;
        this.participante2 = participante2;
    }

    public void iniciarCarrera() {


        System.out.println("Elige el circuito: ");
        System.out.println("\t1. Circuito de España");
        System.out.println("\t2. Circuito de los Emiratos Árabes Unidos");
        System.out.println("\t3. Circuito de EE.UU.");
        System.out.println("\t4. Circuito de Japón");

        int circuito = teclado.nextInt();

        switch (circuito) {
            case 1:
                System.out.println("¡Has elegido el Circuito de España!");
                kmTotales = 467;
                numeroVueltas = 15;
                break;
            case 2:
                System.out.println("¡Has elegido el Circuito de los Emiratos Árabes Unidos!");
                kmTotales = 617;
                numeroVueltas = 12;
                break;
            case 3:
                System.out.println("¡Has elegido el Circuito de EE.UU.!");
                kmTotales = 620;
                numeroVueltas = 12;
                break;
            case 4:
                System.out.println("¡Has elegido el Circuito de Japón!");
                kmTotales = 580;
                numeroVueltas = 14;
        }

        System.out.println("El número de vueltas es " + numeroVueltas);
        System.out.println("La cantidad de kms es " + kmTotales);
        System.out.println();

        participante1.mostrarDatos();
        participante2.mostrarDatos();

        System.out.println("🏁🚥 ¡EMPIEZA LA CARRERA! 🚥🏁");

        for (int i = 1; i <= numeroVueltas; i++) {

            System.out.println("Vuelta " + i + "/" + numeroVueltas);
            System.out.println("Piloto 1:");
            participante1.acelerar();
            System.out.println("Piloto 2:");
            participante2.acelerar();
        }
        vueltasTotales = numeroVueltas;

        if (participante1.getKms() >= kmTotales || participante2.getKms() >= kmTotales) {

            System.out.println("🏁🏁🏁¡¡FIN DE LA CARRERA!!🏁🏁🏁");

            if (participante1.getKms() >= kmTotales) {

                ganador = participante1;

                if (participante2.getKms() > participante1.getKms()) {

                    ganador = participante2;

                }
            }

        } else {
            /*if (participante1.getKms() < kmTotales || participante2.getKms() < kmTotales)*/

            int vueltaExtra = 1;

            do {

                vueltasTotales = numeroVueltas + vueltaExtra;
                System.out.println("Vuelta " + vueltasTotales + "/" + numeroVueltas);

                System.out.println("Piloto 1:");
                participante1.acelerar();

                System.out.println("Piloto 2:");
                participante2.acelerar();

                vueltaExtra = vueltaExtra + 1;

                if (participante1.getKms() >= kmTotales) {
                    System.out.println("🏁🏁🏁¡¡FIN DE LA CARRERA!!🏁🏁🏁");

                    System.out.println("Han hecho falta " + vueltasTotales + " vueltas para terminar la carrera");

                    ganador = participante1;
                    break;
                } else {
                    if (participante2.getKms() > participante1.getKms()){
                        System.out.println("🏁🏁🏁¡¡FIN DE LA CARRERA!!🏁🏁🏁");

                        System.out.println("Han hecho falta " + vueltasTotales + " vueltas para terminar la carrrera\n");

                        ganador = participante2;
                        break;
                    }
                }

            } while (participante1.getKms() < kmTotales || participante2.getKms() < kmTotales);
        }

        if (participante2.getKms() == participante1.getKms()){

            System.out.println("🏅¡Ha habido un empate!🏅");

        } else {

            System.out.printf("\n🎆🎆🎆🏆¡¡¡El ganador ha sido el coche con matrícula %s!!🏆🎆🎆🎆\n", ganador.getMatricula());

        }
    }
}
