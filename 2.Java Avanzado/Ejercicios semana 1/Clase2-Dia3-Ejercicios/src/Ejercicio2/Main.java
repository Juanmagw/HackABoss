package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Mesa", "Mesa de jardín", 200);
        Producto p2 = new Producto("Nevera", "Nevera de doble puerta", 2000);
        Producto p3 = new Producto("Televisión", "Televisión LG QLED 50"+'"', 500);

        Trabajador t1 = new Trabajador("Juan", "Estación 1",p1);
        Trabajador t2 = new Trabajador("Pedro", "Estación 2", p2);
        Trabajador t3 = new Trabajador("Luis", "Estación 3", p3);

        t1.start();
        t2.start();
        t3.start();
    }
}
