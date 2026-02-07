import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {
        Scanner scPractica2 = new Scanner(System.in);

        try {
            double Sub_total = 0, Total = 0;
            String codigoProducto;

            System.out.println("Ingrese Codigo de productos y precio");
            System.out.println("Codigo de producto: ");
            codigoProducto = scPractica2.nextLine();
            System.out.println("Ingresa el precio: ");
            double precio = scPractica2.nextDouble();

            System.out.println("===== Titulos tiquete =====");

            while (codigoProducto.length() != 0) {
                Sub_total = Sub_total + precio;

                System.out.println("CodigoProducto");
                codigoProducto = scPractica2.nextLine();
                System.out.println("Precio: ");
                precio = scPractica2.nextDouble();

            }

            double IVA = Sub_total * .15;
            Total = Sub_total + IVA;
            System.out.println(codigoProducto);
            System.out.println("Subtotal : " + Sub_total);
            System.out.println("Total : " + Total);
            System.out.println("IVA : " + IVA);

        } catch (InputMismatchException e) {
            System.out.println("Error: entrada no válida. Entrada incorrecta de scanner" + e.getMessage());
        } finally {
            scPractica2.close();

        }
    }

}
