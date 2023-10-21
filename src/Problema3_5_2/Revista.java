package Problema3_5_2;


import java.util.GregorianCalendar;


public class Revista extends Publicacion{
    private int numerosPorAnio;
    private long circulacion;

    public Revista(int numerosPorAnio, long circulacion, String editor, GregorianCalendar fecha) {
        super(editor, fecha);
        this.numerosPorAnio = numerosPorAnio;
        this.circulacion = circulacion;
    }
    
    
    
    public void fijarNumeroAnio(int n){
        
    }
    
    public void fijarCirculacion(long n){
        
    }

    @Override
    public String toString() {
        return "Revista{" + "numerosPorAnio=" + numerosPorAnio + ", circulacion=" + circulacion + '}';
    }
    
    
}
