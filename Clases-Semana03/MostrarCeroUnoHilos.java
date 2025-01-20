package creacion;

public class MostrarCeroUnoHilos {
	public static void main(String[] args) {
		HiloCero h1 = new HiloCero();
		HiloUno h2 = new HiloUno();
		h1.start();
		h2.start();
	}
}
