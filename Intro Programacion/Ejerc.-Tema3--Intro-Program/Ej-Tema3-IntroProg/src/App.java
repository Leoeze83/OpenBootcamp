public class App {
 /// Primera parte del ejercicio--- creacion de funcion suma
 public static int suma(int a, int b, int c) {
  return a + b + c;
 }

 public static void main(String[] args) throws Exception {
  // Invocacion de funcion suma (primera parte)
  int resultado = suma(10, 22, 79);
  System.out.println("El resultado es " + resultado);

  // -------------------------------------------
  // Segunda parte del ejercicio---creacion de clase coche
  class Coche {
   public int puertas;

   public void PonerPuerta() {
    this.puertas++;
   }
  }

  // Creacion de objeto miCoche
  Coche miCoche = new Coche();
  miCoche.PonerPuerta();
  // Muestra numero de puertas
  System.out.println("Cantidad de puertas " + miCoche.puertas);
 }

}
