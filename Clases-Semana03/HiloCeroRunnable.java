package creacion;

public class HiloCeroRunnable implements Runnable{

	@Override
	public void run() {
		for (int i=0; i<50;i++) {
			System.out.print("0-");
		}
		
	}
}
