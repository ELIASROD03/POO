package Problema3_2_2;


public class CongeladoAgua extends ProductoCongelado{
    private int salinidad;

    public CongeladoAgua(int salinidad, double temperatura, int numeroLote, String paisDeOrigen) {
        super(temperatura, numeroLote, paisDeOrigen);
        this.salinidad = salinidad;
    }

    
    
    public int getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(int salinidad) {
        this.salinidad = salinidad;
    }
    
    @Override
    public String toString() {
    return "CongeladoAgua{" +
           "temperatura=" + getTemperatura() +"grados"+
           ", numeroLote=" + getNumeroLote() +
           ", paisDeOrigen='" + getPaisDeOrigen() + '\'' +
           ", salinidad=" + salinidad +
           '}';
}
    
    
    
    
    
    
}
