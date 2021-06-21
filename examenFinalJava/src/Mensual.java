import java.util.Calendar;

public class Mensual implements Suscripcion{

    private int duracion;
    private int dia;

    public Mensual(int duracion, int dia) {
        this.duracion = duracion;
        this.dia = dia;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }


    @Override
    public boolean activa(Calendar fecha) {
        if(fecha.before(duracion)){
            return false;
        }
        return true;
    }


    @Override
    public Usuario getUsuario() {
        return null;
    }

    @Override
    public void setUsuario(Usuario usuario1) {

    }
}
