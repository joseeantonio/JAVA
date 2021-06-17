package Actividad_16;

public class Escopeta extends ArmaFuego{


    private boolean recortada;
    private float aumentoRecortada;

    public Escopeta(float potencia, boolean cargada, boolean recortada, float aumentoRecortada) {
        super(potencia, cargada);
        this.recortada = recortada;
        this.aumentoRecortada = aumentoRecortada;
    }


    public boolean isRecortada() {
        return recortada;
    }

    public void setRecortada(boolean recortada) {
        this.recortada = recortada;
    }

    public float getAumentoRecortada() {
        return aumentoRecortada;
    }

    public void setAumentoRecortada(float aumentoRecortada) {
        this.aumentoRecortada = aumentoRecortada;
    }


    @Override
    public void cargar() {
        super.cargar();
    }

    @Override
    public boolean disparar() {
        return super.disparar();
    }

    @Override
    public float atacar() {
        if (disparar()==true) {
            if (recortada == true) {
                float daño = aumentoRecortada + getPotencia();
                return daño;
            }
            return getPotencia();
        }
        return 0;
    }
}

