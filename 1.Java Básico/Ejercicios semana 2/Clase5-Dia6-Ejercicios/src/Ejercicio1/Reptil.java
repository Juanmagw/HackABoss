package Ejercicio1;

public class Reptil extends Animal{
    private Double longitud;
    private String tipoEscamas;
    private String tipoVeneno;

    public Reptil() {
    }

    public Reptil(Double longitud, String tipoEscamas, String tipoVeneno) {
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
    }

    public Reptil(Integer id, String nombre, Integer edad, String tipoPiel, String tipoAlimentacion, Double longitud, String tipoEscamas, String tipoVeneno) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
    }

    @Override
    public String saludar(){
        return "Hola, soy un reptil";
    }
}
