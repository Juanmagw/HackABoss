package Ejercicio1;

import java.util.List;

public class ExploradorDirectorios {

    public void explorarDirectorio(Directorio directorio) {
        if(directorio.getArchivos().size() > 0){
            directorio.getArchivos().forEach(archivo -> {
                System.out.println("- " + archivo);
            });
        }
        directorio.getSubdirectorios().forEach(subdirectorio -> {
            System.out.println("-  " + subdirectorio.getNombre());
            explorarDirectorio(subdirectorio);
        });
    }

}
