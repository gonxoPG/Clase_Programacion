package model;

public abstract class Mueble implements Inventariable{
    private String material;
    private int peso, precio;

    public Mueble() {
    }

    public Mueble(String material, int peso, int precio) {
        this.material = material;
        this.peso = peso;
        this.precio = precio;
    }

    public void mostrarDatos(){
        System.out.println("Material = " + material);
        System.out.println("Peso = " + peso);
        System.out.println("Precio = " + precio);
    }

    @Override
    public void calcularPrecio() {
        System.out.println("El precio de este mueble con IVA incluido es "+(Inventariable.IVA_MUEBLES*this.precio));
    }
}
