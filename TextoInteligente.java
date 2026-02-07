import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class TextoInteligente {
    public static void menuTextoInteligente() {
        System.out.println("========== MENÚ TEXTO INTELIGENTE =========");
        System.out.println("======== 1- Validar números telefónicos ===========");
        System.out.println("======== 2- Formatear y estandarizar correos electrónicos ===========");
        System.out.println("======== 3- Extraer fechas de un texto ========================");
        System.out.println("======== 4- SALIR ========================");

    }

    // Funcion para validar telefono
    public static boolean validarTelefono(String telefono) {
        String regex = "^\\(\\d{3}\\)\\s\\d{3}-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(telefono);

        return matcher.matches();
    }

    public static Scanner sc = new Scanner(System.in);

    // Procedimiento Opción 2: Procesar correos
    public static void procesarCorreos(String entrada) {

        String[] correos = entrada.split(",");

        String regex = "^[\\w.+-]+@[\\w.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("\n==== Resultado ====");

        for (int i = 0; i < correos.length; i++) {
            String limpio = correos[i].trim().toLowerCase();
            Matcher matcher = pattern.matcher(limpio);
            boolean valido = matcher.matches();

            System.out.println("Correo #" + (i + 1) + ": " + limpio);
            System.out.println("Estado: " + (valido ? "VÁLIDO" : "NO VÁLIDO"));

        }

    }

    // Funcion para lista tipo string Fechas
    public static List<String> extraerFechas(String texto) {
        String patron = "(0[1-9]|[12][0-9]|3[01])/" // día
                + "(0[1-9]|1[0-2])/" // mes
                + "\\d{4}"; // anio
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);

        List<String> fechas = new ArrayList<>();

        while ((matcher.find())) {
            fechas.add(matcher.group());
        }

        return fechas;
    }

    public static int lecturaOpcionUsuario() {
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            sc.next();
            System.out.println("Error: debes ingresar un número entero.");
            return -1;
        }
    }

    public static void main(String[] args) {

        int opcionMenu = 0;

        do {
            menuTextoInteligente();
            opcionMenu = lecturaOpcionUsuario();
            String telefono;

            switch (opcionMenu) {
                case 1:// Validar números telefónicos
                    sc.nextLine();
                    do {
                        System.out.print("Ingrese un número telefónico con formato (XXX) XXX-XXXX: ");
                        telefono = sc.nextLine();

                        if (!validarTelefono(telefono)) {
                            System.out.println("El número es inválido. Intente nuevamente" + "\n");
                        }
                    } while (!validarTelefono(telefono));

                    System.out.println("Número válido.");

                    break;

                case 2:// Formatear y estandarizar correos electrónicos
                    sc.nextLine();
                    System.out.println("Ingresa varios correos separados por coma:");
                    String entradaCorreos = sc.nextLine();

                    procesarCorreos(entradaCorreos);
                    break;
                case 3:// Extraer fechas de un texto
                    System.out.println("Ingrese un texto para analizar las fechas: ");
                    sc.nextLine();
                    String textoUsuario = sc.nextLine();
                    int contador = 0;

                    List<String> fechasEncontradas = extraerFechas(textoUsuario);

                    if (fechasEncontradas.isEmpty()) {
                        System.out.println("No se encontraron fechas en el texto proporcionado.");
                    } else {
                        System.out.println("\n Fechas encontradas: ");
                        for (String n : fechasEncontradas) {
                            System.out.println(n);
                            contador++;

                        }
                        System.out.println("Numero de fechas encontradas: " + contador);
                    }

                    break;

                case 4:
                    System.out.println("Saliendo del menú...");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;
            }

        } while (opcionMenu != 4);
        sc.close();

    }
}
