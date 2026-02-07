import java.util.Scanner;
import java.util.regex.*;

public class ValidadorCorreo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String correo;
        boolean valido = false;

        do {
            System.out.print("Ingresa un correo: ");
            correo = sc.nextLine().trim(); // elimina espacios al inicio y final

            // Reiniciar bandera de validación
            valido = true;

            // 1. Validar que no esté vacío
            if (correo.isEmpty()) {
                System.out.println("Correo inválido: no puede estar vacío.");
                valido = false;
            }

            // 2. Validar que contenga exactamente un '@'
            int posArroba = correo.indexOf('@');
            int posArrobaFinal = correo.lastIndexOf('@');

            // COMPLETAR: valida si falta @ o si hay más de uno
            if (correo.matches("\\w+@")) {
                System.out.println("Correo inválido: necesitas un: @");

                valido = false;
            }

            // Reiniciar bandera de validación
            valido = true;

            // 3. Validar que antes del @ haya al menos 1 caracter
            // COMPLETAR:
            if (correo.matches(".*@")) {
                System.out.println("Debe haber algo antes de tu arroba");

                valido = false;
            }

            // Reiniciar bandera de validación
            valido = true;

            // 4. Validar que después del @ exista al menos un "."
            // COMPLETAR:
            int posPunto = correo.indexOf('.', posArroba);
            if (posArroba > posPunto) {
                System.out.println("Debe haber un punto despues de tu arroba");

            }

            // Reiniciar bandera de validación
            valido = true;

            // 5. Validar que el dominio tenga al menos 2 letras
            // COMPLETAR:
            int posUltimoPunto = correo.lastIndexOf('.');
            String dominio = correo.substring(posUltimoPunto + 1);
            if (dominio.matches("\\.\\w+")) {

            }

            // Reiniciar bandera de validación
            valido = true;

            // Nota: puedes agregar más validaciones si deseas

            if (!valido) {
                System.out.println("Intenta de nuevo.\n");
            }

        } while (!valido);

        System.out.println("\nCorreo válido.");
        sc.close();
    }
}
