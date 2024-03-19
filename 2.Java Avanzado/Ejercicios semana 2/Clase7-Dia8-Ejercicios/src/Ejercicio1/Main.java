package Ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Directorio> directorios = new ArrayList<>(
                Arrays.asList(new Directorio(1, "Directorio 1"),
                              new Directorio(2, "Directorio 2"),
                              new Directorio(3, "Directorio 3"),
                              new Directorio(4, "Directorio 4"))
        );

        List<String> archivos = new ArrayList<>(
                Arrays.asList("Archivo 1", "Archivo 2", "Archivo 3", "Archivo 4"));


        directorios.get(0).agregarDirectorio(new Directorio(11, "SubDirectorio 1-1"));
        directorios.get(0).agregarDirectorio(new Directorio(12, "SubDirectorio 1-2"));
        directorios.get(0).agregarDirectorio(new Directorio(13, "SubDirectorio 1-3"));

        directorios.get(0).agregarArchivo(archivos.get(0));
        directorios.get(0).agregarArchivo(archivos.get(1));
        directorios.get(0).agregarArchivo(archivos.get(2));
        directorios.get(0).agregarArchivo(archivos.get(3));
        directorios.get(0).getSubdirectorios().get(2).agregarArchivo(archivos.get(0));
        directorios.get(0).getSubdirectorios().get(2).agregarArchivo(archivos.get(1));
        directorios.get(0).getSubdirectorios().get(2).agregarArchivo(archivos.get(2));
        directorios.get(0).getSubdirectorios().get(2).agregarArchivo(archivos.get(3));

        ExploradorDirectorios explorador = new ExploradorDirectorios();


        System.out.println(directorios.get(0).getNombre() + " tiene la siguiente estructura: ");
        directorios.forEach(directorio -> {
            explorador.explorarDirectorio(directorio);
        });
    }
}