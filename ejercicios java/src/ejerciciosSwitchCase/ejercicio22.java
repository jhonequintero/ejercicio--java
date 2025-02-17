package ejerciciosSwitchCase;

import java.util.Scanner;

public class ejercicio22 {

    public void ingresarDatos() {
        Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese su peso en kg: ");
            double peso = entrada.nextDouble();
            System.out.print("Ingrese su altura en metros  es con (,) o normal ");
            double altura = entrada.nextDouble();

            double imc = peso / (altura * altura);
            int imcCategoria = (int) Math.floor(imc); // Redondeamos hacia abajo

            System.out.printf("su imc es:"+ imc);

            switch (imcCategoria) {
                case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18:
                    System.out.println("Categoría: Bajo peso");
                    break;
                case 19, 20, 21, 22, 23, 24:
                    System.out.println("Categoría: Peso normal");
                    break;
                case 25, 26, 27, 28, 29:
                    System.out.println("Categoría: Sobrepeso");
                    break;
                default:
                    System.out.println("Categoría: Obesidad");
                    break;
        } 
    }
}
