package org.example;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        double precio, totalCompra = 0;
        boolean finalizar = false;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Introduzca un precio de producto: ");
            precio = scanner.nextDouble();
            if(precio>0){
                totalCompra += precio;
                System.out.println("El precio del producto es: " + precio);
            }
        }while(!finalizar && precio>0);
        System.out.println("El precio total de la compra es: " + totalCompra);
    }
}
