import java.util.Scanner;

public class OrdenaYBuscaArrays {
    public static Scanner sc = new Scanner(System.in);

    // --- Función para capturar datos de la matriz ---
    static int[][] leerMatriz(Scanner sc, int filas, int columnas) {
        int[][] m = new int[filas][columnas];
        System.out.println("Ingrese los elementos de la matriz (" + filas + "x" + columnas + "):");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }

    // Funcion para sumar
    public static void sumaMatriz(int[][] m) {
        int suma = 0;
        for (int[] fila : m) {
            for (int valor : fila) {
                suma += valor;
            }
        }
        System.out.println("Suma total = " + suma);

    }

    // Funcion para buscar el mayor y el menor
    public static void mayorMenor(int[][] m) {
        int max = m[0][0];
        int min = m[0][0];
        for (int[] fila : m) {
            for (int valor : fila) {
                if (valor > max)
                    max = valor;
                if (valor < min)
                    min = valor;
            }
        }
    }

    // funcion suma por fila
    public static void sumaFila(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < m[i].length; j++) {
                sumaFila += m[i][j];
            }
            System.out.println("Suma fila " + i + ": " +
                    sumaFila);
        }

    }

    // funcion suma por columna
    public static void sumaColumna(int[][] m) {
        for (int j = 0; j < m[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < m.length; i++) {
                sumaColumna += m[i][j];
            }
            System.out.println("Suma columna " + j + ": " + sumaColumna);
        }
    }

    // Funcion para busqueda secuencial
    public static void busquedaLineal(int[][] m) {
        int buscado = 5;
        boolean encontrado = false;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == buscado) {
                    System.out.println("Encontrado en [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }
        if (!encontrado)
            System.out.println("No se encontró el valor");
    }

    public static void main(String[] args) {

        int filas = 3, columnas = 3;
        int[][] m = leerMatriz(sc, filas, columnas);
        sumaMatriz(m);
        mayorMenor(m);
        System.out.println("Ingresa un numero para encontrar en el Arreglo: ");
        int numeroUsuario = sc.nextInt();
        busquedaLineal(m);

    }

}
