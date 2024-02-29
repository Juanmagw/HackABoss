/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.haskaboss.clase7.dia8.ejercicios.netbeans.persistencia;

import com.haskaboss.clase7.dia8.ejercicios.netbeans.modelo.Platillo;
import com.haskaboss.clase7.dia8.ejercicios.netbeans.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juanm
 */
public class ControladorPlatillo {

    PlatilloJpaController jpaPlatillo = new PlatilloJpaController();

    public void crearPlatillo(Platillo platillo) {
        jpaPlatillo.create(platillo);
        System.out.println("El platillo se creó correctamente");
    }

    public List<Platillo> mostrarPlatillos() {
        return jpaPlatillo.findPlatilloEntities();
    }

    public void eliminarPlatillo(Integer id) {
        try {
            jpaPlatillo.destroy(id);
            System.out.println("El platillo se creó correctamente");
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPlatillo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarPlatillo(Platillo platillo) {
        try {
            jpaPlatillo.edit(platillo);
            System.out.println("El platillo se creó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(ControladorPlatillo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
