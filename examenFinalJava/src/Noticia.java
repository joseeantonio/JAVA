import java.util.Calendar;

public class Noticia {

    protected Calendar fecha;
    protected String texto;

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


    public String publica() {
        return "Noticia{" +
                "fecha=" + fecha +
                ", texto='" + texto + '\'' +
                '}';
    }
}
