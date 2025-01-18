#José es administrador en una fábrica de chocolates, una de sus tareas es pedir las cajas al proveedor semanalmente, en cada caja entran 12 chocolates. Hacer un programa que le pida al jefe de producción la cantidad de chocolates que se producirán diariamente la próxima semana y resolver ¿qué debe hacer José?

valido=False
while(valido==False):
  print("Jefe de Producción")
  print("¿Cuántos chocolates se produciran diariamente la próxima semana?")
  cantidadChocolates = int(input('Ingrese la cantidad a producir: '))
  if (cantidadChocolates >= 12): #Estoy agregando esta condición para al menos tener diariamente una caja de chocolates producidas.
    valido = True
  else:
    print("La producción de chocolates no puede ser menor de 12")

print("**Solicitar Cajas para la semana**")
cantidadCajasDia = int(cantidadChocolates / 12)
if (cantidadChocolates % 12 != 0):
  cantidadCajasDia = cantidadCajasDia + 1

totalCajas = cantidadCajasDia * 7 #Asumiendo que son los 7 días de la semana
print("Se procederá a solicitar {} cajas al proveedor." .format(totalCajas))