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


    }
}