package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Producto> productos = new ArrayList<>();
            //productos.add(new Producto(null, 10.0, 100)); Validación de nombre
            //productos.add(new Producto("Leche", null, 50));   Validación de precio
            productos.add(new Producto("Pimientos", 13.0, 75));

            Producto producto = new Producto("Pimientos", 13.0, 75);    // Validación de producto duplicado
            Inventario inventario = new Inventario(productos);
            inventario.gestionarInventario(producto);

            for(Producto p : productos){
                System.out.println(p);
            }

        } catch (InventarioInvalidoException e) {
            System.out.println(e);
        }
    }
}
