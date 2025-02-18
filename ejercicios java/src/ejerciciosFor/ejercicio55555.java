
package ejerciciosFor;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio55555 {
    int ventaProductos;
    String nombre;
    int precio;
    int cantidad;
    int acumulador;
    int i;
    public void  ingresarDatos(){
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("ingrese la cantidad de veces a comprar ");
        ventaProductos= entrada.nextInt();
        entrada.nextLine();
        for (i=1 ; i<= ventaProductos ; i++){
            System.out.println("ingrese el nombre del producto  " + i + ":");
            nombre=entrada.nextLine();
            System.out.println("ingrese el precio de " + nombre);
            precio=entrada.nextInt();
            entrada.nextLine();
            System.out.println("ingrese la cantidad vendida ");
            cantidad=entrada.nextInt();
            entrada.nextLine();
            acumulador += precio * cantidad;
            lista.add("-" + nombre);
            
        }
        
        System.out.println("\n listado de productos vendidos ");
        for (String producto : lista ){
            System.out.println("- "+ producto);
        }
            
        System.out.println("listado de productos vendidos \n ");
        System.out.println(lista);
        System.out.println("su total de ventas fue: ");
        System.out.println(acumulador);
        
        
    }
    
}
