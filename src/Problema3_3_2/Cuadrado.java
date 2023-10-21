
import java.util.Scanner;


public class Cuadrado extends Figura{
    Scanner sc = new Scanner(System.in);
    private float lado;

    public Cuadrado(String nombreFigura) {
        super(nombreFigura);
    }

   
 
    
    
    @Override
    public void pideDatos(){
        System.out.println("Digita el lado de cuadrado:");
        lado = sc.nextFloat();
    }
    
    @Override
    public void imprimeDatos(){
        float area;
        area= lado*lado;
        System.out.println("El area del cuadrado es:"+ area);
    }
    
}
