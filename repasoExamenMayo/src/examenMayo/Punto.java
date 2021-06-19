package examenMayo;

public class Punto implements Grafico{

    protected int x;
    protected int y;

    public Punto(int x, int y) throws fueraLimites {
        this.x = x;
        this.y = y;
        if(limitePantalla()==false){
                throw new fueraLimites("Fuera de la pantalla") ;
        }
    }


    public boolean limitePantalla(){
        if(this.x >=0 && this.x <=800 && this.y>=0 && this.y<=600){
            return true;
        }
        return false;
    }

    @Override
    public boolean mover(int x, int y){
        if(limitePantalla()) {
            this.x = x;
            this.y = y;
            return true;
        }else{
            return false;
        }
    }


    @Override
    public String dibujar() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
