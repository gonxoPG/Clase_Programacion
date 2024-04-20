public class Cuenta {
    private String numeroCuenta;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void realizarTransaccion (double cantidad) throws IllegalArgumentException, SaldoInsuficienteExcepcion {

        if (cantidad<0) {
            //lanza excepción IllegalArgumentException indicando que la cantidad debe ser positiva
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }else if (cantidad>this.saldo) {
            //excepción personalizada SaldoInsuficienteException
            throw new SaldoInsuficienteExcepcion("La cantidad es superior al saldo actual");
        }else {
            this.saldo = saldo - cantidad;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
