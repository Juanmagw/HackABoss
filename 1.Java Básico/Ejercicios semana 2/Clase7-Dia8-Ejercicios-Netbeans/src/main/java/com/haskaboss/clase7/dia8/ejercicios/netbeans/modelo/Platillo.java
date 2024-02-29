package com.haskaboss.clase7.dia8.ejercicios.netbeans.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Platillo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String receta;
    private Double precio;

    public Platillo() {
    }

    public Platillo( String nombre, String receta, Double precio) {
        this.nombre = nombre;
        this.receta = receta;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getReceta() {
        return receta;
    }
    public void setReceta(String receta) {
        this.receta = receta;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "El platillo tiene id " + id + " se llama " + nombre + ", su receta es " + receta + " y tiene un precio de " + precio + "€";
    }
    
}
