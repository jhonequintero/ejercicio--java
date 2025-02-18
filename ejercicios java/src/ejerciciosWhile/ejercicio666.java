
package ejerciciosWhile;
import java.util.Scanner;
import java.util.Random;

public class ejercicio666 {
        int numeroSecreto;
        int intento=0;
        String continuar; 
        
    public void ingresarDatos(){
        Scanner scanner = new Scanner(System.in);
        Random numAdivinar = new Random();

        // Generar número aleatorio al inicio
        numeroSecreto = numAdivinar.nextInt(100) + 1;
        System.out.println("Adivina el número entre 1 y 100.");

        do {
            System.out.print("Ingresa tu número: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("🔼 El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("🔽 El número es menor.");
            } else {
                System.out.println(" ¡Felicidades! Adivinaste el número " + numeroSecreto + "!");
                // Si adivina, se genera un nuevo número para la siguiente partida
                numeroSecreto = numAdivinar.nextInt(100) + 1;
            }

            System.out.print("¿Quieres seguir jugando? (si / no): ");
            continuar = scanner.next();
            
        } while (continuar.equalsIgnoreCase("si"));

        System.out.println(" ¡Gracias por jugar!");
    }
}
    
    

