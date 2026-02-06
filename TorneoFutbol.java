import java.util.Scanner;
import java.util.InputMismatchException;

public class TorneoFutbol { // CLASE
    public static Scanner scFutbol = new Scanner(System.in);

    public static void menuTorneo() {// IMPRIME LAS OPCIONES DEL MENU
        System.out.println("========== MENÚ TORNEO DE FUTBOL =========");
        System.out.println("======== 1- REGISTRAR EQUIPO A ===========");
        System.out.println("======== 2- REGISTRAR EQUIPO B ===========");
        System.out.println("======== 3- TABLA ========================");
        System.out.println("======== 4- SALIR ========================");

    }

    public static int calcularPuntos(int ganados, int empatados, int perdidos) {// CALCULA LOS PUNTOS DE LOS EQUIPOS
        int puntos = (ganados * 3) + (empatados * 1) + (perdidos * 0);

        return puntos;
    }

    public static String ganador(String equipoA, int puntosA, String equipoB, int puntosB) {// DETERMINA QUE EQUIPO GANA
                                                                                            // POR PUNTOS
        if (puntosA > puntosB) {
            return equipoA;
        } else {
            return equipoB;
        }

    }

    public static void desempate(int golesEq1, int golesEq2, String equipoA, String equipoB) {// DETERMINA SI HAY UN
                                                                                              // EMPATE,
        System.out.println("EL DESEMPATE ES POR GOLES ANOTADOS"); // O DESEMPATE POR GOLES
        if (golesEq1 > golesEq2) {
            System.out.println(" EL GANADOR POR DESEMPATE ES: " + equipoA);
        } else if (golesEq2 > golesEq1) {
            System.out.println("EL GANADOR POR DESEMPATE ES: " + equipoB);

        } else {
            System.out.println("LOS DOS EQUIPOS HAN EMPATADO TANTO EN PUNTOS COMO EN GOLES. ");
        }

    }

    public static boolean consistencia(int ganados, int empatados, int perdidos, int goles, int partidosj,
            String nombreEquipo) {// VERIFICA QUE LOS DATOS
        // Validación 1, QUE NO SEAN NEGATIVOS //DE LOS EQUIPOS SEAN CONGRUENTES
        if (ganados < 0 || empatados < 0 || perdidos < 0 || goles < 0 || partidosj < 0) {
            System.out.println("ERROR: LOS VALORES INGRESADOS NO PUEDEN SER NEGATIVOS PARA: " + nombreEquipo);
            return false;
        }

        // Validación 2: LOS PARTIDOS JUGADOS DEBEN SER CONGRUENTES CON: GANADOS +
        // EMPATADOS + PERDIDOS
        int total = ganados + empatados + perdidos;
        if (partidosj != total) {
            System.out.println(
                    "ERROR: LOS PARTIDOS JUGADOS NO COINCIDEN CON LA SUMA DE GANADOS + EMPATADOS + PERDIDOS PARA: "
                            + nombreEquipo);
            System.out.println(
                    "Revisar: PARTIDOS JUGADOS = " + partidosj + "  (GANADOS+EMPATADOS+PERDIDOS=" + total + ")");
            return false;
        }

        // SI TODo ES CONGRUENTE
        System.out.println("LA CONSISTENCIA DEL EQUIPO ES CORRECTA.");
        return true;
    }

    public static int lecturaOpcionUsuario() { // LECTURA CON VALIDACION y USO DE try-catch
        try {
            return scFutbol.nextInt();
        } catch (InputMismatchException e) {
            scFutbol.next();
            System.out.println("Error: debes ingresar un número entero.");
            return -1; // valor inválido para que caiga en default
        }
    }

    public static void main(String[] args) {

        System.out.println("¡EMPIEZA EL TORNEO!");
        int opcionMenu = 0;
        int ganados1 = 0, empatados1 = 0, perdidos1 = 0, anotados1 = 0, partidosJugados1 = 0;
        int ganados2 = 0, empatados2 = 0, perdidos2 = 0, anotados2 = 0, partidosJugados2 = 0;
        String equipo1 = "", equipo2 = "";

        do {
            menuTorneo(); // LLAMADA DE PROCESO

            opcionMenu = lecturaOpcionUsuario(); // USUARIO INGRESA SU OPCIÓN Y EJECUTA TRY-CATCH (APLICADO SOLO AQUÍ)

            switch (opcionMenu) {
                // RECEPCION DE DATOS EQUIPO 1
                case 1:
                    System.out.println("INGRESA EL NOMBRE DEL EQUIPO 1: ");
                    scFutbol.nextLine();
                    equipo1 = scFutbol.nextLine().toUpperCase().trim();
                    System.out.println("INGRESA EL TOTAL DE PARTIDOS JUGADOS DEL EQUIPO");
                    partidosJugados1 = lecturaOpcionUsuario();
                    System.out.println("INGRESA LOS PARTIDOS GANADOS: ");
                    ganados1 = lecturaOpcionUsuario();
                    System.out.println("INGRESA LOS PARTIDOS EMPATADOS: ");
                    empatados1 = lecturaOpcionUsuario();
                    System.out.println("INGRESA LOS PARTIDOS PERDIDOS: ");
                    perdidos1 = lecturaOpcionUsuario();
                    System.out.println("INGRESA LOS GOLES ANOTADOS: ");
                    anotados1 = lecturaOpcionUsuario();
                    // Validación antes de continuar
                    if (consistencia(ganados1, empatados1, perdidos1, anotados1, partidosJugados1, equipo1) == false) {// LLAMADO
                                                                                                                       // DE
                                                                                                                       // LA
                                                                                                                       // FUNCION
                        System.out.println("Datos inválidos, vuelve a ingresarlos."); // PARA CONFIRMAR SU CONGRUENCIA
                        break;
                    }

                    break;
                // RECEPCION DE DATOS EQUIPO 2
                case 2:
                    System.out.println("INGRESA EL NOMBRE DEl EQUIPO 2: ");
                    scFutbol.nextLine();
                    equipo2 = scFutbol.nextLine().toUpperCase();
                    System.out.println("INGRESA EL TOTAL DE PARTIDOS JUGADOS DEL EQUIPO");
                    partidosJugados2 = lecturaOpcionUsuario();
                    System.out.println("INGRESA LOS PARTIDOS GANADOS: ");
                    ganados2 = lecturaOpcionUsuario();
                    System.out.println("INGRESA LOS PARTIDOS EMPATADOS: ");
                    empatados2 = lecturaOpcionUsuario();
                    System.out.println("INGRESA LOS PARTIDOS PERDIDOS: ");
                    perdidos2 = lecturaOpcionUsuario();
                    System.out.println("INGRESA LOS GOLES ANOTADOS: ");
                    anotados2 = lecturaOpcionUsuario();
                    if (consistencia(ganados2, empatados2, perdidos2, anotados2, partidosJugados2, equipo2) == false) {// LLAMADO
                                                                                                                       // DE
                                                                                                                       // LA
                                                                                                                       // FUNCION
                        System.out.println("Datos inválidos, vuelve a ingresarlos."); // PARA CONFIRMAR SU CONGRUENCIA
                        break;
                    }

                    break;
                case 3:// OPCION DE TABLA PARA OBTENER RESULTADOS
                    int puntosEq1 = calcularPuntos(ganados1, empatados1, perdidos1);
                    int puntosEq2 = calcularPuntos(ganados2, empatados2, perdidos2);
                    System.out.println("======== TABLA DEL TORNEO ========");
                    System.out.println("+-----------------+-----------------+");
                    System.out.printf("| %-15s | %-15s |\n", "EQUIPO 1", "EQUIPO 2");
                    System.out.println("+-----------------+-----------------+");
                    System.out.printf("| %-15s | %-15s |\n", equipo1, equipo2);
                    System.out.printf("| %-15s | %-15s |\n", "Partidos J: " + partidosJugados1,
                            "Partidos J: " + partidosJugados2);
                    System.out.printf("| %-15s | %-15s |\n", "GANADOS: " + ganados1, "GANADOS: " + ganados2);
                    System.out.printf("| %-15s | %-15s |\n", "EMPATADOS: " + empatados1, "EMPATADOS: " + empatados2);
                    System.out.printf("| %-15s | %-15s |\n", "PERDIDOS: " + perdidos1, "PERDIDOS: " + perdidos2);
                    System.out.printf("| %-15s | %-15s |\n", "GOLES: " + anotados1, "GOLES: " + anotados2);
                    System.out.println("+-----------------+-----------------+");

                    if (puntosEq1 == puntosEq2) {// CONDICION QUE COMPARA SI HAY UN POSIBLE EMPATE, SI NO ES ASI
                                                 // CONTINUA NORMAL
                        desempate(anotados1, anotados2, equipo1, equipo2);// LLAMADO DE LA FUNCION QUE DESEMPATE EN CASO
                                                                          // QUE LA CONDICION ANTERIOR SE CUMPLA
                    } else {
                        String nombreGanador = ganador(equipo1, puntosEq1, equipo2, puntosEq2);
                        System.out.println("EL EQUIPO GANADOR ES: " + nombreGanador);
                    }
                    break;
                case 4:
                    System.out.println("HAZ SALIDO DEL MENU");

                    break;

                default:// sigue funcionando si el usuario elige un número fuera del rango
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;

            }

        } while (opcionMenu != 4);
        scFutbol.close();

    }

}
