"""
Escribe una función que calcule el área de un triángulo, recibiendo la altura y la base como parámetros
y
otra función que calcule el área de un círculo recibiendo el radio del mismo.
"""
print()
print("El area de un triangulo equivale a : base x altura / 2. Ingrese los valores y presione la tecla Enter")
print()
base = float(input("La base es de : "))
altura = float(input("La altura es de : "))
# Funcion del area de un triangulo
areaTriang = lambda b, a: print("El area del Triangulo es: ", (b * a) / 2)
# Invocacion de funcion

areaTriang(base, altura)
# ---------------#
print()
print("El area de un circulo equivale a :  π x r² . Ingrese el valor del radio del circulo  y presione la tecla Enter")
print()
radio = float(input("El radio  es de : "))
# Funcion del area de un circulo
areaCirc = lambda r: print("El area del Circulo es: ", 3.14 * (r * r))
# Invocacion de funcion

areaCirc(radio)
