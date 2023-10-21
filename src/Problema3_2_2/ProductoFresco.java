package Problema3_2_2;


public class ProductoFresco extends Productos{
    private int yearEnvasado;

    public ProductoFresco(int yearEnvasado, int numeroLote, String paisDeOrigen) {
        super(numeroLote, paisDeOrigen);
        this.yearEnvasado = yearEnvasado;
    }

    public int getYearEnvasado() {
        return yearEnvasado;
    }

    public void setYearEnvasado(int yearEnvasado) {
        this.yearEnvasado = yearEnvasado;
    }

    @Override
    public String toString() {
    return "Producto Fresco{" +
           ", NumeroLote=" + getNumeroLote() +
           ", PaisDeOrigen='" + getPaisDeOrigen() + '\'' +
           ", "
            + "Fecha envasado=" + yearEnvasado +
           '}';
}
    
    
    
    
}
