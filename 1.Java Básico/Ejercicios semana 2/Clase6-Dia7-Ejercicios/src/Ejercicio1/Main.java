package Ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto(1,"1234-ABC","Peugeot","308",2008,9000.0,50000,25));
        vehiculos.add(new Camioneta(2,"5678-DEF","Seat","Cordoba",2017,29000.0,150,10));
        vehiculos.add(new Moto(3,"9012-GHI","Ducatti","FT-400",2012,7500.0,125,"Doble filtrado"));

        for(Vehiculo vehiculo : vehiculos){
            System.out.println(vehiculo);
            System.out.println(vehiculo.edadVehiculo());
            if(vehiculo instanceof Auto){
                Auto a = (Auto) vehiculo;
                System.out.println(a.cargarEnergia());
            }else if(vehiculo instanceof Camioneta){
                Camioneta c = (Camioneta) vehiculo;
                System.out.println(c.cargarCombustible());
            }else if(vehiculo instanceof Moto){
                Moto m = (Moto) vehiculo;
                System.out.println(m.cargarCombustible());
            }
        }
    }
}