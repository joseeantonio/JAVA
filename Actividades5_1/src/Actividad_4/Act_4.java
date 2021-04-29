package Actividad_4;

import java.util.Scanner;

public class Act_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float numero1;
        float numero2;
        String operacion;
        while(true){
            try {

                System.out.print("Introduce un numero : ");
                numero1 = sc.nextInt();

                System.out.print("Introduce otro numero : ");
                numero2 = sc.nextInt();

                System.out.println("Introduce una de las siguientes operaciones \"suma\" ,\"resta\" ,\"multiplicar\" ,\"dividir\" : ");
                sc.nextLine();
                operacion =sc.nextLine();


                if(operacion.equals("suma")){
                    System.out.print("La suma de los dos numseros es: ");
                    System.out.println(numero1+numero2);
                    break;
                }else if(operacion.equals("resta")){
                    System.out.print("La resta de los dos numseros es: ");
                    System.out.println(numero1-numero2);
                    break;
                }else if(operacion.equals("multiplicar")){
                    System.out.print("La multiplicacion de los dos numeros es: ");
                    System.out.println(numero1*numero2);
                }else if(operacion.equals("dividir")){
                    System.out.print("La division de los dos numeros es: ");
                    System.out.println(numero1/numero2);
                }else{
                    System.out.println("Introduzca una operacion correcta.");
                }


            }catch(Exception e){
                System.out.println("Por favor introduce un numero.");
                sc.nextLine();
            }
        }
    }

}
