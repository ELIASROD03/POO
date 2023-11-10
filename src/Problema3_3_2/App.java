package Problema3_3_2;




import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        Polimo polimo = new Polimo();
        
            Figura obj1 = new Triangulo("Triangulo");
            figuras.add(obj1);

            Figura obj2 = new Cuadrado("Cuadrado");
            figuras.add(obj2);



            for (Figura figura : figuras) {
                polimo.imprimeDatos(figura);
            }
       
    }
}
        
   
 
        
        
        
        

