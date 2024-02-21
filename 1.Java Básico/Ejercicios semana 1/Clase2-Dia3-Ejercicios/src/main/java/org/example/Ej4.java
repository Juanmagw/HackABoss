package org.example;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        char[][] asientos = new char[5][5];
        int fila, columna;
        boolean comprando = false;

        Scanner scanner = new Scanner(System.in);

        //Carga en la matriz los asientos a vacíos
        for(int filas = 0;filas<5;filas++){
            for(int columnas = 0;columnas<5;columnas++){
                asientos[filas][columnas] = 'O';
            }
        }

        while(!comprando){
            System.out.println("\nBienvenid@");
            System.out.println("\nIntroduzca fila");
            fila = scanner.nextInt();
            System.out.println("Introduzca asiento");
            columna = scanner.nextInt();

            //Reserva un asiento si no está ocupado
            if(fila<0 || fila>4 || columna<0 || columna>4) {
                System.out.println("No existen fila o asiento");
            }else if(asientos[fila][columna]=='O'){
                asientos[fila][columna] = 'X';
                System.out.println("Asiento reservado con éxito.\n");

                //Muestra el mapa de asientos
                for (int f =0;f<5;f++){
                    for (int c = 0;c<5;c++){
                        System.out.print(asientos[f][c] + " ");
                    }
                    System.out.println("");
                }

                System.out.println("\n¿Desea salir de la selección? Pulse S para salir u otro botón para continuar");
                if (scanner.next().equalsIgnoreCase("S")){
                    comprando = true;
                }
            } else{
                System.out.println("El asiento ya está ocupado, elija otro asiento");
            }
        }

    }
}
