package Actividad_16;

public class Hacha extends ArmaBlanca{

    private int filos;

    public Hacha(float potencia, boolean afilada, float reduccion, int filos) {
        super(potencia, afilada, reduccion);
        this.filos = filos;
    }


    public int getFilos() {
        return filos;
    }

    public void setFilos(int filos) {
        this.filos = filos;
    }
}
