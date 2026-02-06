import java.util.Scanner;

public class EstructurasDeControl {
    public static void main(String[] args) {

        Scanner scEDC = new Scanner(System.in);

        // ENTRADAS
        System.out.println("Introduce tu calificación: ");
        double calificación = scEDC.nextDouble();

        System.out.println("Ingresa un numero del 1 al 7: ");
        int numero = scEDC.nextInt();

        System.out.println("dame un numero entero del 1 al 10 y te digo si es par o impar: ");
        int numeroParImpar = scEDC.nextInt();

        // PROCESOS

        if (calificación >= 90) {
            System.out.println("EXCELENTE");

        } else if (calificación >= 70 && calificación <= 89) {
            System.out.println("APROBADO");

        } else
            System.out.println("REPROBADO");

        scEDC.close();

        switch (numero) {
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");

            default:
                System.out.println("Elige otro número");
                break;
        }

        System.out.println(numeroParImpar % 2 == 0 ? "par" : "impar");

    }

}
