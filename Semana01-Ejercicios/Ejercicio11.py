#Pedir el nombre de 5 asignaturas y su notas respectivas, luego mostrar los mensajes: “En la asignatura XXXXXXX sacó XXXXXX, para cada asignatura.

asignaturas = []
notas = []

for i in range(5):
  asignaturas.append(input("Ingrese el nombre de la asignatura {}: " .format(i+1)))
  notas.append(float(input("Ingrese la nota de la asignatura {}: " .format(asignaturas[i]))))

print()
print("Registro de Notas")
for i in range(5):
  print("En la asignatura {} sacó {}" .format(asignaturas[i],notas[i]))