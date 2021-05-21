package Actividad_11;

import java.util.Arrays;

public class Cliente {

    private String dni;
    private String nombre;
    private int edad;
    private Cuenta[] cuentas = new Cuenta[2];

    public Cliente(String dni, String nombre, int edad) throws EdadException {
        if(edad<18){
            throw new EdadException();
        }
            this.dni = dni;
            this.nombre = nombre;
            this.edad = edad;
            this.cuentas = cuentas;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Cliente tiene el " +
                "dni : " + dni +
                ", el nombre: " + nombre  +
                ", la edad: " + edad +
                " y las cuentas : " + Arrays.toString(cuentas)
                ;
    }

    public void agregarCuenta(Cuenta cuenta_nueva){
        for(int i=0; i< cuentas.length; i++){
            if(cuentas[i] == null){
                cuentas[i]= cuenta_nueva;
                break;
            }
        }
    }

}
