package Actividad_16;

public class Rifle extends ArmaFuego {

    private float alcance;

    public Rifle(float potencia, boolean cargada, float alcance) {
        super(potencia, cargada);
        this.alcance = alcance;
    }


    public float getAlcance() {
        return alcance;
    }

    public void setAlcance(float alcance) {
        this.alcance = alcance;
    }
}
