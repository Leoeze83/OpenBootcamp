public class App {
 public static void main(String[] args) throws Exception {
  System.out.println("Ejerc. Tema 9 - Intro a la Programacion");
  System.out.println("****************************************************");
  // Creando un objeto de la clase Cliente
  Cliente cliente1 = new Cliente() {
  };
  cliente1.nombre = "LEONARDO";
  System.out.println("Nombre del cliente : " + cliente1.nombre);
  cliente1.edad = 32;
  System.out.println("Edad del cliente : " + cliente1.edad + " años");
  cliente1.telefono = 123456789;
  System.out.println("Telefono del cliente : " + cliente1.telefono);
  cliente1.credito = 3500;
  System.out.println("Credito del cliente : $ " + cliente1.credito);
  System.out.println("****************************************************");
  // Creando un objeto de la clase Trabajador
  Trabajador trabajadorA = new Trabajador() {
  };
  trabajadorA.nombre = "IRONMAN";
  System.out.println("Nombre del trabajador : " + trabajadorA.nombre);
  trabajadorA.edad = 25;
  System.out.println("Edad del trabajador : " + trabajadorA.edad + " años");
  trabajadorA.telefono = 325698745;
  System.out.println("Telefono del trabajador : " + trabajadorA.telefono);
  trabajadorA.salario = 1500;
  System.out.println("Salario del trabajador : $ " + trabajadorA.salario);
 }
}

// Creando la Clase Persona.
class Persona {
 int edad;
 String nombre;
 int telefono;
}

// Creando la Clase Cleinte heredando propiedades de Persona y teniendo una
// propiedad exclusiva.
class Cliente extends Persona {
 int credito;
}

// Creando a Clase Trabajador heredando prop de de Persona y teniendo una
// propiedad exclusiva
class Trabajador extends Persona {
 int salario;
}