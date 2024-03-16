package model;

public class Alumno {
    private Asignatura asignatura1, asignatura2, asignatura3;

    public Alumno() {}

    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public Alumno(int param1, int param2, int param3){
        asignatura1 = new Asignatura(param1);
        asignatura2 = new Asignatura(param2);
        asignatura3 = new Asignatura(param3);
    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }

    public void mostrarDatos(){
        System.out.println("Datos de la asignatura 01");
        asignatura1.mostrarDatos();
        System.out.println("Datos de la asignatura 02");
        asignatura2.mostrarDatos();
        System.out.println("Datos de la asignatura 03");
        asignatura3.mostrarDatos();
    }
}
