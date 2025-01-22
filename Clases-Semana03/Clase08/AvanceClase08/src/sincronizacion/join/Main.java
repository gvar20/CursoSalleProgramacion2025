package sincronizacion.join;

public class Main {
	public static void main(String[] args) {
		MiHilo h1 = new MiHilo();
		MiHilo h2 = new MiHilo();
		
		h1.start();
		h2.start();
		
		try {
			h1.join();
			System.out.println("Aqui finaliza el hilo 0");
			h2.join();
			System.out.println("Aqui finaliza el hilo 1");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("El programa ha finalizado");
	}
	
}