package Ejercicio2;

public class Sombrero extends Vestimenta{
    private String tipo;
    //La letra ñ no se suele usar debido a que el código puede no saber interpretarla
    private Double dimension;

    public Sombrero() {
    }

    public Sombrero(String tipo, Double dimension) {
        this.tipo = tipo;
        this.dimension = dimension;
    }

    public Sombrero(Integer codigo, String nombre, Double precio, String marca, String talla, String color, String tipo, Double dimension) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.dimension = dimension;
    }

    @Override
    public String ropa(){
        return "Este sombrero es de marca " + this.tipo;
    }
}
