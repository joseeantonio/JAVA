package Actividad_17;

public class Comercial extends Empleado{

    private float ventas;
    private float comision;


    public Comercial(String nombre, float sueldo, float ventas, float comision) {
        super(nombre, sueldo);
        this.ventas = ventas;
        this.comision = comision;
    }



    public float cobrar(){
        float dinero = (ventas*comision)/100 + getSueldo();
        return dinero;
    }

    public float getVentas() {
        return ventas;
    }

    public void vende(float cantidad){
        ventas = ventas + cantidad;
    }
}
