public class Estudiante {
    public static void main(String[] args) {
        // Tipos de Datos Básicos
        int edad = 20; // Entero
        double promedio = 8.75; // Decimal
        char inicial = 'A'; // Caracter
        boolean inscrito = true; // Lógico

        // String
        String nombre = " juan perez ";

        // Uso de Metodos de String
        // a Mayusculas

        String nombreMayus = nombre.toUpperCase();

        // Quitar espacios

        String nombreTrim = nombre.trim();

        // Longitud de texto

        int longitud = nombreTrim.length();

        // Primer caracter

        char primeraLetra = nombreTrim.charAt(0);

        // Comparación

        boolean compara = nombreTrim.equals("JUAN PEREZ");

        // SALIDA DE DATOS

        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Inicial: " + inicial);
        System.out.println("Instcrito: " + inscrito);
        System.out.println("Nombre Original: " + nombre);
        System.out.println("Nombre en Mayusculas: " + nombreMayus);
        System.out.println("Nombre sin Espacios al principio y al final: " + nombreTrim);
        System.out.println("Longitud del Nombre: " + longitud);
        System.out.println("Primera letra: " + primeraLetra);
        System.out.println("Es igual a JUAN PEREZ??: " + compara);
    }
}
