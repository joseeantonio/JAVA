package Actividad_2;

import java.util.Scanner;


public class Act_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int impt_final,iva,producto;
        while(true){
            try{
                System.Out.println("Introduzca el importe final: ");
                impt_final = sc.nextInt();
                iva = 10*impt_final/100;
                producto = impt_final-iva;
                System.out.println("Has pagado por el IVA "+iva+"€");
                System.out.println("El producto sin IVA es "+producto+"€");
                break;
            }catch(Exception e){
                System.out.println("Introduce un numero por favor.");
                sc.nextLine();
            }
        }
    }
}