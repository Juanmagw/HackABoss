package juanmagw.hackaboss.ejerciciointegradorjsp.jpa.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import juanmagw.hackaboss.ejerciciointegradorjsp.jpa.logica.Equipo;
import juanmagw.hackaboss.ejerciciointegradorjsp.jpa.logica.Partido;
import juanmagw.hackaboss.ejerciciointegradorjsp.jpa.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    EquipoJpaController equipoControl = new EquipoJpaController();

    PartidoJpaController partidoControl = new PartidoJpaController();

    public void crearEquipo(Equipo equipo) {
        equipoControl.create(equipo);
    }

    public void crearPartido(Partido partido) {
        partidoControl.create(partido);
    }

    public void eliminarEquipo(Long id) {
        try {
            equipoControl.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPartido(Long id) {
        try {
            partidoControl.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Equipo> buscarEquipos() {
        return equipoControl.findEquipoEntities();
    }

    public List<Partido> buscarPartidos() {
        return partidoControl.findPartidoEntities();
    }

    public void editarEquipo(Equipo equipo) {
        try {
            equipoControl.edit(equipo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarPartido(Partido partido) {
        try {
            partidoControl.edit(partido);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
