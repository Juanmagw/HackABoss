package Ejercicio1;

public class Agente extends Thread{
    private String nombre;
    private Llamada llamada;

    public Agente() {
    }

    public Agente(String nombre, Llamada llamada) {
        this.nombre = nombre;
        this.llamada = llamada;
    }

    public Llamada getLlamada() {
        return llamada;
    }

    public void recibirLlamada(String nombreLlamada) {
        System.out.println("El agente " + nombre + " está recibiendo una llamada a " + nombreLlamada);
    }

    public void resolverConsulta(String nombreLlamada) {
        System.out.println("El agente " + nombre + " está resolviendo una consulta a " + nombreLlamada);
    }

    public void registrarInfo(String nombreLlamada) {
        System.out.println("El agente " + nombre + " está registrando la información a " + nombreLlamada);
    }

    @Override
    public void run() {
        recibirLlamada(llamada.getNombre());
        resolverConsulta(llamada.getNombre());
        registrarInfo(llamada.getNombre());
    }
}
