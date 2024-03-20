package juanmagw.hackaboss.ejerciciointegradorjsp.jpa.logica;

import java.util.List;
import juanmagw.hackaboss.ejerciciointegradorjsp.jpa.persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearEquipo(Equipo equipo) {
        controlPersis.crearEquipo(equipo);
    }

    public void crearPartido(Partido partido) {
        controlPersis.crearPartido(partido);
    }

    public void eliminarEquipo(Long id) {
        controlPersis.eliminarEquipo(id);
    }

    public void eliminarPartido(Long id) {
        controlPersis.eliminarPartido(id);
    }

    public List<Equipo> buscarEquipos() {
        return controlPersis.buscarEquipos();
    }

    public List<Partido> buscarPartidos() {
        return controlPersis.buscarPartidos();
    }

    public Equipo buscarEquipoPorID(Long id) {
        return (Equipo) buscarEquipos().stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .get();
    }

    public Partido buscarPartidoPorID(Long id) {
        return (Partido) buscarPartidos().stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .get();
    }

    public void editarEquipo(Equipo equipo) {
        controlPersis.editarEquipo(equipo);
    }

    public void editarPartido(Partido partido) {
        controlPersis.editarPartido(partido);
    }
}
