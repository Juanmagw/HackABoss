package Ejercicio2;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Evento> eventos = List.of(
                new Evento("Feria de Córdoba", LocalDate.of(2024,04,19), "Feria"),
                new Evento("Semana Santa", LocalDate.of(2024,04,14), "Religioso"),
                new Evento("Festival de la Guitarra", LocalDate.of(2024,07,01), "Musical"),
                new Evento("Festival de música", LocalDate.of(2024,05,01), "Musical"),
                new Evento("Festival de música2", LocalDate.of(2024,05,01), "Musical")
        );

        //1. Mostrar todos los eventos con una fecha predeterminada
        eventos.stream()
                .filter(evento -> evento.getFecha().equals(LocalDate.of(2024,05,01)))
                .forEach(System.out::println);

        //2. Mostrar todos los eventos que sean de la categoría especificada
        Long cantidadMusical = eventos.stream()
                .filter(evento -> evento.getCategoria().equals("Musical"))
                .count();

        System.out.println("En la categoría Musical hay " + cantidadMusical + " eventos");

        Long cantidadFeria = eventos.stream()
                .filter(evento -> evento.getCategoria().equals("Feria"))
                .count();

        System.out.println("En la categoría Feria hay " + cantidadFeria + " eventos");

        Long cantidadReligioso = eventos.stream()
                .filter(evento -> evento.getCategoria().equals("Religioso"))
                .count();

        System.out.println("En la categoría Religioso hay " + cantidadReligioso + " eventos");

        //3. Mostrar el evento que sea más próximo a la fecha actual
        Evento eventoMasProximo = eventos.stream()
                .min((evento1, evento2) -> evento1.getFecha().compareTo(evento2.getFecha()))
                .get();

        System.out.println("El evento más próximo es: " + eventoMasProximo);
    }
}
