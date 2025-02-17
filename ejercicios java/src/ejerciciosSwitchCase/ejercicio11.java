
package ejerciciosSwitchCase;

import java.util.Scanner;


public class ejercicio11 {
    String tipoProducto;
    int cantidadUnidades;
    int precioA=100;
    int precioB=50;
    int precioC=30;
    double costoTotal;
    double descuento= 0.0;
    double  total;
    
    public void ingresarDatos(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("tienda virtual");
        System.out.println("tengo 3 tipos de producto de venta ");
        System.out.println("A) alimentos ");
        System.out.println("V) vestimenta ");
        System.out.println("E) electronicos");
        System.out.println("ingresar la letra  del tipo de productos que deseas comprar segun el menu  ");
        tipoProducto=entrada.nextLine();
        System.out.println("ingresar la cantidad de unidades que deseas llevar ");
        cantidadUnidades=entrada.nextInt();
        switch (tipoProducto.toUpperCase()){
            case "A":
                System.out.println("selecionaste el producto de alimentos ");
                System.out.println("obtienes un 10% de descuento ");
                costoTotal= precioA* cantidadUnidades;
                descuento=costoTotal*0.10;
                total=costoTotal-descuento;
                System.out.println("costo total de la compra  sin descuento fue de: $"+ costoTotal + " dolares") ;
                System.out.println("costo total de la compra con descuento fue de: $"+ total + " dolares");
                break;
            case "V":
                System.out.println("selecionaste el producto de vestimenta ");
                System.out.println("obtienes un 5% de descuento ");
                costoTotal= precioA* cantidadUnidades;
                descuento=costoTotal*0.05;
                total=costoTotal-descuento;
                System.out.println("costo total de la compra  sin descuento fue de: $"+ costoTotal + " dolares") ;
                System.out.println("costo total de la compra con descuento fue de: $"+ total + " dolares");
                break;
            case "E":
                System.out.println("selecionaste el producto de electronicos ");
                System.out.println("no obtienes  descuento ");
                costoTotal= precioA* cantidadUnidades;
                System.out.println("costo total de la compra   fue de: $"+ costoTotal + " dolares") ;
                break;
            default:
                System.out.println("opcion invalidadd.....");
                
                
                
                
                   
        }
        
    }
    
}
