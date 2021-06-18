package Actividad_19;

public class Cliente extends Persona{

    private long id;


    public Cliente(String nombre, String apellidos, int edad, long id) {
        super(nombre, apellidos, edad);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
