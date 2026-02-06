import java.util.Scanner;
import java.util.InputMismatchException;

public class FactorialRecursivoIterativo {
    public static Scanner scFactorial = new Scanner(System.in);

    // Función recursiva
    public static int FactorialRecursivo(int n) {
        if ((n == 0) || (n == 1)) {
            return 1; // caso base
        } else {
            return n * FactorialRecursivo(n - 1);
        }

    }

    // Funcion Iterativa

    public static int FactorialIterativo(int n) {
        int i, resultado = 1;

        for (i = 1; n >= i; i++) {
            resultado = resultado * i;

        }

        return resultado;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Ingresa un Numero para recibir su factorial (Debe ser un Entero Positivo): ");
            int numeroUsuario = scFactorial.nextInt(), ResultadoRecursivo, ResultadoIterativo;

            if (numeroUsuario < 0) {
                System.out.println("Tu numero debe ser un entero Positivo!!!!!!");

            } else {
                ResultadoRecursivo = FactorialRecursivo(numeroUsuario);
                ResultadoIterativo = FactorialIterativo(numeroUsuario);
                System.out.println("Resultado Recursivo: " + ResultadoRecursivo);
                System.out.println("Resultado Iterativo" + ResultadoIterativo);
            }

            System.out.println("TE AMO");
        } catch (InputMismatchException e) {
            System.out.println("Mensaje: Ingresar texto cuando se esperaba un numero ó: " + e.getMessage());
        } finally {
            System.out.println("Ejecución finalizada. Cerrando recursos...");
            scFactorial.close();
        }

    }
}
