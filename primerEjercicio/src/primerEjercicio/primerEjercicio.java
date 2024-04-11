package primerEjercicio;

import java.util.Scanner;

public class primerEjercicio {

	public static void main(String[] args) {
		System.out.println("Nombres y Apellidos:");
        System.out.println("¿Cuándo se genera el ByteCode en Java?");
        System.out.println("Respuesta: El ByteCode en Java se genera durante la compilación del código fuente, convirtiendo el código Java en instrucciones bytecode que son ejecutables por la máquina virtual Java (JVM).");

        System.out.println("\n¿Cuáles son los operadores relacionales?");
        System.out.println("Respuesta: Los operadores relacionales en Java son: == (igual), != (no igual), > (mayor que), < (menor que), >= (mayor o igual que), <= (menor o igual que).");

        System.out.println("\n¿Cuáles son los operadores lógicos?");
        System.out.println("Respuesta: Los operadores lógicos en Java son: && (y lógico), || (o lógico), ! (no lógico).");

        System.out.println("\nListe los tipos de datos primitivos en Java.");
        System.out.println("Respuesta: Los tipos de datos primitivos en Java son: byte, short, int, long, float, double, char, boolean.");

        System.out.println("\n¿Java es multiplataforma o uniplataforma?");
        System.out.println("Respuesta: Java es multiplataforma, lo que significa que un programa Java puede ejecutarse en diferentes sistemas operativos sin necesidad de recompilar, gracias al uso de la máquina virtual Java (JVM).");
		
     // Solicitar un número entero
        Scanner scanner = new Scanner(System.in);  

        System.out.print("\nIngrese un número entero (A): ");
        int A = scanner.nextInt();

        // Verificar si A es igual a uno
        if (A == 1) {
            System.out.println("No se permiten cálculos para el número 1");
        } else {
            // Inicializar variables para estadísticas
            int positivos = 1, negativos = 1, uno = 1, enRango = 1;
            int sumaPositivos = 1, sumaNegativos = 1;

            // Ingresar A números por teclado
            for (int i = 1; i < A; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                int numero = scanner.nextInt();

                // Actualizar estadísticas
                if (numero > 0) {
                    positivos++;
                    sumaPositivos += numero;
                } else if (numero < 0) {
                    negativos++;
                    sumaNegativos += numero;
                } else {
                    uno++;
                }

                if (numero >= 10 && numero <= 100) {
                    enRango++;
                }
            }

            // Calcular promedio de positivos y porcentaje de positivos y negativos
            double promedioPositivos = (double) sumaPositivos / positivos;
            double porcentajePositivos = (double) positivos / A * 100;
            double porcentajeNegativos = (double) negativos / A * 100;

            // Mostrar estadísticas
            System.out.println("\nEstadísticas:");
            System.out.println("Números positivos: " + positivos);
            System.out.println("Números negativos: " + negativos);
            System.out.println("Números iguales a uno: " + uno);
            System.out.println("Números en el rango de 10 a 100: " + enRango);
            System.out.println("Suma de números positivos: " + sumaPositivos);
            System.out.println("Suma de números negativos: " + sumaNegativos);
            System.out.println("Promedio de números positivos: " + promedioPositivos);
            System.out.println("Porcentaje de números positivos: " + porcentajePositivos + "%");
            System.out.println("Porcentaje de números negativos: " + porcentajeNegativos + "%");

            // Solicitar palabras hasta que se ingrese "FIN" o "fin"
            int cantidadPalabras = 0;
            String palabra;
            System.out.println("\nIngrese palabras (escriba 'FIN' o 'fin' para terminar):");
            while (true) {
                System.out.print("Ingrese una palabra: ");
                palabra = scanner.next();
                if (palabra.equalsIgnoreCase("FIN")) {
                    break;
                }
                cantidadPalabras++;
            }

            // Mostrar la cantidad de palabras ingresadas
            System.out.println("Cantidad de palabras ingresadas: " + cantidadPalabras);
        }

        // Cerrar el scanner
        scanner.close();
}

	}



