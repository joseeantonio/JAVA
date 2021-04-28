package Actividad_3;

import java.util.Scanner;

public class Act_3 {
    public static void main(String[] args){

         float puntuacion;
         Scanner sc = new Scanner(System.in);

         while(true){
            try{

                System.out.println("Introduce una puntuacion entre 0 y 1:");
                puntuacion = sc.nextFloat();

                if ( puntuacion>=0 && puntuacion<0.6 ){
                    System.out.println("Insuficiente");
                    break;
                } else if ( puntuacion<0.7 && puntuacion >=0.6 ){
                    System.out.println("Suficiente");
                    break;
                }else if ( puntuacion<0.8 && puntuacion>0.7 ){
                    System.out.println("Bien");
                    break;
                }else if ( puntuacion <0.9 && puntuacion>=0.8 ){
                    System.out.println("Notable");
                    break;
                }else if ( puntuacion <=1 && puntuacion>=0.9){
                    System.out.println("Sobresaliente");
                    break;
                } else {
                    System.out.println("Introduce un numero entre 0 y 1");
                }

            }catch(Exception e){
                System.out.println("Introduzca un numero por favor");
                sc.nextLine();
            }
        }
    }
}