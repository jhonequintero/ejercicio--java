
package ejerciciosSwitchCase;

import java.util.Scanner;


public class ejercicio33 {
    int edad;
    
    public void ingresarDatos(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresar su edad ");
        edad=entrada.nextInt();
        switch (edad){
            case 0, 1, 2, 3, 4, 5, 6, 7:
                    System.out.println("Puedes ver peliculas educativas y animadas");
                    break;
            case 8, 9, 10, 11, 12, 13, 14, 15, 16, 17:
                    System.out.println("Puedes ver peliculas de animacion , aventuras , comdeia familiares");
                    break;
            case  18,19,20,21,22,23,24,25, 26, 27, 28, 29,30:
                    System.out.println("Puedes ver peliculas de drama , accion , comedia , ciencia ficcion");
                    break;
            default:
                    System.out.println("Puedes ver  peliculas clasicas y de dramas");
            
        }
        
    }
    
}
