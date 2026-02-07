import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExploradorPalabras {

    public static void main(String[] args) {

        // Variables principales
        int totalLineas = 0;
        int totalPalabras = 0;
        String palabraMasLarga = ""; 
        String palabraMasCorta = null;
        int ocurrencias = 0;
        int contador = 0;
        

        try {

            // 1. Abrir archivo palabras.txt
            BufferedReader br = new BufferedReader(new FileReader("palabras.txt"));
            String linea;
            
            

            // 2. Leer línea por línea
            while ( ((linea = br.readLine()) != null) ) {

                // Guardar la línea actual
                linea = br.readLine();
                System.out.println(linea);

                // Incrementar total de líneas
                totalLineas ++;

                // Separar las palabras de la línea (tokens)
                // COMPLETAR → usar split(","), split(" "), etc.
                // String[] palabras = ...
                String[] palabras = linea.split("");

                totalPalabras += palabras.length; //contar las palabras de cada linea

                
                // Recorrer cada palabra
                for (String p : palabras) {
                    p = p.trim(); // eliminar espacios extras
                   System.out.println(p);
                }


                // Palabra más larga
        if (p.length() > palabraMasLarga.length()) {
            palabraMasLarga = p;
        }
            }

            br.close();  // Cerrar archivo de lectura

            // 3. Pedir al usuario una palabra a buscar
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingresa la palabra a buscar: ");
            String buscada = /* COMPLETAR lectura */ ;

            // 4. Volver a abrir archivo para contar ocurrencias
            BufferedReader br2 = new BufferedReader(new FileReader("palabras.txt"));

            while ( /* COMPLETAR condición */ ) {

                String linea2 = /* COMPLETAR lectura */ ;

                // Separar palabras nuevamente
                // String[] palabras2 = ...

                // Comparar palabra por palabra
                // if ( /* COMPLETAR comparación */ ) {
                //     ocurrencias++;
                // }
            }

            br2.close();

            // 5. Crear archivo de salida
            PrintWriter pw = new PrintWriter(new FileWriter("reporte_palabras.txt"));

            pw.println("Reporte de análisis de palabras");
            pw.println("------------------------------");
            pw.println("Total de líneas: " + /* COMPLETAR */ );
            pw.println("Total de palabras: " + /* COMPLETAR */ );
            pw.println("Palabra más larga: " + /* COMPLETAR */ );
            pw.println("Palabra más corta: " + /* COMPLETAR */ );
            pw.println("Palabra buscada: " + /* COMPLETAR */ );
            pw.println("Ocurrencias encontradas: " + /* COMPLETAR */ );

            pw.close();

            System.out.println("Reporte generado: reporte_palabras.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
