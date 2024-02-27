package Ejercicio2;

public class Zapato extends Vestimenta{
    private String material;
    private String tipoCierre;

    public Zapato() {
    }

    public Zapato(String material, String tipoCierre) {
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    public Zapato(Integer codigo, String nombre, Double precio, String marca, String talla, String color, String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    @Override
    public String ropa(){
        return "Estos zapatos son de marca " + super.getMarca();
    }
}
