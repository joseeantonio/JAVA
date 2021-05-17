package Actividad_9;

public class Cuenta {

    private int numero_de_cuenta;
    private float saldo_disponible;

    public Cuenta(int cuenta, float saldo_disponible) {
        this.numero_de_cuenta = cuenta;
        this.saldo_disponible = saldo_disponible;
    }

    public int getNumeroCuenta() {
        return numero_de_cuenta;
    }

    public void setNumero_de_cuenta(int numero_de_cuenta) {
        this.numero_de_cuenta = numero_de_cuenta;
    }

    public float getSaldo_disponible() {
        return saldo_disponible;
    }

    public void setSaldo_disponible(float saldo_disponible) {
        this.saldo_disponible = saldo_disponible;
    }

    @Override
    public String toString() {
        return "cuenta{" +
                "cuenta=" + numero_de_cuenta +
                ", saldo_disponible=" + saldo_disponible +
                '}';
    }


    public int consultar_saldo_disponible(){
        return (int) saldo_disponible;
    }


    public void recibir_abonos(int abono){
        saldo_disponible=abono+saldo_disponible;
    }


    public void realizar_pagos(int pago){
        saldo_disponible=saldo_disponible-pago;
    }




}