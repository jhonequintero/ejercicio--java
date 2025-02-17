
package ejerciciosWhile;

import java.util.Scanner;


public class ejercicio222 {
    int precioProducto;
    int cantidadProducto;
    int continuar=0;
    int total=0;
    public void ingresarDatos (){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Tienda en linea quintero");
        while(continuar==0){
            System.out.println("ingresar el precio de un producto que desees");
            precioProducto=entrada.nextInt();
            System.out.println("ingresar la cantidad de producto que deseas comprar");
            cantidadProducto=entrada.nextInt();
            total += precioProducto*cantidadProducto;
            
            System.out.println("deseas agregar mas productos ( si=0 / no=1 ");
            continuar=entrada.nextInt();
          
        }
        System.out.println("el costo total de la compra fue de un: $"+ total + " dolares ");
    }
    
    
    
    
}
