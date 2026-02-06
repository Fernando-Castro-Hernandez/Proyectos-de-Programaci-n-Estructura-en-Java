import java.util.Scanner;

public class pruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de entrada: ");
        int entrada = sc.nextInt();
        System.out.print("Ingrese el valor de salida: ");
        int salida = sc.nextInt();

        // Llamamos al procedimiento que imprime los pares
        imprimirNumerosPares(entrada, salida);
    }

    // Procedimiento que imprime los números pares de un rango
    public static void imprimirNumerosPares(int entrada, int salida) {
        System.out.println("Números pares del rango:");

        for (int i = entrada; i <= salida; i++) {
            if (i % 2 == 0) { // Solo números pares
                System.out.print(i + " ");
            }
        }
    }

}
