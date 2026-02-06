import java.util.function.Function;

public class UsoDeCicloFor {

    // LAMBDA CORRECTA: Convierte Fahrenheit a Celsius
    // Recibe Fahrenheit, retorna Celsius
    static Function<Integer, Integer> fahrenheitACelsius = fahr -> (fahr - 32) * 5 / 9;

    public static void main(String[] args) {
        try {
            System.out.println(" ºF   ºC ");
            System.out.println("-----------");

            for (int fahrenheit = 50; fahrenheit <= 400; fahrenheit += 50) {
                // USO CORRECTO de la lambda
                int celsius = fahrenheitACelsius.apply(fahrenheit);

                System.out.println(fahrenheit + "   " + celsius);
            }
        } finally {
            System.out.println("Ejecución finalizada.");
        }
    }
}
