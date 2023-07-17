"""
En este ejercicio vais a crear la clase Vehículo la cual tendrá los siguientes atributos:

Color

Ruedas

Puertas

Por otro lado crearéis la clase Coche la cual heredará de Vehículo y tendrá los siguientes atributos:

Velocidad

Cilindrada

Por último, tendrás que crear un objeto de la clase Coche y mostrarlo por consola.
"""


# Creando Clases

class Vehiculo:
    color = " "
    ruedas = 0
    puertas = 0


# ------#
class Coche(Vehiculo):
    velocidad = ""
    cilindrada = ""


# -------#
# Creando Objeto
print()
print("El auto es de marca Renault y sus caracteristicas son: ")
# Modificando propiedades
renault = Coche()
renault.color = "Rojo"
renault.ruedas = 4
renault.puertas = 5
renault.velocidad = "150 KM/h"
renault.cilindrada = "16v"
# Mostrando en consola
print("De color ", renault.color)
print("Posee ", renault.ruedas, "ruedas")
print("Tiene ", renault.puertas, " puertas")
print(" Su velocidad maxima es de ", renault.velocidad)
print("Y la cilindrada es de : ", renault.cilindrada)
