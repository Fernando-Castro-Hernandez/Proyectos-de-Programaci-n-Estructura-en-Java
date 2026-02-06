import java.util.Scanner;

public class Holamundo {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("hola mundo, que tal");
        System.out.println("15");
        String txt = "Hllo fernande";
        System.out.println(txt.length());

        System.out.println(txt.indexOf("e"));
        int entrada = sc.nextInt();
        int salida = sc.nextInt();

        int tamañoArray = salida - entrada + 1; // se calcula el tamaño del array
        int[] lista = new int[tamañoArray];

        for (int i = 0; i < tamañoArray; i++) {
            lista[i] = entrada + i;
        }

        for (int num : lista) {
            if (num % 2 == 0) {
                System.out.print(num + " ");

            }

        }

        // int[] lista = { entrada - salida + 1 };

        // System.out.println(lista);

    }
}
/*
 * Proceso
 * while (x <= 10) { // mientras x <=10
 * // Declaracion de variables
 * double x, y;
 * 
 * // Entrada
 * x = 0;
 * y = 3 * x + 5;
 * 
 * // Salida
 * System.out.println("x = " + x + " y = " + y); // imprimir (x,y)
 * 
 * x += 0.5; // incrementar contador x = x + 0.5;
 * 
 * System.out.println("############################");
 * 
 * {
 * 
 * int n = 1;
 * 
 * int m = 0;
 * 
 * m = n++;
 * 
 * System.out.println(m);
 * 
 * System.out.println(n);
 */

// System.out.println("escribe un numero y te doy su factorial");
// int num1 = sc.nextInt();
// int contador = 0;

// for (num1 = 1; num1 > contador; num1--) {
// num1 = (num1 - 1) * num1;

/*
 * do {
 * 
 * resultado = num1 * (num1 - 1) * (num1 - 2);
 * System.out.println(resultado);
 * break;
 * int añoUsuario = sc.nextInt();
 * 
 * if ((añoUsuario % 4 == 0) && (añoUsuario % 400 == 0)) {
 * System.out.println(" ES UN AÑO BISIESTO");
 * 
 * } else {
 * System.out.println(" NO ES UN AÑO BISIESTO");
 * }
 * 
 * }
 * } while (resultado != 0);
 */

// if (añoUsuario % 100 != 0)