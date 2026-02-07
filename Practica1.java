import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {

        Scanner scPractica1 = new Scanner(System.in);
        int A = 0, B = 0;

        System.out.println("Introduce los valores para A: ");
        A = scPractica1.nextInt();
        System.out.println("Introduce los valores para B: ");
        B = scPractica1.nextInt();

        do {
            try {
                if (A == B) {
                    System.out.println("Los valores deben ser distintos vualva a ingresarlos");
                    System.out.println("introduce A: ");
                    A = scPractica1.nextInt();
                    System.out.println("Introduce para B");
                    B = scPractica1.nextInt();
                    if (A > B) {
                        System.out.println("El valor de A es Mayor");
                    } else {
                        System.out.println("El valor de B es Mayor");
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: entrada no válida. Entrada incorrecta de scanner" + e.getMessage());
            }
        } while (A == B);

        scPractica1.close();

    }

}
