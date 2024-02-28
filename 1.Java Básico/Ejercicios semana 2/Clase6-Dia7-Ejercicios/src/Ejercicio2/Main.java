package Ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //B
        ArrayList<Producto> productos = new ArrayList<>();
        System.out.println("¡Se ha completado la parte B!");

        //A
        productos.add(new Producto(1,"Telefono","Samsung","Ultrafino",600.00,500.00,60));
        productos.add(new Producto(2,"Tablet","HP","Cromada",900.00,500.00,67));
        productos.add(new Producto(3,"Cascos","Corsair","Envolventes",49.99,20.50,25));
        productos.add(new Producto(4,"Laptop","Lenovo","Ultraligero",1200.00,700.00,16));
        productos.add(new Producto(5,"Monitor","Asus","Vertical",500.00,400.00,6));
        productos.add(new Producto(6,"Ratón","Logitech","Láser",40.99,14.99,36));
        productos.add(new Producto(7,"Teclado","Eraser","Corto",60.50,39.99,26));
        productos.add(new Producto(8,"Cámara","Philips","Cañón largo",600.00,500.00,12));
        productos.add(new Producto(9,"Cargador","LG","Portatil",10.00,5.99,98));
        productos.add(new Producto(10,"Altavoces","Aorus","Amplificado",80.00,60.00,22));

        System.out.println("\n¡Se ha completado la parte A!\n");

        Producto aux = new Producto(0,"","","",10000.0,0.0,0);

        //C
        for(Producto producto : productos){
            while(producto.getPrecioVenta()>aux.getPrecioVenta()){
                aux = producto;
            }
        }
        System.out.println("El producto con mayor precio de venta es " + aux.getNombre());
        System.out.println("\n¡Se ha completado la parte C!\n");

        //D
        Producto aux2 = new Producto(0,"","","",10000.0,0.0,0);
        for(Producto producto : productos){
            while(producto.getPrecioCosto()<aux2.getPrecioCosto()){
                aux2 = producto;
            }
        }
        System.out.println("El producto con mayor precio de costo es " + aux2.getNombre());
        System.out.println("\n¡Se ha completado la parte D!\n");

        //E
        productos.remove(4);
        System.out.println("\n¡Se ha completado la parte E!\n");

        //F
        Producto aux3 = new Producto(0,"","","",10000.0,0.0,0);
        for(Producto producto : productos){
            while(producto.getCantidadStock()>aux3.getCantidadStock()){
                aux3 = producto;
            }
            aux3.setCantidadStock(aux3.getCantidadStock()-3);
        }
        System.out.println("El producto con mayor cantidad de stock es " + aux3.getNombre());
        System.out.println(productos.get(7));
        System.out.println("\n¡Se ha completado la parte F!\n");
    }
}
