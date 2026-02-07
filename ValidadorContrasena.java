import java.util.Scanner;

public class ValidadorContrasena {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String contrasena;
        boolean valido;

        do {
            System.out.print("Ingresa una contraseña: ");
            contrasena = sc.nextLine();

            valido = true; // se define válida hasta comprobar lo contrario!!

            // 1. Validar longitud >= 8
            if (contrasena.length() < 8) {
                System.out.println("Error: mínimo 8 caracteres.");
                valido = false;
            }

            // 2. Validar al menos una mayúscula
            boolean validarMayus = false;
            for (int i = 0; i < contrasena.length(); i++) {
                char c = contrasena.charAt(i);
                if (Character.isUpperCase(c)) {
                    validarMayus = true;
                    break;
                }
            }

            if (!validarMayus) {
                System.out.println("Error: debe contener al menos una mayúscula.");
                valido = false;
            }

            // 3. Validar al menos una minúscula
            boolean validarMinus = false;
            for (int i = 0; i < contrasena.length(); i++) {
                char c = contrasena.charAt(i);
                if (Character.isLowerCase(c)) {
                    validarMinus = true;
                    break;
                }
            }

            if (!validarMinus) {
                System.out.println("Error: debe contener al menos una minúscula.");
                valido = false;
            }

            // 4. Validar al menos un dígito
            boolean validarDigito = false;
            for (int i = 0; i < contrasena.length(); i++) {
                char c = contrasena.charAt(i);
                if (Character.isDigit(c)) {
                    validarDigito = true;
                    break;
                }
            }

            if (!validarDigito) {
                System.out.println("Error: debe contener al menos un dígito.");
                valido = false;
            }

            // 5. Validar que NO existan espacios
            if (contrasena.contains(" ")) {
                System.out.println("Error: no debe contener espacios.");
                valido = false;
            }

            if (!valido) {
                System.out.println("La contraseña no cumple los requisitos. Intenta de nuevo."+"\n");
            }

        } while (!valido);

        System.out.println("Contraseña válida.");
        sc.close();
    }
}
