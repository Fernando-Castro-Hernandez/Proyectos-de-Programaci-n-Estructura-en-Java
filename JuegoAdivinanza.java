import java.io.*;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) throws IOException {
        Scanner scannerAdivinanza = new Scanner(System.in);

        // ENTRADAS
        System.out.println("Ingresa un numero del 1 al 10");
        String numeroUsuario = scannerAdivinanza.nextLine();

        // PROCESO

        int secreto = (int) (Math.random() * 10) + 1;

        int numeroUserAint = Integer.parseInt(numeroUsuario);

        // SALIDA

        Boolean comparar = (numeroUserAint == secreto);

        System.out.println("El numero correcto es: " + secreto);
        System.out.println(comparar);

        if (comparar == true) {
            System.out.println("Has Adivinado, eres muy bueno");

        } else
            System.out.println("Fallaste");

        scannerAdivinanza.close();

    }

}
