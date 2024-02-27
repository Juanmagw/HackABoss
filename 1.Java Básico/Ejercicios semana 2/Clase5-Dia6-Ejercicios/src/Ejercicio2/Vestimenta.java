package Ejercicio2;

public class Vestimenta {
    private Integer codigo;
    private String nombre;
    private Double precio;
    private String marca;
    private String talla;
    private String color;

    public Vestimenta() {
    }

    public Vestimenta(Integer codigo, String nombre, Double precio, String marca, String talla, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String ropa(){
        return "Esta vestimenta es de marca " + this.marca;
    }
}
