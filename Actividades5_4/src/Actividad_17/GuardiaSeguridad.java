package Actividad_17;

public class GuardiaSeguridad extends Empleado{

    private int noche;
    private float extraNoche;

    public GuardiaSeguridad(String nombre, float sueldo, int noche, float extraNoche) {
        super(nombre, sueldo);
        this.noche = noche;
        this.extraNoche = extraNoche;
    }

    public float cobrar(){
        float dinero = noche * extraNoche + getSueldo();
        return dinero;
    }
}
