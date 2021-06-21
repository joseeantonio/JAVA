import java.util.Calendar;

public class Enlace extends Noticia{

    private String url;

    public Enlace(String url,Calendar fecha_,String texto_) {
        this.url = url;
        this.fecha = fecha_;
        this.texto = texto_;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String publica() {
        return "El enlace tiene un " +
                "url='" + url + '\'' +
                ",una fecha=" + fecha +
                "y un texto='" + texto + '\'';
    }


}
