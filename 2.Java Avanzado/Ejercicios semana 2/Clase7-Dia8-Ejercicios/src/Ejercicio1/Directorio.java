package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Directorio {
    private Integer id;
    private String nombre;
    private List<Directorio> subdirectorios;
    private List<String> archivos;

    public Directorio(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
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

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

    public void agregarDirectorio(Directorio directorio) {
        subdirectorios.add(directorio);
    }

    public void agregarArchivo(String archivo) {
        archivos.add(archivo);
    }

    @Override
    public String toString() {
        return "El directorio con id " + id +
                " y nombre " + nombre +
                " contiene los subdirectorios " + subdirectorios +
                " y los archivos " + archivos;
    }
}
