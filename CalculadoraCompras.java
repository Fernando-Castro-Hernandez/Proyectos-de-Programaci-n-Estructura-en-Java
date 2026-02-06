import java.io.*;
import java.util.Scanner;

public class CalculadoraCompras {
    public static void main(String[] args) throws IOException {

        Scanner scanerCalculadora = new Scanner(System.in);
        // ENTRADAS
        System.out.println("Ingresa tu Nombre");
        String nombre = scanerCalculadora.nextLine();

        System.out.println("Ingresa el nombre del producto");
        String producto = scanerCalculadora.nextLine();

        System.out.println("¿Cuantos productos ha Comprado? ");
        int cantidad = scanerCalculadora.nextInt();

        System.out.println("Precio del producto?");
        double precio = scanerCalculadora.nextDouble();

        System.out.println("¿Es cliente frecuente? (true/false)");
        boolean clienteFrecuente = scanerCalculadora.nextBoolean();

        // PROCESOS

        String nombreMayuscula = nombre.toUpperCase();

        double totalPagar = (cantidad * precio);

        int LongitudNombre = nombre.length();

        char inicialProducto = producto.charAt(0);

        // SALIDAS

        System.out.println("=Recibo de Compra=");
        System.out.println("Cliente: " + nombreMayuscula);
        System.out.println("Longitud de nombre: " + LongitudNombre);
        System.out.println("Producto: " + producto);
        System.out.println("Inicial del Producto: " + inicialProducto);
        System.out.println(" Cantidad: " + cantidad);
        System.out.println("¿Es cliente Frecuente?: " + clienteFrecuente);
        System.out.println("Precio Unitario: " + precio);
        System.out.println("TOTAL A PAGAR: " + totalPagar);

        scanerCalculadora.close();
    }
}
