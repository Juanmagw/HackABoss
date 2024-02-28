package Ejercicio1;

public class Auto extends Vehiculo implements Electrico{
    private Integer capacidadBateria;
    private Integer autonomia;

    public Auto() {
    }

    public Auto(Integer capacidadBateria, Integer autonomia) {
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public Auto(Integer id, String placa, String marca, String modelo, Integer anio, Double costo, Integer capacidadBateria, Integer autonomia) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    @Override
    public String cargarEnergia() {
        return "Se está cargando el auto";
    }

    @Override
    public String edadVehiculo() {
        int edad = 2024-super.getAnio();
        return "El auto tiene una antigüedad de " + edad + " años.";
    }

    @Override
    public String toString() {
        return super.toString() + " Es un auto tiene una capacidad de batería de " + capacidadBateria + " miliamperios y una autonomía de " + autonomia + " años.";
    }
}
