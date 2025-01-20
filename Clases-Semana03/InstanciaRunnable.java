package creacion;

public class InstanciaRunnable {
	public static void main(String[] args) {
		HiloUnoRunnable obj1 = new HiloUnoRunnable();
		HiloCeroRunnable obj2 = new HiloCeroRunnable();
		
		Thread h1 = new Thread(obj1);
		Thread h2 = new Thread(obj2);
		
		h1.start();
		h2.start();
	}	
	
}
