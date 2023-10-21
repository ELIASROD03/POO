package Problema3_2_2;


import java.util.ArrayList;


public class JJavaProductos {
    public static void main(String[] args) {
        ArrayList<Productos> listaProductos = new ArrayList<>();
        
        Productos obj1 = new ProductoFresco(2001, 12, "MEXICO");
        listaProductos.add(obj1);
        Productos obj2 = new ProductoFresco(2000, 12, "BRASIL");
        listaProductos.add(obj2);
        Productos obj3 = new ProductoRefrigerado(1314315, 12, "ARGENTINA");
        listaProductos.add(obj3);
        Productos obj4 = new ProductoRefrigerado(23456, 13, "EUA");
        listaProductos.add(obj4);
        Productos obj5 = new ProductoRefrigerado(00001, 14, "CHILE");
        listaProductos.add(obj5);
        Productos obj6 = new CongeladoAgua(90, 2, 15, "JAPON");
        listaProductos.add(obj6);
        Productos obj7 = new CongeladoAgua(80, 1, 18, "CHINA");
        listaProductos.add(obj7);
        Productos obj8 = new CongeladoNitrogeno("En una camara", 0, 19, "BOLIVIA");
        listaProductos.add(obj8);
        
        
        for(int i=0; i<listaProductos.size();i++){
            listaProductos.get(i);
            System.out.println(listaProductos.get(i).toString());
        }
        
        System.out.println("**********GRACIAS POR USAR ESTE PRGRAMA************");
     
        
        
        
    }
}
