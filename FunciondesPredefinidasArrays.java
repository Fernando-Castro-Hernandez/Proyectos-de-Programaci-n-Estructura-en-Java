import java.util.*;

public class FunciondesPredefinidasArrays {
    public static Scanner scBuscaOrdena = new Scanner(System.in);
    public static int[] arrayOriginal = new int[5];

    public static void main(String[] args) {

        // Declaracion de array de 5 enteros
        System.out.println("Array original: ");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.println("Ingrese un numero para la posicion: " + i);
            int valorAsignado = scBuscaOrdena.nextInt();
            arrayOriginal[i] = valorAsignado;

        }

        for (int i = 0; i < arrayOriginal.length; i++) {
            System.err.println("Elemento: " + i + " " + "con valor: " + arrayOriginal[i]);
        }
        System.out.println("Array en una sola linea: " + Arrays.toString(arrayOriginal));
        System.out.println("Calcular promedio : " + Arrays.stream(arrayOriginal).average());
        System.out.println("Obtener el número mayor: " + Arrays.stream(arrayOriginal).max());
        System.out.println("Obtener el número menor: " + Arrays.stream(arrayOriginal).min());
        Arrays.sort(arrayOriginal);
        System.out.println("Buscar un valor dentro del arreglo: " + Arrays.binarySearch(arrayOriginal, 100));
    }
}
