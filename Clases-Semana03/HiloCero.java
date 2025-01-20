package creacion;

public class HiloCero extends Thread {
	@Override
	public void run() {
		for (int i = 0; i<100; i++) {
			System.out.print("0-");
		}
	}
}
