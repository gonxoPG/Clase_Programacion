package model;

public class Terreno {
    private double m2,valorizacion;
    private Orientacion orientacion;
    private Casa casa;

    public Terreno() {}

    public Terreno(double m2) {
        this.m2 = m2;
    }

    class Casa {
        double m2;
        boolean piscina;
        int numHabitaciones;

        public Casa() {
        }

        public Casa(double m2, boolean piscina, int numHabitaciones) {
            this.m2 = m2;
            this.piscina = piscina;
            this.numHabitaciones = numHabitaciones;
        }

        //construirHabitacion(double metros);

        public void construirPiscina(){
            System.out.println("Construyendo una piscina");
            piscina = true;
        }

        //construirAnexo(double metros);


        public void mostrarDatos(){
            System.out.println("Mostrando datos de la casa");
            System.out.println("m2 = " + m2);
            System.out.println("piscina = " + piscina);
            System.out.println("numHabitaciones = " + numHabitaciones);
        }

        public double getM2() {
            return m2;
        }

        public void setM2(double m2) {
            this.m2 = m2;
        }

        public boolean isPiscina() {
            return piscina;
        }

        public void setPiscina(boolean piscina) {
            this.piscina = piscina;
        }

    }

    public void construirCasa(double m2, boolean piscina, int habitaciones){
        casa = new Casa(m2, piscina, habitaciones);
    }

    public void construirPiscinaCasa(){
        casa.construirPiscina();
    }

    public void mostrarDatos(){
        System.out.println("Mostrando datos del terreno");
        System.out.println("m2 = " + m2);
        casa.mostrarDatos();
    }

    /*public void revalorizarCasa(){
        si hay una casa construida...
    }*/

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public double getValorizacion() {
        return valorizacion;
    }

    public void setValorizacion(double valorizacion) {
        this.valorizacion = valorizacion;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
}
