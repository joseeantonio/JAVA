public class Pelicula extends Producto{

    protected Genero_Pelicula genero;
    protected String director;

    public Pelicula(String titulo, float precio, int año_publicacion, int descuentoProducto, Genero_Pelicula genero, String director) {
        super(titulo, precio, año_publicacion, descuentoProducto);
        this.genero = genero;
        this.director = director;
    }


    public Genero_Pelicula getGenero() {
        return genero;
    }

    public void setGenero(Genero_Pelicula genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    @Override
    public int obtenerDescuento() {
        return descuentoProducto;
    }
}
