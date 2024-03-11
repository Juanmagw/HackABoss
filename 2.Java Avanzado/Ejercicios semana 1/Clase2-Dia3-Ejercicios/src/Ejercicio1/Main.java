package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Llamada l1 = new Llamada("Felipe", "¿Cómo saco a mi gato de la lavadora en marcha?", "El gato está dentro de la lavadora y ésta está en marcha");
        Llamada l2 = new Llamada("Marcos", "¿Puede localizar a un cerrajero?, mi llave se ha roto", "La llave está rota y no puede abrir la puerta de su casa");
        Llamada l3 = new Llamada("Andrea", "Tengo goteras en casa, necesito a un fontanero", "Tiene goteras en casa y no sabe cómo solucionarlo");

        //Como a cada hilo(agente) se le pasa una llamada, no habrá conflicto entre las llamadas de cada uno de los hilos
        Agente hilo1 = new Agente("Juan", l1);
        Agente hilo2 = new Agente("Pedro", l2);
        Agente hilo3 = new Agente("María", l3);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}