'''
    Un estacionamiento cobra S/3.00 por la primera hora, luego S/0.50 por cada hora siguiente. El cargo máximo por día es de S/12.00. Programe una función para que al ingresar el número de horas se imprima el cargo.

    Escriba una función que reciba dos números y determine si el primero es múltiplo del segundo.

    El usuario ingresará un número de horas, de minutos y segundos y nos devuelva el equivalente en segundos.
'''

def estacionamiento():
  horas = int(input("Ingrese la cantidad de horas del uso del estacionamiento: "))
  while (horas < 1):
    horas = int(input("La cantidad de horas no puede ser menor a 1. Ingrese la cantidad de horas del uso del estacionamiento: "))

  if (horas==1):
    cargo = 3
  else:
    cargo = 3 + (0.5*(horas-1))
    if(cargo>12):
      cargo = 12

  print("El cargo total por {} horas es de: S/{}" .format(horas, cargo))

def multiplo():
  numero1 = float(input("Ingrese el primer número: "))
  numero2 = float(input("Ingrese el segundo número: "))
  while (numero2==0):
    numero2 = float(input("Ingrese un número distinto de 0 para el segundo número: "))
  if(numero1%numero2==0):
    print("{} es múltiplo de {}." .format(numero1, numero2))
  else:
    print("{} No es múltiplo de {}." .format(numero1, numero2))

def equivalenciaSegundos():
  horas = int(input("Ingrese las horas: "))
  minutos = int(input("Ingrese los minutos: "))
  segundos = int(input("Ingrese los segundos: "))

  horastotal = horas * 60 * 60
  minutostotal = minutos * 60

  equivalencia = horastotal + minutostotal + segundos
  print("{} horas {} minutos y {} segundos equivalen a {} segundos." .format(horas, minutos, segundos, equivalencia))

def menu():
    while True:
        print("\n--- Menú de opciones ---")
        print("1. Calcular cargo de estacionamiento")
        print("2. Verificar si un número es múltiplo de otro")
        print("3. Convertir horas, minutos y segundos a segundos")
        print("4. Salir")

        opcion = input("Seleccione una opción (1-4): ")

        if opcion == "1":
            estacionamiento()
        elif opcion == "2":
            multiplo()
        elif opcion == "3":
            equivalenciaSegundos()
        elif opcion == "4":
            print("Saliendo del programa. ¡Hasta luego!")
            break
        else:
            print("Opción no válida, intente de nuevo.")
menu()