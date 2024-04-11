import java.util.Scanner;

public class main {

	public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese la edad:");
	        int edad = scanner.nextInt();

	        if (edad >= 0 && edad <= 5) {
	            System.out.println("La persona está en el rango de edad de 0 a 5 años, es un bebé.");
	        }  
	            
	       
	         else if (edad >= 6 && edad <= 10) {
	            System.out.println("La persona está en el rango de edad de 6 a 10 años, es un niño.");
	        } 
	        
	        
	         else if (edad >= 11 && edad <= 15) {
	            System.out.println("La persona está en el rango de edad de 11 a 15 años, es un adolescente.");
	        }  
	        
	        
	         else if (edad >= 16 && edad <= 25) {
	            System.out.println("La persona está en el rango de edad de 16 a 25 años, es un joven.");
	        
	        }
	       
	        else if (edad >= 26 && edad <= 80) {
	            System.out.println("La persona está en el rango de edad de 26 a 80 años.");
	        }  
	        else if (edad>80 && edad<=120) {
	        	System.out.println("anciano");
	        	
	        	
	        		
	        	}
	        else  {
	        	System.out.println("fuera de rango"); 
	        }
	}
}
	        	
	        
	        	
	
	
	

	       
	    
	


