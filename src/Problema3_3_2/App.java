
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
        Figura obj1 = new Triangulo("Triangulo");
        figuras.add(obj1);
        
        
        Figura obj = new Cuadrado("Cuadrado");
        figuras.add(obj);
        
        
        for(Figura figura: figuras){
          figura.toString();
          figura.pideDatos();
          figura.imprimeDatos();
            
        }
        
    }
 
        
   
 
        
        
        
        
}
