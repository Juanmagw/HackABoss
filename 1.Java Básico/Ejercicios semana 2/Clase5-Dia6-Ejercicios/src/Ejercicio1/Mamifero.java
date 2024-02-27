package Ejercicio1;

public class Mamifero extends Animal{
    private Integer numeroPatas;
    private String tipoReproduccion;
    private String colorPelaje;
    private String habitat;

    public Mamifero() {
    }

    public Mamifero(Integer numeroPatas, String tipoReproduccion, String colorPelaje, String habitat) {
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    public Mamifero(Integer id, String nombre, Integer edad, String tipoPiel, String tipoAlimentacion, Integer numeroPatas, String tipoReproduccion, String colorPelaje, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    @Override
    public String saludar(){
        return "Hola, soy un mamífero";
    }
}
