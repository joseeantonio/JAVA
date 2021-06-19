package Actividad_20;

import java.util.ArrayList;

public class ONG {

    private ArrayList<Voluntario> voluntarios = new ArrayList<Voluntario>();

    private boolean mayor = true;

    public ONG(ArrayList<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(ArrayList<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public Voluntario siguiente(){
        Voluntario devolver =null;

        if(voluntarios.isEmpty()){
            return null;
        }
        if(mayor){
            int años=0;
            for (Voluntario cadaVoluntario:voluntarios){
                if(cadaVoluntario.getEdad()>años){
                    años = cadaVoluntario.getEdad();
                    devolver = cadaVoluntario;
                }
            }
            mayor=false;
            voluntarios.remove(devolver);
            return devolver;


        }else{
            int edad=200;
            for(Voluntario cadaVoluntario:voluntarios){
                if(cadaVoluntario.getEdad()<edad) {
                    edad = cadaVoluntario.getEdad();
                    devolver = cadaVoluntario;
                }
            }
            mayor=true;
            voluntarios.remove(devolver);
            return devolver;
        }
    }


    public void añadirVoluntario(Voluntario voluntario_nuevo){
        voluntarios.add(voluntario_nuevo);
    }


}
