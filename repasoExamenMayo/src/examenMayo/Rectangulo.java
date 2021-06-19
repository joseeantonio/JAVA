package examenMayo;

public class Rectangulo extends Punto{

    private int ancho;
    private int alto;


    public Rectangulo(int x, int y, int ancho, int alto) throws fueraLimites {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "x=" + x +
                ", y=" + y +
                ", ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }


    @Override
    public boolean mover(int x, int y) {
        return super.mover(x, y);
    }

    @Override
    public String dibujar() {
        return super.dibujar()+ancho;
    }
}
