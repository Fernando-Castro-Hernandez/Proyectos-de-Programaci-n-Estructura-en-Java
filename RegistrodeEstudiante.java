import java.io.*;
import java.util.Scanner;

public class RegistrodeEstudiante {
    public static void main(String[] args) throws IOException {

        Scanner scanerAlumno = new Scanner(System.in);

        System.out.println("Ingresa Tu Nombre Completo: ");
        String Nombre = scanerAlumno.nextLine();

        System.out.println("Ingresa Tu Edad: ");
        int Edad = scanerAlumno.nextInt();

        System.out.println("Ingresa Tu Promedio (Base 10): ");
        double Promedio = scanerAlumno.nextDouble();

        System.out.println("Ingresa La inicial de tu Grupo (A, B o C): ");
        char inicial = scanerAlumno.next().charAt(0);

        System.out.println("Estas inscrito? (true/ false)");
        boolean inscrito = scanerAlumno.nextBoolean();

        // PROCESAMIENTO
        String NombreMayus = Nombre.toUpperCase();
        int LongitudNombre = Nombre.length();

        // Type Casting
        int promedioEntero = (int) Promedio;
        boolean aprueba = (Promedio >= 7);

        // ESCRITURA DE DATOS

        PrintWriter hojaDeTexto = new PrintWriter("Archivo De Escritura de Datos Alumno");
        hojaDeTexto.println("Nombre: " + Nombre);
        hojaDeTexto.println("Edad: " + Edad);
        hojaDeTexto.println("Tu promedio: " + Promedio);
        hojaDeTexto.println("Tu Promedio Entero: " + promedioEntero);
        hojaDeTexto.println("Tu Grupo: " + inicial);
        hojaDeTexto.println("inscrito: " + inscrito);
        hojaDeTexto.println("Nombre en MAYUSCULAS: " + NombreMayus);
        hojaDeTexto.println("Longitud del Nombre: " + LongitudNombre);
        hojaDeTexto.println("Aprobado ? " + aprueba);

        hojaDeTexto.close();

        System.out.println("Datos guardados en estudiante.txt");
        // LECTURA DE DATOS

        Scanner lectura = new Scanner(new File("Archivo De Escritura de Datos Alumno"));

        System.out.println("Datos del alumno: ");

        while (lectura.hasNextLine()) {
            String linea = lectura.nextLine();
            System.out.println(linea);

        }

        scanerAlumno.close();
        lectura.close();

    }
}
