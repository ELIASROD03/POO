
package ProblemaArchivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {
        public static void main(String[] args) throws IOException {
        // Ruta del archivo
        String rutaArchivo = "Hola.txt";

        try {
           
            FileReader archivo = new FileReader(rutaArchivo);
            BufferedReader lector = new BufferedReader(archivo);

           
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            
            lector.close();
        } catch (FileNotFoundException e) {
           
            System.out.println("Error: Archivo no encontrado");
        }
    }
}
