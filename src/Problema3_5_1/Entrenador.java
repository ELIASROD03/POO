package Problema3_5_1;


public class Entrenador extends SelecionDeFutbol{
    
    private int idFederacion;

    public Entrenador(int idFederacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }
    
    
}
