

import java.util.Scanner;


public class Cuadrado extends Figura{
    Scanner sc = new Scanner(System.in);
    private float lado;

    public Cuadrado(String nombreFigura) {
        super(nombreFigura);
    }

    @Override
    public void pideDatos(){
        do{
            System.out.println("Digita el lado del cuadrado:");
            lado = sc.nextFloat();
        try{
            if(lado < 5){
            
            throw  new ExepcionFigura("El lado debe ser mayor a 5");
            }
        }catch(ExepcionFigura e){
            System.out.println("Error" + e.getMessage());   
        }
      }while(lado < 5);
    }
 
    
    

    
    @Override
    public void imprimeDatos(){
        float area;
        area= lado*lado;
        System.out.println("El area del cuadrado es:"+ area);
    }
    
}
