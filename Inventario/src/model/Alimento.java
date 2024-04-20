package model;

public abstract class Alimento implements Inventariable{
    private String calidad, origen;
    private int precio;

    public Alimento() {
    }

    public Alimento(String calidad, String origen, int precio) {
        this.calidad = calidad;
        this.origen = origen;
        this.precio = precio;
    }

    public void mostrarDatos (){
        System.out.println("Calidad = " + calidad);
        System.out.println("Origen = " + origen);
        System.out.println("Precio = " + precio);
    }

    @Override
    public void calcularPrecio() {
        System.out.println("El precio de este alimento con IVA incluido es "+(Inventariable.IVA_ALIMENTOS*this.precio));
    }
}
