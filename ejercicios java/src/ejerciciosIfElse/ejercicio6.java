
package ejerciciosIfElse;

import java.util.Scanner;


public class ejercicio6 {
    int temperatura;
    int umbralAlerta=50;
    public void ingresarDatos(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("ingrese la temperatura actual ");
        temperatura=entrada.nextInt();
        if (temperatura< umbralAlerta){
            System.out.println("aceptable , temperatura normal");
        }
        else{
            System.out.println("alerta , umbral por encima de la temperatura");
        }
        
        
    }
    
}