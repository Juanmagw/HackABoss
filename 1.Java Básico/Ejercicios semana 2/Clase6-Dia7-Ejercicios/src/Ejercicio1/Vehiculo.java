package Ejercicio1;

public abstract class Vehiculo {
    private Integer id;
    private String placa;
    private String marca;
    private String modelo;
    private Integer anio;
    private Double costo;

    public Vehiculo() {
    }

    public Vehiculo(Integer id, String placa, String marca, String modelo, Integer anio, Double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.costo = costo;
    }

    public Integer getAnio() {
        return anio;
    }

    public abstract String edadVehiculo();

    @Override
    public String toString() {
        return "El vehículo tiene una id " + id + ", una placa " + placa + ", es de " + marca + " con modelo '" + modelo + ", del año " + anio + " y un costo de " + costo + ".";
    }
}
