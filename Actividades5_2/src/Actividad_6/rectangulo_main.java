package Actividad_6;

public class rectangulo_main {
    public static void main(String[] args){
            Rectangulo rectangulo1 = new Rectangulo(7, 9);

            System.out.println("El area del rectangulo1 es: "+rectangulo1.area_rect());
            System.out.println("El perimetro del rectangulo1 es: "+rectangulo1.perimetro_rect());


            Rectangulo rectangulo2 = new Rectangulo(6,27);

            System.out.println("El area del rectangulo2 es: "+rectangulo2.area_rect());
            System.out.println("El perimetro del rectangulo2 es: "+rectangulo2.perimetro_rect());
    }
}
