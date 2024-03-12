package Ejercicio1;

public class Empleado {
    private String nombre;
    private Double salario;
    private String Categoria;

    public Empleado() {
    }

    public Empleado(String nombre, Double salario, String categoria) {
        this.nombre = nombre;
        this.salario = salario;
        Categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    @Override
    public String toString() {
        return "El empleado se llama " + nombre + ", su salario es " + salario + " y su Categoria es " + Categoria;
    }
}
