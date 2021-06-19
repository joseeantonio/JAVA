package examenMayo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GraficoCompuestoTest {

    Punto punto1;
    Punto punto2;
    GraficoCompuesto graficoCompuesto1;
    ArrayList<Punto> puntos;
    Circulo circulo1;
    Rectangulo rectangulo2;


    @BeforeEach
    void setUp() throws fueraLimites {
        circulo1 = new Circulo(700,600,23);
        rectangulo2 = new Rectangulo(700,500,40,30);


        puntos = new ArrayList<>();
        punto1 = new Punto(400,500);
        punto2 = new Punto(300,500);
        puntos.add(punto1);
        puntos.add(punto2);

        graficoCompuesto1 = new GraficoCompuesto(puntos);

    }

    @AfterEach
    void setDown(){

    }


    @Test
    public void graficoCompuesta(){
        assertDoesNotThrow( () -> new Punto(400,500));
        assertDoesNotThrow( () -> new Punto(300,500));
        assertDoesNotThrow( () -> new GraficoCompuesto(puntos));
        assertDoesNotThrow( () -> new Circulo(700,600,23));
        assertDoesNotThrow( () -> new Rectangulo(700,500,40,30));
    }


    @Test
    public void mover(){
        assertEquals(false,graficoCompuesto1.mover(801,500));
        assertEquals(true,graficoCompuesto1.mover(800,600));
    }

}