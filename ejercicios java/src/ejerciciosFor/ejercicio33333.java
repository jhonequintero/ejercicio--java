
package ejerciciosFor;

import java.util.ArrayList;
import java.util.Scanner;


public class ejercicio33333 {
    int agregarContactos;
    String nombre;
    int telefono;
    int i;
    public void ingresarDatos(){
        Scanner entrada = new Scanner(System.in); 
        ArrayList<String> listaContactos =  new ArrayList<>();
        
        System.out.println("cuantos contactos deseas guardar"); 
        agregarContactos= entrada.nextInt();
        entrada.nextLine();
        
         for ( i = 1; i <= agregarContactos; i++) {
            System.out.print("Ingrese el nombre  " + i + ": ");
            nombre = entrada.nextLine();
            System.out.println("ingresar el telefono de "+ nombre);
            telefono=entrada.nextInt();
            entrada.nextLine();

             listaContactos.add(nombre + " - "+ telefono);

        }
       
        System.out.println("informacion agenda final");
          for (String contacto : listaContactos) {
            System.out.println("- " + contacto);
        }
            
     
        
    }
}
