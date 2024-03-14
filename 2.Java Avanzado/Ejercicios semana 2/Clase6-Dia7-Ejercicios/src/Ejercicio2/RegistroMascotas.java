package Ejercicio2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RegistroMascotas <T extends Mascota>{
    List<T> mascotas;

    public RegistroMascotas(List<T> mascotas) {
        this.mascotas = mascotas;
    }

    public void agregarMascota(T mascota) {
        mascotas.add(mascota);
    }

    public List<T> buscarMascotaNombre(String nombre) {
        return mascotas.stream()
                .filter(mascota -> mascota.getNombre().equals(nombre))
                .collect(Collectors.toList());
    }

    public List<T> buscarMascotaEspecie(String especie) {
        return mascotas.stream()
                .filter(mascota -> mascota.getEspecie().equals(especie))
                .collect(Collectors.toList());
    }

    public Integer contarMascotas(){
        return mascotas.size();
    }

    public Mascota generarDatosMascota(){
        String[] nombres = {"Tobi", "Jerry", "Percy", "Tom", "Fluffy", "Coco", "Duque", "Dylan", "Chicho", "Dartamian"};
        int randomNameIndex= new Random().nextInt(nombres.length);
        String[] especies = {"Perro", "Gato", "Pajaro", "Conejo", "Tortuga", "Hamster", "Pez", "Cerdo", "Cabra", "Vaca"};
        int randomSpecieIndex= new Random().nextInt(especies.length);
        Integer id = new Random().nextInt(10);
        String nombre = nombres[randomNameIndex];
        Integer edad = new Random().nextInt(10);
        String especie = especies[randomSpecieIndex];
        return new Mascota(id, nombre, edad, especie);
    }
}
