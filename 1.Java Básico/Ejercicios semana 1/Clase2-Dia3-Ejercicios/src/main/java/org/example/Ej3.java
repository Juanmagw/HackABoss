package org.example;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        double[] temperatura = new double[7];
        double tempTotal = 0, media;
        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < temperatura.length; i++){
            System.out.print("Inserte una temperatura: ");
            temperatura[i] = scanner.nextDouble();
            tempTotal += temperatura[i];
            contador++;
        }
        media = tempTotal/contador;
        System.out.println("La media de temperatura es " + media);
    }
}
