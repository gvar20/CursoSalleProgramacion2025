package creacion;

public class Ejercicio1_ClaseUso {
	public static void main(String[] args) {
		Ejercicio1_HiloContar h1 = new Ejercicio1_HiloContar();
		Ejercicio1_Imprimir h2 = new Ejercicio1_Imprimir();
		
		h1.start();
		h2.start();		
	}
}
