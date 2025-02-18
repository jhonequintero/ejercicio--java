
package ejerciciosDoWhile;

import java.util.Scanner;


public class ejercicio5555 {
     String titulo;
    String autor;
    String acumulador="";
    String continuar;
    public void ingresatDatos(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("gestion de tareas  quintero");
        
        
        do {
            System.out.println("ingresar la descripcion de tarea a guardar ");
            titulo=entrada.nextLine();
            System.out.println("ingresa la fecha de vencimiento de  "+ titulo);
            autor=entrada.nextLine();
            
            
            acumulador += "descripcion de tarea: " + titulo + ", fecha de vencimiento: " + autor  + "\n";
            System.out.println("informacion  actual  ");
            System.out.println("descripcion de tarea: " + titulo);
            System.out.println("fecha de vencimiento: " + autor);
            
            System.out.println("deseas agregas mas informacion  (si / no )");
            continuar=entrada.nextLine();
            
            
        }while(continuar.equalsIgnoreCase("si"));
         System.out.println("informacion final ");
           System.out.println(acumulador );
        
    }
    
}
