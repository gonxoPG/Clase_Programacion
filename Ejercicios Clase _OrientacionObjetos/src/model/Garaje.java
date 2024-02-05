package model;

public class Garaje {
    private Coche coche;
    private String averiaAsociada;
    private int acumuladoCoches;
    private boolean atender;
    private int atendiendoCoche;

    public void aceptarCoche(int coche, String averia) {

        //El garaje solo podrá atender a un coche en cada momento.
        while (atender) {
            atendiendoCoche = 1;

            if (atendiendoCoche <= 1) {
                this.acumuladoCoches += 1;
                this.averiaAsociada = averia;
            } else {
                atender = false;
            }
        }
        atendiendoCoche = 0;
    }

    public void devolverCoche (){
        if (atendiendoCoche == 0) {
            atender = true;
            // ¿Y por qué no lo declaramos ya arriba = true?
        }
    }

    public String getAveriaAsociada() {
        return averiaAsociada;
    }

    public Coche getCoche() {
        return coche;
    }
}
