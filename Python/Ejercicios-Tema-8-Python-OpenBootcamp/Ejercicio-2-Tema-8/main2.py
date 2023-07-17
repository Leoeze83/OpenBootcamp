"""
En este segundo ejercicio, tendréis que crear un archivo py y dentro crearéis una clase Vehículo,
haréis un objeto de ella, lo guardaréis en un archivo y luego lo cargamos.
"""
import pickle

""" Clase : Vehiculo """


class Vehiculo:


    def __init__(self, marca, puertas):
        self.marca = marca
        self.puertas = puertas


    def __repr__(self):
        return f'{ type(self).__name__}(marca: {self.marca},puertas: {self.puertas})'


"""Creacion de funciones para guardar y levantar archivo"""


def save(obj, file):
    file = open(file, 'wb')
    pickle.dump(obj, file)
    file.close()


def load(file):
    file = open(file, 'rb')
    data = pickle.load(file)
    file.close()
    return data


"""Programa """


def main():

    filename = 'vehiculos.bin'
    auto = Vehiculo("Renault", 4)
    save(auto, filename)
    data = load(filename)

    print(type(data))
    print(data)


if __name__ == '__main__':
    main()
