package model;

public class Carrera {
    Coche participante1 = new Coche();
    Coche participante2 = new Coche();
    Coche ganador = new Coche();

    private int kmTotales, numeroVueltas;
    //crear un menú con X númeroVueltas y kmTotales según el nombre del circuito (inventado)
    public void iniciarCarrera (){
        participante1.mostrarDatos();
        participante2.mostrarDatos();

        System.out.println("🏁🚥 ¡EMPIEZA LA CARRERA! 🚥🏁");

        for (int i = 0; i < numeroVueltas; i++) {

            System.out.println("Vuelta "+i+"/"+numeroVueltas);
            participante1.acelerar();
            participante2.acelerar();
        }
    }
}
