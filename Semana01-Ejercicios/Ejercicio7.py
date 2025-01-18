#Muestra los múltiplos de 3 a partir del 3 hasta el número que el usuario indique.

limite = int(input("Ingrese hasta que número se debe evaluar: "))
while (limite < 3):
  print("El valor no puede ser menor a 3.")
  limite = int(input("Ingrese hasta que número se debe evaluar: "))

for i in range(3, limite+1):
  if(i % 3 == 0):
    print("{} es multiplo de 3" .format(i))