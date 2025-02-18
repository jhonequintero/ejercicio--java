
package ejerciciosFor;

import java.util.Scanner;


public class ejercicio44444 {
    int listadoNumeros;
    int numero;
    int i;
    int acumulador=0;
    public void ingresarDatos(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("ingresar la cantidad de veces que quiere que se repita el listado");
        listadoNumeros=entrada.nextInt();
        entrada.nextLine();
        for (i=1 ; i<= listadoNumeros; i++){
            System.out.println("ingresar el numero " + i + ":");
            numero=entrada.nextInt();
            acumulador += numero;
        }
        System.out.println("suma de listado de numeros ");
        System.out.println("resultado: " + acumulador );
        
    }
    
}
