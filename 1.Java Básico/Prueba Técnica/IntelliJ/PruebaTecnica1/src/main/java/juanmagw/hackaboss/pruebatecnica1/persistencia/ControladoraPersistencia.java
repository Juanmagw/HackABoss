package juanmagw.hackaboss.pruebatecnica1.persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import juanmagw.hackaboss.pruebatecnica1.logica.Empleado;
import juanmagw.hackaboss.pruebatecnica1.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    EmpleadoJpaController ec = new EmpleadoJpaController();

    public void crearEmpleado(Empleado empleado) {
        ec.create(empleado);
    }

    public List<Empleado> obtenerEmpleados() {
        return ec.findEmpleadoEntities();
    }

    public List<Empleado> obtenerEmpleadosNoBorrados() {
        List<Empleado> empleados = ec.findEmpleadoEntities();
        List<Empleado> empleadosNoBorrados = new ArrayList<>();
        for(Empleado emp : empleados){
            if(!emp.getBorrado()){
                empleadosNoBorrados.add(emp);
            }
        }
        return empleadosNoBorrados;
    }

    public Empleado obtenerEmpleado(Integer id) {
        return ec.findEmpleado(id);
    }

    public void modificarEmpleado(Empleado empleado) {
        try {
            ec.edit(empleado);
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error: " + ex.getMessage());
        }
    }

    public void eliminarEmpleado(Integer id) {
        try {
            //ec.destroy(id);
            Empleado empleado = ec.findEmpleado(id);
            empleado.setBorrado(true);
            ec.edit(empleado);
        } catch (NonexistentEntityException ex) {
            System.out.println("Ha ocurrido un error: " + ex.getMessage());
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    public Empleado obtenerEmpleadoCargo(String cargo) {
        List<Empleado> empleados = ec.findEmpleadoEntities();
        Empleado empleado = new Empleado();
        empleado.setCargo(cargo);
        for (Empleado em : empleados) {
            if (em.getCargo().equals(cargo)) {
                empleado = em;
            }
        }
        return empleado;
    }
}
