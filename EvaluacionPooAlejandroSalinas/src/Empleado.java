
public class Empleado extends Persona {
	 private String departamento;
	 private double salario;
	 private String fechaContratacion;

	 // Constructor
	 public Empleado(String nombre, String direccion, String telefono, String email, String departamento, double salario, String fechaContratacion) {
	     super(nombre, direccion, telefono, email);
	     // Validación del departamento
	     if (departamento.equals("Contabilidad") || departamento.equals("Recursos Humanos") || departamento.equals("Compras")) {
	         this.departamento = departamento;
	     } else {
	         this.departamento = "Recursos Humanos"; // Por defecto se asigna Recursos Humanos
	     }
	     this.salario = salario;
	     this.fechaContratacion = fechaContratacion;
	 }

	 // Método toString
	 @Override
	 public String toString() {
	     return super.toString() + "\nDepartamento: " + departamento + "\nSalario: " + salario + "\nFecha de contratación: " + fechaContratacion;
	 }
	}

	


