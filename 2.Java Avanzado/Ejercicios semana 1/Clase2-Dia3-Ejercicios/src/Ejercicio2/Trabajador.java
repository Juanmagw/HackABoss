package Ejercicio2;

public class Trabajador extends Thread{
    private String nombre;
    private String estacion;
    private Producto producto;

    public Trabajador() {
    }

    public Trabajador(String nombre, String estacion, Producto producto) {
        this.nombre = nombre;
        this.estacion = estacion;
        this.producto = producto;
    }

    public void ensamblarProducto(String nombreProducto) {
        System.out.println("El trabajador " + nombre + " está ensamblando un producto a " + nombreProducto);
    }

    public void controlarCalidad(String nombreProducto) {
        System.out.println("El trabajador " + nombre + " está controlando la calidad de un producto a " + nombreProducto);
    }

    public void embalarProducto(String nombreProducto) {
        System.out.println("El trabajador " + nombre + " está empaquetando un producto a " + nombreProducto);
    }

    @Override
    public void run() {
        ensamblarProducto("El trabajador " + nombre + " está ensamblando el producto " + producto.getNombre());
        controlarCalidad("El trabajador " + nombre + " está controlando la calidad del producto " + producto.getNombre());
        embalarProducto("El trabajador " + nombre + " está empaquetando el producto " + producto.getNombre());
    }
}
