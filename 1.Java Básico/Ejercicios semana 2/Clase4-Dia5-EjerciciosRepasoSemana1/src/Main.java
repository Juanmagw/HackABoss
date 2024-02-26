public class Main {
    public static void main(String[] args) {
        //A
        //Creación del vector de verduras
        Verdura[] verduras = new Verdura[5];

        //Creación de los objetos verdura y asignación de cada uno dentro del vector anterior
        verduras[0] = new Verdura(1,"Zanahoria","Naranja",20,true);
        verduras[1] = new Verdura(2,"Patata","Marrón",40,true);
        verduras[2] = new Verdura(3,"Pimiento","Verde",15,false);
        verduras[3] = new Verdura(4,"Cebolla","Blanca",30,false);
        verduras[4] = new Verdura(5,"Lechuga","Verde",25,false);

        //B
        //Recorrido del vector verduras mostrando el nombre y las calorías de cada elemento
        for(int i=0;i< verduras.length;i++){
            System.out.println("La verdura " + verduras[i].getNombre() + " tiene " + verduras[i].getCalorias());
        }

        //C
        //Cambio de las propiedades de dos elementos del vector verduras mostrando todos sus datos
        verduras[0].setId(6);
        verduras[0].setNombre("Pepinillo");
        verduras[0].setColor("Verde");
        verduras[0].setCalorias(5);
        verduras[0].setDebeCocinarse(false);

        verduras[3].setId(7);
        verduras[3].setNombre("Calabaza");
        verduras[3].setColor("Naranja");
        verduras[3].setCalorias(60);
        verduras[3].setDebeCocinarse(true);

        System.out.println("\n");

        for(int i=0;i< verduras.length;i++){
            System.out.println(verduras[i].toString());
        }
    }
}