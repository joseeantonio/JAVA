package Actividad_8;

import java.util.Scanner;

public class tiempo_main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int horas;
        int minutos;
        int segundos;

        System.out.println("Introduzca la hora:");
        horas = sc.nextInt();
        System.out.println("Introduzca los minutos:");
        minutos = sc.nextInt();

        System.out.println("Introduzca los segundos:");
        segundos= sc.nextInt();

        tiempo tiempo1 = new tiempo(horas,minutos,segundos);

        System.out.println(tiempo1);

    }

}
