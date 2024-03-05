package Ejercicio1;

import java.time.LocalDate;

public class Vuelo {
    private String nombre;
    private String destino;
    private LocalDate fechaViaje;
    private Integer numAsientos;

    public Vuelo() {
    }

    public Vuelo(String nombre, String destino, LocalDate fechaViaje, Integer numAsientos) throws ReservaInvalidaException {
        if(nombre == null || nombre == ""){
            throw new ReservaInvalidaException("El nombre del usuario debe estar relleno");
        }else if(destino == null || destino == ""){
            throw new ReservaInvalidaException("El destino debe estar relleno");
        }else if(fechaViaje == null){
            throw new ReservaInvalidaException("La fecha de viaje debe estar rellena");
        }else if(numAsientos == null || numAsientos < 1){
            throw new ReservaInvalidaException("El número de asientos debe ser mayor que 0");
        }
        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.numAsientos = numAsientos;
    }

    public Integer reservarAsientos(Integer asientos) throws ReservaInvalidaException {
        if (asientos < this.numAsientos) {
            throw new ReservaInvalidaException("No hay suficientes asientos");
        }
        return numAsientos;
    }
}
