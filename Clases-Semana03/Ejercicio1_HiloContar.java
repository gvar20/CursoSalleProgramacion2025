package creacion;

public class Ejercicio1_HiloContar extends Thread{
	@Override
	public void run() {
		for (int i=1; i<=200;i++) {
			System.out.println("Conteo está en : " + i);
		}
	}
}
