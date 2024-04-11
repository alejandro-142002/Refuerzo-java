
//Clase Persona
public class Persona {
 protected String nombre;
 protected String direccion;
 protected String telefono;
 protected String email;

 // Constructor
 public Persona(String nombre, String direccion, String telefono, String email) {
     this.nombre = nombre;
     this.direccion = direccion;
     this.telefono = telefono;
     this.email = email;
 }

 // Método toString
 @Override
 public String toString() {
     return "Nombre: " + nombre + "\nDirección: " + direccion + "\nTeléfono: " + telefono + "\nEmail: " + email;
 }
}
