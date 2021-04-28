package Actividad_1;


import java.util.Scanner;

public class Act_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int coste,horas,total;
        while(true){
            try {
                System.out.println("Horas de trabajo: ");
                horas = sc.nextInt();
                System.out.println("Coste por horas: ");
                coste = sc.nextInt();
                total = horas*coste;
                System.out.println("Importe total: "+total);
                break;
            } catch(Exception e){
                System.out.println("Introduce un numero por favor.");
                sc.nextLine();
            }
        }


    }
}
