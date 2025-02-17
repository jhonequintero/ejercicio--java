
package ejerciciosIfElse;

import java.util.Scanner;
        
public class ejercicio5 {
    
    int temperatura;
    public void ingresarDatos(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("ingrese la temperatura actual ");
        temperatura=entrada.nextInt();
        if (temperatura <25 && temperatura > 18 ){
        System.out.println("aceptable , la temperatura esta en el rango adecuado ");
        }
        else{
                System.out.println("alerta, temperatura incorrecta ");

                }
    }
}
