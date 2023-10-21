package Problema3_2_2;


public class ProductoCongelado extends Productos{
    protected double temperatura;

    public ProductoCongelado(double temperatura, int numeroLote, String paisDeOrigen) {
        super(numeroLote, paisDeOrigen);
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
    
    
    
    
    
}
