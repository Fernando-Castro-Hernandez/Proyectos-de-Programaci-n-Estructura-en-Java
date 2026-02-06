import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaDeNumerosPares {

    public static Scanner scLista = new Scanner(System.in);

    public static void MensajeLista() {
        System.out.println("=============================================================");
        System.out.println("INTRODUCE UN INICIO Y UN FIN A TU LISTA: ");
        System.out.println("=============================================================");
    }

    public static int[] ListaNumerosPares(int entrada, int salida) {// Función que devuelve un array con todos los
                                                                    // números del rango
        int tamañoArray = salida - entrada + 1;
        int[] lista = new int[tamañoArray];

        for (int i = 0; i < tamañoArray; i++) {
            lista[i] = entrada + i;
        }

        return lista;
    }

    public static void ImprimirNumerosPares(int[] lista) {// Procedimiento que imprime solo los números pares
        System.out.println("Números pares:");

        for (int numero : lista) {
            if (numero % 2 == 0) {
                System.out.print(+numero + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        try {
            // Mostrar mensaje
            MensajeLista();

            // Leer entrada y salida
            System.out.println("Inicio: ");
            int entrada = scLista.nextInt();

            System.out.println("Fin: ");
            int salida = scLista.nextInt();

            // Obtener array con todos los números
            int[] lista = ListaNumerosPares(entrada, salida);

            // Imprimir solo los números pares
            ImprimirNumerosPares(lista);

        } catch (InputMismatchException e) {
            System.out.println("Mensaje: Ingresar texto cuando se esperaba un numero ó: " + e.getMessage());
        } finally {
            System.out.println("Ejecución finalizada. Cerrando recursos...");
        }

    }
}
