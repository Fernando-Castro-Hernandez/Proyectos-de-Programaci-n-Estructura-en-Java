import java.io.*;

public class EscribirYLeerUnArchivoBuffer {
    public static void main(String[] args) throws IOException {

        // ESCRITURA
        BufferedWriter archivoEscritura = new BufferedWriter(new FileWriter("Archivo de Escritura Buffer.txt"));

        archivoEscritura.write("este es un ejemoplo de escritura con Buffered Write/Reader");
        archivoEscritura.newLine();
        archivoEscritura.write("hola");
        archivoEscritura.newLine();
        archivoEscritura.write("Tercera linea");
        archivoEscritura.close();

        // LECTURA
        BufferedReader lecturaArchivo = new BufferedReader(new FileReader("Archivo de Escritura Buffer.txt"));
        String linea;
        System.out.println("Contenido del Archivo");

        while ((linea = lecturaArchivo.readLine()) != null) {
            System.out.println(linea);

        }
        lecturaArchivo.close();

    }
}
