package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] almacen = new String[2];

        Scanner scanner = new Scanner(System.in);

        almacen = almacenarDatos(almacen);

        try {
            for(int i = 0; i < almacen.length; i++){
                System.out.println("Seleccione el indice del dato que desea mostrar: ");
                i = scanner.nextInt();
                System.out.println(i + " -> " + almacen[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El indice debe ser entre 0 y 4." + e);
        }
    }

    public static String[] almacenarDatos(String[] almacen)  throws ArrayIndexOutOfBoundsException{
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < almacen.length; i++){
            if(i < 0 || i > 4){
                throw new ArrayIndexOutOfBoundsException("Error: El indice debe ser entre 0 y 4.");
            }
            System.out.println("Ingrese un dato: ");
            String dato = scanner.next();

            almacen[i] = dato;
        }
        return almacen;
    }

}
