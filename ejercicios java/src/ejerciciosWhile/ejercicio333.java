
package ejerciciosWhile;


import java.util.Scanner;

public class ejercicio333 {
    int cantidadPaginas = 1000;
    int cantidad;
    int continuar=0;
    

    public void ingresarDatos() {
        Scanner entrada = new Scanner(System.in);

        while (continuar == 0) {
            System.out.println("impresora Automático Quintero");
            System.out.println("papel disponible $" + cantidadPaginas);
            System.out.println("ingrese la cantidad de paginas que deseas imprimir");
            
            cantidad = entrada.nextInt();

            if (cantidad > 0 && cantidad <= cantidadPaginas) {
                cantidadPaginas -= cantidad;
                System.out.println("impresion exitosa. Has imprimido: $" + cantidad + " hojas de papel.");
                System.out.println("pepel restante: $" + cantidadPaginas + " hojas de papel");
            } else {
                System.out.println("Opción inválida. papel insuficiente  .");
            }

            System.out.print("¿Desea imprimir  más papel? (Sí=0 / No=1): ");
            continuar = entrada.nextInt();
        }
        
        System.out.println("Gracias por usar la impresora  Automática Quintero.");
        System.out.println("tu papel  restante es de : "+ cantidadPaginas + "  hojas de papel");
    }

}
