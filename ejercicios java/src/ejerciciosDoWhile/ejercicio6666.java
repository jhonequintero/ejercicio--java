
package ejerciciosDoWhile;

import java.util.Scanner;


public class ejercicio6666 {
     String producto;
    int precio;
    String acumulador="";
    int acumuladorPrecio=0;
    String continuar;
    public void ingresatDatos(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("gestion de registro de ventas  quintero");
        
        
        do {
            System.out.println("ingresar los prodcutos vendidos ");
            producto=entrada.nextLine();
            System.out.println("ingresa el precio de los productos");
            precio=entrada.nextInt();
            entrada.nextLine();
            
            acumuladorPrecio += precio;
            acumulador += "producto: " + producto + ",  precio: " + precio  + "\n";
            System.out.println("informacion  actual  ");
            System.out.println("producto: " + producto);
            System.out.println("precio: " + precio);
            
            System.out.println("deseas agregas mas informacion  (si / no )");
            continuar=entrada.nextLine();
            
            
        }while(continuar.equalsIgnoreCase("si"));
        
         System.out.println("informacion final ");
         System.out.println("info de los produtos: ");
         System.out.println(acumulador);
         System.out.println("total de los precios a pagar: ");
         System.out.println(acumuladorPrecio);
           
        
    }
    
}
