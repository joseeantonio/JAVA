import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class NoticiaTest {


    Calendar hoy ;
    Noticia noticia1;
    Enlace enlace1;
    Video video1;
    Mensual mensual1;
    Diaria diaria1;
    Semanal semanal1;
    Calendar caducidad1;
    Usuario usuario1;
    Agregador agregador1;
    ArrayList<Noticia> noticias;

    @Before
    void setUp(){
        noticias = new ArrayList<>();
        noticias.add(enlace1);
        hoy=Calendar.getInstance();
        enlace1 = new Enlace("abcdef",hoy,"texto1");
        video1 = new Video(	875L,hoy,"textoVideo");
        semanal1 = new Semanal(hoy,12);
        diaria1 = new Diaria(hoy);
        mensual1 = new Mensual(12,1);
        usuario1 = new Usuario("Jose","abcd","gonzalez@gmail.com");
        agregador1 = new Agregador(mensual1,noticias);
    }

    @AfterEach
    void setDown(){

    }


    @Test
    public void constructor(){
        assertDoesNotThrow( () -> new Enlace("abcdef",hoy,"texto1"));
        assertDoesNotThrow( () -> new Video(	875L,hoy,"textoVideo"));
        assertDoesNotThrow( () -> new Semanal(hoy,12));
        assertDoesNotThrow( () -> new Diaria(hoy));
        assertDoesNotThrow( () -> new Mensual(12,1));
        assertDoesNotThrow( () -> new Usuario("Jose","abcd","gonzalez@gmail.com"));
        assertDoesNotThrow( () -> new Agregador(mensual1,noticias));
    }




}