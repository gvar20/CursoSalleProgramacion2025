#Mejore el programa anterior haciendo que no se acepten números negativos ni cero.

validar = False
print("¿Es multiplo del menor?")
numero1 = int(input("Ingrese el primer número entero MAYOR a 0: "))
while (numero1 < 1):
  numero1 = int(input("El valor ingresado es inncorrecto. Ingrese un número entero MAYOR a 0: "))
numero2 = int(input("Ingrese el segundo número entero MAYOR a 0: "))
while (numero2 < 1):
  numero2 = int(input("El valor ingresado es inncorrecto. Ingrese un número entero MAYOR a 0: "))

if (numero1>numero2):
  mayor = numero1
  menor = numero2
  validar = True
elif (numero1<numero2):
  mayor = numero2
  menor = numero1
  validar = True

if (validar == True):
  if(mayor%menor == 0):
    print("El número {} es múltiplo de {}." .format(mayor, menor))
  else:
    print("El número {} NO es múltiplo de {}." .format(mayor, menor))
else:
  print("No hay un número mayor, los números ingresados son iguales.")