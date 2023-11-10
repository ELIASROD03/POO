package Problema3_3_2;

abstract class Figura {

protected String nombreFigura;

    public Figura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }


    public void pideDatos()throws ExepcionFigura{
     
    }

    public void imprimeDatos(){
    }

    @Override
    public String toString() {
        return  nombreFigura;
    }
    
    
}