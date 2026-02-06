import java.io.*;
import java.util.*;

public class EscribirYLeerUnArchivo {
    public static void main(String[] args) throws IOException {

        // Escritura de archivo
        PrintWriter hojaDeTexto = new PrintWriter("Archivo de escritura.txt");

        hojaDeTexto.println("este es un ejemplo de escritura");
        hojaDeTexto.println("esta es la segunda linea");
        hojaDeTexto.println("esta es la tercera linea");
        hojaDeTexto.close();

        // Lectura de archivos

        Scanner lectura = new Scanner(new File("Archivo de escritura.txt"));
        // Crea un objeto File que representa un archivo llamado Archivo de
        // escritura.txt
        // Crea un objeto Scanner, que es como un "lector" de datos.
        // Le pasamos el File para que en lugar de leer desde el teclado, lea desde el
        // archivo.

        System.out.println("contenido del archivo");
        while (lectura.hasNextLine()) {
            String linea = lectura.nextLine();
            System.out.println(linea);
        }
        lectura.close();
    }
}
