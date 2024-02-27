package Ejercicio2;

public class Pantalon extends Vestimenta{
    private String estilo;
    private String tipoTejido;

    public Pantalon() {
    }

    public Pantalon(String estilo, String tipoTejido) {
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public Pantalon(Integer codigo, String nombre, Double precio, String marca, String talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    @Override
    public String ropa(){
        return "Estos pantalones son de marca " + this.estilo;
    }
}
