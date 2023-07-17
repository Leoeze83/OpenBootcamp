""" Escribe una función que pueda decirte si un número (número entero) es primo o no.
Nota:  En matemáticas, un número primo es un número natural mayor que 1
que tiene únicamente dos divisores positivos distintos: él mismo y el 1.

"""
print()
print('Introduzca un numero para evaluar si es Primo o no')
numero = int(input("Numero a evaluar es: "))


def numPrimo(numero):
    n = numero
    if n <= 1:
        print("El numero: ", n, " no es Primo")
        return
    if n % 1 == 0 and n % n == 0:
        print("El numero  ", n, " es Primo")
    else:
        print("El numero: ", n, " no es Primo")
    return


numPrimo(numero)
