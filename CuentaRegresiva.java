import java.util.*;

public class CuentaRegresiva {

    public static Scanner scCuenta = new Scanner(System.in);

    // funcion para leer y validar numero
    public static int leerNumero() {
        int n;

        do {
            System.out.print("Ingresa un numero entero positivo: ");
            n = scCuenta.nextInt();

        } while (n <= 0);
        return n;

    }

    public static void cuentaRegresiva(int n) {
        System.out.println("cuenta regresiva");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");

        }
        System.out.println("¡DESPEGUE!");
    }

    public static void main(String[] args) {
        int n = 0;

        n = leerNumero();

        cuentaRegresiva(n);

    }

}
