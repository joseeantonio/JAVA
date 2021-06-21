import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

public class Agregador {

    private Suscripcion suscripcion;

    ArrayList<Noticia> noticias = new ArrayList<>();


    public Agregador(Suscripcion suscripcion, ArrayList<Noticia> noticias) {
        this.suscripcion = suscripcion;
        this.noticias = noticias;
    }

    public ArrayList<Noticia> noticias(Calendar fecha,Calendar caducidad) {
        ArrayList<Noticia> noticiasValidas = new ArrayList<>();
        for(Noticia cadaNoticia:noticias){
            if(cadaNoticia.fecha.after(fecha) && cadaNoticia.fecha.before(caducidad)){
                noticiasValidas.add(cadaNoticia);
            }
        }
        return noticiasValidas;
    }
}
