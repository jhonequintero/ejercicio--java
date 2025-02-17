
package ejerciciosIfElse;

public class ejercicio1 {
    private String cliente;
    private String producto;
    private int cantidad;
    private double precioUnitario;

    public ejercicio1(String cliente, String producto, int cantidad, double precioUnitario) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarFactura() {
        System.out.println("Factura para: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total a pagar: $" + calcularTotal());
    }
}


