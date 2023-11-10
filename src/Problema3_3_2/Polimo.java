
package Problema3_3_2;


public class Polimo {
    public void imprimeDatos(Figura figura){
        try{
            figura.toString();
            figura.pideDatos();
            figura.imprimeDatos();
        }catch(ExepcionFigura e){
            System.out.println("Error:" + e.getMessage()); 
        }
    }
}
