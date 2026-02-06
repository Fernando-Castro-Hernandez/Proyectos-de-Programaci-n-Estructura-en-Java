import java.util.Scanner;

public class UsoDeSwitch {
    public static void main(String[] args) {

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

        double tarifaPeso = 0;
        double tarifaKm = 0;
        int diasEstimado = 0;

        switch (tipoServicio) {
            case "DHL":
                tarifaPeso = 40;
                tarifaKm = 2.0;
                diasEstimado = 1;

                break;
            case "FEDEX":
                tarifaPeso = 30;
                tarifaKm = 1.5;
                diasEstimado = 3;
                break;

            case "ESTAFETA":
                tarifaPeso = 25;
                tarifaKm = 1.2;
                diasEstimado = 5;

                break;

            default:
                break;
        }

    }
}
