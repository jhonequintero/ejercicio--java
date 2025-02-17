package ejerciciosWhile;

import java.util.Scanner;

public class ejercicio111 {
    int saldoDisponible = 600;
    int continuar = 0;
    int monto;

    public void ingresarDatos() {
        Scanner entrada = new Scanner(System.in);

        while (continuar == 0) {
            System.out.println("Cajero Automático Quintero");
            System.out.println("Cuenta con un saldo de $" + saldoDisponible + " dólares en su cuenta actual.");
            System.out.print("Por favor, ingrese el monto que desea retirar: ");
            
            monto = entrada.nextInt();

            if (monto > 0 && monto <= saldoDisponible) {
                saldoDisponible -= monto;
                System.out.println("Retiro exitoso. Ha retirado: $" + monto + " dólares.");
                System.out.println("Saldo restante: $" + saldoDisponible);
            } else {
                System.out.println("Opción inválida. Saldo insuficiente o monto no válido.");
            }

            System.out.print("¿Desea retirar más? (Sí=0 / No=1): ");
            continuar = entrada.nextInt();
        }
        
        System.out.println("Gracias por usar el Cajero Automático Quintero.");
        System.out.println("tu saldo restante fue de un: "+ saldoDisponible);
    }

}
