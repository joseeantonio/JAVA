package Actividad_18;

public class Guitarra extends Instrumento{

    private int cuerdas;

    public Guitarra(int cuerdas) {
        this.cuerdas = cuerdas;
    }

    public int getCuerdas() {
        return cuerdas;
    }

    public void setCuerdas(int cuerdas) {
        this.cuerdas = cuerdas;
    }

    @Override
    public Nota tocarNota() {
        return Nota.DO;
    }

}
