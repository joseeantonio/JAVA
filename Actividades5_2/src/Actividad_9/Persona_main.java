package Actividad_9;

public class Persona_main {

    public static void main(String[] args){
        Persona persona1 = new Persona ("3454353B");

        Cuenta cuenta1 = new Cuenta(0,0);
        Cuenta cuenta2 = new Cuenta(1, 700);

        persona1.agregarCuenta(cuenta1);
        persona1.agregarCuenta(cuenta2);


        System.out.println(cuenta1);
        System.out.println(cuenta2);

        cuenta1.recibir_abonos(1100);
        cuenta2.realizar_pagos(750);


        System.out.println(cuenta1);
        System.out.println(cuenta2.getSaldo_disponible());


        System.out.println(cuenta1.consultar_saldo_disponible());
        System.out.println(cuenta2.consultar_saldo_disponible());

        if (persona1.persona_morosa()){
            System.out.println("La persona es morosa");
        }


    }

}
