
package ejecutadorCondicionales;

import java.util.Scanner;
import ejerciciosIfElse.ejercicio1;
import ejerciciosIfElse.ejercicio2;
import ejerciciosIfElse.ejercicio3;
import ejerciciosIfElse.ejercicio4;
import ejerciciosIfElse.ejercicio5;
import ejerciciosIfElse.ejercicio6;
import ejerciciosIfElse.ejercicio7;
import ejerciciosSwitchCase.ejercicio11;
import ejerciciosSwitchCase.ejercicio22;
import ejerciciosSwitchCase.ejercicio33;
import ejerciciosSwitchCase.ejercicio44;
import ejerciciosSwitchCase.ejercicio55;
import ejerciciosWhile.ejercicio111;
import ejerciciosWhile.ejercicio222;
import ejerciciosWhile.ejercicio333;
import ejerciciosWhile.ejercicio444;
import ejerciciosWhile.ejercicio555;
import ejerciciosWhile.ejercicio666;
import ejerciciosDoWhile.ejercicio1111;
import ejerciciosDoWhile.ejercicio2222;
import ejerciciosDoWhile.ejercicio3333;
import ejerciciosDoWhile.ejercicio4444;
import ejerciciosDoWhile.ejercicio5555;
import ejerciciosDoWhile.ejercicio6666;
import ejerciciosFor.ejercicio11111;
import  ejerciciosFor.ejercicio22222;
import ejerciciosFor.ejercicio33333;
import ejerciciosFor.ejercicio44444;
import ejerciciosFor.ejercicio55555;

public class  EjecutadorPrincipal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcionWhile;
        int opcionSwhitchCase;
        int opc1;
        int opc2;
        int opc3;
        int opc4;
        int opc5;
        String repetirIfElse;
        String repetirSwitchCase;
        String repetirWhile;
        String repetirDoWhile;
        String repetirFor;
        

        do {
            System.out.println("Bienvenidos al programa Quintero");
            System.out.println("Menú de ejercicios de condicionales");
            System.out.println("1) Ejercicios del condicional if - else");
            System.out.println("2) Ejercicios del condicional Switch - case");
            System.out.println("3) Ejercicios del condicional while");
            System.out.println("4) Ejercicios del condicional do - while");
            System.out.println("5) Ejercicios del condicional for");
            System.out.print("Por favor ingrese el número del condicional que desea visitar: ");
            opcionSwhitchCase = entrada.nextInt();
            entrada.nextLine(); // 🔴 LIMPIAR BUFFER DESPUÉS DE nextInt()

            switch (opcionSwhitchCase) {
                case 1:
                    do {
                        System.out.println("Bienvenido a los ejercicios del condicional if - else");
                        System.out.println("Cuento con 7 ejercicios en total");
                        System.out.println("1) Simulación de factura");
                        System.out.println("2) Factura con valores asignados");
                        System.out.println("3) Simulación de un ascensor");
                        System.out.println("4) Simulación de límite de peso en ascensor");
                        System.out.println("5) Simulación de temperatura");
                        System.out.println("6) Simulación de umbral de alerta");
                        System.out.println("7) Combinación de simulaciones");
                        System.out.print("Ingrese el número del ejercicio que desea ejecutar: ");

                        opc1 = entrada.nextInt();
                        entrada.nextLine(); // 🔴 LIMPIAR BUFFER DESPUÉS DE nextInt()

                        switch (opc1) {
                            case 1:
                                System.out.println("Bienvenido al Ejercicio 1: Simulación de factura");
                                ejercicio1 objFactura1 = new ejercicio1("jhoneider quintero", "Laptop", 2, 750.50);
                                objFactura1.mostrarFactura();
                                break;
                            case 2:
                                System.out.println("Bienvenidos al Ejercicio 2: Factura con valores asignados");
                                // Llamar a métodos y crear objeto
                                ejercicio2 objFactura = new ejercicio2();
                                objFactura.tomarDatos();
                                objFactura.mostrarFactura();
                                break;
                            case 3:
                                System.out.println("Bienvenido al Ejercicio 3: Simulación de un ascensor");
                                ejercicio3 objPiso= new ejercicio3();
                                objPiso.ingresardatos();
                                break;
                            case 4:
                                System.out.println("Bienvenido al Ejercicio 4: Simulación de límite de peso en ascensor");
                                ejercicio4 objAcensor= new ejercicio4();
                                objAcensor.ingresardatos();
                                
                                break;
                            case 5:
                                System.out.println("Bienvenido al Ejercicio 5: Simulación de temperatura");
                                ejercicio5 objTemperatura = new ejercicio5();
                                objTemperatura.ingresarDatos();
                                break;
                            case 6:
                                System.out.println("Bienvenido al Ejercicio 6: Simulación de umbral de alerta");
                                ejercicio6  objUmbral = new ejercicio6();
                                objUmbral.ingresarDatos();
                                break;
                            case 7:
                                System.out.println("Bienvenido al Ejercicio 7: Combinación de simulaciones");
                                ejercicio7 objCombinacion= new ejercicio7();
                                objCombinacion.ingresardatos();
                                break;
                            default:
                                System.out.println("Opción inválida...");
                        }

                        System.out.print("¿Deseas ejecutar otro ejercicio del if - else? ( SI ): ");
                        repetirIfElse = entrada.nextLine();
                    } while (repetirIfElse.equalsIgnoreCase("si")); // 🔴 NO SALE DEL BUCLE HASTA QUE INGRESE "no"

                    break;

                case 2:
                    do {
                        System.out.println("Bienvenido a los ejercicios del condicional Switch - case");
                        System.out.println("Cuento con 5 ejercicios en total");
                        System.out.println("1) simulacion de tiendaa virtual");
                        System.out.println("2) simulacion de  un asistente de un nutricionista ");
                        System.out.println("3) simulacion de un asistente virtual para un cine ");
                        System.out.println("4 simulacion de sistema de clasificación para un campeonato deportivo) ");
                        System.out.println("5) simulacion de un menú de restaurante");
                        System.out.print("Ingrese el número del ejercicio que desea ejecutar: ");

                        opc2 = entrada.nextInt();
                        entrada.nextLine(); // 🔴 LIMPIAR BUFFER DESPUÉS DE nextInt()

                        switch (opc2) {
                            case 1:
                                System.out.println("Bienvenido al Ejercicio 1: simulacion de tiendaa virtual");
                                ejercicio11 objTienda= new ejercicio11();
                                objTienda.ingresarDatos();
                                break;
                            case 2:
                                System.out.println(" Bienvenido al Ejercicio 2: simulacion de  un asistente de un nutricionista ");
                                ejercicio22 objNutricionista= new ejercicio22();
                                objNutricionista.ingresarDatos();
                                
                                break;
                            case 3:
                                System.out.println("Bienvenido al Ejercicio 3: simulacion de un asistente virtual para un cine");
                                ejercicio33 objAsistente= new ejercicio33();
                                objAsistente.ingresarDatos();
                                break;
                            case 4:
                                System.out.println("Bienvenido al Ejercicio 4: simulacion de sistema de clasificación para un campeonato deportivo");
                                ejercicio44 objResultado= new ejercicio44();
                                objResultado.ingresarDatos();
                                
                                break;
                            case 5:
                                System.out.println("Bienvenido al Ejercicio 5: simulacion de un menú de restaurante");
                                ejercicio55 objMenu = new ejercicio55();
                                objMenu.ingresarDatos();
                                
                                break;
                           
                            default:
                                System.out.println("Opción inválida...");
                        }

                        System.out.print("¿Deseas ejecutar otro ejercicio del Switch Case? ( SI ): ");
                        repetirSwitchCase = entrada.nextLine();
                    } while (repetirSwitchCase.equalsIgnoreCase("si")); // 🔴 NO SALE DEL BUCLE HASTA QUE INGRESE "no"

                    break;
                case 3:
                    do {
                        System.out.println("Bienvenido a los ejercicios del condicional while");
                        System.out.println("Cuento con 6 ejercicios en total");
                        System.out.println("1) simulacion de  un cajero automático. ");
                        System.out.println("2) simulacion de una compra en una tienda en línea ");
                        System.out.println("3) simulacion de un  funcionamiento de una impresora.");
                        System.out.println("4) simalacion de   un viaje en coche.");
                        System.out.println("5)  simualacion de  una cuenta regresiva.");
                        System.out.println("6) simulacion de un  juego simple de adivinanza ");
                        System.out.print("Ingrese el número del ejercicio que desea ejecutar: ");

                        opc3 = entrada.nextInt();
                        entrada.nextLine(); // 🔴 LIMPIAR BUFFER DESPUÉS DE nextInt()

                        switch (opc3) {
                            case 1:
                                System.out.println("Bienvenido al Ejercicio 1: simulacion de  un cajero automático.");
                                ejercicio111 objCajero = new ejercicio111();
                                objCajero.ingresarDatos();
                                break;
                            case 2:
                                System.out.println("Bienvenidos al Ejercicio 2: simulacion de una compra en una tienda en línea");
                                ejercicio222 objTienda= new ejercicio222();
                                objTienda.ingresarDatos();
                                break;
                            case 3:
                                System.out.println("Bienvenido al Ejercicio 3: simulacion de un  funcionamiento de una impresora.");
                                ejercicio333 objImpresora = new ejercicio333();
                                objImpresora.ingresarDatos();
                                break;
                            case 4:
                                System.out.println("Bienvenido al Ejercicio 4: simalacion de   un viaje en coche.");
                                ejercicio444 objCarro = new ejercicio444();
                                objCarro.ingresarDatos();
                                break;
                            case 5:
                                System.out.println("Bienvenido al Ejercicio 5: simualacion de  una cuenta regresiva");
                                ejercicio555 objCuenta= new ejercicio555();
                                objCuenta.ingresarDatos();
                                break;
                            case 6:
                                System.out.println("Bienvenido al Ejercicio 6: simulacion de un  juego simple de adivinanza");
                                ejercicio666 objJuego= new ejercicio666();
                                objJuego.ingresarDatos();
                                break;
                            
                            default:
                                System.out.println("Opción inválida...");
                        }

                        System.out.print("¿Deseas ejecutar otro ejercicio del while? ( SI ): ");
                        repetirWhile = entrada.nextLine();
                    } while (repetirWhile.equalsIgnoreCase("si")); // 🔴 NO SALE DEL BUCLE HASTA QUE INGRESE "no"

                    break;
                case 4:
                     do {
                        System.out.println("Bienvenido a los ejercicios del condicional do-while");
                        System.out.println("Cuento con 6 ejercicios en total");
                        System.out.println("1) simulacion de  un  registro de bibliotecas. ");
                        System.out.println("2) simulacion de un menú de comidas rápidas.  ");
                        System.out.println("3) simulacion de un  sensor de temperatura..");
                        System.out.println("4) simalacion de   un registro de  resultados de exámenes..");
                        System.out.println("5)  simualacion de  gestión de tareas. ");
                        System.out.println("6) simulacion de  registro de ventas. ");
                        System.out.print("Ingrese el número del ejercicio que desea ejecutar: ");

                        opc4 = entrada.nextInt();
                        entrada.nextLine(); // 🔴 LIMPIAR BUFFER DESPUÉS DE nextInt()

                        switch (opc4) {
                            case 1:
                                System.out.println("Bienvenido al Ejercicio 1: simulacion de  un  registro de bibliotecas.");
                                ejercicio1111 objBiblioteca = new ejercicio1111();
                                objBiblioteca.ingresatDatos();
                                break;
                            case 2:
                                System.out.println("Bienvenidos al Ejercicio 2: simulacion de un menú de comidas rápidas. ");
                                ejercicio2222 objMenu= new ejercicio2222();
                                objMenu.ingresarDatos();
                                break;
                            case 3:
                                System.out.println("Bienvenido al Ejercicio 3: simulacion de un  sensor de temperatura.");
                                ejercicio3333 objSensor= new ejercicio3333();
                                objSensor.ingresarDatos();
                                break;
                            case 4:
                                System.out.println("Bienvenido al Ejercicio 4: simalacion de   un registro de  resultados de exámenes..");
                                ejercicio4444 objResultado = new ejercicio4444();
                                objResultado.ingresatDatos();
                                break;
                            case 5:
                                System.out.println("Bienvenido al Ejercicio 5: simualacion de  gestión de tareas. ");
                                ejercicio5555 objGestion= new ejercicio5555();
                                objGestion.ingresatDatos();
                                break;
                            case 6:
                                System.out.println("Bienvenido al Ejercicio 6: simulacion de  registro de ventas. ");
                                ejercicio6666 objVentas= new ejercicio6666();
                                objVentas.ingresatDatos();
                                break;
                            
                            default:
                                System.out.println("Opción inválida...");
                        }

                        System.out.print("¿Deseas ejecutar otro ejercicio del Do while? ( SI ): ");
                        repetirDoWhile = entrada.nextLine();
                    } while (repetirDoWhile.equalsIgnoreCase("si")); // 🔴 NO SALE DEL BUCLE HASTA QUE INGRESE "no"

                    break;
                case 5:
                    do {
                        System.out.println("Bienvenido a los ejercicios del condicional for");
                        System.out.println("Cuento con 5 ejercicios en total");
                        System.out.println("1) simulacion de  un   registro de vehículos en un parqueadero ");
                        System.out.println("2) simulacion de  operaciones de compra en una tienda virtual.  ");
                        System.out.println("3) simulacion de un  agenda de contactos.");
                        System.out.println("4) simalacion de    lista de números. ");
                        System.out.println("5)  simualacion de  proceso de ventas en una tienda. ");
                        System.out.print("Ingrese el número del ejercicio que desea ejecutar: ");

                        opc5= entrada.nextInt();
                        entrada.nextLine(); // 🔴 LIMPIAR BUFFER DESPUÉS DE nextInt()

                        switch (opc5) {
                            case 1:
                                System.out.println("Bienvenido al Ejercicio 1: simulacion de  un   registro de vehículos en un parqueadero");
                                ejercicio11111  objParqueadero = new ejercicio11111();
                                objParqueadero.ingresarDatos();
                                break;
                            case 2:
                                System.out.println("Bienvenidos al Ejercicio 2: simulacion de  operaciones de compra en una tienda virtual.  ");
                                ejercicio22222 objTienda= new ejercicio22222();
                                objTienda.ingresarDatos();
                                break;
                            case 3:
                                System.out.println("Bienvenido al Ejercicio 3: simulacion de agenda de contactos.");
                                ejercicio33333 objAgenda = new ejercicio33333();
                                objAgenda.ingresarDatos();
                                break;
                            case 4:
                                System.out.println("Bienvenido al Ejercicio 4: simalacion de   lista de números. .");
                                ejercicio44444 objListado= new ejercicio44444();
                                objListado.ingresarDatos();
                                break;
                            case 5:
                                System.out.println("Bienvenido al Ejercicio 5: simualacion de  proceso de ventas en una tienda.");
                                ejercicio55555 objProcesoVentas= new ejercicio55555();
                                objProcesoVentas.ingresarDatos();
                                break;                  
                            
                            default:
                                System.out.println("Opción inválida...");
                        }

                        System.out.print("¿Deseas ejecutar otro ejercicio del For? ( SI ): ");
                        repetirFor = entrada.nextLine();
                    } while (repetirFor.equalsIgnoreCase("si")); // 🔴 NO SALE DEL BUCLE HASTA QUE INGRESE "no"

                    break;
                default:
                    System.out.println("Opción inválida BOBO HP..");
            }

            // Preguntar si desea salir del programa al finalizar el menú principal
            System.out.print("¿Desea salir del programa principal  ? ( SI ): ");
            opcionWhile = entrada.nextLine();
        } while (!opcionWhile.equalsIgnoreCase("si")); // 🔴 SOLO SALE CUANDO EL USUARIO INGRESA "si"

        entrada.close(); // Cierra el Scanner
    }
}
