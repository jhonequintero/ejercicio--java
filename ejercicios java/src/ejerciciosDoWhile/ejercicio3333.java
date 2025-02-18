
package ejerciciosDoWhile;

import java.util.Scanner;


public class ejercicio3333 {
    int temperatura;
    public void ingresarDatos(){
        Scanner entrada= new Scanner(System.in);
          do {
            System.out.println("Ingresar la temperatura actual (entre 18 y 25 grados): ");
            temperatura = entrada.nextInt();

            if (temperatura < 18 || temperatura > 25) {
                System.out.println(" Alerta: Temperatura fuera del rango permitido. Intenta nuevamente.");
            }
            
        } while (temperatura < 18 || temperatura > 25);
        
        System.out.println(" Correcto, temperatura estable.");
      
    }
    
}