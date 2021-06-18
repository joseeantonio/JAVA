package Actividad_16;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmaTest {


    Arma arma1;
    ArmaFuego armaFuego1;
    Rifle rifle1;
    Pistola pistola1;
    Escopeta escopeta1;
    ArmaBlanca armaBlanca1;
    Cuchillo cuchillo1;
    Hacha hacha1;
    ArmaFuego armaFuego2;
    ArmaBlanca armaBlanca2;
    Escopeta escopeta2;
    Escopeta escopeta3;
    Hacha hacha2;


    @BeforeEach
    void setUp(){
        arma1 = new Arma(100);
        armaFuego1 = new ArmaFuego(100,true);
        armaFuego2 = new ArmaFuego(123,false);
        rifle1 = new Rifle(100,true,100);
        pistola1 = new Pistola(98,true,2);
        escopeta1 = new Escopeta(90,true,true,10);
        armaBlanca1 = new ArmaBlanca(123,false,23);
        cuchillo1 = new Cuchillo(200,true,20);
        hacha1 = new Hacha(150,true,10,5);
        armaBlanca2 = new ArmaBlanca(123,true,123);
        escopeta2 = new Escopeta(125,false,true,23);
        escopeta3 = new Escopeta(125,true,false,34);
        hacha2 = new Hacha(150,false,10,5);
    }



    @AfterEach
    void setDown(){

    }

    @Test
    void constructor(){
        assertDoesNotThrow( () -> new Arma(100));
        assertDoesNotThrow( () -> new ArmaBlanca(123,false,23));
        assertDoesNotThrow( () -> new ArmaFuego(100,true));
        assertDoesNotThrow( () -> new Rifle(100,true,100));
        assertDoesNotThrow( () -> new Escopeta(90,true,true,10));
        assertDoesNotThrow( () -> new Pistola(98,true,2));
        assertDoesNotThrow( () ->new Cuchillo(200,true,20));
        assertDoesNotThrow( () -> new Hacha(150,true,10,5));
    }


    @Test
    void getPotencia(){
        assertEquals(100,arma1.getPotencia());
    }



    @Test
    void atacar(){
        assertEquals( 100,arma1.atacar() );
        assertEquals(100,armaFuego1.atacar());
        assertEquals(0,armaFuego2.atacar());
        assertEquals(100,armaBlanca1.atacar());
        assertEquals(123,armaBlanca2.atacar());
        assertEquals(100,escopeta1.atacar());
        assertEquals(0,escopeta2.atacar());
        assertEquals(125,escopeta3.atacar());
        assertEquals(200,cuchillo1.atacar());
        assertEquals(150,hacha1.atacar());
        assertEquals(140,hacha2.atacar());
    }


    @Test
    void afilar(){
        hacha2.afilar();
        assertEquals(true,hacha2.isAfilada());
    }


    @Test
    void disparar(){
        assertEquals(false,escopeta2.disparar());
    }

    @Test
    void cargar(){
        escopeta2.cargar();
        assertEquals(true,escopeta2.isCargada());
    }

}