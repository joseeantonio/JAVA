package Actividad_9;

import java.util.Arrays;

public class Persona {

    private String dni;
    private  Cuenta[] cuentas =new Cuenta[3];

    public Persona(String dni) {
        this.dni = dni;
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
        boolean moroso = false;
        for(int i= 0; i<cuentas.length;i++) {
            if (cuentas[i] != null) {
                moroso=cuentas[i].getSaldo_disponible() < 0;
                if (moroso) break;
            }else{
                break;
            }
        }
        return moroso;
    }



    public void agregarCuenta(Cuenta cuenta_nueva){
        for(int i=0; i< cuentas.length; i++){
            if(cuentas[i] == null){
                cuentas[i]= cuenta_nueva;
            }
        }
    }

}
