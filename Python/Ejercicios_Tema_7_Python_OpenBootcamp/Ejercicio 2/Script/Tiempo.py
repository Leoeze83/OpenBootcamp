import time
"""
En este segundo ejercicios tendréis que crear un script que nos diga si es la hora de ir a casa. 
Tendréis que hacer uso del modulo time. 
Necesitaréis la fecha del sistema y poder comprobar la hora.

En el caso de que sean más de las 7, se mostrará un mensaje y en caso contrario, 
haréis una operación para calcular el tiempo que queda de trabajo.

"""

def tiempo(a, b):
    if a <= 19:
        hs = int(19 - a)
        min = int(60 - b)
        print("Aun restan ", hs, ":", min, " Hs.de trabajo"),
    else:
        print("Es hora de regresar a casa")


def main():
    reloj = time.localtime()
    hora = int(reloj[3])
    minutos = int(reloj[4])
    print("la hora es: ", reloj[3], ":", reloj[4], " Hs.")
    tiempo(hora, minutos)


if __name__ == "__main__":
    main()
