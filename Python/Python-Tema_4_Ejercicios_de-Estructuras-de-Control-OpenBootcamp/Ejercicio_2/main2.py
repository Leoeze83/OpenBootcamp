"""
Escribe un programa capaz de mostrar todos los números impares desde un número de inicio y otro final.

Por ejemplo: teniendo numero_inicial = 2 y numero_final = 8, el programa debe imprimir por consola: [3, 5, 7]

"""
print("Programa que extrae numero impares de una lista numerica. Luego de introducir el dato solicitado, presione Enter ")
print()
numInic = int(input("Numero Inicial : "))
numFin = int(input("Numero Final : "))
listaNumeros = [numInic]
listaImpar = []


def crearLista(numInic, numFin):
    i = numInic
    while i < numFin:
        i = i + 1
        listaNumeros.append(i)
    print("Su lista de numeros es: ", listaNumeros)


def numImpar(listaNumeros):
    listaImpar = [x for x in listaNumeros if x % 2 != 0]

    print("Los numeros impares de su lista son: ", listaImpar)


crearLista(numInic, numFin)
print()
numImpar(listaNumeros)
