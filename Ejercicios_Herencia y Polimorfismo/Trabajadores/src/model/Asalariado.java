package model;

public class Asalariado extends Trabajador{
    private int sueldo, nPagas;
    private boolean contratado;

    public Asalariado() {}

    public Asalariado(String nombre, String apellido, String DNI, int sueldo, int nPagas, boolean contratado) {
        super(nombre, apellido, DNI);
        this.sueldo = sueldo;
        this.nPagas = nPagas;
        this.contratado = contratado;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        int salarioAnual = sueldo*12;
        System.out.printf("Salario anual: %d Salario mensual: %d Número de pagas: %d\n",salarioAnual,sueldo,nPagas);

        // Nombre: XXX Apellido: XXX DNI: XXX Salario Anual: XXX Salario Mensual: XXX Número de Pagas: XX
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getnPagas() {
        return nPagas;
    }

    public void setnPagas(int nPagas) {
        this.nPagas = nPagas;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
