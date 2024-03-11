package juanmagw.hackaboss.pruebatecnica1.logica;

import java.util.List;
import juanmagw.hackaboss.pruebatecnica1.persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia cp = new ControladoraPersistencia();

    public void crearEmpleado(Empleado empleado) {
        cp.crearEmpleado(empleado);
    }

    public List<Empleado> obtenerEmpleados() {
        return cp.obtenerEmpleados();
    }

    public Empleado obtenerEmpleado(Integer id) {
        return cp.obtenerEmpleado(id);
    }

    public void modificarEmpleado(Empleado empleado) {
        cp.modificarEmpleado(empleado);
    }

    public void eliminarEmpleado(Integer id) {
        cp.eliminarEmpleado(id);
    }

    public Empleado obtenerEmpleadoCargo(String cargo) {
        return cp.obtenerEmpleadoCargo(cargo);
    }
}
