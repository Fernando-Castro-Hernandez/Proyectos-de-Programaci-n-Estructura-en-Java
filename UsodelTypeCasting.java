import java.util.Scanner;

public class UsodelTypeCasting {
    public static void main(String[] args) {
        Scanner scanersito = new Scanner(System.in);

        // Entrada de Datos

        System.out.println("Ingresa un Numero entero: ");
        int numero = scanersito.nextInt();

        // 1. Conversion Implicita (int → double)

        double numeroDouble = numero;
        System.out.println("Comversion de entero (int) a double (double): " + numeroDouble);

        // 2. Conversión explícita (double → int)

        double Decimal = 9.9849455;
        int entero = (int) Decimal;
        System.out.println("Converion de numero Double a Entero: " + entero);

        // 3. Conversión entre String y número

        String texto = "123456";
        int numeroParseado = Integer.parseInt(texto); // String → int
        System.out.println("converion de String 123456 a  int (entero): " + numeroParseado);

        int valorDeNumero = 456789;
        String textoConvertido = String.valueOf(valorDeNumero); // int → String
        System.out.println("Conversión int a String: " + textoConvertido);

        scanersito.close();

    }
}
