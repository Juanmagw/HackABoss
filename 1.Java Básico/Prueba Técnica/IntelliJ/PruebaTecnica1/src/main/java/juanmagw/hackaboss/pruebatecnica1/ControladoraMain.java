package juanmagw.hackaboss.pruebatecnica1;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import juanmagw.hackaboss.pruebatecnica1.logica.Controladora;
import juanmagw.hackaboss.pruebatecnica1.logica.Empleado;
import juanmagw.hackaboss.pruebatecnica1.persistencia.exceptions.EmpleadoInvalidoException;

public class ControladoraMain {
    static Scanner scanner = new Scanner(System.in);

    static int id;
    static String nombre;
    static String apellido;
    static String cargo;
    static Double salario;
    static LocalDate fechaInicio;
    static Empleado empleado;
    static Controladora cont;
    static int anio;
    static int mes;
    static int dia;
    static boolean salir = false;

    public static void main(String[] args) {

        while(!salir){
            System.out.println("¡BIENVENID@ AL SISTEMA DE GESTIÓN DE EMPLEADOS!");
            System.out.println("1. Crear empleado");
            System.out.println("2. Modificar empleado");
            System.out.println("3. Eliminar empleado");
            System.out.println("4. Listar empleados");
            System.out.println("5. Listar empleados por id");
            System.out.println("6. Listar empleados por cargo");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opción");

            int opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    //Añadir empleado
                    crearEmpleado();
                    break;
                case 2:
                    //Modificar empleado
                    modificarEmpleado();
                    break;
                case 3:
                    //Eliminar empleado
                    eliminarEmpleado();
                    break;
                case 4:
                    //Listar empleados
                    obtenerEmpleados();
                    break;
                case 5:
                    //Listar empleados por id
                    obtenerEmpleadoId();
                    break;
                case 6:
                    //Listar empleados por cargo
                    obtenerEmpleadoCargo();
                    break;
                case 7:
                    //Salir
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
            }
            System.out.println("¿Desea realizar otra operación? Teclee cualquier tecla para continuar o No para salir del programa.");
            if(scanner.next().equalsIgnoreCase("no")){
                salir = true;
            }
        }
    }

    public static void crearEmpleado(){
        System.out.println("Introduce el nombre del empleado");
        nombre = scanner.next();
        System.out.println("Introduce el apellido del empleado");
        apellido = scanner.next();
        System.out.println("Introduce el cargo del empleado");
        cargo = scanner.next();
        System.out.println("Introduce el salario del empleado");
        salario = scanner.nextDouble();
        System.out.println("Introduce la fecha de inicio del empleado");
        System.out.println("Año");
        anio = scanner.nextInt();
        System.out.println("Mes");
        mes = scanner.nextInt();
        System.out.println("Día");
        dia = scanner.nextInt();
        fechaInicio = LocalDate.of(anio, mes, dia);
        try {
            empleado = new Empleado(1, nombre, apellido, cargo, salario, fechaInicio);
        } catch (EmpleadoInvalidoException e) {
            System.out.println("Error al introducir datos de empleado: " + e);
        }
        cont = new Controladora();
        cont.crearEmpleado(empleado);
        System.out.println("Ha sido creado con éxito " + empleado);
    }

    public static void modificarEmpleado(){
        System.out.println("Introduce el id del empleado a modificar");
        id = scanner.nextInt();
        System.out.println("Introduce el nombre del empleado");
        nombre = scanner.next();
        System.out.println("Introduce el apellido del empleado");
        apellido = scanner.next();
        System.out.println("Introduce el cargo del empleado");
        cargo = scanner.next();
        System.out.println("Introduce el salario del empleado");
        salario = scanner.nextDouble();
        System.out.println("Introduce la fecha de inicio del empleado");
        System.out.println("Año");
        anio = scanner.nextInt();
        System.out.println("Mes");
        mes = scanner.nextInt();
        System.out.println("Día");
        dia = scanner.nextInt();
        fechaInicio = LocalDate.of(anio, mes, dia);
        cont = new Controladora();
        empleado = cont.obtenerEmpleado(id);
        System.out.println("El empleado a modificar era: " + empleado);
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setCargo(cargo);
        empleado.setSalario(salario);
        empleado.setFechaInicio(fechaInicio);
        cont.modificarEmpleado(empleado);
        System.out.println("El empleado ya modificado es: " + empleado);
    }

    public static void submenuModificarEmpleado(){
        System.out.println("¿Qué datos desea editar?");
        System.out.println("1. Nombre");
        System.out.println("2. Apellido");
        System.out.println("3. Cargo");
        System.out.println("4. Salario");
        System.out.println("5. Fecha de inicio");
        System.out.println("6. Cancelar modificación");
        System.out.println("Seleccione una opción");

        int opcion = scanner.nextInt();

        switch(opcion){
            case 1:
                //Modificar nombre

                break;
            case 2:
                //Modificar apellido

                break;
            case 3:
                //Modificar cargo

                break;
            case 4:
                //Modificar salario

                break;
            case 5:
                //Modificar fecha de inicio

                break;
            case 6:
                //Cancelar modificación
                System.exit(0);
                break;
        }
        System.out.println("¿Desea realizar otra operación? Teclee cualquier tecla para continuar o No para salir del programa.");
        if(scanner.next().equalsIgnoreCase("no")){
            salir = true;
        }
    }

    public static void eliminarEmpleado(){
        System.out.println("Introduce el id del empleado a eliminar");
        id = scanner.nextInt();
        cont = new Controladora();
        cont.eliminarEmpleado(id);
        System.out.println("El empleado con id " + id + " ha sido eliminado.");
    }

    public static void obtenerEmpleados(){
        cont = new Controladora();
        List<Empleado> empleados = cont.obtenerEmpleados();
        for(Empleado emp : empleados) {
            System.out.println(emp);
        };
    }

    public static void obtenerEmpleadoId(){
        System.out.println("Introduce el id del empleado a buscar");
        id = scanner.nextInt();
        cont = new Controladora();
        empleado = cont.obtenerEmpleado(id);
        System.out.println(empleado);
    }

    public static void obtenerEmpleadoCargo(){
        System.out.println("Introduce el cargo del empleado a buscar");
        cargo = scanner.next();
        cont = new Controladora();
        empleado = cont.obtenerEmpleadoCargo(cargo);
        System.out.println(empleado);
    }
}
