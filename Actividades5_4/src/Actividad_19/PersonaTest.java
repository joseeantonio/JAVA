package Actividad_19;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    Persona persona3;
    Persona persona2;
    Persona persona1;
    Cliente cliente1;
    Proveedor proveedor1;
    Grupo grupo1;
    ArrayList<Persona> personas = new ArrayList<Persona>();

    @BeforeEach
    void setUp(){
        persona1 = new Persona("Jose","Perez",15);
        cliente1 = new Cliente("Jose","Gonzalez",18,123456789);
        proveedor1 = new Proveedor("Juan","Gonzalez",26,"2345436B");
        grupo1 = new Grupo(personas);
        persona2 = new Persona("Juanito","Perez",35);
        persona3 = new Persona("Jose","Perez",15);
    }


    @AfterEach
    void setDown(){

    }


    @Test
    public void constructor(){
        assertDoesNotThrow( () -> new Persona("Jose","Perez",15));
        assertDoesNotThrow( () -> new Cliente("Jose","Gonzalez",18,123456789));
        assertDoesNotThrow( () -> new Proveedor("Juan","Gonzalez",26,"2345436B"));
        assertDoesNotThrow( () -> new Grupo(personas));
    }



    @Test
    public void registrar(){
        assertEquals(true, grupo1.registrar(persona1));
        assertEquals(false,grupo1.registrar(persona1));
        assertEquals(true,grupo1.eliminar(persona1));
        assertEquals(false,grupo1.eliminar(persona1));
    }


    @Test
    public void hash(){
        assertFalse(persona1.equals(persona2));
        assertTrue(persona1.equals(persona3));
        persona1.hashCode();
    }




}