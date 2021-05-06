package Actividad_7;

public class coche_main {
    public static void main(String[] args){

        coche coche1 = new coche("rosa","Seat","Seat arona",23,4,434534);

        System.out.println("El coche 1 es : "+coche1);


        coche coche2 = new coche("negro","Opel","Opel corsa",35,2,123456);

        System.out.println("El coche 2 es : "+coche2);

        coche2.setColor("Amarillo");
        System.out.println("El coche 2 modificado es : "+coche2);
    }
}
