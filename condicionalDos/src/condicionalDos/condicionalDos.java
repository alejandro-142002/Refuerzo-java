package condicionalDos;

import java.util.Scanner;

public class condicionalDos {
	 // realice un algoritmo que lea dos numeros y luego determine cual es el menor y lo imprima
	 
		public static void main(String[] args) { 
			Scanner scanner = new Scanner(System.in);
			 // Leer el primer número
	        System.out.println("Ingrese el primer número: ");
	        double numero1 = scanner.nextDouble();
	        System.out.print("Ingrese el segundo número: ");
	        double numero2 = scanner.nextDouble();
			  
	        //comparar los numeros y determinar el menor
	        if (numero1 < numero2) {
	            //String numero1;
				System.out.println("El menor número es: " + numero1);
	        } 
	        else if (numero2 < numero1) {
	            //String numero2;
				System.out.println("El menor número es: " + numero2);
	        } else {
	            System.out.println("Ambos números son iguales.");

	        }
	}
}
