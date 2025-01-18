#Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.

print("Calcular Hipotenusa")
ladoa = float(input('Ingrese el cateto A: '))
ladob = float(input('Ingrese el cateto B: '))

hipotenusa = ((ladoa**2) + (ladob**2))**0.5

print("La hipotenusa del triangulo con los catetos {} y {} es: {}." .format(ladoa, ladob, hipotenusa))