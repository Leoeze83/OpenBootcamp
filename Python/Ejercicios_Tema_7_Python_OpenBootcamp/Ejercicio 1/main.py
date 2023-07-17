"""
En este ejercicio tendréis que crear un módulo que contenga las operaciones básicas de una calculadora:
sumar, restar, multiplicar y dividir.

Este módulo lo importaréis a un archivo python y llamaréis a las funciones creadas.
Los resultados tenéis que mostrarlos por consola.

"""
import operaciones

print("Realizaremos operaciones matematicas basicas con dos numeros ")
print()

num1 = int(input("Inserte el Primer Numero: "))
num2 = int(input("Inserte el Segundo Numero: "))
print()
print("EL resultado de la suma es : ", operaciones.sumar(num1, num2))
print("EL resultado de la resta  es : ", operaciones.restar(num1, num2))
print("EL resultado de la multiplicacion es : ", operaciones.multip(num1, num2))
print("EL resultado de la division es : ", operaciones.divide(num1, num2))
