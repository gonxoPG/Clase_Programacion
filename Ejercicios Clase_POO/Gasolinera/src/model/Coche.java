package model;

public class Coche {
    private String tipoGasolina;

    private int litrosDeposito;

    public Coche() {}

    public Coche(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
        //los litrosDeposito estan a 0 por defecto
    }

    public void ponerGasolina(Surtidor surtidor, int cantidad){

        surtidor.quitarGasolina(cantidad);

        if (surtidor.getCapacidadActual() == 0 || surtidor.getCapacidadActual()<cantidad){
            System.out.println("No queda gasolina suficiente en el surtidor");
        } else {
            System.out.println("El surtidor tiene suficiente gasolina");
        litrosDeposito += cantidad;
        //el método quitarGasolina ya resta los listros al surtidor
        }

        if (!surtidor.isFuncionaSurtidor()){
            System.out.println("El surtidor está averiado");
        } else {
            System.out.println("El surtidor funciona correctamente");
            litrosDeposito += cantidad;
            //el método quitarGasolina ya resta los listros al surtidor
        }

        if (!surtidor.getTipoGasolina().equalsIgnoreCase(tipoGasolina)){
            System.out.println("El tipo de gasolina es diferente");
        }else{
            System.out.println("El surtidor tiene la gasolina que necesita el coche");
            litrosDeposito += cantidad;
            //el método quitarGasolina ya resta los listros al surtidor
        }
    }
}
