package Actividad_18;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstrumentoTest {

    Flauta flauta1;
    Guitarra guitarra1;
    Nota nota1;


    @BeforeEach
    void setUp(){
        flauta1 = new Flauta(4);
        guitarra1 = new Guitarra(6);
    }

    @AfterEach
    void setDown(){

    }

    @Test
    public void constructor(){
        assertDoesNotThrow( () -> new Flauta(4));
        assertDoesNotThrow( () -> new Guitarra(6));
    }

    @Test
    public void tocarNota(){
        assertEquals(Nota.FA,flauta1.tocarNota());
        assertEquals(Nota.DO,guitarra1.tocarNota());
    }


}