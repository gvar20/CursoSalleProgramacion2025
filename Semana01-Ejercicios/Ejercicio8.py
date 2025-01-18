#Escriba un programa que pida dos números enteros. El programa pedirá de nuevo el segundo número mientras no sea mayor que el primero. El programa terminará escribiendo los dos números.

numero1 = int(input("Ingrese el primer número entero: "))
numero2 = int(input("Ingrese el segundo número entero: "))
while(numero1>=numero2):
  print("El número ingresado debe ser mayor que el primer número ingresado")
  numero2 = int(input("Ingrese el segúndo número entero:"))
print("Los números ingresados son {} y {}" .format(numero1, numero2))
