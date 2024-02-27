package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        
        //C
        Mamifero mamifero = new Mamifero(1,"Percy",3,"Pelo","Carnívoro",4,"Vivíparo","Blanco","Bosque");
        Ave ave = new Ave(2,"Floppy",4,"Plumas","Omnbívoro",0.5,"Corto","Azul","Selvas");
        Reptil reptil = new Reptil(3,"Renekton",5,"Escamas","Carnívoro",1.0,"Cortas","Sin veneno");

        System.out.println(mamifero.saludar());
        System.out.println(ave.saludar());
        System.out.println(reptil.saludar());

        //D
        //Se le asigna sin problemas pero éste ya no es un animal sino un mamífero, en este caso
        Animal animal = mamifero;
        System.out.println(animal.saludar());
        
        //E
        //No se podrían llamar desde otra clase debido a que al dejarlo como provado solo se puedn usar en la misma clase y solo en ella
    }
}