import java.util.*;

public class RecorridoDeArreglo {

    public static void main(String[] args) {
        Scanner scRecorrido = new Scanner(System.in);

        int[] array = new int[5];
        int i = 0;
        int suma = 0;
        double promedio = 0;

        for (i = 0; i < array.length; i++) {
            System.out.println("Ingresa el Valor del indice del Array:" + i);
            int valorAsignado = scRecorrido.nextInt();
            array[i] = valorAsignado;
            suma += array[i];
            promedio = (double) suma / array.length;

        }

        i = 0;
        while (i < array.length) {
            System.out.println("Elemento " + i + ":" + array[i]);
            i++;
        }

        System.out.println("La Suma es: " + suma);
        System.out.println("El promedio es: " + promedio);

        scRecorrido.close();
    }

}
