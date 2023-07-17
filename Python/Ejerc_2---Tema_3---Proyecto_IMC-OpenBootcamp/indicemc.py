saludo = "Hola, este es un programa que calcula tu IMC"
print(saludo)

print("Introduce tu peso en KG y presione la tecla Enter")
peso = input()
p = float(peso)

print("Introduce tu estatura en Mts y presione la tecla Enter")
estatura = input()
e = float(estatura)
print("Calculando......")


def masaCorporal(peso, estatura):
    imc = 0
    altura = e * e
    imc = p / altura
    print("Tu indice de masa corporal es : ", round(imc))


miImc = masaCorporal(peso, estatura)
