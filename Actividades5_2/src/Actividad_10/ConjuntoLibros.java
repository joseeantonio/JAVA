package Actividad_10;

import java.util.Arrays;

public class ConjuntoLibros {

    private Libro[] libros = new Libro[5];

    public ConjuntoLibros(Libro[] libros) {
        this.libros = libros;
    }


    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }


    @Override
    public String toString() {
        return "ConjuntoLibros{" +
                "libros=" + Arrays.toString(libros) +
                '}';
    }



    public void añadirLibro(Libro libro_nuevo){
        if(comprobarLibro(libro_nuevo.getTitulo()))
            for (int i = 0; i< libros.length;i++){
                if (libros[i]==null){
                    libros[i] = libro_nuevo;
                    break;
                }
            }
    }



    public boolean comprobarLibro(String titulo){
        for (int i = 0; i<libros.length;i++){
            if (libros[i].getTitulo().equals(titulo)){
                return false;
            }
        }
        return true;
    }




    public void eliminarLibro(String titulo){
        for (int i = 0; i< libros.length;i++){
            if(libros[i].getTitulo().equals(titulo)){
                libros[i] = null;
            }
        }
    }


    public  Libro calificacionMinMax(){
        float max = 0;
        float min = 0;
        for (int i=0 ; i< libros.length ; i++){
            if (libros[i].getCalificacion()>max){
                max = libros[i].getCalificacion();
            }
        }
        for (int i=0 ; i< libros.length ; i++){
            if (libros[i].getCalificacion()<min){
                min = libros[i].getCalificacion();
            }
        }
    }

}
