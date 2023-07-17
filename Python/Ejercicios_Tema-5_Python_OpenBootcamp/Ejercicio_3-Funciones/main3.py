"""Escribe una función que pueda decirte si un año (número entero) es bisiesto o no."""

print()
print('Introduzca un Año para evaluar si es Bisiesto o no')
print()
year = int(input("Año a evaluar es: "))


def añoBisiesto(year):
    y = year
    if y % 4 == 0 or y % 400 == 0:
        print("El Año ", y, " es Bisiesto")
    elif y % 100 == 0:
        print("El Año ", y, " no es Bisiesto")
        return


añoBisiesto(year)
