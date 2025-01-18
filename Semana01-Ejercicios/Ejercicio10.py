#Escriba un programa que pida las notas de un grupo, se le preguntará al usuario si quiere seguir ingresando notas, y mientras la respuesta sea Sí/SÍ/sí, se debe seguir ingresando. Al finalizar el ingreso de notas, se debe mostrar una lista de las notas aprobadas y otra de las desaprobadas.

print("Ingresar Notas")
notas = []
notas.append(float(input("Ingrese la nota: ")))
respuesta = input("¿Desea seguir ingresando notas?")
while(respuesta == "Sí" or respuesta == "SÍ" or respuesta == "sí"):
  notas.append(float(input("Ingrese la nota: ")))
  respuesta = input("¿Desea seguir ingresando notas?")

notasAprobadas = []
notasDesaprobadas = []
for i in notas:
  if (i >= 12.5):
    notasAprobadas.append(i)
  else:
    notasDesaprobadas.append(i)

if (len(notasAprobadas) == 0):
  print("No hay notas Aprobadas")
else:
  print("Notas Aprobadas")
  for i in notasAprobadas:
    print(i)

if (len(notasDesaprobadas) == 0):
  print("No hay notas Desaprobadas")
else:
  print("Notas Desaprobadas")
  for i in notasDesaprobadas:
    print(i)