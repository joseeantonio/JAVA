package Actividad_16;

public class ArmaFuego extends Arma {

    private boolean cargada;

    public ArmaFuego(float potencia, boolean cargada) {
        super(potencia);
        this.cargada = cargada;
    }


    public boolean isCargada() {
        return cargada;
    }





    public void cargar(){
        cargada = true;
    }

    public boolean disparar(){
        if (cargada==true){
            cargada = false;
            return true;
        }
        return false;
    }

    public float atacar(){
        if (disparar()==true){
            return getPotencia();
        }
        return 0;
    }
}
