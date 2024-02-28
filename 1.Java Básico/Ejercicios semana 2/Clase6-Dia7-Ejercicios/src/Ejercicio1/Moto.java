package Ejercicio1;

public class Moto extends Vehiculo implements Combustion{
    private Integer cilindrada;
    private String tipoMotor;

    public Moto() {
    }

    public Moto(Integer cilindrada, String tipoMotor) {
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public Moto(Integer id, String placa, String marca, String modelo, Integer anio, Double costo, Integer cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String cargarCombustible() {
        return "Se está cargando la moto";
    }

    @Override
    public String edadVehiculo() {
        int edad = 2024-super.getAnio();
        return "La moto tiene una antigüedad de " + edad + " años.";
    }

    @Override
    public String toString() {
        return super.toString() + " Es una moto tiene una cilindrada de " + cilindrada + " y un motor de " + tipoMotor + ".";

    }
}
