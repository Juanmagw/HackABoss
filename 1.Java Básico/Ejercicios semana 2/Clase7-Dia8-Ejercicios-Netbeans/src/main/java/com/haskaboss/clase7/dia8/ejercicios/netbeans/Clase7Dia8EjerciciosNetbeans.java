/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.haskaboss.clase7.dia8.ejercicios.netbeans;

import com.haskaboss.clase7.dia8.ejercicios.netbeans.modelo.Platillo;
import com.haskaboss.clase7.dia8.ejercicios.netbeans.persistencia.ControladorPlatillo;
import java.util.List;

/**
 *
 * @author juanm
 */
public class Clase7Dia8EjerciciosNetbeans {

    public static void main(String[] args) {

        //Creamos un nuevo platillo
        Platillo platillo = new Platillo("Ramen", "Fideos con carne y verduras", 15.0);

        //Creamos un objeto controlador de platillo que nos servirá para llamar a los métodos de la clase del mismo, donde está el CRUD montado
        ControladorPlatillo platilloController = new ControladorPlatillo();

        //Llamamos a la funcion creatPlatillo que inserta un elemento en la base de datos
        platilloController.crearPlatillo(platillo);

        //Llamamos a la funcion eliminarPlatillo que elimina un elemento en la base de datos
        platilloController.eliminarPlatillo(2);

        platillo.setId(3);
        platillo.setNombre("Macarrones");
        platillo.setReceta("Pasta con tomate y carne de solomillo");
        platillo.setPrecio(10.50);
        //Llamamos a la funcion modificarPlatillo que modifica un elemento en la base de datos con los datos introducidos anteriormente
        platilloController.modificarPlatillo(platillo);

        //Llamamos a la funcion mostrarPlatillos que recoge todos los elementos de la base de datos
        List<Platillo> platillos = platilloController.mostrarPlatillos();
        for (Platillo p : platillos) {
            System.out.println(p);
        }
    }
}
