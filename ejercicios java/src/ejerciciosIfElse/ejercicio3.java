
package ejerciciosIfElse;

import java.util.Scanner;


public class ejercicio3 {
    int piso;
    int rango=10;

    public void ingresardatos(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Bienvenidos al edifio quintero ");
        System.out.println("limite de 10 pisos ");
        System.out.println(" por favor ingresar el numero del piso al que deseas visitar");
        piso=entrada.nextInt();
        if (piso==1){
            System.out.println("has visitado el primer piso");
        }
        else if(piso==2) {
           System.out.println("has visitado el segundo piso");
        }
        else if(piso==3) {
           System.out.println("has visitado el tercer piso");
        }
        else if(piso==4) {
           System.out.println("has visitado el cuarto piso");
        }
        else if(piso==5) {
           System.out.println("has visitado el quinto piso");
        }
        else if(piso==6) {
           System.out.println("has visitado el sexto piso");
        }
        else if(piso==7) {
           System.out.println("has visitado el septimo piso");
        }
        else if(piso==8) {
           System.out.println("has visitado el octavo piso");
        }
        else if(piso==9) {
           System.out.println("has visitado el noveno piso");
        }
        else if(piso==10) {
           System.out.println("has visitado el decimo piso");
        }
        else{
            System.out.println("opcion invalidad piso incorrecto");
        }
        
        
        
    }
    
}
