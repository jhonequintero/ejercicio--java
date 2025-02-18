
package ejerciciosDoWhile;

import java.util.Scanner;


public class ejercicio2222 {
      double total = 0;
        int opcion;
    public void ingresarDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("️ Bienvenido al Restaurante ️");
        System.out.println("Seleccione los productos que desea ordenar:");

        do {
            System.out.println("\n Menú:");
            System.out.println("1. Hamburguesa - $8.00");
            System.out.println("2. Pizza - $10.00");
            System.out.println("3. Ensalada - $7.00");
            System.out.println("4. Refresco - $3.00");
            System.out.println("5. cafe - $2.50");
            System.out.println("6. perro caliente - $12.50");
            System.out.println("7. salchipapa - $9.50");
            System.out.println("8. te - $3.50");
            System.out.println("9. Finalizar pedido");
            System.out.print("Ingrese su opción: ");
            opcion = entrada.nextInt();

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
                    total +=12.50;
                    System.out.println("  Has agregado un perro caliente.");
                    break;
                case 7:
                    total += 9.50;
                    System.out.println("  Has agregado una salchipapa");
                    break;
                case 8:
                    total += 3.50;
                    System.out.println("  Has agregado un te.");
                    break;
                case 9:
                    System.out.println(" Finalizando pedido...");
                    break;
                default:
                    System.out.println(" Opción inválida. Intente de nuevo.");
            }

            System.out.println(" Total actual: $" + total);

        } while (opcion != 9);
        System.out.printf("\n Total a pagar: $" + total);
        System.out.println("️ ¡Gracias por su compra!");
    
    
}
}