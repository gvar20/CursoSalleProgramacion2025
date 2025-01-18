#Escriba un programa que pida un año y que escriba si es bisiesto o no. Se recuerda que los años bisiestos son múltiplos de 4, pero los múltiplos de 100 no lo son, aunque los múltiplos de 400 sí.

#Estoy teniendo en cuenta:
#Si un año es divisible por 4 y no es divisible por 100, es bisiesto.
#Si un año es divisible por 100, debe ser divisible también por 400 para ser bisiesto.

print("Determinar año biciesto")

anio = int(input("Ingrese el año a comprobar: "))
if (anio % 4 == 0) and ((anio % 100 != 0) or ((anio % 100 == 0) and (anio % 400 == 0))):
    print("{} es un año bisiesto." .format(anio))
else:
  print("{} NO es un año bisiesto." .format(anio))