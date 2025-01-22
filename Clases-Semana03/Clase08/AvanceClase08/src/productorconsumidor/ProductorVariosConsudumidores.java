package productorconsumidor;

public class ProductorVariosConsudumidores{
public static void main(String[] args) {
RecursoCompartido recurso = new RecursoCompartido();
// Crear e iniciar los hilos
Thread productor = new Thread(new Productor(recurso));
Thread consumidor1 = new Thread(new Consumidor(recurso, "Consumidor 1"));
Thread consumidor2 = new Thread(new Consumidor(recurso, "Consumidor 2"));
productor.start();
consumidor1.start();
consumidor2.start();
}
}