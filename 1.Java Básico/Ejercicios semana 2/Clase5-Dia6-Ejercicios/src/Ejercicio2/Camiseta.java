package Ejercicio2;

public class Camiseta extends Vestimenta{
    private Boolean manga;
    private Boolean cuello;

    public Camiseta() {
        this.manga = false;
        this.cuello = false;
    }

    public Camiseta(Integer codigo, String nombre, Double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = false;
        this.cuello = false;
    }

    public void setManga(Boolean manga) {
        this.manga = manga;
    }
    public void setCuello(Boolean cuello) {
        this.cuello = cuello;
    }

    @Override
    public String ropa(){
        return "Esta camiseta es de marca " + this.manga;
    }
}
