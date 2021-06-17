package Actividad_16;

public class ArmaBlanca extends  Arma{

    private boolean afilada;
    private float reduccionSinAfiliar;

    public ArmaBlanca(float potencia, boolean afilada, float reduccion) {
        super(potencia);
        this.afilada = afilada;
        this.reduccionSinAfiliar = reduccion;
    }

    public boolean isAfilada() {
        return afilada;
    }

    public void setAfilada(boolean afilada) {
        this.afilada = afilada;
    }

    public float getReduccionSinAfiliar() {
        return reduccionSinAfiliar;
    }

    public void setReduccionSinAfiliar(float reduccionSinAfiliar) {
        this.reduccionSinAfiliar = reduccionSinAfiliar;
    }


    public void afilar(){
        afilada = true;
    }

    public float atacar(){
        if (afilada==false){
            float daño = getPotencia() - reduccionSinAfiliar;
            return daño;
        }
        return getPotencia();
    }
}
