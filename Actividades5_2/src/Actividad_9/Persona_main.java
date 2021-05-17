package Actividad_9;

public class Persona_main {

    public static void main(String[] args){
        Persona persona1 = new Persona ("3454353B");

        persona1.agregarCuenta(1, 0);
        persona1.agregarCuenta(2, 700);

        persona1.getCuentas()[1].recibir_abonos(1100);
        persona1.getCuentas()[2].realizar_pagos(750);

        System.out.println(persona1);
    }

}
