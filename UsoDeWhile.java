import java.util.Scanner;
import java.util.InputMismatchException;

public class UsoDeWhile {
    public static Scanner sc = new Scanner(System.in);

    public static void Mensaje() { // Procedimiento
        System.out.println("Dame cualquier entero positivo: ");
    }

    public static int Procesos() {
        String numeroUsuario = sc.nextLine();

        // convertir string a entero
        int numeroDeUsuarioEntero = Integer.parseInt(numeroUsuario);

        // INICIO DE CICLO WHILE (PROCESOS)
        while (numeroDeUsuarioEntero != 1) {

            if (numeroDeUsuarioEntero % 2 == 0) {
                numeroDeUsuarioEntero = numeroDeUsuarioEntero / 2;

            } else {
                numeroDeUsuarioEntero = numeroDeUsuarioEntero * 3 + 1;

            }

        }
        System.out.println("Esta es la demostracion de la conjetura: " + numeroDeUsuarioEntero);
        return numeroDeUsuarioEntero;
    }

    public static void main(String[] args) {

        try {

            // ENTTRADAS
            Mensaje(); // procedimiento
            Procesos();

        } catch (InputMismatchException e) {
            System.out.println("Mensaje: Ingresar texto cuando se esperaba un numero ó:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Ejecución finalizada. Cerrando recursos...");
        }

    }
}

// indicamos que se acaba el programa.
