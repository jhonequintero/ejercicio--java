
package ejerciciosDoWhile;

import java.util.Scanner;


public class ejercicio1111 {
    String titulo;
    String autor;
    int numeroPaginas;
    String acumulador="";
    String continuar;
    public void ingresatDatos(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("biblioteca informacion quintero");
        
        
        do {
            System.out.println("ingresar el titulo de libro");
            titulo=entrada.nextLine();
            System.out.println("ingresa el nombre del autor ");
            autor=entrada.nextLine();
            System.out.println("ingresa el numero de paginas ");
            numeroPaginas= entrada.nextInt();
            entrada.nextLine();
            
            acumulador += "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + "\n";
            System.out.println("informacion  actual  ");
            System.out.println("titulo: " + titulo);
            System.out.println("auto:r " + autor);
            System.out.println("numero paginas: "+ numeroPaginas);
            
            System.out.println("deseas agregas mas informacion  (si / no )");
            continuar=entrada.nextLine();
            
            
        }while(continuar.equalsIgnoreCase("si"));
         System.out.println("informacion final ");
           System.out.println(acumulador );
        
    }
    
}
