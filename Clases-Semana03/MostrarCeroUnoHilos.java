package creacion;

public class MostrarCeroUnoHilos {
	/*Existirian en este momento 3 hilos el h1, h2 y el main (este también es otro hilo)*/
	public static void main(String[] args) {
		HiloCero h1 = new HiloCero();
		HiloUno h2 = new HiloUno();
		h1.start();
		h2.start();
	}
}
