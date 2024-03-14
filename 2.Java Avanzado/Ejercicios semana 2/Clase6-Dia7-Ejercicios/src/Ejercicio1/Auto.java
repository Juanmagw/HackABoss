package Ejercicio1;

import java.time.Year;

public class Auto {
    private String marca;
    private String modelo;
    private Year anio;
    private Double precio;

    public Auto(String marca, String modelo, Year anio, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Year getAnio() {
        return (anio);
    }

    public void setAnio(Year anio) {
        this.anio = anio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "El auto de marca " + marca + " y modelo " + modelo + " es del año " + anio + " y tiene un precio de " + precio + "€";
    }
}
