public class Cliente_registrado implements Cliente{

    private String nombre;
    private String apellido;
    private String dni;
    private String tlf;
    private float saldo;
    private int descuento;


    public Cliente_registrado(String nombre, String apellido, String dni, String tlf, float saldo, int descuento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tlf = tlf;
        this.saldo = saldo;
        this.descuento = descuento;
    }

    @Override
    public int aplicaDescuento(Producto producto_nuevo) {
        int precio = (int) ((producto_nuevo.descuentoProducto*producto_nuevo.precio/100)-producto_nuevo.precio);
        return precio;
    }

    @Override
    public boolean pagar(float cantidad) {
        return false;
    }
}
