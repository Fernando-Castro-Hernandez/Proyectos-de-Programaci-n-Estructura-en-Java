import java.util.InputMismatchException;
import java.util.Scanner;

public class BuscarNombre {

    // 🔹 Función que busca un nombre en la lista (devuelve boolean)
    public static boolean buscarNombre(String nombre, String[] lista) {
        nombre = nombre.toUpperCase(); // convierte a mayúsculas
        for (String elemento : lista) {
            if (elemento.equals(nombre)) { // compara el texto
                return true;
            }
        }
        return false;// SI NO;
    }

    // 🔹 Procedimiento que imprime el resultado
    public static void mostrarResultado(String nombre, boolean encontrado) {
        if (encontrado == true) {
            System.out.println("El nombre " + nombre + " se encuentra en la lista.");
        } else {
            System.out.println("El nombre " + nombre + " NO se encuentra en la lista.");
        }
    }

    // 🔹 Programa principal
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lista de nombres
        String[] nombres = {
                "MULAN", "STICH", "LILO", "MERIDA", "POCAHONTAS", "DUMBO", "ALICIA",
                "ARIEL", "PLUTO", "MICKEY", "JAFAR", "ALADDIN", "HERCULES", "BLANCANIEVES",
                "TONTIN", "DOC", "GRUÑON", "TIMIDO", "ESTORNUDO", "DORMILON", "FELIZ", "URSULA", "CENICIENTA", "WALLY",
        };

        // Entrada del usuario
        try {
            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese el nombre de un personaje de disney a buscar: ");
                String nombre = sc.nextLine();

                // Llamada a la función
                boolean resultado = buscarNombre(nombre, nombres);

                // Mostrar resultado (procedimiento)
                mostrarResultado(nombre, resultado);

            }

        } catch (InputMismatchException e) {
            System.out.println("Error: entrada no válida. Entrada incorrecta de scanner");
        }

        finally {
            System.out.println("Ejecución finalizada. Cerrando recursos...");

        }

        sc.close();
    }
}
