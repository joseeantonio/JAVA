package Actividad_9;

import java.util.Arrays;

public class Persona {

    private String dni;
    private  Cuenta[] cuentas =new Cuenta[3];

    public Persona(String dni, Cuenta[] cuentas) {
        this.dni = dni;
        this.cuentas = cuentas;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "persona{" +
                "dni='" + dni + '\'' +
                ", cuentas=" + Arrays.toString(cuentas) +
                '}';
    }

    public boolean persona_morosa(){
        for(int i= 0; i<cuentas.length;i++) {
            if (cuentas[i].getSaldo_disponible()<0)
                return true;
        }
       return false;
    }



    public void agregarCuenta(){
        for(int i=0; i< cuentas.length; i++){
            if(cuentas[i] == null){
                cuentas[i]=new Cuenta(7346534,0);
            }
        }
    }

}
