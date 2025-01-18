#Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius. Recordar que la fórmula para la conversión es: C = (F-32)*5/9

print("Conversor de grados F a grados C")
fahrenheit = float(input('Ingrese los grados celcius a convertir: '))
celcius = (fahrenheit-32)*5/9

print("{}° Fahrenheit equivalen a {}° Celcius." .format(fahrenheit, celcius))