package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String descripcion;
    private List<Tarea> subTareas;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.subTareas = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregarSubTarea(Tarea subTarea) {
        subTareas.add(subTarea);
    }

    public void mostrarTarea(Tarea tarea, int nivel){
        for (Tarea subTarea : tarea.subTareas) {
            System.out.println("- ".repeat(nivel + 1) + subTarea.getDescripcion());
            mostrarTarea(subTarea, 1);
        }
    }

    @Override
    public String toString() {
        return "La tarea tiene las subtareas " + subTareas;
    }
}
