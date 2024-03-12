package Ejercicio1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = List.of(
            new Empleado("Juan", 1000.0, "Desarrollador"),
            new Empleado("Ana", 1200.0, "Diseñador web"),
            new Empleado("Luis", 800.0, "Analista de datos"),
            new Empleado("Lucia", 1500.0, "Desarrollador")
        );

        //1. Obtener el nombre de los empleados cuyo sueldo supera un valor predeterminado
        empleados.stream()
                .filter(empleado -> empleado.getSalario() > 1000.0)
                .forEach(empleado -> System.out.println("Los empleados cuyo sueldo supera los 1000 son: " + empleado.getNombre()));

        //2. Obtener el salario promedio de cada categoría de empleados
        Double salarioPromedioDesarrollador = empleados.stream()
                .filter(emp -> emp.getCategoria().equalsIgnoreCase("Desarrollador"))
                .mapToDouble(Empleado::getSalario)
                .average()
                .getAsDouble();

        System.out.println("El promedio de salario de los desarrolladores es: " + salarioPromedioDesarrollador);

        Double salarioPromedioDiseniadorWeb = empleados.stream()
                .filter(emp -> emp.getCategoria().equalsIgnoreCase("Diseñador web"))
                .mapToDouble(Empleado::getSalario)
                .average()
                .getAsDouble();

        System.out.println("El promedio de salario de los desarrolladores es: " + salarioPromedioDiseniadorWeb);

        Double salarioPromedioAnalista = empleados.stream()
                .filter(emp -> emp.getCategoria().equalsIgnoreCase("Analista de datos"))
                .mapToDouble(Empleado::getSalario)
                .average()
                .getAsDouble();

        System.out.println("El promedio de salario de los desarrolladores es: " + salarioPromedioAnalista);

        //3. Obtener el empleado con el salario más alto
        empleados.stream()
                .max((emp1, emp2) -> emp1.getSalario().compareTo(emp2.getSalario()))
                .ifPresent(empleado -> System.out.println("El empleado con el salario más alto es: " + empleado.getNombre()));
    }
}