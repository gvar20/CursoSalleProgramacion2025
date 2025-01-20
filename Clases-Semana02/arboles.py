class Nodo:
  def __init__(self, dato):
    self.dato = dato
    self.izquierda = None
    self.derecha = None

class BTree:
  def __init__(self):
    self.root = None
#recursión tiene siempre:
#caso base/parada
#y
#llamada a sí mismo
  def insert(self, dato):
    if self.root is None:
      self.root = Nodo(dato)
    else:
      self._insertar_recursivo(self.root, dato)

  def _insertar_recursivo(self, nodo, dato):
    if dato < nodo.dato:
      if nodo.izquierda is None:
        nodo.izquierda = Nodo(dato)
      else:
        self._insertar_recursivo(nodo.izquierda, dato)
    elif dato > nodo.dato:
      if nodo.derecha is None:
        nodo.derecha = Nodo(dato)
      else:
        self._insertar_recursivo(nodo.derecha, dato)
    else:
      print("El valor ya existe en el árbol")

  def inorden(self):
    self._inorden(self.root)

  def _inorden(self, root):
    if root is not None:
      self._inorden(root.izquierda)
      print(root.dato, end = ' ')
      self._inorden(root.derecha)


lista= [32, 45, 2, 6, 3, 864, 23, 24, 12]

arbol = BTree()
for i in lista:
  arbol.insert(i)

arbol.inorden()

