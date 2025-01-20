## HACER EL BORRADO DEL ARBOL BINARIO Y LA BUSQUEDA DEL ARBOL BINARIO

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

  def buscar(self, dato):
    resultado = self._buscar_recursivo(self.root, dato)
    if resultado:
        print(f"El elemento {dato} se encuentra en el árbol")
    else:
        print(f"El elemento {dato} no se encuentra en el árbol")

  def _buscar_recursivo(self, nodo, dato):
    if nodo is None:
        return False
    if nodo.dato == dato:
        return True
    if dato < nodo.dato:
        return self._buscar_recursivo(nodo.izquierda, dato)
    return self._buscar_recursivo(nodo.derecha, dato)

  def borrar(self, dato):
    self.root = self._borrar_recursivo(self.root, dato)

  def _borrar_recursivo(self, nodo, dato):
    # Caso base
    if nodo is None:
        return nodo

    # Llamadas recursivas
    if dato < nodo.dato:
        nodo.izquierda = self._borrar_recursivo(nodo.izquierda, dato)
    elif dato > nodo.dato:
        nodo.derecha = self._borrar_recursivo(nodo.derecha, dato)
    else:
        # Caso 1: Nodo es una hoja
        if nodo.izquierda is None and nodo.derecha is None:
            return None
            
        # Caso 2: Nodo tiene un solo hijo
        if nodo.izquierda is None:
            return nodo.derecha
        if nodo.derecha is None:
            return nodo.izquierda
            
        # Caso 3: Nodo tiene dos hijos
        sucesor = self._encontrar_minimo(nodo.derecha)
        nodo.dato = sucesor.dato
        nodo.derecha = self._borrar_recursivo(nodo.derecha, sucesor.dato)
    
    return nodo

  def _encontrar_minimo(self, nodo):
    actual = nodo
    while actual.izquierda is not None:
      actual = actual.izquierda
    return actual

  def inorden(self):
   self._inorden(self.root)

  def _inorden(self, root):
   if root is not None:
     self._inorden(root.izquierda)
     print(root.dato, end = ' ')
     self._inorden(root.derecha)


arbol = BTree()
arbol.insert(5)
arbol.insert(3)
arbol.insert(7)

arbol.inorden()

arbol.buscar(3)
arbol.buscar(4) 

arbol.borrar(3)
arbol.inorden()