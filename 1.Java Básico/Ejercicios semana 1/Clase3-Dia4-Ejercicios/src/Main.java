public class Main {
    public static void main(String[] args) {
        /*//Ejercicio 1

        //Creación de 3 objetos de la clase electrodoméstico con parámetros
        Electrodomestico electrodomestico1 = new Electrodomestico("1234SB","Siemens","Extra grande",400,"Blanco");
        Electrodomestico electrodomestico2 = new Electrodomestico("1234TN","Thompson","Doble puerta",600,"Negro");
        Electrodomestico electrodomestico3 = new Electrodomestico("1234PV","Philips","Tres patas",400,"Verde");

        //Creación de 1 objeto de la clase electrodoméstico sin parámetros
        Electrodomestico electrodomestico4 = new Electrodomestico();

        //Muestra por pantalla de la marca, modelo y consumo de los 3 primeros electrodomésticos
        System.out.println("Electrodomestico 1 - Marca: " + electrodomestico1.getMarca() + ", Modelo: " + electrodomestico1.getModelo() + ", Consumo: " + electrodomestico1.getConsumo());
        System.out.println("Electrodomestico 2 - Marca: " + electrodomestico2.getMarca() + ", Modelo: " + electrodomestico2.getModelo() + ", Consumo: " + electrodomestico2.getConsumo());
        System.out.println("Electrodomestico 3 - Marca: " + electrodomestico3.getMarca() + ", Modelo: " + electrodomestico3.getModelo() + ", Consumo: " + electrodomestico3.getConsumo());

        //Muestra por pantalla de la marca del electrodoméstico sin parámetros
        //En este caso, el resultado es null debido a que, al crearlo, no se usaron parámetros y, por defecto, estos se setean a null
        System.out.println("Electrodomestico 4 - Marca: " + electrodomestico4.getMarca());

        //De la forma siguiente conseguimos setear datos a este objeto dando así lugar a la muestra de los datos
        electrodomestico4.setMarca("Taurus");
        System.out.println("Electrodomestico 4 - Marca: " + electrodomestico4.getMarca());*/

        //Ejercicio 2

        //Creación
        Persona[] personas = new Persona[5];

        //Creación de 5 objetos de la clase persona con parámetros y almacenamiento de éstos en el array de personas
        personas[0] = new Persona(1,"Juan",23,"Calle A",612345678);
        personas[1] = new Persona(2,"Luis",20,"Calle B",609876543);
        personas[2] = new Persona(3,"Amara",31,"Calle C",612340987);
        personas[3] = new Persona(4,"Sandra",25,"Calle D",612093487);
        personas[4] = new Persona(5,"Juliana",40,"Calle E",654783290);

        //Recorrido del array de personas mostrando por pantalla los datos de cada persona
        for(int i=0;i< personas.length;i++){
            System.out.println(personas[i].getNombre() + " tiene " + personas[i].getEdad() + " años");
        }

        //Cambio del nombre de 2 objetos persona
        System.out.println("\nAntes: " + personas[0].getNombre());
        personas[0].setNombre("Pedro");
        System.out.println("Después: " + personas[0].getNombre());
        System.out.println("\nAntes: " + personas[4].getNombre());
        personas[4].setNombre("Gabriela");
        System.out.println("Después: " + personas[4].getNombre() + "\n");

        //Recorrido del array de personas mostrando por pantalla los datos de cada persona mientras sea mayor de 30 años
        for(int i=0;i< personas.length;i++){
            if(personas[i].getEdad()>30){
                System.out.println(personas[i].getNombre() + " tiene " + personas[i].getEdad() + " años, por tanto supera el mínimo de 30 años");
            }
        }
    }
}