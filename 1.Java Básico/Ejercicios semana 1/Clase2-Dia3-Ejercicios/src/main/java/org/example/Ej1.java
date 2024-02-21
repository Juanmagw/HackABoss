package org.example;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        int edad;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();

        if(edad>=18){
            System.out.println("Es mayor de edad, por tanto, puede pasar");
        }else{
            System.out.println("No es mayor de edad, por tanto, no puede pasar");
        }
    }
}
