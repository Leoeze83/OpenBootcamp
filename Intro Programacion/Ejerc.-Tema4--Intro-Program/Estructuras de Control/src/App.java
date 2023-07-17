public class App {
 public static void main(String[] args) throws Exception {

  // Ejercicio de IF:
  System.out.println("------Ejercicio de IF------");

  int numeroif = 1;
  if (numeroif < 0) {
   System.out.println(" El numero es Negativo");
  } else if (numeroif == 0) {
   System.out.println(" El numero es un 0");
  } else {
   System.out.println(" El numero es Positivo");
  }

  // Ejercicio de While:
  System.out.println("------Ejercicio de While-------");

  int numeroWhile = -5;
  while (numeroWhile < 3) {
   numeroWhile++;
   System.out.println(" El numero es " + numeroWhile);
  }

  // Ejercicio de DoWhile:
  System.out.println("------Ejercicio de DoWhile-------");
  int numeroDoWhile = 1;
  do {
   numeroDoWhile++;
   System.out.println("El numero DoWhile es " + numeroDoWhile);
  } while (numeroDoWhile > 3);

  // Ejercicio For:
  System.out.println("------Ejercicio For-------");

  int numeroFor = 0;
  for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
   System.out.println(" El numero es " + numeroFor);

  }
  // Ejercicio Switch:
  System.out.println("------Ejercicio Switch-------");

  String estacion = "Leonardo";
  switch (estacion) {
   case " Verano":
    System.out.println("La estacion es " + estacion);
    break;
   case "Primavera":
    System.out.println("La estacion es " + estacion);
    break;
   case "Otoño":
    System.out.println(" La estacion es " + estacion);
    break;
   case "Invierno":
    System.out.println(" La estacion es " + estacion);
    break;
   default:
    System.out.println(estacion + " no es una estacion ");
  }

 }
}
