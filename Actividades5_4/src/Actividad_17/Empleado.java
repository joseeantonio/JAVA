package Actividad_17;

public class Empleado {

    private String nombre;
    private float sueldo;

    public Empleado(String nombre, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public float cobrar(){
        return sueldo;
    }
}
