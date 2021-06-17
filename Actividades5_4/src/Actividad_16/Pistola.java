package Actividad_16;

public class Pistola extends ArmaFuego{

    private int calibre;


    public Pistola(float potencia, boolean cargada, int calibre) {
        super(potencia, cargada);
        this.calibre = calibre;
    }


    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }


}
