

import java.util.Scanner;


public class Triangulo extends Figura{
    private float base;
    private  float altura;
    Scanner sc = new Scanner(System.in);
    
    public Triangulo(String nombreFigura) {
        super(nombreFigura);
    }
    

    @Override
    public void pideDatos(){
        System.out.println("Digita la base del triangulo:");
        base = sc.nextFloat();
        System.out.println("Digita la altura del triangulo");
        altura= sc.nextFloat();
        try{
            if(altura > base){
                throw new ExepcionFigura("La base debe ser mayor o igual a la altura");
            }
            
        }catch(ExepcionFigura e){
            System.out.println("Error:" + e.getMessage());
            pideDatos();
        }
    }
    
    @Override
    public void imprimeDatos(){
        float area = base*altura/2;
        System.out.println("El area del triangulo es:"+area);
    }
}
