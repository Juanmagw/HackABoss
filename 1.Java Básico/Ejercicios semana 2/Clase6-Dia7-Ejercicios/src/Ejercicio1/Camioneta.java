package Ejercicio1;

public class Camioneta extends Vehiculo implements Combustion{
    private Integer capacidadTanque;
    private Integer consumoCombustible;

    public Camioneta() {
    }

    public Camioneta(Integer capacidadTanque, Integer consumoCombustible) {
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public Camioneta(Integer id, String placa, String marca, String modelo, Integer anio, Double costo, Integer capacidadTanque, Integer consumoCombustible) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public String cargarCombustible() {
        return "Se está cargando la camioneta";
    }

    @Override
    public String edadVehiculo() {
        int edad = 2024-super.getAnio();
        return "La camioneta tiene una antigüedad de " + edad + " años.";
    }

    @Override
    public String toString() {
        return super.toString() + " Es una camioneta tiene una capacidad de tanque de " + capacidadTanque + " litros y un consumo de combustible de " + consumoCombustible + " litros cada 100km.";

    }
}
