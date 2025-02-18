
package ejerciciosDoWhile;

import java.util.Scanner;


public class ejercicio4444 {
     double resultado;
    int acumulador=0;
    String continuar;
    double promedio;
    int contador=0;
    int cantidad;
    public void ingresatDatos(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("gestion de resultado de examenes   quintero");
        System.out.println("ingresar la cantidad de resultados de tus examenes  ");
        cantidad=entrada.nextInt();
        do {
            System.out.print("Ingrese el resultado numero: " + (contador + 1) + ": ");
            resultado = entrada.nextDouble();
            acumulador += resultado;
            contador++;
        } while (contador < cantidad);
   
        promedio = acumulador / cantidad;
        System.out.println("El promedio es: " + promedio);
        
    }
    
}
