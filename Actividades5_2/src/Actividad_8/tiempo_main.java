package Actividad_8;

import java.util.Scanner;

public class tiempo_main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int horas;
        int minutos;
        int segundos;

        while(true) {

            try{

                System.out.print("Introduzca la hora:");
                horas = sc.nextInt();

                System.out.print("Introduzca los minutos:");
                minutos = sc.nextInt();

                System.out.print("Introduzca los segundos:");
                segundos = sc.nextInt();


                if (horas>24 || horas<1){
                    System.out.println("Introduzca una hora entre 1 y 24");
                }
                else if (minutos<0 || minutos>60){
                    System.out.println("Introduzca unos mimnutos entre 0 y 60");
                }
                else if(segundos<0 || segundos>60){
                    System.out.println("Introduzca los segundos entre 0 y 60");
                }else{
                    tiempo tiempo1 = new tiempo(horas, minutos, segundos);
                    System.out.println(tiempo1);
                    break;
                }



            }catch (Exception e){
                System.out.println("Introduzca un numero por favor");
                sc.nextLine();
            }

        }


    }

}
