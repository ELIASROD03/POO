package Problema3_2_2;


public class Productos {
    protected int numeroLote;
    protected  String paisDeOrigen;

    public Productos(int numeroLote, String paisDeOrigen) {
        this.numeroLote = numeroLote;
        this.paisDeOrigen = paisDeOrigen;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    

    
    
    
}
