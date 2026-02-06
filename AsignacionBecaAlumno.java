import java.io.*;
import java.util.Scanner;

public class AsignacionBecaAlumno {

    public static void main(String[] args) throws IOException {
        Scanner scannerAlumno = new Scanner(System.in);

        // ENTRADAS
        System.out.println("ingresa tu edad");
        int edad = scannerAlumno.nextInt();

        System.out.println("Ingrese el promedio del estudiante:");
        int promedio = scannerAlumno.nextInt();

        System.out.println("Ingrese la asistencia (0-100):");
        int asistencia = scannerAlumno.nextInt();

        System.out.println("¿Pertenece a actividades extracurriculares? (true/false)");
        boolean actividades = scannerAlumno.hasNextBoolean();

        // PROCESOS

        if (edad >= 18 && edad <= 25 && promedio >= 80 && asistencia >= 85) {
            System.out.println("El estudiante CALIFICA para la beca.");

        } else if (promedio >= 70 || asistencia >= 80 && actividades == true) {
            System.out.println("El estudiante puede entrar a REVISIÓN especial.");

        } else {
            System.out.println("El estudiante NO califica para la beca.");
        }

        scannerAlumno.close();
    }
}