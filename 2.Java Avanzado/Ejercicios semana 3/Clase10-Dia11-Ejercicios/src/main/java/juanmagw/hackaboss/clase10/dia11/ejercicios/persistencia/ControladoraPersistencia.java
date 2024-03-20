package juanmagw.hackaboss.clase10.dia11.ejercicios.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import juanmagw.hackaboss.clase10.dia11.ejercicios.logica.Voto;
import juanmagw.hackaboss.clase10.dia11.ejercicios.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    VotoJpaController control = new VotoJpaController();

    public void crearVoto(Voto voto) {
        control.create(voto);
    }

    public void editarVoto(Voto voto) {
        try {
            control.edit(voto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarVoto(Long id) {
        try {
            control.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Voto> buscarVotos() {
        return control.findVotoEntities();
    }
}
