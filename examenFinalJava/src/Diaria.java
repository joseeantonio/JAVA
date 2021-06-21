import java.util.Calendar;

public class Diaria implements Suscripcion{

    private Calendar caducidad;

    public Diaria(Calendar caducidad) {
        this.caducidad = caducidad;
    }

    public Calendar getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Calendar caducidad) {
        this.caducidad = caducidad;
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
