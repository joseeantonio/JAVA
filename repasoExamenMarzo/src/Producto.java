public abstract class Producto {

    protected String titulo;
    protected float precio;
    protected int año_publicacion;
    protected int descuentoProducto;


    public Producto(String titulo, float precio, int año_publicacion, int descuentoProducto) {
        this.titulo = titulo;
        this.precio = precio;
        this.año_publicacion = año_publicacion;
        this.descuentoProducto = descuentoProducto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getAño_publicacion() {
        return año_publicacion;
    }

    public void setAño_publicacion(int año_publicacion) {
        this.año_publicacion = año_publicacion;
    }

    public int getDescuentoProducto() {
        return descuentoProducto;
    }

    public void setDescuentoProducto(int descuentoProducto) {
        this.descuentoProducto = descuentoProducto;
    }

    public abstract int obtenerDescuento();
}
