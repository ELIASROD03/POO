package Problema3_5_2;


import java.util.GregorianCalendar;


public class Libro extends Publicacion{
    private String isbn;
    private String autor;

    public Libro(String isbn, String autor, String editor, GregorianCalendar fecha) {
        super(editor, fecha);
        this.isbn = isbn;
        this.autor = autor;
    }

    
    
    
    
    public void ponerIsbn(String nota){
        
    }
    
    public void ponerAutor(String nombre){
        
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", autor=" + autor + '}';
    }
    
    
    
}
