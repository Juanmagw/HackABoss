package Ejercicio2;

import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
    }

    public Inventario(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> gestionarInventario(Producto producto) throws InventarioInvalidoException {
        for(Producto p : productos){
            if(p.getNombreProducto().equals(producto.getNombreProducto())){
                throw new InventarioInvalidoException("El producto ya existe en el inventario");
            }
        }
        productos.add(producto);
        return productos;
    }
}
