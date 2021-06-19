package Actividad_20;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ONGTest {


    ONG ong1 ;
    Voluntario voluntario2;
    Voluntario voluntario3;



    ArrayList<Voluntario> voluntarios ;
    Voluntario voluntario1;
    ArrayList<Voluntario> voluntarios2;
    ONG unicef ;



    @BeforeEach
    void setUp(){

        voluntario1 = new Voluntario("Juan",18);
        voluntario2 = new Voluntario("Maria",29);
        voluntario3 = new Voluntario("Ivan",23);
        voluntarios = new ArrayList<>();
        voluntarios2 = new ArrayList<>();

        voluntarios.add(voluntario1);
        voluntarios.add(voluntario2);
        voluntarios.add(voluntario3);

        ong1 = new ONG(voluntarios);
    }



    @AfterEach
    void setDown(){

    }



    @Test
    public void constructor(){
        assertDoesNotThrow( () -> new Voluntario("Juan",18));
        assertDoesNotThrow( () -> new Voluntario("Maria",29));
        assertDoesNotThrow( () -> new Voluntario("Ivan",23));
    }


    @Test
    public void siguiente(){
        assertEquals(ong1.siguiente(),voluntario2);
        assertEquals(ong1.siguiente(),voluntario1);
        assertEquals(voluntario3,ong1.siguiente());
        assertEquals(ong1.siguiente(),null);
    }

    @Test
    public void añadir(){
        ong1.setVoluntarios(voluntarios2);
        ong1.añadirVoluntario(voluntario1);
        voluntarios.add(voluntario1);
        assertEquals(ong1.getVoluntarios(),voluntarios2);
    }




}