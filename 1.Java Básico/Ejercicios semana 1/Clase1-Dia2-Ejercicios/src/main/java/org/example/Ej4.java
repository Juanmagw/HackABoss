package org.example;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número 1");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el número 2");
        num2 = scanner.nextInt();

        int suma = num1+num2;
        int resta = num1-num2;
        int multiplicacion = num1*num2;
        double division = (double)num1/num2;

        System.out.println("La suma da: " + suma);
        System.out.println("La resta da: " + resta);
        System.out.println("La multiplicación da: " + multiplicacion);
        if(num2 == 0){
            System.out.println("La división entre 0 no es válida");
        }else{
            System.out.println("La división da: " + division);
        }
    }
}
