
import java.util.Scanner;

	//Clase principal con el método main
	public class Main {
	 public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);

	     // Ingresar datos del estudiante por teclado
	     System.out.println("Ingrese nombre del estudiante: ");
	     String nombreEstudiante = scanner.nextLine();
	     System.out.println("Ingrese dirección del estudiante: ");
	     String direccionEstudiante = scanner.nextLine();
	     System.out.println("Ingrese teléfono del estudiante: ");
	     String telefonoEstudiante = scanner.nextLine();
	     System.out.println("Ingrese email del estudiante: ");
	     String emailEstudiante = scanner.nextLine();
	     System.out.println("Ingrese estado del estudiante (1 - 4):");
	     int estadoEstudiante = scanner.nextInt();
	     scanner.nextLine(); // Consumir la nueva línea pendiente

	     // Crear objeto Estudiante
	     Estudiante estudiante = new Estudiante(nombreEstudiante, direccionEstudiante, telefonoEstudiante, emailEstudiante, estadoEstudiante);

	     // Ingresar datos del empleado por teclado
	     System.out.println("Ingrese nombre del empleado: ");
	     String nombreEmpleado = scanner.nextLine();
	     System.out.println("Ingrese dirección del empleado: ");
	     String direccionEmpleado = scanner.nextLine();
	     System.out.println("Ingrese teléfono del empleado: ");
	     String telefonoEmpleado = scanner.nextLine();
	     System.out.println("Ingrese email del empleado: ");
	     String emailEmpleado = scanner.nextLine();
	     System.out.println("Ingrese departamento del empleado (Contabilidad, Recursos Humanos, Compras): ");
	     String departamentoEmpleado = scanner.nextLine();
	     System.out.println("Ingrese salario del empleado: ");
	     double salarioEmpleado = scanner.nextDouble();
	     scanner.nextLine(); // Consumir la nueva línea pendiente
	     System.out.println("Ingrese fecha de contratación del empleado: ");
	     String fechaContratacionEmpleado = scanner.nextLine();

	     // Crear objeto Empleado
	     Empleado empleado = new Empleado(nombreEmpleado, direccionEmpleado, telefonoEmpleado, emailEmpleado, departamentoEmpleado, salarioEmpleado, fechaContratacionEmpleado);

	     // Imprimir los datos del estudiante y empleado
	     System.out.println("\nDatos del estudiante:");
	     System.out.println(estudiante);
	     System.out.println("\nDatos del empleado:");
	     System.out.println(empleado);

	     scanner.close();
	 }
	}

