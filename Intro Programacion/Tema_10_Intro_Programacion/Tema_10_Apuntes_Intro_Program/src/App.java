public class App {
 public static void main(String[] args) throws Exception {
  System.out.println(" Apuntes Tema 10 - Intro a la Programacion de OpenBootcamp");

 }
}

/*
 * Metodos de una Clase :
 * son las funciones que pertenecen a una clase, pueden
 * ser publicas o privadas y pueden o no llevar parametros.
 * Su prototipo puede ser por ejemplo:
 * public leerLibros(String libro){ return conteido}
 * Seudo codigo:
 * [Visibibilidad] [Nombre_Metodo] (Parametros)[Valor]
 */
/*
 * Las Interfaces:
 * son propiedades y metodos que se prestablecen en una clase y que el
 * programador debe implementar en los objetos que crea en base a la ainterfaz,
 * la ventaja es que puede cambiarse el conteido de las funciones (lo que hace
 * la funcion) y asi se evita la repeticion innecesaria de codigo.
 */
/*
 * Paso de parametros en los metodos:
 * Por Valor: cuando se duplican los valores en memoria para utilizar los
 * parametros en la funcion (no se modifican los valores originales de las
 * variables) DUPLICA EL ESPACIO DE MEMORIA RAM
 * Por Referencia: cuando los parametros hacen referencia a alguna variable que
 * ya esta utilizando espacio en memoria (aqui si se modifican los valores
 * originales de las variables) NO DUPLICA EL ESPACIO EN RAM
 */

/*
 * Recursividad:
 * un metodo se llama asi mismo dentro de su cuerpo una y otra vez...
 * utilizandola como parametro. Ejemplo:
 * public void suma (int A, int B){
 * var Temp = A +B;
 * suma (A, Temp); (aqui se ve la recursividad.. se vuelve a usar dentro de la
 * misma funcion)
 * }
 */
