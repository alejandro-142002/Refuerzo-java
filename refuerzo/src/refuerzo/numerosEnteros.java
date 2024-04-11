package refuerzo;

import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);
	        
	        //Solicitar al usuario que ingrese la cantidad de números enteros
	        System.out.println("Ingrese la cantidad de números enteros que desea ingresar:");
	        int cantidadNumeros = scanner.nextInt();
	        
	        // Crear un arreglo para almacenar los números enteros
	        int[] numeros = new int[cantidadNumeros];
	        
	        // Solicitar al usuario que ingrese los números enteros
	        System.out.println("Ingrese los números enteros, uno por uno:");
	        for (int n = 0; n < cantidadNumeros; n++) {
	            numeros[n] = scanner.nextInt();
	        }
	        
	        // Imprimir los números enteros ingresados
	        System.out.println("Los números enteros ingresados son:");
	        for (int n = 0; n < cantidadNumeros; n++) {
	            System.out.println(numeros[n]);
	        }
	        
	        // Cerrar el objeto Scanner
	        scanner.close(); 
	    }
	}

