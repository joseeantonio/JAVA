package examen;

import java.util.Arrays;

public class Grafico {

    Punto puntos[]=new Punto[5];

    public Grafico(Punto[] puntos) {
        this.puntos = puntos;
    }

    public Punto[] getPuntos() {
        return puntos;
    }

    public void setPuntos(Punto[] puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Grafico{" +
                "puntos=" + Arrays.toString(puntos) +
                '}';
    }



}
