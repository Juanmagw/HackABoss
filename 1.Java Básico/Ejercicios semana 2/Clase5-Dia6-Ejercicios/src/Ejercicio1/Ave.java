package Ejercicio1;

public class Ave extends Animal{
    private Double envergaduraAla;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;

    public Ave() {
    }

    public Ave(Double envergaduraAla, String tipoVuelo, String colorPlumaje, String tipoPico) {
        this.envergaduraAla = envergaduraAla;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    public Ave(Integer id, String nombre, Integer edad, String tipoPiel, String tipoAlimentacion, Double envergaduraAla, String tipoVuelo, String colorPlumaje, String tipoPico) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.envergaduraAla = envergaduraAla;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    @Override
    public String saludar(){
        return "Hola, soy un ave";
    }
}
