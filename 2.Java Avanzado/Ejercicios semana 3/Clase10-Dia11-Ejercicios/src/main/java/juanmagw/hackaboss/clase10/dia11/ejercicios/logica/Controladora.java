package juanmagw.hackaboss.clase10.dia11.ejercicios.logica;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import juanmagw.hackaboss.clase10.dia11.ejercicios.persistencia.ControladoraPersistencia;
import juanmagw.hackaboss.clase10.dia11.ejercicios.persistencia.exceptions.NonexistentEntityException;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearVoto(Voto voto) {
        controlPersis.crearVoto(voto);
    }

    public void editarVoto(Voto voto) {
        controlPersis.editarVoto(voto);
    }

    public void eliminarVoto(Long id) {
        controlPersis.eliminarVoto(id);
    }

    public List<Voto> buscarVotos() {
        return controlPersis.buscarVotos();
    }

    public Voto buscarVotoNombre(String nombre) {
        return buscarVotos().stream()
                .filter(v -> v.getNombre().equals(nombre))
                .findFirst()
                .get();
    }
}
