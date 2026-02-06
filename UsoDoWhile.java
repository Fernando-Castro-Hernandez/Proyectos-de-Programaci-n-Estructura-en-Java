import java.util.Scanner;
import java.util.InputMismatchException;

public class UsoDoWhile {
    public static Scanner scDoWhile = new Scanner(System.in);// scanner global

    public static void Mensaje() { // proceso void
        System.out.println("ADIVINA EL NUMERO SECRETO (ENTRE 1 Y 10 )");
    }

    public static int Procesos() {
        int numSecreto = (int) (Math.random() * 10) + 1;
        int intento;
        int contador = 0;

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

        System.out.println("correcto" + numSecreto);
        System.out.println("numero de intentos" + contador);
        return intento;
    }

    public static void main(String[] args) {

        try {
            Mensaje();
            Procesos();

        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("converión de texto a número inválida ó." + e.getMessage());
        } finally {
            scDoWhile.close();
            System.out.println("Ejecución finalizada. Cerrando recursos...");
        }

    }

}
