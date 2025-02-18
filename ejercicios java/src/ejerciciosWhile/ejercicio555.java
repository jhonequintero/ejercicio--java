
package ejerciciosWhile;

import java.util.Scanner;


public class ejercicio555 {
         int numero;

    public void ingresarDatos(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("cuenta regresiva");
        System.out.println("ingresar el numero al que le quieres hacer cuenta regresiva");
        numero=entrada.nextInt();
        while (numero>0){
            numero-=1;
            System.out.println(numero);

        }
        
        
        
    }
    
}
