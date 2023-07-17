"""
Escribe un programa que sea capaz de mostrar los números del 1 al 100 en orden inverso.

"""
print("Programa que muestra el orden inverso de una lista de numeros del 1 al 100.")
print()
primer = 1
ultimo = 100
listaOrdenada = [primer]

listaInversa = []


def crearLista2(primer, ultimo):
    i = primer
    while i < ultimo:
        i = i + 1
        listaOrdenada.append(i)
    print("Lista Ordenada: ", listaOrdenada)


def listaInvertida(listaOrdenada):
    listaInversa = list(reversed(listaOrdenada))
    print("Lista Invertida: ", listaInversa)


crearLista2(primer, ultimo)
print()
print()
listaInvertida(listaOrdenada)
