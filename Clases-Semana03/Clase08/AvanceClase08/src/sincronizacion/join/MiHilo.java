package sincronizacion.join;

public class MiHilo extends Thread{
	@Override
	public void run() {
		System.out.println("Inicio del hilo: " + getName());
		try {
			Thread.sleep(2000);

	// Simula una tarea larga

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fin: " + getName());
	}
}