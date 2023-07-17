"""
En este ejercicio, tendréis que crear un archivo py donde creéis un archivo txt,
lo abráis y escribáis dentro del archivo.
Para ello, tendréis que acceder dos veces al archivo creado.
"""
import os
frase= str("Mi primer texto\n")
segundaLinea= str("Soy Leonardo ")
file = open("texto1","w")
file.write(frase)
file.write(segundaLinea)
file.close()


