package Actividad_19;

import java.util.ArrayList;

public class Grupo {

    ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    public Grupo(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public boolean registrar(Persona persona){
        if(!listaPersonas.contains(persona)){
            listaPersonas.add(persona);
            return true;
        }else{
            return false;
        }
    }

    public boolean eliminar(Persona persona){
        if(listaPersonas.contains(persona)){
            listaPersonas.remove(persona);
            return true;
        }else{
            return false;
        }
    }




}

