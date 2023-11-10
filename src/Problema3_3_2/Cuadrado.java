package Problema3_3_2;



import java.util.Scanner;


public class Cuadrado extends Figura{
    Scanner sc = new Scanner(System.in);
    private float lado;

    public Cuadrado(String nombreFigura){
        super(nombreFigura);
        
    }

    @Override
    public void pideDatos()throws ExepcionFigura{
        
        System.out.println("Digita el lado del cuadrado:");
        lado = sc.nextFloat();
        if(lado < 5){
            throw new ExepcionFigura("El lado debe ser mayor a 5");
            
        }
    }
 
    
    

    
    @Override
    public void imprimeDatos(){
        float area;
        area= lado*lado;
        System.out.println("El area del cuadrado es:"+ area);
    }
    
}
