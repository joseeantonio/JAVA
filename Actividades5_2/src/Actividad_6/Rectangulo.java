package Actividad_6;

public class Rectangulo {
     private int base;
     private int altura;

     public Rectangulo(int base, int altura) {
          this.base = base;
          this.altura = altura;
     }

     public int getBase() {
          return base;
     }

     public void setBase(int base) {
          this.base = base;
     }

     public int getAltura() {
          return altura;
     }

     public void setAltura(int altura) {
          this.altura = altura;
     }

     @Override
     public String toString() {
          return "Rectangulo{" +
                  "base=" + base +
                  ", altura=" + altura +
                  '}';
     }
     public float area_rect(){
          return(base*altura);
     };
     public float perimetro_rect(){
          return(base*2+altura*2);
     };
}
