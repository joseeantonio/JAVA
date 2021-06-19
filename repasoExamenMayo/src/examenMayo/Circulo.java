package examenMayo;

public class Circulo extends Punto{

    private int radio;

    public Circulo(int x, int y, int radio) throws fueraLimites {
        super(x, y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public boolean mover(int x, int y) {
        return super.mover(x, y);
    }

    @Override
    public String dibujar() {
        return super.dibujar()+radio;
    }
}
