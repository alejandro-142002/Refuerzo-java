package refuerzo;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	 // Crear un objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);
    
    // Solicitar al usuario que ingrese su edad
    System.out.println("Ingrese su edad:");
    
    // Leer la edad ingresada por el usuario
    int edad = scanner.nextInt();
    
    // Determinar si la edad es mayor o menor de edad
    if (edad >= 18) {
        System.out.println("Eres mayor de edad.");
    } else {
        System.out.println("Eres menor de edad.");
    }
    
    // Cerrar el objeto Scanner
    scanner.close(); 
	}
}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("alejandro");
		int edad = 21;
		System.out.println("mi edad es"+ edad); 
		System.out.println("celular");
		int celular = 985;
		System.out.println("el precio del celular es+");
		System.out.println(celular);
		 
		//crear un ciclo para crear los numeros del 1 al 10
		for(int i =5; i<= 10; i++) {
			System.out.println(i);
			
		}
		// imprimir 10 veces mi nombre
		for(int a =1; a<=5; a++) {
			System.out.println("alejandro");
		}
	}*/
	// realice un algoritmo en llava que lea una edad y etermine si es mayor o menor de edad
/*

 */

	
	
	
