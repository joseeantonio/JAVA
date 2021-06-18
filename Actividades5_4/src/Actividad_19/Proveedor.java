package Actividad_19;

public class Proveedor extends Persona{


    private String codigo;

    public Proveedor(String nombre, String apellidos, int edad, String codigo) {
        super(nombre, apellidos, edad);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


}
