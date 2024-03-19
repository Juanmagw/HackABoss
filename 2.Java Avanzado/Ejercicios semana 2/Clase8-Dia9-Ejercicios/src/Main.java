import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>(
                Arrays.asList(
                        new Vehiculo("Ford", "Fiesta", 1000),
                        new Vehiculo("Ford", "Focus", 1200),
                        new Vehiculo("Ford", "Explorer", 2500),
                        new Vehiculo("Fiat", "Uno", 500),
                        new Vehiculo("Fiat", "Cronos", 1000),
                        new Vehiculo("Fiat", "Torino", 1250),
                        new Vehiculo("Chevrolet", "Aveo", 1250),
                        new Vehiculo("Chevrolet", "Spin", 2500),
                        new Vehiculo("Toyota", "Corolla", 1200),
                        new Vehiculo("Toyota", "Fortuner", 3000),
                        new Vehiculo("Renault", "Logan", 950)
        ));

        //Vehículos ordenados por costo
        List<Vehiculo> vehiculosPrecio = vehiculos.stream()
                .sorted((v1,v2)->v1.getCosto().compareTo(v2.getCosto()))
                .collect(Collectors.toList());

                vehiculosPrecio.forEach(System.out::println);

        System.out.println(" ");

        //Vehículos ordenados por marca y costo
        vehiculosPrecio.stream()
                .sorted((v1,v2)->v1.getMarca().compareTo(v2.getMarca()))
                .forEach(System.out::println);

        System.out.println(" ");

        //Vehículos con precio menor a 1000
        List<Vehiculo> vehiculosMenor1000 = vehiculos.stream()
                .filter(p->p.getCosto()<1000)
                .collect(Collectors.toList());

        //Vehículos con precio mayor a 1000
        List<Vehiculo> vehiculosMayor1000 = vehiculos.stream()
                .filter(p->p.getCosto()>=1000)
                .collect(Collectors.toList());

        //Promedio total lista de vehículos
        Double promedio = vehiculos.stream()
        .mapToInt(Vehiculo::getCosto)
                .average()
                .getAsDouble();

        System.out.println("El promedio de los precios es: " + promedio.intValue() + " €");
    }
}