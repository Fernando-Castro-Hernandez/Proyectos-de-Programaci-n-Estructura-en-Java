import java.util.Scanner;
import java.util.InputMismatchException;

public class SumaDeDigitos {
    public static Scanner sc = new Scanner(System.in);

    // Función para leer la lista de números del usuario
    public static int[] leerLista(int cantidad) {

        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        return numeros;
    }

    // Función para sumar los dígitos de un número
    public static int SumarDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }

    // Función para recibir una lista y devolver la lista de suma de dígitos
    public static int[] sumaDigitosLista(int[] numeros) {
        int[] sumaDigitos = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            sumaDigitos[i] = SumarDigitos(numeros[i]);
        }
        return sumaDigitos;
    }

    // Función para mostrar una lista
    public static void mostrarLista(int[] lista, String mensaje) {
        System.out.println(mensaje);
        for (int n : lista) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("¿Cuántos números deseas ingresar?: ");
        try {
            int cantidad = sc.nextInt();

            int[] numeros = leerLista(cantidad);
            int[] suma = sumaDigitosLista(numeros);

            mostrarLista(numeros, "Los números ingresados son:");
            mostrarLista(suma, "Lista con la suma de sus dígitos:");

        } catch (InputMismatchException e) {
            System.out.println("Mensaje: Ingresar texto cuando se esperaba un numero ó: " + e.getMessage());
        } finally {
            System.out.println("Ejecución finalizada. Cerrando recursos...");
            sc.close();
        }

    }
}
