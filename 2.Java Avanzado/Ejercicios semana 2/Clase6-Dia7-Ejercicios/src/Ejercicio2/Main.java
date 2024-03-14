package Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mascota> mascotas = new ArrayList<>(Arrays.asList(
                new Mascota<String>(1, "Firulais", 3, "Perro"),
                new Mascota<String>(2, "Mishi", 2, "Gato"),
                new Mascota<String>(3, "Piolin", 3, "Pajaro"),
                new Mascota<String>(4, "Maxi", 4, "Perro")
        ));

        RegistroMascotas<Mascota> registroMascotas = new RegistroMascotas<>(mascotas);

        //1. Agregar una mascota
        registroMascotas.agregarMascota(new Mascota<String>(5, "Piolin", 3, "Pajaro"));

        mascotas.forEach(mascota -> System.out.println(mascota));

        System.out.println(" ");

        //2. Buscar mascota por nombre
        registroMascotas.buscarMascotaNombre("Piolin").forEach(mascota -> System.out.println(mascota));

        System.out.println(" ");

        //3. Buscar mascota por especie
        registroMascotas.buscarMascotaEspecie("Perro").forEach(mascota -> System.out.println(mascota));

        System.out.println(" ");

        //4. Contar mascotas
        System.out.println("Cantidad de mascotas: " + registroMascotas.contarMascotas());

        System.out.println(" ");

        //5. Generar datos de mascota
        Mascota mascotaRandom = registroMascotas.generarDatosMascota();
        System.out.println(mascotaRandom);

    }
}
