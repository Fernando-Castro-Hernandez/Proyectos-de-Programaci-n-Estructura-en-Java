import java.util.*;

public class ArregloEnMarcha {
    // Funciones y variables Publicas
    public static int[] arrayOriginal = new int[10];
    public static int[] copiaOriginal = new int[10];
    public static Scanner sc = new Scanner(System.in);
    public static boolean arregloRegistrado = false;

    // MENÚ RECURSIVO
    public static void menuArreglos() {
        System.out.println("=== ARREGLOS EN MARCHA ===");
        System.out.println("1. Registrar Arreglo");
        System.out.println("2. Mostrar Arreglo");
        System.out.println("3. Ordenar Arreglo");
        System.out.println("4. Invertir Arreglo");
        System.out.println("5. Mostrar pares del Arreglo");
        System.out.println("6. Buscar un numero en el Arreglo");
        System.out.println("7. Cerrar programa" + "\n");
        int opcion = 0;
        boolean opcionValida = false;

        while (!opcionValida) {
            System.out.print("Seleccione una opción: " + "\n");
            try {
                opcion = sc.nextInt();
                sc.nextLine();
                opcionValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número." + e.getMessage());
                sc.nextLine();
            }
        }

        switch (opcion) {
            case 1:
                registrarArreglo();
                break;
            case 2:
                mostrarArreglo();
                break;
            case 3:
                switchOrdenamientos();// 3 ordenamientos diferentes
                break;
            case 4:
                invertirArreglo();
                break;
            case 5:
                paresArreglo();
                break;
            case 6:
                menuBusqueda();
                break;
            case 7:
                System.out.println("Saliendo del sistema... ¡Hasta pronto!");
                return;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");

        }
        menuArreglos();
    }

    // Declaracion de array de 10 enteros
    public static void registrarArreglo() {
        System.out.println("ARRAY ORIGINAL: \n");
        for (int i = 0; i < arrayOriginal.length; i++) {
            boolean valido = false;

            while (!valido) {
                try {
                    System.out.println("Ingrese un número para la posición: " + i);
                    int valor = sc.nextInt();
                    arrayOriginal[i] = valor;
                    copiaOriginal[i] = valor;
                    valido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: solo se permiten números. Intente de nuevo.\n");
                    sc.nextLine();
                }
            }
        }
        System.out.println("\n" + "Arreglo registrado correctamente.\n");
        arregloRegistrado = true;
    }

    // Muestra el Array declarado por el usuario
    public static void mostrarArreglo() {// Mostrar Array original

        if (!arregloRegistrado) {
            System.out.println("Primero debes registrar el arreglo.\n");
            menuArreglos();
            return;
        }

        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.println("Elemento: " + i + " " + "con valor: " + arrayOriginal[i]);
        }
        System.out.println("=============================================" + "\n");
    }

    // Función switch de ordenamientos
    public static void switchOrdenamientos() {
        if (!arregloRegistrado) {
            System.out.println("Primero debes registrar el arreglo.\n");
            menuArreglos();
            return;
        }

        System.out.println("==== SELECCIONA EL TIPO DE ORDENAMIENTO ====");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Quick Sort");
        System.out.println("4. Volver al menu principal" + "\n");

        int opcionSwitchOrdenamientos = 0;
        boolean opcionValida = false;

        while (!opcionValida) {
            System.out.print("Seleccione una opción: ");
            try {
                opcionSwitchOrdenamientos = sc.nextInt();
                sc.nextLine();
                opcionValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número." + e.getMessage());
                sc.nextLine();
            }
        }
        switch (opcionSwitchOrdenamientos) {
            case 1:// Bubble
                bubbleSort(arrayOriginal);
                System.out.println("Arreglo ordenado con Bubble Sort:");
                mostrarArreglo();
                break;
            case 2:// Selection sort
                selectionSort(arrayOriginal);
                System.out.println("Arreglo ordenado Selection Sort:");
                mostrarArreglo();
                break;

            case 3:// Quick sort
                quickSort(arrayOriginal, 0, arrayOriginal.length - 1);
                System.out.println("Arreglo ordenado con Quick Sort:");
                mostrarArreglo();

                break;
            case 4:// Regresar al menu principal
                System.out.println("Regresando al menu principal...");
                menuArreglos();
                return;

            default:
                System.out.println("Opción no válida. Intente de nuevo.");
                break;
        }
    }

    // Bubble sort
    static void bubbleSort(int[] Numeros) {
        for (int i = 0; i < Numeros.length - 1; i++) {
            for (int j = 0; j < Numeros.length - 1 - i; j++) {
                if (Numeros[j] > Numeros[j + 1]) {
                    int temp = Numeros[j];
                    Numeros[j] = Numeros[j + 1];
                    Numeros[j + 1] = temp;
                }
            }
        }
    }

    // Función de selection sort
    public static void selectionSort(int[] arrayOriginal) {
        for (int i = 0; i < arrayOriginal.length - 1; i++) {
            int minimo = i; // Posición del menor

            for (int j = i + 1; j < arrayOriginal.length; j++) {
                if (arrayOriginal[j] < arrayOriginal[minimo]) {
                    minimo = j;
                }
            }

            // intercambiar si se encontro un menor
            if (minimo != i) {
                int temporal = arrayOriginal[i];
                arrayOriginal[i] = arrayOriginal[minimo];
                arrayOriginal[minimo] = temporal;

            }
        }
    }

    public static void quickSort(int[] arrayOriginal, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particion(arrayOriginal, inicio, fin);
            quickSort(arrayOriginal, inicio, pivote - 1);
            quickSort(arrayOriginal, pivote + 1, fin);
        }

    }

    static int particion(int[] arrayOriginal, int inicio, int fin) {
        int pivote = arrayOriginal[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (arrayOriginal[j] <= pivote) {
                i++;
                int temp = arrayOriginal[i];
                arrayOriginal[i] = arrayOriginal[j];
                arrayOriginal[j] = temp;
            }
        }
        int temp = arrayOriginal[i + 1];
        arrayOriginal[i + 1] = arrayOriginal[fin];
        arrayOriginal[fin] = temp;
        return i + 1;
    }

    // Función para Invertir el Arreglo
    public static void invertirArreglo() {
        if (!arregloRegistrado) {
            System.out.println("Primero debes registrar el arreglo.\n");
            menuArreglos();
            return;
        }

        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayOriginal[i] = copiaOriginal[i];
        }

        int[] invertido = new int[arrayOriginal.length];
        for (int i = 0; i < arrayOriginal.length; i++) {
            invertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];

        }
        arrayOriginal = invertido; // Asignar el array invertido
        System.out.println("Arreglo invertido exitosamente");
        mostrarArreglo();// Mostrar el resultado
        System.out.println("=============================================" + "\n");
    }

    // Buscar Pares
    public static void paresArreglo() {
        if (!arregloRegistrado) {
            System.out.println("Primero debes registrar el arreglo.\n");
            menuArreglos();
            return;
        }

        int contador = 0;
        for (int i = 0; i < arrayOriginal.length; i++) {
            if (arrayOriginal[i] % 2 == 0) {
                System.out.print(arrayOriginal[i] + " ");
                contador++;
            }
        }
        System.out.println();
        if (contador == 0) {
            System.out.print("No hay numeros pares en el Arreglo.");
        } else {
            System.out.println("Este es el total de elementos pares en el Array: " + contador);
        }
        System.out.println("=============================================" + "\n");
    }

    // Funcion de Busquedas
    public static void menuBusqueda() {
        if (!arregloRegistrado) {
            System.out.println("Primero debes registrar el arreglo.\n");
            menuArreglos();
            return;
        }

        System.out.println("==== SELECCIONA EL TIPO DE BUSQUEDA ====");
        System.out.println("1. Busqueda lineal");
        System.out.println("2. Busqueda binaria");
        System.out.println("3. Volver al menu principal" + "\n");
        int opcionBusqueda = 0;
        boolean opcionValidaBusqueda = false;

        while (!opcionValidaBusqueda) {
            System.out.print("Seleccione una opción: ");
            try {
                opcionBusqueda = sc.nextInt();
                sc.nextLine();
                opcionValidaBusqueda = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número." + e.getMessage());
                sc.nextLine();
            }
        }
        switch (opcionBusqueda) {

            case 1:// Busqueda lineal
                busquedaLineal(arrayOriginal);
                break;
            case 2:// Busqueda Binaria
                busquedaBinaria(arrayOriginal);
                break;
            case 3:// Retornar el menu principal
                System.out.println("Regresando al menu principal");
                menuArreglos();
                return;
            default:
                System.out.println("Opcion no valida. Intente denuevo");

        }
    }

    // Busqueda Binaria
    public static void busquedaBinaria(int[] arrayOriginal) {
        System.out.print("Ingrese el número que desea buscar: ");
        int x = sc.nextInt();

        // Ordenar antes de la búsqueda binaria
        selectionSort(arrayOriginal);

        int inicio = 0, fin = arrayOriginal.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int mid = (inicio + fin) / 2;
            if (arrayOriginal[mid] == x) {
                System.out.println("Número" + arrayOriginal[x] + "encontrado en la posición: " + mid + "\n");
                encontrado = true;
                break;
            } else if (arrayOriginal[mid] < x)
                inicio = mid + 1;
            else
                fin = mid - 1;
        }
        if (!encontrado)
            System.out.println("Número no encontrado.");
    }

    // Busqueda lineal
    public static void busquedaLineal(int[] arrayOriginal) {
        System.out.print("Ingrese el número que desea buscar: ");
        int numeroUsuario1 = sc.nextInt();

        for (int i = 0; i < arrayOriginal.length; i++) {
            if (arrayOriginal[i] == numeroUsuario1) {
                System.out.println("Número encontrado: " + arrayOriginal[i] + " en la posición: " + i + "\n");
                return;
            }
        }
        System.out.println("El número no fue encontrado.");
        System.out.println("=============================================" + "\n");
    }

    public static void main(String[] args) {
        menuArreglos();
        sc.close();
    }
    // LA QUEREMOS MAESTRA
}