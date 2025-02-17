
package ejerciciosIfElse;

import java.util.Scanner;


public class ejercicio7 {
    int piso;
    int temperatura=70;
    int rangoAceptable=100;

    public void ingresardatos(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Bienvenidos al edifio quintero ");
        System.out.println("limite de 10 pisos y  con limitee de 100 grados de temperatura   ");
        System.out.println(" por favor ingresar la temperatura actual ");
        temperatura=entrada.nextInt();
        System.out.println(" por favor ingresar el numero del piso al que deseas visitar");
        piso=entrada.nextInt();
        if (temperatura <  rangoAceptable){
            System.out.println("La temperatura esta  correctaa puedes ingresar al acensor");
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


        }else {
            System.out.println("alerta , temperatura por encima del rango aceptable no puedes ingresar al acensor ");
        }
        
        
        
    }
    
}