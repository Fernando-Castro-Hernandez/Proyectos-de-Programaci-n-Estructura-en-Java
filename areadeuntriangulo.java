import java.util.Scanner;

import javax.swing.JOptionPane;

public class areadeuntriangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ENTRADAS
        System.out.println("Dame un Valor de Base");
        double base = sc.nextDouble();

        System.out.println("Dame Un valor de Altura");
        double altura = sc.nextDouble();
        // PROCESOS
        Double area = base * altura / 2;

        System.out.println("La Base del triangulo es: " + base + " Su altura es: " + altura + " Su area es: "
                + " " + area);

        sc.close();
        String nombre = JOptionPane.showInputDialog("dame tu nombre");
        System.out.println(nombre);
        int Numero = Integer.parseInt(JOptionPane.showInputDialog("dame un numero"));
        System.out.println(Numero);
        Double NumeroDouble = Double.parseDouble(JOptionPane.showInputDialog("Dame un puto numero double carajo"));
        System.out.println(NumeroDouble);
        char LetraChar = JOptionPane.showInputDialog("Dame un double please").charAt(Numero);
        System.out.println(LetraChar);

    }

}
