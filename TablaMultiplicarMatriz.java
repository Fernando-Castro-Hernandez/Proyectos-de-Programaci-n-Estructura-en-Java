import java.util.*;

public class TablaMultiplicarMatriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        // ---------------------------------
        // 1. PEDIR Y VALIDAR EL NÚMERO
        // ---------------------------------
        do {
            System.out.print("Ingresa un número entero positivo del 1 al 10: ");

            // COMPLETAR:
            // Validar que el usuario ingrese un número entero
            // Sugerencia: usar sc.hasNextInt()
            // Si no es entero → mostrar error → limpiar buffer → continuar el ciclo

            while (!sc.hasNextInt()) {// valida que la entreda del Scanner siempre sea un entero
                System.out.println("Ingresa un numero Entero positivo");
                sc.nextLine();
            }

            numero = sc.nextInt();// aqui el numero ya es positivo

            // COMPLETAR:
            // Validar que sea mayor que 0 y menor a 10
            // if(numero <= 0){ ... }
            if (numero <= 0 || numero > 10) {
                System.out.println("El numero debe ser mayor a cero y menor a 10. Ingrese de nuevo");
                sc.nextLine();
            } else {
                valido = true;// cambiamos el booleano para que se cierre el do...While
            }

        } while (!valido);

        // ---------------------------------
        // 2. CREAR MATRIZ 1 x 10
        // ---------------------------------
        int[][] tabla = new int[1][10];

        // COMPLETAR:
        // Llenar la matriz con:
        // tabla[0][i] = numero * (i + 1);

        System.out.println("\n=== TABLA DEL " + numero + " ===");

        for (int i = 0; i < 10; i++) {// guardamos los valores en el array hasta 10
            tabla[0][i] = numero * (i + 1);// multiplicación
            System.out.println(numero + " x " + (i + 1) + " = " + tabla[0][i]);// imprimimos tabla
        }

        sc.close();

    }
}
