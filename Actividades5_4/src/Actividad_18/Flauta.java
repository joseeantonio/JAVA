package Actividad_18;

public class Flauta extends Instrumento{

    private int orificios;

    public Flauta(int orificios) {
        this.orificios = orificios;
    }


    public int getOrificios() {
        return orificios;
    }

    public void setOrificios(int orificios) {
        this.orificios = orificios;
    }

    @Override
    public Nota tocarNota() {
        return Nota.FA;
    }
}
