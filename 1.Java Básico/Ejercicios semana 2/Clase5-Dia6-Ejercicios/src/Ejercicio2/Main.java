package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        //B
        Vestimenta[] vestimentas = new Vestimenta[9];

        vestimentas[0] = new Zapato(1,"Tacones",49.99,"Jhon Smith","45","Negro","Caucho","Cordones");
        vestimentas[1] = new Zapato(2,"De punta fina",80.00,"Massimo Dutti","39","Blanco","Caucho","Cordones");
        vestimentas[2] = new Zapato(3,"New Balance",99.99,"New Balance","44","Beige","Tela","Velcro");

        vestimentas[3] = new Pantalon(4,"Slim",19.50,"Zara","M","Azul","Vaquero","Hilo fino");
        vestimentas[4] = new Pantalon(5,"Campana",19.50,"Springfield","L","Blanco","Vaquero","Pana");
        vestimentas[5] = new Pantalon(6,"Elástico",19.50,"Pull&Bear","S","Negro","Chandal","Hilo grueso");

        Camiseta camiseta1 = new Camiseta(7,"Rick&Morty",20.50,"Bershka","L","Roja");
        Camiseta camiseta2 = new Camiseta(8,"La casa de papel",12.99,"Springfield","S","Blanca");

        camiseta1.setManga(true);
        camiseta2.setManga(true);
        camiseta2.setCuello(true);

        vestimentas[6] = camiseta1;
        vestimentas[7] = camiseta2;

        vestimentas[8] = new Sombrero(9,"Copal",40.99,"Massimo Dutti","M","Negro","De copa",20.00);

        //D
        for(int i=0;i< vestimentas.length;i++){
            System.out.println(vestimentas[i].ropa());
        }
    }
}
