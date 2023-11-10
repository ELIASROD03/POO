
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
            // Intenta abrir el archivo
            FileReader archivo = new FileReader(rutaArchivo);
            BufferedReader lector = new BufferedReader(archivo);

            // Lee línea por línea e imprime en la consola
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            // Cierra el lector
            lector.close();
        } catch (FileNotFoundException e) {
            // Maneja la excepción si el archivo no se encuentra
            System.out.println("Error: Archivo no encontrado");
        }
    }
}
