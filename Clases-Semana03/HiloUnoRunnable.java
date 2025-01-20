package creacion;

public class HiloUnoRunnable implements Runnable {

	@Override //Decorador, en interfaces no se usa el decorador
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.print("1-");
		}
	}

}
