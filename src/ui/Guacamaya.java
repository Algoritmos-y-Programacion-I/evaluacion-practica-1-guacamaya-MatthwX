package ui;

import java.util.Scanner;

public class Guacamaya {

    // Scanner global para todo el programa
    public static Scanner reader;
    // Arreglos de precios y unidades para todo el programa
    public static double[] precios;
    public static int[] unidades;
    int referencias;
    int cantVendida;

    public static void main(String[] args) {

        inicializarGlobales();
        menu();
    }

    /**
     * Descripcion: Este metodo se encarga de iniciar las variables globales
     * pre: El Scanner reader debe estar declarado
     * pos: l Scanner reader queda inicializado
    */
    public static void inicializarGlobales() {

        reader = new Scanner(System.in);

    }

    /**
     * Descripcion: Este metodo se encarga de desplegar el menu al usuario y mostrar los mensajes de resultado para cada funcionalidad
     * pre: El Scanner reader debe estar inicializado
     * pre: El arreglo precios debe estar inicializado
    */
    public static void menu() {

        System.out.println("Bienvenido a Guacamaya!");

        establecerCantidadVendida();

        boolean salir = false;

        do {

            System.out.println("\nMenu Principal:");
            System.out.println("1. Solicitar precios ($) y cantidades de cada referencia de producto vendida en el dia");
            System.out.println("2. Calcular la cantidad total de unidades vendidas en el dia");
            System.out.println("3. Calcular el precio promedio de las referencias de producto vendidas en el dia");
            System.out.println("4. Calcular las ventas totales (dinero recaudado) durante el dia");
            System.out.println("5. Consultar el numero de referencias de productos que en el dia han superado un limite minimo de ventas");
            System.out.println("6. Salir");
            System.out.println("\nDigite la opcion a ejecutar");
            int opcion = reader.nextInt();

            switch (opcion) {
                case 1:
                    solicitarDatos();
                    break;
                case 2:
                    System.out.println("\nLa cantidad total de unidades vendidas en el dia fue de: "+ calcularTotalUnidadesVendidas());
                    break;
                case 3:
                    System.out.println("\nEl precio promedio de las referencias de producto vendidas en el dia fue de: "+calcularPrecioPromedio());
                    break;
                case 4:
                    System.out.println("\nLas ventas totales (dinero recaudado) durante el dia fueron: "+calcularVentasTotales());
                    break;
                case 5:
                    System.out.println("\nDigite el limite minimo de ventas a analizar");
                    double limite = reader.nextDouble();
                    System.out.println("\nDe las "+precios.length+" referencias vendidas en el dia, "+consultarReferenciasSobreLimite(limite)+" superaron el limite minimo de ventas de "+limite);
                    break;
                case 6:
                    System.out.println("\nGracias por usar nuestros servicios!");
                    salir = true;
                    reader.close();
                    break;

                default:
                    System.out.println("\nOpcion invalida, intenta nuevamente.");
                    break;
            }

        } while (!salir);

    }

    /**
     * Descripcion: Este metodo se encarga de preguntar al usuario el numero de referencias de producto diferentes 
     * vendidas en el dia e inicializa con ese valor los arreglos encargados de almacenar precios y cantidades
     * pre: El Scanner reader debe estar inicializado
     * pre: Los arreglos precios y unidades deben estar declarados
     * pos: Los arreglos precios y unidades quedan inicializados
     */

   
    
    public static void establecerCantidadVendida() {
        inicializarGlobales();

        System.out.println("\nDigite el numero de referencias de producto diferentes vendidas en el dia: ");
        int referencias = reader.nextInt();

        precios = new double[referencias];
        unidades = new int[referencias];
    
    }
    /* 
    * Descripcion: Este metodo se encarga de solicitar los datos al usuario acerca de la cantidad
    de referencias.
    * pre: Los arreglos precios y unidades deben declararse
    * pos: Los arreglos precios y unidades quedan configurados
    */
    public static void solicitarDatos() {
        inicializarGlobales(); 
        
	 	for (int i = 0; i < precios.length; i++) {
            System.out.println("\n Ingrese el precio del producto " + (i + 1) + ":");
            double precio = reader.nextDouble();

            // Solicita por el scanner un double que se llame precio

            precios[i] = precio;

		    

        }  

        for (int i = 0; i < unidades.length; i++) {
                


                // Haces lo mismo pero con int unidad
                int unidad = reader.nextInt();
                unidades[i] = unidad;
		}

        
    }

    /* 
    * Descripcion: Este metodo se encarga de calcular el total de unidades
    que se vendieron
    * pre: Los arreglos precios y unidades ya deben estar declarados
    * pos: Se muestra el valor total de las unidades vendidas
    */
    public static int calcularTotalUnidadesVendidas() {
        /*
        int suma = 0;
		for (int numero : numeros) {
		    suma += numero;
		}
        */
		// return suma;
        return 0;
    }

    /* 
    * Descripcion: Este metodo se encarga de calcular el promedio del producto
    * pre: El arreglo de producto debe estar declarado
    * pos: Se muestra el promedio de ventas del producto
    */

    public static double calcularPrecioPromedio(){

        return 0;


    }

    public static double calcularVentasTotales(){

        return 0;


    }

    public static int consultarReferenciasSobreLimite(double limite){

        return 0;

    }

}
