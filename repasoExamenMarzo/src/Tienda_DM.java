import java.util.ArrayList;

public class Tienda_DM {

    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public Tienda_DM(ArrayList<Producto> productos, ArrayList<Cliente> clientes) {
        this.productos = productos;
        this.clientes = clientes;
    }

    public Producto buscarProducto(Producto producto_nuevo){
        for (Producto producto__:productos){
            if (producto__==producto_nuevo){
                return producto__;
            }
        }
        return null;
    }
}
