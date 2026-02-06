public class AleatoriosColoresLynet {
    public static void main(String[] args) {
        System.out.println("El color de la semana es:");

        int numerosLynet = (int) (Math.random() * 15) + 1;

        switch (numerosLynet) {
            case 1:
                System.out.println("morado");
                break;
            case 2:
                System.out.println("rosado");
                break;
            case 3:
                System.out.println("negro");
                break;
            case 4:
                System.out.println("blanco");
                break;
            case 5:
                System.out.println("gris");
                break;
            case 6:
                System.out.println("azul");
                break;
            case 7:
                System.out.println("verde");
                break;
            case 8:
                System.out.println("amarillo");
                break;
            case 9:
                System.out.println("naranja");
                break;
            case 10:
                System.out.println("rojo");
                break;
            case 11:
                System.out.println("cafe");
                break;
            case 12:
                System.out.println("turquesa");
                break;
            case 13:
                System.out.println("lila");
                break;
            case 14:
                System.out.println("fucsia");
                break;
            case 15:
                System.out.println("dorado");
                break;

            default:
                System.out.println("teclea un mumero ");
                break;
        }

    }
}
