package Actividad_17;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    Empleado empleado1;
    GuardiaSeguridad guardiaSeguridad1;
    Comercial comercial1;

    @BeforeEach
    void setUp(){
        empleado1 = new Empleado("Juan",50);
        guardiaSeguridad1 = new GuardiaSeguridad("Juan",50,2,20);
        comercial1 = new Comercial("Mario",90,10,80);
    }

    @AfterEach
    void setDown(){

    }


    @Test
    public void constructor(){
        assertDoesNotThrow( () -> new Empleado("Juan",50));
        assertDoesNotThrow( () -> new GuardiaSeguridad("Juan",50,2,20));
        assertDoesNotThrow( () -> new Comercial("Mario",90,10,80));
    }


    @Test
    public void cobrar(){
        assertEquals(50,empleado1.cobrar());
        assertEquals(98,comercial1.cobrar());
        assertEquals(90,guardiaSeguridad1.cobrar());
    }


    @Test
    public void vende(){
        comercial1.vende(30);
        assertEquals(40,comercial1.getVentas());
    }

}