package Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws ReservaInvalidaException {
        Vuelo vuelo = new Vuelo("Juan", "Lituania", LocalDate.of(2024,5,25),6);

        try{
            Vuelo vuelo2 = new Vuelo(null, "Lituania", LocalDate.of(2024,5,25),6);  //Validación de nombre
        }catch (ReservaInvalidaException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Se han podido reservar los asientos pedidos:  " + vuelo.reservarAsientos(7));
        }catch (ReservaInvalidaException e){
            System.out.println(e.getMessage());
        }

        try{
            vuelo.reservarAsientos(5);  //Validación de asientos
        }catch (ReservaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
}