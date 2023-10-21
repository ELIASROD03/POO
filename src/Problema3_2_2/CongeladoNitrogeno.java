package Problema3_2_2;


public class CongeladoNitrogeno extends ProductoCongelado{
    private String metodo;

    public CongeladoNitrogeno(String metodo, double temperatura, int numeroLote, String paisDeOrigen) {
        super(temperatura, numeroLote, paisDeOrigen);
        this.metodo = metodo;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public String toString() {
    return "CongeladoNitrogeno{" +
           "temperatura=" + getTemperatura() +"grados"+
           ", numeroLote=" + getNumeroLote() +
           ", paisDeOrigen='" + getPaisDeOrigen() + '\'' +
           ", metodo=" + metodo +
           '}';
}
    
    
    
    
    
}
