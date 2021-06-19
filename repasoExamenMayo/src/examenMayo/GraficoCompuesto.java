package examenMayo;

import java.util.ArrayList;

public class GraficoCompuesto implements Grafico{

    ArrayList<Punto> puntos = new ArrayList<Punto>();

    public GraficoCompuesto(ArrayList<Punto> puntos) {
        this.puntos = puntos;
    }

    @Override
    public boolean mover(int x, int y) {
        boolean fuera = true;
        for (Punto cadaPunto:puntos){
            if(cadaPunto.mover(x, y)==false){
                fuera = false;
            }
        }
        return fuera;

    }

    @Override
    public String dibujar() {
        return "GraficoCompuesto{" +
                "puntos=" + puntos +
                '}';
    }
}


