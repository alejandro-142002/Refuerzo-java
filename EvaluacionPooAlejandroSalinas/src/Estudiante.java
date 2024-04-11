//Clase Estudiante
public class Estudiante extends Persona {
 private int estado;

 // Constructor
 public Estudiante(String nombre, String direccion, String telefono, String email, int estado) {
     super(nombre, direccion, telefono, email);
     // Validación del estado
     if (estado >= 1 && estado <= 4) {
         this.estado = estado;
     } else {
         this.estado = 1; // Por defecto se asigna el estado 1
     }
 }

 // Método toString
 @Override
 public String toString() {
     return super.toString() + "\nEstado: " + estado;
 }
}
