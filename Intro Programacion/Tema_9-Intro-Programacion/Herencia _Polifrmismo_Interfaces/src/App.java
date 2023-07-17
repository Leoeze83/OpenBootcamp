
public class App {
 public static void main(String[] args) throws Exception {
  // ---------------------------Inicio de codigo para
  // pruebas--------------------------------
  System.out.println("Tema 9 - Intro Programacion");
  System.out.println("Herencia - Ejemplo");
  /* Ejemplo de Herencia */
  System.out.println("Ejemplos de Herencia");
  Coche coche = new Coche();
  coche.velocidadMaxima = 250;
  System.out.println("Velocidad Max + " + coche.velocidadMaxima);
  coche.matricula = "ABC 1234 ES";
  System.out.println("Matricula " + coche.matricula);
  System.out.println(coche.compruebaMatricula("yyy"));
  /*-------------------------------------------------------------------- */
  /* Ejemplo de Abstraccion */
  System.out.println("Ejemplos de Abstraccion");
  Coche2 auto = new Coche2();
  auto.setSonido("BBRRR");
  auto.getSonido();
  System.out.println(auto.getSonido());
  /*-------------------------------------------------------------------- */
  /* Ejemplo de Poliformismo */
  System.out.println("Ejemplos de Poliformismo");
  Motobici motito = new Motobici();
  motito.saludo();
  /*-------------------------------------------------------------------- */
  /* Ejemplo de Interface */
  System.out.println("Ejemplo de Interface");
  Coche3 ferrari = new Coche3();
  ferrari.Acelerar(100);
  ferrari.Frenar(50);
  // ------------------------Fin de codigo para pruebas---------------------------
 }
}
// --------------- Inicio de codigo Apuntes de clase --------------------------
/*
 * La Herencia:
 * consiste en que una clase hereda propiedades y metodos de otra
 * clase, a la clase que hereda la llamamos "Clase Hija" , la clase que lo
 * brinda la llmamamos : "clase Padre"
 */

/* Ejemplo de clase padre */
/*
 * Para definir que una clase no herede a ninguna otra, hay que anteponer :
 * "final" a la palabra class . Ejemplo: final class Coche ....{}
 */
class Vehiculo {
 int velocidadMaxima;
 String matricula;

 public boolean compruebaMatricula(String matricula) {
  if (matricula == "XXX") {
   return true;
  } else {
   return false;
  }
 }
}

/* Ejemplo de clase hija */
class Coche extends Vehiculo {
}

/*------------------------------------------------------------------------------------------------------- */
/*
 * Abstraccion: [son abtractas porqu eno sabremos que van a hacer, pero deben
 * estar los metodos]
 * consiste en establecer en una clase metodos sin cuerpo especifico, logrando
 * exigir obligatoriamente que sus clases hijas deban utilizarlas y completar el
 * cuerpo con la funcionalidad que necesiten. Se establece colocando la palabra:
 * "abstract" delante de la clase padre y sus metodos. Por Ejemplo: un metodo
 * setter :
 * " abstract public String setSonido()" La clase hija estara obligada a
 * incluir el setter y completar el cuerpo con las acciones necesarias
 */
/* Ejemplo de Abstraccion: */
/*
 * Clase padre creada como abstracta... con propiedad comun y metodos abstractos
 */
abstract class Vehiculo2 {
 String sonido;

 abstract public void setSonido(String sonido);

 abstract public String getSonido();

}

/* Clase hija creada para utilizar la abstraccion */
class Coche2 extends Vehiculo2 {
 public void setSonido(String sonido) {
  this.sonido = sonido;
 }

 public String getSonido() {
  return this.sonido;
 }
}

/*-------------------------------------------------------------------- */
/*
 * Herencia multiple:(deprecado, ya que no se sabia que heredaba y de donde
 * /problemas futuros)
 * consiste en que una clase heredapropiedades / metodos de dos clases
 * diferentes. Para que eso suceda, debe separarse con una "," cuando se cita la
 * clase padre... Ejemplo: " class Coche extends Vehiculo,Vehiculo2 {}"
 * Herencia Jerarquica:
 * consiste en un despliegue de clases que reciben herencia de una padre como si
 * fuera un arbol
 * Herencia Hibrida:
 * se da cuando clases hijos tienen como hijo una clase que comparten
 */
/*-------------------------------------------------------------------- */

/* Poliformismo */ // (sobrescritura de metodos)
/*
 * Consiste en que las clases hijas imlementan la mismas funciones pero realizan
 * cosas distintas, o sea puedo sobrescribir el cuerpo del metodo heredado.
 */
/* Ejemplo clase padre */
class Moto {
 public void saludo() {
  System.out.println("Que soy?");
 }
}

/* Ejemplo clase hija que hereda metodo pero modifica impresion en consola */
class Motobici extends Moto {
 // si oculto el metodo debajo que modifico, la impresion en consola dira lo del
 // metodo de la clase padre
 public void saludo() {
  System.out.println(" Soy Motobici");
 }
}

/* Interfaces */
/*
 * es similar a las funciones abstractas... con la diferencia que no implementan
 * ninguna funcion , solo nos indican que debemos implementar .
 * al crear la interface se antepone la palabra "interface" seguido el nombre .
 * Ejemplo:
 */
interface Vehiculo3 {
 void Acelerar(int cuantaVelocidad);

 void Frenar(int cuantaVelocidad);
}

/*
 * para implementar la interface creada en una clase, se agrega la palabra
 * " implements" seguido el nombre de la interface a usar para la creacion de la
 * clase.
 * Ejemplo:
 */
class Coche3 implements Vehiculo3 {
 public void Acelerar(int cuantaVelocidad) {
  System.out.println("Acelero " + cuantaVelocidad);
 }

 public void Frenar(int cuantaVelocidad) {
  System.out.println("Freno " + cuantaVelocidad);
 }
}
