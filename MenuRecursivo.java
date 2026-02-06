import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuRecursivo {
    public static Scanner scMenu = new Scanner(System.in);

    public static void menuRecursivo() {

        System.out.println("========MENÚ========");
        System.out.println("1 -> ENTRADAS ");
        System.out.println("2 -> PLATOS FUERTES");
        System.out.println("3 -> BEBIDAS");
        System.out.println("4 -> SALIR");
        System.out.println("SELECCIONA UN NUMERO: ");

        int opcionPrincipal = lecturaOpcionUsuario(); // USUARIO INGRESA OPCIÓN // try-catch aplicado solo aquí

        switch (opcionPrincipal) {
            case 1:
                System.out.println("========ENTRADAS========");
                System.out.println("1 -> PAPAS A LA FRANCESA ");
                System.out.println("2 -> PAN CON AJO");
                System.out.println("3 -> PAPDZULES");
                System.out.println("4 -> TOSTADAS CON FRIJOL");
                System.out.println("5 -> SALIR");
                System.out.println("SELECCIONA UN NUMERO: ");
                int opcionSecundaria = lecturaOpcionUsuario();// USUARIO INGRESA OPCIÓN // try-catch aplicado solo aquí

                switch (opcionSecundaria) {
                    case 1:
                        System.out.println("SUS PAPAS A LA FRANCESA ESTAN EN CAMINO!!");
                        menuRecursivo();
                        break;
                    case 2:
                        System.out.println("SU PAN CON AJO ESTA EN CAMINO");
                        menuRecursivo();
                        break;

                    case 3:
                        System.out.println("SUS PAPADZULES ENTEN EN CAMINO");
                        menuRecursivo();
                        break;

                    case 4:
                        System.out.println("SUS TOSTADAS CON FRIJOL ESTAN EN CAMINO");
                        menuRecursivo();
                        break;
                    case 5:
                        System.out.println("HA SALIDO DEL PROGRAMA");
                        return; // caso base

                    default:// sigue funcionando si el usuario elige un número fuera del rango
                        System.out.println("Opción inválida. Intenta de nuevo.");
                        menuRecursivo(); // vuelve al menú

                }
                break;
            case 2:
                System.out.println("========PLATOS FUERTES========");
                System.out.println("1 -> PARRILLADA");
                System.out.println("2 -> QUESO RELLENO");
                System.out.println("3 -> PAPA ASADA");
                System.out.println("4 -> ARRACHERA");
                System.out.println("5 -> SALIR");
                System.out.println("SELECCIONA UN NUMERO: ");
                opcionSecundaria = lecturaOpcionUsuario();// USUARIO INGRESA OPCIÓN // try-catch aplicado solo aquí
                switch (opcionSecundaria) {
                    case 1:
                        System.out.println("SU PARRILLADA ESTA EN CAMINO");
                        menuRecursivo();
                        break;
                    case 2:
                        System.out.println("SU QUESO RELLENO ESTA EN CAMINO");
                        menuRecursivo();
                        break;
                    case 3:
                        System.out.println("SU PAPA ASADA ESTA EN CAMINO");
                        menuRecursivo();
                        break;
                    case 4:
                        System.out.println("SU ARRACHERA ESTA EN CAMINO");
                        menuRecursivo();
                        break;
                    case 5:
                        System.out.println("HA SALIDO DEL PROGRAMA");
                        return; // caso base

                    default:// sigue funcionando si el usuario elige un número fuera del rango
                        System.out.println("Opción inválida. Intenta de nuevo.");
                        menuRecursivo(); // vuelve al menú

                }
                break;
            case 3:
                System.out.println("========BEBIDAS========");
                System.out.println("1 -> LIMONADA");
                System.out.println("2 -> PIÑA COLADA");
                System.out.println("3 -> CERVEZA");
                System.out.println("4 -> HORCHATA");
                System.out.println("5 -> SALIR");
                System.out.println("SELECCIONA UN NUMERO: ");
                opcionSecundaria = lecturaOpcionUsuario();// USUARIO INGRESA OPCIÓN // try-catch aplicado solo aquí
                switch (opcionSecundaria) {
                    case 1:
                        System.out.println("SU LIMONADA ESTA EN CAMINO");
                        menuRecursivo();
                        break;
                    case 2:
                        System.out.println("SU PIÑA COLADA ESTA EN CAMINO");
                        menuRecursivo();
                        break;
                    case 3:
                        System.out.println("SU CERVEZA ESTA EN CAMINO");
                        menuRecursivo();
                        break;
                    case 4:
                        System.out.println("SU HORCHATA ESTA EN CAMINO");
                        menuRecursivo();
                        break;
                    case 5:
                        System.out.println("HA SALIDO DEL PROGRAMA");
                        return; // caso base

                    default:// sigue funcionando si el usuario elige un número fuera del rango
                        System.out.println("Opción inválida. Intenta de nuevo.");
                        menuRecursivo(); // vuelve al menú

                }

                break;
            case 4:
                System.out.println("FIN DEL PROGRAMA.");
                return; // caso base

            default:// sigue funcionando si el usuario elige un número fuera del rango
                System.out.println("Opción inválida. Intenta de nuevo.");
                menuRecursivo(); // vuelve al menú

        }
    }

    // Lectura con validación y try-catch
    static int lecturaOpcionUsuario() {
        try {
            return scMenu.nextInt(); // solo lectura para devolver el valor capturado
        } catch (InputMismatchException e) {
            scMenu.next(); // limpia entrada inválida
            System.out.println("Error: debes ingresar un número entero.");
            return -1; // devuelve valor fuera del rango para que caiga en 'default'
        }
    }

    public static void main(String[] args) {
        menuRecursivo();
        scMenu.close();

    }

}
