
package ejerciciosSwitchCase;

import java.util.Scanner;


public class ejercicio55 {
    
        double total = 0;
        int opcion;
    public void ingresarDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("️ Bienvenido al Restaurante ️");
        System.out.println("Seleccione los productos que desea ordenar:");

        do {
            System.out.println("\n Menú:");
            System.out.println("1. Hamburguesa - $8.00");
            System.out.println("2. Pizza - $10.00");
            System.out.println("3. Ensalada - $7.00");
            System.out.println("4. Refresco - $3.00");
            System.out.println("5. Café - $2.50");
            System.out.println("6. Finalizar pedido");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    total += 8.00;
                    System.out.println(" Has agregado una Hamburguesa.");
                    break;
                case 2:
                    total += 10.00;
                    System.out.println(" Has agregado una Pizza.");
                    break;
                case 3:
                    total += 7.00;
                    System.out.println(" Has agregado una Ensalada.");
                    break;
                case 4:
                    total += 3.00;
                    System.out.println(" Has agregado un Refresco.");
                    break;
                case 5:
                    total += 2.50;
                    System.out.println(" Has agregado un Café.");
                    break;
                case 6:
                    System.out.println(" Finalizando pedido...");
                    break;
                default:
                    System.out.println(" Opción inválida. Intente de nuevo.");
            }

            System.out.println("🧾 Total actual: $" + total);

        } while (opcion != 6);

        // Aplicar descuento según método de pago
        System.out.println("\nSeleccione su método de pago:");
        System.out.println("1. Efectivo (10% de descuento)");
        System.out.println("2. Tarjeta de crédito (5% de descuento)");
        System.out.println("3. Cheque (sin descuento)");
        System.out.print("Ingrese su opción: ");
        int metodoPago = scanner.nextInt();

        switch (metodoPago) {
            case 1:
                total *= 0.90; // Aplica 10% de descuento
                System.out.println(" Pago en efectivo. Se aplica un 10% de descuento.");
                break;
            case 2:
                total *= 0.95; // Aplica 5% de descuento
                System.out.println(" Pago con tarjeta. Se aplica un 5% de descuento.");
                break;
            case 3:
                System.out.println(" Pago con cheque. No se aplica descuento.");
                break;
            default:
                System.out.println(" Método inválido. No se aplicará descuento.");
        }

        // Mostrar total final
        System.out.printf("\n Total a pagar: $%.2f%n", total);
        System.out.println("️ ¡Gracias por su compra!");

}
}
