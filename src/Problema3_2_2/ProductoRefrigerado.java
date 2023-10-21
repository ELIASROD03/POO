package Problema3_2_2;


public class ProductoRefrigerado extends Productos{
    private int codigo;

    public ProductoRefrigerado(int codigo, int numeroLote, String paisDeOrigen) {
        super(numeroLote, paisDeOrigen);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }    
    
    @Override
    public String toString() {
    return "Producto Refrigerado{" +
           ", NumeroLote=" + getNumeroLote() +
           ", PaisDeOrigen='" + getPaisDeOrigen() + '\'' +
           ", Codigo=" + codigo +
           '}';
}
    
    
    
    
    
    
    
}
