import java.util.Scanner;

public class PracticaChatito {

    // funciones

    public static int calcularFactorial(int num1) {
        for (num1 = 1; num1 > 1; num1--) {
            num1 = (num1 - 1) * num1;

        }

        return num1;
    }

    public static void main(String[] args) {
        Scanner scMenú = new Scanner(System.in);

        int selecciónMenú;

        try {
            do {

                System.out.println("======MENÚ======");
                System.out.println("====== 1-> Calcular el factorial de un número======");
                System.out.println("====== 2-> Mostrar si un número es primo o no======");
                System.out.println("====== 3->Sumar los números pares entre 1 y N======");
                System.out.println("====== 4-> SALIR======");
                System.out.println("===================================");
                selecciónMenú = scMenú.nextInt();

                switch (selecciónMenú) {
                    case 1: // factorial de un numero

                        break;
                    case 2: // mostrar si es primo o no

                        break;

                    case 3:

                        break;
                    default:
                        System.out.println("ERROR SELECIONA UN NUMERO ");
                        continue;
                }
                break;
            } while (selecciónMenú != 4);

        } catch (Exception e) {

        } finally {

        }

        scMenú.close();

    }

}
