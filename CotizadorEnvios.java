import java.util.Scanner;
import java.io.*;

public class CotizadorEnvios {
    public static void main(String[] args) throws IOException {

        // ENTRADAS DE USUARIO
        Scanner scEnvios = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = scEnvios.nextLine();

        System.out.println("Dirección de entrega: ");
        String direccionEntrega = scEnvios.nextLine();

        System.out.println("Tipo de servicio: DHL, FEDEX, ESTAFETA");
        String tipoServicio = scEnvios.nextLine();

        System.out.println("Distancia del envío en km: ");
        double distanciaKM = scEnvios.nextDouble();

        System.out.println("Peso del paquete en kg: ");
        double pesoKG = scEnvios.nextDouble();

        // PROCESOS

        String nombreMayus = nombre.toUpperCase(); // CONVERTIR NOMBRE A MAYUSCULAS
        int lonNombre = nombreMayus.length(); // OBTENER LONGITUD DE NOMBRE MAYUSCULAS

        double tarifaPeso = 0;
        double tarifaKm = 0;
        int diasEstimado = 0;

        if (tipoServicio.equals("DHL")) {

            tarifaPeso = 40;
            tarifaKm = 2.0;
            diasEstimado = 1;

        } else if (tipoServicio.equals("FEDEX")) {
            tarifaPeso = 30;
            tarifaKm = 1.5;
            diasEstimado = 3;

        } else {
            tarifaPeso = 25;
            tarifaKm = 1.2;
            diasEstimado = 5;

        }

        double costoBase = pesoKG * tarifaPeso + distanciaKM * tarifaKm; // Calcular costo base

        double iva = costoBase * .16; // CALCULAR IVA

        double total = Math.round(iva); // redondeo

        boolean aprobado = (pesoKG <= 30 && total <= 5000); // Determinar si el envío es válido

        // SALIDAS

        System.out.println("=== RECIBO DE COTIZACIÓN – ENVÍOS EXPRESS YUCATÁN ===");

        System.out.println("Nombre del Cliente: " + nombreMayus + "(longitud" + lonNombre + ")");
        System.out.println("Dirección de entrega: " + direccionEntrega);
        System.out.println("Servicio seleccionado: " + tipoServicio);
        System.out.println("Distancia: " + distanciaKM);
        System.out.println("Peso: " + pesoKG);

        System.out.println("=== DETALLE DE COSTOS ===");
        System.out.println("Costo base: " + costoBase);
        System.out.println("IVA (16%):" + iva);
        System.out.println("Total (Redondeado):" + total);
        System.out.println("Entrega estimada: " + diasEstimado);
        System.out.println("¿Se aprueba el envío?: " + aprobado);

        scEnvios.close();

    }

}
