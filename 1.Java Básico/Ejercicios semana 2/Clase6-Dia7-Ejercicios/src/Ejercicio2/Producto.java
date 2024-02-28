package Ejercicio2;

public class Producto {
    private Integer codigo;
    private String nombre;
    private String marca;
    private String tipo;
    private Double precioCosto;
    private Double precioVenta;
    private Integer cantidadStock;

    public Producto() {
    }

    public Producto(Integer codigo, String nombre, String marca, String tipo, Double precioCosto, Double precioVenta, Integer cantidadStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.cantidadStock = cantidadStock;
    }

    public String getNombre() {
        return nombre;
    }
    public Double getPrecioCosto() {
        return precioCosto;
    }
    public Double getPrecioVenta() {
        return precioVenta;
    }
    public Integer getCantidadStock() {
        return cantidadStock;
    }
    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        return "El producto tiene código " + codigo +  ", nombre " + nombre + ", marca " + marca + ", tipo " + tipo + ", precio de costo " + precioCosto + ", precio de venta " + precioVenta + " y cantidad de stock " + cantidadStock + ".";
    }
}
