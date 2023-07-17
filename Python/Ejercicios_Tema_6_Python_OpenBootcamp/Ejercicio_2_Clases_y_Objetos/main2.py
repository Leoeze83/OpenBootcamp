"""
En este segundo ejercicio, tendréis que crear un programa que tenga una clase llamada Alumno que tenga como atributos
 su nombre y su nota.
Deberéis de definir los métodos para inicializar sus atributos,
 imprimirlos y mostrar un mensaje con el resultado de la nota y si ha aprobado o no.

"""


class Alumno:
    name = input(" Indique el nombre del Alumno : ")
    note = int(input("Su nota es: "))
    def nombAlum(name):
        print(" El alumno es: ", Alumno.name)

    def notaAlum(note):
        print(" Su nota es: ", Alumno.note)
        if Alumno.note >= 7:
            print("El Alumno ", Alumno.name, " aprobo !")
        else:
            print("El Alumno ", Alumno.note, " desaprobo")


Alumnos = Alumno()
print(Alumnos.nombAlum())
print(Alumnos.notaAlum())
