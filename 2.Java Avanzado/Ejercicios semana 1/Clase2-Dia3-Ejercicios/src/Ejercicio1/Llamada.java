package Ejercicio1;

public class Llamada {
    private String nombre;
    private String consulta;
    private String informacion;

    public Llamada() {
    }

    public Llamada(String nombre, String consulta, String informacion) {
        this.nombre = nombre;
        this.consulta = consulta;
        this.informacion = informacion;
    }

    public String getNombre() {
        return nombre;
    }
}
