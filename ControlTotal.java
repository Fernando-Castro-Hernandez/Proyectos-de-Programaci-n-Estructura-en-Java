import java.util.Scanner;

public class ControlTotal {
    public static void main(String[] args) {

        Scanner scRestaurante = new Scanner(System.in);
        // ENTRADAS
        // ESTAS VARIABLES SON PARTE DE MENÚ
        int opcionPrincipal; // MENÚ PRINCIPAL
        int opcionSecundaria; // SUBMENÚ

        /*
         * EL USUARIO DEBERÁ ESCOGER UNA DE LAS OPCIONES QUE LE DA EL PROGRAMA,
         * ESTE TIENE UNA FUNCION ESPECIAL PUES EL USUARIO PUEDE RETROCEDER O SALIRSE
         * DIRECTAMENTE
         * DEL PROGRAMA, ES POR ESO QUE UTILIZAMOS UN DO WHILE POR QUE NO SABEMOS LAS
         * VECES QUE SE REPETIRA UN CICLO,
         * PERO NECESITAMOS QUE SE HAGA ALMENOS UNA VEZ.
         */

        do { // MENÚ PRINCIPAL
            System.out.println("========MENÚ========");
            System.out.println("1 -> ENTRADAS ");
            System.out.println("2 -> PLATOS FUERTES");
            System.out.println("3 -> BEBIDAS");
            System.out.println("4 -> POSTRES");
            System.out.println("5 -> SALIR");
            System.out.println("SELECCIONA UN NUMERO: ");
            opcionPrincipal = scRestaurante.nextInt(); // USUARIO INGRESA OPCIÓN

            switch (opcionPrincipal) {
                case 1: // ESTE ES EL CASO 1 DE EL PRIMER SWITCH ANIDADO DENTRO DEL CICLO DO WHILE

                    do { /*
                          * DENTRO DEL SWITCH PRINCIPAL NOS ENCONTRAMOS OTRO SUBMENÚ QUE NECESITA OTRO
                          * CICLO DO WHILE
                          * PUESTO QUE NO SABEMOS CUANTAS VECES EL USUARIO REPETIRÁ EL CICLO
                          */
                        System.out.println("========ENTRADAS========");
                        System.out.println("1 -> PAPAS A LA FRANCESA ");
                        System.out.println("2 -> PAN CON AJO");
                        System.out.println("3 -> PAPDZULES");
                        System.out.println("4 -> TOSTADAS CON FRIJOL");
                        System.out.println("5 -> SALIR");
                        System.out.println("SELECCIONA UN NUMERO: ");
                        opcionSecundaria = scRestaurante.nextInt(); // AQUI INICIAMOS EL SUBMENÚ
                        // AQUI EMPIEZA LA ESTRUCTURA SECUNDARIA SWITCH (SUBMENÚ) DENTRO DE UN DO WHILE,
                        // DENTRO DE UN SWITCH, DENTRO DE UN DO WHILE
                        switch (opcionSecundaria) { // SECUNDARIO
                            case 1:
                                System.out.println("SUS PAPAS A LA FRANCESA ESTAN EN CAMINO!!");
                                break;
                            case 2:
                                System.out.println("SU PAN CON AJO ESTA EN CAMINO");
                                break;

                            case 3:
                                System.out.println("SUS PAPADZULES ENTEN EN CAMINO");
                                break;

                            case 4:
                                System.out.println("SUS TOSTADAS CON FRIJOL ESTAN EN CAMINO");
                                break;

                            case 5:
                                System.out.println("HA SALIDO DEL PROGRAMA");
                                continue; /*
                                           * LA ESTRUCTURA DE SALTO continue; NOS PERMITE VOLVER AL INICIO DEL CICLO
                                           * ACTUAL
                                           * PARA QUE EL USUARIO ELIJA OTRA OPCION SIN SALIR
                                           */
                            default:
                                System.out.println("OPCION INVALIDA, INTENTE DE NUEVO");
                                continue;/*
                                          * LA ESTRUCTURA DE SALTO continue; NOS PERMITE VOLVER AL INICIO DEL CICLO
                                          * ACTUAL
                                          * PARA QUE EL USUARIO ELIJA OTRA OPCION SIN SALIR, EN ESTE CASO, CUANDO LA
                                          * OPCION SEA INVALIDA
                                          */
                        }
                        break;
                    } while (opcionSecundaria != 5);
                    break; // UTILIZAMOS UN break; AL FINAL DE CADA DO WHILE SECUNDARIO PARA QUE SE CORTE
                           // DE RAIZ EL CICLO Y PASE AL SIGUIENTE

                case 2: // MENÚ PRINCIPAL
                    do {
                        System.out.println("========PLATOS FUERTES========");
                        System.out.println("1 -> PARRILLADA");
                        System.out.println("2 -> QUESO RELLENO");
                        System.out.println("3 -> PAPA ASADA");
                        System.out.println("4 -> ARRACHERA");
                        System.out.println("5 -> SALIR");
                        System.out.println("SELECCIONA UN NUMERO: ");
                        opcionSecundaria = scRestaurante.nextInt();

                        switch (opcionSecundaria) { // MENÚ SECUNDARIO
                            case 1:
                                System.out.println("SU PARRILLADA ESTA EN CAMINO");
                                break;
                            case 2:
                                System.out.println("SU QUESO RELLENO ESTA EN CAMINO");
                                break;
                            case 3:
                                System.out.println("SU PAPA ASADA ESTA EN CAMINO");
                                break;
                            case 4:
                                System.out.println("SU ARRACHERA ESTA EN CAMINO");
                                break;
                            case 5:
                                System.out.println("HA SALIDO DEL PROGRAMA");
                                continue;

                            default:
                                System.out.println("OPCION INVALIDA");
                                continue;
                        }
                        break;
                    } while (opcionSecundaria != 5);
                    break;

                case 3: // MENÚ PRINCIPAL
                    do {
                        System.out.println("========BEBIDAS========");
                        System.out.println("1 -> LIMONADA");
                        System.out.println("2 -> PIÑA COLADA");
                        System.out.println("3 -> CERVEZA");
                        System.out.println("4 -> HORCHATA");
                        System.out.println("5 -> SALIR");
                        System.out.println("SELECCIONA UN NUMERO: ");
                        opcionSecundaria = scRestaurante.nextInt();

                        switch (opcionSecundaria) {// MENÚ SECUNDARIO
                            case 1:
                                System.out.println("SU LIMONADA ESTA EN CAMINO");
                                break;
                            case 2:
                                System.out.println("SU PIÑA COLADA ESTA EN CAMINO");
                                break;
                            case 3:
                                System.out.println("SU CERVEZA ESTA EN CAMINO");
                                break;
                            case 4:
                                System.out.println("SU HORCHATA ESTA EN CAMINO");
                                break;
                            case 5:
                                System.out.println("HA SALIDO DEL PROGRAMA");
                                continue;

                            default:
                                System.out.println("OPCION INVALIDA");
                                continue;
                        }
                        break;
                    } while (opcionSecundaria != 5);
                    break;

                case 4: // MENÚ PRINCIPAL
                    do {

                        System.out.println("========MENÚ========");
                        System.out.println("1 -> QUESO NAPOLITANO");
                        System.out.println("2 -> HELADO DE COCO");
                        System.out.println("3 -> FLAN");
                        System.out.println("4 -> GALLETAS DE CHOLOLATE");
                        System.out.println("5 -> SALIR");
                        System.out.println("SELECCIONA UN NUMERO: ");
                        opcionSecundaria = scRestaurante.nextInt();

                        switch (opcionSecundaria) { // MENÚ SECUNDARIO
                            case 1:
                                System.out.println("SU QUESO NAPOLITANO ESTA EN CAMINO");
                                break;
                            case 2:
                                System.out.println("SU HELADO DE COCO ESTA EN CAMINO");
                                break;
                            case 3:
                                System.out.println("SU FLAN ESTA EN CAMINO");
                                break;
                            case 4:
                                System.out.println("SUS GALLETAS DE CHOCOLATE ESTAN EN CAMINO");
                                break;
                            case 5:
                                System.out.println("HA SALIDO DEL PROGRAMA");
                                continue;
                            default:
                                System.out.println("OPCION INVALIDA");
                                continue;
                        }
                        break;

                    } while (opcionPrincipal != 5);
                    break;

                case 5:// MENÚ PRINCIPAL
                    System.out.println("GRACIAS POR USAR EL MENÚ");
                    break;

                default:
                    System.out.println("OPCION INVALIDA");
                    continue;
            }
            break;

        } while (opcionPrincipal != 5);// CIERRE DEL DO WHILE PRINCIPAL

        scRestaurante.close();

        /*
         * PARA ESTE EJEMPLO DE MENÚS ANIDADOS EN ESPECIFICO, NO SE ENCONTRÓ LA MANERA
         * LOGICA DE
         * USAR LA ESTRUCTURA DE SALTO return; PUESTO QUE ESTA SIRVE PARA ENTRE OTROS
         * CASOS, TERMINAR UN METODO
         * Y DEVOLVER UN VALOR, COMO EN UNA FUNCIÓN O UNA OPERACION MATEMATICA. ESTE
         * MENÚ SOLO MANEJA OUTPUTS DE SALIDA DE LETRAS
         * EN CONSOLA SEGÚN LO QUE ELIGIÓ EL USUARIO.
         * 
         * SIN EMBARGO SE ENTIENDE QUE LOS return; SE UTILIZA PARA FINALIZAR LA
         * EJECUCIÓN DE UN MÉTODO Y, OPCIONALMENTE,
         * DEVOLVER UN VALOR AL MÉTODO QUE LO LLAMÓ. SU COMPORTAMIENTO DEPENDE DEL TIPO
         * DE MÉTODO EN EL QUE SE UTILICE QUE PUEDE
         * SER DE TIPO RETORNO, METODO VOID O DEVOLVER OBJETOS.
         */
    }
}
