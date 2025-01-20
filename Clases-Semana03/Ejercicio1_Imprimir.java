package creacion;

public class Ejercicio1_Imprimir extends Thread {
	@Override
	public void run() {
		for (int i=0; i<100;i++) {
			System.out.println("Me gusta java");
		}
	}
}
