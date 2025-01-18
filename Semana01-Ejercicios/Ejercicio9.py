#Escriba un programa que pida números enteros mientras sean cada vez más grandes.

numeroInicial = int(input("Ingrese un número entero: "))
numeroSiguiente = int(input("Ingrese un nuevo número entero: "))
numeros = [numeroInicial, numeroSiguiente]
while(numeroInicial<numeroSiguiente):
  numeroInicial = numeroSiguiente
  print(numeroInicial)
  numeroSiguiente = int(input("Ingrese un nuevo número entero: "))
  numeros.append(numeroSiguiente)

print("Los números ingresados son: {}"  .format(numeros))