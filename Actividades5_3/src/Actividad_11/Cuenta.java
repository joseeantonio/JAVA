package Actividad_11;

public class Cuenta {

    private int numeroDeCuenta;
    private float saldo;


    public Cuenta(int numeroDeCuenta, float saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "La Cuenta tiene " +
                "este numero de cuenta " + numeroDeCuenta +
                " y saldo  " + saldo +
                '}';
    }


}
