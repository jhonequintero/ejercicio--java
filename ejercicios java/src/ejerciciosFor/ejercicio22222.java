
package ejerciciosFor;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio22222 {
    double total;
    int cantidad;
    int i;
    double precio;
    String nombre;
    
    
    public void ingresarDatos(){
       Scanner entrada = new Scanner(System.in);
        ArrayList<String> productos = new ArrayList<>();// lista productos
        total = 0;

        System.out.print("Ingrese la cantidad de productos a comprar: ");
        cantidad = entrada.nextInt();
        entrada.nextLine(); 

        for ( i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el nombre del producto " + i + ": ");
             nombre = entrada.nextLine();

            System.out.print("Ingrese el precio de " + nombre + ": ");
            precio = entrada.nextDouble();
            entrada.nextLine(); 

            productos.add(nombre + " - $" + precio);
            total += precio; 
        }

        System.out.println("\n Carrito de Compras:");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }
        System.out.println(" Total a pagar: $" + total);

        
        
    }
    
}
