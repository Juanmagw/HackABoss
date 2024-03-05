package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private String nombreProducto;
    private Double precio;
    private Integer cantidadDisponible;

    public Producto() {
    }

    public Producto(String nombreProducto, Double precio, Integer cantidadDisponible) throws InventarioInvalidoException {
        if(nombreProducto == null || nombreProducto == ""){
            throw new InventarioInvalidoException("El nombre del producto debe estar completo");
        }else if(precio == null || precio < 0){
            throw new InventarioInvalidoException("El precio del producto debe ser mayor a 0");
        }else if(cantidadDisponible == null || cantidadDisponible < 0){
            throw new InventarioInvalidoException("La cantidad disponible del producto debe ser mayor a 0");
        }
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    @Override
    public String toString() {
        return "El producto " + nombreProducto + " cuesta " + precio + "€ y hay " + cantidadDisponible + " unidades disponibles";
    }
}
