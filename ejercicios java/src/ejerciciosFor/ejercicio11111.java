
package ejerciciosFor;

import java.util.Scanner;


public class ejercicio11111 {
    int numVehiculos;
    String placaVehiculo;
    String hora;
    String acumulador = "";

    public void ingresarDatos() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de carros que ingresaron al parqueadero: ");
        numVehiculos = entrada.nextInt();
        entrada.nextLine(); 
        for (int i = 1; i <= numVehiculos; i++) {
            System.out.print("Ingrese la placa del vehículo " + i + ": ");
            placaVehiculo = entrada.nextLine();

            System.out.print("Ingrese la hora de ingreso del vehículo " + i + ": ");
            hora = entrada.nextLine();

            acumulador += "Vehículo " + i + " | Placa: " + placaVehiculo + " | Hora: " + hora + "\n";
        }

        System.out.println("\n--- Información del parqueadero ---");
        System.out.println(acumulador);
            
    }
   
}
