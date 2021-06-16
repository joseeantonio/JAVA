package Actividad_10;

public class Libro {

    private String titulo;
    private String autor;
    private int num_pag;
    private float calificacion;

    public Libro(String titulo, String autor, int num_pag, float calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.num_pag = num_pag;
        if (calificacion<10 && calificacion>0) {
            this.calificacion = calificacion;
        }else if (calificacion<0){
            this.calificacion = 0;
        }else if (calificacion>10){
            this.calificacion = 10;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNum_pag() {
        return num_pag;
    }

    public void setNum_pag(int num_pag) {
        this.num_pag = num_pag;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", num_pag=" + num_pag +
                ", calificacion=" + calificacion +
                '}';
    }
}
