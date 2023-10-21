package Problema3_2_1;


public class Malvado extends Villano{
     private boolean raza;

    public Malvado(boolean raza, int e, String nombre) {
        super(e, nombre);
        this.raza = raza;
    }
    
    
    public boolean esExtraterrestre(){
        return raza;
    }
    
    
 
    
    
    
    
    
}
