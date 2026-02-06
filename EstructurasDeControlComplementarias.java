import java.util.Scanner;
import java.util.InputMismatchException;

public class EstructurasDeControlComplementarias {
    public static void main(String[] args) {

        // FER
        Scanner scDoWhile = new Scanner(System.in);

        int numSecreto = (int) (Math.random() * 10) + 1;
        int intento;
        int contador = 0;

        System.out.println("ADIVINA EL NUMERO SECRETO (ENTRE 1 Y 10 )");
        try {
            do {

                System.out.println("ESCRIBE TU INTENTO: ");
                intento = scDoWhile.nextInt();
                contador++;

                if (intento > numSecreto) {
                    System.out.println("MUY ALTO, INTENTA UN NUMERO MENOR");

                } else if (intento < numSecreto) {
                    System.out.println("MUY BAJO INTENTA CON UN NUMERO MAYOR");

                }

            } while (intento != numSecreto);
        } catch (InputMismatchException e) {
            System.out.println("Error: entrada no válida. Entrada incorrecta de scanner");
        } finally {
            System.out.println("Ejecución finalizada. Cerrando recursos...");
            scDoWhile.close(); // se cierra el Scanner (buena práctica)
        }

        System.out.println("correcto" + numSecreto);
        System.out.println("numero de intentos" + contador);

        scDoWhile.close();

        // ALFREDO
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Dame cualquier entero positivo: ");
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
            sc.close();
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("converión de texto a número inválida");
        }

        // DANNA

        // RODRIGO

    }
}
