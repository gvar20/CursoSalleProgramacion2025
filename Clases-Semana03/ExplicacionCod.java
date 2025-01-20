package creacion;

public class ExplicacionCod extends Thread{
	public ExplicacionCod(String str) {
		super(str);
		}
		public void run() {
		for (int i = 0; i < 10 ; i++)
		System.out.println(i + " " + getName());
		System.out.println("Termina thread " + getName());
		}
		public static void main (String [] args) {
		new ExplicacionCod("Pepe").start();
		new ExplicacionCod("Juan").start();
		System.out.println("Termina thread main");
		}
}
