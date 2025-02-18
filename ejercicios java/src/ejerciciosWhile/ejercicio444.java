
package ejerciciosWhile;

import java.util.Scanner;



public class ejercicio444 {
    int distancia;
    int velocidad;
    int tiempo=0;
    int continuar=0;
    int distanciaRecorrida;
    public void ingresarDatos(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Viaje de turismo");
        while(continuar==0){
            System.out.println("ingresar la distancia total del viajes ");
            distancia=entrada.nextInt();
            System.out.println("ingresar la velocidad promedio del coche ");
            velocidad=entrada.nextInt();
            tiempo+=distancia/velocidad;
            distanciaRecorrida=distancia/velocidad;
            System.out.println("tiempo del viaje "+ distanciaRecorrida + " horas" );
            
            
            System.out.println("deseas hacer otro viajes? ( si=0 / no=1 ) ");
            continuar=entrada.nextInt();
        }
        System.out.println("tiempoo usado en total con todos los viajes "+ tiempo + " horas");
            
            

            
        }
    }
    

