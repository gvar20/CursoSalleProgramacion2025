#Escriba un programa que pida dos números enteros y que escriba si el mayor es múltiplo del menor.

validar = False
print("¿Es multiplo del menor?")
numero1 = int(input("Ingrese el primer número entero: "))
numero2 = int(input("Ingrese el segundo número entero: "))

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