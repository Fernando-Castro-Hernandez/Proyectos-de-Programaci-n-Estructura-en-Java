import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Sudoku {

    static int[][] tablero = new int[9][9];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== JUGUEMOS SUDOKU ===");
        System.out.print("Ingresa tu nombre: ");
        String jugador = sc.nextLine().trim();

        if (!cargarTableroDesdeArchivo("sudoku.txt")) {
            System.out.println("No fue posible cargar el archivo sudoku.txt");
            sc.close();
            return;
        }

        int movimientos = 0;

        while (true) {
            mostrarTablero();

            if (estaCompleto(tablero)) {
                System.out.println(mensajeAleatorio());
                break;
            }

            // Lectura como cadenas
            String filaTxt = leerTexto(sc, "Fila (1-9, 0 para salir): ");
            String colTxt = leerTexto(sc, "Columna (1-9, 0 para salir): ");
            String numTxt = leerTexto(sc, "Número (1-9, 0 para salir): ");

            // Salida voluntaria
            if (filaTxt.equals("0") && colTxt.equals("0") && numTxt.equals("0")) {
                System.out.println("Juego terminado por el usuario.");
                break;
            }

            int fila, col, num;

            // Conversión con un solo try/catch
            try {
                fila = Integer.parseInt(filaTxt) - 1;
                col = Integer.parseInt(colTxt) - 1;
                num = Integer.parseInt(numTxt);
            } catch (NumberFormatException e) {
                System.out.println("Debes ingresar solo números válidos.");
                continue;
            }

            if (!valoresEnRango(fila, col, num)) {
                System.out.println("Valores fuera de rango permitido.");
                continue;
            }

            if (tablero[fila][col] != 0) {
                System.out.println("Esa casilla ya está ocupada.");
                continue;
            }

            if (esMovimientoValido(tablero, fila, col, num)) {
                tablero[fila][col] = num;
                movimientos++;
                System.out.println("Movimiento aceptado.");
            } else {
                System.out.println("Movimiento inválido según las reglas del Sudoku.");
            }
        }

        guardarResultado(jugador, movimientos, "sudoku_resultados.txt");

        System.out.println("Resultados guardados. ¡Gracias por jugar!");
        sc.close();
    }

    // FUNCIONES Y PROCEDIMIENTOS

    static String leerTexto(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine().trim();
    }

    static boolean valoresEnRango(int fila, int col, int num) {
        return fila >= 0 && fila < 9 &&
                col >= 0 && col < 9 &&
                num >= 1 && num <= 9;
    }

    static boolean cargarTableroDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {

            for (int i = 0; i < 9; i++) {
                String linea = br.readLine();
                if (linea == null)
                    return false;

                String[] valores = linea.split(" ");
                if (valores.length != 9)
                    return false;

                for (int j = 0; j < 9; j++) {
                    tablero[i][j] = Integer.parseInt(valores[j]);
                }
            }
            return true;

        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
            return false;
        } catch (NumberFormatException e) {
            System.out.println("Error: el archivo contiene valores no numéricos.");
            return false;
        }
    }

    static void mostrarTablero() {
        System.out.println("\nTablero actual:");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0)
                System.out.println("+-------+-------+-------+");

            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0)
                    System.out.print("| ");

                System.out.print((tablero[i][j] == 0 ? "." : tablero[i][j]) + " ");
            }
            System.out.println("|");
        }
        System.out.println("+-------+-------+-------+");
    }

    static boolean estaCompleto(int[][] tab) {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (tab[i][j] == 0)
                    return false;
        return true;
    }

    static boolean esMovimientoValido(int[][] tab, int fila, int col, int num) {
        return esValidoEnFila(tab, fila, num) &&
                esValidoEnColumna(tab, col, num) &&
                esValidoEnSubcuadro(tab, fila, col, num);
    }

    static boolean esValidoEnFila(int[][] tab, int fila, int num) {
        for (int j = 0; j < 9; j++)
            if (tab[fila][j] == num)
                return false;
        return true;
    }

    static boolean esValidoEnColumna(int[][] tab, int col, int num) {
        for (int i = 0; i < 9; i++)
            if (tab[i][col] == num)
                return false;
        return true;
    }

    static boolean esValidoEnSubcuadro(int[][] tab, int fila, int col, int num) {
        int inicioFila = (fila / 3) * 3;
        int inicioCol = (col / 3) * 3;

        for (int i = inicioFila; i < inicioFila + 3; i++)
            for (int j = inicioCol; j < inicioCol + 3; j++)
                if (tab[i][j] == num)
                    return false;

        return true;
    }

    static String mensajeAleatorio() {
        String[] mensajes = {
                "¡Sudoku completado! Excelente trabajo.",
                "¡Muy bien! No quedó ningún espacio vacío.",
                "¡Perfecto! Completaste el tablero."
        };
        int indice = (int) (Math.random() * mensajes.length);
        return mensajes[indice];
    }

    static void guardarResultado(String jugador, int movimientos, String archivo) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo, true))) {
            pw.println(jugador + " | movimientos: " + movimientos);
        } catch (IOException e) {
            System.out.println("Error al guardar resultados: " + e.getMessage());
        }
    }
}
