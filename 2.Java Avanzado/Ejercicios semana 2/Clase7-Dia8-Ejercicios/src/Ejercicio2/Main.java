package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Tarea tarea1 = new Tarea("Tarea 1");
        Tarea subTarea1 = new Tarea("Tarea 1-1");
        subTarea1.agregarSubTarea(new Tarea("Tarea 1-1-1"));
        subTarea1.agregarSubTarea(new Tarea("Tarea 1-1-2"));
        subTarea1.agregarSubTarea(new Tarea("Tarea 1-1-3"));
        tarea1.agregarSubTarea(subTarea1);
        tarea1.agregarSubTarea(new Tarea("Tarea 1-2"));
        tarea1.agregarSubTarea(new Tarea("Tarea 1-3"));

        System.out.println(tarea1.getDescripcion() + " posee la siguiente estructura: ");
        tarea1.mostrarTarea(tarea1,0);
    }
}
