package Ejercicio1;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Auto> autos = new ArrayList<>(Arrays.asList(
                new Auto("Ford", "Fiesta", Year.of(2010), 20000.00),
                new Auto("Fiat", "Uno", Year.of(2012), 15000.00),
                new Auto("Chevrolet", "Corsa", Year.of(2010), 25000.00),
                new Auto("Ford", "Mondeo", Year.of(2018), 30000.00)
                ));

        InventarioAutos<Auto> inventarioAuto = new InventarioAutos<>(autos);

        //1. Agregar un auto
        inventarioAuto.agregarAuto(new Auto("Fiat", "Palio", Year.of(2015), 18000.00));

        autos.forEach(auto-> System.out.println(auto));

        System.out.println(" ");

        String marca = "ford";
        int anio = 2010;

        //2. Buscar autos por marca o año
        System.out.println("Coches marca " + marca.toUpperCase() + ":");
        inventarioAuto.buscarAutoMarca(marca).forEach(auto-> System.out.println(auto));
        System.out.println("Coches del año " + anio + ":");
        inventarioAuto.buscarAutoAnio(anio).forEach(auto-> System.out.println(auto));

        System.out.println(" ");

        //3. Calcular el total del inventario
        System.out.println("El precio total del inventario es " + inventarioAuto.calcularTotalInventario() + " €");
    }
}