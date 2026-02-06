import java.util.Scanner;
import java.util.InputMismatchException;

public class NumeroPalindromo {
    public static Scanner scPalindromo = new Scanner(System.in); /*
                                                                  * Scanner global para que se puede usar en cualquier
                                                                  * lado del programa
                                                                  */

    // funciones
    // procedimientos
    // manejo de excepciones
    public static void MensajePalindromo() {// proceso: indica al usuario que ingrese una cadena de numeros
        System.out.println("=============================================================");
        System.out.println("INTRODUCE UNA CADENA DE NUMEROS PARA SABER SI ES PALINDROMO: ");
        System.out.println("=============================================================");
    }

    public static boolean NumeroPalindormo() { // funcion con retorno de tipo booleano
        try {// empiezan las validaciones con manejo de excepciones pero en este caso no es
             // necesario ya que utilizamos un String
            String numeroUsuario = scPalindromo.nextLine();
            String numeroInversoUsuario = new StringBuilder(numeroUsuario).reverse().toString();

            if (numeroUsuario.equals(numeroInversoUsuario)) {
                System.out.println("TU CADENA DE NUMEROS ES PALINDROMO ES : " + true);

            } else {
                System.out.println("TU CADENA DE NUMEROS NO ES PALINDROMO ES : " + false);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        return true;
    }

    public static void main(String[] args) {

        try {

            // llamar procedimientos
            // y Funciones

            MensajePalindromo();
            NumeroPalindormo();

        } finally {// Limpieza y liberacion de memoria
            System.out.println("Ejecución finalizada. Cerrando recursos...");
            scPalindromo.close();
        }

    }

}
