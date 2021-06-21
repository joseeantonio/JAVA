import java.util.Calendar;
import java.util.spi.CalendarNameProvider;

public class Video extends Noticia{

    private Long video_id;

    public Video(Long video_id, Calendar fecha_, String texto_) {
        this.video_id = video_id;
        this.fecha = fecha_;
        this.texto = texto_;
    }

    public Long getVideo_id() {
        return video_id;
    }

    public void setVideo_id(Long video_id) {
        this.video_id = video_id;
    }


    public String publica() {
        return "El Video tiene una " +
                "fecha=" + fecha +
                ",un texto='" + texto + '\'' +
                "y un video_id=" + video_id;
    }
}
