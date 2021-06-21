public class Disco extends Producto{

    protected Genero_Musica genero;
    protected String grupo;
    protected int stock;

    public Disco(String titulo, float precio, int año_publicacion, int descuentoProducto, Genero_Musica genero, String grupo, int stock) {
        super(titulo, precio, año_publicacion, descuentoProducto);
        this.genero = genero;
        this.grupo = grupo;
        this.stock = stock;
    }

    public Genero_Musica getGenero() {
        return genero;
    }

    public void setGenero(Genero_Musica genero) {
        this.genero = genero;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    @Override
    public int obtenerDescuento() {
        return descuentoProducto;
    }
}
