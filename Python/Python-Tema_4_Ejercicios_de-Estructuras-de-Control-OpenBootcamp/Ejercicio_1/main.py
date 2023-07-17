"""
Consigna:
 Escribe un programa que pregunte al usuario su edad y muestre por pantalla si es mayor de edad o no.
"""


# Resolucion:
# Creo una funcion para obtener la info del usuario y analizar si es el tipo de dato correcto y
# analizar si es mayor o menor de edad.

def miEdad():
    print("Ingrese su edad y presione la tecla Enter")
    edad = input(" Su edad es :  ")  # solicito ingresar los datos
    if edad.isalpha():  # valido si ingreso letras en vez de numeros el usuario
        print("La edad debe ser ingresada en números , por favor vuelva a introducirlo ")
        return miEdad()  # utilizo recursividad para solicitar el dato correcto
    else:
        edad = int(edad)  # convierto los datos obtenidos de type str a type int
        if edad >= 21:  # condicion de evaluacion para mayoria de edad
            print("Usted tiene ", edad, " años. Es mayor de edad")
        else:
            print("Su edad es: ", edad, " años, usted no es mayor de edad")


# Llamo a la funcion para ejecutar el programa
miEdad()
