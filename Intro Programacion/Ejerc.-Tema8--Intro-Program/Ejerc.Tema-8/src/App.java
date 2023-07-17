public class App {
 public static void main(String[] args) throws Exception {
  System.out.println("Ejercicio - Tema-8-Intro a Programacion");
  // --- Creacion de Objeto Persona y uso de setters y getters ---

  Persona leonardo = new Persona();

  leonardo.setName("Leonardo");
  leonardo.getName();
  System.out.println(" Su  nombre es " + leonardo.getName());
  leonardo.setEdad(39);
  leonardo.getEdad();
  System.out.println(" Su edad es " + leonardo.getEdad());
  leonardo.setTelefono(1122233445);
  leonardo.getTelefono();
  System.out.println(" Su telefono es " + leonardo.getTelefono());
 }
}

// --- Creacion de Clase Persona ---
class Persona {
 private int edad;
 private String name;
 private int telefono;

 public void setEdad(int edad2) {
  this.edad = edad2;
 }

 public void setName(String name2) {
  this.name = name2;
 }

 public void setTelefono(int telefono2) {
  this.telefono = telefono2;
 }

 public int getEdad() {
  return this.edad;
 }

 public String getName() {
  return this.name;
 }

 public int getTelefono() {
  return this.telefono;
 }
}
