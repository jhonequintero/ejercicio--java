
package ejerciciosIfElse;

import java.util.Scanner;

public class ejercicio2 {
    private String nombreCliente;
    private String nombreProducto;
    private int cantidadProductos;
    private double precioUnitario;
    private double descuento;
    private double precioFinal;

    public void tomarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenidos");
        System.out.println("Por favor, ingrese su nombre completo:");
        nombreCliente = scanner.nextLine();
        System.out.println("Por favor, ingrese el nombre del producto:");
        nombreProducto = scanner.nextLine();
        System.out.println("Por favor, ingrese la cantidad de productos:");
        cantidadProductos = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor, ingrese el precio unitario:");
        precioUnitario = Double.parseDouble(scanner.nextLine());
        System.out.println("¿Eres estudiante? (si/no):");
        String respuesta = scanner.nextLine();

        double subTotal = subTotal();
        
        if (respuesta.equalsIgnoreCase("si")) {
            descuento = subTotal * 0.13;
        } else {
            descuento = subTotal * 0.05;
        }
        precioFinal = subTotal - descuento;

        System.out.println("Gracias. Su descuento fue de: $" + descuento);
        
        System.out.println("Seleccione qué tipo de cliente eres:");
        System.out.println("A) Cliente mayoritario");
        System.out.println("B) Cliente minoritario");
        System.out.println("C) Cliente nuevo");
        String opcion = scanner.nextLine();

        switch (opcion.toUpperCase()) {
            case "A":
                System.out.println("Eres un cliente mayoritario. Gracias");
                break;
            case "B":
                System.out.println("Eres un cliente minoritario. Gracias");
                break;
            case "C":
                System.out.println("Eres un cliente nuevo. Gracias");
                break;
            default:
                System.out.println("Opción inválida...");
        }
        
    }

    public double subTotal() {
        return cantidadProductos * precioUnitario;
    }

    public void mostrarFactura() {
        System.out.println("Factura para: " + nombreCliente);
        System.out.println("Nombre del Producto: " + nombreProducto);
        System.out.println("Cantidad de productos: " + cantidadProductos);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Subtotal a pagar: $" + subTotal());
        System.out.println("Total a pagar después del descuento: $" + precioFinal);
    }
}


