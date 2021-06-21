import java.util.Calendar;

public class Semanal implements Suscripcion{

    private Calendar caducidad;
    private int dia;

    public Semanal(Calendar caducidad, int dia) {
        this.caducidad = caducidad;
        this.dia = dia;
    }

    public Calendar getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Calendar caducidad) {
        this.caducidad = caducidad;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public boolean activa(Calendar fecha) {
        if(fecha.before(caducidad)){
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
