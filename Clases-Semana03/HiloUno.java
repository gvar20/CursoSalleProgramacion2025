package creacion;

public class HiloUno extends Thread {
	@Override
	public void run() {
		for (int i = 0; i<100; i++) {
			System.out.print("1-");
		}
	}
}
