
package ejerciciosSwitchCase;

import java.util.Scanner;

public class ejercicio44 {
        int puntosEquipo = 0;
        String opcion;
    public  void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de Clasificación del Campeonato");
        System.out.println("Ingrese el resultado del partido:");
        System.out.println("(G) Ganado | (E) Empatado | (P) Perdido | (S) Salir");

        do {
            System.out.print("Resultado: ");
            opcion = scanner.next().toUpperCase();

            switch (opcion) {
                case "G":
                    puntosEquipo += 3;
                    System.out.println("Partido ganado. Se suman 3 puntos.");
                    break;
                case "E":
                    puntosEquipo += 1;
                    System.out.println("Partido empatado. Se suma 1 punto.");
                    break;
                case "P":
                    System.out.println("Partido perdido. No se suman puntos.");
                    break;
                case "S":
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

            System.out.println("Puntos actuales del equipo: " + puntosEquipo);
        } while (!opcion.equals("S"));

        System.out.println("Clasificación final del equipo: " + puntosEquipo + " puntos.");
    }
}
