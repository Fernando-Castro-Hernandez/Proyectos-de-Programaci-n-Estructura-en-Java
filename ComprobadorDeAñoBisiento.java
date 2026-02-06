import java.util.Scanner;
import java.util.InputMismatchException;

public class ComprobadorDeAñoBisiento {

    public static Scanner scAño = new Scanner(System.in);

    // funciones
    // funciones con validacion
    public static void MensajeAñoBisiesto() { // proceso: indica al usuario que ingrese un año
        System.out.println("================================================");
        System.out.println("INTRODUCE UN AÑO PARA SABER SI ES BISIESTO O NO: ");
        System.out.println("================================================");
    }

    public static Boolean ComprobarAño() {// funcion con retorno de tipo booleano
        try {// validacion con manejo de excepciones especicifas
            int añoUsuario = scAño.nextInt();

            if ((añoUsuario % 4 == 0 && añoUsuario % 100 != 0) || (añoUsuario % 400 == 0)) {
                System.out.println(" ES UN AÑO BISIESTO");
            } else {
                System.out.println("NO ES UN AÑO BISIESTO");
            }

        } catch (InputMismatchException e) {
            System.out.println("Mensaje: Ingresar texto cuando se esperaba un numero ó: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
        return true;
    }

    public static void main(String[] args) {

        try { // validacion cuando quieres ejecutar algo siempre (aunque haya error)

            MensajeAñoBisiesto();
            ComprobarAño();
        } finally {
            System.out.println("Ejecución finalizada. Cerrando recursos...");
            scAño.close();
        }

    }

}
