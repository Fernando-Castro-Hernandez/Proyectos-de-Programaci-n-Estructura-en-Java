import java.util.InputMismatchException;
import java.util.Scanner;

public class OrdenaYBusca {
    public static Scanner scBuscaOrdena = new Scanner(System.in);
    public static int[] arrayOriginal = new int[10];

    // funciones

    public static void mostrarArregloOriginal() {// Mostrar Array original
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.err.println("Elemento: " + i + " " + "con valor: " + arrayOriginal[i]);
        }

    }

    public static void ordenamientoBubbleSort(int[] arrayOriginal) {
        for (int i = 0; i < arrayOriginal.length - 1; i++) {
            for (int j = 0; j < arrayOriginal.length - 1 - i; j++) {
                if (arrayOriginal[j] > arrayOriginal[j + 1]) { // Menos a Mayor
                    int temporal = arrayOriginal[j];
                    arrayOriginal[j] = arrayOriginal[j + 1];
                    arrayOriginal[j + 1] = temporal;
                }
            }

        }
        mostrarArregloOriginal();
    }

    public static int busquedaLineal(int[] arrayOriginal, int numeroUsuario1) {
        for (int i = 0; i < arrayOriginal.length; i++) {
            if (arrayOriginal[i] == numeroUsuario1) {
                System.out.println("El numero se encontró: " + arrayOriginal[i] + " " + "en la posicion: " + i);
                return i;
            }
        }
        System.out.println("El numero no fue encontrado.");
        return -1;
    }

    public static void paresArreglo() {
        int contador = 0;
        for (int i = 0; i < arrayOriginal.length; i++) {
            if (arrayOriginal[i] % 2 == 0) {
                System.out.print(arrayOriginal[i] + " ");
                contador++;
            }
        }
        System.out.println("Estos son los pares encontrados en el Array: " + contador);
    }

    public static void main(String[] args) {// main
        // Declaracion de array de 10 enteros
        System.out.println("Array original: ");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.println("Ingrese un numero para la posicion: " + i);
            int valorAsignado = scBuscaOrdena.nextInt();
            arrayOriginal[i] = valorAsignado;

        }
        mostrarArregloOriginal();// muestra arreglo original
        System.out.println("Array ordenado: ");
        ordenamientoBubbleSort(arrayOriginal); // ordenamiento por Bubble Sort y muestra de resultado

        // Solicitar al usuario un numero
        System.out.println("Ingresa un numero para buscarlo en la lista: ");
        int numeroUsuario = scBuscaOrdena.nextInt();
        busquedaLineal(arrayOriginal, numeroUsuario);// uso de busqueda lineal para encontrar un numero solicitado
        System.out.println("Pares arreglo");
        paresArreglo();

    }

}
